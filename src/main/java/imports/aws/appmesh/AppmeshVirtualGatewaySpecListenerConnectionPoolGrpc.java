package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.165Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc.Jsii$Proxy.class)
public interface AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#max_requests AppmeshVirtualGateway#max_requests}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMaxRequests();

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc> {
        java.lang.Number maxRequests;

        /**
         * Sets the value of {@link AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc#getMaxRequests}
         * @param maxRequests Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#max_requests AppmeshVirtualGateway#max_requests}. This parameter is required.
         * @return {@code this}
         */
        public Builder maxRequests(java.lang.Number maxRequests) {
            this.maxRequests = maxRequests;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc {
        private final java.lang.Number maxRequests;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxRequests = software.amazon.jsii.Kernel.get(this, "maxRequests", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxRequests = java.util.Objects.requireNonNull(builder.maxRequests, "maxRequests is required");
        }

        @Override
        public final java.lang.Number getMaxRequests() {
            return this.maxRequests;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("maxRequests", om.valueToTree(this.getMaxRequests()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc.Jsii$Proxy that = (AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc.Jsii$Proxy) o;

            return this.maxRequests.equals(that.maxRequests);
        }

        @Override
        public final int hashCode() {
            int result = this.maxRequests.hashCode();
            return result;
        }
    }
}
