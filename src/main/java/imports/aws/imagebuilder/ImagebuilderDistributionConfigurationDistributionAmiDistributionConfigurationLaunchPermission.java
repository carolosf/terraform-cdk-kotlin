package imports.aws.imagebuilder;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.780Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission")
@software.amazon.jsii.Jsii.Proxy(ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission.Jsii$Proxy.class)
public interface ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#user_groups ImagebuilderDistributionConfiguration#user_groups}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getUserGroups() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#user_ids ImagebuilderDistributionConfiguration#user_ids}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getUserIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> {
        java.util.List<java.lang.String> userGroups;
        java.util.List<java.lang.String> userIds;

        /**
         * Sets the value of {@link ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission#getUserGroups}
         * @param userGroups Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#user_groups ImagebuilderDistributionConfiguration#user_groups}.
         * @return {@code this}
         */
        public Builder userGroups(java.util.List<java.lang.String> userGroups) {
            this.userGroups = userGroups;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission#getUserIds}
         * @param userIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#user_ids ImagebuilderDistributionConfiguration#user_ids}.
         * @return {@code this}
         */
        public Builder userIds(java.util.List<java.lang.String> userIds) {
            this.userIds = userIds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission {
        private final java.util.List<java.lang.String> userGroups;
        private final java.util.List<java.lang.String> userIds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.userGroups = software.amazon.jsii.Kernel.get(this, "userGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.userIds = software.amazon.jsii.Kernel.get(this, "userIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.userGroups = builder.userGroups;
            this.userIds = builder.userIds;
        }

        @Override
        public final java.util.List<java.lang.String> getUserGroups() {
            return this.userGroups;
        }

        @Override
        public final java.util.List<java.lang.String> getUserIds() {
            return this.userIds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getUserGroups() != null) {
                data.set("userGroups", om.valueToTree(this.getUserGroups()));
            }
            if (this.getUserIds() != null) {
                data.set("userIds", om.valueToTree(this.getUserIds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission.Jsii$Proxy that = (ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission.Jsii$Proxy) o;

            if (this.userGroups != null ? !this.userGroups.equals(that.userGroups) : that.userGroups != null) return false;
            return this.userIds != null ? this.userIds.equals(that.userIds) : that.userIds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.userGroups != null ? this.userGroups.hashCode() : 0;
            result = 31 * result + (this.userIds != null ? this.userIds.hashCode() : 0);
            return result;
        }
    }
}
