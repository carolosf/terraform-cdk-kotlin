package imports.aws.iam;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.757Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iam.DataAwsIamPolicyDocumentStatementPrincipals")
@software.amazon.jsii.Jsii.Proxy(DataAwsIamPolicyDocumentStatementPrincipals.Jsii$Proxy.class)
public interface DataAwsIamPolicyDocumentStatementPrincipals extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/iam_policy_document#identifiers DataAwsIamPolicyDocument#identifiers}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIdentifiers();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/iam_policy_document#type DataAwsIamPolicyDocument#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * @return a {@link Builder} of {@link DataAwsIamPolicyDocumentStatementPrincipals}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsIamPolicyDocumentStatementPrincipals}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsIamPolicyDocumentStatementPrincipals> {
        java.util.List<java.lang.String> identifiers;
        java.lang.String type;

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatementPrincipals#getIdentifiers}
         * @param identifiers Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/iam_policy_document#identifiers DataAwsIamPolicyDocument#identifiers}. This parameter is required.
         * @return {@code this}
         */
        public Builder identifiers(java.util.List<java.lang.String> identifiers) {
            this.identifiers = identifiers;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsIamPolicyDocumentStatementPrincipals#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/iam_policy_document#type DataAwsIamPolicyDocument#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsIamPolicyDocumentStatementPrincipals}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsIamPolicyDocumentStatementPrincipals build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsIamPolicyDocumentStatementPrincipals}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsIamPolicyDocumentStatementPrincipals {
        private final java.util.List<java.lang.String> identifiers;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.identifiers = software.amazon.jsii.Kernel.get(this, "identifiers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.identifiers = java.util.Objects.requireNonNull(builder.identifiers, "identifiers is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
        }

        @Override
        public final java.util.List<java.lang.String> getIdentifiers() {
            return this.identifiers;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("identifiers", om.valueToTree(this.getIdentifiers()));
            data.set("type", om.valueToTree(this.getType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.iam.DataAwsIamPolicyDocumentStatementPrincipals"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsIamPolicyDocumentStatementPrincipals.Jsii$Proxy that = (DataAwsIamPolicyDocumentStatementPrincipals.Jsii$Proxy) o;

            if (!identifiers.equals(that.identifiers)) return false;
            return this.type.equals(that.type);
        }

        @Override
        public final int hashCode() {
            int result = this.identifiers.hashCode();
            result = 31 * result + (this.type.hashCode());
            return result;
        }
    }
}
