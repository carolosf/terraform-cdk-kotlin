package imports.aws.opsworks;

/**
 * AWS OpsWorks.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.935Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.opsworks.OpsworksJavaAppLayerConfig")
@software.amazon.jsii.Jsii.Proxy(OpsworksJavaAppLayerConfig.Jsii$Proxy.class)
public interface OpsworksJavaAppLayerConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#stack_id OpsworksJavaAppLayer#stack_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStackId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#app_server OpsworksJavaAppLayer#app_server}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAppServer() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#app_server_version OpsworksJavaAppLayer#app_server_version}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAppServerVersion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#auto_assign_elastic_ips OpsworksJavaAppLayer#auto_assign_elastic_ips}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAutoAssignElasticIps() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#auto_assign_public_ips OpsworksJavaAppLayer#auto_assign_public_ips}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAutoAssignPublicIps() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#auto_healing OpsworksJavaAppLayer#auto_healing}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAutoHealing() {
        return null;
    }

    /**
     * cloudwatch_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#cloudwatch_configuration OpsworksJavaAppLayer#cloudwatch_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.opsworks.OpsworksJavaAppLayerCloudwatchConfiguration getCloudwatchConfiguration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_configure_recipes OpsworksJavaAppLayer#custom_configure_recipes}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomConfigureRecipes() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_deploy_recipes OpsworksJavaAppLayer#custom_deploy_recipes}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomDeployRecipes() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_instance_profile_arn OpsworksJavaAppLayer#custom_instance_profile_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCustomInstanceProfileArn() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_json OpsworksJavaAppLayer#custom_json}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCustomJson() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_security_group_ids OpsworksJavaAppLayer#custom_security_group_ids}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomSecurityGroupIds() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_setup_recipes OpsworksJavaAppLayer#custom_setup_recipes}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomSetupRecipes() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_shutdown_recipes OpsworksJavaAppLayer#custom_shutdown_recipes}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomShutdownRecipes() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_undeploy_recipes OpsworksJavaAppLayer#custom_undeploy_recipes}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomUndeployRecipes() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#drain_elb_on_shutdown OpsworksJavaAppLayer#drain_elb_on_shutdown}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDrainElbOnShutdown() {
        return null;
    }

    /**
     * ebs_volume block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#ebs_volume OpsworksJavaAppLayer#ebs_volume}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEbsVolume() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#elastic_load_balancer OpsworksJavaAppLayer#elastic_load_balancer}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getElasticLoadBalancer() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#id OpsworksJavaAppLayer#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#install_updates_on_boot OpsworksJavaAppLayer#install_updates_on_boot}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getInstallUpdatesOnBoot() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#instance_shutdown_timeout OpsworksJavaAppLayer#instance_shutdown_timeout}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getInstanceShutdownTimeout() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#jvm_options OpsworksJavaAppLayer#jvm_options}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getJvmOptions() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#jvm_type OpsworksJavaAppLayer#jvm_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getJvmType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#jvm_version OpsworksJavaAppLayer#jvm_version}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getJvmVersion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#name OpsworksJavaAppLayer#name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#system_packages OpsworksJavaAppLayer#system_packages}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSystemPackages() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#tags OpsworksJavaAppLayer#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#tags_all OpsworksJavaAppLayer#tags_all}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#use_ebs_optimized_instances OpsworksJavaAppLayer#use_ebs_optimized_instances}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getUseEbsOptimizedInstances() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OpsworksJavaAppLayerConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpsworksJavaAppLayerConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpsworksJavaAppLayerConfig> {
        java.lang.String stackId;
        java.lang.String appServer;
        java.lang.String appServerVersion;
        java.lang.Object autoAssignElasticIps;
        java.lang.Object autoAssignPublicIps;
        java.lang.Object autoHealing;
        imports.aws.opsworks.OpsworksJavaAppLayerCloudwatchConfiguration cloudwatchConfiguration;
        java.util.List<java.lang.String> customConfigureRecipes;
        java.util.List<java.lang.String> customDeployRecipes;
        java.lang.String customInstanceProfileArn;
        java.lang.String customJson;
        java.util.List<java.lang.String> customSecurityGroupIds;
        java.util.List<java.lang.String> customSetupRecipes;
        java.util.List<java.lang.String> customShutdownRecipes;
        java.util.List<java.lang.String> customUndeployRecipes;
        java.lang.Object drainElbOnShutdown;
        java.lang.Object ebsVolume;
        java.lang.String elasticLoadBalancer;
        java.lang.String id;
        java.lang.Object installUpdatesOnBoot;
        java.lang.Number instanceShutdownTimeout;
        java.lang.String jvmOptions;
        java.lang.String jvmType;
        java.lang.String jvmVersion;
        java.lang.String name;
        java.util.List<java.lang.String> systemPackages;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.Map<java.lang.String, java.lang.String> tagsAll;
        java.lang.Object useEbsOptimizedInstances;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getStackId}
         * @param stackId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#stack_id OpsworksJavaAppLayer#stack_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder stackId(java.lang.String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAppServer}
         * @param appServer Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#app_server OpsworksJavaAppLayer#app_server}.
         * @return {@code this}
         */
        public Builder appServer(java.lang.String appServer) {
            this.appServer = appServer;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAppServerVersion}
         * @param appServerVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#app_server_version OpsworksJavaAppLayer#app_server_version}.
         * @return {@code this}
         */
        public Builder appServerVersion(java.lang.String appServerVersion) {
            this.appServerVersion = appServerVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAutoAssignElasticIps}
         * @param autoAssignElasticIps Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#auto_assign_elastic_ips OpsworksJavaAppLayer#auto_assign_elastic_ips}.
         * @return {@code this}
         */
        public Builder autoAssignElasticIps(java.lang.Boolean autoAssignElasticIps) {
            this.autoAssignElasticIps = autoAssignElasticIps;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAutoAssignElasticIps}
         * @param autoAssignElasticIps Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#auto_assign_elastic_ips OpsworksJavaAppLayer#auto_assign_elastic_ips}.
         * @return {@code this}
         */
        public Builder autoAssignElasticIps(com.hashicorp.cdktf.IResolvable autoAssignElasticIps) {
            this.autoAssignElasticIps = autoAssignElasticIps;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAutoAssignPublicIps}
         * @param autoAssignPublicIps Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#auto_assign_public_ips OpsworksJavaAppLayer#auto_assign_public_ips}.
         * @return {@code this}
         */
        public Builder autoAssignPublicIps(java.lang.Boolean autoAssignPublicIps) {
            this.autoAssignPublicIps = autoAssignPublicIps;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAutoAssignPublicIps}
         * @param autoAssignPublicIps Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#auto_assign_public_ips OpsworksJavaAppLayer#auto_assign_public_ips}.
         * @return {@code this}
         */
        public Builder autoAssignPublicIps(com.hashicorp.cdktf.IResolvable autoAssignPublicIps) {
            this.autoAssignPublicIps = autoAssignPublicIps;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAutoHealing}
         * @param autoHealing Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#auto_healing OpsworksJavaAppLayer#auto_healing}.
         * @return {@code this}
         */
        public Builder autoHealing(java.lang.Boolean autoHealing) {
            this.autoHealing = autoHealing;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getAutoHealing}
         * @param autoHealing Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#auto_healing OpsworksJavaAppLayer#auto_healing}.
         * @return {@code this}
         */
        public Builder autoHealing(com.hashicorp.cdktf.IResolvable autoHealing) {
            this.autoHealing = autoHealing;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCloudwatchConfiguration}
         * @param cloudwatchConfiguration cloudwatch_configuration block.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#cloudwatch_configuration OpsworksJavaAppLayer#cloudwatch_configuration}
         * @return {@code this}
         */
        public Builder cloudwatchConfiguration(imports.aws.opsworks.OpsworksJavaAppLayerCloudwatchConfiguration cloudwatchConfiguration) {
            this.cloudwatchConfiguration = cloudwatchConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomConfigureRecipes}
         * @param customConfigureRecipes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_configure_recipes OpsworksJavaAppLayer#custom_configure_recipes}.
         * @return {@code this}
         */
        public Builder customConfigureRecipes(java.util.List<java.lang.String> customConfigureRecipes) {
            this.customConfigureRecipes = customConfigureRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomDeployRecipes}
         * @param customDeployRecipes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_deploy_recipes OpsworksJavaAppLayer#custom_deploy_recipes}.
         * @return {@code this}
         */
        public Builder customDeployRecipes(java.util.List<java.lang.String> customDeployRecipes) {
            this.customDeployRecipes = customDeployRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomInstanceProfileArn}
         * @param customInstanceProfileArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_instance_profile_arn OpsworksJavaAppLayer#custom_instance_profile_arn}.
         * @return {@code this}
         */
        public Builder customInstanceProfileArn(java.lang.String customInstanceProfileArn) {
            this.customInstanceProfileArn = customInstanceProfileArn;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomJson}
         * @param customJson Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_json OpsworksJavaAppLayer#custom_json}.
         * @return {@code this}
         */
        public Builder customJson(java.lang.String customJson) {
            this.customJson = customJson;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomSecurityGroupIds}
         * @param customSecurityGroupIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_security_group_ids OpsworksJavaAppLayer#custom_security_group_ids}.
         * @return {@code this}
         */
        public Builder customSecurityGroupIds(java.util.List<java.lang.String> customSecurityGroupIds) {
            this.customSecurityGroupIds = customSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomSetupRecipes}
         * @param customSetupRecipes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_setup_recipes OpsworksJavaAppLayer#custom_setup_recipes}.
         * @return {@code this}
         */
        public Builder customSetupRecipes(java.util.List<java.lang.String> customSetupRecipes) {
            this.customSetupRecipes = customSetupRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomShutdownRecipes}
         * @param customShutdownRecipes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_shutdown_recipes OpsworksJavaAppLayer#custom_shutdown_recipes}.
         * @return {@code this}
         */
        public Builder customShutdownRecipes(java.util.List<java.lang.String> customShutdownRecipes) {
            this.customShutdownRecipes = customShutdownRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCustomUndeployRecipes}
         * @param customUndeployRecipes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#custom_undeploy_recipes OpsworksJavaAppLayer#custom_undeploy_recipes}.
         * @return {@code this}
         */
        public Builder customUndeployRecipes(java.util.List<java.lang.String> customUndeployRecipes) {
            this.customUndeployRecipes = customUndeployRecipes;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getDrainElbOnShutdown}
         * @param drainElbOnShutdown Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#drain_elb_on_shutdown OpsworksJavaAppLayer#drain_elb_on_shutdown}.
         * @return {@code this}
         */
        public Builder drainElbOnShutdown(java.lang.Boolean drainElbOnShutdown) {
            this.drainElbOnShutdown = drainElbOnShutdown;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getDrainElbOnShutdown}
         * @param drainElbOnShutdown Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#drain_elb_on_shutdown OpsworksJavaAppLayer#drain_elb_on_shutdown}.
         * @return {@code this}
         */
        public Builder drainElbOnShutdown(com.hashicorp.cdktf.IResolvable drainElbOnShutdown) {
            this.drainElbOnShutdown = drainElbOnShutdown;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getEbsVolume}
         * @param ebsVolume ebs_volume block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#ebs_volume OpsworksJavaAppLayer#ebs_volume}
         * @return {@code this}
         */
        public Builder ebsVolume(com.hashicorp.cdktf.IResolvable ebsVolume) {
            this.ebsVolume = ebsVolume;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getEbsVolume}
         * @param ebsVolume ebs_volume block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#ebs_volume OpsworksJavaAppLayer#ebs_volume}
         * @return {@code this}
         */
        public Builder ebsVolume(java.util.List<? extends imports.aws.opsworks.OpsworksJavaAppLayerEbsVolume> ebsVolume) {
            this.ebsVolume = ebsVolume;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getElasticLoadBalancer}
         * @param elasticLoadBalancer Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#elastic_load_balancer OpsworksJavaAppLayer#elastic_load_balancer}.
         * @return {@code this}
         */
        public Builder elasticLoadBalancer(java.lang.String elasticLoadBalancer) {
            this.elasticLoadBalancer = elasticLoadBalancer;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#id OpsworksJavaAppLayer#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getInstallUpdatesOnBoot}
         * @param installUpdatesOnBoot Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#install_updates_on_boot OpsworksJavaAppLayer#install_updates_on_boot}.
         * @return {@code this}
         */
        public Builder installUpdatesOnBoot(java.lang.Boolean installUpdatesOnBoot) {
            this.installUpdatesOnBoot = installUpdatesOnBoot;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getInstallUpdatesOnBoot}
         * @param installUpdatesOnBoot Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#install_updates_on_boot OpsworksJavaAppLayer#install_updates_on_boot}.
         * @return {@code this}
         */
        public Builder installUpdatesOnBoot(com.hashicorp.cdktf.IResolvable installUpdatesOnBoot) {
            this.installUpdatesOnBoot = installUpdatesOnBoot;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getInstanceShutdownTimeout}
         * @param instanceShutdownTimeout Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#instance_shutdown_timeout OpsworksJavaAppLayer#instance_shutdown_timeout}.
         * @return {@code this}
         */
        public Builder instanceShutdownTimeout(java.lang.Number instanceShutdownTimeout) {
            this.instanceShutdownTimeout = instanceShutdownTimeout;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getJvmOptions}
         * @param jvmOptions Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#jvm_options OpsworksJavaAppLayer#jvm_options}.
         * @return {@code this}
         */
        public Builder jvmOptions(java.lang.String jvmOptions) {
            this.jvmOptions = jvmOptions;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getJvmType}
         * @param jvmType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#jvm_type OpsworksJavaAppLayer#jvm_type}.
         * @return {@code this}
         */
        public Builder jvmType(java.lang.String jvmType) {
            this.jvmType = jvmType;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getJvmVersion}
         * @param jvmVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#jvm_version OpsworksJavaAppLayer#jvm_version}.
         * @return {@code this}
         */
        public Builder jvmVersion(java.lang.String jvmVersion) {
            this.jvmVersion = jvmVersion;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#name OpsworksJavaAppLayer#name}.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getSystemPackages}
         * @param systemPackages Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#system_packages OpsworksJavaAppLayer#system_packages}.
         * @return {@code this}
         */
        public Builder systemPackages(java.util.List<java.lang.String> systemPackages) {
            this.systemPackages = systemPackages;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#tags OpsworksJavaAppLayer#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getTagsAll}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#tags_all OpsworksJavaAppLayer#tags_all}.
         * @return {@code this}
         */
        public Builder tagsAll(java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getUseEbsOptimizedInstances}
         * @param useEbsOptimizedInstances Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#use_ebs_optimized_instances OpsworksJavaAppLayer#use_ebs_optimized_instances}.
         * @return {@code this}
         */
        public Builder useEbsOptimizedInstances(java.lang.Boolean useEbsOptimizedInstances) {
            this.useEbsOptimizedInstances = useEbsOptimizedInstances;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getUseEbsOptimizedInstances}
         * @param useEbsOptimizedInstances Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_java_app_layer#use_ebs_optimized_instances OpsworksJavaAppLayer#use_ebs_optimized_instances}.
         * @return {@code this}
         */
        public Builder useEbsOptimizedInstances(com.hashicorp.cdktf.IResolvable useEbsOptimizedInstances) {
            this.useEbsOptimizedInstances = useEbsOptimizedInstances;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getDependsOn}
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
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksJavaAppLayerConfig#getProvisioners}
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
         * @return a new instance of {@link OpsworksJavaAppLayerConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpsworksJavaAppLayerConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link OpsworksJavaAppLayerConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpsworksJavaAppLayerConfig {
        private final java.lang.String stackId;
        private final java.lang.String appServer;
        private final java.lang.String appServerVersion;
        private final java.lang.Object autoAssignElasticIps;
        private final java.lang.Object autoAssignPublicIps;
        private final java.lang.Object autoHealing;
        private final imports.aws.opsworks.OpsworksJavaAppLayerCloudwatchConfiguration cloudwatchConfiguration;
        private final java.util.List<java.lang.String> customConfigureRecipes;
        private final java.util.List<java.lang.String> customDeployRecipes;
        private final java.lang.String customInstanceProfileArn;
        private final java.lang.String customJson;
        private final java.util.List<java.lang.String> customSecurityGroupIds;
        private final java.util.List<java.lang.String> customSetupRecipes;
        private final java.util.List<java.lang.String> customShutdownRecipes;
        private final java.util.List<java.lang.String> customUndeployRecipes;
        private final java.lang.Object drainElbOnShutdown;
        private final java.lang.Object ebsVolume;
        private final java.lang.String elasticLoadBalancer;
        private final java.lang.String id;
        private final java.lang.Object installUpdatesOnBoot;
        private final java.lang.Number instanceShutdownTimeout;
        private final java.lang.String jvmOptions;
        private final java.lang.String jvmType;
        private final java.lang.String jvmVersion;
        private final java.lang.String name;
        private final java.util.List<java.lang.String> systemPackages;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> tagsAll;
        private final java.lang.Object useEbsOptimizedInstances;
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
            this.stackId = software.amazon.jsii.Kernel.get(this, "stackId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.appServer = software.amazon.jsii.Kernel.get(this, "appServer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.appServerVersion = software.amazon.jsii.Kernel.get(this, "appServerVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.autoAssignElasticIps = software.amazon.jsii.Kernel.get(this, "autoAssignElasticIps", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.autoAssignPublicIps = software.amazon.jsii.Kernel.get(this, "autoAssignPublicIps", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.autoHealing = software.amazon.jsii.Kernel.get(this, "autoHealing", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.cloudwatchConfiguration = software.amazon.jsii.Kernel.get(this, "cloudwatchConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.opsworks.OpsworksJavaAppLayerCloudwatchConfiguration.class));
            this.customConfigureRecipes = software.amazon.jsii.Kernel.get(this, "customConfigureRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customDeployRecipes = software.amazon.jsii.Kernel.get(this, "customDeployRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customInstanceProfileArn = software.amazon.jsii.Kernel.get(this, "customInstanceProfileArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customJson = software.amazon.jsii.Kernel.get(this, "customJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customSecurityGroupIds = software.amazon.jsii.Kernel.get(this, "customSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customSetupRecipes = software.amazon.jsii.Kernel.get(this, "customSetupRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customShutdownRecipes = software.amazon.jsii.Kernel.get(this, "customShutdownRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.customUndeployRecipes = software.amazon.jsii.Kernel.get(this, "customUndeployRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.drainElbOnShutdown = software.amazon.jsii.Kernel.get(this, "drainElbOnShutdown", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.ebsVolume = software.amazon.jsii.Kernel.get(this, "ebsVolume", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.elasticLoadBalancer = software.amazon.jsii.Kernel.get(this, "elasticLoadBalancer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.installUpdatesOnBoot = software.amazon.jsii.Kernel.get(this, "installUpdatesOnBoot", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.instanceShutdownTimeout = software.amazon.jsii.Kernel.get(this, "instanceShutdownTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.jvmOptions = software.amazon.jsii.Kernel.get(this, "jvmOptions", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.jvmType = software.amazon.jsii.Kernel.get(this, "jvmType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.jvmVersion = software.amazon.jsii.Kernel.get(this, "jvmVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.systemPackages = software.amazon.jsii.Kernel.get(this, "systemPackages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagsAll = software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.useEbsOptimizedInstances = software.amazon.jsii.Kernel.get(this, "useEbsOptimizedInstances", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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
            this.stackId = java.util.Objects.requireNonNull(builder.stackId, "stackId is required");
            this.appServer = builder.appServer;
            this.appServerVersion = builder.appServerVersion;
            this.autoAssignElasticIps = builder.autoAssignElasticIps;
            this.autoAssignPublicIps = builder.autoAssignPublicIps;
            this.autoHealing = builder.autoHealing;
            this.cloudwatchConfiguration = builder.cloudwatchConfiguration;
            this.customConfigureRecipes = builder.customConfigureRecipes;
            this.customDeployRecipes = builder.customDeployRecipes;
            this.customInstanceProfileArn = builder.customInstanceProfileArn;
            this.customJson = builder.customJson;
            this.customSecurityGroupIds = builder.customSecurityGroupIds;
            this.customSetupRecipes = builder.customSetupRecipes;
            this.customShutdownRecipes = builder.customShutdownRecipes;
            this.customUndeployRecipes = builder.customUndeployRecipes;
            this.drainElbOnShutdown = builder.drainElbOnShutdown;
            this.ebsVolume = builder.ebsVolume;
            this.elasticLoadBalancer = builder.elasticLoadBalancer;
            this.id = builder.id;
            this.installUpdatesOnBoot = builder.installUpdatesOnBoot;
            this.instanceShutdownTimeout = builder.instanceShutdownTimeout;
            this.jvmOptions = builder.jvmOptions;
            this.jvmType = builder.jvmType;
            this.jvmVersion = builder.jvmVersion;
            this.name = builder.name;
            this.systemPackages = builder.systemPackages;
            this.tags = builder.tags;
            this.tagsAll = builder.tagsAll;
            this.useEbsOptimizedInstances = builder.useEbsOptimizedInstances;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getStackId() {
            return this.stackId;
        }

        @Override
        public final java.lang.String getAppServer() {
            return this.appServer;
        }

        @Override
        public final java.lang.String getAppServerVersion() {
            return this.appServerVersion;
        }

        @Override
        public final java.lang.Object getAutoAssignElasticIps() {
            return this.autoAssignElasticIps;
        }

        @Override
        public final java.lang.Object getAutoAssignPublicIps() {
            return this.autoAssignPublicIps;
        }

        @Override
        public final java.lang.Object getAutoHealing() {
            return this.autoHealing;
        }

        @Override
        public final imports.aws.opsworks.OpsworksJavaAppLayerCloudwatchConfiguration getCloudwatchConfiguration() {
            return this.cloudwatchConfiguration;
        }

        @Override
        public final java.util.List<java.lang.String> getCustomConfigureRecipes() {
            return this.customConfigureRecipes;
        }

        @Override
        public final java.util.List<java.lang.String> getCustomDeployRecipes() {
            return this.customDeployRecipes;
        }

        @Override
        public final java.lang.String getCustomInstanceProfileArn() {
            return this.customInstanceProfileArn;
        }

        @Override
        public final java.lang.String getCustomJson() {
            return this.customJson;
        }

        @Override
        public final java.util.List<java.lang.String> getCustomSecurityGroupIds() {
            return this.customSecurityGroupIds;
        }

        @Override
        public final java.util.List<java.lang.String> getCustomSetupRecipes() {
            return this.customSetupRecipes;
        }

        @Override
        public final java.util.List<java.lang.String> getCustomShutdownRecipes() {
            return this.customShutdownRecipes;
        }

        @Override
        public final java.util.List<java.lang.String> getCustomUndeployRecipes() {
            return this.customUndeployRecipes;
        }

        @Override
        public final java.lang.Object getDrainElbOnShutdown() {
            return this.drainElbOnShutdown;
        }

        @Override
        public final java.lang.Object getEbsVolume() {
            return this.ebsVolume;
        }

        @Override
        public final java.lang.String getElasticLoadBalancer() {
            return this.elasticLoadBalancer;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getInstallUpdatesOnBoot() {
            return this.installUpdatesOnBoot;
        }

        @Override
        public final java.lang.Number getInstanceShutdownTimeout() {
            return this.instanceShutdownTimeout;
        }

        @Override
        public final java.lang.String getJvmOptions() {
            return this.jvmOptions;
        }

        @Override
        public final java.lang.String getJvmType() {
            return this.jvmType;
        }

        @Override
        public final java.lang.String getJvmVersion() {
            return this.jvmVersion;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<java.lang.String> getSystemPackages() {
            return this.systemPackages;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
            return this.tagsAll;
        }

        @Override
        public final java.lang.Object getUseEbsOptimizedInstances() {
            return this.useEbsOptimizedInstances;
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

            data.set("stackId", om.valueToTree(this.getStackId()));
            if (this.getAppServer() != null) {
                data.set("appServer", om.valueToTree(this.getAppServer()));
            }
            if (this.getAppServerVersion() != null) {
                data.set("appServerVersion", om.valueToTree(this.getAppServerVersion()));
            }
            if (this.getAutoAssignElasticIps() != null) {
                data.set("autoAssignElasticIps", om.valueToTree(this.getAutoAssignElasticIps()));
            }
            if (this.getAutoAssignPublicIps() != null) {
                data.set("autoAssignPublicIps", om.valueToTree(this.getAutoAssignPublicIps()));
            }
            if (this.getAutoHealing() != null) {
                data.set("autoHealing", om.valueToTree(this.getAutoHealing()));
            }
            if (this.getCloudwatchConfiguration() != null) {
                data.set("cloudwatchConfiguration", om.valueToTree(this.getCloudwatchConfiguration()));
            }
            if (this.getCustomConfigureRecipes() != null) {
                data.set("customConfigureRecipes", om.valueToTree(this.getCustomConfigureRecipes()));
            }
            if (this.getCustomDeployRecipes() != null) {
                data.set("customDeployRecipes", om.valueToTree(this.getCustomDeployRecipes()));
            }
            if (this.getCustomInstanceProfileArn() != null) {
                data.set("customInstanceProfileArn", om.valueToTree(this.getCustomInstanceProfileArn()));
            }
            if (this.getCustomJson() != null) {
                data.set("customJson", om.valueToTree(this.getCustomJson()));
            }
            if (this.getCustomSecurityGroupIds() != null) {
                data.set("customSecurityGroupIds", om.valueToTree(this.getCustomSecurityGroupIds()));
            }
            if (this.getCustomSetupRecipes() != null) {
                data.set("customSetupRecipes", om.valueToTree(this.getCustomSetupRecipes()));
            }
            if (this.getCustomShutdownRecipes() != null) {
                data.set("customShutdownRecipes", om.valueToTree(this.getCustomShutdownRecipes()));
            }
            if (this.getCustomUndeployRecipes() != null) {
                data.set("customUndeployRecipes", om.valueToTree(this.getCustomUndeployRecipes()));
            }
            if (this.getDrainElbOnShutdown() != null) {
                data.set("drainElbOnShutdown", om.valueToTree(this.getDrainElbOnShutdown()));
            }
            if (this.getEbsVolume() != null) {
                data.set("ebsVolume", om.valueToTree(this.getEbsVolume()));
            }
            if (this.getElasticLoadBalancer() != null) {
                data.set("elasticLoadBalancer", om.valueToTree(this.getElasticLoadBalancer()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getInstallUpdatesOnBoot() != null) {
                data.set("installUpdatesOnBoot", om.valueToTree(this.getInstallUpdatesOnBoot()));
            }
            if (this.getInstanceShutdownTimeout() != null) {
                data.set("instanceShutdownTimeout", om.valueToTree(this.getInstanceShutdownTimeout()));
            }
            if (this.getJvmOptions() != null) {
                data.set("jvmOptions", om.valueToTree(this.getJvmOptions()));
            }
            if (this.getJvmType() != null) {
                data.set("jvmType", om.valueToTree(this.getJvmType()));
            }
            if (this.getJvmVersion() != null) {
                data.set("jvmVersion", om.valueToTree(this.getJvmVersion()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getSystemPackages() != null) {
                data.set("systemPackages", om.valueToTree(this.getSystemPackages()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTagsAll() != null) {
                data.set("tagsAll", om.valueToTree(this.getTagsAll()));
            }
            if (this.getUseEbsOptimizedInstances() != null) {
                data.set("useEbsOptimizedInstances", om.valueToTree(this.getUseEbsOptimizedInstances()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.opsworks.OpsworksJavaAppLayerConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpsworksJavaAppLayerConfig.Jsii$Proxy that = (OpsworksJavaAppLayerConfig.Jsii$Proxy) o;

            if (!stackId.equals(that.stackId)) return false;
            if (this.appServer != null ? !this.appServer.equals(that.appServer) : that.appServer != null) return false;
            if (this.appServerVersion != null ? !this.appServerVersion.equals(that.appServerVersion) : that.appServerVersion != null) return false;
            if (this.autoAssignElasticIps != null ? !this.autoAssignElasticIps.equals(that.autoAssignElasticIps) : that.autoAssignElasticIps != null) return false;
            if (this.autoAssignPublicIps != null ? !this.autoAssignPublicIps.equals(that.autoAssignPublicIps) : that.autoAssignPublicIps != null) return false;
            if (this.autoHealing != null ? !this.autoHealing.equals(that.autoHealing) : that.autoHealing != null) return false;
            if (this.cloudwatchConfiguration != null ? !this.cloudwatchConfiguration.equals(that.cloudwatchConfiguration) : that.cloudwatchConfiguration != null) return false;
            if (this.customConfigureRecipes != null ? !this.customConfigureRecipes.equals(that.customConfigureRecipes) : that.customConfigureRecipes != null) return false;
            if (this.customDeployRecipes != null ? !this.customDeployRecipes.equals(that.customDeployRecipes) : that.customDeployRecipes != null) return false;
            if (this.customInstanceProfileArn != null ? !this.customInstanceProfileArn.equals(that.customInstanceProfileArn) : that.customInstanceProfileArn != null) return false;
            if (this.customJson != null ? !this.customJson.equals(that.customJson) : that.customJson != null) return false;
            if (this.customSecurityGroupIds != null ? !this.customSecurityGroupIds.equals(that.customSecurityGroupIds) : that.customSecurityGroupIds != null) return false;
            if (this.customSetupRecipes != null ? !this.customSetupRecipes.equals(that.customSetupRecipes) : that.customSetupRecipes != null) return false;
            if (this.customShutdownRecipes != null ? !this.customShutdownRecipes.equals(that.customShutdownRecipes) : that.customShutdownRecipes != null) return false;
            if (this.customUndeployRecipes != null ? !this.customUndeployRecipes.equals(that.customUndeployRecipes) : that.customUndeployRecipes != null) return false;
            if (this.drainElbOnShutdown != null ? !this.drainElbOnShutdown.equals(that.drainElbOnShutdown) : that.drainElbOnShutdown != null) return false;
            if (this.ebsVolume != null ? !this.ebsVolume.equals(that.ebsVolume) : that.ebsVolume != null) return false;
            if (this.elasticLoadBalancer != null ? !this.elasticLoadBalancer.equals(that.elasticLoadBalancer) : that.elasticLoadBalancer != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.installUpdatesOnBoot != null ? !this.installUpdatesOnBoot.equals(that.installUpdatesOnBoot) : that.installUpdatesOnBoot != null) return false;
            if (this.instanceShutdownTimeout != null ? !this.instanceShutdownTimeout.equals(that.instanceShutdownTimeout) : that.instanceShutdownTimeout != null) return false;
            if (this.jvmOptions != null ? !this.jvmOptions.equals(that.jvmOptions) : that.jvmOptions != null) return false;
            if (this.jvmType != null ? !this.jvmType.equals(that.jvmType) : that.jvmType != null) return false;
            if (this.jvmVersion != null ? !this.jvmVersion.equals(that.jvmVersion) : that.jvmVersion != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.systemPackages != null ? !this.systemPackages.equals(that.systemPackages) : that.systemPackages != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tagsAll != null ? !this.tagsAll.equals(that.tagsAll) : that.tagsAll != null) return false;
            if (this.useEbsOptimizedInstances != null ? !this.useEbsOptimizedInstances.equals(that.useEbsOptimizedInstances) : that.useEbsOptimizedInstances != null) return false;
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
            int result = this.stackId.hashCode();
            result = 31 * result + (this.appServer != null ? this.appServer.hashCode() : 0);
            result = 31 * result + (this.appServerVersion != null ? this.appServerVersion.hashCode() : 0);
            result = 31 * result + (this.autoAssignElasticIps != null ? this.autoAssignElasticIps.hashCode() : 0);
            result = 31 * result + (this.autoAssignPublicIps != null ? this.autoAssignPublicIps.hashCode() : 0);
            result = 31 * result + (this.autoHealing != null ? this.autoHealing.hashCode() : 0);
            result = 31 * result + (this.cloudwatchConfiguration != null ? this.cloudwatchConfiguration.hashCode() : 0);
            result = 31 * result + (this.customConfigureRecipes != null ? this.customConfigureRecipes.hashCode() : 0);
            result = 31 * result + (this.customDeployRecipes != null ? this.customDeployRecipes.hashCode() : 0);
            result = 31 * result + (this.customInstanceProfileArn != null ? this.customInstanceProfileArn.hashCode() : 0);
            result = 31 * result + (this.customJson != null ? this.customJson.hashCode() : 0);
            result = 31 * result + (this.customSecurityGroupIds != null ? this.customSecurityGroupIds.hashCode() : 0);
            result = 31 * result + (this.customSetupRecipes != null ? this.customSetupRecipes.hashCode() : 0);
            result = 31 * result + (this.customShutdownRecipes != null ? this.customShutdownRecipes.hashCode() : 0);
            result = 31 * result + (this.customUndeployRecipes != null ? this.customUndeployRecipes.hashCode() : 0);
            result = 31 * result + (this.drainElbOnShutdown != null ? this.drainElbOnShutdown.hashCode() : 0);
            result = 31 * result + (this.ebsVolume != null ? this.ebsVolume.hashCode() : 0);
            result = 31 * result + (this.elasticLoadBalancer != null ? this.elasticLoadBalancer.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.installUpdatesOnBoot != null ? this.installUpdatesOnBoot.hashCode() : 0);
            result = 31 * result + (this.instanceShutdownTimeout != null ? this.instanceShutdownTimeout.hashCode() : 0);
            result = 31 * result + (this.jvmOptions != null ? this.jvmOptions.hashCode() : 0);
            result = 31 * result + (this.jvmType != null ? this.jvmType.hashCode() : 0);
            result = 31 * result + (this.jvmVersion != null ? this.jvmVersion.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.systemPackages != null ? this.systemPackages.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tagsAll != null ? this.tagsAll.hashCode() : 0);
            result = 31 * result + (this.useEbsOptimizedInstances != null ? this.useEbsOptimizedInstances.hashCode() : 0);
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
