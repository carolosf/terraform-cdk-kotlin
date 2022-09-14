package imports.aws.quicksight;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.981Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.quicksight.QuicksightDataSourceVpcConnectionPropertiesOutputReference")
public class QuicksightDataSourceVpcConnectionPropertiesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected QuicksightDataSourceVpcConnectionPropertiesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected QuicksightDataSourceVpcConnectionPropertiesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public QuicksightDataSourceVpcConnectionPropertiesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcConnectionArnInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcConnectionArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcConnectionArn() {
        return software.amazon.jsii.Kernel.get(this, "vpcConnectionArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcConnectionArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcConnectionArn", java.util.Objects.requireNonNull(value, "vpcConnectionArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceVpcConnectionProperties getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceVpcConnectionProperties.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceVpcConnectionProperties value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}