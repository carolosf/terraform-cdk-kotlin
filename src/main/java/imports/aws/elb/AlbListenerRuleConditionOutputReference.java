package imports.aws.elb;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.647Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elb.AlbListenerRuleConditionOutputReference")
public class AlbListenerRuleConditionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AlbListenerRuleConditionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AlbListenerRuleConditionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public AlbListenerRuleConditionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putHostHeader(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleConditionHostHeader value) {
        software.amazon.jsii.Kernel.call(this, "putHostHeader", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHttpHeader(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleConditionHttpHeader value) {
        software.amazon.jsii.Kernel.call(this, "putHttpHeader", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHttpRequestMethod(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleConditionHttpRequestMethod value) {
        software.amazon.jsii.Kernel.call(this, "putHttpRequestMethod", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPathPattern(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleConditionPathPattern value) {
        software.amazon.jsii.Kernel.call(this, "putPathPattern", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putQueryString(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putQueryString", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSourceIp(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleConditionSourceIp value) {
        software.amazon.jsii.Kernel.call(this, "putSourceIp", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetHostHeader() {
        software.amazon.jsii.Kernel.call(this, "resetHostHeader", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpHeader() {
        software.amazon.jsii.Kernel.call(this, "resetHttpHeader", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpRequestMethod() {
        software.amazon.jsii.Kernel.call(this, "resetHttpRequestMethod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPathPattern() {
        software.amazon.jsii.Kernel.call(this, "resetPathPattern", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQueryString() {
        software.amazon.jsii.Kernel.call(this, "resetQueryString", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourceIp() {
        software.amazon.jsii.Kernel.call(this, "resetSourceIp", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleConditionHostHeaderOutputReference getHostHeader() {
        return software.amazon.jsii.Kernel.get(this, "hostHeader", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleConditionHostHeaderOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleConditionHttpHeaderOutputReference getHttpHeader() {
        return software.amazon.jsii.Kernel.get(this, "httpHeader", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleConditionHttpHeaderOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleConditionHttpRequestMethodOutputReference getHttpRequestMethod() {
        return software.amazon.jsii.Kernel.get(this, "httpRequestMethod", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleConditionHttpRequestMethodOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleConditionPathPatternOutputReference getPathPattern() {
        return software.amazon.jsii.Kernel.get(this, "pathPattern", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleConditionPathPatternOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleConditionQueryStringList getQueryString() {
        return software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleConditionQueryStringList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleConditionSourceIpOutputReference getSourceIp() {
        return software.amazon.jsii.Kernel.get(this, "sourceIp", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleConditionSourceIpOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerRuleConditionHostHeader getHostHeaderInput() {
        return software.amazon.jsii.Kernel.get(this, "hostHeaderInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleConditionHostHeader.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerRuleConditionHttpHeader getHttpHeaderInput() {
        return software.amazon.jsii.Kernel.get(this, "httpHeaderInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleConditionHttpHeader.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerRuleConditionHttpRequestMethod getHttpRequestMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "httpRequestMethodInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleConditionHttpRequestMethod.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerRuleConditionPathPattern getPathPatternInput() {
        return software.amazon.jsii.Kernel.get(this, "pathPatternInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleConditionPathPattern.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getQueryStringInput() {
        return software.amazon.jsii.Kernel.get(this, "queryStringInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerRuleConditionSourceIp getSourceIpInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceIpInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleConditionSourceIp.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerRuleCondition value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
