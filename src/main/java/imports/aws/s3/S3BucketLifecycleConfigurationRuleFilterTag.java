package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.061Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketLifecycleConfigurationRuleFilterTag")
@software.amazon.jsii.Jsii.Proxy(S3BucketLifecycleConfigurationRuleFilterTag.Jsii$Proxy.class)
public interface S3BucketLifecycleConfigurationRuleFilterTag extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#key S3BucketLifecycleConfiguration#key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#value S3BucketLifecycleConfiguration#value}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    /**
     * @return a {@link Builder} of {@link S3BucketLifecycleConfigurationRuleFilterTag}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketLifecycleConfigurationRuleFilterTag}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketLifecycleConfigurationRuleFilterTag> {
        java.lang.String key;
        java.lang.String value;

        /**
         * Sets the value of {@link S3BucketLifecycleConfigurationRuleFilterTag#getKey}
         * @param key Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#key S3BucketLifecycleConfiguration#key}. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleConfigurationRuleFilterTag#getValue}
         * @param value Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#value S3BucketLifecycleConfiguration#value}. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketLifecycleConfigurationRuleFilterTag}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketLifecycleConfigurationRuleFilterTag build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3BucketLifecycleConfigurationRuleFilterTag}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketLifecycleConfigurationRuleFilterTag {
        private final java.lang.String key;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
            this.value = java.util.Objects.requireNonNull(builder.value, "value is required");
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("key", om.valueToTree(this.getKey()));
            data.set("value", om.valueToTree(this.getValue()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3BucketLifecycleConfigurationRuleFilterTag"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketLifecycleConfigurationRuleFilterTag.Jsii$Proxy that = (S3BucketLifecycleConfigurationRuleFilterTag.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            return this.value.equals(that.value);
        }

        @Override
        public final int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.value.hashCode());
            return result;
        }
    }
}
