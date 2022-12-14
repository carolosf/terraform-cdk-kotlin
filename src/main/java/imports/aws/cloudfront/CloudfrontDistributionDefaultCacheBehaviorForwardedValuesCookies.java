package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.263Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies.Jsii$Proxy.class)
public interface CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#forward CloudfrontDistribution#forward}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getForward();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#whitelisted_names CloudfrontDistribution#whitelisted_names}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getWhitelistedNames() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies> {
        java.lang.String forward;
        java.util.List<java.lang.String> whitelistedNames;

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies#getForward}
         * @param forward Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#forward CloudfrontDistribution#forward}. This parameter is required.
         * @return {@code this}
         */
        public Builder forward(java.lang.String forward) {
            this.forward = forward;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies#getWhitelistedNames}
         * @param whitelistedNames Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#whitelisted_names CloudfrontDistribution#whitelisted_names}.
         * @return {@code this}
         */
        public Builder whitelistedNames(java.util.List<java.lang.String> whitelistedNames) {
            this.whitelistedNames = whitelistedNames;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies {
        private final java.lang.String forward;
        private final java.util.List<java.lang.String> whitelistedNames;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.forward = software.amazon.jsii.Kernel.get(this, "forward", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.whitelistedNames = software.amazon.jsii.Kernel.get(this, "whitelistedNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.forward = java.util.Objects.requireNonNull(builder.forward, "forward is required");
            this.whitelistedNames = builder.whitelistedNames;
        }

        @Override
        public final java.lang.String getForward() {
            return this.forward;
        }

        @Override
        public final java.util.List<java.lang.String> getWhitelistedNames() {
            return this.whitelistedNames;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("forward", om.valueToTree(this.getForward()));
            if (this.getWhitelistedNames() != null) {
                data.set("whitelistedNames", om.valueToTree(this.getWhitelistedNames()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies.Jsii$Proxy that = (CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies.Jsii$Proxy) o;

            if (!forward.equals(that.forward)) return false;
            return this.whitelistedNames != null ? this.whitelistedNames.equals(that.whitelistedNames) : that.whitelistedNames == null;
        }

        @Override
        public final int hashCode() {
            int result = this.forward.hashCode();
            result = 31 * result + (this.whitelistedNames != null ? this.whitelistedNames.hashCode() : 0);
            return result;
        }
    }
}
