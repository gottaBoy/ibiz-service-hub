import assert from 'node:assert/strict';
import { execFileSync, spawnSync } from 'node:child_process';
import { existsSync, mkdtempSync, readFileSync, rmSync } from 'node:fs';
import { dirname, resolve } from 'node:path';
import test from 'node:test';
import { fileURLToPath } from 'node:url';

const testsDir = dirname(fileURLToPath(import.meta.url));
const serviceHubRoot = resolve(testsDir, '../..');
const workspaceRoot = resolve(serviceHubRoot, '..');
const composeDir = resolve(workspaceRoot, 'plm/deploy/compose');
const composeFile = resolve(composeDir, 'docker-compose-platform-local.yml');
const envFile = resolve(composeDir, '.env');
const wrapper = resolve(serviceHubRoot, 'scripts/build-local-images.sh');

function read(path) {
  return readFileSync(path, 'utf8');
}

function run(command, args, options = {}) {
  const result = spawnSync(command, args, {
    cwd: options.cwd ?? serviceHubRoot,
    encoding: 'utf8',
    timeout: options.timeout ?? 30000,
    env: { ...process.env, ...options.env },
  });
  assert.equal(result.error, undefined, `${command} failed to start: ${result.error?.message}`);
  assert.equal(result.signal, null, `${command} terminated by ${result.signal}`);
  return result;
}

function composeConfig({ formal = false } = {}) {
  const args = ['compose', '--env-file', envFile, '-f', composeFile];
  if (formal) args.push('--profile', 'formal');
  args.push('config', '--format', 'json');
  const result = run('docker', args, { cwd: composeDir });
  assert.equal(result.status, 0, result.stderr);
  return JSON.parse(result.stdout);
}

test('local build wrapper is a strict JDK17 source-reactor entrypoint', () => {
  const script = read(wrapper);
  assert.equal(run('bash', ['-n', wrapper]).status, 0);
  assert.equal(run('bash', [wrapper, '--help']).status, 0);
  assert.match(script, /maven:3\.9-eclipse-temurin-17/);
  assert.match(script, /-Dmaven\.repo\.local=\/maven-cache\/repository/);
  assert.match(script, /-pl "\$\{RUNTIME_MODULE\},\$\{GATEWAY_MODULE\}"/);
  assert.match(script, /-am/);
  assert.match(script, /-P runtime,gateway/);
  assert.match(script, /--pull=false/);
  assert.match(script, /MAVEN_IMAGE_RESOLVED="\$\(resolve_third_party_image "\$\{MAVEN_IMAGE\}"\)/);
  assert.match(script, /JAVA_IMAGE_RESOLVED="\$\(resolve_third_party_image "\$\{JAVA_IMAGE\}"\)/);
  assert.match(script, /docker pull --platform "\$\{BUILD_PLATFORM\}"/);
  assert.match(script, /RepoDigest/);
  assert.match(script, /IBIZ_ALLOW_MUTABLE_BASE_TAG/);
  assert.match(script, /--record FILE/);
  assert.match(script, /source_sha256/);
  assert.match(script, /image_id/);
  assert.doesNotMatch(
    script,
    /rm -f \\\n\s+"\$\{ROOT_DIR\}\/\$\{RUNTIME_MODULE\}\/ibiz-ebsx-allinone-rt\.jar"/,
  );
});

test('local build receipt has the reproducibility schema', () => {
  const tempDir = mkdtempSync('/tmp/backend-local-build-test-');
  const receipt = resolve(tempDir, 'receipt.json');
  try {
    const result = run('bash', [
      wrapper,
      '--skip-maven',
      '--skip-docker',
      '--platform',
      'linux/arm64',
      '--tag',
      'receipt-test',
      '--record',
      receipt,
    ], { timeout: 60000 });
    assert.equal(result.status, 0, result.stderr);

    const record = JSON.parse(read(receipt));
    assert.equal(record.schema_version, 1);
    assert.match(record.source.sha256, /^[a-f0-9]{64}$/);
    assert.match(record.reactor.version, /^\d+\.\d+\.\d+(?:\.\d+){0,2}$/);
    assert.equal(record.reactor.runtime_version, record.reactor.version);
    assert.equal(record.reactor.gateway_version, record.reactor.version);
    assert.equal(record.build.platform, 'linux/arm64');
    assert.equal(record.build.architecture, 'arm64');
    assert.match(record.build.maven.resolved, /^maven@sha256:[a-f0-9]{64}$/);
    assert.match(record.build.java.resolved, /^eclipse-temurin@sha256:[a-f0-9]{64}$/);
    assert.match(record.artifacts.allinone.sha256, /^[a-f0-9]{64}$/);
    assert.match(record.artifacts.gateway.sha256, /^[a-f0-9]{64}$/);
    assert.equal(record.images.tag, 'receipt-test');
    assert.equal(record.images.allinone, null);
    assert.equal(record.images.gateway, null);
  } finally {
    rmSync(tempDir, { recursive: true, force: true });
  }
});

test('reactor versions and boot entrypoints are aligned', () => {
  const rootPom = read(resolve(serviceHubRoot, 'pom.xml'));
  const runtimePom = read(resolve(serviceHubRoot, 'ibiz-ebsx-runtime/pom.xml'));
  const gatewayPom = read(resolve(serviceHubRoot, 'ibiz-ebsx-gateway/pom.xml'));

  assert.match(rootPom, /<version>8\.1\.0\.584\.1<\/version>/);
  assert.match(rootPom, /<module>ibiz-ebsx-runtime<\/module>/);
  assert.match(rootPom, /<module>ibiz-ebsx-gateway<\/module>/);
  assert.match(runtimePom, /<id>runtime<\/id>/);
  assert.match(runtimePom, /net\.ibizsys\.ebsx\.allinone\.boot\.EBSXAllInOneApplication/);
  assert.match(gatewayPom, /<id>gateway<\/id>/);
  assert.match(gatewayPom, /net\.ibizsys\.ebsx\.gateway\.boot\.EBSXGatewayApplication/);
});

test('local Dockerfiles contain only third-party Java bases and deterministic artifacts', () => {
  const dockerfiles = [
    [
      resolve(serviceHubRoot, 'ibiz-ebsx-runtime/Dockerfile.local'),
      'ibiz-ebsx-allinone-rt.jar',
      'iBiz EBSX All-in-One Runtime',
    ],
    [
      resolve(serviceHubRoot, 'ibiz-ebsx-gateway/Dockerfile.local'),
      'ibiz-ebsx-gateway.jar',
      'iBiz EBSX Gateway',
    ],
  ];

  for (const [path, artifact, title] of dockerfiles) {
    const dockerfile = read(path);
    assert.match(dockerfile, /ARG JAVA_IMAGE=eclipse-temurin:17-jdk/);
    assert.match(dockerfile, /FROM \$\{JAVA_IMAGE\}/);
    assert.doesNotMatch(dockerfile, /FROM\s+\S*(?:ibiz|ibizlab)/i);
    assert.match(dockerfile, new RegExp(`COPY ${artifact.replaceAll('.', '\\.')} /`));
    assert.match(dockerfile, new RegExp(`org\\.opencontainers\\.image\\.title="${title}"`));
    assert.match(dockerfile, /org\.opencontainers\.image\.version="\$\{IBIZ_VERSION\}"/);
    assert.match(dockerfile, /ENTRYPOINT \["sh", "-c"\]/);
    if (artifact === 'ibiz-ebsx-allinone-rt.jar') {
      assert.match(dockerfile, /--add-exports=java\.naming\/com\.sun\.jndi\.ldap=ALL-UNNAMED/);
    }

    const check = run('docker', [
      'buildx',
      'build',
      '--check',
      '--pull=false',
      '-f',
      path,
      resolve(serviceHubRoot, path.includes('runtime') ? 'ibiz-ebsx-runtime' : 'ibiz-ebsx-gateway'),
    ]);
    assert.equal(check.status, 0, check.stderr);
  }
});

test('default local Compose config is isolated from formal service containers', () => {
  assert.ok(existsSync(composeFile), `missing ${composeFile}`);
  assert.ok(existsSync(envFile), `missing ${envFile}`);

  const config = composeConfig();
  const allinone = config.services['ibiz-ebsx-allinone-local'];
  const gateway = config.services['ibiz-ebsx-gateway-local'];

  assert.ok(allinone);
  assert.ok(gateway);
  assert.equal(allinone.image, 'aibiz/ibiz-ebsx-allinone-rt:8.1.0.584.1-local');
  assert.equal(gateway.image, 'aibiz/ibiz-ebsx-gateway:8.1.0.584.1-local');
  assert.equal(allinone.pull_policy, 'never');
  assert.equal(gateway.pull_policy, 'never');
  assert.equal(allinone.container_name, 'ibiz-ebsx-allinone-local');
  assert.equal(gateway.container_name, 'ibiz-ebsx-gateway-local');
  assert.equal(allinone.build.context, resolve(serviceHubRoot, 'ibiz-ebsx-runtime'));
  assert.equal(gateway.build.context, resolve(serviceHubRoot, 'ibiz-ebsx-gateway'));
  assert.equal(allinone.build.dockerfile, 'Dockerfile.local');
  assert.equal(gateway.build.dockerfile, 'Dockerfile.local');
  assert.match(allinone.environment.JAVA_OPTS, /--add-exports=java\.naming\/com\.sun\.jndi\.ldap=ALL-UNNAMED/);
  assert.equal(allinone.ports[0].published, '30100');
  assert.equal(gateway.ports[0].published, '30186');
  assert.equal(config.services['ibiz-ebsx-allinone'], undefined);
  assert.equal(config.services['ibiz-ebsx-gateway'], undefined);
  assert.equal(config.services['ibizlab-uaa-api'], undefined);
});

test('formal service containers remain opt-in and untouched', () => {
  const config = composeConfig({ formal: true });
  for (const name of ['ibiz-ebsx-allinone', 'ibiz-ebsx-gateway', 'ibizlab-uaa-api']) {
    assert.ok(config.services[name], `formal service ${name} is missing`);
    assert.deepEqual(config.services[name].profiles, ['formal']);
  }
});

test('local Compose services use distinct names, ports, and storage', () => {
  const compose = read(composeFile);
  assert.match(compose, /container_name: ibiz-ebsx-allinone-local/);
  assert.match(compose, /container_name: ibiz-ebsx-gateway-local/);
  assert.match(compose, /"\$\{IBIZ_LOCAL_ALLINONE_PORT:-30100\}:30000"/);
  assert.match(compose, /"\$\{IBIZ_LOCAL_GATEWAY_PORT:-30186\}:30086"/);
  assert.match(compose, /allinone_local_data:\/app\/file/);
  assert.doesNotMatch(compose, /image:\s*\$\{IMAGE_URL\}ibiz-ebsx-(?:allinone|gateway)/);
});
