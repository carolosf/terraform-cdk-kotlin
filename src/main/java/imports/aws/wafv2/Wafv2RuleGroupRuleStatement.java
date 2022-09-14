package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.329Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2RuleGroupRuleStatement")
@software.amazon.jsii.Jsii.Proxy(Wafv2RuleGroupRuleStatement.Jsii$Proxy.class)
public interface Wafv2RuleGroupRuleStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * and_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#and_statement Wafv2RuleGroup#and_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementAndStatement getAndStatement() {
        return null;
    }

    /**
     * byte_match_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#byte_match_statement Wafv2RuleGroup#byte_match_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementByteMatchStatement getByteMatchStatement() {
        return null;
    }

    /**
     * geo_match_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#geo_match_statement Wafv2RuleGroup#geo_match_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementGeoMatchStatement getGeoMatchStatement() {
        return null;
    }

    /**
     * ip_set_reference_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#ip_set_reference_statement Wafv2RuleGroup#ip_set_reference_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementIpSetReferenceStatement getIpSetReferenceStatement() {
        return null;
    }

    /**
     * label_match_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#label_match_statement Wafv2RuleGroup#label_match_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementLabelMatchStatement getLabelMatchStatement() {
        return null;
    }

    /**
     * not_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#not_statement Wafv2RuleGroup#not_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementNotStatement getNotStatement() {
        return null;
    }

    /**
     * or_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#or_statement Wafv2RuleGroup#or_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementOrStatement getOrStatement() {
        return null;
    }

    /**
     * regex_pattern_set_reference_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#regex_pattern_set_reference_statement Wafv2RuleGroup#regex_pattern_set_reference_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement getRegexPatternSetReferenceStatement() {
        return null;
    }

    /**
     * size_constraint_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#size_constraint_statement Wafv2RuleGroup#size_constraint_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementSizeConstraintStatement getSizeConstraintStatement() {
        return null;
    }

    /**
     * sqli_match_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#sqli_match_statement Wafv2RuleGroup#sqli_match_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementSqliMatchStatement getSqliMatchStatement() {
        return null;
    }

    /**
     * xss_match_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#xss_match_statement Wafv2RuleGroup#xss_match_statement}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatement getXssMatchStatement() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Wafv2RuleGroupRuleStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Wafv2RuleGroupRuleStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Wafv2RuleGroupRuleStatement> {
        imports.aws.wafv2.Wafv2RuleGroupRuleStatementAndStatement andStatement;
        imports.aws.wafv2.Wafv2RuleGroupRuleStatementByteMatchStatement byteMatchStatement;
        imports.aws.wafv2.Wafv2RuleGroupRuleStatementGeoMatchStatement geoMatchStatement;
        imports.aws.wafv2.Wafv2RuleGroupRuleStatementIpSetReferenceStatement ipSetReferenceStatement;
        imports.aws.wafv2.Wafv2RuleGroupRuleStatementLabelMatchStatement labelMatchStatement;
        imports.aws.wafv2.Wafv2RuleGroupRuleStatementNotStatement notStatement;
        imports.aws.wafv2.Wafv2RuleGroupRuleStatementOrStatement orStatement;
        imports.aws.wafv2.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        imports.aws.wafv2.Wafv2RuleGroupRuleStatementSizeConstraintStatement sizeConstraintStatement;
        imports.aws.wafv2.Wafv2RuleGroupRuleStatementSqliMatchStatement sqliMatchStatement;
        imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatement xssMatchStatement;

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getAndStatement}
         * @param andStatement and_statement block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#and_statement Wafv2RuleGroup#and_statement}
         * @return {@code this}
         */
        public Builder andStatement(imports.aws.wafv2.Wafv2RuleGroupRuleStatementAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getByteMatchStatement}
         * @param byteMatchStatement byte_match_statement block.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#byte_match_statement Wafv2RuleGroup#byte_match_statement}
         * @return {@code this}
         */
        public Builder byteMatchStatement(imports.aws.wafv2.Wafv2RuleGroupRuleStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getGeoMatchStatement}
         * @param geoMatchStatement geo_match_statement block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#geo_match_statement Wafv2RuleGroup#geo_match_statement}
         * @return {@code this}
         */
        public Builder geoMatchStatement(imports.aws.wafv2.Wafv2RuleGroupRuleStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getIpSetReferenceStatement}
         * @param ipSetReferenceStatement ip_set_reference_statement block.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#ip_set_reference_statement Wafv2RuleGroup#ip_set_reference_statement}
         * @return {@code this}
         */
        public Builder ipSetReferenceStatement(imports.aws.wafv2.Wafv2RuleGroupRuleStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getLabelMatchStatement}
         * @param labelMatchStatement label_match_statement block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#label_match_statement Wafv2RuleGroup#label_match_statement}
         * @return {@code this}
         */
        public Builder labelMatchStatement(imports.aws.wafv2.Wafv2RuleGroupRuleStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getNotStatement}
         * @param notStatement not_statement block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#not_statement Wafv2RuleGroup#not_statement}
         * @return {@code this}
         */
        public Builder notStatement(imports.aws.wafv2.Wafv2RuleGroupRuleStatementNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getOrStatement}
         * @param orStatement or_statement block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#or_statement Wafv2RuleGroup#or_statement}
         * @return {@code this}
         */
        public Builder orStatement(imports.aws.wafv2.Wafv2RuleGroupRuleStatementOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getRegexPatternSetReferenceStatement}
         * @param regexPatternSetReferenceStatement regex_pattern_set_reference_statement block.
         *                                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#regex_pattern_set_reference_statement Wafv2RuleGroup#regex_pattern_set_reference_statement}
         * @return {@code this}
         */
        public Builder regexPatternSetReferenceStatement(imports.aws.wafv2.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getSizeConstraintStatement}
         * @param sizeConstraintStatement size_constraint_statement block.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#size_constraint_statement Wafv2RuleGroup#size_constraint_statement}
         * @return {@code this}
         */
        public Builder sizeConstraintStatement(imports.aws.wafv2.Wafv2RuleGroupRuleStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getSqliMatchStatement}
         * @param sqliMatchStatement sqli_match_statement block.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#sqli_match_statement Wafv2RuleGroup#sqli_match_statement}
         * @return {@code this}
         */
        public Builder sqliMatchStatement(imports.aws.wafv2.Wafv2RuleGroupRuleStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        /**
         * Sets the value of {@link Wafv2RuleGroupRuleStatement#getXssMatchStatement}
         * @param xssMatchStatement xss_match_statement block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/wafv2_rule_group#xss_match_statement Wafv2RuleGroup#xss_match_statement}
         * @return {@code this}
         */
        public Builder xssMatchStatement(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Wafv2RuleGroupRuleStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Wafv2RuleGroupRuleStatement build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Wafv2RuleGroupRuleStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Wafv2RuleGroupRuleStatement {
        private final imports.aws.wafv2.Wafv2RuleGroupRuleStatementAndStatement andStatement;
        private final imports.aws.wafv2.Wafv2RuleGroupRuleStatementByteMatchStatement byteMatchStatement;
        private final imports.aws.wafv2.Wafv2RuleGroupRuleStatementGeoMatchStatement geoMatchStatement;
        private final imports.aws.wafv2.Wafv2RuleGroupRuleStatementIpSetReferenceStatement ipSetReferenceStatement;
        private final imports.aws.wafv2.Wafv2RuleGroupRuleStatementLabelMatchStatement labelMatchStatement;
        private final imports.aws.wafv2.Wafv2RuleGroupRuleStatementNotStatement notStatement;
        private final imports.aws.wafv2.Wafv2RuleGroupRuleStatementOrStatement orStatement;
        private final imports.aws.wafv2.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private final imports.aws.wafv2.Wafv2RuleGroupRuleStatementSizeConstraintStatement sizeConstraintStatement;
        private final imports.aws.wafv2.Wafv2RuleGroupRuleStatementSqliMatchStatement sqliMatchStatement;
        private final imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatement xssMatchStatement;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.andStatement = software.amazon.jsii.Kernel.get(this, "andStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementAndStatement.class));
            this.byteMatchStatement = software.amazon.jsii.Kernel.get(this, "byteMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementByteMatchStatement.class));
            this.geoMatchStatement = software.amazon.jsii.Kernel.get(this, "geoMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementGeoMatchStatement.class));
            this.ipSetReferenceStatement = software.amazon.jsii.Kernel.get(this, "ipSetReferenceStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementIpSetReferenceStatement.class));
            this.labelMatchStatement = software.amazon.jsii.Kernel.get(this, "labelMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementLabelMatchStatement.class));
            this.notStatement = software.amazon.jsii.Kernel.get(this, "notStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementNotStatement.class));
            this.orStatement = software.amazon.jsii.Kernel.get(this, "orStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementOrStatement.class));
            this.regexPatternSetReferenceStatement = software.amazon.jsii.Kernel.get(this, "regexPatternSetReferenceStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement.class));
            this.sizeConstraintStatement = software.amazon.jsii.Kernel.get(this, "sizeConstraintStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementSizeConstraintStatement.class));
            this.sqliMatchStatement = software.amazon.jsii.Kernel.get(this, "sqliMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementSqliMatchStatement.class));
            this.xssMatchStatement = software.amazon.jsii.Kernel.get(this, "xssMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatement.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.andStatement = builder.andStatement;
            this.byteMatchStatement = builder.byteMatchStatement;
            this.geoMatchStatement = builder.geoMatchStatement;
            this.ipSetReferenceStatement = builder.ipSetReferenceStatement;
            this.labelMatchStatement = builder.labelMatchStatement;
            this.notStatement = builder.notStatement;
            this.orStatement = builder.orStatement;
            this.regexPatternSetReferenceStatement = builder.regexPatternSetReferenceStatement;
            this.sizeConstraintStatement = builder.sizeConstraintStatement;
            this.sqliMatchStatement = builder.sqliMatchStatement;
            this.xssMatchStatement = builder.xssMatchStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleStatementAndStatement getAndStatement() {
            return this.andStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleStatementByteMatchStatement getByteMatchStatement() {
            return this.byteMatchStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleStatementGeoMatchStatement getGeoMatchStatement() {
            return this.geoMatchStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleStatementIpSetReferenceStatement getIpSetReferenceStatement() {
            return this.ipSetReferenceStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleStatementLabelMatchStatement getLabelMatchStatement() {
            return this.labelMatchStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleStatementNotStatement getNotStatement() {
            return this.notStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleStatementOrStatement getOrStatement() {
            return this.orStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleStatementRegexPatternSetReferenceStatement getRegexPatternSetReferenceStatement() {
            return this.regexPatternSetReferenceStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleStatementSizeConstraintStatement getSizeConstraintStatement() {
            return this.sizeConstraintStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleStatementSqliMatchStatement getSqliMatchStatement() {
            return this.sqliMatchStatement;
        }

        @Override
        public final imports.aws.wafv2.Wafv2RuleGroupRuleStatementXssMatchStatement getXssMatchStatement() {
            return this.xssMatchStatement;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAndStatement() != null) {
                data.set("andStatement", om.valueToTree(this.getAndStatement()));
            }
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
            if (this.getNotStatement() != null) {
                data.set("notStatement", om.valueToTree(this.getNotStatement()));
            }
            if (this.getOrStatement() != null) {
                data.set("orStatement", om.valueToTree(this.getOrStatement()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafv2.Wafv2RuleGroupRuleStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wafv2RuleGroupRuleStatement.Jsii$Proxy that = (Wafv2RuleGroupRuleStatement.Jsii$Proxy) o;

            if (this.andStatement != null ? !this.andStatement.equals(that.andStatement) : that.andStatement != null) return false;
            if (this.byteMatchStatement != null ? !this.byteMatchStatement.equals(that.byteMatchStatement) : that.byteMatchStatement != null) return false;
            if (this.geoMatchStatement != null ? !this.geoMatchStatement.equals(that.geoMatchStatement) : that.geoMatchStatement != null) return false;
            if (this.ipSetReferenceStatement != null ? !this.ipSetReferenceStatement.equals(that.ipSetReferenceStatement) : that.ipSetReferenceStatement != null) return false;
            if (this.labelMatchStatement != null ? !this.labelMatchStatement.equals(that.labelMatchStatement) : that.labelMatchStatement != null) return false;
            if (this.notStatement != null ? !this.notStatement.equals(that.notStatement) : that.notStatement != null) return false;
            if (this.orStatement != null ? !this.orStatement.equals(that.orStatement) : that.orStatement != null) return false;
            if (this.regexPatternSetReferenceStatement != null ? !this.regexPatternSetReferenceStatement.equals(that.regexPatternSetReferenceStatement) : that.regexPatternSetReferenceStatement != null) return false;
            if (this.sizeConstraintStatement != null ? !this.sizeConstraintStatement.equals(that.sizeConstraintStatement) : that.sizeConstraintStatement != null) return false;
            if (this.sqliMatchStatement != null ? !this.sqliMatchStatement.equals(that.sqliMatchStatement) : that.sqliMatchStatement != null) return false;
            return this.xssMatchStatement != null ? this.xssMatchStatement.equals(that.xssMatchStatement) : that.xssMatchStatement == null;
        }

        @Override
        public final int hashCode() {
            int result = this.andStatement != null ? this.andStatement.hashCode() : 0;
            result = 31 * result + (this.byteMatchStatement != null ? this.byteMatchStatement.hashCode() : 0);
            result = 31 * result + (this.geoMatchStatement != null ? this.geoMatchStatement.hashCode() : 0);
            result = 31 * result + (this.ipSetReferenceStatement != null ? this.ipSetReferenceStatement.hashCode() : 0);
            result = 31 * result + (this.labelMatchStatement != null ? this.labelMatchStatement.hashCode() : 0);
            result = 31 * result + (this.notStatement != null ? this.notStatement.hashCode() : 0);
            result = 31 * result + (this.orStatement != null ? this.orStatement.hashCode() : 0);
            result = 31 * result + (this.regexPatternSetReferenceStatement != null ? this.regexPatternSetReferenceStatement.hashCode() : 0);
            result = 31 * result + (this.sizeConstraintStatement != null ? this.sizeConstraintStatement.hashCode() : 0);
            result = 31 * result + (this.sqliMatchStatement != null ? this.sqliMatchStatement.hashCode() : 0);
            result = 31 * result + (this.xssMatchStatement != null ? this.xssMatchStatement.hashCode() : 0);
            return result;
        }
    }
}
