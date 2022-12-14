package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.892Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterOpenMonitoringPrometheusNodeExporter")
@software.amazon.jsii.Jsii.Proxy(MskClusterOpenMonitoringPrometheusNodeExporter.Jsii$Proxy.class)
public interface MskClusterOpenMonitoringPrometheusNodeExporter extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#enabled_in_broker MskCluster#enabled_in_broker}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getEnabledInBroker();

    /**
     * @return a {@link Builder} of {@link MskClusterOpenMonitoringPrometheusNodeExporter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterOpenMonitoringPrometheusNodeExporter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterOpenMonitoringPrometheusNodeExporter> {
        java.lang.Object enabledInBroker;

        /**
         * Sets the value of {@link MskClusterOpenMonitoringPrometheusNodeExporter#getEnabledInBroker}
         * @param enabledInBroker Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#enabled_in_broker MskCluster#enabled_in_broker}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabledInBroker(java.lang.Boolean enabledInBroker) {
            this.enabledInBroker = enabledInBroker;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterOpenMonitoringPrometheusNodeExporter#getEnabledInBroker}
         * @param enabledInBroker Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#enabled_in_broker MskCluster#enabled_in_broker}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabledInBroker(com.hashicorp.cdktf.IResolvable enabledInBroker) {
            this.enabledInBroker = enabledInBroker;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskClusterOpenMonitoringPrometheusNodeExporter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterOpenMonitoringPrometheusNodeExporter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskClusterOpenMonitoringPrometheusNodeExporter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterOpenMonitoringPrometheusNodeExporter {
        private final java.lang.Object enabledInBroker;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabledInBroker = software.amazon.jsii.Kernel.get(this, "enabledInBroker", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabledInBroker = java.util.Objects.requireNonNull(builder.enabledInBroker, "enabledInBroker is required");
        }

        @Override
        public final java.lang.Object getEnabledInBroker() {
            return this.enabledInBroker;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("enabledInBroker", om.valueToTree(this.getEnabledInBroker()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskClusterOpenMonitoringPrometheusNodeExporter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterOpenMonitoringPrometheusNodeExporter.Jsii$Proxy that = (MskClusterOpenMonitoringPrometheusNodeExporter.Jsii$Proxy) o;

            return this.enabledInBroker.equals(that.enabledInBroker);
        }

        @Override
        public final int hashCode() {
            int result = this.enabledInBroker.hashCode();
            return result;
        }
    }
}
