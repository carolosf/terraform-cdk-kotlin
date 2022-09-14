package imports.aws.networkfirewall;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.912Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions")
@software.amazon.jsii.Jsii.Proxy(NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions.Jsii$Proxy.class)
public interface NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkfirewall_firewall_policy#rule_order NetworkfirewallFirewallPolicy#rule_order}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRuleOrder();

    /**
     * @return a {@link Builder} of {@link NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions> {
        java.lang.String ruleOrder;

        /**
         * Sets the value of {@link NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions#getRuleOrder}
         * @param ruleOrder Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkfirewall_firewall_policy#rule_order NetworkfirewallFirewallPolicy#rule_order}. This parameter is required.
         * @return {@code this}
         */
        public Builder ruleOrder(java.lang.String ruleOrder) {
            this.ruleOrder = ruleOrder;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions {
        private final java.lang.String ruleOrder;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ruleOrder = software.amazon.jsii.Kernel.get(this, "ruleOrder", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ruleOrder = java.util.Objects.requireNonNull(builder.ruleOrder, "ruleOrder is required");
        }

        @Override
        public final java.lang.String getRuleOrder() {
            return this.ruleOrder;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("ruleOrder", om.valueToTree(this.getRuleOrder()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions.Jsii$Proxy that = (NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions.Jsii$Proxy) o;

            return this.ruleOrder.equals(that.ruleOrder);
        }

        @Override
        public final int hashCode() {
            int result = this.ruleOrder.hashCode();
            return result;
        }
    }
}
