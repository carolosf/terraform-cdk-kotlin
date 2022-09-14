package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.341Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2RuleGroupRuleVisibilityConfig")
@software.amazon.jsii.Jsii.Proxy(Wafv2RuleGroupRuleVisibilityConfig.Jsii$Proxy.class)
public interface Wafv2RuleGroupRuleVisibilityConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#cloudwatch_metrics_enabled Wafv2RuleGroup#cloudwatch_metrics_enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getCloudwatchMetricsEnabled();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#metric_name Wafv2RuleGroup#metric_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMetricName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#sampled_requests_enabled Wafv2RuleGroup#sampled_requests_enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getSampledRequestsEnabled();

    /**
     * @return a {@link Builder} of {@link Wafv2RuleGroupRuleVisibilityConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2RuleGroupRuleVisibilityConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2RuleGroupRuleVisibilityConfig> {
        java.lang.Object cloudwatchMetricsEnabled;
        java.lang.String metricName;
        java.lang.Object sampledRequestsEnabled;

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleVisibilityConfig#getCloudwatchMetricsEnabled}
         * @param cloudwatchMetricsEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#cloudwatch_metrics_enabled Wafv2RuleGroup#cloudwatch_metrics_enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder cloudwatchMetricsEnabled(java.lang.Boolean cloudwatchMetricsEnabled) {
            this.cloudwatchMetricsEnabled = cloudwatchMetricsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleVisibilityConfig#getCloudwatchMetricsEnabled}
         * @param cloudwatchMetricsEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#cloudwatch_metrics_enabled Wafv2RuleGroup#cloudwatch_metrics_enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder cloudwatchMetricsEnabled(com.hashicorp.cdktf.IResolvable cloudwatchMetricsEnabled) {
            this.cloudwatchMetricsEnabled = cloudwatchMetricsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleVisibilityConfig#getMetricName}
         * @param metricName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#metric_name Wafv2RuleGroup#metric_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder metricName(java.lang.String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleVisibilityConfig#getSampledRequestsEnabled}
         * @param sampledRequestsEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#sampled_requests_enabled Wafv2RuleGroup#sampled_requests_enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder sampledRequestsEnabled(java.lang.Boolean sampledRequestsEnabled) {
            this.sampledRequestsEnabled = sampledRequestsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleVisibilityConfig#getSampledRequestsEnabled}
         * @param sampledRequestsEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#sampled_requests_enabled Wafv2RuleGroup#sampled_requests_enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder sampledRequestsEnabled(com.hashicorp.cdktf.IResolvable sampledRequestsEnabled) {
            this.sampledRequestsEnabled = sampledRequestsEnabled;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2RuleGroupRuleVisibilityConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2RuleGroupRuleVisibilityConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2RuleGroupRuleVisibilityConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2RuleGroupRuleVisibilityConfig {
        private final java.lang.Object cloudwatchMetricsEnabled;
        private final java.lang.String metricName;
        private final java.lang.Object sampledRequestsEnabled;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cloudwatchMetricsEnabled = software.amazon.jsii.Kernel.get(this, "cloudwatchMetricsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.metricName = software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sampledRequestsEnabled = software.amazon.jsii.Kernel.get(this, "sampledRequestsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cloudwatchMetricsEnabled = java.util.Objects.requireNonNull(builder.cloudwatchMetricsEnabled, "cloudwatchMetricsEnabled is required");
            this.metricName = java.util.Objects.requireNonNull(builder.metricName, "metricName is required");
            this.sampledRequestsEnabled = java.util.Objects.requireNonNull(builder.sampledRequestsEnabled, "sampledRequestsEnabled is required");
        }

        @Override
        public final java.lang.Object getCloudwatchMetricsEnabled() {
            return this.cloudwatchMetricsEnabled;
        }

        @Override
        public final java.lang.String getMetricName() {
            return this.metricName;
        }

        @Override
        public final java.lang.Object getSampledRequestsEnabled() {
            return this.sampledRequestsEnabled;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("cloudwatchMetricsEnabled", om.valueToTree(this.getCloudwatchMetricsEnabled()));
            data.set("metricName", om.valueToTree(this.getMetricName()));
            data.set("sampledRequestsEnabled", om.valueToTree(this.getSampledRequestsEnabled()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2RuleGroupRuleVisibilityConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2RuleGroupRuleVisibilityConfig.Jsii$Proxy that = (Wafv2RuleGroupRuleVisibilityConfig.Jsii$Proxy) o;

            if (!cloudwatchMetricsEnabled.equals(that.cloudwatchMetricsEnabled)) return false;
            if (!metricName.equals(that.metricName)) return false;
            return this.sampledRequestsEnabled.equals(that.sampledRequestsEnabled);
        }

        @Override
        public final int hashCode() {
            int result = this.cloudwatchMetricsEnabled.hashCode();
            result = 31 * result + (this.metricName.hashCode());
            result = 31 * result + (this.sampledRequestsEnabled.hashCode());
            return result;
        }
    }
}