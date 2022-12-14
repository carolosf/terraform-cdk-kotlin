package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.574Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget")
@software.amazon.jsii.Jsii.Proxy(SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget.Jsii$Proxy.class)
public interface SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/spot_instance_request#capacity_reservation_id SpotInstanceRequest#capacity_reservation_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCapacityReservationId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget> {
        java.lang.String capacityReservationId;

        /**
         * Sets the value of {@link SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget#getCapacityReservationId}
         * @param capacityReservationId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/spot_instance_request#capacity_reservation_id SpotInstanceRequest#capacity_reservation_id}.
         * @return {@code this}
         */
        public Builder capacityReservationId(java.lang.String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget {
        private final java.lang.String capacityReservationId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.capacityReservationId = software.amazon.jsii.Kernel.get(this, "capacityReservationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.capacityReservationId = builder.capacityReservationId;
        }

        @Override
        public final java.lang.String getCapacityReservationId() {
            return this.capacityReservationId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCapacityReservationId() != null) {
                data.set("capacityReservationId", om.valueToTree(this.getCapacityReservationId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ec2.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget.Jsii$Proxy that = (SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget.Jsii$Proxy) o;

            return this.capacityReservationId != null ? this.capacityReservationId.equals(that.capacityReservationId) : that.capacityReservationId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.capacityReservationId != null ? this.capacityReservationId.hashCode() : 0;
            return result;
        }
    }
}
