package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.521Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement.Jsii$Proxy.class)
public interface Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * byte_match_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#byte_match_statement Wafv2WebAcl#byte_match_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatement getByteMatchStatement() {
        return null;
    }

    /**
     * geo_match_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#geo_match_statement Wafv2WebAcl#geo_match_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGeoMatchStatement getGeoMatchStatement() {
        return null;
    }

    /**
     * ip_set_reference_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#ip_set_reference_statement Wafv2WebAcl#ip_set_reference_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement getIpSetReferenceStatement() {
        return null;
    }

    /**
     * label_match_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#label_match_statement Wafv2WebAcl#label_match_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementLabelMatchStatement getLabelMatchStatement() {
        return null;
    }

    /**
     * regex_pattern_set_reference_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#regex_pattern_set_reference_statement Wafv2WebAcl#regex_pattern_set_reference_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement getRegexPatternSetReferenceStatement() {
        return null;
    }

    /**
     * size_constraint_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#size_constraint_statement Wafv2WebAcl#size_constraint_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementSizeConstraintStatement getSizeConstraintStatement() {
        return null;
    }

    /**
     * sqli_match_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#sqli_match_statement Wafv2WebAcl#sqli_match_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementSqliMatchStatement getSqliMatchStatement() {
        return null;
    }

    /**
     * xss_match_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#xss_match_statement Wafv2WebAcl#xss_match_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementXssMatchStatement getXssMatchStatement() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement> {
        imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
        imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
        imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
        imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
        imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
        imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement#getByteMatchStatement}
         * @param byteMatchStatement byte_match_statement block.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#byte_match_statement Wafv2WebAcl#byte_match_statement}
         * @return {@code this}
         */
        public Builder byteMatchStatement(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement#getGeoMatchStatement}
         * @param geoMatchStatement geo_match_statement block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#geo_match_statement Wafv2WebAcl#geo_match_statement}
         * @return {@code this}
         */
        public Builder geoMatchStatement(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement#getIpSetReferenceStatement}
         * @param ipSetReferenceStatement ip_set_reference_statement block.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#ip_set_reference_statement Wafv2WebAcl#ip_set_reference_statement}
         * @return {@code this}
         */
        public Builder ipSetReferenceStatement(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement#getLabelMatchStatement}
         * @param labelMatchStatement label_match_statement block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#label_match_statement Wafv2WebAcl#label_match_statement}
         * @return {@code this}
         */
        public Builder labelMatchStatement(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement#getRegexPatternSetReferenceStatement}
         * @param regexPatternSetReferenceStatement regex_pattern_set_reference_statement block.
         *                                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#regex_pattern_set_reference_statement Wafv2WebAcl#regex_pattern_set_reference_statement}
         * @return {@code this}
         */
        public Builder regexPatternSetReferenceStatement(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement#getSizeConstraintStatement}
         * @param sizeConstraintStatement size_constraint_statement block.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#size_constraint_statement Wafv2WebAcl#size_constraint_statement}
         * @return {@code this}
         */
        public Builder sizeConstraintStatement(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement#getSqliMatchStatement}
         * @param sqliMatchStatement sqli_match_statement block.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#sqli_match_statement Wafv2WebAcl#sqli_match_statement}
         * @return {@code this}
         */
        public Builder sqliMatchStatement(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement#getXssMatchStatement}
         * @param xssMatchStatement xss_match_statement block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_web_acl#xss_match_statement Wafv2WebAcl#xss_match_statement}
         * @return {@code this}
         */
        public Builder xssMatchStatement(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement {
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
        private final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.byteMatchStatement = software.amazon.jsii.Kernel.get(this, "byteMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatement.class));
            this.geoMatchStatement = software.amazon.jsii.Kernel.get(this, "geoMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGeoMatchStatement.class));
            this.ipSetReferenceStatement = software.amazon.jsii.Kernel.get(this, "ipSetReferenceStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement.class));
            this.labelMatchStatement = software.amazon.jsii.Kernel.get(this, "labelMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementLabelMatchStatement.class));
            this.regexPatternSetReferenceStatement = software.amazon.jsii.Kernel.get(this, "regexPatternSetReferenceStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement.class));
            this.sizeConstraintStatement = software.amazon.jsii.Kernel.get(this, "sizeConstraintStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementSizeConstraintStatement.class));
            this.sqliMatchStatement = software.amazon.jsii.Kernel.get(this, "sqliMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementSqliMatchStatement.class));
            this.xssMatchStatement = software.amazon.jsii.Kernel.get(this, "xssMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementXssMatchStatement.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.byteMatchStatement = builder.byteMatchStatement;
            this.geoMatchStatement = builder.geoMatchStatement;
            this.ipSetReferenceStatement = builder.ipSetReferenceStatement;
            this.labelMatchStatement = builder.labelMatchStatement;
            this.regexPatternSetReferenceStatement = builder.regexPatternSetReferenceStatement;
            this.sizeConstraintStatement = builder.sizeConstraintStatement;
            this.sqliMatchStatement = builder.sqliMatchStatement;
            this.xssMatchStatement = builder.xssMatchStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatement getByteMatchStatement() {
            return this.byteMatchStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGeoMatchStatement getGeoMatchStatement() {
            return this.geoMatchStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement getIpSetReferenceStatement() {
            return this.ipSetReferenceStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementLabelMatchStatement getLabelMatchStatement() {
            return this.labelMatchStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement getRegexPatternSetReferenceStatement() {
            return this.regexPatternSetReferenceStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementSizeConstraintStatement getSizeConstraintStatement() {
            return this.sizeConstraintStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementSqliMatchStatement getSqliMatchStatement() {
            return this.sqliMatchStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementXssMatchStatement getXssMatchStatement() {
            return this.xssMatchStatement;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getByteMatchStatement() != null) {
                data.set("byteMatchStatement", om.valueToTree(this.getByteMatchStatement()));
            }
            if (this.getGeoMatchStatement() != null) {
                data.set("geoMatchStatement", om.valueToTree(this.getGeoMatchStatement()));
            }
            if (this.getIpSetReferenceStatement() != null) {
                data.set("ipSetReferenceStatement", om.valueToTree(this.getIpSetReferenceStatement()));
            }
            if (this.getLabelMatchStatement() != null) {
                data.set("labelMatchStatement", om.valueToTree(this.getLabelMatchStatement()));
            }
            if (this.getRegexPatternSetReferenceStatement() != null) {
                data.set("regexPatternSetReferenceStatement", om.valueToTree(this.getRegexPatternSetReferenceStatement()));
            }
            if (this.getSizeConstraintStatement() != null) {
                data.set("sizeConstraintStatement", om.valueToTree(this.getSizeConstraintStatement()));
            }
            if (this.getSqliMatchStatement() != null) {
                data.set("sqliMatchStatement", om.valueToTree(this.getSqliMatchStatement()));
            }
            if (this.getXssMatchStatement() != null) {
                data.set("xssMatchStatement", om.valueToTree(this.getXssMatchStatement()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement.Jsii$Proxy that = (Wafv2WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement.Jsii$Proxy) o;

            if (this.byteMatchStatement != null ? !this.byteMatchStatement.equals(that.byteMatchStatement) : that.byteMatchStatement != null) return false;
            if (this.geoMatchStatement != null ? !this.geoMatchStatement.equals(that.geoMatchStatement) : that.geoMatchStatement != null) return false;
            if (this.ipSetReferenceStatement != null ? !this.ipSetReferenceStatement.equals(that.ipSetReferenceStatement) : that.ipSetReferenceStatement != null) return false;
            if (this.labelMatchStatement != null ? !this.labelMatchStatement.equals(that.labelMatchStatement) : that.labelMatchStatement != null) return false;
            if (this.regexPatternSetReferenceStatement != null ? !this.regexPatternSetReferenceStatement.equals(that.regexPatternSetReferenceStatement) : that.regexPatternSetReferenceStatement != null) return false;
            if (this.sizeConstraintStatement != null ? !this.sizeConstraintStatement.equals(that.sizeConstraintStatement) : that.sizeConstraintStatement != null) return false;
            if (this.sqliMatchStatement != null ? !this.sqliMatchStatement.equals(that.sqliMatchStatement) : that.sqliMatchStatement != null) return false;
            return this.xssMatchStatement != null ? this.xssMatchStatement.equals(that.xssMatchStatement) : that.xssMatchStatement == null;
        }

        @Override
        public final int hashCode() {
            int result = this.byteMatchStatement != null ? this.byteMatchStatement.hashCode() : 0;
            result = 31 * result + (this.geoMatchStatement != null ? this.geoMatchStatement.hashCode() : 0);
            result = 31 * result + (this.ipSetReferenceStatement != null ? this.ipSetReferenceStatement.hashCode() : 0);
            result = 31 * result + (this.labelMatchStatement != null ? this.labelMatchStatement.hashCode() : 0);
            result = 31 * result + (this.regexPatternSetReferenceStatement != null ? this.regexPatternSetReferenceStatement.hashCode() : 0);
            result = 31 * result + (this.sizeConstraintStatement != null ? this.sizeConstraintStatement.hashCode() : 0);
            result = 31 * result + (this.sqliMatchStatement != null ? this.sqliMatchStatement.hashCode() : 0);
            result = 31 * result + (this.xssMatchStatement != null ? this.xssMatchStatement.hashCode() : 0);
            return result;
        }
    }
}
