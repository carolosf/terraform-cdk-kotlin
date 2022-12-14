package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.890Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterBrokerNodeGroupInfo")
@software.amazon.jsii.Jsii.Proxy(MskClusterBrokerNodeGroupInfo.Jsii$Proxy.class)
public interface MskClusterBrokerNodeGroupInfo extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#client_subnets MskCluster#client_subnets}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getClientSubnets();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#ebs_volume_size MskCluster#ebs_volume_size}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getEbsVolumeSize();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#instance_type MskCluster#instance_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getInstanceType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#security_groups MskCluster#security_groups}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroups();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#az_distribution MskCluster#az_distribution}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAzDistribution() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskClusterBrokerNodeGroupInfo}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterBrokerNodeGroupInfo}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterBrokerNodeGroupInfo> {
        java.util.List<java.lang.String> clientSubnets;
        java.lang.Number ebsVolumeSize;
        java.lang.String instanceType;
        java.util.List<java.lang.String> securityGroups;
        java.lang.String azDistribution;

        /**
         * Sets the value of {@link MskClusterBrokerNodeGroupInfo#getClientSubnets}
         * @param clientSubnets Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#client_subnets MskCluster#client_subnets}. This parameter is required.
         * @return {@code this}
         */
        public Builder clientSubnets(java.util.List<java.lang.String> clientSubnets) {
            this.clientSubnets = clientSubnets;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterBrokerNodeGroupInfo#getEbsVolumeSize}
         * @param ebsVolumeSize Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#ebs_volume_size MskCluster#ebs_volume_size}. This parameter is required.
         * @return {@code this}
         */
        public Builder ebsVolumeSize(java.lang.Number ebsVolumeSize) {
            this.ebsVolumeSize = ebsVolumeSize;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterBrokerNodeGroupInfo#getInstanceType}
         * @param instanceType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#instance_type MskCluster#instance_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterBrokerNodeGroupInfo#getSecurityGroups}
         * @param securityGroups Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#security_groups MskCluster#security_groups}. This parameter is required.
         * @return {@code this}
         */
        public Builder securityGroups(java.util.List<java.lang.String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterBrokerNodeGroupInfo#getAzDistribution}
         * @param azDistribution Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#az_distribution MskCluster#az_distribution}.
         * @return {@code this}
         */
        public Builder azDistribution(java.lang.String azDistribution) {
            this.azDistribution = azDistribution;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskClusterBrokerNodeGroupInfo}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterBrokerNodeGroupInfo build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskClusterBrokerNodeGroupInfo}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterBrokerNodeGroupInfo {
        private final java.util.List<java.lang.String> clientSubnets;
        private final java.lang.Number ebsVolumeSize;
        private final java.lang.String instanceType;
        private final java.util.List<java.lang.String> securityGroups;
        private final java.lang.String azDistribution;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clientSubnets = software.amazon.jsii.Kernel.get(this, "clientSubnets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ebsVolumeSize = software.amazon.jsii.Kernel.get(this, "ebsVolumeSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityGroups = software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.azDistribution = software.amazon.jsii.Kernel.get(this, "azDistribution", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientSubnets = java.util.Objects.requireNonNull(builder.clientSubnets, "clientSubnets is required");
            this.ebsVolumeSize = java.util.Objects.requireNonNull(builder.ebsVolumeSize, "ebsVolumeSize is required");
            this.instanceType = java.util.Objects.requireNonNull(builder.instanceType, "instanceType is required");
            this.securityGroups = java.util.Objects.requireNonNull(builder.securityGroups, "securityGroups is required");
            this.azDistribution = builder.azDistribution;
        }

        @Override
        public final java.util.List<java.lang.String> getClientSubnets() {
            return this.clientSubnets;
        }

        @Override
        public final java.lang.Number getEbsVolumeSize() {
            return this.ebsVolumeSize;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroups() {
            return this.securityGroups;
        }

        @Override
        public final java.lang.String getAzDistribution() {
            return this.azDistribution;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("clientSubnets", om.valueToTree(this.getClientSubnets()));
            data.set("ebsVolumeSize", om.valueToTree(this.getEbsVolumeSize()));
            data.set("instanceType", om.valueToTree(this.getInstanceType()));
            data.set("securityGroups", om.valueToTree(this.getSecurityGroups()));
            if (this.getAzDistribution() != null) {
                data.set("azDistribution", om.valueToTree(this.getAzDistribution()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskClusterBrokerNodeGroupInfo"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterBrokerNodeGroupInfo.Jsii$Proxy that = (MskClusterBrokerNodeGroupInfo.Jsii$Proxy) o;

            if (!clientSubnets.equals(that.clientSubnets)) return false;
            if (!ebsVolumeSize.equals(that.ebsVolumeSize)) return false;
            if (!instanceType.equals(that.instanceType)) return false;
            if (!securityGroups.equals(that.securityGroups)) return false;
            return this.azDistribution != null ? this.azDistribution.equals(that.azDistribution) : that.azDistribution == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientSubnets.hashCode();
            result = 31 * result + (this.ebsVolumeSize.hashCode());
            result = 31 * result + (this.instanceType.hashCode());
            result = 31 * result + (this.securityGroups.hashCode());
            result = 31 * result + (this.azDistribution != null ? this.azDistribution.hashCode() : 0);
            return result;
        }
    }
}
