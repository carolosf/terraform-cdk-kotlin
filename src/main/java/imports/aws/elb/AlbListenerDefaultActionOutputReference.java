package imports.aws.elb;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.645Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elb.AlbListenerDefaultActionOutputReference")
public class AlbListenerDefaultActionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AlbListenerDefaultActionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AlbListenerDefaultActionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public AlbListenerDefaultActionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putAuthenticateCognito(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionAuthenticateCognito value) {
        software.amazon.jsii.Kernel.call(this, "putAuthenticateCognito", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAuthenticateOidc(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionAuthenticateOidc value) {
        software.amazon.jsii.Kernel.call(this, "putAuthenticateOidc", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFixedResponse(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionFixedResponse value) {
        software.amazon.jsii.Kernel.call(this, "putFixedResponse", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putForward(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionForward value) {
        software.amazon.jsii.Kernel.call(this, "putForward", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRedirect(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionRedirect value) {
        software.amazon.jsii.Kernel.call(this, "putRedirect", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAuthenticateCognito() {
        software.amazon.jsii.Kernel.call(this, "resetAuthenticateCognito", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthenticateOidc() {
        software.amazon.jsii.Kernel.call(this, "resetAuthenticateOidc", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFixedResponse() {
        software.amazon.jsii.Kernel.call(this, "resetFixedResponse", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForward() {
        software.amazon.jsii.Kernel.call(this, "resetForward", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOrder() {
        software.amazon.jsii.Kernel.call(this, "resetOrder", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRedirect() {
        software.amazon.jsii.Kernel.call(this, "resetRedirect", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetGroupArn() {
        software.amazon.jsii.Kernel.call(this, "resetTargetGroupArn", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionAuthenticateCognitoOutputReference getAuthenticateCognito() {
        return software.amazon.jsii.Kernel.get(this, "authenticateCognito", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionAuthenticateCognitoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionAuthenticateOidcOutputReference getAuthenticateOidc() {
        return software.amazon.jsii.Kernel.get(this, "authenticateOidc", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionAuthenticateOidcOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionFixedResponseOutputReference getFixedResponse() {
        return software.amazon.jsii.Kernel.get(this, "fixedResponse", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionFixedResponseOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionForwardOutputReference getForward() {
        return software.amazon.jsii.Kernel.get(this, "forward", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionForwardOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionRedirectOutputReference getRedirect() {
        return software.amazon.jsii.Kernel.get(this, "redirect", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionRedirectOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerDefaultActionAuthenticateCognito getAuthenticateCognitoInput() {
        return software.amazon.jsii.Kernel.get(this, "authenticateCognitoInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionAuthenticateCognito.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerDefaultActionAuthenticateOidc getAuthenticateOidcInput() {
        return software.amazon.jsii.Kernel.get(this, "authenticateOidcInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionAuthenticateOidc.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerDefaultActionFixedResponse getFixedResponseInput() {
        return software.amazon.jsii.Kernel.get(this, "fixedResponseInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionFixedResponse.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerDefaultActionForward getForwardInput() {
        return software.amazon.jsii.Kernel.get(this, "forwardInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionForward.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getOrderInput() {
        return software.amazon.jsii.Kernel.get(this, "orderInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerDefaultActionRedirect getRedirectInput() {
        return software.amazon.jsii.Kernel.get(this, "redirectInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionRedirect.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetGroupArnInput() {
        return software.amazon.jsii.Kernel.get(this, "targetGroupArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getOrder() {
        return software.amazon.jsii.Kernel.get(this, "order", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setOrder(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "order", java.util.Objects.requireNonNull(value, "order is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetGroupArn() {
        return software.amazon.jsii.Kernel.get(this, "targetGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetGroupArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetGroupArn", java.util.Objects.requireNonNull(value, "targetGroupArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerDefaultAction value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
