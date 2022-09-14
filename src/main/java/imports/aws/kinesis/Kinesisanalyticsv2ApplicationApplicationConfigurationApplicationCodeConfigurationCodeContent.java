package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.819Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent")
@software.amazon.jsii.Jsii.Proxy(Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent.Jsii$Proxy.class)
public interface Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent extends software.amazon.jsii.JsiiSerializable {

    /**
     * s3_content_location block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#s3_content_location Kinesisanalyticsv2Application#s3_content_location}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation getS3ContentLocation() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#text_content Kinesisanalyticsv2Application#text_content}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTextContent() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent> {
        imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation s3ContentLocation;
        java.lang.String textContent;

        /**
         * Sets the value of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent#getS3ContentLocation}
         * @param s3ContentLocation s3_content_location block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#s3_content_location Kinesisanalyticsv2Application#s3_content_location}
         * @return {@code this}
         */
        public Builder s3ContentLocation(imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation s3ContentLocation) {
            this.s3ContentLocation = s3ContentLocation;
            return this;
        }

        /**
         * Sets the value of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent#getTextContent}
         * @param textContent Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#text_content Kinesisanalyticsv2Application#text_content}.
         * @return {@code this}
         */
        public Builder textContent(java.lang.String textContent) {
            this.textContent = textContent;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent {
        private final imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation s3ContentLocation;
        private final java.lang.String textContent;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.s3ContentLocation = software.amazon.jsii.Kernel.get(this, "s3ContentLocation", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation.class));
            this.textContent = software.amazon.jsii.Kernel.get(this, "textContent", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.s3ContentLocation = builder.s3ContentLocation;
            this.textContent = builder.textContent;
        }

        @Override
        public final imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation getS3ContentLocation() {
            return this.s3ContentLocation;
        }

        @Override
        public final java.lang.String getTextContent() {
            return this.textContent;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getS3ContentLocation() != null) {
                data.set("s3ContentLocation", om.valueToTree(this.getS3ContentLocation()));
            }
            if (this.getTextContent() != null) {
                data.set("textContent", om.valueToTree(this.getTextContent()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent.Jsii$Proxy that = (Kinesisanalyticsv2ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent.Jsii$Proxy) o;

            if (this.s3ContentLocation != null ? !this.s3ContentLocation.equals(that.s3ContentLocation) : that.s3ContentLocation != null) return false;
            return this.textContent != null ? this.textContent.equals(that.textContent) : that.textContent == null;
        }

        @Override
        public final int hashCode() {
            int result = this.s3ContentLocation != null ? this.s3ContentLocation.hashCode() : 0;
            result = 31 * result + (this.textContent != null ? this.textContent.hashCode() : 0);
            return result;
        }
    }
}
