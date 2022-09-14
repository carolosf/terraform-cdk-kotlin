package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.815Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationOutputReference")
public class KinesisFirehoseDeliveryStreamRedshiftConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KinesisFirehoseDeliveryStreamRedshiftConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KinesisFirehoseDeliveryStreamRedshiftConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KinesisFirehoseDeliveryStreamRedshiftConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCloudwatchLoggingOptions(final @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions value) {
        software.amazon.jsii.Kernel.call(this, "putCloudwatchLoggingOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putProcessingConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putProcessingConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3BackupConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putS3BackupConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCloudwatchLoggingOptions() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchLoggingOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCopyOptions() {
        software.amazon.jsii.Kernel.call(this, "resetCopyOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDataTableColumns() {
        software.amazon.jsii.Kernel.call(this, "resetDataTableColumns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProcessingConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetProcessingConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRetryDuration() {
        software.amazon.jsii.Kernel.call(this, "resetRetryDuration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3BackupConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetS3BackupConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3BackupMode() {
        software.amazon.jsii.Kernel.call(this, "resetS3BackupMode", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsOutputReference getCloudwatchLoggingOptions() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptions", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationOutputReference getProcessingConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "processingConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationOutputReference getS3BackupConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "s3BackupConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions getCloudwatchLoggingOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterJdbcurlInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterJdbcurlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCopyOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "copyOptionsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDataTableColumnsInput() {
        return software.amazon.jsii.Kernel.get(this, "dataTableColumnsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDataTableNameInput() {
        return software.amazon.jsii.Kernel.get(this, "dataTableNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "passwordInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration getProcessingConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "processingConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRetryDurationInput() {
        return software.amazon.jsii.Kernel.get(this, "retryDurationInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration getS3BackupConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "s3BackupConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3BackupModeInput() {
        return software.amazon.jsii.Kernel.get(this, "s3BackupModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUsernameInput() {
        return software.amazon.jsii.Kernel.get(this, "usernameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterJdbcurl() {
        return software.amazon.jsii.Kernel.get(this, "clusterJdbcurl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterJdbcurl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterJdbcurl", java.util.Objects.requireNonNull(value, "clusterJdbcurl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCopyOptions() {
        return software.amazon.jsii.Kernel.get(this, "copyOptions", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCopyOptions(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "copyOptions", java.util.Objects.requireNonNull(value, "copyOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDataTableColumns() {
        return software.amazon.jsii.Kernel.get(this, "dataTableColumns", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDataTableColumns(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dataTableColumns", java.util.Objects.requireNonNull(value, "dataTableColumns is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDataTableName() {
        return software.amazon.jsii.Kernel.get(this, "dataTableName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDataTableName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dataTableName", java.util.Objects.requireNonNull(value, "dataTableName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPassword() {
        return software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPassword(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "password", java.util.Objects.requireNonNull(value, "password is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRetryDuration() {
        return software.amazon.jsii.Kernel.get(this, "retryDuration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRetryDuration(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "retryDuration", java.util.Objects.requireNonNull(value, "retryDuration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BackupMode() {
        return software.amazon.jsii.Kernel.get(this, "s3BackupMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3BackupMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3BackupMode", java.util.Objects.requireNonNull(value, "s3BackupMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUsername() {
        return software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUsername(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "username", java.util.Objects.requireNonNull(value, "username is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
