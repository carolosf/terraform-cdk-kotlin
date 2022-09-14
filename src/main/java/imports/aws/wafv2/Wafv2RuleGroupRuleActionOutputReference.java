package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.328Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2RuleGroupRuleActionOutputReference")
public class Wafv2RuleGroupRuleActionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Wafv2RuleGroupRuleActionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Wafv2RuleGroupRuleActionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Wafv2RuleGroupRuleActionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAllow(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleActionAllow value) {
        software.amazon.jsii.Kernel.call(this, "putAllow", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putBlock(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleActionBlock value) {
        software.amazon.jsii.Kernel.call(this, "putBlock", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCount(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleActionCount value) {
        software.amazon.jsii.Kernel.call(this, "putCount", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAllow() {
        software.amazon.jsii.Kernel.call(this, "resetAllow", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBlock() {
        software.amazon.jsii.Kernel.call(this, "resetBlock", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCount() {
        software.amazon.jsii.Kernel.call(this, "resetCount", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleActionAllowOutputReference getAllow() {
        return software.amazon.jsii.Kernel.get(this, "allow", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleActionAllowOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleActionBlockOutputReference getBlock() {
        return software.amazon.jsii.Kernel.get(this, "block", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleActionBlockOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleActionCountOutputReference getCount() {
        return software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleActionCountOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleActionAllow getAllowInput() {
        return software.amazon.jsii.Kernel.get(this, "allowInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleActionAllow.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleActionBlock getBlockInput() {
        return software.amazon.jsii.Kernel.get(this, "blockInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleActionBlock.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleActionCount getCountInput() {
        return software.amazon.jsii.Kernel.get(this, "countInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleActionCount.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleAction getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleAction.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleAction value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
