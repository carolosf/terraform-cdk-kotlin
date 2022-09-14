package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.804Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.KinesisAnalyticsApplicationInputsSchemaOutputReference")
public class KinesisAnalyticsApplicationInputsSchemaOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KinesisAnalyticsApplicationInputsSchemaOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KinesisAnalyticsApplicationInputsSchemaOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KinesisAnalyticsApplicationInputsSchemaOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putRecordColumns(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putRecordColumns", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRecordFormat(final @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormat value) {
        software.amazon.jsii.Kernel.call(this, "putRecordFormat", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetRecordEncoding() {
        software.amazon.jsii.Kernel.call(this, "resetRecordEncoding", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordColumnsList getRecordColumns() {
        return software.amazon.jsii.Kernel.get(this, "recordColumns", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordColumnsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatOutputReference getRecordFormat() {
        return software.amazon.jsii.Kernel.get(this, "recordFormat", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormatOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRecordColumnsInput() {
        return software.amazon.jsii.Kernel.get(this, "recordColumnsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRecordEncodingInput() {
        return software.amazon.jsii.Kernel.get(this, "recordEncodingInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormat getRecordFormatInput() {
        return software.amazon.jsii.Kernel.get(this, "recordFormatInput", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaRecordFormat.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRecordEncoding() {
        return software.amazon.jsii.Kernel.get(this, "recordEncoding", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRecordEncoding(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "recordEncoding", java.util.Objects.requireNonNull(value, "recordEncoding is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchema getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchema.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchema value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
