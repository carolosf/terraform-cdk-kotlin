package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.345Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsOutputReference")
public class Wafv2WebAclLoggingConfigurationRedactedFieldsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Wafv2WebAclLoggingConfigurationRedactedFieldsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Wafv2WebAclLoggingConfigurationRedactedFieldsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public Wafv2WebAclLoggingConfigurationRedactedFieldsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putAllQueryArguments(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsAllQueryArguments value) {
        software.amazon.jsii.Kernel.call(this, "putAllQueryArguments", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putBody(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsBody value) {
        software.amazon.jsii.Kernel.call(this, "putBody", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMethod(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsMethod value) {
        software.amazon.jsii.Kernel.call(this, "putMethod", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putQueryString(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsQueryString value) {
        software.amazon.jsii.Kernel.call(this, "putQueryString", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSingleHeader(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleHeader value) {
        software.amazon.jsii.Kernel.call(this, "putSingleHeader", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSingleQueryArgument(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleQueryArgument value) {
        software.amazon.jsii.Kernel.call(this, "putSingleQueryArgument", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUriPath(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsUriPath value) {
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

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsAllQueryArgumentsOutputReference getAllQueryArguments() {
        return software.amazon.jsii.Kernel.get(this, "allQueryArguments", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsAllQueryArgumentsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsBodyOutputReference getBody() {
        return software.amazon.jsii.Kernel.get(this, "body", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsBodyOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsMethodOutputReference getMethod() {
        return software.amazon.jsii.Kernel.get(this, "method", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsMethodOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsQueryStringOutputReference getQueryString() {
        return software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsQueryStringOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleHeaderOutputReference getSingleHeader() {
        return software.amazon.jsii.Kernel.get(this, "singleHeader", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleHeaderOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleQueryArgumentOutputReference getSingleQueryArgument() {
        return software.amazon.jsii.Kernel.get(this, "singleQueryArgument", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleQueryArgumentOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsUriPathOutputReference getUriPath() {
        return software.amazon.jsii.Kernel.get(this, "uriPath", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsUriPathOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsAllQueryArguments getAllQueryArgumentsInput() {
        return software.amazon.jsii.Kernel.get(this, "allQueryArgumentsInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsAllQueryArguments.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsBody getBodyInput() {
        return software.amazon.jsii.Kernel.get(this, "bodyInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsBody.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsMethod getMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "methodInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsMethod.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsQueryString getQueryStringInput() {
        return software.amazon.jsii.Kernel.get(this, "queryStringInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsQueryString.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleHeader getSingleHeaderInput() {
        return software.amazon.jsii.Kernel.get(this, "singleHeaderInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleHeader.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleQueryArgument getSingleQueryArgumentInput() {
        return software.amazon.jsii.Kernel.get(this, "singleQueryArgumentInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleQueryArgument.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsUriPath getUriPathInput() {
        return software.amazon.jsii.Kernel.get(this, "uriPathInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsUriPath.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFields value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
