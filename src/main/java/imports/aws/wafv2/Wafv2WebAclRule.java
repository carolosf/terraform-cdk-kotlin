package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.345Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRule")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRule.Jsii$Proxy.class)
public interface Wafv2WebAclRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#name Wafv2WebAcl#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#priority Wafv2WebAcl#priority}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getPriority();

    /**
     * statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#statement Wafv2WebAcl#statement}
     */
    @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatement getStatement();

    /**
     * visibility_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#visibility_config Wafv2WebAcl#visibility_config}
     */
    @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleVisibilityConfig getVisibilityConfig();

    /**
     * action block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#action Wafv2WebAcl#action}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleAction getAction() {
        return null;
    }

    /**
     * override_action block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#override_action Wafv2WebAcl#override_action}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleOverrideAction getOverrideAction() {
        return null;
    }

    /**
     * rule_label block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#rule_label Wafv2WebAcl#rule_label}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRuleLabel() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRule> {
        java.lang.String name;
        java.lang.Number priority;
        imports.aws.wafv2.Wafv2WebAclRuleStatement statement;
        imports.aws.wafv2.Wafv2WebAclRuleVisibilityConfig visibilityConfig;
        imports.aws.wafv2.Wafv2WebAclRuleAction action;
        imports.aws.wafv2.Wafv2WebAclRuleOverrideAction overrideAction;
        java.lang.Object ruleLabel;

        /**
         * Sets the value of {@link Wafv2WebAclRule#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#name Wafv2WebAcl#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRule#getPriority}
         * @param priority Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#priority Wafv2WebAcl#priority}. This parameter is required.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRule#getStatement}
         * @param statement statement block. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#statement Wafv2WebAcl#statement}
         * @return {@code this}
         */
        public Builder statement(imports.aws.wafv2.Wafv2WebAclRuleStatement statement) {
            this.statement = statement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRule#getVisibilityConfig}
         * @param visibilityConfig visibility_config block. This parameter is required.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#visibility_config Wafv2WebAcl#visibility_config}
         * @return {@code this}
         */
        public Builder visibilityConfig(imports.aws.wafv2.Wafv2WebAclRuleVisibilityConfig visibilityConfig) {
            this.visibilityConfig = visibilityConfig;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRule#getAction}
         * @param action action block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#action Wafv2WebAcl#action}
         * @return {@code this}
         */
        public Builder action(imports.aws.wafv2.Wafv2WebAclRuleAction action) {
            this.action = action;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRule#getOverrideAction}
         * @param overrideAction override_action block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#override_action Wafv2WebAcl#override_action}
         * @return {@code this}
         */
        public Builder overrideAction(imports.aws.wafv2.Wafv2WebAclRuleOverrideAction overrideAction) {
            this.overrideAction = overrideAction;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRule#getRuleLabel}
         * @param ruleLabel rule_label block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#rule_label Wafv2WebAcl#rule_label}
         * @return {@code this}
         */
        public Builder ruleLabel(com.hashicorp.cdktf.IResolvable ruleLabel) {
            this.ruleLabel = ruleLabel;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRule#getRuleLabel}
         * @param ruleLabel rule_label block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#rule_label Wafv2WebAcl#rule_label}
         * @return {@code this}
         */
        public Builder ruleLabel(java.util.List<? extends imports.aws.wafv2.Wafv2WebAclRuleRuleLabel> ruleLabel) {
            this.ruleLabel = ruleLabel;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRule {
        private final java.lang.String name;
        private final java.lang.Number priority;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatement statement;
        private final imports.aws.wafv2.Wafv2WebAclRuleVisibilityConfig visibilityConfig;
        private final imports.aws.wafv2.Wafv2WebAclRuleAction action;
        private final imports.aws.wafv2.Wafv2WebAclRuleOverrideAction overrideAction;
        private final java.lang.Object ruleLabel;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.statement = software.amazon.jsii.Kernel.get(this, "statement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatement.class));
            this.visibilityConfig = software.amazon.jsii.Kernel.get(this, "visibilityConfig", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleVisibilityConfig.class));
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleAction.class));
            this.overrideAction = software.amazon.jsii.Kernel.get(this, "overrideAction", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleOverrideAction.class));
            this.ruleLabel = software.amazon.jsii.Kernel.get(this, "ruleLabel", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.priority = java.util.Objects.requireNonNull(builder.priority, "priority is required");
            this.statement = java.util.Objects.requireNonNull(builder.statement, "statement is required");
            this.visibilityConfig = java.util.Objects.requireNonNull(builder.visibilityConfig, "visibilityConfig is required");
            this.action = builder.action;
            this.overrideAction = builder.overrideAction;
            this.ruleLabel = builder.ruleLabel;
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
        public final imports.aws.wafv2.Wafv2WebAclRuleStatement getStatement() {
            return this.statement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleVisibilityConfig getVisibilityConfig() {
            return this.visibilityConfig;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleAction getAction() {
            return this.action;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleOverrideAction getOverrideAction() {
            return this.overrideAction;
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

            data.set("name", om.valueToTree(this.getName()));
            data.set("priority", om.valueToTree(this.getPriority()));
            data.set("statement", om.valueToTree(this.getStatement()));
            data.set("visibilityConfig", om.valueToTree(this.getVisibilityConfig()));
            if (this.getAction() != null) {
                data.set("action", om.valueToTree(this.getAction()));
            }
            if (this.getOverrideAction() != null) {
                data.set("overrideAction", om.valueToTree(this.getOverrideAction()));
            }
            if (this.getRuleLabel() != null) {
                data.set("ruleLabel", om.valueToTree(this.getRuleLabel()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRule.Jsii$Proxy that = (Wafv2WebAclRule.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!priority.equals(that.priority)) return false;
            if (!statement.equals(that.statement)) return false;
            if (!visibilityConfig.equals(that.visibilityConfig)) return false;
            if (this.action != null ? !this.action.equals(that.action) : that.action != null) return false;
            if (this.overrideAction != null ? !this.overrideAction.equals(that.overrideAction) : that.overrideAction != null) return false;
            return this.ruleLabel != null ? this.ruleLabel.equals(that.ruleLabel) : that.ruleLabel == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.priority.hashCode());
            result = 31 * result + (this.statement.hashCode());
            result = 31 * result + (this.visibilityConfig.hashCode());
            result = 31 * result + (this.action != null ? this.action.hashCode() : 0);
            result = 31 * result + (this.overrideAction != null ? this.overrideAction.hashCode() : 0);
            result = 31 * result + (this.ruleLabel != null ? this.ruleLabel.hashCode() : 0);
            return result;
        }
    }
}
