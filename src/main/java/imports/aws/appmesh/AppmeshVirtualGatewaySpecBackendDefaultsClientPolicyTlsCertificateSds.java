package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.164Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds.Jsii$Proxy.class)
public interface AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#secret_name AppmeshVirtualGateway#secret_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSecretName();

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds> {
        java.lang.String secretName;

        /**
         * Sets the value of {@link AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds#getSecretName}
         * @param secretName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#secret_name AppmeshVirtualGateway#secret_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder secretName(java.lang.String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds {
        private final java.lang.String secretName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.secretName = software.amazon.jsii.Kernel.get(this, "secretName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.secretName = java.util.Objects.requireNonNull(builder.secretName, "secretName is required");
        }

        @Override
        public final java.lang.String getSecretName() {
            return this.secretName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("secretName", om.valueToTree(this.getSecretName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds.Jsii$Proxy that = (AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds.Jsii$Proxy) o;

            return this.secretName.equals(that.secretName);
        }

        @Override
        public final int hashCode() {
            int result = this.secretName.hashCode();
            return result;
        }
    }
}
