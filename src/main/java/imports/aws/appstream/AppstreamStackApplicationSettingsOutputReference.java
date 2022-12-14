package imports.aws.appstream;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.195Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appstream.AppstreamStackApplicationSettingsOutputReference")
public class AppstreamStackApplicationSettingsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppstreamStackApplicationSettingsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppstreamStackApplicationSettingsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppstreamStackApplicationSettingsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSettingsGroup() {
        software.amazon.jsii.Kernel.call(this, "resetSettingsGroup", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSettingsGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "settingsGroupInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSettingsGroup() {
        return software.amazon.jsii.Kernel.get(this, "settingsGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSettingsGroup(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "settingsGroup", java.util.Objects.requireNonNull(value, "settingsGroup is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appstream.AppstreamStackApplicationSettings getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appstream.AppstreamStackApplicationSettings.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appstream.AppstreamStackApplicationSettings value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
