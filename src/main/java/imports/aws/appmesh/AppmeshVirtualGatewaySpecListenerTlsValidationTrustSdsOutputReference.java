package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.166Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsValidationTrustSdsOutputReference")
public class AppmeshVirtualGatewaySpecListenerTlsValidationTrustSdsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualGatewaySpecListenerTlsValidationTrustSdsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualGatewaySpecListenerTlsValidationTrustSdsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualGatewaySpecListenerTlsValidationTrustSdsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretNameInput() {
        return software.amazon.jsii.Kernel.get(this, "secretNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretName() {
        return software.amazon.jsii.Kernel.get(this, "secretName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretName", java.util.Objects.requireNonNull(value, "secretName is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsValidationTrustSds getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsValidationTrustSds.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsValidationTrustSds value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
