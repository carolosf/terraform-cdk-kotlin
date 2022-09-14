package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.405Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#name Wafv2WebAcl#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader> {
        java.lang.String name;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#name Wafv2WebAcl#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader {
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader.Jsii$Proxy that = (Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader.Jsii$Proxy) o;

            return this.name.equals(that.name);
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            return result;
        }
    }
}
