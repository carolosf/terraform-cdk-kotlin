package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.814Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationOutputReference")
public class KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCloudwatchLoggingOptions(final @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions value) {
        software.amazon.jsii.Kernel.call(this, "putCloudwatchLoggingOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBufferInterval() {
        software.amazon.jsii.Kernel.call(this, "resetBufferInterval", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBufferSize() {
        software.amazon.jsii.Kernel.call(this, "resetBufferSize", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCloudwatchLoggingOptions() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchLoggingOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCompressionFormat() {
        software.amazon.jsii.Kernel.call(this, "resetCompressionFormat", software.amazon.jsii.NativeType.VOID);
    }

    public void resetErrorOutputPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetErrorOutputPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyArn() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptionsOutputReference getCloudwatchLoggingOptions() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptions", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptionsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketArnInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBufferIntervalInput() {
        return software.amazon.jsii.Kernel.get(this, "bufferIntervalInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBufferSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "bufferSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions getCloudwatchLoggingOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCompressionFormatInput() {
        return software.amazon.jsii.Kernel.get(this, "compressionFormatInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getErrorOutputPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "errorOutputPrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArnInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "prefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketArn() {
        return software.amazon.jsii.Kernel.get(this, "bucketArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucketArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucketArn", java.util.Objects.requireNonNull(value, "bucketArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBufferInterval() {
        return software.amazon.jsii.Kernel.get(this, "bufferInterval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBufferInterval(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "bufferInterval", java.util.Objects.requireNonNull(value, "bufferInterval is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBufferSize() {
        return software.amazon.jsii.Kernel.get(this, "bufferSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBufferSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "bufferSize", java.util.Objects.requireNonNull(value, "bufferSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCompressionFormat() {
        return software.amazon.jsii.Kernel.get(this, "compressionFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCompressionFormat(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "compressionFormat", java.util.Objects.requireNonNull(value, "compressionFormat is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getErrorOutputPrefix() {
        return software.amazon.jsii.Kernel.get(this, "errorOutputPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setErrorOutputPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "errorOutputPrefix", java.util.Objects.requireNonNull(value, "errorOutputPrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyArn", java.util.Objects.requireNonNull(value, "kmsKeyArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrefix() {
        return software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "prefix", java.util.Objects.requireNonNull(value, "prefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
