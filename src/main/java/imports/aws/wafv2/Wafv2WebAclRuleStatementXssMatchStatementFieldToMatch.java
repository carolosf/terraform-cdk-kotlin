package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.598Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch extends software.amazon.jsii.JsiiSerializable {

    /**
     * all_query_arguments block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#all_query_arguments Wafv2WebAcl#all_query_arguments}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArguments getAllQueryArguments() {
        return null;
    }

    /**
     * body block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#body Wafv2WebAcl#body}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchBody getBody() {
        return null;
    }

    /**
     * method block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#method Wafv2WebAcl#method}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchMethod getMethod() {
        return null;
    }

    /**
     * query_string block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#query_string Wafv2WebAcl#query_string}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchQueryString getQueryString() {
        return null;
    }

    /**
     * single_header block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#single_header Wafv2WebAcl#single_header}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchSingleHeader getSingleHeader() {
        return null;
    }

    /**
     * single_query_argument block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#single_query_argument Wafv2WebAcl#single_query_argument}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchSingleQueryArgument getSingleQueryArgument() {
        return null;
    }

    /**
     * uri_path block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#uri_path Wafv2WebAcl#uri_path}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchUriPath getUriPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch> {
        imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchBody body;
        imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchMethod method;
        imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchQueryString queryString;
        imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
        imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchUriPath uriPath;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch#getAllQueryArguments}
         * @param allQueryArguments all_query_arguments block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#all_query_arguments Wafv2WebAcl#all_query_arguments}
         * @return {@code this}
         */
        public Builder allQueryArguments(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch#getBody}
         * @param body body block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#body Wafv2WebAcl#body}
         * @return {@code this}
         */
        public Builder body(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch#getMethod}
         * @param method method block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#method Wafv2WebAcl#method}
         * @return {@code this}
         */
        public Builder method(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch#getQueryString}
         * @param queryString query_string block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#query_string Wafv2WebAcl#query_string}
         * @return {@code this}
         */
        public Builder queryString(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch#getSingleHeader}
         * @param singleHeader single_header block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#single_header Wafv2WebAcl#single_header}
         * @return {@code this}
         */
        public Builder singleHeader(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch#getSingleQueryArgument}
         * @param singleQueryArgument single_query_argument block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#single_query_argument Wafv2WebAcl#single_query_argument}
         * @return {@code this}
         */
        public Builder singleQueryArgument(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch#getUriPath}
         * @param uriPath uri_path block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#uri_path Wafv2WebAcl#uri_path}
         * @return {@code this}
         */
        public Builder uriPath(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch {
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchBody body;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchMethod method;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchQueryString queryString;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchUriPath uriPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allQueryArguments = software.amazon.jsii.Kernel.get(this, "allQueryArguments", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArguments.class));
            this.body = software.amazon.jsii.Kernel.get(this, "body", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchBody.class));
            this.method = software.amazon.jsii.Kernel.get(this, "method", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchMethod.class));
            this.queryString = software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchQueryString.class));
            this.singleHeader = software.amazon.jsii.Kernel.get(this, "singleHeader", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchSingleHeader.class));
            this.singleQueryArgument = software.amazon.jsii.Kernel.get(this, "singleQueryArgument", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchSingleQueryArgument.class));
            this.uriPath = software.amazon.jsii.Kernel.get(this, "uriPath", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchUriPath.class));
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
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArguments getAllQueryArguments() {
            return this.allQueryArguments;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchBody getBody() {
            return this.body;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchMethod getMethod() {
            return this.method;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchQueryString getQueryString() {
            return this.queryString;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchSingleHeader getSingleHeader() {
            return this.singleHeader;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchSingleQueryArgument getSingleQueryArgument() {
            return this.singleQueryArgument;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatchUriPath getUriPath() {
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch.Jsii$Proxy that = (Wafv2WebAclRuleStatementXssMatchStatementFieldToMatch.Jsii$Proxy) o;

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
