package imports.aws.dms;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.469Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dms.DmsEndpointElasticsearchSettings")
@software.amazon.jsii.Jsii.Proxy(DmsEndpointElasticsearchSettings.Jsii$Proxy.class)
public interface DmsEndpointElasticsearchSettings extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#endpoint_uri DmsEndpoint#endpoint_uri}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEndpointUri();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#service_access_role_arn DmsEndpoint#service_access_role_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getServiceAccessRoleArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#error_retry_duration DmsEndpoint#error_retry_duration}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getErrorRetryDuration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#full_load_error_percentage DmsEndpoint#full_load_error_percentage}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getFullLoadErrorPercentage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DmsEndpointElasticsearchSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DmsEndpointElasticsearchSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DmsEndpointElasticsearchSettings> {
        java.lang.String endpointUri;
        java.lang.String serviceAccessRoleArn;
        java.lang.Number errorRetryDuration;
        java.lang.Number fullLoadErrorPercentage;

        /**
         * Sets the value of {@link DmsEndpointElasticsearchSettings#getEndpointUri}
         * @param endpointUri Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#endpoint_uri DmsEndpoint#endpoint_uri}. This parameter is required.
         * @return {@code this}
         */
        public Builder endpointUri(java.lang.String endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointElasticsearchSettings#getServiceAccessRoleArn}
         * @param serviceAccessRoleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#service_access_role_arn DmsEndpoint#service_access_role_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceAccessRoleArn(java.lang.String serviceAccessRoleArn) {
            this.serviceAccessRoleArn = serviceAccessRoleArn;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointElasticsearchSettings#getErrorRetryDuration}
         * @param errorRetryDuration Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#error_retry_duration DmsEndpoint#error_retry_duration}.
         * @return {@code this}
         */
        public Builder errorRetryDuration(java.lang.Number errorRetryDuration) {
            this.errorRetryDuration = errorRetryDuration;
            return this;
        }

        /**
         * Sets the value of {@link DmsEndpointElasticsearchSettings#getFullLoadErrorPercentage}
         * @param fullLoadErrorPercentage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#full_load_error_percentage DmsEndpoint#full_load_error_percentage}.
         * @return {@code this}
         */
        public Builder fullLoadErrorPercentage(java.lang.Number fullLoadErrorPercentage) {
            this.fullLoadErrorPercentage = fullLoadErrorPercentage;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DmsEndpointElasticsearchSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DmsEndpointElasticsearchSettings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DmsEndpointElasticsearchSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DmsEndpointElasticsearchSettings {
        private final java.lang.String endpointUri;
        private final java.lang.String serviceAccessRoleArn;
        private final java.lang.Number errorRetryDuration;
        private final java.lang.Number fullLoadErrorPercentage;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.endpointUri = software.amazon.jsii.Kernel.get(this, "endpointUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceAccessRoleArn = software.amazon.jsii.Kernel.get(this, "serviceAccessRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.errorRetryDuration = software.amazon.jsii.Kernel.get(this, "errorRetryDuration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.fullLoadErrorPercentage = software.amazon.jsii.Kernel.get(this, "fullLoadErrorPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.endpointUri = java.util.Objects.requireNonNull(builder.endpointUri, "endpointUri is required");
            this.serviceAccessRoleArn = java.util.Objects.requireNonNull(builder.serviceAccessRoleArn, "serviceAccessRoleArn is required");
            this.errorRetryDuration = builder.errorRetryDuration;
            this.fullLoadErrorPercentage = builder.fullLoadErrorPercentage;
        }

        @Override
        public final java.lang.String getEndpointUri() {
            return this.endpointUri;
        }

        @Override
        public final java.lang.String getServiceAccessRoleArn() {
            return this.serviceAccessRoleArn;
        }

        @Override
        public final java.lang.Number getErrorRetryDuration() {
            return this.errorRetryDuration;
        }

        @Override
        public final java.lang.Number getFullLoadErrorPercentage() {
            return this.fullLoadErrorPercentage;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("endpointUri", om.valueToTree(this.getEndpointUri()));
            data.set("serviceAccessRoleArn", om.valueToTree(this.getServiceAccessRoleArn()));
            if (this.getErrorRetryDuration() != null) {
                data.set("errorRetryDuration", om.valueToTree(this.getErrorRetryDuration()));
            }
            if (this.getFullLoadErrorPercentage() != null) {
                data.set("fullLoadErrorPercentage", om.valueToTree(this.getFullLoadErrorPercentage()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.dms.DmsEndpointElasticsearchSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DmsEndpointElasticsearchSettings.Jsii$Proxy that = (DmsEndpointElasticsearchSettings.Jsii$Proxy) o;

            if (!endpointUri.equals(that.endpointUri)) return false;
            if (!serviceAccessRoleArn.equals(that.serviceAccessRoleArn)) return false;
            if (this.errorRetryDuration != null ? !this.errorRetryDuration.equals(that.errorRetryDuration) : that.errorRetryDuration != null) return false;
            return this.fullLoadErrorPercentage != null ? this.fullLoadErrorPercentage.equals(that.fullLoadErrorPercentage) : that.fullLoadErrorPercentage == null;
        }

        @Override
        public final int hashCode() {
            int result = this.endpointUri.hashCode();
            result = 31 * result + (this.serviceAccessRoleArn.hashCode());
            result = 31 * result + (this.errorRetryDuration != null ? this.errorRetryDuration.hashCode() : 0);
            result = 31 * result + (this.fullLoadErrorPercentage != null ? this.fullLoadErrorPercentage.hashCode() : 0);
            return result;
        }
    }
}
