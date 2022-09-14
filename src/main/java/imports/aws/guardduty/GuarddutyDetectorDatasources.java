package imports.aws.guardduty;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.746Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.guardduty.GuarddutyDetectorDatasources")
@software.amazon.jsii.Jsii.Proxy(GuarddutyDetectorDatasources.Jsii$Proxy.class)
public interface GuarddutyDetectorDatasources extends software.amazon.jsii.JsiiSerializable {

    /**
     * s3_logs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#s3_logs GuarddutyDetector#s3_logs}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.guardduty.GuarddutyDetectorDatasourcesS3Logs getS3Logs() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GuarddutyDetectorDatasources}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GuarddutyDetectorDatasources}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GuarddutyDetectorDatasources> {
        imports.aws.guardduty.GuarddutyDetectorDatasourcesS3Logs s3Logs;

        /**
         * Sets the value of {@link GuarddutyDetectorDatasources#getS3Logs}
         * @param s3Logs s3_logs block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#s3_logs GuarddutyDetector#s3_logs}
         * @return {@code this}
         */
        public Builder s3Logs(imports.aws.guardduty.GuarddutyDetectorDatasourcesS3Logs s3Logs) {
            this.s3Logs = s3Logs;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GuarddutyDetectorDatasources}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GuarddutyDetectorDatasources build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GuarddutyDetectorDatasources}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GuarddutyDetectorDatasources {
        private final imports.aws.guardduty.GuarddutyDetectorDatasourcesS3Logs s3Logs;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.s3Logs = software.amazon.jsii.Kernel.get(this, "s3Logs", software.amazon.jsii.NativeType.forClass(imports.aws.guardduty.GuarddutyDetectorDatasourcesS3Logs.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.s3Logs = builder.s3Logs;
        }

        @Override
        public final imports.aws.guardduty.GuarddutyDetectorDatasourcesS3Logs getS3Logs() {
            return this.s3Logs;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getS3Logs() != null) {
                data.set("s3Logs", om.valueToTree(this.getS3Logs()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.guardduty.GuarddutyDetectorDatasources"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GuarddutyDetectorDatasources.Jsii$Proxy that = (GuarddutyDetectorDatasources.Jsii$Proxy) o;

            return this.s3Logs != null ? this.s3Logs.equals(that.s3Logs) : that.s3Logs == null;
        }

        @Override
        public final int hashCode() {
            int result = this.s3Logs != null ? this.s3Logs.hashCode() : 0;
            return result;
        }
    }
}
