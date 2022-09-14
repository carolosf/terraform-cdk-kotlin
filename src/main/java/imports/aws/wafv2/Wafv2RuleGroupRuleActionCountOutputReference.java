package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.328Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2RuleGroupRuleActionCountOutputReference")
public class Wafv2RuleGroupRuleActionCountOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Wafv2RuleGroupRuleActionCountOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Wafv2RuleGroupRuleActionCountOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Wafv2RuleGroupRuleActionCountOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCustomRequestHandling(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleActionCountCustomRequestHandling value) {
        software.amazon.jsii.Kernel.call(this, "putCustomRequestHandling", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCustomRequestHandling() {
        software.amazon.jsii.Kernel.call(this, "resetCustomRequestHandling", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleActionCountCustomRequestHandlingOutputReference getCustomRequestHandling() {
        return software.amazon.jsii.Kernel.get(this, "customRequestHandling", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleActionCountCustomRequestHandlingOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleActionCountCustomRequestHandling getCustomRequestHandlingInput() {
        return software.amazon.jsii.Kernel.get(this, "customRequestHandlingInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleActionCountCustomRequestHandling.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleActionCount getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleActionCount.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleActionCount value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
