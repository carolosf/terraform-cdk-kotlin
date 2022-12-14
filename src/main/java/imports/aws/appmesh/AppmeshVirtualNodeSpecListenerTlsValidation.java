package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.179Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidation")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecListenerTlsValidation.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecListenerTlsValidation extends software.amazon.jsii.JsiiSerializable {

    /**
     * trust block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#trust AppmeshVirtualNode#trust}
     */
    @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationTrust getTrust();

    /**
     * subject_alternative_names block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#subject_alternative_names AppmeshVirtualNode#subject_alternative_names}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames getSubjectAlternativeNames() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecListenerTlsValidation}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecListenerTlsValidation}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecListenerTlsValidation> {
        imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationTrust trust;
        imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerTlsValidation#getTrust}
         * @param trust trust block. This parameter is required.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#trust AppmeshVirtualNode#trust}
         * @return {@code this}
         */
        public Builder trust(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationTrust trust) {
            this.trust = trust;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerTlsValidation#getSubjectAlternativeNames}
         * @param subjectAlternativeNames subject_alternative_names block.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#subject_alternative_names AppmeshVirtualNode#subject_alternative_names}
         * @return {@code this}
         */
        public Builder subjectAlternativeNames(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecListenerTlsValidation}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecListenerTlsValidation build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecListenerTlsValidation}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecListenerTlsValidation {
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationTrust trust;
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.trust = software.amazon.jsii.Kernel.get(this, "trust", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationTrust.class));
            this.subjectAlternativeNames = software.amazon.jsii.Kernel.get(this, "subjectAlternativeNames", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.trust = java.util.Objects.requireNonNull(builder.trust, "trust is required");
            this.subjectAlternativeNames = builder.subjectAlternativeNames;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationTrust getTrust() {
            return this.trust;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("trust", om.valueToTree(this.getTrust()));
            if (this.getSubjectAlternativeNames() != null) {
                data.set("subjectAlternativeNames", om.valueToTree(this.getSubjectAlternativeNames()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidation"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecListenerTlsValidation.Jsii$Proxy that = (AppmeshVirtualNodeSpecListenerTlsValidation.Jsii$Proxy) o;

            if (!trust.equals(that.trust)) return false;
            return this.subjectAlternativeNames != null ? this.subjectAlternativeNames.equals(that.subjectAlternativeNames) : that.subjectAlternativeNames == null;
        }

        @Override
        public final int hashCode() {
            int result = this.trust.hashCode();
            result = 31 * result + (this.subjectAlternativeNames != null ? this.subjectAlternativeNames.hashCode() : 0);
            return result;
        }
    }
}
