package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.484Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementOutputReference")
public class Wafv2WebAclRuleStatementRateBasedStatementOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Wafv2WebAclRuleStatementRateBasedStatementOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Wafv2WebAclRuleStatementRateBasedStatementOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Wafv2WebAclRuleStatementRateBasedStatementOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putForwardedIpConfig(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementForwardedIpConfig value) {
        software.amazon.jsii.Kernel.call(this, "putForwardedIpConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putScopeDownStatement(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement value) {
        software.amazon.jsii.Kernel.call(this, "putScopeDownStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAggregateKeyType() {
        software.amazon.jsii.Kernel.call(this, "resetAggregateKeyType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForwardedIpConfig() {
        software.amazon.jsii.Kernel.call(this, "resetForwardedIpConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetScopeDownStatement() {
        software.amazon.jsii.Kernel.call(this, "resetScopeDownStatement", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementForwardedIpConfigOutputReference getForwardedIpConfig() {
        return software.amazon.jsii.Kernel.get(this, "forwardedIpConfig", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementForwardedIpConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementOutputReference getScopeDownStatement() {
        return software.amazon.jsii.Kernel.get(this, "scopeDownStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAggregateKeyTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "aggregateKeyTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementForwardedIpConfig getForwardedIpConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "forwardedIpConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementForwardedIpConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "limitInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement getScopeDownStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "scopeDownStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAggregateKeyType() {
        return software.amazon.jsii.Kernel.get(this, "aggregateKeyType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAggregateKeyType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "aggregateKeyType", java.util.Objects.requireNonNull(value, "aggregateKeyType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getLimit() {
        return software.amazon.jsii.Kernel.get(this, "limit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setLimit(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "limit", java.util.Objects.requireNonNull(value, "limit is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatement getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatement.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatement value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
