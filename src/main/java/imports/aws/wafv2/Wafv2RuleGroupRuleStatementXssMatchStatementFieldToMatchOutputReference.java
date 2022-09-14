package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.340Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchOutputReference")
public class Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAllQueryArguments(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArguments value) {
        software.amazon.jsii.Kernel.call(this, "putAllQueryArguments", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putBody(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchBody value) {
        software.amazon.jsii.Kernel.call(this, "putBody", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMethod(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchMethod value) {
        software.amazon.jsii.Kernel.call(this, "putMethod", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putQueryString(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchQueryString value) {
        software.amazon.jsii.Kernel.call(this, "putQueryString", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSingleHeader(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleHeader value) {
        software.amazon.jsii.Kernel.call(this, "putSingleHeader", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSingleQueryArgument(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleQueryArgument value) {
        software.amazon.jsii.Kernel.call(this, "putSingleQueryArgument", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUriPath(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchUriPath value) {
        software.amazon.jsii.Kernel.call(this, "putUriPath", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAllQueryArguments() {
        software.amazon.jsii.Kernel.call(this, "resetAllQueryArguments", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBody() {
        software.amazon.jsii.Kernel.call(this, "resetBody", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMethod() {
        software.amazon.jsii.Kernel.call(this, "resetMethod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQueryString() {
        software.amazon.jsii.Kernel.call(this, "resetQueryString", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSingleHeader() {
        software.amazon.jsii.Kernel.call(this, "resetSingleHeader", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSingleQueryArgument() {
        software.amazon.jsii.Kernel.call(this, "resetSingleQueryArgument", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUriPath() {
        software.amazon.jsii.Kernel.call(this, "resetUriPath", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsOutputReference getAllQueryArguments() {
        return software.amazon.jsii.Kernel.get(this, "allQueryArguments", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchBodyOutputReference getBody() {
        return software.amazon.jsii.Kernel.get(this, "body", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchBodyOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchMethodOutputReference getMethod() {
        return software.amazon.jsii.Kernel.get(this, "method", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchMethodOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchQueryStringOutputReference getQueryString() {
        return software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchQueryStringOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleHeaderOutputReference getSingleHeader() {
        return software.amazon.jsii.Kernel.get(this, "singleHeader", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleHeaderOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleQueryArgumentOutputReference getSingleQueryArgument() {
        return software.amazon.jsii.Kernel.get(this, "singleQueryArgument", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleQueryArgumentOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchUriPathOutputReference getUriPath() {
        return software.amazon.jsii.Kernel.get(this, "uriPath", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchUriPathOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArguments getAllQueryArgumentsInput() {
        return software.amazon.jsii.Kernel.get(this, "allQueryArgumentsInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArguments.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchBody getBodyInput() {
        return software.amazon.jsii.Kernel.get(this, "bodyInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchBody.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchMethod getMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "methodInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchMethod.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchQueryString getQueryStringInput() {
        return software.amazon.jsii.Kernel.get(this, "queryStringInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchQueryString.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleHeader getSingleHeaderInput() {
        return software.amazon.jsii.Kernel.get(this, "singleHeaderInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleHeader.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleQueryArgument getSingleQueryArgumentInput() {
        return software.amazon.jsii.Kernel.get(this, "singleQueryArgumentInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleQueryArgument.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchUriPath getUriPathInput() {
        return software.amazon.jsii.Kernel.get(this, "uriPathInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatchUriPath.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatch getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatch.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatementFieldToMatch value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
