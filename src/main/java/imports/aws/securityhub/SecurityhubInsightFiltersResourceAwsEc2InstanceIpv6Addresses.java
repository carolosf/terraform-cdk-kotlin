package imports.aws.securityhub;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.138Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.securityhub.SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses")
@software.amazon.jsii.Jsii.Proxy(SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses.Jsii$Proxy.class)
public interface SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/securityhub_insight#cidr SecurityhubInsight#cidr}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getCidr();

    /**
     * @return a {@link Builder} of {@link SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses> {
        java.lang.String cidr;

        /**
         * Sets the value of {@link SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses#getCidr}
         * @param cidr Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/securityhub_insight#cidr SecurityhubInsight#cidr}. This parameter is required.
         * @return {@code this}
         */
        public Builder cidr(java.lang.String cidr) {
            this.cidr = cidr;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses {
        private final java.lang.String cidr;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cidr = software.amazon.jsii.Kernel.get(this, "cidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cidr = java.util.Objects.requireNonNull(builder.cidr, "cidr is required");
        }

        @Override
        public final java.lang.String getCidr() {
            return this.cidr;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("cidr", om.valueToTree(this.getCidr()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.securityhub.SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses.Jsii$Proxy that = (SecurityhubInsightFiltersResourceAwsEc2InstanceIpv6Addresses.Jsii$Proxy) o;

            return this.cidr.equals(that.cidr);
        }

        @Override
        public final int hashCode() {
            int result = this.cidr.hashCode();
            return result;
        }
    }
}
