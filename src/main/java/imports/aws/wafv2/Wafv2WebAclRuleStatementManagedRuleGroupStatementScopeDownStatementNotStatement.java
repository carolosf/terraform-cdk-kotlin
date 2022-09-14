package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.395Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#statement Wafv2WebAcl#statement}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getStatement();

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement> {
        java.lang.Object statement;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement#getStatement}
         * @param statement statement block. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#statement Wafv2WebAcl#statement}
         * @return {@code this}
         */
        public Builder statement(com.hashicorp.cdktf.IResolvable statement) {
            this.statement = statement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement#getStatement}
         * @param statement statement block. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#statement Wafv2WebAcl#statement}
         * @return {@code this}
         */
        public Builder statement(java.util.List<? extends imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatement> statement) {
            this.statement = statement;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement {
        private final java.lang.Object statement;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.statement = software.amazon.jsii.Kernel.get(this, "statement", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.statement = java.util.Objects.requireNonNull(builder.statement, "statement is required");
        }

        @Override
        public final java.lang.Object getStatement() {
            return this.statement;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("statement", om.valueToTree(this.getStatement()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatement.Jsii$Proxy) o;

            return this.statement.equals(that.statement);
        }

        @Override
        public final int hashCode() {
            int result = this.statement.hashCode();
            return result;
        }
    }
}
