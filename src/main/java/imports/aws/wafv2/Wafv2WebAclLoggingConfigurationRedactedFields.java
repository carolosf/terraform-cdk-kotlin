package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.344Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFields")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclLoggingConfigurationRedactedFields.Jsii$Proxy.class)
public interface Wafv2WebAclLoggingConfigurationRedactedFields extends software.amazon.jsii.JsiiSerializable {

    /**
     * all_query_arguments block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#all_query_arguments Wafv2WebAclLoggingConfiguration#all_query_arguments}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsAllQueryArguments getAllQueryArguments() {
        return null;
    }

    /**
     * body block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#body Wafv2WebAclLoggingConfiguration#body}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsBody getBody() {
        return null;
    }

    /**
     * method block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#method Wafv2WebAclLoggingConfiguration#method}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsMethod getMethod() {
        return null;
    }

    /**
     * query_string block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#query_string Wafv2WebAclLoggingConfiguration#query_string}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsQueryString getQueryString() {
        return null;
    }

    /**
     * single_header block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#single_header Wafv2WebAclLoggingConfiguration#single_header}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleHeader getSingleHeader() {
        return null;
    }

    /**
     * single_query_argument block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#single_query_argument Wafv2WebAclLoggingConfiguration#single_query_argument}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleQueryArgument getSingleQueryArgument() {
        return null;
    }

    /**
     * uri_path block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#uri_path Wafv2WebAclLoggingConfiguration#uri_path}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsUriPath getUriPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclLoggingConfigurationRedactedFields}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclLoggingConfigurationRedactedFields}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclLoggingConfigurationRedactedFields> {
        imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsAllQueryArguments allQueryArguments;
        imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsBody body;
        imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsMethod method;
        imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsQueryString queryString;
        imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleHeader singleHeader;
        imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleQueryArgument singleQueryArgument;
        imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsUriPath uriPath;

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationRedactedFields#getAllQueryArguments}
         * @param allQueryArguments all_query_arguments block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#all_query_arguments Wafv2WebAclLoggingConfiguration#all_query_arguments}
         * @return {@code this}
         */
        public Builder allQueryArguments(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationRedactedFields#getBody}
         * @param body body block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#body Wafv2WebAclLoggingConfiguration#body}
         * @return {@code this}
         */
        public Builder body(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsBody body) {
            this.body = body;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationRedactedFields#getMethod}
         * @param method method block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#method Wafv2WebAclLoggingConfiguration#method}
         * @return {@code this}
         */
        public Builder method(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsMethod method) {
            this.method = method;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationRedactedFields#getQueryString}
         * @param queryString query_string block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#query_string Wafv2WebAclLoggingConfiguration#query_string}
         * @return {@code this}
         */
        public Builder queryString(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationRedactedFields#getSingleHeader}
         * @param singleHeader single_header block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#single_header Wafv2WebAclLoggingConfiguration#single_header}
         * @return {@code this}
         */
        public Builder singleHeader(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationRedactedFields#getSingleQueryArgument}
         * @param singleQueryArgument single_query_argument block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#single_query_argument Wafv2WebAclLoggingConfiguration#single_query_argument}
         * @return {@code this}
         */
        public Builder singleQueryArgument(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclLoggingConfigurationRedactedFields#getUriPath}
         * @param uriPath uri_path block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl_logging_configuration#uri_path Wafv2WebAclLoggingConfiguration#uri_path}
         * @return {@code this}
         */
        public Builder uriPath(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclLoggingConfigurationRedactedFields}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclLoggingConfigurationRedactedFields build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclLoggingConfigurationRedactedFields}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclLoggingConfigurationRedactedFields {
        private final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsAllQueryArguments allQueryArguments;
        private final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsBody body;
        private final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsMethod method;
        private final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsQueryString queryString;
        private final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleHeader singleHeader;
        private final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleQueryArgument singleQueryArgument;
        private final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsUriPath uriPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allQueryArguments = software.amazon.jsii.Kernel.get(this, "allQueryArguments", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsAllQueryArguments.class));
            this.body = software.amazon.jsii.Kernel.get(this, "body", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsBody.class));
            this.method = software.amazon.jsii.Kernel.get(this, "method", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsMethod.class));
            this.queryString = software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsQueryString.class));
            this.singleHeader = software.amazon.jsii.Kernel.get(this, "singleHeader", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleHeader.class));
            this.singleQueryArgument = software.amazon.jsii.Kernel.get(this, "singleQueryArgument", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleQueryArgument.class));
            this.uriPath = software.amazon.jsii.Kernel.get(this, "uriPath", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsUriPath.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allQueryArguments = builder.allQueryArguments;
            this.body = builder.body;
            this.method = builder.method;
            this.queryString = builder.queryString;
            this.singleHeader = builder.singleHeader;
            this.singleQueryArgument = builder.singleQueryArgument;
            this.uriPath = builder.uriPath;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsAllQueryArguments getAllQueryArguments() {
            return this.allQueryArguments;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsBody getBody() {
            return this.body;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsMethod getMethod() {
            return this.method;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsQueryString getQueryString() {
            return this.queryString;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleHeader getSingleHeader() {
            return this.singleHeader;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsSingleQueryArgument getSingleQueryArgument() {
            return this.singleQueryArgument;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFieldsUriPath getUriPath() {
            return this.uriPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllQueryArguments() != null) {
                data.set("allQueryArguments", om.valueToTree(this.getAllQueryArguments()));
            }
            if (this.getBody() != null) {
                data.set("body", om.valueToTree(this.getBody()));
            }
            if (this.getMethod() != null) {
                data.set("method", om.valueToTree(this.getMethod()));
            }
            if (this.getQueryString() != null) {
                data.set("queryString", om.valueToTree(this.getQueryString()));
            }
            if (this.getSingleHeader() != null) {
                data.set("singleHeader", om.valueToTree(this.getSingleHeader()));
            }
            if (this.getSingleQueryArgument() != null) {
                data.set("singleQueryArgument", om.valueToTree(this.getSingleQueryArgument()));
            }
            if (this.getUriPath() != null) {
                data.set("uriPath", om.valueToTree(this.getUriPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclLoggingConfigurationRedactedFields"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclLoggingConfigurationRedactedFields.Jsii$Proxy that = (Wafv2WebAclLoggingConfigurationRedactedFields.Jsii$Proxy) o;

            if (this.allQueryArguments != null ? !this.allQueryArguments.equals(that.allQueryArguments) : that.allQueryArguments != null) return false;
            if (this.body != null ? !this.body.equals(that.body) : that.body != null) return false;
            if (this.method != null ? !this.method.equals(that.method) : that.method != null) return false;
            if (this.queryString != null ? !this.queryString.equals(that.queryString) : that.queryString != null) return false;
            if (this.singleHeader != null ? !this.singleHeader.equals(that.singleHeader) : that.singleHeader != null) return false;
            if (this.singleQueryArgument != null ? !this.singleQueryArgument.equals(that.singleQueryArgument) : that.singleQueryArgument != null) return false;
            return this.uriPath != null ? this.uriPath.equals(that.uriPath) : that.uriPath == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allQueryArguments != null ? this.allQueryArguments.hashCode() : 0;
            result = 31 * result + (this.body != null ? this.body.hashCode() : 0);
            result = 31 * result + (this.method != null ? this.method.hashCode() : 0);
            result = 31 * result + (this.queryString != null ? this.queryString.hashCode() : 0);
            result = 31 * result + (this.singleHeader != null ? this.singleHeader.hashCode() : 0);
            result = 31 * result + (this.singleQueryArgument != null ? this.singleQueryArgument.hashCode() : 0);
            result = 31 * result + (this.uriPath != null ? this.uriPath.hashCode() : 0);
            return result;
        }
    }
}
