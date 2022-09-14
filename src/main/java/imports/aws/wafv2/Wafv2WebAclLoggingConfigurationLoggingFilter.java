package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.343Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclLoggingConfigurationLoggingFilter")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclLoggingConfigurationLoggingFilter.Jsii$Proxy.class)
public interface Wafv2WebAclLoggingConfigurationLoggingFilter extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#default_behavior Wafv2WebAclLoggingConfiguration#default_behavior}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDefaultBehavior();

    /**
     * filter block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#filter Wafv2WebAclLoggingConfiguration#filter}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getFilter();

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclLoggingConfigurationLoggingFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclLoggingConfigurationLoggingFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclLoggingConfigurationLoggingFilter> {
        java.lang.String defaultBehavior;
        java.lang.Object filter;

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationLoggingFilter#getDefaultBehavior}
         * @param defaultBehavior Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#default_behavior Wafv2WebAclLoggingConfiguration#default_behavior}. This parameter is required.
         * @return {@code this}
         */
        public Builder defaultBehavior(java.lang.String defaultBehavior) {
            this.defaultBehavior = defaultBehavior;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationLoggingFilter#getFilter}
         * @param filter filter block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#filter Wafv2WebAclLoggingConfiguration#filter}
         * @return {@code this}
         */
        public Builder filter(com.hashicorp.cdktf.IResolvable filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationLoggingFilter#getFilter}
         * @param filter filter block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#filter Wafv2WebAclLoggingConfiguration#filter}
         * @return {@code this}
         */
        public Builder filter(java.util.List<? extends imports.aws.wafv2.Wafv2WebAclLoggingConfigurationLoggingFilterFilter> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclLoggingConfigurationLoggingFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclLoggingConfigurationLoggingFilter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclLoggingConfigurationLoggingFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclLoggingConfigurationLoggingFilter {
        private final java.lang.String defaultBehavior;
        private final java.lang.Object filter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultBehavior = software.amazon.jsii.Kernel.get(this, "defaultBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultBehavior = java.util.Objects.requireNonNull(builder.defaultBehavior, "defaultBehavior is required");
            this.filter = java.util.Objects.requireNonNull(builder.filter, "filter is required");
        }

        @Override
        public final java.lang.String getDefaultBehavior() {
            return this.defaultBehavior;
        }

        @Override
        public final java.lang.Object getFilter() {
            return this.filter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("defaultBehavior", om.valueToTree(this.getDefaultBehavior()));
            data.set("filter", om.valueToTree(this.getFilter()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclLoggingConfigurationLoggingFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclLoggingConfigurationLoggingFilter.Jsii$Proxy that = (Wafv2WebAclLoggingConfigurationLoggingFilter.Jsii$Proxy) o;

            if (!defaultBehavior.equals(that.defaultBehavior)) return false;
            return this.filter.equals(that.filter);
        }

        @Override
        public final int hashCode() {
            int result = this.defaultBehavior.hashCode();
            result = 31 * result + (this.filter.hashCode());
            return result;
        }
    }
}
