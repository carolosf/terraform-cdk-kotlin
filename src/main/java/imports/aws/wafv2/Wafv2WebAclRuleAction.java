package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.345Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleAction")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleAction.Jsii$Proxy.class)
public interface Wafv2WebAclRuleAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * allow block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#allow Wafv2WebAcl#allow}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleActionAllow getAllow() {
        return null;
    }

    /**
     * block block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#block Wafv2WebAcl#block}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleActionBlock getBlock() {
        return null;
    }

    /**
     * count block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#count Wafv2WebAcl#count}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleActionCount getCount() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleAction> {
        imports.aws.wafv2.Wafv2WebAclRuleActionAllow allow;
        imports.aws.wafv2.Wafv2WebAclRuleActionBlock block;
        imports.aws.wafv2.Wafv2WebAclRuleActionCount count;

        /**
         * Sets the value of {@link Wafv2WebAclRuleAction#getAllow}
         * @param allow allow block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#allow Wafv2WebAcl#allow}
         * @return {@code this}
         */
        public Builder allow(imports.aws.wafv2.Wafv2WebAclRuleActionAllow allow) {
            this.allow = allow;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleAction#getBlock}
         * @param block block block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#block Wafv2WebAcl#block}
         * @return {@code this}
         */
        public Builder block(imports.aws.wafv2.Wafv2WebAclRuleActionBlock block) {
            this.block = block;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleAction#getCount}
         * @param count count block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#count Wafv2WebAcl#count}
         * @return {@code this}
         */
        public Builder count(imports.aws.wafv2.Wafv2WebAclRuleActionCount count) {
            this.count = count;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleAction build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleAction {
        private final imports.aws.wafv2.Wafv2WebAclRuleActionAllow allow;
        private final imports.aws.wafv2.Wafv2WebAclRuleActionBlock block;
        private final imports.aws.wafv2.Wafv2WebAclRuleActionCount count;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allow = software.amazon.jsii.Kernel.get(this, "allow", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleActionAllow.class));
            this.block = software.amazon.jsii.Kernel.get(this, "block", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleActionBlock.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleActionCount.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allow = builder.allow;
            this.block = builder.block;
            this.count = builder.count;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleActionAllow getAllow() {
            return this.allow;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleActionBlock getBlock() {
            return this.block;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleActionCount getCount() {
            return this.count;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllow() != null) {
                data.set("allow", om.valueToTree(this.getAllow()));
            }
            if (this.getBlock() != null) {
                data.set("block", om.valueToTree(this.getBlock()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRuleAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleAction.Jsii$Proxy that = (Wafv2WebAclRuleAction.Jsii$Proxy) o;

            if (this.allow != null ? !this.allow.equals(that.allow) : that.allow != null) return false;
            if (this.block != null ? !this.block.equals(that.block) : that.block != null) return false;
            return this.count != null ? this.count.equals(that.count) : that.count == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allow != null ? this.allow.hashCode() : 0;
            result = 31 * result + (this.block != null ? this.block.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            return result;
        }
    }
}
