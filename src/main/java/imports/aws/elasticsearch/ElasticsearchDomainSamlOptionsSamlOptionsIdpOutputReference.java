package imports.aws.elasticsearch;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.637Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elasticsearch.ElasticsearchDomainSamlOptionsSamlOptionsIdpOutputReference")
public class ElasticsearchDomainSamlOptionsSamlOptionsIdpOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ElasticsearchDomainSamlOptionsSamlOptionsIdpOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ElasticsearchDomainSamlOptionsSamlOptionsIdpOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ElasticsearchDomainSamlOptionsSamlOptionsIdpOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEntityIdInput() {
        return software.amazon.jsii.Kernel.get(this, "entityIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMetadataContentInput() {
        return software.amazon.jsii.Kernel.get(this, "metadataContentInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEntityId() {
        return software.amazon.jsii.Kernel.get(this, "entityId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEntityId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "entityId", java.util.Objects.requireNonNull(value, "entityId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMetadataContent() {
        return software.amazon.jsii.Kernel.get(this, "metadataContent", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMetadataContent(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "metadataContent", java.util.Objects.requireNonNull(value, "metadataContent is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elasticsearch.ElasticsearchDomainSamlOptionsSamlOptionsIdp getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.elasticsearch.ElasticsearchDomainSamlOptionsSamlOptionsIdp.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.elasticsearch.ElasticsearchDomainSamlOptionsSamlOptionsIdp value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
