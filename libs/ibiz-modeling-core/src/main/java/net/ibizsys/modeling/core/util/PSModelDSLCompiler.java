package net.ibizsys.modeling.core.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import groovy.lang.Binding;
import groovy.lang.Closure;
import groovy.lang.GString;
import groovy.lang.GroovyShell;
import groovy.util.BuilderSupport;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.dataentity.IDataEntityRuntime;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntime;
import net.ibizsys.modeling.core.util.domain.CompileModelDSLInput;
import net.ibizsys.modeling.core.util.domain.CompileModelDSLResult;

import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.customizers.CompilationCustomizer;
import org.codehaus.groovy.control.customizers.SecureASTCustomizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * DSL compiler for model definitions.
 *
 * <p>Parses a Groovy-builder DSL string into a tree of {@link IPSModelDSLNode}
 * instances, registers them by model type and unique key, and delegates to the
 * model-enhancer runtime for node creation and persistence (compile).</p>
 *
 * <p>Standard usage:</p>
 * <pre>{@code
 * CompileModelDSLInput input = new CompileModelDSLInput();
 * input.setDSL("PSDataEntity(codename: \"MyEntity\") { ... }");
 * input.setModelScope("PSDataEntity#someId");
 * CompileModelDSLResult result = compiler.compile(input);
 * }</pre>
 *
 * <h3>Exception behavior</h3>
 * <ul>
 *   <li>{@link IllegalArgumentException} — {@code input} or {@code input.getDSL()} is null/empty</li>
 *   <li>{@link Exception} with message "传入模型范围无效" — malformed model scope (not 2 parts)</li>
 *   <li>{@link Exception} with message "编译DSL发生异常" — Groovy compile/parse failure</li>
 *   <li>{@link RuntimeException} with message "不支持模型[PSSYSTEM]" — reserved type PSSYSTEM</li>
 *   <li>{@link RuntimeException} with message "节点[...]未指定模型属性集合" — node without attributes</li>
 *   <li>{@link RuntimeException} with message "节点[...]未支持" — unrecognised node name</li>
 *   <li>{@link RuntimeException} with message "嵌套节点[...]未支持选项" — OPTION on a nested node</li>
 * </ul>
 *
 * <h3>Extensibility</h3>
 * <p>Subclasses may override {@link #createPSModelDSLCompileSession},
 * {@link #toCompileModelDSLResult}, {@link #onCreateNode}, and
 * {@link #createPSModelDSLNode} to customize behaviour without
 * copying the entire pipeline.</p>
 */
public class PSModelDSLCompiler {

    private static final Logger log = LoggerFactory.getLogger(PSModelDSLCompiler.class);

    private final IModelEnhancerSysUtilRuntime modelEnhancerSysUtilRuntime;

    /**
     * Construct a compiler backed by the given enhancer runtime.
     *
     * @param modelEnhancerSysUtilRuntime the enhancer runtime providing node
     *        factory and compilation hooks; must not be null
     */
    public PSModelDSLCompiler(IModelEnhancerSysUtilRuntime modelEnhancerSysUtilRuntime) {
        this.modelEnhancerSysUtilRuntime = modelEnhancerSysUtilRuntime;
    }

    /**
     * Return the underlying model enhancer runtime.
     */
    protected IModelEnhancerSysUtilRuntime getModelEnhancerSysUtilRuntime() {
        return modelEnhancerSysUtilRuntime;
    }

    // ------------------------------------------------------------------
    // Public API
    // ------------------------------------------------------------------

    /**
     * Compile the DSL contained in {@code input}.
     *
     * <p>This method is the main entry point. It validates the input,
     * resolves the model scope chain, parses the DSL into a Groovy
     * closure, builds the node tree, and invokes the enhancer hooks.</p>
     *
     * @param input the compilation input (DSL source, model scope, options)
     * @return compilation result containing the produced model DTOs keyed by
     *         model type name
     * @throws IllegalArgumentException if {@code input} is null or
     *         {@code input.getDSL()} is null/empty
     * @throws Throwable on parse errors or runtime failures
     */
    public CompileModelDSLResult compile(CompileModelDSLInput input) throws Throwable {
        if (input == null) {
            throw new IllegalArgumentException("input must not be null");
        }
        String dslSource = input.getDSL();
        if (!StringUtils.hasLength(dslSource)) {
            throw new IllegalArgumentException("DSL source must not be null or empty");
        }

        PSModelDSLCompileSession session = createPSModelDSLCompileSession(input);

        // Shared binding: the context map is populated from the model scope
        // BEFORE the DSL is compiled, so that GString references in the DSL
        // can interpolate context values at compile time.
        Binding binding = new Binding();
        LinkedHashMap<String, String> context = new LinkedHashMap<>();
        binding.setProperty("context", context);

        resolveModelScope(input, context);

        // 1. Parse the DSL source into a Groovy closure
        Closure<?> closure = parseDSL(dslSource, binding);

        // 2. Build the node tree via the BuilderSupport
        BuilderSupport builder = createBuilder(session);
        closure.setResolveStrategy(Closure.DELEGATE_FIRST);
        closure.setDelegate(builder);
        closure.call();

        // 3. Pre-processing and compilation hooks
        List<IPSModelDSLNode> nodes = session.getPSModelDSLNodes();
        if (!ObjectUtils.isEmpty(nodes)) {
            for (IPSModelDSLNode node : nodes) {
                modelEnhancerSysUtilRuntime.prepareCompilePSModelDSLNode(
                        node.getPSModelName(), session, node);
            }
            for (IPSModelDSLNode node : nodes) {
                modelEnhancerSysUtilRuntime.compilePSModelDSLNode(
                        node.getPSModelName(), session, node);
            }
        }

        return toCompileModelDSLResult(session);
    }

    // ------------------------------------------------------------------
    // Hook methods (extensible by subclasses)
    // ------------------------------------------------------------------

    /**
     * Factory method for the compile session. Subclasses may override to
     * provide a custom session implementation.
     */
    protected PSModelDSLCompileSession createPSModelDSLCompileSession(CompileModelDSLInput input) {
        return new PSModelDSLCompileSession(input);
    }

    /**
     * Convert the session state into a {@link CompileModelDSLResult}.
     *
     * <p>The result data map is keyed by model type name
     * ({@link IPSModelDSLNode#getPSModelName()}) and contains the list of
     * {@link IEntityDTO} backing instances produced during compilation.</p>
     */
    @SuppressWarnings("unchecked")
    protected CompileModelDSLResult toCompileModelDSLResult(PSModelDSLCompileSession session) throws Throwable {
        CompileModelDSLResult result = new CompileModelDSLResult();
        Map<String, ArrayList<IEntityDTO>> dataMap = new LinkedHashMap<>();
        for (IPSModelDSLNode node : session.getPSModelDSLNodes()) {
            String modelName = node.getPSModelName();
            ArrayList<IEntityDTO> list = (ArrayList<IEntityDTO>) dataMap.get(modelName);
            if (list == null) {
                list = new ArrayList<>();
                dataMap.put(modelName, list);
            }
            if (node.getReal() != null) {
                list.add(node.getReal());
            }
        }
        result.setData(dataMap);
        return result;
    }

    // ------------------------------------------------------------------
    // DSL parsing internals
    // ------------------------------------------------------------------

    /**
     * Parse the DSL source string into a Groovy {@link Closure} using the
     * given binding (which already contains the {@code context} variable).
     */
    private Closure<?> parseDSL(String dslSource, Binding binding) throws Exception {
        SecureASTCustomizer secure = new SecureASTCustomizer();
        secure.setAllowedImports(new ArrayList<>());
        secure.setClosuresAllowed(true);
        secure.setAllowedReceiversClasses(Arrays.asList(Object.class));
        secure.setMethodDefinitionAllowed(true);

        CompilerConfiguration config = new CompilerConfiguration();
        config.addCompilationCustomizers(new CompilationCustomizer[]{secure});

        GroovyShell shell = new GroovyShell(binding, config);
        try {
            String script = "def c = {\r\n" + dslSource + "\r\n};\r\nreturn c;";
            Object ret = shell.evaluate(script);
            if (!(ret instanceof Closure)) {
                throw new Exception(String.format(
                        "\u5bf9\u8c61[%1$s]\u4e0d\u6b63\u786e", ret));
            }
            return (Closure<?>) ret;
        } catch (Throwable ex) {
            throw new Exception(String.format(
                    "\u7f16\u8bd1DSL\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), ex);
        }
    }

    /**
     * Create a {@link BuilderSupport} that delegates node creation to
     * {@link #onCreateNode}.
     */
    private BuilderSupport createBuilder(PSModelDSLCompileSession session) {
        return new BuilderSupport() {
            @Override
            protected void setParent(Object parent, Object child) {
                log.debug("setParent");
            }

            @Override
            protected Object createNode(Object name) {
                log.debug("createNode({})", name);
                return createNode(name, Collections.emptyMap());
            }

            @Override
            protected Object createNode(Object name, Object value) {
                log.debug("createNode({}, {})", name, value);
                Map<String, Object> attrs = new LinkedHashMap<>();
                attrs.put("codename", value);
                return createNode(name, attrs);
            }

            @Override
            protected Object createNode(Object name, Map attributes, Object value) {
                log.debug("createNode({}, {}, {})", name, attributes, value);
                return createNode(name, attributes);
            }

            @Override
            @SuppressWarnings({"unchecked", "rawtypes"})
            protected Object createNode(Object name, Map attributes) {
                log.debug("createNode({}, {})", name, attributes);
                return PSModelDSLCompiler.this.onCreateNode(
                        session, name, attributes, getCurrent());
            }
        };
    }

    /**
     * Resolve the model scope chain and populate the {@code context} map.
     *
     * <p>The scope string is of the form {@code "DataEntityName#keyValue"}.
     * The method walks up the parent scope chain, inserting DSL unique IDs
     * into the context map so that the DSL script can reference them via
     * {@code context.DataEntityName}.</p>
     *
     * <p>If the scope is null or empty this is a no-op.</p>
     *
     * @throws Exception if the scope format is invalid (not exactly 2 parts
     *         separated by {@code #})
     */
    private void resolveModelScope(CompileModelDSLInput input,
                                   LinkedHashMap<String, String> context) throws Throwable {
        String scope = input.getModelScope();
        if (!StringUtils.hasLength(scope)) {
            return;
        }

        String[] items = scope.split("[#]");
        if (items.length != 2) {
            throw new Exception("\u4f20\u5165\u6a21\u578b\u8303\u56f4\u65e0\u6548");
        }

        IDataEntityRuntime deRT = (IDataEntityRuntime)
                modelEnhancerSysUtilRuntime.getSystemRuntime().getDataEntityRuntime(items[0]);
        IEntityDTO entity = deRT.get(items[1]);
        IDataEntityRuntime parentDERT = deRT;
        IEntityDTO parentEntity = entity;

        while (true) {
            String dslId = parentDERT.getDSLUniqueId(parentEntity);
            if (StringUtils.hasLength(dslId)) {
                context.put(parentDERT.getName(), dslId);
            }
            String nextScope = parentDERT.getModelScope(parentEntity);
            if (!StringUtils.hasLength(nextScope)) {
                break;
            }
            items = nextScope.split("[#]");
            if (items.length != 2) {
                throw new Exception(String.format(
                        "\u6a21\u578b\u8303\u56f4[%1$s]\u65e0\u6548", nextScope));
            }
            parentDERT = (IDataEntityRuntime)
                    modelEnhancerSysUtilRuntime.getSystemRuntime().getDataEntityRuntime(items[0]);
            parentEntity = parentDERT.get(items[1]);
        }
    }

    // ------------------------------------------------------------------
    // Node creation
    // ------------------------------------------------------------------

    /**
     * Called by the {@link BuilderSupport} for each DSL node declaration.
     *
     * <p>Recognised node names start with {@code "PS"} (e.g. {@code PSDATAENTITY},
     * {@code PSDER}, etc.). Nodes named {@code PSSYSTEM} are explicitly rejected.
     * The special name {@code OPTION} is handled as a parent option setter.</p>
     *
     * @param session  the current compile session
     * @param name     the node name from the DSL builder
     * @param attributes  the attribute map from the builder
     * @param current  the current builder context (parent node, or null)
     * @return the created node, or {@code null} for OPTION nodes
     * @throws RuntimeException for rejected node types
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    protected Object onCreateNode(PSModelDSLCompileSession session, Object name,
                                  Map attributes, Object current) {
        String psModelName = name.toString().toUpperCase();
        IPSModelDSLNode parentNode = (current instanceof IPSModelDSLNode)
                ? (IPSModelDSLNode) current : null;

        if (psModelName.startsWith("PS")) {
            if ("PSSYSTEM".equals(psModelName)) {
                throw new RuntimeException("\u4e0d\u652f\u6301\u6a21\u578b[PSSYSTEM]");
            }
            if (ObjectUtils.isEmpty(attributes)) {
                throw new RuntimeException(String.format(
                        "\u8282\u70b9[%1$s]\u672a\u6307\u5b9a\u6a21\u578b\u5c5e\u6027\u96c6\u5408", name));
            }

            // Convert GString values to plain String
            Set keys = attributes.keySet();
            for (Object key : keys) {
                Object value = attributes.get(key);
                if (value instanceof GString) {
                    attributes.put(key, value.toString());
                }
            }

            IPSModelDSLNode node = createPSModelDSLNode(
                    psModelName, attributes, parentNode);

            if (node != null && !node.isNested()
                    && StringUtils.hasLength(node.getUniqueId())) {
                session.setPSModelDSLNode(
                        node.getPSModelName(), node.getUniqueId(), node);
            }
            return node;
        }

        if ("OPTION".equals(psModelName) && parentNode != null) {
            if (parentNode.isNested()) {
                throw new RuntimeException(String.format(
                        "\u5d4c\u5957\u8282\u70b9[%1$s]\u672a\u652f\u6301\u9009\u9879", name));
            }
            parentNode.option(attributes);
            return null;
        }

        throw new RuntimeException(String.format(
                "\u8282\u70b9[%1$s]\u672a\u652f\u6301", name));
    }

    /**
     * Create a single DSL node via the enhancer runtime.
     *
     * <p>The real interface accepts {@code Object attributes} for maximum
     * flexibility; the compiler always passes a {@code Map}.</p>
     */
    protected IPSModelDSLNode createPSModelDSLNode(String name,
                                                    Map<String, Object> attributes,
                                                    IPSModelDSLNode parent) {
        return modelEnhancerSysUtilRuntime.createPSModelDSLNode(name, attributes, parent);
    }
}