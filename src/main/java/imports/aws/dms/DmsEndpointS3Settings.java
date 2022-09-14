package imports.aws.dms;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.469Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dms.DmsEndpointS3Settings")
@software.amazon.jsii.Jsii.Proxy(DmsEndpointS3Settings.Jsii$Proxy.class)
public interface DmsEndpointS3Settings extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#bucket_folder DmsEndpoint#bucket_folder}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucketFolder() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#bucket_name DmsEndpoint#bucket_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucketName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#compression_type DmsEndpoint#compression_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCompressionType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#csv_delimiter DmsEndpoint#csv_delimiter}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCsvDelimiter() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#csv_row_delimiter DmsEndpoint#csv_row_delimiter}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCsvRowDelimiter() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#data_format DmsEndpoint#data_format}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDataFormat() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#date_partition_enabled DmsEndpoint#date_partition_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDatePartitionEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#encryption_mode DmsEndpoint#encryption_mode}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEncryptionMode() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#external_table_definition DmsEndpoint#external_table_definition}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExternalTableDefinition() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#parquet_timestamp_in_millisecond DmsEndpoint#parquet_timestamp_in_millisecond}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getParquetTimestampInMillisecond() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#parquet_version DmsEndpoint#parquet_version}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getParquetVersion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#server_side_encryption_kms_key_id DmsEndpoint#server_side_encryption_kms_key_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getServerSideEncryptionKmsKeyId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#service_access_role_arn DmsEndpoint#service_access_role_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getServiceAccessRoleArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DmsEndpointS3Settings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DmsEndpointS3Settings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DmsEndpointS3Settings> {
        java.lang.String bucketFolder;
        java.lang.String bucketName;
        java.lang.String compressionType;
        java.lang.String csvDelimiter;
        java.lang.String csvRowDelimiter;
        java.lang.String dataFormat;
        java.lang.Object datePartitionEnabled;
        java.lang.String encryptionMode;
        java.lang.String externalTableDefinition;
        java.lang.Object parquetTimestampInMillisecond;
        java.lang.String parquetVersion;
        java.lang.String serverSideEncryptionKmsKeyId;
        java.lang.String serviceAccessRoleArn;

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getBucketFolder}
         * @param bucketFolder Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#bucket_folder DmsEndpoint#bucket_folder}.
         * @return {@code this}
         */
        public Builder bucketFolder(java.lang.String bucketFolder) {
            this.bucketFolder = bucketFolder;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getBucketName}
         * @param bucketName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#bucket_name DmsEndpoint#bucket_name}.
         * @return {@code this}
         */
        public Builder bucketName(java.lang.String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getCompressionType}
         * @param compressionType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#compression_type DmsEndpoint#compression_type}.
         * @return {@code this}
         */
        public Builder compressionType(java.lang.String compressionType) {
            this.compressionType = compressionType;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getCsvDelimiter}
         * @param csvDelimiter Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#csv_delimiter DmsEndpoint#csv_delimiter}.
         * @return {@code this}
         */
        public Builder csvDelimiter(java.lang.String csvDelimiter) {
            this.csvDelimiter = csvDelimiter;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getCsvRowDelimiter}
         * @param csvRowDelimiter Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#csv_row_delimiter DmsEndpoint#csv_row_delimiter}.
         * @return {@code this}
         */
        public Builder csvRowDelimiter(java.lang.String csvRowDelimiter) {
            this.csvRowDelimiter = csvRowDelimiter;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getDataFormat}
         * @param dataFormat Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#data_format DmsEndpoint#data_format}.
         * @return {@code this}
         */
        public Builder dataFormat(java.lang.String dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getDatePartitionEnabled}
         * @param datePartitionEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#date_partition_enabled DmsEndpoint#date_partition_enabled}.
         * @return {@code this}
         */
        public Builder datePartitionEnabled(java.lang.Boolean datePartitionEnabled) {
            this.datePartitionEnabled = datePartitionEnabled;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getDatePartitionEnabled}
         * @param datePartitionEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#date_partition_enabled DmsEndpoint#date_partition_enabled}.
         * @return {@code this}
         */
        public Builder datePartitionEnabled(com.hashicorp.cdktf.IResolvable datePartitionEnabled) {
            this.datePartitionEnabled = datePartitionEnabled;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getEncryptionMode}
         * @param encryptionMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#encryption_mode DmsEndpoint#encryption_mode}.
         * @return {@code this}
         */
        public Builder encryptionMode(java.lang.String encryptionMode) {
            this.encryptionMode = encryptionMode;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getExternalTableDefinition}
         * @param externalTableDefinition Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#external_table_definition DmsEndpoint#external_table_definition}.
         * @return {@code this}
         */
        public Builder externalTableDefinition(java.lang.String externalTableDefinition) {
            this.externalTableDefinition = externalTableDefinition;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getParquetTimestampInMillisecond}
         * @param parquetTimestampInMillisecond Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#parquet_timestamp_in_millisecond DmsEndpoint#parquet_timestamp_in_millisecond}.
         * @return {@code this}
         */
        public Builder parquetTimestampInMillisecond(java.lang.Boolean parquetTimestampInMillisecond) {
            this.parquetTimestampInMillisecond = parquetTimestampInMillisecond;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getParquetTimestampInMillisecond}
         * @param parquetTimestampInMillisecond Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#parquet_timestamp_in_millisecond DmsEndpoint#parquet_timestamp_in_millisecond}.
         * @return {@code this}
         */
        public Builder parquetTimestampInMillisecond(com.hashicorp.cdktf.IResolvable parquetTimestampInMillisecond) {
            this.parquetTimestampInMillisecond = parquetTimestampInMillisecond;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getParquetVersion}
         * @param parquetVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#parquet_version DmsEndpoint#parquet_version}.
         * @return {@code this}
         */
        public Builder parquetVersion(java.lang.String parquetVersion) {
            this.parquetVersion = parquetVersion;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getServerSideEncryptionKmsKeyId}
         * @param serverSideEncryptionKmsKeyId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#server_side_encryption_kms_key_id DmsEndpoint#server_side_encryption_kms_key_id}.
         * @return {@code this}
         */
        public Builder serverSideEncryptionKmsKeyId(java.lang.String serverSideEncryptionKmsKeyId) {
            this.serverSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointS3Settings#getServiceAccessRoleArn}
         * @param serviceAccessRoleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#service_access_role_arn DmsEndpoint#service_access_role_arn}.
         * @return {@code this}
         */
        public Builder serviceAccessRoleArn(java.lang.String serviceAccessRoleArn) {
            this.serviceAccessRoleArn = serviceAccessRoleArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DmsEndpointS3Settings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DmsEndpointS3Settings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DmsEndpointS3Settings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DmsEndpointS3Settings {
        private final java.lang.String bucketFolder;
        private final java.lang.String bucketName;
        private final java.lang.String compressionType;
        private final java.lang.String csvDelimiter;
        private final java.lang.String csvRowDelimiter;
        private final java.lang.String dataFormat;
        private final java.lang.Object datePartitionEnabled;
        private final java.lang.String encryptionMode;
        private final java.lang.String externalTableDefinition;
        private final java.lang.Object parquetTimestampInMillisecond;
        private final java.lang.String parquetVersion;
        private final java.lang.String serverSideEncryptionKmsKeyId;
        private final java.lang.String serviceAccessRoleArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketFolder = software.amazon.jsii.Kernel.get(this, "bucketFolder", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketName = software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.compressionType = software.amazon.jsii.Kernel.get(this, "compressionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.csvDelimiter = software.amazon.jsii.Kernel.get(this, "csvDelimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.csvRowDelimiter = software.amazon.jsii.Kernel.get(this, "csvRowDelimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dataFormat = software.amazon.jsii.Kernel.get(this, "dataFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.datePartitionEnabled = software.amazon.jsii.Kernel.get(this, "datePartitionEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.encryptionMode = software.amazon.jsii.Kernel.get(this, "encryptionMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.externalTableDefinition = software.amazon.jsii.Kernel.get(this, "externalTableDefinition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parquetTimestampInMillisecond = software.amazon.jsii.Kernel.get(this, "parquetTimestampInMillisecond", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.parquetVersion = software.amazon.jsii.Kernel.get(this, "parquetVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serverSideEncryptionKmsKeyId = software.amazon.jsii.Kernel.get(this, "serverSideEncryptionKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceAccessRoleArn = software.amazon.jsii.Kernel.get(this, "serviceAccessRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketFolder = builder.bucketFolder;
            this.bucketName = builder.bucketName;
            this.compressionType = builder.compressionType;
            this.csvDelimiter = builder.csvDelimiter;
            this.csvRowDelimiter = builder.csvRowDelimiter;
            this.dataFormat = builder.dataFormat;
            this.datePartitionEnabled = builder.datePartitionEnabled;
            this.encryptionMode = builder.encryptionMode;
            this.externalTableDefinition = builder.externalTableDefinition;
            this.parquetTimestampInMillisecond = builder.parquetTimestampInMillisecond;
            this.parquetVersion = builder.parquetVersion;
            this.serverSideEncryptionKmsKeyId = builder.serverSideEncryptionKmsKeyId;
            this.serviceAccessRoleArn = builder.serviceAccessRoleArn;
        }

        @Override
        public final java.lang.String getBucketFolder() {
            return this.bucketFolder;
        }

        @Override
        public final java.lang.String getBucketName() {
            return this.bucketName;
        }

        @Override
        public final java.lang.String getCompressionType() {
            return this.compressionType;
        }

        @Override
        public final java.lang.String getCsvDelimiter() {
            return this.csvDelimiter;
        }

        @Override
        public final java.lang.String getCsvRowDelimiter() {
            return this.csvRowDelimiter;
        }

        @Override
        public final java.lang.String getDataFormat() {
            return this.dataFormat;
        }

        @Override
        public final java.lang.Object getDatePartitionEnabled() {
            return this.datePartitionEnabled;
        }

        @Override
        public final java.lang.String getEncryptionMode() {
            return this.encryptionMode;
        }

        @Override
        public final java.lang.String getExternalTableDefinition() {
            return this.externalTableDefinition;
        }

        @Override
        public final java.lang.Object getParquetTimestampInMillisecond() {
            return this.parquetTimestampInMillisecond;
        }

        @Override
        public final java.lang.String getParquetVersion() {
            return this.parquetVersion;
        }

        @Override
        public final java.lang.String getServerSideEncryptionKmsKeyId() {
            return this.serverSideEncryptionKmsKeyId;
        }

        @Override
        public final java.lang.String getServiceAccessRoleArn() {
            return this.serviceAccessRoleArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBucketFolder() != null) {
                data.set("bucketFolder", om.valueToTree(this.getBucketFolder()));
            }
            if (this.getBucketName() != null) {
                data.set("bucketName", om.valueToTree(this.getBucketName()));
            }
            if (this.getCompressionType() != null) {
                data.set("compressionType", om.valueToTree(this.getCompressionType()));
            }
            if (this.getCsvDelimiter() != null) {
                data.set("csvDelimiter", om.valueToTree(this.getCsvDelimiter()));
            }
            if (this.getCsvRowDelimiter() != null) {
                data.set("csvRowDelimiter", om.valueToTree(this.getCsvRowDelimiter()));
            }
            if (this.getDataFormat() != null) {
                data.set("dataFormat", om.valueToTree(this.getDataFormat()));
            }
            if (this.getDatePartitionEnabled() != null) {
                data.set("datePartitionEnabled", om.valueToTree(this.getDatePartitionEnabled()));
            }
            if (this.getEncryptionMode() != null) {
                data.set("encryptionMode", om.valueToTree(this.getEncryptionMode()));
            }
            if (this.getExternalTableDefinition() != null) {
                data.set("externalTableDefinition", om.valueToTree(this.getExternalTableDefinition()));
            }
            if (this.getParquetTimestampInMillisecond() != null) {
                data.set("parquetTimestampInMillisecond", om.valueToTree(this.getParquetTimestampInMillisecond()));
            }
            if (this.getParquetVersion() != null) {
                data.set("parquetVersion", om.valueToTree(this.getParquetVersion()));
            }
            if (this.getServerSideEncryptionKmsKeyId() != null) {
                data.set("serverSideEncryptionKmsKeyId", om.valueToTree(this.getServerSideEncryptionKmsKeyId()));
            }
            if (this.getServiceAccessRoleArn() != null) {
                data.set("serviceAccessRoleArn", om.valueToTree(this.getServiceAccessRoleArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.dms.DmsEndpointS3Settings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DmsEndpointS3Settings.Jsii$Proxy that = (DmsEndpointS3Settings.Jsii$Proxy) o;

            if (this.bucketFolder != null ? !this.bucketFolder.equals(that.bucketFolder) : that.bucketFolder != null) return false;
            if (this.bucketName != null ? !this.bucketName.equals(that.bucketName) : that.bucketName != null) return false;
            if (this.compressionType != null ? !this.compressionType.equals(that.compressionType) : that.compressionType != null) return false;
            if (this.csvDelimiter != null ? !this.csvDelimiter.equals(that.csvDelimiter) : that.csvDelimiter != null) return false;
            if (this.csvRowDelimiter != null ? !this.csvRowDelimiter.equals(that.csvRowDelimiter) : that.csvRowDelimiter != null) return false;
            if (this.dataFormat != null ? !this.dataFormat.equals(that.dataFormat) : that.dataFormat != null) return false;
            if (this.datePartitionEnabled != null ? !this.datePartitionEnabled.equals(that.datePartitionEnabled) : that.datePartitionEnabled != null) return false;
            if (this.encryptionMode != null ? !this.encryptionMode.equals(that.encryptionMode) : that.encryptionMode != null) return false;
            if (this.externalTableDefinition != null ? !this.externalTableDefinition.equals(that.externalTableDefinition) : that.externalTableDefinition != null) return false;
            if (this.parquetTimestampInMillisecond != null ? !this.parquetTimestampInMillisecond.equals(that.parquetTimestampInMillisecond) : that.parquetTimestampInMillisecond != null) return false;
            if (this.parquetVersion != null ? !this.parquetVersion.equals(that.parquetVersion) : that.parquetVersion != null) return false;
            if (this.serverSideEncryptionKmsKeyId != null ? !this.serverSideEncryptionKmsKeyId.equals(that.serverSideEncryptionKmsKeyId) : that.serverSideEncryptionKmsKeyId != null) return false;
            return this.serviceAccessRoleArn != null ? this.serviceAccessRoleArn.equals(that.serviceAccessRoleArn) : that.serviceAccessRoleArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketFolder != null ? this.bucketFolder.hashCode() : 0;
            result = 31 * result + (this.bucketName != null ? this.bucketName.hashCode() : 0);
            result = 31 * result + (this.compressionType != null ? this.compressionType.hashCode() : 0);
            result = 31 * result + (this.csvDelimiter != null ? this.csvDelimiter.hashCode() : 0);
            result = 31 * result + (this.csvRowDelimiter != null ? this.csvRowDelimiter.hashCode() : 0);
            result = 31 * result + (this.dataFormat != null ? this.dataFormat.hashCode() : 0);
            result = 31 * result + (this.datePartitionEnabled != null ? this.datePartitionEnabled.hashCode() : 0);
            result = 31 * result + (this.encryptionMode != null ? this.encryptionMode.hashCode() : 0);
            result = 31 * result + (this.externalTableDefinition != null ? this.externalTableDefinition.hashCode() : 0);
            result = 31 * result + (this.parquetTimestampInMillisecond != null ? this.parquetTimestampInMillisecond.hashCode() : 0);
            result = 31 * result + (this.parquetVersion != null ? this.parquetVersion.hashCode() : 0);
            result = 31 * result + (this.serverSideEncryptionKmsKeyId != null ? this.serverSideEncryptionKmsKeyId.hashCode() : 0);
            result = 31 * result + (this.serviceAccessRoleArn != null ? this.serviceAccessRoleArn.hashCode() : 0);
            return result;
        }
    }
}
