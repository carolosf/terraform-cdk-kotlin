package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.147Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTarget")
@software.amazon.jsii.Jsii.Proxy(AppmeshGatewayRouteSpecGrpcRouteActionTarget.Jsii$Proxy.class)
public interface AppmeshGatewayRouteSpecGrpcRouteActionTarget extends software.amazon.jsii.JsiiSerializable {

    /**
     * virtual_service block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_gateway_route#virtual_service AppmeshGatewayRoute#virtual_service}
     */
    @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTargetVirtualService getVirtualService();

    /**
     * @return a {@link Builder} of {@link AppmeshGatewayRouteSpecGrpcRouteActionTarget}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshGatewayRouteSpecGrpcRouteActionTarget}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshGatewayRouteSpecGrpcRouteActionTarget> {
        imports.aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTargetVirtualService virtualService;

        /**
         * Sets the value of {@link AppmeshGatewayRouteSpecGrpcRouteActionTarget#getVirtualService}
         * @param virtualService virtual_service block. This parameter is required.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_gateway_route#virtual_service AppmeshGatewayRoute#virtual_service}
         * @return {@code this}
         */
        public Builder virtualService(imports.aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTargetVirtualService virtualService) {
            this.virtualService = virtualService;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshGatewayRouteSpecGrpcRouteActionTarget}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshGatewayRouteSpecGrpcRouteActionTarget build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshGatewayRouteSpecGrpcRouteActionTarget}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshGatewayRouteSpecGrpcRouteActionTarget {
        private final imports.aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTargetVirtualService virtualService;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.virtualService = software.amazon.jsii.Kernel.get(this, "virtualService", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTargetVirtualService.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.virtualService = java.util.Objects.requireNonNull(builder.virtualService, "virtualService is required");
        }

        @Override
        public final imports.aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTargetVirtualService getVirtualService() {
            return this.virtualService;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("virtualService", om.valueToTree(this.getVirtualService()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTarget"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshGatewayRouteSpecGrpcRouteActionTarget.Jsii$Proxy that = (AppmeshGatewayRouteSpecGrpcRouteActionTarget.Jsii$Proxy) o;

            return this.virtualService.equals(that.virtualService);
        }

        @Override
        public final int hashCode() {
            int result = this.virtualService.hashCode();
            return result;
        }
    }
}
