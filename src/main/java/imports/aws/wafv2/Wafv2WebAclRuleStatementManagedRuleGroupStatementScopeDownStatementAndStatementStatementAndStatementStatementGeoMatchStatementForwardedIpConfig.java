package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.364Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#fallback_behavior Wafv2WebAcl#fallback_behavior}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFallbackBehavior();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#header_name Wafv2WebAcl#header_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getHeaderName();

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig> {
        java.lang.String fallbackBehavior;
        java.lang.String headerName;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig#getFallbackBehavior}
         * @param fallbackBehavior Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#fallback_behavior Wafv2WebAcl#fallback_behavior}. This parameter is required.
         * @return {@code this}
         */
        public Builder fallbackBehavior(java.lang.String fallbackBehavior) {
            this.fallbackBehavior = fallbackBehavior;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig#getHeaderName}
         * @param headerName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#header_name Wafv2WebAcl#header_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder headerName(java.lang.String headerName) {
            this.headerName = headerName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig {
        private final java.lang.String fallbackBehavior;
        private final java.lang.String headerName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fallbackBehavior = software.amazon.jsii.Kernel.get(this, "fallbackBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.headerName = software.amazon.jsii.Kernel.get(this, "headerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fallbackBehavior = java.util.Objects.requireNonNull(builder.fallbackBehavior, "fallbackBehavior is required");
            this.headerName = java.util.Objects.requireNonNull(builder.headerName, "headerName is required");
        }

        @Override
        public final java.lang.String getFallbackBehavior() {
            return this.fallbackBehavior;
        }

        @Override
        public final java.lang.String getHeaderName() {
            return this.headerName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("fallbackBehavior", om.valueToTree(this.getFallbackBehavior()));
            data.set("headerName", om.valueToTree(this.getHeaderName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig.Jsii$Proxy that = (Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig.Jsii$Proxy) o;

            if (!fallbackBehavior.equals(that.fallbackBehavior)) return false;
            return this.headerName.equals(that.headerName);
        }

        @Override
        public final int hashCode() {
            int result = this.fallbackBehavior.hashCode();
            result = 31 * result + (this.headerName.hashCode());
            return result;
        }
    }
}
