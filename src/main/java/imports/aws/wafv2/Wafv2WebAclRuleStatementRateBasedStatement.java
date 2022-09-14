package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.484Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementRateBasedStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementRateBasedStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#limit Wafv2WebAcl#limit}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getLimit();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#aggregate_key_type Wafv2WebAcl#aggregate_key_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAggregateKeyType() {
        return null;
    }

    /**
     * forwarded_ip_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#forwarded_ip_config Wafv2WebAcl#forwarded_ip_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementForwardedIpConfig getForwardedIpConfig() {
        return null;
    }

    /**
     * scope_down_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#scope_down_statement Wafv2WebAcl#scope_down_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement getScopeDownStatement() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementRateBasedStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementRateBasedStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementRateBasedStatement> {
        java.lang.Number limit;
        java.lang.String aggregateKeyType;
        imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementForwardedIpConfig forwardedIpConfig;
        imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement scopeDownStatement;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatement#getLimit}
         * @param limit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#limit Wafv2WebAcl#limit}. This parameter is required.
         * @return {@code this}
         */
        public Builder limit(java.lang.Number limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatement#getAggregateKeyType}
         * @param aggregateKeyType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#aggregate_key_type Wafv2WebAcl#aggregate_key_type}.
         * @return {@code this}
         */
        public Builder aggregateKeyType(java.lang.String aggregateKeyType) {
            this.aggregateKeyType = aggregateKeyType;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatement#getForwardedIpConfig}
         * @param forwardedIpConfig forwarded_ip_config block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#forwarded_ip_config Wafv2WebAcl#forwarded_ip_config}
         * @return {@code this}
         */
        public Builder forwardedIpConfig(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementForwardedIpConfig forwardedIpConfig) {
            this.forwardedIpConfig = forwardedIpConfig;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatement#getScopeDownStatement}
         * @param scopeDownStatement scope_down_statement block.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#scope_down_statement Wafv2WebAcl#scope_down_statement}
         * @return {@code this}
         */
        public Builder scopeDownStatement(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementRateBasedStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementRateBasedStatement build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementRateBasedStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementRateBasedStatement {
        private final java.lang.Number limit;
        private final java.lang.String aggregateKeyType;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementForwardedIpConfig forwardedIpConfig;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement scopeDownStatement;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.limit = software.amazon.jsii.Kernel.get(this, "limit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.aggregateKeyType = software.amazon.jsii.Kernel.get(this, "aggregateKeyType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.forwardedIpConfig = software.amazon.jsii.Kernel.get(this, "forwardedIpConfig", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementForwardedIpConfig.class));
            this.scopeDownStatement = software.amazon.jsii.Kernel.get(this, "scopeDownStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.limit = java.util.Objects.requireNonNull(builder.limit, "limit is required");
            this.aggregateKeyType = builder.aggregateKeyType;
            this.forwardedIpConfig = builder.forwardedIpConfig;
            this.scopeDownStatement = builder.scopeDownStatement;
        }

        @Override
        public final java.lang.Number getLimit() {
            return this.limit;
        }

        @Override
        public final java.lang.String getAggregateKeyType() {
            return this.aggregateKeyType;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementForwardedIpConfig getForwardedIpConfig() {
            return this.forwardedIpConfig;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatement getScopeDownStatement() {
            return this.scopeDownStatement;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("limit", om.valueToTree(this.getLimit()));
            if (this.getAggregateKeyType() != null) {
                data.set("aggregateKeyType", om.valueToTree(this.getAggregateKeyType()));
            }
            if (this.getForwardedIpConfig() != null) {
                data.set("forwardedIpConfig", om.valueToTree(this.getForwardedIpConfig()));
            }
            if (this.getScopeDownStatement() != null) {
                data.set("scopeDownStatement", om.valueToTree(this.getScopeDownStatement()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementRateBasedStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementRateBasedStatement.Jsii$Proxy) o;

            if (!limit.equals(that.limit)) return false;
            if (this.aggregateKeyType != null ? !this.aggregateKeyType.equals(that.aggregateKeyType) : that.aggregateKeyType != null) return false;
            if (this.forwardedIpConfig != null ? !this.forwardedIpConfig.equals(that.forwardedIpConfig) : that.forwardedIpConfig != null) return false;
            return this.scopeDownStatement != null ? this.scopeDownStatement.equals(that.scopeDownStatement) : that.scopeDownStatement == null;
        }

        @Override
        public final int hashCode() {
            int result = this.limit.hashCode();
            result = 31 * result + (this.aggregateKeyType != null ? this.aggregateKeyType.hashCode() : 0);
            result = 31 * result + (this.forwardedIpConfig != null ? this.forwardedIpConfig.hashCode() : 0);
            result = 31 * result + (this.scopeDownStatement != null ? this.scopeDownStatement.hashCode() : 0);
            return result;
        }
    }
}
