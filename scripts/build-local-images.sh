#!/usr/bin/env bash
set -Eeuo pipefail

ROOT_DIR="$(CDPATH= cd -- "$(dirname -- "${BASH_SOURCE[0]}")/.." && pwd)"
BUILD_ROOT="${ROOT_DIR}"
BUILD_TMP_DIR=""
SOURCE_SHA256=""
RUNTIME_MODULE="ibiz-ebsx-runtime"
GATEWAY_MODULE="ibiz-ebsx-gateway"
MAVEN_IMAGE="${IBIZ_MAVEN_IMAGE:-maven:3.9-eclipse-temurin-17}"
JAVA_IMAGE="${IBIZ_JAVA_IMAGE:-eclipse-temurin:17-jdk}"
MAVEN_IMAGE_RESOLVED=""
JAVA_IMAGE_RESOLVED=""
IMAGE_PREFIX="${IBIZ_LOCAL_IMAGE_PREFIX:-aibiz}"
LOCAL_TAG="${IBIZ_LOCAL_TAG:-}"
BUILD_PLATFORM="${IBIZ_BUILD_PLATFORM:-}"
MAVEN_CACHE_DIR="${IBIZ_MAVEN_CACHE_DIR:-${HOME}/.m2}"
ALLOW_BASE_PULL="${IBIZ_ALLOW_BASE_PULL:-1}"
ALLOW_MUTABLE_BASE_TAG="${IBIZ_ALLOW_MUTABLE_BASE_TAG:-0}"
RECORD_FILE="${IBIZ_BUILD_RECORD:-${ROOT_DIR}/scripts/records/backend-local-build.json}"
SKIP_MAVEN=0
SKIP_DOCKER=0

usage() {
    cat <<'EOF'
Usage:
  scripts/build-local-images.sh [options]

Builds the iBiz allinone and gateway modules from the local Maven reactor
inside a JDK 17 Maven container, then builds local Docker images.

Options:
  --skip-maven     Reuse the two expected local jar artifacts.
  --skip-docker    Run the source reactor and artifact checks only.
  --platform NAME  Docker platform, for example linux/arm64.
  --tag TAG        Local image tag suffix, default is the reactor version + "-local".
  --record FILE    Write the reproducibility receipt to FILE.
  --help           Show this help.

Environment:
  IBIZ_MAVEN_IMAGE       Third-party Maven image, default maven:3.9-eclipse-temurin-17.
  IBIZ_JAVA_IMAGE        Third-party Java base image, default eclipse-temurin:17-jdk.
  IBIZ_LOCAL_IMAGE_PREFIX Image repository prefix, default aibiz.
  IBIZ_LOCAL_TAG         Overrides the local image tag suffix.
  IBIZ_MAVEN_CACHE_DIR   Host Maven cache directory, default ~/.m2.
  IBIZ_ALLOW_BASE_PULL   Pull missing Maven/JDK base images only, default 1.
  IBIZ_ALLOW_MUTABLE_BASE_TAG
                         Permit a base image without a RepoDigest, default 0.
  IBIZ_BUILD_RECORD      Default receipt path, scripts/records/backend-local-build.json.
EOF
}

log() {
    printf '[local-backend] %s\n' "$*"
}

fail() {
    printf '[local-backend] ERROR: %s\n' "$*" >&2
    exit 1
}

ensure_record_path_available() {
    if [[ -e "${RECORD_FILE}" || -L "${RECORD_FILE}" ]]; then
        fail "record file already exists: ${RECORD_FILE}; use --record with a new path"
    fi
}

while (($#)); do
    case "$1" in
        --skip-maven)
            SKIP_MAVEN=1
            ;;
        --skip-docker)
            SKIP_DOCKER=1
            ;;
        --platform)
            (($# >= 2)) || fail "--platform requires a value"
            BUILD_PLATFORM="$2"
            shift
            ;;
        --tag)
            (($# >= 2)) || fail "--tag requires a value"
            LOCAL_TAG="$2"
            shift
            ;;
        --record)
            (($# >= 2)) || fail "--record requires a value"
            RECORD_FILE="$2"
            shift
            ;;
        --help|-h)
            usage
            exit 0
            ;;
        *)
            fail "unknown option: $1"
            ;;
    esac
    shift
done

command -v docker >/dev/null 2>&1 || fail "docker is required"
command -v unzip >/dev/null 2>&1 || fail "unzip is required for artifact checks"
command -v tar >/dev/null 2>&1 || fail "tar is required to create a clean source build workspace"
command -v jq >/dev/null 2>&1 || fail "jq is required to write the reproducibility receipt"
command -v sha256sum >/dev/null 2>&1 || fail "sha256sum is required for source and artifact receipts"

[[ -f "${ROOT_DIR}/pom.xml" ]] || fail "Maven reactor root is missing: ${ROOT_DIR}/pom.xml"
ensure_record_path_available

read_reactor_version() {
    sed -n 's:^[[:space:]]*<version>\([^<][^<]*\)</version>[[:space:]]*$:\1:p' \
        "${ROOT_DIR}/pom.xml" | head -n 1
}

REACTOR_VERSION="$(read_reactor_version)"
[[ -n "${REACTOR_VERSION}" ]] || fail "could not read the reactor version"
[[ -n "${LOCAL_TAG}" ]] || LOCAL_TAG="${REACTOR_VERSION}-local"

if [[ -z "${BUILD_PLATFORM}" ]]; then
    docker_arch="$(docker info --format '{{.Architecture}}' 2>/dev/null || true)"
    [[ -n "${docker_arch}" ]] || fail "could not determine the Docker daemon architecture"
    BUILD_PLATFORM="linux/${docker_arch}"
fi

case "${BUILD_PLATFORM}" in
    linux/amd64|linux/arm64|linux/arm/v7|linux/arm/v8)
        ;;
    *)
        fail "unsupported or unsafe platform '${BUILD_PLATFORM}'"
        ;;
esac

ensure_third_party_image() {
    local image="$1"
    if docker image inspect "${image}" >/dev/null 2>&1; then
        return
    fi
    if [[ "${ALLOW_BASE_PULL}" != "1" ]]; then
        fail "missing third-party base image '${image}' and IBIZ_ALLOW_BASE_PULL is not 1"
    fi
    log "pulling allowed third-party base image ${image}"
    docker pull --platform "${BUILD_PLATFORM}" "${image}"
}

resolve_third_party_image() {
    local requested="$1"
    local image_platform
    local repo_digest

    ensure_third_party_image "${requested}"
    image_platform="$(docker image inspect "${requested}" --format '{{.Os}}/{{.Architecture}}' 2>/dev/null || true)"
    if [[ "${image_platform}" != "${BUILD_PLATFORM}" &&
        "${ALLOW_BASE_PULL}" == "1" &&
        "${requested}" != *@sha256:* ]]; then
        log "pulling ${requested} for ${BUILD_PLATFORM}; local image is ${image_platform:-missing}"
        docker pull --platform "${BUILD_PLATFORM}" "${requested}"
        image_platform="$(docker image inspect "${requested}" --format '{{.Os}}/{{.Architecture}}' 2>/dev/null || true)"
    fi
    [[ "${image_platform}" == "${BUILD_PLATFORM}" ]] \
        || fail "base image ${requested} is ${image_platform:-missing}, expected ${BUILD_PLATFORM}"

    if [[ "${requested}" == *@sha256:* ]]; then
        printf '%s\n' "${requested}"
        return
    fi

    repo_digest="$(docker image inspect "${requested}" --format '{{json .RepoDigests}}' \
        | jq -r '.[0] // empty')"
    if [[ -z "${repo_digest}" ]]; then
        [[ "${ALLOW_MUTABLE_BASE_TAG}" == "1" ]] \
            || fail "base image ${requested} has no RepoDigest; use a digest reference or set IBIZ_ALLOW_MUTABLE_BASE_TAG=1"
        log "WARNING: using mutable base image tag ${requested}"
        printf '%s\n' "${requested}"
        return
    fi
    printf '%s\n' "${repo_digest}"
}

sha256_file() {
    sha256sum "$1" | awk '{print $1}'
}

source_sha256() {
    tar \
        --exclude='./.git' \
        --exclude='./target' \
        --exclude='*/target' \
        --exclude='*.jar' \
        --exclude='./scripts/records' \
        --sort=name \
        --mtime='UTC 1970-01-01' \
        --owner=0 --group=0 --numeric-owner \
        -C "${ROOT_DIR}" -cf - . \
        | sha256sum | awk '{print $1}'
}

git_commit() {
    git -C "${ROOT_DIR}" rev-parse HEAD 2>/dev/null || printf 'unavailable'
}

git_dirty() {
    if [[ -n "$(git -C "${ROOT_DIR}" status --porcelain=v1 -- . ':(exclude)scripts/records' 2>/dev/null)" ]]; then
        printf 'true'
    else
        printf 'false'
    fi
}

image_receipt_json() {
    local image="$1"
    local image_id
    local repo_digests
    local platform
    local version

    image_id="$(docker image inspect "${image}" --format '{{.Id}}')"
    repo_digests="$(docker image inspect "${image}" --format '{{json .RepoDigests}}')"
    platform="$(docker image inspect "${image}" --format '{{.Os}}/{{.Architecture}}')"
    version="$(docker image inspect "${image}" \
        --format '{{index .Config.Labels "org.opencontainers.image.version"}}')"
    jq -n \
        --arg reference "${image}" \
        --arg image_id "${image_id}" \
        --arg platform "${platform}" \
        --arg version "${version}" \
        --argjson repo_digests "${repo_digests}" \
        '{reference: $reference, image_id: $image_id, repo_digests: $repo_digests,
          platform: $platform, version_label: $version}'
}

write_build_record() {
    local runtime_image="${IMAGE_PREFIX}/ibiz-ebsx-allinone-rt:${LOCAL_TAG}"
    local gateway_image="${IMAGE_PREFIX}/ibiz-ebsx-gateway:${LOCAL_TAG}"
    local runtime_json='null'
    local gateway_json='null'
    local record_dir
    local runtime_artifact="${ROOT_DIR}/${RUNTIME_MODULE}/ibiz-ebsx-allinone-rt.jar"
    local gateway_artifact="${ROOT_DIR}/${GATEWAY_MODULE}/ibiz-ebsx-gateway.jar"
    local maven_id
    local java_id

    if ((SKIP_DOCKER == 0)); then
        runtime_json="$(image_receipt_json "${runtime_image}")"
        gateway_json="$(image_receipt_json "${gateway_image}")"
    fi
    maven_id="$(docker image inspect "${MAVEN_IMAGE}" --format '{{.Id}}' 2>/dev/null || true)"
    java_id="$(docker image inspect "${JAVA_IMAGE}" --format '{{.Id}}' 2>/dev/null || true)"
    record_dir="$(dirname "${RECORD_FILE}")"
    mkdir -p "${record_dir}"
    jq -n \
        --arg generated_at_utc "$(date -u '+%Y-%m-%dT%H:%M:%SZ')" \
        --arg source_root "${ROOT_DIR}" \
        --arg source_sha256 "${SOURCE_SHA256}" \
        --arg git_commit "$(git_commit)" \
        --arg git_dirty "$(git_dirty)" \
        --arg reactor_version "${REACTOR_VERSION}" \
        --arg runtime_version "$(sed -n 's:^[[:space:]]*<version>\([^<][^<]*\)</version>[[:space:]]*$:\1:p' "${ROOT_DIR}/${RUNTIME_MODULE}/pom.xml" | head -n 1)" \
        --arg gateway_version "$(sed -n 's:^[[:space:]]*<version>\([^<][^<]*\)</version>[[:space:]]*$:\1:p' "${ROOT_DIR}/${GATEWAY_MODULE}/pom.xml" | head -n 1)" \
        --arg platform "${BUILD_PLATFORM}" \
        --arg architecture "$(docker image inspect "${JAVA_IMAGE}" --format '{{.Architecture}}' 2>/dev/null || printf '%s' "${BUILD_PLATFORM#*/}")" \
        --arg maven_requested "${MAVEN_IMAGE}" \
        --arg maven_resolved "${MAVEN_IMAGE_RESOLVED}" \
        --arg maven_id "${maven_id}" \
        --arg java_requested "${JAVA_IMAGE}" \
        --arg java_resolved "${JAVA_IMAGE_RESOLVED}" \
        --arg java_id "${java_id}" \
        --arg local_tag "${LOCAL_TAG}" \
        --arg image_prefix "${IMAGE_PREFIX}" \
        --arg build_command "scripts/build-local-images.sh --platform ${BUILD_PLATFORM} --tag ${LOCAL_TAG}" \
        --arg runtime_artifact_sha256 "$(sha256_file "${runtime_artifact}")" \
        --arg gateway_artifact_sha256 "$(sha256_file "${gateway_artifact}")" \
        --argjson runtime_image "${runtime_json}" \
        --argjson gateway_image "${gateway_json}" \
        '{
          schema_version: 1,
          generated_at_utc: $generated_at_utc,
          source: {
            root: $source_root, sha256: $source_sha256,
            git_commit: $git_commit, git_dirty: ($git_dirty == "true")
          },
          reactor: {
            version: $reactor_version,
            runtime_version: $runtime_version,
            gateway_version: $gateway_version
          },
          build: {
            platform: $platform, architecture: $architecture,
            maven: {requested: $maven_requested, resolved: $maven_resolved, image_id: $maven_id},
            java: {requested: $java_requested, resolved: $java_resolved, image_id: $java_id},
            command: $build_command
          },
          artifacts: {
            allinone: {path: "ibiz-ebsx-runtime/ibiz-ebsx-allinone-rt.jar", sha256: $runtime_artifact_sha256},
            gateway: {path: "ibiz-ebsx-gateway/ibiz-ebsx-gateway.jar", sha256: $gateway_artifact_sha256}
          },
          images: {
            prefix: $image_prefix, tag: $local_tag,
            allinone: $runtime_image, gateway: $gateway_image
          }
        }' >"${RECORD_FILE}"
    log "wrote reproducibility receipt ${RECORD_FILE}"
}

run_maven_reactor() {
    mkdir -p "${MAVEN_CACHE_DIR}"
    BUILD_TMP_DIR="$(mktemp -d "${TMPDIR:-/tmp}/ibiz-service-hub-build.XXXXXX")"
    BUILD_ROOT="${BUILD_TMP_DIR}"
    trap 'rm -rf "${BUILD_TMP_DIR}"' EXIT
    tar \
        --exclude='./.git' \
        --exclude='./target' \
        --exclude='*/target' \
        --exclude='*.jar' \
        -C "${ROOT_DIR}" -cf - . \
        | tar -C "${BUILD_ROOT}" -xf -
    log "building source reactor with ${MAVEN_IMAGE_RESOLVED}"
    docker run --rm --init \
        --platform "${BUILD_PLATFORM}" \
        --user "$(id -u):$(id -g)" \
        --env HOME=/tmp/maven-home \
        --entrypoint mvn \
        --volume "${BUILD_ROOT}:/workspace" \
        --volume "${MAVEN_CACHE_DIR}:/maven-cache" \
        --workdir /workspace \
        "${MAVEN_IMAGE_RESOLVED}" \
        -B -ntp \
            -Dmaven.repo.local=/maven-cache/repository \
            -Dmaven.test.skip=true \
            -Dmaven.javadoc.skip=true \
            -Dmaven.deploy.skip=true \
            -pl "${RUNTIME_MODULE},${GATEWAY_MODULE}" \
            -am \
            -P runtime,gateway \
            clean package
}

is_boot_artifact() {
    local path="$1"
    local start_class="$2"
    local manifest

    [[ -s "${path}" ]] || return 1
    unzip -Z1 "${path}" \
        | grep -Fx "BOOT-INF/classes/${start_class//.//}.class" >/dev/null \
        || return 1
    manifest="$(unzip -p "${path}" META-INF/MANIFEST.MF 2>/dev/null || true)"
    grep -Fq "Start-Class: ${start_class}" <<<"${manifest}"
}

find_and_stage_artifact() {
    local module="$1"
    local expected="$2"
    local start_class="$3"
    local source="${BUILD_ROOT}/${module}/${expected}"
    local destination="${ROOT_DIR}/${module}/${expected}"
    local candidate
    local candidates=()

    if [[ -f "${source}" ]]; then
        if [[ "${source}" != "${destination}" ]]; then
            install -m 0644 "${source}" "${destination}"
        fi
        return
    fi

    while IFS= read -r candidate; do
        candidates+=("${candidate}")
    done < <(find "${BUILD_ROOT}/${module}/target" -maxdepth 1 -type f -name '*.jar' \
        ! -name '*sources*' ! -name '*javadoc*' -print 2>/dev/null || true)

    for candidate in "${candidates[@]}"; do
        if is_boot_artifact "${candidate}" "${start_class}"; then
            install -m 0644 "${candidate}" "${destination}"
            log "staged ${module}/$(basename "${candidate}") as ${expected}"
            return
        fi
    done

    fail "Maven did not produce bootable ${module}/${expected} with ${start_class}"
}

verify_artifact() {
    local module="$1"
    local artifact="$2"
    local start_class="$3"
    local path="${ROOT_DIR}/${module}/${artifact}"
    local manifest

    [[ -s "${path}" ]] || fail "missing or empty artifact ${path}"
    unzip -Z1 "${path}" | grep -Fx "BOOT-INF/classes/${start_class//.//}.class" >/dev/null \
        || fail "artifact ${path} does not contain ${start_class}"
    manifest="$(unzip -p "${path}" META-INF/MANIFEST.MF 2>/dev/null || true)"
    grep -Fq "Start-Class: ${start_class}" <<<"${manifest}" \
        || fail "artifact ${path} has no expected Spring Boot Start-Class"
    log "verified ${module}/${artifact} (${start_class})"
}

build_local_image() {
    local module="$1"
    local artifact="$2"
    local image="$3"

    ensure_third_party_image "${JAVA_IMAGE_RESOLVED}"
    log "building ${image} from ${module}/Dockerfile.local"
    docker build \
        --pull=false \
        --platform "${BUILD_PLATFORM}" \
        --build-arg "JAVA_IMAGE=${JAVA_IMAGE_RESOLVED}" \
        --build-arg "IBIZ_VERSION=${REACTOR_VERSION}" \
        --tag "${image}" \
        --file "${ROOT_DIR}/${module}/Dockerfile.local" \
        "${ROOT_DIR}/${module}"

    local image_platform
    image_platform="$(docker image inspect "${image}" --format '{{.Os}}/{{.Architecture}}')"
    [[ "${image_platform}" == "${BUILD_PLATFORM}" ]] \
        || fail "${image} architecture is ${image_platform}, expected ${BUILD_PLATFORM}"
    docker image inspect "${image}" --format '{{index .Config.Labels "org.opencontainers.image.version"}}' \
        | grep -Fxq "${REACTOR_VERSION}" \
        || fail "${image} does not carry reactor version ${REACTOR_VERSION}"
    log "verified ${image} (${image_platform})"
}

MAVEN_IMAGE_RESOLVED="$(resolve_third_party_image "${MAVEN_IMAGE}")"
JAVA_IMAGE_RESOLVED="$(resolve_third_party_image "${JAVA_IMAGE}")"
SOURCE_SHA256="$(source_sha256)"

if ((SKIP_MAVEN == 0)); then
    run_maven_reactor
fi

find_and_stage_artifact \
    "${RUNTIME_MODULE}" \
    "ibiz-ebsx-allinone-rt.jar" \
    "net.ibizsys.ebsx.allinone.boot.EBSXAllInOneApplication"
find_and_stage_artifact \
    "${GATEWAY_MODULE}" \
    "ibiz-ebsx-gateway.jar" \
    "net.ibizsys.ebsx.gateway.boot.EBSXGatewayApplication"
verify_artifact \
    "${RUNTIME_MODULE}" \
    "ibiz-ebsx-allinone-rt.jar" \
    "net.ibizsys.ebsx.allinone.boot.EBSXAllInOneApplication"
verify_artifact \
    "${GATEWAY_MODULE}" \
    "ibiz-ebsx-gateway.jar" \
    "net.ibizsys.ebsx.gateway.boot.EBSXGatewayApplication"

if ((SKIP_DOCKER == 0)); then
    build_local_image \
        "${RUNTIME_MODULE}" \
        "ibiz-ebsx-allinone-rt.jar" \
        "${IMAGE_PREFIX}/ibiz-ebsx-allinone-rt:${LOCAL_TAG}"
    build_local_image \
        "${GATEWAY_MODULE}" \
        "ibiz-ebsx-gateway.jar" \
        "${IMAGE_PREFIX}/ibiz-ebsx-gateway:${LOCAL_TAG}"
fi

write_build_record
log "completed: version=${REACTOR_VERSION}, platform=${BUILD_PLATFORM}, tag=${LOCAL_TAG}"
