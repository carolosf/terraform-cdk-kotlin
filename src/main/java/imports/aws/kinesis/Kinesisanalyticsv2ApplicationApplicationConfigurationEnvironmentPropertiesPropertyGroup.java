package imports.aws.kinesis;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.820Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup")
@software.amazon.jsii.Jsii.Proxy(Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup.Jsii$Proxy.class)
public interface Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#property_group_id Kinesisanalyticsv2Application#property_group_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPropertyGroupId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#property_map Kinesisanalyticsv2Application#property_map}.
     */
    @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getPropertyMap();

    /**
     * @return a {@link Builder} of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup> {
        java.lang.String propertyGroupId;
        java.util.Map<java.lang.String, java.lang.String> propertyMap;

        /**
         * Sets the value of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup#getPropertyGroupId}
         * @param propertyGroupId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#property_group_id Kinesisanalyticsv2Application#property_group_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder propertyGroupId(java.lang.String propertyGroupId) {
            this.propertyGroupId = propertyGroupId;
            return this;
        }

        /**
         * Sets the value of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup#getPropertyMap}
         * @param propertyMap Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesisanalyticsv2_application#property_map Kinesisanalyticsv2Application#property_map}. This parameter is required.
         * @return {@code this}
         */
        public Builder propertyMap(java.util.Map<java.lang.String, java.lang.String> propertyMap) {
            this.propertyMap = propertyMap;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup {
        private final java.lang.String propertyGroupId;
        private final java.util.Map<java.lang.String, java.lang.String> propertyMap;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.propertyGroupId = software.amazon.jsii.Kernel.get(this, "propertyGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.propertyMap = software.amazon.jsii.Kernel.get(this, "propertyMap", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.propertyGroupId = java.util.Objects.requireNonNull(builder.propertyGroupId, "propertyGroupId is required");
            this.propertyMap = java.util.Objects.requireNonNull(builder.propertyMap, "propertyMap is required");
        }

        @Override
        public final java.lang.String getPropertyGroupId() {
            return this.propertyGroupId;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getPropertyMap() {
            return this.propertyMap;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("propertyGroupId", om.valueToTree(this.getPropertyGroupId()));
            data.set("propertyMap", om.valueToTree(this.getPropertyMap()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.kinesis.Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup.Jsii$Proxy that = (Kinesisanalyticsv2ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup.Jsii$Proxy) o;

            if (!propertyGroupId.equals(that.propertyGroupId)) return false;
            return this.propertyMap.equals(that.propertyMap);
        }

        @Override
        public final int hashCode() {
            int result = this.propertyGroupId.hashCode();
            result = 31 * result + (this.propertyMap.hashCode());
            return result;
        }
    }
}
