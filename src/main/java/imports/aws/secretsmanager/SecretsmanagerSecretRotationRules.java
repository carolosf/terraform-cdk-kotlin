package imports.aws.secretsmanager;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.116Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.secretsmanager.SecretsmanagerSecretRotationRules")
@software.amazon.jsii.Jsii.Proxy(SecretsmanagerSecretRotationRules.Jsii$Proxy.class)
public interface SecretsmanagerSecretRotationRules extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret#automatically_after_days SecretsmanagerSecret#automatically_after_days}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getAutomaticallyAfterDays();

    /**
     * @return a {@link Builder} of {@link SecretsmanagerSecretRotationRules}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecretsmanagerSecretRotationRules}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SecretsmanagerSecretRotationRules> {
        java.lang.Number automaticallyAfterDays;

        /**
         * Sets the value of {@link SecretsmanagerSecretRotationRules#getAutomaticallyAfterDays}
         * @param automaticallyAfterDays Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret#automatically_after_days SecretsmanagerSecret#automatically_after_days}. This parameter is required.
         * @return {@code this}
         */
        public Builder automaticallyAfterDays(java.lang.Number automaticallyAfterDays) {
            this.automaticallyAfterDays = automaticallyAfterDays;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SecretsmanagerSecretRotationRules}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SecretsmanagerSecretRotationRules build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SecretsmanagerSecretRotationRules}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecretsmanagerSecretRotationRules {
        private final java.lang.Number automaticallyAfterDays;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.automaticallyAfterDays = software.amazon.jsii.Kernel.get(this, "automaticallyAfterDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.automaticallyAfterDays = java.util.Objects.requireNonNull(builder.automaticallyAfterDays, "automaticallyAfterDays is required");
        }

        @Override
        public final java.lang.Number getAutomaticallyAfterDays() {
            return this.automaticallyAfterDays;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("automaticallyAfterDays", om.valueToTree(this.getAutomaticallyAfterDays()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.secretsmanager.SecretsmanagerSecretRotationRules"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecretsmanagerSecretRotationRules.Jsii$Proxy that = (SecretsmanagerSecretRotationRules.Jsii$Proxy) o;

            return this.automaticallyAfterDays.equals(that.automaticallyAfterDays);
        }

        @Override
        public final int hashCode() {
            int result = this.automaticallyAfterDays.hashCode();
            return result;
        }
    }
}
