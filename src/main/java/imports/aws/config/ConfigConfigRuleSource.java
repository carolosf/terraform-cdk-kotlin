package imports.aws.config;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.354Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.config.ConfigConfigRuleSource")
@software.amazon.jsii.Jsii.Proxy(ConfigConfigRuleSource.Jsii$Proxy.class)
public interface ConfigConfigRuleSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_config_rule#owner ConfigConfigRule#owner}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getOwner();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_config_rule#source_identifier ConfigConfigRule#source_identifier}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSourceIdentifier();

    /**
     * source_detail block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/config_config_rule#source_detail ConfigConfigRule#source_detail}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSourceDetail() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConfigConfigRuleSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigConfigRuleSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConfigConfigRuleSource> {
        java.lang.String owner;
        java.lang.String sourceIdentifier;
        java.lang.Object sourceDetail;

        /**
         * Sets the value of {@link ConfigConfigRuleSource#getOwner}
         * @param owner Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_config_rule#owner ConfigConfigRule#owner}. This parameter is required.
         * @return {@code this}
         */
        public Builder owner(java.lang.String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigRuleSource#getSourceIdentifier}
         * @param sourceIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_config_rule#source_identifier ConfigConfigRule#source_identifier}. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceIdentifier(java.lang.String sourceIdentifier) {
            this.sourceIdentifier = sourceIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigRuleSource#getSourceDetail}
         * @param sourceDetail source_detail block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/config_config_rule#source_detail ConfigConfigRule#source_detail}
         * @return {@code this}
         */
        public Builder sourceDetail(com.hashicorp.cdktf.IResolvable sourceDetail) {
            this.sourceDetail = sourceDetail;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigRuleSource#getSourceDetail}
         * @param sourceDetail source_detail block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/config_config_rule#source_detail ConfigConfigRule#source_detail}
         * @return {@code this}
         */
        public Builder sourceDetail(java.util.List<? extends imports.aws.config.ConfigConfigRuleSourceSourceDetail> sourceDetail) {
            this.sourceDetail = sourceDetail;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConfigConfigRuleSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConfigConfigRuleSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ConfigConfigRuleSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigConfigRuleSource {
        private final java.lang.String owner;
        private final java.lang.String sourceIdentifier;
        private final java.lang.Object sourceDetail;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.owner = software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceIdentifier = software.amazon.jsii.Kernel.get(this, "sourceIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceDetail = software.amazon.jsii.Kernel.get(this, "sourceDetail", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.owner = java.util.Objects.requireNonNull(builder.owner, "owner is required");
            this.sourceIdentifier = java.util.Objects.requireNonNull(builder.sourceIdentifier, "sourceIdentifier is required");
            this.sourceDetail = builder.sourceDetail;
        }

        @Override
        public final java.lang.String getOwner() {
            return this.owner;
        }

        @Override
        public final java.lang.String getSourceIdentifier() {
            return this.sourceIdentifier;
        }

        @Override
        public final java.lang.Object getSourceDetail() {
            return this.sourceDetail;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("owner", om.valueToTree(this.getOwner()));
            data.set("sourceIdentifier", om.valueToTree(this.getSourceIdentifier()));
            if (this.getSourceDetail() != null) {
                data.set("sourceDetail", om.valueToTree(this.getSourceDetail()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.config.ConfigConfigRuleSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigConfigRuleSource.Jsii$Proxy that = (ConfigConfigRuleSource.Jsii$Proxy) o;

            if (!owner.equals(that.owner)) return false;
            if (!sourceIdentifier.equals(that.sourceIdentifier)) return false;
            return this.sourceDetail != null ? this.sourceDetail.equals(that.sourceDetail) : that.sourceDetail == null;
        }

        @Override
        public final int hashCode() {
            int result = this.owner.hashCode();
            result = 31 * result + (this.sourceIdentifier.hashCode());
            result = 31 * result + (this.sourceDetail != null ? this.sourceDetail.hashCode() : 0);
            return result;
        }
    }
}
