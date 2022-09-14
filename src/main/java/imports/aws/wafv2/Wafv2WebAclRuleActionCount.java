package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.346Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleActionCount")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleActionCount.Jsii$Proxy.class)
public interface Wafv2WebAclRuleActionCount extends software.amazon.jsii.JsiiSerializable {

    /**
     * custom_request_handling block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#custom_request_handling Wafv2WebAcl#custom_request_handling}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleActionCountCustomRequestHandling getCustomRequestHandling() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleActionCount}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleActionCount}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleActionCount> {
        imports.aws.wafv2.Wafv2WebAclRuleActionCountCustomRequestHandling customRequestHandling;

        /**
         * Sets the value of {@link Wafv2WebAclRuleActionCount#getCustomRequestHandling}
         * @param customRequestHandling custom_request_handling block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#custom_request_handling Wafv2WebAcl#custom_request_handling}
         * @return {@code this}
         */
        public Builder customRequestHandling(imports.aws.wafv2.Wafv2WebAclRuleActionCountCustomRequestHandling customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleActionCount}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleActionCount build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleActionCount}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleActionCount {
        private final imports.aws.wafv2.Wafv2WebAclRuleActionCountCustomRequestHandling customRequestHandling;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.customRequestHandling = software.amazon.jsii.Kernel.get(this, "customRequestHandling", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleActionCountCustomRequestHandling.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.customRequestHandling = builder.customRequestHandling;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleActionCountCustomRequestHandling getCustomRequestHandling() {
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRuleActionCount"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleActionCount.Jsii$Proxy that = (Wafv2WebAclRuleActionCount.Jsii$Proxy) o;

            return this.customRequestHandling != null ? this.customRequestHandling.equals(that.customRequestHandling) : that.customRequestHandling == null;
        }

        @Override
        public final int hashCode() {
            int result = this.customRequestHandling != null ? this.customRequestHandling.hashCode() : 0;
            return result;
        }
    }
}
