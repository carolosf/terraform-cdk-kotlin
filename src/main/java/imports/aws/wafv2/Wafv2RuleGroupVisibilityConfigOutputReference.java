package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.341Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2RuleGroupVisibilityConfigOutputReference")
public class Wafv2RuleGroupVisibilityConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Wafv2RuleGroupVisibilityConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Wafv2RuleGroupVisibilityConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Wafv2RuleGroupVisibilityConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCloudwatchMetricsEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchMetricsEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMetricNameInput() {
        return software.amazon.jsii.Kernel.get(this, "metricNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSampledRequestsEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "sampledRequestsEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCloudwatchMetricsEnabled() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchMetricsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCloudwatchMetricsEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchMetricsEnabled", java.util.Objects.requireNonNull(value, "cloudwatchMetricsEnabled is required"));
    }

    public void setCloudwatchMetricsEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchMetricsEnabled", java.util.Objects.requireNonNull(value, "cloudwatchMetricsEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMetricName() {
        return software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMetricName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "metricName", java.util.Objects.requireNonNull(value, "metricName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSampledRequestsEnabled() {
        return software.amazon.jsii.Kernel.get(this, "sampledRequestsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSampledRequestsEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "sampledRequestsEnabled", java.util.Objects.requireNonNull(value, "sampledRequestsEnabled is required"));
    }

    public void setSampledRequestsEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "sampledRequestsEnabled", java.util.Objects.requireNonNull(value, "sampledRequestsEnabled is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupVisibilityConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2RuleGroupVisibilityConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2RuleGroupVisibilityConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
