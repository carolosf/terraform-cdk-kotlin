package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.327Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2RuleGroupRule")
@software.amazon.jsii.Jsii.Proxy(Wafv2RuleGroupRule.Jsii$Proxy.class)
public interface Wafv2RuleGroupRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * action block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#action Wafv2RuleGroup#action}
     */
    @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleAction getAction();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#name Wafv2RuleGroup#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#priority Wafv2RuleGroup#priority}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getPriority();

    /**
     * statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#statement Wafv2RuleGroup#statement}
     */
    @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleStatement getStatement();

    /**
     * visibility_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#visibility_config Wafv2RuleGroup#visibility_config}
     */
    @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2RuleGroupRuleVisibilityConfig getVisibilityConfig();

    /**
     * rule_label block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#rule_label Wafv2RuleGroup#rule_label}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRuleLabel() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2RuleGroupRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2RuleGroupRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2RuleGroupRule> {
        imports.aws.wafv2.Wafv2RuleGroupRuleAction action;
        java.lang.String name;
        java.lang.Number priority;
        imports.aws.wafv2.Wafv2RuleGroupRuleStatement statement;
        imports.aws.wafv2.Wafv2RuleGroupRuleVisibilityConfig visibilityConfig;
        java.lang.Object ruleLabel;

        /**
         * Sets the value of {@link Wafv2RuleGroupRule#getAction}
         * @param action action block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#action Wafv2RuleGroup#action}
         * @return {@code this}
         */
        public Builder action(imports.aws.wafv2.Wafv2RuleGroupRuleAction action) {
            this.action = action;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRule#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#name Wafv2RuleGroup#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRule#getPriority}
         * @param priority Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#priority Wafv2RuleGroup#priority}. This parameter is required.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRule#getStatement}
         * @param statement statement block. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#statement Wafv2RuleGroup#statement}
         * @return {@code this}
         */
        public Builder statement(imports.aws.wafv2.Wafv2RuleGroupRuleStatement statement) {
            this.statement = statement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRule#getVisibilityConfig}
         * @param visibilityConfig visibility_config block. This parameter is required.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#visibility_config Wafv2RuleGroup#visibility_config}
         * @return {@code this}
         */
        public Builder visibilityConfig(imports.aws.wafv2.Wafv2RuleGroupRuleVisibilityConfig visibilityConfig) {
            this.visibilityConfig = visibilityConfig;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRule#getRuleLabel}
         * @param ruleLabel rule_label block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#rule_label Wafv2RuleGroup#rule_label}
         * @return {@code this}
         */
        public Builder ruleLabel(com.hashicorp.cdktf.IResolvable ruleLabel) {
            this.ruleLabel = ruleLabel;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRule#getRuleLabel}
         * @param ruleLabel rule_label block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#rule_label Wafv2RuleGroup#rule_label}
         * @return {@code this}
         */
        public Builder ruleLabel(java.util.List<? extends imports.aws.wafv2.Wafv2RuleGroupRuleRuleLabel> ruleLabel) {
            this.ruleLabel = ruleLabel;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2RuleGroupRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2RuleGroupRule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2RuleGroupRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2RuleGroupRule {
        private final imports.aws.wafv2.Wafv2RuleGroupRuleAction action;
        private final java.lang.String name;
        private final java.lang.Number priority;
        private final imports.aws.wafv2.Wafv2RuleGroupRuleStatement statement;
        private final imports.aws.wafv2.Wafv2RuleGroupRuleVisibilityConfig visibilityConfig;
        private final java.lang.Object ruleLabel;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleAction.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.statement = software.amazon.jsii.Kernel.get(this, "statement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatement.class));
            this.visibilityConfig = software.amazon.jsii.Kernel.get(this, "visibilityConfig", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleVisibilityConfig.class));
            this.ruleLabel = software.amazon.jsii.Kernel.get(this, "ruleLabel", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.action = java.util.Objects.requireNonNull(builder.action, "action is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.priority = java.util.Objects.requireNonNull(builder.priority, "priority is required");
            this.statement = java.util.Objects.requireNonNull(builder.statement, "statement is required");
            this.visibilityConfig = java.util.Objects.requireNonNull(builder.visibilityConfig, "visibilityConfig is required");
            this.ruleLabel = builder.ruleLabel;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleAction getAction() {
            return this.action;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleStatement getStatement() {
            return this.statement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleVisibilityConfig getVisibilityConfig() {
            return this.visibilityConfig;
        }

        @Override
        public final java.lang.Object getRuleLabel() {
            return this.ruleLabel;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("action", om.valueToTree(this.getAction()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("priority", om.valueToTree(this.getPriority()));
            data.set("statement", om.valueToTree(this.getStatement()));
            data.set("visibilityConfig", om.valueToTree(this.getVisibilityConfig()));
            if (this.getRuleLabel() != null) {
                data.set("ruleLabel", om.valueToTree(this.getRuleLabel()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2RuleGroupRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2RuleGroupRule.Jsii$Proxy that = (Wafv2RuleGroupRule.Jsii$Proxy) o;

            if (!action.equals(that.action)) return false;
            if (!name.equals(that.name)) return false;
            if (!priority.equals(that.priority)) return false;
            if (!statement.equals(that.statement)) return false;
            if (!visibilityConfig.equals(that.visibilityConfig)) return false;
            return this.ruleLabel != null ? this.ruleLabel.equals(that.ruleLabel) : that.ruleLabel == null;
        }

        @Override
        public final int hashCode() {
            int result = this.action.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.priority.hashCode());
            result = 31 * result + (this.statement.hashCode());
            result = 31 * result + (this.visibilityConfig.hashCode());
            result = 31 * result + (this.ruleLabel != null ? this.ruleLabel.hashCode() : 0);
            return result;
        }
    }
}
