package imports.aws.ecs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.595Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsServiceOrderedPlacementStrategy")
@software.amazon.jsii.Jsii.Proxy(EcsServiceOrderedPlacementStrategy.Jsii$Proxy.class)
public interface EcsServiceOrderedPlacementStrategy extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#type EcsService#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#field EcsService#field}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getField() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsServiceOrderedPlacementStrategy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsServiceOrderedPlacementStrategy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsServiceOrderedPlacementStrategy> {
        java.lang.String type;
        java.lang.String field;

        /**
         * Sets the value of {@link EcsServiceOrderedPlacementStrategy#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#type EcsService#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceOrderedPlacementStrategy#getField}
         * @param field Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#field EcsService#field}.
         * @return {@code this}
         */
        public Builder field(java.lang.String field) {
            this.field = field;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EcsServiceOrderedPlacementStrategy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsServiceOrderedPlacementStrategy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EcsServiceOrderedPlacementStrategy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsServiceOrderedPlacementStrategy {
        private final java.lang.String type;
        private final java.lang.String field;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.field = software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.field = builder.field;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getField() {
            return this.field;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getField() != null) {
                data.set("field", om.valueToTree(this.getField()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ecs.EcsServiceOrderedPlacementStrategy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsServiceOrderedPlacementStrategy.Jsii$Proxy that = (EcsServiceOrderedPlacementStrategy.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.field != null ? this.field.equals(that.field) : that.field == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.field != null ? this.field.hashCode() : 0);
            return result;
        }
    }
}
