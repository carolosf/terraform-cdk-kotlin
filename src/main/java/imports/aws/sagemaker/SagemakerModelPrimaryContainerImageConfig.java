package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.105Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerModelPrimaryContainerImageConfig")
@software.amazon.jsii.Jsii.Proxy(SagemakerModelPrimaryContainerImageConfig.Jsii$Proxy.class)
public interface SagemakerModelPrimaryContainerImageConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#repository_access_mode SagemakerModel#repository_access_mode}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRepositoryAccessMode();

    /**
     * @return a {@link Builder} of {@link SagemakerModelPrimaryContainerImageConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerModelPrimaryContainerImageConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerModelPrimaryContainerImageConfig> {
        java.lang.String repositoryAccessMode;

        /**
         * Sets the value of {@link SagemakerModelPrimaryContainerImageConfig#getRepositoryAccessMode}
         * @param repositoryAccessMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#repository_access_mode SagemakerModel#repository_access_mode}. This parameter is required.
         * @return {@code this}
         */
        public Builder repositoryAccessMode(java.lang.String repositoryAccessMode) {
            this.repositoryAccessMode = repositoryAccessMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerModelPrimaryContainerImageConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerModelPrimaryContainerImageConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerModelPrimaryContainerImageConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerModelPrimaryContainerImageConfig {
        private final java.lang.String repositoryAccessMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.repositoryAccessMode = software.amazon.jsii.Kernel.get(this, "repositoryAccessMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.repositoryAccessMode = java.util.Objects.requireNonNull(builder.repositoryAccessMode, "repositoryAccessMode is required");
        }

        @Override
        public final java.lang.String getRepositoryAccessMode() {
            return this.repositoryAccessMode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("repositoryAccessMode", om.valueToTree(this.getRepositoryAccessMode()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerModelPrimaryContainerImageConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerModelPrimaryContainerImageConfig.Jsii$Proxy that = (SagemakerModelPrimaryContainerImageConfig.Jsii$Proxy) o;

            return this.repositoryAccessMode.equals(that.repositoryAccessMode);
        }

        @Override
        public final int hashCode() {
            int result = this.repositoryAccessMode.hashCode();
            return result;
        }
    }
}
