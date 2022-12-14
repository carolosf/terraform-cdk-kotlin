package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.073Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketReplicationConfigurationRulesDestinationReplicationTimeOutputReference")
public class S3BucketReplicationConfigurationRulesDestinationReplicationTimeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketReplicationConfigurationRulesDestinationReplicationTimeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketReplicationConfigurationRulesDestinationReplicationTimeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketReplicationConfigurationRulesDestinationReplicationTimeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetMinutes() {
        software.amazon.jsii.Kernel.call(this, "resetMinutes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatus() {
        software.amazon.jsii.Kernel.call(this, "resetStatus", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinutesInput() {
        return software.amazon.jsii.Kernel.get(this, "minutesInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "statusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinutes() {
        return software.amazon.jsii.Kernel.get(this, "minutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinutes(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minutes", java.util.Objects.requireNonNull(value, "minutes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "status", java.util.Objects.requireNonNull(value, "status is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRulesDestinationReplicationTime getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRulesDestinationReplicationTime.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRulesDestinationReplicationTime value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
