package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.342Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclDefaultActionAllowCustomRequestHandlingOutputReference")
public class Wafv2WebAclDefaultActionAllowCustomRequestHandlingOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Wafv2WebAclDefaultActionAllowCustomRequestHandlingOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Wafv2WebAclDefaultActionAllowCustomRequestHandlingOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Wafv2WebAclDefaultActionAllowCustomRequestHandlingOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putInsertHeader(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putInsertHeader", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderList getInsertHeader() {
        return software.amazon.jsii.Kernel.get(this, "insertHeader", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInsertHeaderInput() {
        return software.amazon.jsii.Kernel.get(this, "insertHeaderInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclDefaultActionAllowCustomRequestHandling getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclDefaultActionAllowCustomRequestHandling.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclDefaultActionAllowCustomRequestHandling value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
