package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.269Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionOriginOriginShield")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionOriginOriginShield.Jsii$Proxy.class)
public interface CloudfrontDistributionOriginOriginShield extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#enabled CloudfrontDistribution#enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getEnabled();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_shield_region CloudfrontDistribution#origin_shield_region}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getOriginShieldRegion();

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionOriginOriginShield}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionOriginOriginShield}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionOriginOriginShield> {
        java.lang.Object enabled;
        java.lang.String originShieldRegion;

        /**
         * Sets the value of {@link CloudfrontDistributionOriginOriginShield#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#enabled CloudfrontDistribution#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOriginOriginShield#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#enabled CloudfrontDistribution#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOriginOriginShield#getOriginShieldRegion}
         * @param originShieldRegion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_shield_region CloudfrontDistribution#origin_shield_region}. This parameter is required.
         * @return {@code this}
         */
        public Builder originShieldRegion(java.lang.String originShieldRegion) {
            this.originShieldRegion = originShieldRegion;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionOriginOriginShield}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionOriginOriginShield build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionOriginOriginShield}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionOriginOriginShield {
        private final java.lang.Object enabled;
        private final java.lang.String originShieldRegion;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.originShieldRegion = software.amazon.jsii.Kernel.get(this, "originShieldRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabled = java.util.Objects.requireNonNull(builder.enabled, "enabled is required");
            this.originShieldRegion = java.util.Objects.requireNonNull(builder.originShieldRegion, "originShieldRegion is required");
        }

        @Override
        public final java.lang.Object getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.String getOriginShieldRegion() {
            return this.originShieldRegion;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("enabled", om.valueToTree(this.getEnabled()));
            data.set("originShieldRegion", om.valueToTree(this.getOriginShieldRegion()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudfront.CloudfrontDistributionOriginOriginShield"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionOriginOriginShield.Jsii$Proxy that = (CloudfrontDistributionOriginOriginShield.Jsii$Proxy) o;

            if (!enabled.equals(that.enabled)) return false;
            return this.originShieldRegion.equals(that.originShieldRegion);
        }

        @Override
        public final int hashCode() {
            int result = this.enabled.hashCode();
            result = 31 * result + (this.originShieldRegion.hashCode());
            return result;
        }
    }
}
