package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.827Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters")
@software.amazon.jsii.Jsii.Proxy(Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters.Jsii$Proxy.class)
public interface Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters extends software.amazon.jsii.JsiiSerializable {

    /**
     * csv_mapping_parameters block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#csv_mapping_parameters Kinesisanalyticsv2Application#csv_mapping_parameters}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters getCsvMappingParameters() {
        return null;
    }

    /**
     * json_mapping_parameters block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#json_mapping_parameters Kinesisanalyticsv2Application#json_mapping_parameters}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters getJsonMappingParameters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters> {
        imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters csvMappingParameters;
        imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters jsonMappingParameters;

        /**
         * Sets the value of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters#getCsvMappingParameters}
         * @param csvMappingParameters csv_mapping_parameters block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#csv_mapping_parameters Kinesisanalyticsv2Application#csv_mapping_parameters}
         * @return {@code this}
         */
        public Builder csvMappingParameters(imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters csvMappingParameters) {
            this.csvMappingParameters = csvMappingParameters;
            return this;
        }

        /**
         * Sets the value of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters#getJsonMappingParameters}
         * @param jsonMappingParameters json_mapping_parameters block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#json_mapping_parameters Kinesisanalyticsv2Application#json_mapping_parameters}
         * @return {@code this}
         */
        public Builder jsonMappingParameters(imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters jsonMappingParameters) {
            this.jsonMappingParameters = jsonMappingParameters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters {
        private final imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters csvMappingParameters;
        private final imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters jsonMappingParameters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.csvMappingParameters = software.amazon.jsii.Kernel.get(this, "csvMappingParameters", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters.class));
            this.jsonMappingParameters = software.amazon.jsii.Kernel.get(this, "jsonMappingParameters", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.csvMappingParameters = builder.csvMappingParameters;
            this.jsonMappingParameters = builder.jsonMappingParameters;
        }

        @Override
        public final imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters getCsvMappingParameters() {
            return this.csvMappingParameters;
        }

        @Override
        public final imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters getJsonMappingParameters() {
            return this.jsonMappingParameters;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCsvMappingParameters() != null) {
                data.set("csvMappingParameters", om.valueToTree(this.getCsvMappingParameters()));
            }
            if (this.getJsonMappingParameters() != null) {
                data.set("jsonMappingParameters", om.valueToTree(this.getJsonMappingParameters()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters.Jsii$Proxy that = (Kinesisanalyticsv2ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters.Jsii$Proxy) o;

            if (this.csvMappingParameters != null ? !this.csvMappingParameters.equals(that.csvMappingParameters) : that.csvMappingParameters != null) return false;
            return this.jsonMappingParameters != null ? this.jsonMappingParameters.equals(that.jsonMappingParameters) : that.jsonMappingParameters == null;
        }

        @Override
        public final int hashCode() {
            int result = this.csvMappingParameters != null ? this.csvMappingParameters.hashCode() : 0;
            result = 31 * result + (this.jsonMappingParameters != null ? this.jsonMappingParameters.hashCode() : 0);
            return result;
        }
    }
}
