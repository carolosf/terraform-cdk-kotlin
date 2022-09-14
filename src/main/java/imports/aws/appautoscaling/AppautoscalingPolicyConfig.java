package imports.aws.appautoscaling;

/**
 * AWS AppAutoScaling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.135Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appautoscaling.AppautoscalingPolicyConfig")
@software.amazon.jsii.Jsii.Proxy(AppautoscalingPolicyConfig.Jsii$Proxy.class)
public interface AppautoscalingPolicyConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#name AppautoscalingPolicy#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#resource_id AppautoscalingPolicy#resource_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getResourceId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#scalable_dimension AppautoscalingPolicy#scalable_dimension}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getScalableDimension();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#service_namespace AppautoscalingPolicy#service_namespace}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getServiceNamespace();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#id AppautoscalingPolicy#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#policy_type AppautoscalingPolicy#policy_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicyType() {
        return null;
    }

    /**
     * step_scaling_policy_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#step_scaling_policy_configuration AppautoscalingPolicy#step_scaling_policy_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appautoscaling.AppautoscalingPolicyStepScalingPolicyConfiguration getStepScalingPolicyConfiguration() {
        return null;
    }

    /**
     * target_tracking_scaling_policy_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#target_tracking_scaling_policy_configuration AppautoscalingPolicy#target_tracking_scaling_policy_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration getTargetTrackingScalingPolicyConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppautoscalingPolicyConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppautoscalingPolicyConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppautoscalingPolicyConfig> {
        java.lang.String name;
        java.lang.String resourceId;
        java.lang.String scalableDimension;
        java.lang.String serviceNamespace;
        java.lang.String id;
        java.lang.String policyType;
        imports.aws.appautoscaling.AppautoscalingPolicyStepScalingPolicyConfiguration stepScalingPolicyConfiguration;
        imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#name AppautoscalingPolicy#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getResourceId}
         * @param resourceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#resource_id AppautoscalingPolicy#resource_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder resourceId(java.lang.String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getScalableDimension}
         * @param scalableDimension Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#scalable_dimension AppautoscalingPolicy#scalable_dimension}. This parameter is required.
         * @return {@code this}
         */
        public Builder scalableDimension(java.lang.String scalableDimension) {
            this.scalableDimension = scalableDimension;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getServiceNamespace}
         * @param serviceNamespace Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#service_namespace AppautoscalingPolicy#service_namespace}. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceNamespace(java.lang.String serviceNamespace) {
            this.serviceNamespace = serviceNamespace;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#id AppautoscalingPolicy#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getPolicyType}
         * @param policyType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#policy_type AppautoscalingPolicy#policy_type}.
         * @return {@code this}
         */
        public Builder policyType(java.lang.String policyType) {
            this.policyType = policyType;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getStepScalingPolicyConfiguration}
         * @param stepScalingPolicyConfiguration step_scaling_policy_configuration block.
         *                                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#step_scaling_policy_configuration AppautoscalingPolicy#step_scaling_policy_configuration}
         * @return {@code this}
         */
        public Builder stepScalingPolicyConfiguration(imports.aws.appautoscaling.AppautoscalingPolicyStepScalingPolicyConfiguration stepScalingPolicyConfiguration) {
            this.stepScalingPolicyConfiguration = stepScalingPolicyConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getTargetTrackingScalingPolicyConfiguration}
         * @param targetTrackingScalingPolicyConfiguration target_tracking_scaling_policy_configuration block.
         *                                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#target_tracking_scaling_policy_configuration AppautoscalingPolicy#target_tracking_scaling_policy_configuration}
         * @return {@code this}
         */
        public Builder targetTrackingScalingPolicyConfiguration(imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration) {
            this.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link AppautoscalingPolicyConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppautoscalingPolicyConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppautoscalingPolicyConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppautoscalingPolicyConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppautoscalingPolicyConfig {
        private final java.lang.String name;
        private final java.lang.String resourceId;
        private final java.lang.String scalableDimension;
        private final java.lang.String serviceNamespace;
        private final java.lang.String id;
        private final java.lang.String policyType;
        private final imports.aws.appautoscaling.AppautoscalingPolicyStepScalingPolicyConfiguration stepScalingPolicyConfiguration;
        private final imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceId = software.amazon.jsii.Kernel.get(this, "resourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scalableDimension = software.amazon.jsii.Kernel.get(this, "scalableDimension", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceNamespace = software.amazon.jsii.Kernel.get(this, "serviceNamespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyType = software.amazon.jsii.Kernel.get(this, "policyType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stepScalingPolicyConfiguration = software.amazon.jsii.Kernel.get(this, "stepScalingPolicyConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.appautoscaling.AppautoscalingPolicyStepScalingPolicyConfiguration.class));
            this.targetTrackingScalingPolicyConfiguration = software.amazon.jsii.Kernel.get(this, "targetTrackingScalingPolicyConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.resourceId = java.util.Objects.requireNonNull(builder.resourceId, "resourceId is required");
            this.scalableDimension = java.util.Objects.requireNonNull(builder.scalableDimension, "scalableDimension is required");
            this.serviceNamespace = java.util.Objects.requireNonNull(builder.serviceNamespace, "serviceNamespace is required");
            this.id = builder.id;
            this.policyType = builder.policyType;
            this.stepScalingPolicyConfiguration = builder.stepScalingPolicyConfiguration;
            this.targetTrackingScalingPolicyConfiguration = builder.targetTrackingScalingPolicyConfiguration;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        @Override
        public final java.lang.String getScalableDimension() {
            return this.scalableDimension;
        }

        @Override
        public final java.lang.String getServiceNamespace() {
            return this.serviceNamespace;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getPolicyType() {
            return this.policyType;
        }

        @Override
        public final imports.aws.appautoscaling.AppautoscalingPolicyStepScalingPolicyConfiguration getStepScalingPolicyConfiguration() {
            return this.stepScalingPolicyConfiguration;
        }

        @Override
        public final imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration getTargetTrackingScalingPolicyConfiguration() {
            return this.targetTrackingScalingPolicyConfiguration;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("resourceId", om.valueToTree(this.getResourceId()));
            data.set("scalableDimension", om.valueToTree(this.getScalableDimension()));
            data.set("serviceNamespace", om.valueToTree(this.getServiceNamespace()));
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getPolicyType() != null) {
                data.set("policyType", om.valueToTree(this.getPolicyType()));
            }
            if (this.getStepScalingPolicyConfiguration() != null) {
                data.set("stepScalingPolicyConfiguration", om.valueToTree(this.getStepScalingPolicyConfiguration()));
            }
            if (this.getTargetTrackingScalingPolicyConfiguration() != null) {
                data.set("targetTrackingScalingPolicyConfiguration", om.valueToTree(this.getTargetTrackingScalingPolicyConfiguration()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appautoscaling.AppautoscalingPolicyConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppautoscalingPolicyConfig.Jsii$Proxy that = (AppautoscalingPolicyConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!resourceId.equals(that.resourceId)) return false;
            if (!scalableDimension.equals(that.scalableDimension)) return false;
            if (!serviceNamespace.equals(that.serviceNamespace)) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.policyType != null ? !this.policyType.equals(that.policyType) : that.policyType != null) return false;
            if (this.stepScalingPolicyConfiguration != null ? !this.stepScalingPolicyConfiguration.equals(that.stepScalingPolicyConfiguration) : that.stepScalingPolicyConfiguration != null) return false;
            if (this.targetTrackingScalingPolicyConfiguration != null ? !this.targetTrackingScalingPolicyConfiguration.equals(that.targetTrackingScalingPolicyConfiguration) : that.targetTrackingScalingPolicyConfiguration != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.resourceId.hashCode());
            result = 31 * result + (this.scalableDimension.hashCode());
            result = 31 * result + (this.serviceNamespace.hashCode());
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.policyType != null ? this.policyType.hashCode() : 0);
            result = 31 * result + (this.stepScalingPolicyConfiguration != null ? this.stepScalingPolicyConfiguration.hashCode() : 0);
            result = 31 * result + (this.targetTrackingScalingPolicyConfiguration != null ? this.targetTrackingScalingPolicyConfiguration.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}