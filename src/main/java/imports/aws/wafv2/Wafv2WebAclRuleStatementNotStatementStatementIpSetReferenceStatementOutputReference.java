package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.471Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementOutputReference")
public class Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putIpSetForwardedIpConfig(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig value) {
        software.amazon.jsii.Kernel.call(this, "putIpSetForwardedIpConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetIpSetForwardedIpConfig() {
        software.amazon.jsii.Kernel.call(this, "resetIpSetForwardedIpConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigOutputReference getIpSetForwardedIpConfig() {
        return software.amazon.jsii.Kernel.get(this, "ipSetForwardedIpConfig", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getArnInput() {
        return software.amazon.jsii.Kernel.get(this, "arnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig getIpSetForwardedIpConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "ipSetForwardedIpConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "arn", java.util.Objects.requireNonNull(value, "arn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
