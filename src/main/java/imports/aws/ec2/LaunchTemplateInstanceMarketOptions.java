package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.568Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.LaunchTemplateInstanceMarketOptions")
@software.amazon.jsii.Jsii.Proxy(LaunchTemplateInstanceMarketOptions.Jsii$Proxy.class)
public interface LaunchTemplateInstanceMarketOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/launch_template#market_type LaunchTemplate#market_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMarketType() {
        return null;
    }

    /**
     * spot_options block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/launch_template#spot_options LaunchTemplate#spot_options}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptions getSpotOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LaunchTemplateInstanceMarketOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchTemplateInstanceMarketOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchTemplateInstanceMarketOptions> {
        java.lang.String marketType;
        imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptions spotOptions;

        /**
         * Sets the value of {@link LaunchTemplateInstanceMarketOptions#getMarketType}
         * @param marketType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/launch_template#market_type LaunchTemplate#market_type}.
         * @return {@code this}
         */
        public Builder marketType(java.lang.String marketType) {
            this.marketType = marketType;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateInstanceMarketOptions#getSpotOptions}
         * @param spotOptions spot_options block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/launch_template#spot_options LaunchTemplate#spot_options}
         * @return {@code this}
         */
        public Builder spotOptions(imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptions spotOptions) {
            this.spotOptions = spotOptions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LaunchTemplateInstanceMarketOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchTemplateInstanceMarketOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LaunchTemplateInstanceMarketOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchTemplateInstanceMarketOptions {
        private final java.lang.String marketType;
        private final imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptions spotOptions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.marketType = software.amazon.jsii.Kernel.get(this, "marketType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.spotOptions = software.amazon.jsii.Kernel.get(this, "spotOptions", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptions.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.marketType = builder.marketType;
            this.spotOptions = builder.spotOptions;
        }

        @Override
        public final java.lang.String getMarketType() {
            return this.marketType;
        }

        @Override
        public final imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptions getSpotOptions() {
            return this.spotOptions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMarketType() != null) {
                data.set("marketType", om.valueToTree(this.getMarketType()));
            }
            if (this.getSpotOptions() != null) {
                data.set("spotOptions", om.valueToTree(this.getSpotOptions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ec2.LaunchTemplateInstanceMarketOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchTemplateInstanceMarketOptions.Jsii$Proxy that = (LaunchTemplateInstanceMarketOptions.Jsii$Proxy) o;

            if (this.marketType != null ? !this.marketType.equals(that.marketType) : that.marketType != null) return false;
            return this.spotOptions != null ? this.spotOptions.equals(that.spotOptions) : that.spotOptions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.marketType != null ? this.marketType.hashCode() : 0;
            result = 31 * result + (this.spotOptions != null ? this.spotOptions.hashCode() : 0);
            return result;
        }
    }
}
