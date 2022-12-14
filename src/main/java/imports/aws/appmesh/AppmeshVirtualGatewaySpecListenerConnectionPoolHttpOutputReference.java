package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.165Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttpOutputReference")
public class AppmeshVirtualGatewaySpecListenerConnectionPoolHttpOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualGatewaySpecListenerConnectionPoolHttpOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualGatewaySpecListenerConnectionPoolHttpOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualGatewaySpecListenerConnectionPoolHttpOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetMaxPendingRequests() {
        software.amazon.jsii.Kernel.call(this, "resetMaxPendingRequests", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxConnectionsInput() {
        return software.amazon.jsii.Kernel.get(this, "maxConnectionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxPendingRequestsInput() {
        return software.amazon.jsii.Kernel.get(this, "maxPendingRequestsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxConnections() {
        return software.amazon.jsii.Kernel.get(this, "maxConnections", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxConnections(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxConnections", java.util.Objects.requireNonNull(value, "maxConnections is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxPendingRequests() {
        return software.amazon.jsii.Kernel.get(this, "maxPendingRequests", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxPendingRequests(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxPendingRequests", java.util.Objects.requireNonNull(value, "maxPendingRequests is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttp getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttp.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttp value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
