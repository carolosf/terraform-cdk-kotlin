package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.148Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualServiceOutputReference")
public class AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualServiceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualServiceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualServiceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualServiceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVirtualServiceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "virtualServiceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVirtualServiceName() {
        return software.amazon.jsii.Kernel.get(this, "virtualServiceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVirtualServiceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "virtualServiceName", java.util.Objects.requireNonNull(value, "virtualServiceName is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualService getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualService.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualService value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
