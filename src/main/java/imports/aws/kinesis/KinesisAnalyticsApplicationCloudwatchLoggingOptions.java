package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.803Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.KinesisAnalyticsApplicationCloudwatchLoggingOptions")
@software.amazon.jsii.Jsii.Proxy(KinesisAnalyticsApplicationCloudwatchLoggingOptions.Jsii$Proxy.class)
public interface KinesisAnalyticsApplicationCloudwatchLoggingOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_analytics_application#log_stream_arn KinesisAnalyticsApplication#log_stream_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLogStreamArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_analytics_application#role_arn KinesisAnalyticsApplication#role_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    /**
     * @return a {@link Builder} of {@link KinesisAnalyticsApplicationCloudwatchLoggingOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisAnalyticsApplicationCloudwatchLoggingOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisAnalyticsApplicationCloudwatchLoggingOptions> {
        java.lang.String logStreamArn;
        java.lang.String roleArn;

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationCloudwatchLoggingOptions#getLogStreamArn}
         * @param logStreamArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_analytics_application#log_stream_arn KinesisAnalyticsApplication#log_stream_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder logStreamArn(java.lang.String logStreamArn) {
            this.logStreamArn = logStreamArn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisAnalyticsApplicationCloudwatchLoggingOptions#getRoleArn}
         * @param roleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_analytics_application#role_arn KinesisAnalyticsApplication#role_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisAnalyticsApplicationCloudwatchLoggingOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisAnalyticsApplicationCloudwatchLoggingOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KinesisAnalyticsApplicationCloudwatchLoggingOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisAnalyticsApplicationCloudwatchLoggingOptions {
        private final java.lang.String logStreamArn;
        private final java.lang.String roleArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.logStreamArn = software.amazon.jsii.Kernel.get(this, "logStreamArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.logStreamArn = java.util.Objects.requireNonNull(builder.logStreamArn, "logStreamArn is required");
            this.roleArn = java.util.Objects.requireNonNull(builder.roleArn, "roleArn is required");
        }

        @Override
        public final java.lang.String getLogStreamArn() {
            return this.logStreamArn;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("logStreamArn", om.valueToTree(this.getLogStreamArn()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.kinesis.KinesisAnalyticsApplicationCloudwatchLoggingOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisAnalyticsApplicationCloudwatchLoggingOptions.Jsii$Proxy that = (KinesisAnalyticsApplicationCloudwatchLoggingOptions.Jsii$Proxy) o;

            if (!logStreamArn.equals(that.logStreamArn)) return false;
            return this.roleArn.equals(that.roleArn);
        }

        @Override
        public final int hashCode() {
            int result = this.logStreamArn.hashCode();
            result = 31 * result + (this.roleArn.hashCode());
            return result;
        }
    }
}
