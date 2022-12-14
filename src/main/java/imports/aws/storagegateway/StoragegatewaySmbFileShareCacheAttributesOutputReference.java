package imports.aws.storagegateway;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.216Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.storagegateway.StoragegatewaySmbFileShareCacheAttributesOutputReference")
public class StoragegatewaySmbFileShareCacheAttributesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StoragegatewaySmbFileShareCacheAttributesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StoragegatewaySmbFileShareCacheAttributesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public StoragegatewaySmbFileShareCacheAttributesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetCacheStaleTimeoutInSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetCacheStaleTimeoutInSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCacheStaleTimeoutInSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "cacheStaleTimeoutInSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getCacheStaleTimeoutInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "cacheStaleTimeoutInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCacheStaleTimeoutInSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "cacheStaleTimeoutInSeconds", java.util.Objects.requireNonNull(value, "cacheStaleTimeoutInSeconds is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.storagegateway.StoragegatewaySmbFileShareCacheAttributes getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.storagegateway.StoragegatewaySmbFileShareCacheAttributes.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.storagegateway.StoragegatewaySmbFileShareCacheAttributes value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
