package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.444Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#priority Wafv2WebAcl#priority}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getPriority();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#type Wafv2WebAcl#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> {
        java.lang.Number priority;
        java.lang.String type;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation#getPriority}
         * @param priority Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#priority Wafv2WebAcl#priority}. This parameter is required.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#type Wafv2WebAcl#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation {
        private final java.lang.Number priority;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.priority = java.util.Objects.requireNonNull(builder.priority, "priority is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("priority", om.valueToTree(this.getPriority()));
            data.set("type", om.valueToTree(this.getType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation.Jsii$Proxy that = (Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation.Jsii$Proxy) o;

            if (!priority.equals(that.priority)) return false;
            return this.type.equals(that.type);
        }

        @Override
        public final int hashCode() {
            int result = this.priority.hashCode();
            result = 31 * result + (this.type.hashCode());
            return result;
        }
    }
}
