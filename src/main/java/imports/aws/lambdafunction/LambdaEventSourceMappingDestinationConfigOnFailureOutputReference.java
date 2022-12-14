package imports.aws.lambdafunction;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.849Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailureOutputReference")
public class LambdaEventSourceMappingDestinationConfigOnFailureOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LambdaEventSourceMappingDestinationConfigOnFailureOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LambdaEventSourceMappingDestinationConfigOnFailureOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LambdaEventSourceMappingDestinationConfigOnFailureOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDestinationArnInput() {
        return software.amazon.jsii.Kernel.get(this, "destinationArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDestinationArn() {
        return software.amazon.jsii.Kernel.get(this, "destinationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDestinationArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "destinationArn", java.util.Objects.requireNonNull(value, "destinationArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailure getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailure.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailure value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
