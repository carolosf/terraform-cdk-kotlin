package imports.aws.config;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.364Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.config.ConfigDeliveryChannelSnapshotDeliveryPropertiesOutputReference")
public class ConfigDeliveryChannelSnapshotDeliveryPropertiesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ConfigDeliveryChannelSnapshotDeliveryPropertiesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ConfigDeliveryChannelSnapshotDeliveryPropertiesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ConfigDeliveryChannelSnapshotDeliveryPropertiesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDeliveryFrequency() {
        software.amazon.jsii.Kernel.call(this, "resetDeliveryFrequency", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeliveryFrequencyInput() {
        return software.amazon.jsii.Kernel.get(this, "deliveryFrequencyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeliveryFrequency() {
        return software.amazon.jsii.Kernel.get(this, "deliveryFrequency", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeliveryFrequency(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deliveryFrequency", java.util.Objects.requireNonNull(value, "deliveryFrequency is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.config.ConfigDeliveryChannelSnapshotDeliveryProperties getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.config.ConfigDeliveryChannelSnapshotDeliveryProperties.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.config.ConfigDeliveryChannelSnapshotDeliveryProperties value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
