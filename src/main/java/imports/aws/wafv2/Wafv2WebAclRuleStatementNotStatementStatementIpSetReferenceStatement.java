package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.468Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#arn Wafv2WebAcl#arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getArn();

    /**
     * ip_set_forwarded_ip_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#ip_set_forwarded_ip_config Wafv2WebAcl#ip_set_forwarded_ip_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig getIpSetForwardedIpConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement> {
        java.lang.String arn;
        imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement#getArn}
         * @param arn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#arn Wafv2WebAcl#arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder arn(java.lang.String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement#getIpSetForwardedIpConfig}
         * @param ipSetForwardedIpConfig ip_set_forwarded_ip_config block.
         *                               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#ip_set_forwarded_ip_config Wafv2WebAcl#ip_set_forwarded_ip_config}
         * @return {@code this}
         */
        public Builder ipSetForwardedIpConfig(imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement {
        private final java.lang.String arn;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.arn = software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ipSetForwardedIpConfig = software.amazon.jsii.Kernel.get(this, "ipSetForwardedIpConfig", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.arn = java.util.Objects.requireNonNull(builder.arn, "arn is required");
            this.ipSetForwardedIpConfig = builder.ipSetForwardedIpConfig;
        }

        @Override
        public final java.lang.String getArn() {
            return this.arn;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig getIpSetForwardedIpConfig() {
            return this.ipSetForwardedIpConfig;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("arn", om.valueToTree(this.getArn()));
            if (this.getIpSetForwardedIpConfig() != null) {
                data.set("ipSetForwardedIpConfig", om.valueToTree(this.getIpSetForwardedIpConfig()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementNotStatementStatementIpSetReferenceStatement.Jsii$Proxy) o;

            if (!arn.equals(that.arn)) return false;
            return this.ipSetForwardedIpConfig != null ? this.ipSetForwardedIpConfig.equals(that.ipSetForwardedIpConfig) : that.ipSetForwardedIpConfig == null;
        }

        @Override
        public final int hashCode() {
            int result = this.arn.hashCode();
            result = 31 * result + (this.ipSetForwardedIpConfig != null ? this.ipSetForwardedIpConfig.hashCode() : 0);
            return result;
        }
    }
}
