package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.824Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration")
@software.amazon.jsii.Jsii.Proxy(Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration.Jsii$Proxy.class)
public interface Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * application_restore_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#application_restore_configuration Kinesisanalyticsv2Application#application_restore_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration getApplicationRestoreConfiguration() {
        return null;
    }

    /**
     * flink_run_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#flink_run_configuration Kinesisanalyticsv2Application#flink_run_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration getFlinkRunConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration> {
        imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration applicationRestoreConfiguration;
        imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration flinkRunConfiguration;

        /**
         * Sets the value of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration#getApplicationRestoreConfiguration}
         * @param applicationRestoreConfiguration application_restore_configuration block.
         *                                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#application_restore_configuration Kinesisanalyticsv2Application#application_restore_configuration}
         * @return {@code this}
         */
        public Builder applicationRestoreConfiguration(imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration applicationRestoreConfiguration) {
            this.applicationRestoreConfiguration = applicationRestoreConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration#getFlinkRunConfiguration}
         * @param flinkRunConfiguration flink_run_configuration block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#flink_run_configuration Kinesisanalyticsv2Application#flink_run_configuration}
         * @return {@code this}
         */
        public Builder flinkRunConfiguration(imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration flinkRunConfiguration) {
            this.flinkRunConfiguration = flinkRunConfiguration;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration {
        private final imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration applicationRestoreConfiguration;
        private final imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration flinkRunConfiguration;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.applicationRestoreConfiguration = software.amazon.jsii.Kernel.get(this, "applicationRestoreConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration.class));
            this.flinkRunConfiguration = software.amazon.jsii.Kernel.get(this, "flinkRunConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.applicationRestoreConfiguration = builder.applicationRestoreConfiguration;
            this.flinkRunConfiguration = builder.flinkRunConfiguration;
        }

        @Override
        public final imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration getApplicationRestoreConfiguration() {
            return this.applicationRestoreConfiguration;
        }

        @Override
        public final imports.aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration getFlinkRunConfiguration() {
            return this.flinkRunConfiguration;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getApplicationRestoreConfiguration() != null) {
                data.set("applicationRestoreConfiguration", om.valueToTree(this.getApplicationRestoreConfiguration()));
            }
            if (this.getFlinkRunConfiguration() != null) {
                data.set("flinkRunConfiguration", om.valueToTree(this.getFlinkRunConfiguration()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration.Jsii$Proxy that = (Kinesisanalyticsv2ApplicationApplicationConfigurationRunConfiguration.Jsii$Proxy) o;

            if (this.applicationRestoreConfiguration != null ? !this.applicationRestoreConfiguration.equals(that.applicationRestoreConfiguration) : that.applicationRestoreConfiguration != null) return false;
            return this.flinkRunConfiguration != null ? this.flinkRunConfiguration.equals(that.flinkRunConfiguration) : that.flinkRunConfiguration == null;
        }

        @Override
        public final int hashCode() {
            int result = this.applicationRestoreConfiguration != null ? this.applicationRestoreConfiguration.hashCode() : 0;
            result = 31 * result + (this.flinkRunConfiguration != null ? this.flinkRunConfiguration.hashCode() : 0);
            return result;
        }
    }
}
