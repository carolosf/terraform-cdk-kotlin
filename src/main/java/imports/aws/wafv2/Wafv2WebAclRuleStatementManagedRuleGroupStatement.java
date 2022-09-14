package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.358Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementManagedRuleGroupStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementManagedRuleGroupStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#name Wafv2WebAcl#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#vendor_name Wafv2WebAcl#vendor_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVendorName();

    /**
     * excluded_rule block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#excluded_rule Wafv2WebAcl#excluded_rule}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getExcludedRule() {
        return null;
    }

    /**
     * scope_down_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#scope_down_statement Wafv2WebAcl#scope_down_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatement getScopeDownStatement() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementManagedRuleGroupStatement> {
        java.lang.String name;
        java.lang.String vendorName;
        java.lang.Object excludedRule;
        imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatement scopeDownStatement;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#name Wafv2WebAcl#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement#getVendorName}
         * @param vendorName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#vendor_name Wafv2WebAcl#vendor_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder vendorName(java.lang.String vendorName) {
            this.vendorName = vendorName;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement#getExcludedRule}
         * @param excludedRule excluded_rule block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#excluded_rule Wafv2WebAcl#excluded_rule}
         * @return {@code this}
         */
        public Builder excludedRule(com.hashicorp.cdktf.IResolvable excludedRule) {
            this.excludedRule = excludedRule;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement#getExcludedRule}
         * @param excludedRule excluded_rule block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#excluded_rule Wafv2WebAcl#excluded_rule}
         * @return {@code this}
         */
        public Builder excludedRule(java.util.List<? extends imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementExcludedRule> excludedRule) {
            this.excludedRule = excludedRule;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement#getScopeDownStatement}
         * @param scopeDownStatement scope_down_statement block.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#scope_down_statement Wafv2WebAcl#scope_down_statement}
         * @return {@code this}
         */
        public Builder scopeDownStatement(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatement scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementManagedRuleGroupStatement build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementManagedRuleGroupStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementManagedRuleGroupStatement {
        private final java.lang.String name;
        private final java.lang.String vendorName;
        private final java.lang.Object excludedRule;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatement scopeDownStatement;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vendorName = software.amazon.jsii.Kernel.get(this, "vendorName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.excludedRule = software.amazon.jsii.Kernel.get(this, "excludedRule", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.scopeDownStatement = software.amazon.jsii.Kernel.get(this, "scopeDownStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatement.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.vendorName = java.util.Objects.requireNonNull(builder.vendorName, "vendorName is required");
            this.excludedRule = builder.excludedRule;
            this.scopeDownStatement = builder.scopeDownStatement;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getVendorName() {
            return this.vendorName;
        }

        @Override
        public final java.lang.Object getExcludedRule() {
            return this.excludedRule;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatement getScopeDownStatement() {
            return this.scopeDownStatement;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("vendorName", om.valueToTree(this.getVendorName()));
            if (this.getExcludedRule() != null) {
                data.set("excludedRule", om.valueToTree(this.getExcludedRule()));
            }
            if (this.getScopeDownStatement() != null) {
                data.set("scopeDownStatement", om.valueToTree(this.getScopeDownStatement()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementManagedRuleGroupStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementManagedRuleGroupStatement.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!vendorName.equals(that.vendorName)) return false;
            if (this.excludedRule != null ? !this.excludedRule.equals(that.excludedRule) : that.excludedRule != null) return false;
            return this.scopeDownStatement != null ? this.scopeDownStatement.equals(that.scopeDownStatement) : that.scopeDownStatement == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.vendorName.hashCode());
            result = 31 * result + (this.excludedRule != null ? this.excludedRule.hashCode() : 0);
            result = 31 * result + (this.scopeDownStatement != null ? this.scopeDownStatement.hashCode() : 0);
            return result;
        }
    }
}
