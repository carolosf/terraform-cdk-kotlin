package imports.aws.apigateway;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.106Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigateway.ApiGatewayRestApiEndpointConfiguration")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayRestApiEndpointConfiguration.Jsii$Proxy.class)
public interface ApiGatewayRestApiEndpointConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_rest_api#types ApiGatewayRestApi#types}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTypes();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_rest_api#vpc_endpoint_ids ApiGatewayRestApi#vpc_endpoint_ids}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcEndpointIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiGatewayRestApiEndpointConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayRestApiEndpointConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayRestApiEndpointConfiguration> {
        java.util.List<java.lang.String> types;
        java.util.List<java.lang.String> vpcEndpointIds;

        /**
         * Sets the value of {@link ApiGatewayRestApiEndpointConfiguration#getTypes}
         * @param types Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_rest_api#types ApiGatewayRestApi#types}. This parameter is required.
         * @return {@code this}
         */
        public Builder types(java.util.List<java.lang.String> types) {
            this.types = types;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayRestApiEndpointConfiguration#getVpcEndpointIds}
         * @param vpcEndpointIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_rest_api#vpc_endpoint_ids ApiGatewayRestApi#vpc_endpoint_ids}.
         * @return {@code this}
         */
        public Builder vpcEndpointIds(java.util.List<java.lang.String> vpcEndpointIds) {
            this.vpcEndpointIds = vpcEndpointIds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiGatewayRestApiEndpointConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayRestApiEndpointConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ApiGatewayRestApiEndpointConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayRestApiEndpointConfiguration {
        private final java.util.List<java.lang.String> types;
        private final java.util.List<java.lang.String> vpcEndpointIds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.types = software.amazon.jsii.Kernel.get(this, "types", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.vpcEndpointIds = software.amazon.jsii.Kernel.get(this, "vpcEndpointIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.types = java.util.Objects.requireNonNull(builder.types, "types is required");
            this.vpcEndpointIds = builder.vpcEndpointIds;
        }

        @Override
        public final java.util.List<java.lang.String> getTypes() {
            return this.types;
        }

        @Override
        public final java.util.List<java.lang.String> getVpcEndpointIds() {
            return this.vpcEndpointIds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("types", om.valueToTree(this.getTypes()));
            if (this.getVpcEndpointIds() != null) {
                data.set("vpcEndpointIds", om.valueToTree(this.getVpcEndpointIds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.apigateway.ApiGatewayRestApiEndpointConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayRestApiEndpointConfiguration.Jsii$Proxy that = (ApiGatewayRestApiEndpointConfiguration.Jsii$Proxy) o;

            if (!types.equals(that.types)) return false;
            return this.vpcEndpointIds != null ? this.vpcEndpointIds.equals(that.vpcEndpointIds) : that.vpcEndpointIds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.types.hashCode();
            result = 31 * result + (this.vpcEndpointIds != null ? this.vpcEndpointIds.hashCode() : 0);
            return result;
        }
    }
}