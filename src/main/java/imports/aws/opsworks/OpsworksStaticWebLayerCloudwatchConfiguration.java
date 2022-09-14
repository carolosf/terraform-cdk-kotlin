package imports.aws.opsworks;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.954Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.opsworks.OpsworksStaticWebLayerCloudwatchConfiguration")
@software.amazon.jsii.Jsii.Proxy(OpsworksStaticWebLayerCloudwatchConfiguration.Jsii$Proxy.class)
public interface OpsworksStaticWebLayerCloudwatchConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_static_web_layer#enabled OpsworksStaticWebLayer#enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnabled() {
        return null;
    }

    /**
     * log_streams block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/opsworks_static_web_layer#log_streams OpsworksStaticWebLayer#log_streams}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getLogStreams() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OpsworksStaticWebLayerCloudwatchConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpsworksStaticWebLayerCloudwatchConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpsworksStaticWebLayerCloudwatchConfiguration> {
        java.lang.Object enabled;
        java.lang.Object logStreams;

        /**
         * Sets the value of {@link OpsworksStaticWebLayerCloudwatchConfiguration#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_static_web_layer#enabled OpsworksStaticWebLayer#enabled}.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStaticWebLayerCloudwatchConfiguration#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_static_web_layer#enabled OpsworksStaticWebLayer#enabled}.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStaticWebLayerCloudwatchConfiguration#getLogStreams}
         * @param logStreams log_streams block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/opsworks_static_web_layer#log_streams OpsworksStaticWebLayer#log_streams}
         * @return {@code this}
         */
        public Builder logStreams(com.hashicorp.cdktf.IResolvable logStreams) {
            this.logStreams = logStreams;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksStaticWebLayerCloudwatchConfiguration#getLogStreams}
         * @param logStreams log_streams block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/opsworks_static_web_layer#log_streams OpsworksStaticWebLayer#log_streams}
         * @return {@code this}
         */
        public Builder logStreams(java.util.List<? extends imports.aws.opsworks.OpsworksStaticWebLayerCloudwatchConfigurationLogStreams> logStreams) {
            this.logStreams = logStreams;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link OpsworksStaticWebLayerCloudwatchConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpsworksStaticWebLayerCloudwatchConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link OpsworksStaticWebLayerCloudwatchConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpsworksStaticWebLayerCloudwatchConfiguration {
        private final java.lang.Object enabled;
        private final java.lang.Object logStreams;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.logStreams = software.amazon.jsii.Kernel.get(this, "logStreams", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabled = builder.enabled;
            this.logStreams = builder.logStreams;
        }

        @Override
        public final java.lang.Object getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.Object getLogStreams() {
            return this.logStreams;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getLogStreams() != null) {
                data.set("logStreams", om.valueToTree(this.getLogStreams()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.opsworks.OpsworksStaticWebLayerCloudwatchConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpsworksStaticWebLayerCloudwatchConfiguration.Jsii$Proxy that = (OpsworksStaticWebLayerCloudwatchConfiguration.Jsii$Proxy) o;

            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            return this.logStreams != null ? this.logStreams.equals(that.logStreams) : that.logStreams == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enabled != null ? this.enabled.hashCode() : 0;
            result = 31 * result + (this.logStreams != null ? this.logStreams.hashCode() : 0);
            return result;
        }
    }
}
