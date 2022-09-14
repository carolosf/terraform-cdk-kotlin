package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.327Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2RuleGroupCustomResponseBody")
@software.amazon.jsii.Jsii.Proxy(Wafv2RuleGroupCustomResponseBody.Jsii$Proxy.class)
public interface Wafv2RuleGroupCustomResponseBody extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#content Wafv2RuleGroup#content}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getContent();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#content_type Wafv2RuleGroup#content_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getContentType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#key Wafv2RuleGroup#key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * @return a {@link Builder} of {@link Wafv2RuleGroupCustomResponseBody}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2RuleGroupCustomResponseBody}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2RuleGroupCustomResponseBody> {
        java.lang.String content;
        java.lang.String contentType;
        java.lang.String key;

        /**
         * Sets the value of {@link Wafv2RuleGroupCustomResponseBody#getContent}
         * @param content Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#content Wafv2RuleGroup#content}. This parameter is required.
         * @return {@code this}
         */
        public Builder content(java.lang.String content) {
            this.content = content;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupCustomResponseBody#getContentType}
         * @param contentType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#content_type Wafv2RuleGroup#content_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder contentType(java.lang.String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupCustomResponseBody#getKey}
         * @param key Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#key Wafv2RuleGroup#key}. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2RuleGroupCustomResponseBody}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2RuleGroupCustomResponseBody build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2RuleGroupCustomResponseBody}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2RuleGroupCustomResponseBody {
        private final java.lang.String content;
        private final java.lang.String contentType;
        private final java.lang.String key;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.content = software.amazon.jsii.Kernel.get(this, "content", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentType = software.amazon.jsii.Kernel.get(this, "contentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.content = java.util.Objects.requireNonNull(builder.content, "content is required");
            this.contentType = java.util.Objects.requireNonNull(builder.contentType, "contentType is required");
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
        }

        @Override
        public final java.lang.String getContent() {
            return this.content;
        }

        @Override
        public final java.lang.String getContentType() {
            return this.contentType;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("content", om.valueToTree(this.getContent()));
            data.set("contentType", om.valueToTree(this.getContentType()));
            data.set("key", om.valueToTree(this.getKey()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2RuleGroupCustomResponseBody"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2RuleGroupCustomResponseBody.Jsii$Proxy that = (Wafv2RuleGroupCustomResponseBody.Jsii$Proxy) o;

            if (!content.equals(that.content)) return false;
            if (!contentType.equals(that.contentType)) return false;
            return this.key.equals(that.key);
        }

        @Override
        public final int hashCode() {
            int result = this.content.hashCode();
            result = 31 * result + (this.contentType.hashCode());
            result = 31 * result + (this.key.hashCode());
            return result;
        }
    }
}
