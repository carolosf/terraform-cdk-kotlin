package imports.aws.appautoscaling;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.136Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification")
@software.amazon.jsii.Jsii.Proxy(AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification.Jsii$Proxy.class)
public interface AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#predefined_metric_type AppautoscalingPolicy#predefined_metric_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPredefinedMetricType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#resource_label AppautoscalingPolicy#resource_label}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResourceLabel() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification> {
        java.lang.String predefinedMetricType;
        java.lang.String resourceLabel;

        /**
         * Sets the value of {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification#getPredefinedMetricType}
         * @param predefinedMetricType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#predefined_metric_type AppautoscalingPolicy#predefined_metric_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder predefinedMetricType(java.lang.String predefinedMetricType) {
            this.predefinedMetricType = predefinedMetricType;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification#getResourceLabel}
         * @param resourceLabel Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#resource_label AppautoscalingPolicy#resource_label}.
         * @return {@code this}
         */
        public Builder resourceLabel(java.lang.String resourceLabel) {
            this.resourceLabel = resourceLabel;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification {
        private final java.lang.String predefinedMetricType;
        private final java.lang.String resourceLabel;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.predefinedMetricType = software.amazon.jsii.Kernel.get(this, "predefinedMetricType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceLabel = software.amazon.jsii.Kernel.get(this, "resourceLabel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.predefinedMetricType = java.util.Objects.requireNonNull(builder.predefinedMetricType, "predefinedMetricType is required");
            this.resourceLabel = builder.resourceLabel;
        }

        @Override
        public final java.lang.String getPredefinedMetricType() {
            return this.predefinedMetricType;
        }

        @Override
        public final java.lang.String getResourceLabel() {
            return this.resourceLabel;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("predefinedMetricType", om.valueToTree(this.getPredefinedMetricType()));
            if (this.getResourceLabel() != null) {
                data.set("resourceLabel", om.valueToTree(this.getResourceLabel()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification.Jsii$Proxy that = (AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification.Jsii$Proxy) o;

            if (!predefinedMetricType.equals(that.predefinedMetricType)) return false;
            return this.resourceLabel != null ? this.resourceLabel.equals(that.resourceLabel) : that.resourceLabel == null;
        }

        @Override
        public final int hashCode() {
            int result = this.predefinedMetricType.hashCode();
            result = 31 * result + (this.resourceLabel != null ? this.resourceLabel.hashCode() : 0);
            return result;
        }
    }
}
