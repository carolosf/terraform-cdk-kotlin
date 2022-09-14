package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.059Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketInventoryDestinationBucketEncryptionSseS3OutputReference")
public class S3BucketInventoryDestinationBucketEncryptionSseS3OutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketInventoryDestinationBucketEncryptionSseS3OutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketInventoryDestinationBucketEncryptionSseS3OutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketInventoryDestinationBucketEncryptionSseS3OutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseS3 getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseS3.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseS3 value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
