package imports.aws.ecs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.597Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsTaskDefinitionPlacementConstraints")
@software.amazon.jsii.Jsii.Proxy(EcsTaskDefinitionPlacementConstraints.Jsii$Proxy.class)
public interface EcsTaskDefinitionPlacementConstraints extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#type EcsTaskDefinition#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#expression EcsTaskDefinition#expression}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExpression() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsTaskDefinitionPlacementConstraints}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsTaskDefinitionPlacementConstraints}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsTaskDefinitionPlacementConstraints> {
        java.lang.String type;
        java.lang.String expression;

        /**
         * Sets the value of {@link EcsTaskDefinitionPlacementConstraints#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#type EcsTaskDefinition#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionPlacementConstraints#getExpression}
         * @param expression Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#expression EcsTaskDefinition#expression}.
         * @return {@code this}
         */
        public Builder expression(java.lang.String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EcsTaskDefinitionPlacementConstraints}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsTaskDefinitionPlacementConstraints build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EcsTaskDefinitionPlacementConstraints}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsTaskDefinitionPlacementConstraints {
        private final java.lang.String type;
        private final java.lang.String expression;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.expression = software.amazon.jsii.Kernel.get(this, "expression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.expression = builder.expression;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getExpression() {
            return this.expression;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getExpression() != null) {
                data.set("expression", om.valueToTree(this.getExpression()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ecs.EcsTaskDefinitionPlacementConstraints"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsTaskDefinitionPlacementConstraints.Jsii$Proxy that = (EcsTaskDefinitionPlacementConstraints.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.expression != null ? this.expression.equals(that.expression) : that.expression == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.expression != null ? this.expression.hashCode() : 0);
            return result;
        }
    }
}
