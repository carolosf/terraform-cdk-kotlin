package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.813Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#database_name KinesisFirehoseDeliveryStream#database_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#role_arn KinesisFirehoseDeliveryStream#role_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#table_name KinesisFirehoseDeliveryStream#table_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTableName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#catalog_id KinesisFirehoseDeliveryStream#catalog_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCatalogId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#region KinesisFirehoseDeliveryStream#region}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRegion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#version_id KinesisFirehoseDeliveryStream#version_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVersionId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration> {
        java.lang.String databaseName;
        java.lang.String roleArn;
        java.lang.String tableName;
        java.lang.String catalogId;
        java.lang.String region;
        java.lang.String versionId;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration#getDatabaseName}
         * @param databaseName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#database_name KinesisFirehoseDeliveryStream#database_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder databaseName(java.lang.String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration#getRoleArn}
         * @param roleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#role_arn KinesisFirehoseDeliveryStream#role_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration#getTableName}
         * @param tableName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#table_name KinesisFirehoseDeliveryStream#table_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder tableName(java.lang.String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration#getCatalogId}
         * @param catalogId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#catalog_id KinesisFirehoseDeliveryStream#catalog_id}.
         * @return {@code this}
         */
        public Builder catalogId(java.lang.String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration#getRegion}
         * @param region Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#region KinesisFirehoseDeliveryStream#region}.
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration#getVersionId}
         * @param versionId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#version_id KinesisFirehoseDeliveryStream#version_id}.
         * @return {@code this}
         */
        public Builder versionId(java.lang.String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration {
        private final java.lang.String databaseName;
        private final java.lang.String roleArn;
        private final java.lang.String tableName;
        private final java.lang.String catalogId;
        private final java.lang.String region;
        private final java.lang.String versionId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.databaseName = software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tableName = software.amazon.jsii.Kernel.get(this, "tableName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.catalogId = software.amazon.jsii.Kernel.get(this, "catalogId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.versionId = software.amazon.jsii.Kernel.get(this, "versionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.databaseName = java.util.Objects.requireNonNull(builder.databaseName, "databaseName is required");
            this.roleArn = java.util.Objects.requireNonNull(builder.roleArn, "roleArn is required");
            this.tableName = java.util.Objects.requireNonNull(builder.tableName, "tableName is required");
            this.catalogId = builder.catalogId;
            this.region = builder.region;
            this.versionId = builder.versionId;
        }

        @Override
        public final java.lang.String getDatabaseName() {
            return this.databaseName;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getTableName() {
            return this.tableName;
        }

        @Override
        public final java.lang.String getCatalogId() {
            return this.catalogId;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        public final java.lang.String getVersionId() {
            return this.versionId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("databaseName", om.valueToTree(this.getDatabaseName()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("tableName", om.valueToTree(this.getTableName()));
            if (this.getCatalogId() != null) {
                data.set("catalogId", om.valueToTree(this.getCatalogId()));
            }
            if (this.getRegion() != null) {
                data.set("region", om.valueToTree(this.getRegion()));
            }
            if (this.getVersionId() != null) {
                data.set("versionId", om.valueToTree(this.getVersionId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration.Jsii$Proxy) o;

            if (!databaseName.equals(that.databaseName)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            if (!tableName.equals(that.tableName)) return false;
            if (this.catalogId != null ? !this.catalogId.equals(that.catalogId) : that.catalogId != null) return false;
            if (this.region != null ? !this.region.equals(that.region) : that.region != null) return false;
            return this.versionId != null ? this.versionId.equals(that.versionId) : that.versionId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.databaseName.hashCode();
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.tableName.hashCode());
            result = 31 * result + (this.catalogId != null ? this.catalogId.hashCode() : 0);
            result = 31 * result + (this.region != null ? this.region.hashCode() : 0);
            result = 31 * result + (this.versionId != null ? this.versionId.hashCode() : 0);
            return result;
        }
    }
}
