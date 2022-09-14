package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.803Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.KinesisAnalyticsApplicationInputsOutputReference")
public class KinesisAnalyticsApplicationInputsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KinesisAnalyticsApplicationInputsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KinesisAnalyticsApplicationInputsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KinesisAnalyticsApplicationInputsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putKinesisFirehose(final @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsKinesisFirehose value) {
        software.amazon.jsii.Kernel.call(this, "putKinesisFirehose", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putKinesisStream(final @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsKinesisStream value) {
        software.amazon.jsii.Kernel.call(this, "putKinesisStream", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putParallelism(final @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsParallelism value) {
        software.amazon.jsii.Kernel.call(this, "putParallelism", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putProcessingConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsProcessingConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putProcessingConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSchema(final @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchema value) {
        software.amazon.jsii.Kernel.call(this, "putSchema", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStartingPositionConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putStartingPositionConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetKinesisFirehose() {
        software.amazon.jsii.Kernel.call(this, "resetKinesisFirehose", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKinesisStream() {
        software.amazon.jsii.Kernel.call(this, "resetKinesisStream", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParallelism() {
        software.amazon.jsii.Kernel.call(this, "resetParallelism", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProcessingConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetProcessingConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStartingPositionConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetStartingPositionConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsKinesisFirehoseOutputReference getKinesisFirehose() {
        return software.amazon.jsii.Kernel.get(this, "kinesisFirehose", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsKinesisFirehoseOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsKinesisStreamOutputReference getKinesisStream() {
        return software.amazon.jsii.Kernel.get(this, "kinesisStream", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsKinesisStreamOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsParallelismOutputReference getParallelism() {
        return software.amazon.jsii.Kernel.get(this, "parallelism", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsParallelismOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsProcessingConfigurationOutputReference getProcessingConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "processingConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsProcessingConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaOutputReference getSchema() {
        return software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchemaOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisAnalyticsApplicationInputsStartingPositionConfigurationList getStartingPositionConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "startingPositionConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsStartingPositionConfigurationList.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getStreamNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "streamNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputsKinesisFirehose getKinesisFirehoseInput() {
        return software.amazon.jsii.Kernel.get(this, "kinesisFirehoseInput", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsKinesisFirehose.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputsKinesisStream getKinesisStreamInput() {
        return software.amazon.jsii.Kernel.get(this, "kinesisStreamInput", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsKinesisStream.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "namePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputsParallelism getParallelismInput() {
        return software.amazon.jsii.Kernel.get(this, "parallelismInput", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsParallelism.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputsProcessingConfiguration getProcessingConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "processingConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsProcessingConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchema getSchemaInput() {
        return software.amazon.jsii.Kernel.get(this, "schemaInput", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputsSchema.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStartingPositionConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "startingPositionConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namePrefix", java.util.Objects.requireNonNull(value, "namePrefix is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputs getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisAnalyticsApplicationInputs.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisAnalyticsApplicationInputs value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
