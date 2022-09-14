package imports.aws.imagebuilder;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.782Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.imagebuilder.ImagebuilderImageRecipeBlockDeviceMapping")
@software.amazon.jsii.Jsii.Proxy(ImagebuilderImageRecipeBlockDeviceMapping.Jsii$Proxy.class)
public interface ImagebuilderImageRecipeBlockDeviceMapping extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_image_recipe#device_name ImagebuilderImageRecipe#device_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDeviceName() {
        return null;
    }

    /**
     * ebs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_image_recipe#ebs ImagebuilderImageRecipe#ebs}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderImageRecipeBlockDeviceMappingEbs getEbs() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_image_recipe#no_device ImagebuilderImageRecipe#no_device}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getNoDevice() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_image_recipe#virtual_name ImagebuilderImageRecipe#virtual_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVirtualName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ImagebuilderImageRecipeBlockDeviceMapping}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ImagebuilderImageRecipeBlockDeviceMapping}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ImagebuilderImageRecipeBlockDeviceMapping> {
        java.lang.String deviceName;
        imports.aws.imagebuilder.ImagebuilderImageRecipeBlockDeviceMappingEbs ebs;
        java.lang.Object noDevice;
        java.lang.String virtualName;

        /**
         * Sets the value of {@link ImagebuilderImageRecipeBlockDeviceMapping#getDeviceName}
         * @param deviceName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_image_recipe#device_name ImagebuilderImageRecipe#device_name}.
         * @return {@code this}
         */
        public Builder deviceName(java.lang.String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderImageRecipeBlockDeviceMapping#getEbs}
         * @param ebs ebs block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_image_recipe#ebs ImagebuilderImageRecipe#ebs}
         * @return {@code this}
         */
        public Builder ebs(imports.aws.imagebuilder.ImagebuilderImageRecipeBlockDeviceMappingEbs ebs) {
            this.ebs = ebs;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderImageRecipeBlockDeviceMapping#getNoDevice}
         * @param noDevice Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_image_recipe#no_device ImagebuilderImageRecipe#no_device}.
         * @return {@code this}
         */
        public Builder noDevice(java.lang.Boolean noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderImageRecipeBlockDeviceMapping#getNoDevice}
         * @param noDevice Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_image_recipe#no_device ImagebuilderImageRecipe#no_device}.
         * @return {@code this}
         */
        public Builder noDevice(com.hashicorp.cdktf.IResolvable noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderImageRecipeBlockDeviceMapping#getVirtualName}
         * @param virtualName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_image_recipe#virtual_name ImagebuilderImageRecipe#virtual_name}.
         * @return {@code this}
         */
        public Builder virtualName(java.lang.String virtualName) {
            this.virtualName = virtualName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ImagebuilderImageRecipeBlockDeviceMapping}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ImagebuilderImageRecipeBlockDeviceMapping build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ImagebuilderImageRecipeBlockDeviceMapping}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ImagebuilderImageRecipeBlockDeviceMapping {
        private final java.lang.String deviceName;
        private final imports.aws.imagebuilder.ImagebuilderImageRecipeBlockDeviceMappingEbs ebs;
        private final java.lang.Object noDevice;
        private final java.lang.String virtualName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deviceName = software.amazon.jsii.Kernel.get(this, "deviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ebs = software.amazon.jsii.Kernel.get(this, "ebs", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderImageRecipeBlockDeviceMappingEbs.class));
            this.noDevice = software.amazon.jsii.Kernel.get(this, "noDevice", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.virtualName = software.amazon.jsii.Kernel.get(this, "virtualName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deviceName = builder.deviceName;
            this.ebs = builder.ebs;
            this.noDevice = builder.noDevice;
            this.virtualName = builder.virtualName;
        }

        @Override
        public final java.lang.String getDeviceName() {
            return this.deviceName;
        }

        @Override
        public final imports.aws.imagebuilder.ImagebuilderImageRecipeBlockDeviceMappingEbs getEbs() {
            return this.ebs;
        }

        @Override
        public final java.lang.Object getNoDevice() {
            return this.noDevice;
        }

        @Override
        public final java.lang.String getVirtualName() {
            return this.virtualName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDeviceName() != null) {
                data.set("deviceName", om.valueToTree(this.getDeviceName()));
            }
            if (this.getEbs() != null) {
                data.set("ebs", om.valueToTree(this.getEbs()));
            }
            if (this.getNoDevice() != null) {
                data.set("noDevice", om.valueToTree(this.getNoDevice()));
            }
            if (this.getVirtualName() != null) {
                data.set("virtualName", om.valueToTree(this.getVirtualName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.imagebuilder.ImagebuilderImageRecipeBlockDeviceMapping"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ImagebuilderImageRecipeBlockDeviceMapping.Jsii$Proxy that = (ImagebuilderImageRecipeBlockDeviceMapping.Jsii$Proxy) o;

            if (this.deviceName != null ? !this.deviceName.equals(that.deviceName) : that.deviceName != null) return false;
            if (this.ebs != null ? !this.ebs.equals(that.ebs) : that.ebs != null) return false;
            if (this.noDevice != null ? !this.noDevice.equals(that.noDevice) : that.noDevice != null) return false;
            return this.virtualName != null ? this.virtualName.equals(that.virtualName) : that.virtualName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deviceName != null ? this.deviceName.hashCode() : 0;
            result = 31 * result + (this.ebs != null ? this.ebs.hashCode() : 0);
            result = 31 * result + (this.noDevice != null ? this.noDevice.hashCode() : 0);
            result = 31 * result + (this.virtualName != null ? this.virtualName.hashCode() : 0);
            return result;
        }
    }
}
