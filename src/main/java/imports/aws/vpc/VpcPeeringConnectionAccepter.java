package imports.aws.vpc;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.287Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.VpcPeeringConnectionAccepter")
@software.amazon.jsii.Jsii.Proxy(VpcPeeringConnectionAccepter.Jsii$Proxy.class)
public interface VpcPeeringConnectionAccepter extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#allow_classic_link_to_remote_vpc VpcPeeringConnection#allow_classic_link_to_remote_vpc}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAllowClassicLinkToRemoteVpc() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#allow_remote_vpc_dns_resolution VpcPeeringConnection#allow_remote_vpc_dns_resolution}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAllowRemoteVpcDnsResolution() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#allow_vpc_to_remote_classic_link VpcPeeringConnection#allow_vpc_to_remote_classic_link}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAllowVpcToRemoteClassicLink() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VpcPeeringConnectionAccepter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VpcPeeringConnectionAccepter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VpcPeeringConnectionAccepter> {
        java.lang.Object allowClassicLinkToRemoteVpc;
        java.lang.Object allowRemoteVpcDnsResolution;
        java.lang.Object allowVpcToRemoteClassicLink;

        /**
         * Sets the value of {@link VpcPeeringConnectionAccepter#getAllowClassicLinkToRemoteVpc}
         * @param allowClassicLinkToRemoteVpc Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#allow_classic_link_to_remote_vpc VpcPeeringConnection#allow_classic_link_to_remote_vpc}.
         * @return {@code this}
         */
        public Builder allowClassicLinkToRemoteVpc(java.lang.Boolean allowClassicLinkToRemoteVpc) {
            this.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionAccepter#getAllowClassicLinkToRemoteVpc}
         * @param allowClassicLinkToRemoteVpc Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#allow_classic_link_to_remote_vpc VpcPeeringConnection#allow_classic_link_to_remote_vpc}.
         * @return {@code this}
         */
        public Builder allowClassicLinkToRemoteVpc(com.hashicorp.cdktf.IResolvable allowClassicLinkToRemoteVpc) {
            this.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionAccepter#getAllowRemoteVpcDnsResolution}
         * @param allowRemoteVpcDnsResolution Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#allow_remote_vpc_dns_resolution VpcPeeringConnection#allow_remote_vpc_dns_resolution}.
         * @return {@code this}
         */
        public Builder allowRemoteVpcDnsResolution(java.lang.Boolean allowRemoteVpcDnsResolution) {
            this.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionAccepter#getAllowRemoteVpcDnsResolution}
         * @param allowRemoteVpcDnsResolution Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#allow_remote_vpc_dns_resolution VpcPeeringConnection#allow_remote_vpc_dns_resolution}.
         * @return {@code this}
         */
        public Builder allowRemoteVpcDnsResolution(com.hashicorp.cdktf.IResolvable allowRemoteVpcDnsResolution) {
            this.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionAccepter#getAllowVpcToRemoteClassicLink}
         * @param allowVpcToRemoteClassicLink Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#allow_vpc_to_remote_classic_link VpcPeeringConnection#allow_vpc_to_remote_classic_link}.
         * @return {@code this}
         */
        public Builder allowVpcToRemoteClassicLink(java.lang.Boolean allowVpcToRemoteClassicLink) {
            this.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
            return this;
        }

        /**
         * Sets the value of {@link VpcPeeringConnectionAccepter#getAllowVpcToRemoteClassicLink}
         * @param allowVpcToRemoteClassicLink Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#allow_vpc_to_remote_classic_link VpcPeeringConnection#allow_vpc_to_remote_classic_link}.
         * @return {@code this}
         */
        public Builder allowVpcToRemoteClassicLink(com.hashicorp.cdktf.IResolvable allowVpcToRemoteClassicLink) {
            this.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VpcPeeringConnectionAccepter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VpcPeeringConnectionAccepter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link VpcPeeringConnectionAccepter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VpcPeeringConnectionAccepter {
        private final java.lang.Object allowClassicLinkToRemoteVpc;
        private final java.lang.Object allowRemoteVpcDnsResolution;
        private final java.lang.Object allowVpcToRemoteClassicLink;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allowClassicLinkToRemoteVpc = software.amazon.jsii.Kernel.get(this, "allowClassicLinkToRemoteVpc", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.allowRemoteVpcDnsResolution = software.amazon.jsii.Kernel.get(this, "allowRemoteVpcDnsResolution", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.allowVpcToRemoteClassicLink = software.amazon.jsii.Kernel.get(this, "allowVpcToRemoteClassicLink", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowClassicLinkToRemoteVpc = builder.allowClassicLinkToRemoteVpc;
            this.allowRemoteVpcDnsResolution = builder.allowRemoteVpcDnsResolution;
            this.allowVpcToRemoteClassicLink = builder.allowVpcToRemoteClassicLink;
        }

        @Override
        public final java.lang.Object getAllowClassicLinkToRemoteVpc() {
            return this.allowClassicLinkToRemoteVpc;
        }

        @Override
        public final java.lang.Object getAllowRemoteVpcDnsResolution() {
            return this.allowRemoteVpcDnsResolution;
        }

        @Override
        public final java.lang.Object getAllowVpcToRemoteClassicLink() {
            return this.allowVpcToRemoteClassicLink;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllowClassicLinkToRemoteVpc() != null) {
                data.set("allowClassicLinkToRemoteVpc", om.valueToTree(this.getAllowClassicLinkToRemoteVpc()));
            }
            if (this.getAllowRemoteVpcDnsResolution() != null) {
                data.set("allowRemoteVpcDnsResolution", om.valueToTree(this.getAllowRemoteVpcDnsResolution()));
            }
            if (this.getAllowVpcToRemoteClassicLink() != null) {
                data.set("allowVpcToRemoteClassicLink", om.valueToTree(this.getAllowVpcToRemoteClassicLink()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.vpc.VpcPeeringConnectionAccepter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VpcPeeringConnectionAccepter.Jsii$Proxy that = (VpcPeeringConnectionAccepter.Jsii$Proxy) o;

            if (this.allowClassicLinkToRemoteVpc != null ? !this.allowClassicLinkToRemoteVpc.equals(that.allowClassicLinkToRemoteVpc) : that.allowClassicLinkToRemoteVpc != null) return false;
            if (this.allowRemoteVpcDnsResolution != null ? !this.allowRemoteVpcDnsResolution.equals(that.allowRemoteVpcDnsResolution) : that.allowRemoteVpcDnsResolution != null) return false;
            return this.allowVpcToRemoteClassicLink != null ? this.allowVpcToRemoteClassicLink.equals(that.allowVpcToRemoteClassicLink) : that.allowVpcToRemoteClassicLink == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowClassicLinkToRemoteVpc != null ? this.allowClassicLinkToRemoteVpc.hashCode() : 0;
            result = 31 * result + (this.allowRemoteVpcDnsResolution != null ? this.allowRemoteVpcDnsResolution.hashCode() : 0);
            result = 31 * result + (this.allowVpcToRemoteClassicLink != null ? this.allowVpcToRemoteClassicLink.hashCode() : 0);
            return result;
        }
    }
}
