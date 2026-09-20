package net.ibizsys.modeling.core.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import net.ibizsys.modeling.core.util.domain.CopyModelInput;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * Concrete copy session used during model DSL export with requires=true.
 *
 * <p>Extends {@link PSModelCloneSessionBase} with copy-model input and
 * configurable ignore- and mandatory-copy model type lists.</p>
 */
public class PSModelCopySession extends PSModelCloneSessionBase {

    private final CopyModelInput copyModelInput;
    private Map<String, String> ignorePSModelTypes;

    private static final Map<String, String> COPY_RS_MODEL_TYPES = new HashMap<>();

    static {
        COPY_RS_MODEL_TYPES.put("PSSYSSFPLUGIN", "");
        COPY_RS_MODEL_TYPES.put("PSSYSPFPLUGIN", "");
    }

    public PSModelCopySession(CopyModelInput copyModelInput) {
        this.copyModelInput = copyModelInput;
        Map<?, ?> option = copyModelInput.getOption();
        if (!ObjectUtils.isEmpty(option)) {
            String ignoreModels = (String) option.get("ignore_modeltypes");
            if (StringUtils.hasLength(ignoreModels)) {
                this.ignorePSModelTypes = new LinkedHashMap<>();
                for (String model : ignoreModels.toUpperCase().split("[,]")) {
                    this.ignorePSModelTypes.put(model.trim(), "");
                }
            }
        }
    }

    public CopyModelInput getCopyModelInput() {
        return copyModelInput;
    }

    @Override
    public boolean shouldCopyPSModel(String strPSModelName) {
        if (!ObjectUtils.isEmpty(ignorePSModelTypes)) {
            return !ignorePSModelTypes.containsKey(strPSModelName.toUpperCase());
        }
        return true;
    }

    @Override
    public boolean isRSModelCopyMandatory(String strPSModelName) {
        return COPY_RS_MODEL_TYPES.containsKey(strPSModelName.toUpperCase());
    }
}