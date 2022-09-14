package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.327Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2RuleGroupRuleActionAllow")
@software.amazon.jsii.Jsii.Proxy(Wafv2RuleGroupRuleActionAllow.Jsii$Proxy.class)
public interface Wafv2RuleGroupRuleActionAllow extends software.amazon.jsii.JsiiSerializable {

    /**
     * custom_request_handling block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#custom_request_handling Wafv2RuleGroup#custom_request_handling}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleActionAllowCustomRequestHandling getCustomRequestHandling() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2RuleGroupRuleActionAllow}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2RuleGroupRuleActionAllow}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2RuleGroupRuleActionAllow> {
        imports.aws.wafv2.Wafv2RuleGroupRuleActionAllowCustomRequestHandling customRequestHandling;

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleActionAllow#getCustomRequestHandling}
         * @param customRequestHandling custom_request_handling block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#custom_request_handling Wafv2RuleGroup#custom_request_handling}
         * @return {@code this}
         */
        public Builder customRequestHandling(imports.aws.wafv2.Wafv2RuleGroupRuleActionAllowCustomRequestHandling customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2RuleGroupRuleActionAllow}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2RuleGroupRuleActionAllow build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2RuleGroupRuleActionAllow}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2RuleGroupRuleActionAllow {
        private final imports.aws.wafv2.Wafv2RuleGroupRuleActionAllowCustomRequestHandling customRequestHandling;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.customRequestHandling = software.amazon.jsii.Kernel.get(this, "customRequestHandling", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleActionAllowCustomRequestHandling.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.customRequestHandling = builder.customRequestHandling;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleActionAllowCustomRequestHandling getCustomRequestHandling() {
            return this.customRequestHandling;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCustomRequestHandling() != null) {
                data.set("customRequestHandling", om.valueToTree(this.getCustomRequestHandling()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2RuleGroupRuleActionAllow"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2RuleGroupRuleActionAllow.Jsii$Proxy that = (Wafv2RuleGroupRuleActionAllow.Jsii$Proxy) o;

            return this.customRequestHandling != null ? this.customRequestHandling.equals(that.customRequestHandling) : that.customRequestHandling == null;
        }

        @Override
        public final int hashCode() {
            int result = this.customRequestHandling != null ? this.customRequestHandling.hashCode() : 0;
            return result;
        }
    }
}
