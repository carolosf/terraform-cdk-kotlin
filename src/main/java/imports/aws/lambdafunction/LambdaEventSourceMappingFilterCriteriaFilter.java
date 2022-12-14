package imports.aws.lambdafunction;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.849Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaEventSourceMappingFilterCriteriaFilter")
@software.amazon.jsii.Jsii.Proxy(LambdaEventSourceMappingFilterCriteriaFilter.Jsii$Proxy.class)
public interface LambdaEventSourceMappingFilterCriteriaFilter extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#pattern LambdaEventSourceMapping#pattern}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPattern() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LambdaEventSourceMappingFilterCriteriaFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaEventSourceMappingFilterCriteriaFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaEventSourceMappingFilterCriteriaFilter> {
        java.lang.String pattern;

        /**
         * Sets the value of {@link LambdaEventSourceMappingFilterCriteriaFilter#getPattern}
         * @param pattern Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#pattern LambdaEventSourceMapping#pattern}.
         * @return {@code this}
         */
        public Builder pattern(java.lang.String pattern) {
            this.pattern = pattern;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LambdaEventSourceMappingFilterCriteriaFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaEventSourceMappingFilterCriteriaFilter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LambdaEventSourceMappingFilterCriteriaFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaEventSourceMappingFilterCriteriaFilter {
        private final java.lang.String pattern;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.pattern = software.amazon.jsii.Kernel.get(this, "pattern", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.pattern = builder.pattern;
        }

        @Override
        public final java.lang.String getPattern() {
            return this.pattern;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPattern() != null) {
                data.set("pattern", om.valueToTree(this.getPattern()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.lambdafunction.LambdaEventSourceMappingFilterCriteriaFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaEventSourceMappingFilterCriteriaFilter.Jsii$Proxy that = (LambdaEventSourceMappingFilterCriteriaFilter.Jsii$Proxy) o;

            return this.pattern != null ? this.pattern.equals(that.pattern) : that.pattern == null;
        }

        @Override
        public final int hashCode() {
            int result = this.pattern != null ? this.pattern.hashCode() : 0;
            return result;
        }
    }
}
