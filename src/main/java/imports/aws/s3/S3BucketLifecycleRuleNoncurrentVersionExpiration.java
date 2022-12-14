package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.061Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketLifecycleRuleNoncurrentVersionExpiration")
@software.amazon.jsii.Jsii.Proxy(S3BucketLifecycleRuleNoncurrentVersionExpiration.Jsii$Proxy.class)
public interface S3BucketLifecycleRuleNoncurrentVersionExpiration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket#days S3Bucket#days}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDays() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketLifecycleRuleNoncurrentVersionExpiration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketLifecycleRuleNoncurrentVersionExpiration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketLifecycleRuleNoncurrentVersionExpiration> {
        java.lang.Number days;

        /**
         * Sets the value of {@link S3BucketLifecycleRuleNoncurrentVersionExpiration#getDays}
         * @param days Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket#days S3Bucket#days}.
         * @return {@code this}
         */
        public Builder days(java.lang.Number days) {
            this.days = days;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketLifecycleRuleNoncurrentVersionExpiration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketLifecycleRuleNoncurrentVersionExpiration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3BucketLifecycleRuleNoncurrentVersionExpiration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketLifecycleRuleNoncurrentVersionExpiration {
        private final java.lang.Number days;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.days = software.amazon.jsii.Kernel.get(this, "days", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.days = builder.days;
        }

        @Override
        public final java.lang.Number getDays() {
            return this.days;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDays() != null) {
                data.set("days", om.valueToTree(this.getDays()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3BucketLifecycleRuleNoncurrentVersionExpiration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketLifecycleRuleNoncurrentVersionExpiration.Jsii$Proxy that = (S3BucketLifecycleRuleNoncurrentVersionExpiration.Jsii$Proxy) o;

            return this.days != null ? this.days.equals(that.days) : that.days == null;
        }

        @Override
        public final int hashCode() {
            int result = this.days != null ? this.days.hashCode() : 0;
            return result;
        }
    }
}
