package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.584Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathOutputReference")
public class Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
