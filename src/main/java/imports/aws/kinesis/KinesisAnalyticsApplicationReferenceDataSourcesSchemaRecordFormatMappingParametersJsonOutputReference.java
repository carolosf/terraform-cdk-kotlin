package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.805Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonOutputReference")
public class KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRecordRowPathInput() {
        return software.amazon.jsii.Kernel.get(this, "recordRowPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRecordRowPath() {
        return software.amazon.jsii.Kernel.get(this, "recordRowPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRecordRowPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "recordRowPath", java.util.Objects.requireNonNull(value, "recordRowPath is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
