package imports.aws.route53;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.039Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.route53.Route53ResolverEndpointIpAddress")
@software.amazon.jsii.Jsii.Proxy(Route53ResolverEndpointIpAddress.Jsii$Proxy.class)
public interface Route53ResolverEndpointIpAddress extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_endpoint#subnet_id Route53ResolverEndpoint#subnet_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSubnetId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_endpoint#ip Route53ResolverEndpoint#ip}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Route53ResolverEndpointIpAddress}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Route53ResolverEndpointIpAddress}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Route53ResolverEndpointIpAddress> {
        java.lang.String subnetId;
        java.lang.String ip;

        /**
         * Sets the value of {@link Route53ResolverEndpointIpAddress#getSubnetId}
         * @param subnetId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_endpoint#subnet_id Route53ResolverEndpoint#subnet_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder subnetId(java.lang.String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverEndpointIpAddress#getIp}
         * @param ip Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_endpoint#ip Route53ResolverEndpoint#ip}.
         * @return {@code this}
         */
        public Builder ip(java.lang.String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Route53ResolverEndpointIpAddress}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Route53ResolverEndpointIpAddress build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Route53ResolverEndpointIpAddress}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Route53ResolverEndpointIpAddress {
        private final java.lang.String subnetId;
        private final java.lang.String ip;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.subnetId = software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ip = software.amazon.jsii.Kernel.get(this, "ip", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.subnetId = java.util.Objects.requireNonNull(builder.subnetId, "subnetId is required");
            this.ip = builder.ip;
        }

        @Override
        public final java.lang.String getSubnetId() {
            return this.subnetId;
        }

        @Override
        public final java.lang.String getIp() {
            return this.ip;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("subnetId", om.valueToTree(this.getSubnetId()));
            if (this.getIp() != null) {
                data.set("ip", om.valueToTree(this.getIp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.route53.Route53ResolverEndpointIpAddress"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Route53ResolverEndpointIpAddress.Jsii$Proxy that = (Route53ResolverEndpointIpAddress.Jsii$Proxy) o;

            if (!subnetId.equals(that.subnetId)) return false;
            return this.ip != null ? this.ip.equals(that.ip) : that.ip == null;
        }

        @Override
        public final int hashCode() {
            int result = this.subnetId.hashCode();
            result = 31 * result + (this.ip != null ? this.ip.hashCode() : 0);
            return result;
        }
    }
}
