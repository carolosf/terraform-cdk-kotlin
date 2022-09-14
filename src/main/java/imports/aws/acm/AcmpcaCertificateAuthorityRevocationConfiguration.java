package imports.aws.acm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.081Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.acm.AcmpcaCertificateAuthorityRevocationConfiguration")
@software.amazon.jsii.Jsii.Proxy(AcmpcaCertificateAuthorityRevocationConfiguration.Jsii$Proxy.class)
public interface AcmpcaCertificateAuthorityRevocationConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * crl_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate_authority#crl_configuration AcmpcaCertificateAuthority#crl_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration getCrlConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AcmpcaCertificateAuthorityRevocationConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AcmpcaCertificateAuthorityRevocationConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AcmpcaCertificateAuthorityRevocationConfiguration> {
        imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration crlConfiguration;

        /**
         * Sets the value of {@link AcmpcaCertificateAuthorityRevocationConfiguration#getCrlConfiguration}
         * @param crlConfiguration crl_configuration block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate_authority#crl_configuration AcmpcaCertificateAuthority#crl_configuration}
         * @return {@code this}
         */
        public Builder crlConfiguration(imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration crlConfiguration) {
            this.crlConfiguration = crlConfiguration;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AcmpcaCertificateAuthorityRevocationConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AcmpcaCertificateAuthorityRevocationConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AcmpcaCertificateAuthorityRevocationConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AcmpcaCertificateAuthorityRevocationConfiguration {
        private final imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration crlConfiguration;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.crlConfiguration = software.amazon.jsii.Kernel.get(this, "crlConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.crlConfiguration = builder.crlConfiguration;
        }

        @Override
        public final imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration getCrlConfiguration() {
            return this.crlConfiguration;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCrlConfiguration() != null) {
                data.set("crlConfiguration", om.valueToTree(this.getCrlConfiguration()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.acm.AcmpcaCertificateAuthorityRevocationConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AcmpcaCertificateAuthorityRevocationConfiguration.Jsii$Proxy that = (AcmpcaCertificateAuthorityRevocationConfiguration.Jsii$Proxy) o;

            return this.crlConfiguration != null ? this.crlConfiguration.equals(that.crlConfiguration) : that.crlConfiguration == null;
        }

        @Override
        public final int hashCode() {
            int result = this.crlConfiguration != null ? this.crlConfiguration.hashCode() : 0;
            return result;
        }
    }
}