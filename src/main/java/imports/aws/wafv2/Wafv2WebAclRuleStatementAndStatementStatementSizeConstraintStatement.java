package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.354Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#comparison_operator Wafv2WebAcl#comparison_operator}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getComparisonOperator();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#size Wafv2WebAcl#size}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getSize();

    /**
     * text_transformation block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#text_transformation Wafv2WebAcl#text_transformation}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getTextTransformation();

    /**
     * field_to_match block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#field_to_match Wafv2WebAcl#field_to_match}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatch getFieldToMatch() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement> {
        java.lang.String comparisonOperator;
        java.lang.Number size;
        java.lang.Object textTransformation;
        imports.aws.wafv2.Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement#getComparisonOperator}
         * @param comparisonOperator Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#comparison_operator Wafv2WebAcl#comparison_operator}. This parameter is required.
         * @return {@code this}
         */
        public Builder comparisonOperator(java.lang.String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement#getSize}
         * @param size Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#size Wafv2WebAcl#size}. This parameter is required.
         * @return {@code this}
         */
        public Builder size(java.lang.Number size) {
            this.size = size;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement#getTextTransformation}
         * @param textTransformation text_transformation block. This parameter is required.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#text_transformation Wafv2WebAcl#text_transformation}
         * @return {@code this}
         */
        public Builder textTransformation(com.hashicorp.cdktf.IResolvable textTransformation) {
            this.textTransformation = textTransformation;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement#getTextTransformation}
         * @param textTransformation text_transformation block. This parameter is required.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#text_transformation Wafv2WebAcl#text_transformation}
         * @return {@code this}
         */
        public Builder textTransformation(java.util.List<? extends imports.aws.wafv2.Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformation) {
            this.textTransformation = textTransformation;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement#getFieldToMatch}
         * @param fieldToMatch field_to_match block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#field_to_match Wafv2WebAcl#field_to_match}
         * @return {@code this}
         */
        public Builder fieldToMatch(imports.aws.wafv2.Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement {
        private final java.lang.String comparisonOperator;
        private final java.lang.Number size;
        private final java.lang.Object textTransformation;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.comparisonOperator = software.amazon.jsii.Kernel.get(this, "comparisonOperator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.size = software.amazon.jsii.Kernel.get(this, "size", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.textTransformation = software.amazon.jsii.Kernel.get(this, "textTransformation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.fieldToMatch = software.amazon.jsii.Kernel.get(this, "fieldToMatch", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatch.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.comparisonOperator = java.util.Objects.requireNonNull(builder.comparisonOperator, "comparisonOperator is required");
            this.size = java.util.Objects.requireNonNull(builder.size, "size is required");
            this.textTransformation = java.util.Objects.requireNonNull(builder.textTransformation, "textTransformation is required");
            this.fieldToMatch = builder.fieldToMatch;
        }

        @Override
        public final java.lang.String getComparisonOperator() {
            return this.comparisonOperator;
        }

        @Override
        public final java.lang.Number getSize() {
            return this.size;
        }

        @Override
        public final java.lang.Object getTextTransformation() {
            return this.textTransformation;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatch getFieldToMatch() {
            return this.fieldToMatch;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("comparisonOperator", om.valueToTree(this.getComparisonOperator()));
            data.set("size", om.valueToTree(this.getSize()));
            data.set("textTransformation", om.valueToTree(this.getTextTransformation()));
            if (this.getFieldToMatch() != null) {
                data.set("fieldToMatch", om.valueToTree(this.getFieldToMatch()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementAndStatementStatementSizeConstraintStatement.Jsii$Proxy) o;

            if (!comparisonOperator.equals(that.comparisonOperator)) return false;
            if (!size.equals(that.size)) return false;
            if (!textTransformation.equals(that.textTransformation)) return false;
            return this.fieldToMatch != null ? this.fieldToMatch.equals(that.fieldToMatch) : that.fieldToMatch == null;
        }

        @Override
        public final int hashCode() {
            int result = this.comparisonOperator.hashCode();
            result = 31 * result + (this.size.hashCode());
            result = 31 * result + (this.textTransformation.hashCode());
            result = 31 * result + (this.fieldToMatch != null ? this.fieldToMatch.hashCode() : 0);
            return result;
        }
    }
}
