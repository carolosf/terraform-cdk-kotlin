package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.816Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfiguration")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamSplunkConfiguration.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamSplunkConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#hec_endpoint KinesisFirehoseDeliveryStream#hec_endpoint}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getHecEndpoint();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#hec_token KinesisFirehoseDeliveryStream#hec_token}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getHecToken();

    /**
     * cloudwatch_logging_options block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#cloudwatch_logging_options KinesisFirehoseDeliveryStream#cloudwatch_logging_options}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions getCloudwatchLoggingOptions() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#hec_acknowledgment_timeout KinesisFirehoseDeliveryStream#hec_acknowledgment_timeout}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getHecAcknowledgmentTimeout() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#hec_endpoint_type KinesisFirehoseDeliveryStream#hec_endpoint_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHecEndpointType() {
        return null;
    }

    /**
     * processing_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#processing_configuration KinesisFirehoseDeliveryStream#processing_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration getProcessingConfiguration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#retry_duration KinesisFirehoseDeliveryStream#retry_duration}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRetryDuration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#s3_backup_mode KinesisFirehoseDeliveryStream#s3_backup_mode}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getS3BackupMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamSplunkConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamSplunkConfiguration> {
        java.lang.String hecEndpoint;
        java.lang.String hecToken;
        imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
        java.lang.Number hecAcknowledgmentTimeout;
        java.lang.String hecEndpointType;
        imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration processingConfiguration;
        java.lang.Number retryDuration;
        java.lang.String s3BackupMode;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getHecEndpoint}
         * @param hecEndpoint Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#hec_endpoint KinesisFirehoseDeliveryStream#hec_endpoint}. This parameter is required.
         * @return {@code this}
         */
        public Builder hecEndpoint(java.lang.String hecEndpoint) {
            this.hecEndpoint = hecEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getHecToken}
         * @param hecToken Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#hec_token KinesisFirehoseDeliveryStream#hec_token}. This parameter is required.
         * @return {@code this}
         */
        public Builder hecToken(java.lang.String hecToken) {
            this.hecToken = hecToken;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getCloudwatchLoggingOptions}
         * @param cloudwatchLoggingOptions cloudwatch_logging_options block.
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#cloudwatch_logging_options KinesisFirehoseDeliveryStream#cloudwatch_logging_options}
         * @return {@code this}
         */
        public Builder cloudwatchLoggingOptions(imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getHecAcknowledgmentTimeout}
         * @param hecAcknowledgmentTimeout Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#hec_acknowledgment_timeout KinesisFirehoseDeliveryStream#hec_acknowledgment_timeout}.
         * @return {@code this}
         */
        public Builder hecAcknowledgmentTimeout(java.lang.Number hecAcknowledgmentTimeout) {
            this.hecAcknowledgmentTimeout = hecAcknowledgmentTimeout;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getHecEndpointType}
         * @param hecEndpointType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#hec_endpoint_type KinesisFirehoseDeliveryStream#hec_endpoint_type}.
         * @return {@code this}
         */
        public Builder hecEndpointType(java.lang.String hecEndpointType) {
            this.hecEndpointType = hecEndpointType;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getProcessingConfiguration}
         * @param processingConfiguration processing_configuration block.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#processing_configuration KinesisFirehoseDeliveryStream#processing_configuration}
         * @return {@code this}
         */
        public Builder processingConfiguration(imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getRetryDuration}
         * @param retryDuration Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#retry_duration KinesisFirehoseDeliveryStream#retry_duration}.
         * @return {@code this}
         */
        public Builder retryDuration(java.lang.Number retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration#getS3BackupMode}
         * @param s3BackupMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#s3_backup_mode KinesisFirehoseDeliveryStream#s3_backup_mode}.
         * @return {@code this}
         */
        public Builder s3BackupMode(java.lang.String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamSplunkConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamSplunkConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamSplunkConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamSplunkConfiguration {
        private final java.lang.String hecEndpoint;
        private final java.lang.String hecToken;
        private final imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
        private final java.lang.Number hecAcknowledgmentTimeout;
        private final java.lang.String hecEndpointType;
        private final imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration processingConfiguration;
        private final java.lang.Number retryDuration;
        private final java.lang.String s3BackupMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hecEndpoint = software.amazon.jsii.Kernel.get(this, "hecEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hecToken = software.amazon.jsii.Kernel.get(this, "hecToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchLoggingOptions = software.amazon.jsii.Kernel.get(this, "cloudwatchLoggingOptions", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions.class));
            this.hecAcknowledgmentTimeout = software.amazon.jsii.Kernel.get(this, "hecAcknowledgmentTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.hecEndpointType = software.amazon.jsii.Kernel.get(this, "hecEndpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.processingConfiguration = software.amazon.jsii.Kernel.get(this, "processingConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration.class));
            this.retryDuration = software.amazon.jsii.Kernel.get(this, "retryDuration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.s3BackupMode = software.amazon.jsii.Kernel.get(this, "s3BackupMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hecEndpoint = java.util.Objects.requireNonNull(builder.hecEndpoint, "hecEndpoint is required");
            this.hecToken = java.util.Objects.requireNonNull(builder.hecToken, "hecToken is required");
            this.cloudwatchLoggingOptions = builder.cloudwatchLoggingOptions;
            this.hecAcknowledgmentTimeout = builder.hecAcknowledgmentTimeout;
            this.hecEndpointType = builder.hecEndpointType;
            this.processingConfiguration = builder.processingConfiguration;
            this.retryDuration = builder.retryDuration;
            this.s3BackupMode = builder.s3BackupMode;
        }

        @Override
        public final java.lang.String getHecEndpoint() {
            return this.hecEndpoint;
        }

        @Override
        public final java.lang.String getHecToken() {
            return this.hecToken;
        }

        @Override
        public final imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions getCloudwatchLoggingOptions() {
            return this.cloudwatchLoggingOptions;
        }

        @Override
        public final java.lang.Number getHecAcknowledgmentTimeout() {
            return this.hecAcknowledgmentTimeout;
        }

        @Override
        public final java.lang.String getHecEndpointType() {
            return this.hecEndpointType;
        }

        @Override
        public final imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration getProcessingConfiguration() {
            return this.processingConfiguration;
        }

        @Override
        public final java.lang.Number getRetryDuration() {
            return this.retryDuration;
        }

        @Override
        public final java.lang.String getS3BackupMode() {
            return this.s3BackupMode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("hecEndpoint", om.valueToTree(this.getHecEndpoint()));
            data.set("hecToken", om.valueToTree(this.getHecToken()));
            if (this.getCloudwatchLoggingOptions() != null) {
                data.set("cloudwatchLoggingOptions", om.valueToTree(this.getCloudwatchLoggingOptions()));
            }
            if (this.getHecAcknowledgmentTimeout() != null) {
                data.set("hecAcknowledgmentTimeout", om.valueToTree(this.getHecAcknowledgmentTimeout()));
            }
            if (this.getHecEndpointType() != null) {
                data.set("hecEndpointType", om.valueToTree(this.getHecEndpointType()));
            }
            if (this.getProcessingConfiguration() != null) {
                data.set("processingConfiguration", om.valueToTree(this.getProcessingConfiguration()));
            }
            if (this.getRetryDuration() != null) {
                data.set("retryDuration", om.valueToTree(this.getRetryDuration()));
            }
            if (this.getS3BackupMode() != null) {
                data.set("s3BackupMode", om.valueToTree(this.getS3BackupMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamSplunkConfiguration.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamSplunkConfiguration.Jsii$Proxy) o;

            if (!hecEndpoint.equals(that.hecEndpoint)) return false;
            if (!hecToken.equals(that.hecToken)) return false;
            if (this.cloudwatchLoggingOptions != null ? !this.cloudwatchLoggingOptions.equals(that.cloudwatchLoggingOptions) : that.cloudwatchLoggingOptions != null) return false;
            if (this.hecAcknowledgmentTimeout != null ? !this.hecAcknowledgmentTimeout.equals(that.hecAcknowledgmentTimeout) : that.hecAcknowledgmentTimeout != null) return false;
            if (this.hecEndpointType != null ? !this.hecEndpointType.equals(that.hecEndpointType) : that.hecEndpointType != null) return false;
            if (this.processingConfiguration != null ? !this.processingConfiguration.equals(that.processingConfiguration) : that.processingConfiguration != null) return false;
            if (this.retryDuration != null ? !this.retryDuration.equals(that.retryDuration) : that.retryDuration != null) return false;
            return this.s3BackupMode != null ? this.s3BackupMode.equals(that.s3BackupMode) : that.s3BackupMode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.hecEndpoint.hashCode();
            result = 31 * result + (this.hecToken.hashCode());
            result = 31 * result + (this.cloudwatchLoggingOptions != null ? this.cloudwatchLoggingOptions.hashCode() : 0);
            result = 31 * result + (this.hecAcknowledgmentTimeout != null ? this.hecAcknowledgmentTimeout.hashCode() : 0);
            result = 31 * result + (this.hecEndpointType != null ? this.hecEndpointType.hashCode() : 0);
            result = 31 * result + (this.processingConfiguration != null ? this.processingConfiguration.hashCode() : 0);
            result = 31 * result + (this.retryDuration != null ? this.retryDuration.hashCode() : 0);
            result = 31 * result + (this.s3BackupMode != null ? this.s3BackupMode.hashCode() : 0);
            return result;
        }
    }
}
