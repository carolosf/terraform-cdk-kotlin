package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.343Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclDefaultActionBlockCustomResponseOutputReference")
public class Wafv2WebAclDefaultActionBlockCustomResponseOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Wafv2WebAclDefaultActionBlockCustomResponseOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Wafv2WebAclDefaultActionBlockCustomResponseOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Wafv2WebAclDefaultActionBlockCustomResponseOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putResponseHeader(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putResponseHeader", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCustomResponseBodyKey() {
        software.amazon.jsii.Kernel.call(this, "resetCustomResponseBodyKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResponseHeader() {
        software.amazon.jsii.Kernel.call(this, "resetResponseHeader", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclDefaultActionBlockCustomResponseResponseHeaderList getResponseHeader() {
        return software.amazon.jsii.Kernel.get(this, "responseHeader", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclDefaultActionBlockCustomResponseResponseHeaderList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCustomResponseBodyKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "customResponseBodyKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getResponseCodeInput() {
        return software.amazon.jsii.Kernel.get(this, "responseCodeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getResponseHeaderInput() {
        return software.amazon.jsii.Kernel.get(this, "responseHeaderInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomResponseBodyKey() {
        return software.amazon.jsii.Kernel.get(this, "customResponseBodyKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomResponseBodyKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customResponseBodyKey", java.util.Objects.requireNonNull(value, "customResponseBodyKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getResponseCode() {
        return software.amazon.jsii.Kernel.get(this, "responseCode", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setResponseCode(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "responseCode", java.util.Objects.requireNonNull(value, "responseCode is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclDefaultActionBlockCustomResponse getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclDefaultActionBlockCustomResponse.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclDefaultActionBlockCustomResponse value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
