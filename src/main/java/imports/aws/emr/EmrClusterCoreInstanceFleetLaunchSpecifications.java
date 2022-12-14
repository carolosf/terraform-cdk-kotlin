package imports.aws.emr;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.674Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.emr.EmrClusterCoreInstanceFleetLaunchSpecifications")
@software.amazon.jsii.Jsii.Proxy(EmrClusterCoreInstanceFleetLaunchSpecifications.Jsii$Proxy.class)
public interface EmrClusterCoreInstanceFleetLaunchSpecifications extends software.amazon.jsii.JsiiSerializable {

    /**
     * on_demand_specification block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emr_cluster#on_demand_specification EmrCluster#on_demand_specification}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOnDemandSpecification() {
        return null;
    }

    /**
     * spot_specification block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emr_cluster#spot_specification EmrCluster#spot_specification}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSpotSpecification() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EmrClusterCoreInstanceFleetLaunchSpecifications}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EmrClusterCoreInstanceFleetLaunchSpecifications}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EmrClusterCoreInstanceFleetLaunchSpecifications> {
        java.lang.Object onDemandSpecification;
        java.lang.Object spotSpecification;

        /**
         * Sets the value of {@link EmrClusterCoreInstanceFleetLaunchSpecifications#getOnDemandSpecification}
         * @param onDemandSpecification on_demand_specification block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emr_cluster#on_demand_specification EmrCluster#on_demand_specification}
         * @return {@code this}
         */
        public Builder onDemandSpecification(com.hashicorp.cdktf.IResolvable onDemandSpecification) {
            this.onDemandSpecification = onDemandSpecification;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterCoreInstanceFleetLaunchSpecifications#getOnDemandSpecification}
         * @param onDemandSpecification on_demand_specification block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emr_cluster#on_demand_specification EmrCluster#on_demand_specification}
         * @return {@code this}
         */
        public Builder onDemandSpecification(java.util.List<? extends imports.aws.emr.EmrClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecification) {
            this.onDemandSpecification = onDemandSpecification;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterCoreInstanceFleetLaunchSpecifications#getSpotSpecification}
         * @param spotSpecification spot_specification block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emr_cluster#spot_specification EmrCluster#spot_specification}
         * @return {@code this}
         */
        public Builder spotSpecification(com.hashicorp.cdktf.IResolvable spotSpecification) {
            this.spotSpecification = spotSpecification;
            return this;
        }

        /**
         * Sets the value of {@link EmrClusterCoreInstanceFleetLaunchSpecifications#getSpotSpecification}
         * @param spotSpecification spot_specification block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emr_cluster#spot_specification EmrCluster#spot_specification}
         * @return {@code this}
         */
        public Builder spotSpecification(java.util.List<? extends imports.aws.emr.EmrClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification> spotSpecification) {
            this.spotSpecification = spotSpecification;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EmrClusterCoreInstanceFleetLaunchSpecifications}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EmrClusterCoreInstanceFleetLaunchSpecifications build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EmrClusterCoreInstanceFleetLaunchSpecifications}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EmrClusterCoreInstanceFleetLaunchSpecifications {
        private final java.lang.Object onDemandSpecification;
        private final java.lang.Object spotSpecification;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.onDemandSpecification = software.amazon.jsii.Kernel.get(this, "onDemandSpecification", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.spotSpecification = software.amazon.jsii.Kernel.get(this, "spotSpecification", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.onDemandSpecification = builder.onDemandSpecification;
            this.spotSpecification = builder.spotSpecification;
        }

        @Override
        public final java.lang.Object getOnDemandSpecification() {
            return this.onDemandSpecification;
        }

        @Override
        public final java.lang.Object getSpotSpecification() {
            return this.spotSpecification;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getOnDemandSpecification() != null) {
                data.set("onDemandSpecification", om.valueToTree(this.getOnDemandSpecification()));
            }
            if (this.getSpotSpecification() != null) {
                data.set("spotSpecification", om.valueToTree(this.getSpotSpecification()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.emr.EmrClusterCoreInstanceFleetLaunchSpecifications"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EmrClusterCoreInstanceFleetLaunchSpecifications.Jsii$Proxy that = (EmrClusterCoreInstanceFleetLaunchSpecifications.Jsii$Proxy) o;

            if (this.onDemandSpecification != null ? !this.onDemandSpecification.equals(that.onDemandSpecification) : that.onDemandSpecification != null) return false;
            return this.spotSpecification != null ? this.spotSpecification.equals(that.spotSpecification) : that.spotSpecification == null;
        }

        @Override
        public final int hashCode() {
            int result = this.onDemandSpecification != null ? this.onDemandSpecification.hashCode() : 0;
            result = 31 * result + (this.spotSpecification != null ? this.spotSpecification.hashCode() : 0);
            return result;
        }
    }
}
