package imports.aws.appsync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.204Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncFunctionSyncConfigOutputReference")
public class AppsyncFunctionSyncConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppsyncFunctionSyncConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncFunctionSyncConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppsyncFunctionSyncConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putLambdaConflictHandlerConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncFunctionSyncConfigLambdaConflictHandlerConfig value) {
        software.amazon.jsii.Kernel.call(this, "putLambdaConflictHandlerConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetConflictDetection() {
        software.amazon.jsii.Kernel.call(this, "resetConflictDetection", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConflictHandler() {
        software.amazon.jsii.Kernel.call(this, "resetConflictHandler", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambdaConflictHandlerConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaConflictHandlerConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncFunctionSyncConfigLambdaConflictHandlerConfigOutputReference getLambdaConflictHandlerConfig() {
        return software.amazon.jsii.Kernel.get(this, "lambdaConflictHandlerConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncFunctionSyncConfigLambdaConflictHandlerConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConflictDetectionInput() {
        return software.amazon.jsii.Kernel.get(this, "conflictDetectionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConflictHandlerInput() {
        return software.amazon.jsii.Kernel.get(this, "conflictHandlerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncFunctionSyncConfigLambdaConflictHandlerConfig getLambdaConflictHandlerConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaConflictHandlerConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncFunctionSyncConfigLambdaConflictHandlerConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConflictDetection() {
        return software.amazon.jsii.Kernel.get(this, "conflictDetection", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConflictDetection(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "conflictDetection", java.util.Objects.requireNonNull(value, "conflictDetection is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConflictHandler() {
        return software.amazon.jsii.Kernel.get(this, "conflictHandler", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConflictHandler(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "conflictHandler", java.util.Objects.requireNonNull(value, "conflictHandler is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncFunctionSyncConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncFunctionSyncConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncFunctionSyncConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
