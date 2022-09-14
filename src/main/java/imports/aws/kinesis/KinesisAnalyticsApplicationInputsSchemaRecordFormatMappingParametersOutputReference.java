package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.804Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersOutputReference")
public class KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCsv(final @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv value) {
        software.amazon.jsii.Kernel.call(this, "putCsv", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putJson(final @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson value) {
        software.amazon.jsii.Kernel.call(this, "putJson", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCsv() {
        software.amazon.jsii.Kernel.call(this, "resetCsv", software.amazon.jsii.NativeType.VOID);
    }

    public void resetJson() {
        software.amazon.jsii.Kernel.call(this, "resetJson", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvOutputReference getCsv() {
        return software.amazon.jsii.Kernel.get(this, "csv", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonOutputReference getJson() {
        return software.amazon.jsii.Kernel.get(this, "json", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv getCsvInput() {
        return software.amazon.jsii.Kernel.get(this, "csvInput", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson getJsonInput() {
        return software.amazon.jsii.Kernel.get(this, "jsonInput", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatMappingParameters value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
