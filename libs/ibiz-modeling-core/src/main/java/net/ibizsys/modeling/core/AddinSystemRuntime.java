package net.ibizsys.modeling.core;

/**
 * Modeling add-in system runtime.
 *
 * <p>The extension module's implementation is a thin cloud service runtime
 * subclass. Keeping the same direct base here avoids a hard dependency from
 * the modeling core module back to the extension module.</p>
 */
public class AddinSystemRuntime extends net.ibizsys.central.cloud.core.ServiceSystemRuntime {
}