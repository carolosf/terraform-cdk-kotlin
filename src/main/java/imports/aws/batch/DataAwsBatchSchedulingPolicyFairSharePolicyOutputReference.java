package imports.aws.batch;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.245Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.batch.DataAwsBatchSchedulingPolicyFairSharePolicyOutputReference")
public class DataAwsBatchSchedulingPolicyFairSharePolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsBatchSchedulingPolicyFairSharePolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsBatchSchedulingPolicyFairSharePolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsBatchSchedulingPolicyFairSharePolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getComputeReservation() {
        return software.amazon.jsii.Kernel.get(this, "computeReservation", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getShareDecaySeconds() {
        return software.amazon.jsii.Kernel.get(this, "shareDecaySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.batch.DataAwsBatchSchedulingPolicyFairSharePolicyShareDistributionList getShareDistribution() {
        return software.amazon.jsii.Kernel.get(this, "shareDistribution", software.amazon.jsii.NativeType.forClass(imports.aws.batch.DataAwsBatchSchedulingPolicyFairSharePolicyShareDistributionList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.batch.DataAwsBatchSchedulingPolicyFairSharePolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.batch.DataAwsBatchSchedulingPolicyFairSharePolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.batch.DataAwsBatchSchedulingPolicyFairSharePolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}