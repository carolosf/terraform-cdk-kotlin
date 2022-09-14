package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.815Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#type KinesisFirehoseDeliveryStream#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * parameters block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#parameters KinesisFirehoseDeliveryStream#parameters}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getParameters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors> {
        java.lang.String type;
        java.lang.Object parameters;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#type KinesisFirehoseDeliveryStream#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors#getParameters}
         * @param parameters parameters block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#parameters KinesisFirehoseDeliveryStream#parameters}
         * @return {@code this}
         */
        public Builder parameters(com.hashicorp.cdktf.IResolvable parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors#getParameters}
         * @param parameters parameters block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#parameters KinesisFirehoseDeliveryStream#parameters}
         * @return {@code this}
         */
        public Builder parameters(java.util.List<? extends imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorsParameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors {
        private final java.lang.String type;
        private final java.lang.Object parameters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.parameters = builder.parameters;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Object getParameters() {
            return this.parameters;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessors.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.parameters != null ? this.parameters.equals(that.parameters) : that.parameters == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            return result;
        }
    }
}
