package imports.aws.appsync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.206Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncGraphqlApiOpenidConnectConfig")
@software.amazon.jsii.Jsii.Proxy(AppsyncGraphqlApiOpenidConnectConfig.Jsii$Proxy.class)
public interface AppsyncGraphqlApiOpenidConnectConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#issuer AppsyncGraphqlApi#issuer}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getIssuer();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#auth_ttl AppsyncGraphqlApi#auth_ttl}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getAuthTtl() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#client_id AppsyncGraphqlApi#client_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClientId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#iat_ttl AppsyncGraphqlApi#iat_ttl}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getIatTtl() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppsyncGraphqlApiOpenidConnectConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppsyncGraphqlApiOpenidConnectConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppsyncGraphqlApiOpenidConnectConfig> {
        java.lang.String issuer;
        java.lang.Number authTtl;
        java.lang.String clientId;
        java.lang.Number iatTtl;

        /**
         * Sets the value of {@link AppsyncGraphqlApiOpenidConnectConfig#getIssuer}
         * @param issuer Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#issuer AppsyncGraphqlApi#issuer}. This parameter is required.
         * @return {@code this}
         */
        public Builder issuer(java.lang.String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiOpenidConnectConfig#getAuthTtl}
         * @param authTtl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#auth_ttl AppsyncGraphqlApi#auth_ttl}.
         * @return {@code this}
         */
        public Builder authTtl(java.lang.Number authTtl) {
            this.authTtl = authTtl;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiOpenidConnectConfig#getClientId}
         * @param clientId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#client_id AppsyncGraphqlApi#client_id}.
         * @return {@code this}
         */
        public Builder clientId(java.lang.String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiOpenidConnectConfig#getIatTtl}
         * @param iatTtl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#iat_ttl AppsyncGraphqlApi#iat_ttl}.
         * @return {@code this}
         */
        public Builder iatTtl(java.lang.Number iatTtl) {
            this.iatTtl = iatTtl;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppsyncGraphqlApiOpenidConnectConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppsyncGraphqlApiOpenidConnectConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppsyncGraphqlApiOpenidConnectConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppsyncGraphqlApiOpenidConnectConfig {
        private final java.lang.String issuer;
        private final java.lang.Number authTtl;
        private final java.lang.String clientId;
        private final java.lang.Number iatTtl;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.issuer = software.amazon.jsii.Kernel.get(this, "issuer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authTtl = software.amazon.jsii.Kernel.get(this, "authTtl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.clientId = software.amazon.jsii.Kernel.get(this, "clientId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iatTtl = software.amazon.jsii.Kernel.get(this, "iatTtl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.issuer = java.util.Objects.requireNonNull(builder.issuer, "issuer is required");
            this.authTtl = builder.authTtl;
            this.clientId = builder.clientId;
            this.iatTtl = builder.iatTtl;
        }

        @Override
        public final java.lang.String getIssuer() {
            return this.issuer;
        }

        @Override
        public final java.lang.Number getAuthTtl() {
            return this.authTtl;
        }

        @Override
        public final java.lang.String getClientId() {
            return this.clientId;
        }

        @Override
        public final java.lang.Number getIatTtl() {
            return this.iatTtl;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("issuer", om.valueToTree(this.getIssuer()));
            if (this.getAuthTtl() != null) {
                data.set("authTtl", om.valueToTree(this.getAuthTtl()));
            }
            if (this.getClientId() != null) {
                data.set("clientId", om.valueToTree(this.getClientId()));
            }
            if (this.getIatTtl() != null) {
                data.set("iatTtl", om.valueToTree(this.getIatTtl()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appsync.AppsyncGraphqlApiOpenidConnectConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppsyncGraphqlApiOpenidConnectConfig.Jsii$Proxy that = (AppsyncGraphqlApiOpenidConnectConfig.Jsii$Proxy) o;

            if (!issuer.equals(that.issuer)) return false;
            if (this.authTtl != null ? !this.authTtl.equals(that.authTtl) : that.authTtl != null) return false;
            if (this.clientId != null ? !this.clientId.equals(that.clientId) : that.clientId != null) return false;
            return this.iatTtl != null ? this.iatTtl.equals(that.iatTtl) : that.iatTtl == null;
        }

        @Override
        public final int hashCode() {
            int result = this.issuer.hashCode();
            result = 31 * result + (this.authTtl != null ? this.authTtl.hashCode() : 0);
            result = 31 * result + (this.clientId != null ? this.clientId.hashCode() : 0);
            result = 31 * result + (this.iatTtl != null ? this.iatTtl.hashCode() : 0);
            return result;
        }
    }
}
