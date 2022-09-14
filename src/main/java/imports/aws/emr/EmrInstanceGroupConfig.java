package imports.aws.emr;

/**
 * AWS Elastic MapReduce.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.683Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.emr.EmrInstanceGroupConfig")
@software.amazon.jsii.Jsii.Proxy(EmrInstanceGroupConfig.Jsii$Proxy.class)
public interface EmrInstanceGroupConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#cluster_id EmrInstanceGroup#cluster_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getClusterId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#instance_type EmrInstanceGroup#instance_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getInstanceType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#autoscaling_policy EmrInstanceGroup#autoscaling_policy}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAutoscalingPolicy() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#bid_price EmrInstanceGroup#bid_price}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBidPrice() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#configurations_json EmrInstanceGroup#configurations_json}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getConfigurationsJson() {
        return null;
    }

    /**
     * ebs_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#ebs_config EmrInstanceGroup#ebs_config}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEbsConfig() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#ebs_optimized EmrInstanceGroup#ebs_optimized}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEbsOptimized() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#id EmrInstanceGroup#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#instance_count EmrInstanceGroup#instance_count}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getInstanceCount() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#name EmrInstanceGroup#name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EmrInstanceGroupConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EmrInstanceGroupConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EmrInstanceGroupConfig> {
        java.lang.String clusterId;
        java.lang.String instanceType;
        java.lang.String autoscalingPolicy;
        java.lang.String bidPrice;
        java.lang.String configurationsJson;
        java.lang.Object ebsConfig;
        java.lang.Object ebsOptimized;
        java.lang.String id;
        java.lang.Number instanceCount;
        java.lang.String name;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getClusterId}
         * @param clusterId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#cluster_id EmrInstanceGroup#cluster_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder clusterId(java.lang.String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getInstanceType}
         * @param instanceType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#instance_type EmrInstanceGroup#instance_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getAutoscalingPolicy}
         * @param autoscalingPolicy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#autoscaling_policy EmrInstanceGroup#autoscaling_policy}.
         * @return {@code this}
         */
        public Builder autoscalingPolicy(java.lang.String autoscalingPolicy) {
            this.autoscalingPolicy = autoscalingPolicy;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getBidPrice}
         * @param bidPrice Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#bid_price EmrInstanceGroup#bid_price}.
         * @return {@code this}
         */
        public Builder bidPrice(java.lang.String bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getConfigurationsJson}
         * @param configurationsJson Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#configurations_json EmrInstanceGroup#configurations_json}.
         * @return {@code this}
         */
        public Builder configurationsJson(java.lang.String configurationsJson) {
            this.configurationsJson = configurationsJson;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getEbsConfig}
         * @param ebsConfig ebs_config block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#ebs_config EmrInstanceGroup#ebs_config}
         * @return {@code this}
         */
        public Builder ebsConfig(com.hashicorp.cdktf.IResolvable ebsConfig) {
            this.ebsConfig = ebsConfig;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getEbsConfig}
         * @param ebsConfig ebs_config block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#ebs_config EmrInstanceGroup#ebs_config}
         * @return {@code this}
         */
        public Builder ebsConfig(java.util.List<? extends imports.aws.emr.EmrInstanceGroupEbsConfig> ebsConfig) {
            this.ebsConfig = ebsConfig;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getEbsOptimized}
         * @param ebsOptimized Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#ebs_optimized EmrInstanceGroup#ebs_optimized}.
         * @return {@code this}
         */
        public Builder ebsOptimized(java.lang.Boolean ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getEbsOptimized}
         * @param ebsOptimized Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#ebs_optimized EmrInstanceGroup#ebs_optimized}.
         * @return {@code this}
         */
        public Builder ebsOptimized(com.hashicorp.cdktf.IResolvable ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#id EmrInstanceGroup#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getInstanceCount}
         * @param instanceCount Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#instance_count EmrInstanceGroup#instance_count}.
         * @return {@code this}
         */
        public Builder instanceCount(java.lang.Number instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_group#name EmrInstanceGroup#name}.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getDependsOn}
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
         * Sets the value of {@link EmrInstanceGroupConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceGroupConfig#getProvisioners}
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
         * @return a new instance of {@link EmrInstanceGroupConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EmrInstanceGroupConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EmrInstanceGroupConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EmrInstanceGroupConfig {
        private final java.lang.String clusterId;
        private final java.lang.String instanceType;
        private final java.lang.String autoscalingPolicy;
        private final java.lang.String bidPrice;
        private final java.lang.String configurationsJson;
        private final java.lang.Object ebsConfig;
        private final java.lang.Object ebsOptimized;
        private final java.lang.String id;
        private final java.lang.Number instanceCount;
        private final java.lang.String name;
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
            this.clusterId = software.amazon.jsii.Kernel.get(this, "clusterId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.autoscalingPolicy = software.amazon.jsii.Kernel.get(this, "autoscalingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bidPrice = software.amazon.jsii.Kernel.get(this, "bidPrice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.configurationsJson = software.amazon.jsii.Kernel.get(this, "configurationsJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ebsConfig = software.amazon.jsii.Kernel.get(this, "ebsConfig", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.ebsOptimized = software.amazon.jsii.Kernel.get(this, "ebsOptimized", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceCount = software.amazon.jsii.Kernel.get(this, "instanceCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.clusterId = java.util.Objects.requireNonNull(builder.clusterId, "clusterId is required");
            this.instanceType = java.util.Objects.requireNonNull(builder.instanceType, "instanceType is required");
            this.autoscalingPolicy = builder.autoscalingPolicy;
            this.bidPrice = builder.bidPrice;
            this.configurationsJson = builder.configurationsJson;
            this.ebsConfig = builder.ebsConfig;
            this.ebsOptimized = builder.ebsOptimized;
            this.id = builder.id;
            this.instanceCount = builder.instanceCount;
            this.name = builder.name;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getClusterId() {
            return this.clusterId;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.lang.String getAutoscalingPolicy() {
            return this.autoscalingPolicy;
        }

        @Override
        public final java.lang.String getBidPrice() {
            return this.bidPrice;
        }

        @Override
        public final java.lang.String getConfigurationsJson() {
            return this.configurationsJson;
        }

        @Override
        public final java.lang.Object getEbsConfig() {
            return this.ebsConfig;
        }

        @Override
        public final java.lang.Object getEbsOptimized() {
            return this.ebsOptimized;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Number getInstanceCount() {
            return this.instanceCount;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
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

            data.set("clusterId", om.valueToTree(this.getClusterId()));
            data.set("instanceType", om.valueToTree(this.getInstanceType()));
            if (this.getAutoscalingPolicy() != null) {
                data.set("autoscalingPolicy", om.valueToTree(this.getAutoscalingPolicy()));
            }
            if (this.getBidPrice() != null) {
                data.set("bidPrice", om.valueToTree(this.getBidPrice()));
            }
            if (this.getConfigurationsJson() != null) {
                data.set("configurationsJson", om.valueToTree(this.getConfigurationsJson()));
            }
            if (this.getEbsConfig() != null) {
                data.set("ebsConfig", om.valueToTree(this.getEbsConfig()));
            }
            if (this.getEbsOptimized() != null) {
                data.set("ebsOptimized", om.valueToTree(this.getEbsOptimized()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getInstanceCount() != null) {
                data.set("instanceCount", om.valueToTree(this.getInstanceCount()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.emr.EmrInstanceGroupConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EmrInstanceGroupConfig.Jsii$Proxy that = (EmrInstanceGroupConfig.Jsii$Proxy) o;

            if (!clusterId.equals(that.clusterId)) return false;
            if (!instanceType.equals(that.instanceType)) return false;
            if (this.autoscalingPolicy != null ? !this.autoscalingPolicy.equals(that.autoscalingPolicy) : that.autoscalingPolicy != null) return false;
            if (this.bidPrice != null ? !this.bidPrice.equals(that.bidPrice) : that.bidPrice != null) return false;
            if (this.configurationsJson != null ? !this.configurationsJson.equals(that.configurationsJson) : that.configurationsJson != null) return false;
            if (this.ebsConfig != null ? !this.ebsConfig.equals(that.ebsConfig) : that.ebsConfig != null) return false;
            if (this.ebsOptimized != null ? !this.ebsOptimized.equals(that.ebsOptimized) : that.ebsOptimized != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.instanceCount != null ? !this.instanceCount.equals(that.instanceCount) : that.instanceCount != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
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
            int result = this.clusterId.hashCode();
            result = 31 * result + (this.instanceType.hashCode());
            result = 31 * result + (this.autoscalingPolicy != null ? this.autoscalingPolicy.hashCode() : 0);
            result = 31 * result + (this.bidPrice != null ? this.bidPrice.hashCode() : 0);
            result = 31 * result + (this.configurationsJson != null ? this.configurationsJson.hashCode() : 0);
            result = 31 * result + (this.ebsConfig != null ? this.ebsConfig.hashCode() : 0);
            result = 31 * result + (this.ebsOptimized != null ? this.ebsOptimized.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.instanceCount != null ? this.instanceCount.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
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