package imports.aws.dms;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.470Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dms.DmsEndpointS3SettingsOutputReference")
public class DmsEndpointS3SettingsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DmsEndpointS3SettingsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DmsEndpointS3SettingsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DmsEndpointS3SettingsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetBucketFolder() {
        software.amazon.jsii.Kernel.call(this, "resetBucketFolder", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBucketName() {
        software.amazon.jsii.Kernel.call(this, "resetBucketName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCompressionType() {
        software.amazon.jsii.Kernel.call(this, "resetCompressionType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCsvDelimiter() {
        software.amazon.jsii.Kernel.call(this, "resetCsvDelimiter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCsvRowDelimiter() {
        software.amazon.jsii.Kernel.call(this, "resetCsvRowDelimiter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDataFormat() {
        software.amazon.jsii.Kernel.call(this, "resetDataFormat", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDatePartitionEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetDatePartitionEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncryptionMode() {
        software.amazon.jsii.Kernel.call(this, "resetEncryptionMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExternalTableDefinition() {
        software.amazon.jsii.Kernel.call(this, "resetExternalTableDefinition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParquetTimestampInMillisecond() {
        software.amazon.jsii.Kernel.call(this, "resetParquetTimestampInMillisecond", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParquetVersion() {
        software.amazon.jsii.Kernel.call(this, "resetParquetVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerSideEncryptionKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetServerSideEncryptionKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceAccessRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetServiceAccessRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketFolderInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketFolderInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketNameInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCompressionTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "compressionTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCsvDelimiterInput() {
        return software.amazon.jsii.Kernel.get(this, "csvDelimiterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCsvRowDelimiterInput() {
        return software.amazon.jsii.Kernel.get(this, "csvRowDelimiterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDataFormatInput() {
        return software.amazon.jsii.Kernel.get(this, "dataFormatInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDatePartitionEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "datePartitionEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEncryptionModeInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptionModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExternalTableDefinitionInput() {
        return software.amazon.jsii.Kernel.get(this, "externalTableDefinitionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getParquetTimestampInMillisecondInput() {
        return software.amazon.jsii.Kernel.get(this, "parquetTimestampInMillisecondInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getParquetVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "parquetVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServerSideEncryptionKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "serverSideEncryptionKmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceAccessRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccessRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketFolder() {
        return software.amazon.jsii.Kernel.get(this, "bucketFolder", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucketFolder(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucketFolder", java.util.Objects.requireNonNull(value, "bucketFolder is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketName() {
        return software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucketName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucketName", java.util.Objects.requireNonNull(value, "bucketName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCompressionType() {
        return software.amazon.jsii.Kernel.get(this, "compressionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCompressionType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "compressionType", java.util.Objects.requireNonNull(value, "compressionType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCsvDelimiter() {
        return software.amazon.jsii.Kernel.get(this, "csvDelimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCsvDelimiter(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "csvDelimiter", java.util.Objects.requireNonNull(value, "csvDelimiter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCsvRowDelimiter() {
        return software.amazon.jsii.Kernel.get(this, "csvRowDelimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCsvRowDelimiter(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "csvRowDelimiter", java.util.Objects.requireNonNull(value, "csvRowDelimiter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDataFormat() {
        return software.amazon.jsii.Kernel.get(this, "dataFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDataFormat(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dataFormat", java.util.Objects.requireNonNull(value, "dataFormat is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDatePartitionEnabled() {
        return software.amazon.jsii.Kernel.get(this, "datePartitionEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDatePartitionEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "datePartitionEnabled", java.util.Objects.requireNonNull(value, "datePartitionEnabled is required"));
    }

    public void setDatePartitionEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "datePartitionEnabled", java.util.Objects.requireNonNull(value, "datePartitionEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEncryptionMode() {
        return software.amazon.jsii.Kernel.get(this, "encryptionMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEncryptionMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "encryptionMode", java.util.Objects.requireNonNull(value, "encryptionMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExternalTableDefinition() {
        return software.amazon.jsii.Kernel.get(this, "externalTableDefinition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExternalTableDefinition(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "externalTableDefinition", java.util.Objects.requireNonNull(value, "externalTableDefinition is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getParquetTimestampInMillisecond() {
        return software.amazon.jsii.Kernel.get(this, "parquetTimestampInMillisecond", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setParquetTimestampInMillisecond(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "parquetTimestampInMillisecond", java.util.Objects.requireNonNull(value, "parquetTimestampInMillisecond is required"));
    }

    public void setParquetTimestampInMillisecond(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "parquetTimestampInMillisecond", java.util.Objects.requireNonNull(value, "parquetTimestampInMillisecond is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getParquetVersion() {
        return software.amazon.jsii.Kernel.get(this, "parquetVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setParquetVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "parquetVersion", java.util.Objects.requireNonNull(value, "parquetVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServerSideEncryptionKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "serverSideEncryptionKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServerSideEncryptionKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serverSideEncryptionKmsKeyId", java.util.Objects.requireNonNull(value, "serverSideEncryptionKmsKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceAccessRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccessRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceAccessRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceAccessRoleArn", java.util.Objects.requireNonNull(value, "serviceAccessRoleArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dms.DmsEndpointS3Settings getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointS3Settings.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.dms.DmsEndpointS3Settings value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
