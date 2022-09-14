package imports.aws.ec2;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type aws_ec2_instance_type}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.507Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.DataAwsEc2InstanceType")
public class DataAwsEc2InstanceType extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsEc2InstanceType(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsEc2InstanceType(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.ec2.DataAwsEc2InstanceType.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type aws_ec2_instance_type} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsEc2InstanceType(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsEc2InstanceTypeConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putFpgas(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFpgas", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGpus(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putGpus", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putInferenceAccelerators(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putInferenceAccelerators", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putInstanceDisks(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putInstanceDisks", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDefaultCores() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultCores", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultThreadsPerCore() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultThreadsPerCore", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFpgas() {
        software.amazon.jsii.Kernel.call(this, "resetFpgas", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGpus() {
        software.amazon.jsii.Kernel.call(this, "resetGpus", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHypervisor() {
        software.amazon.jsii.Kernel.call(this, "resetHypervisor", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInferenceAccelerators() {
        software.amazon.jsii.Kernel.call(this, "resetInferenceAccelerators", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceDisks() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceDisks", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaximumIpv6AddressesPerInterface() {
        software.amazon.jsii.Kernel.call(this, "resetMaximumIpv6AddressesPerInterface", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTotalFpgaMemory() {
        software.amazon.jsii.Kernel.call(this, "resetTotalFpgaMemory", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTotalGpuMemory() {
        software.amazon.jsii.Kernel.call(this, "resetTotalGpuMemory", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTotalInstanceStorage() {
        software.amazon.jsii.Kernel.call(this, "resetTotalInstanceStorage", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getAutoRecoverySupported() {
        return software.amazon.jsii.Kernel.get(this, "autoRecoverySupported", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getBareMetal() {
        return software.amazon.jsii.Kernel.get(this, "bareMetal", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getBurstablePerformanceSupported() {
        return software.amazon.jsii.Kernel.get(this, "burstablePerformanceSupported", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getCurrentGeneration() {
        return software.amazon.jsii.Kernel.get(this, "currentGeneration", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getDedicatedHostsSupported() {
        return software.amazon.jsii.Kernel.get(this, "dedicatedHostsSupported", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDefaultVcpus() {
        return software.amazon.jsii.Kernel.get(this, "defaultVcpus", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEbsEncryptionSupport() {
        return software.amazon.jsii.Kernel.get(this, "ebsEncryptionSupport", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEbsNvmeSupport() {
        return software.amazon.jsii.Kernel.get(this, "ebsNvmeSupport", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEbsOptimizedSupport() {
        return software.amazon.jsii.Kernel.get(this, "ebsOptimizedSupport", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEbsPerformanceBaselineBandwidth() {
        return software.amazon.jsii.Kernel.get(this, "ebsPerformanceBaselineBandwidth", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEbsPerformanceBaselineIops() {
        return software.amazon.jsii.Kernel.get(this, "ebsPerformanceBaselineIops", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEbsPerformanceBaselineThroughput() {
        return software.amazon.jsii.Kernel.get(this, "ebsPerformanceBaselineThroughput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEbsPerformanceMaximumBandwidth() {
        return software.amazon.jsii.Kernel.get(this, "ebsPerformanceMaximumBandwidth", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEbsPerformanceMaximumIops() {
        return software.amazon.jsii.Kernel.get(this, "ebsPerformanceMaximumIops", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEbsPerformanceMaximumThroughput() {
        return software.amazon.jsii.Kernel.get(this, "ebsPerformanceMaximumThroughput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getEfaSupported() {
        return software.amazon.jsii.Kernel.get(this, "efaSupported", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEnaSupport() {
        return software.amazon.jsii.Kernel.get(this, "enaSupport", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getEncryptionInTransitSupported() {
        return software.amazon.jsii.Kernel.get(this, "encryptionInTransitSupported", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsEc2InstanceTypeFpgasList getFpgas() {
        return software.amazon.jsii.Kernel.get(this, "fpgas", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsEc2InstanceTypeFpgasList.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getFreeTierEligible() {
        return software.amazon.jsii.Kernel.get(this, "freeTierEligible", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsEc2InstanceTypeGpusList getGpus() {
        return software.amazon.jsii.Kernel.get(this, "gpus", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsEc2InstanceTypeGpusList.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getHibernationSupported() {
        return software.amazon.jsii.Kernel.get(this, "hibernationSupported", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsEc2InstanceTypeInferenceAcceleratorsList getInferenceAccelerators() {
        return software.amazon.jsii.Kernel.get(this, "inferenceAccelerators", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsEc2InstanceTypeInferenceAcceleratorsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsEc2InstanceTypeInstanceDisksList getInstanceDisks() {
        return software.amazon.jsii.Kernel.get(this, "instanceDisks", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsEc2InstanceTypeInstanceDisksList.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getInstanceStorageSupported() {
        return software.amazon.jsii.Kernel.get(this, "instanceStorageSupported", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getIpv6Supported() {
        return software.amazon.jsii.Kernel.get(this, "ipv6Supported", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaximumIpv4AddressesPerInterface() {
        return software.amazon.jsii.Kernel.get(this, "maximumIpv4AddressesPerInterface", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaximumNetworkInterfaces() {
        return software.amazon.jsii.Kernel.get(this, "maximumNetworkInterfaces", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMemorySize() {
        return software.amazon.jsii.Kernel.get(this, "memorySize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNetworkPerformance() {
        return software.amazon.jsii.Kernel.get(this, "networkPerformance", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSupportedArchitectures() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "supportedArchitectures", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSupportedPlacementStrategies() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "supportedPlacementStrategies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSupportedRootDeviceTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "supportedRootDeviceTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSupportedUsagesClasses() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "supportedUsagesClasses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSupportedVirtualizationTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "supportedVirtualizationTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSustainedClockSpeed() {
        return software.amazon.jsii.Kernel.get(this, "sustainedClockSpeed", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> getValidCores() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "validCores", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> getValidThreadsPerCore() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "validThreadsPerCore", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDefaultCoresInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultCoresInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDefaultThreadsPerCoreInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultThreadsPerCoreInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFpgasInput() {
        return software.amazon.jsii.Kernel.get(this, "fpgasInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getGpusInput() {
        return software.amazon.jsii.Kernel.get(this, "gpusInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHypervisorInput() {
        return software.amazon.jsii.Kernel.get(this, "hypervisorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInferenceAcceleratorsInput() {
        return software.amazon.jsii.Kernel.get(this, "inferenceAcceleratorsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInstanceDisksInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceDisksInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumIpv6AddressesPerInterfaceInput() {
        return software.amazon.jsii.Kernel.get(this, "maximumIpv6AddressesPerInterfaceInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTotalFpgaMemoryInput() {
        return software.amazon.jsii.Kernel.get(this, "totalFpgaMemoryInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTotalGpuMemoryInput() {
        return software.amazon.jsii.Kernel.get(this, "totalGpuMemoryInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTotalInstanceStorageInput() {
        return software.amazon.jsii.Kernel.get(this, "totalInstanceStorageInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDefaultCores() {
        return software.amazon.jsii.Kernel.get(this, "defaultCores", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDefaultCores(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "defaultCores", java.util.Objects.requireNonNull(value, "defaultCores is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDefaultThreadsPerCore() {
        return software.amazon.jsii.Kernel.get(this, "defaultThreadsPerCore", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDefaultThreadsPerCore(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "defaultThreadsPerCore", java.util.Objects.requireNonNull(value, "defaultThreadsPerCore is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHypervisor() {
        return software.amazon.jsii.Kernel.get(this, "hypervisor", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHypervisor(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hypervisor", java.util.Objects.requireNonNull(value, "hypervisor is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceType", java.util.Objects.requireNonNull(value, "instanceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaximumIpv6AddressesPerInterface() {
        return software.amazon.jsii.Kernel.get(this, "maximumIpv6AddressesPerInterface", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumIpv6AddressesPerInterface(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumIpv6AddressesPerInterface", java.util.Objects.requireNonNull(value, "maximumIpv6AddressesPerInterface is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTotalFpgaMemory() {
        return software.amazon.jsii.Kernel.get(this, "totalFpgaMemory", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTotalFpgaMemory(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "totalFpgaMemory", java.util.Objects.requireNonNull(value, "totalFpgaMemory is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTotalGpuMemory() {
        return software.amazon.jsii.Kernel.get(this, "totalGpuMemory", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTotalGpuMemory(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "totalGpuMemory", java.util.Objects.requireNonNull(value, "totalGpuMemory is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTotalInstanceStorage() {
        return software.amazon.jsii.Kernel.get(this, "totalInstanceStorage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTotalInstanceStorage(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "totalInstanceStorage", java.util.Objects.requireNonNull(value, "totalInstanceStorage is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ec2.DataAwsEc2InstanceType}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ec2.DataAwsEc2InstanceType> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.ec2.DataAwsEc2InstanceTypeConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ec2.DataAwsEc2InstanceTypeConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#instance_type DataAwsEc2InstanceType#instance_type}.
         * <p>
         * @return {@code this}
         * @param instanceType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#instance_type DataAwsEc2InstanceType#instance_type}. This parameter is required.
         */
        public Builder instanceType(final java.lang.String instanceType) {
            this.config.instanceType(instanceType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#default_cores DataAwsEc2InstanceType#default_cores}.
         * <p>
         * @return {@code this}
         * @param defaultCores Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#default_cores DataAwsEc2InstanceType#default_cores}. This parameter is required.
         */
        public Builder defaultCores(final java.lang.Number defaultCores) {
            this.config.defaultCores(defaultCores);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#default_threads_per_core DataAwsEc2InstanceType#default_threads_per_core}.
         * <p>
         * @return {@code this}
         * @param defaultThreadsPerCore Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#default_threads_per_core DataAwsEc2InstanceType#default_threads_per_core}. This parameter is required.
         */
        public Builder defaultThreadsPerCore(final java.lang.Number defaultThreadsPerCore) {
            this.config.defaultThreadsPerCore(defaultThreadsPerCore);
            return this;
        }

        /**
         * fpgas block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#fpgas DataAwsEc2InstanceType#fpgas}
         * <p>
         * @return {@code this}
         * @param fpgas fpgas block. This parameter is required.
         */
        public Builder fpgas(final com.hashicorp.cdktf.IResolvable fpgas) {
            this.config.fpgas(fpgas);
            return this;
        }
        /**
         * fpgas block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#fpgas DataAwsEc2InstanceType#fpgas}
         * <p>
         * @return {@code this}
         * @param fpgas fpgas block. This parameter is required.
         */
        public Builder fpgas(final java.util.List<? extends imports.aws.ec2.DataAwsEc2InstanceTypeFpgas> fpgas) {
            this.config.fpgas(fpgas);
            return this;
        }

        /**
         * gpus block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#gpus DataAwsEc2InstanceType#gpus}
         * <p>
         * @return {@code this}
         * @param gpus gpus block. This parameter is required.
         */
        public Builder gpus(final com.hashicorp.cdktf.IResolvable gpus) {
            this.config.gpus(gpus);
            return this;
        }
        /**
         * gpus block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#gpus DataAwsEc2InstanceType#gpus}
         * <p>
         * @return {@code this}
         * @param gpus gpus block. This parameter is required.
         */
        public Builder gpus(final java.util.List<? extends imports.aws.ec2.DataAwsEc2InstanceTypeGpus> gpus) {
            this.config.gpus(gpus);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#hypervisor DataAwsEc2InstanceType#hypervisor}.
         * <p>
         * @return {@code this}
         * @param hypervisor Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#hypervisor DataAwsEc2InstanceType#hypervisor}. This parameter is required.
         */
        public Builder hypervisor(final java.lang.String hypervisor) {
            this.config.hypervisor(hypervisor);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#id DataAwsEc2InstanceType#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#id DataAwsEc2InstanceType#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * inference_accelerators block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#inference_accelerators DataAwsEc2InstanceType#inference_accelerators}
         * <p>
         * @return {@code this}
         * @param inferenceAccelerators inference_accelerators block. This parameter is required.
         */
        public Builder inferenceAccelerators(final com.hashicorp.cdktf.IResolvable inferenceAccelerators) {
            this.config.inferenceAccelerators(inferenceAccelerators);
            return this;
        }
        /**
         * inference_accelerators block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#inference_accelerators DataAwsEc2InstanceType#inference_accelerators}
         * <p>
         * @return {@code this}
         * @param inferenceAccelerators inference_accelerators block. This parameter is required.
         */
        public Builder inferenceAccelerators(final java.util.List<? extends imports.aws.ec2.DataAwsEc2InstanceTypeInferenceAccelerators> inferenceAccelerators) {
            this.config.inferenceAccelerators(inferenceAccelerators);
            return this;
        }

        /**
         * instance_disks block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#instance_disks DataAwsEc2InstanceType#instance_disks}
         * <p>
         * @return {@code this}
         * @param instanceDisks instance_disks block. This parameter is required.
         */
        public Builder instanceDisks(final com.hashicorp.cdktf.IResolvable instanceDisks) {
            this.config.instanceDisks(instanceDisks);
            return this;
        }
        /**
         * instance_disks block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#instance_disks DataAwsEc2InstanceType#instance_disks}
         * <p>
         * @return {@code this}
         * @param instanceDisks instance_disks block. This parameter is required.
         */
        public Builder instanceDisks(final java.util.List<? extends imports.aws.ec2.DataAwsEc2InstanceTypeInstanceDisks> instanceDisks) {
            this.config.instanceDisks(instanceDisks);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#maximum_ipv6_addresses_per_interface DataAwsEc2InstanceType#maximum_ipv6_addresses_per_interface}.
         * <p>
         * @return {@code this}
         * @param maximumIpv6AddressesPerInterface Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#maximum_ipv6_addresses_per_interface DataAwsEc2InstanceType#maximum_ipv6_addresses_per_interface}. This parameter is required.
         */
        public Builder maximumIpv6AddressesPerInterface(final java.lang.Number maximumIpv6AddressesPerInterface) {
            this.config.maximumIpv6AddressesPerInterface(maximumIpv6AddressesPerInterface);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#total_fpga_memory DataAwsEc2InstanceType#total_fpga_memory}.
         * <p>
         * @return {@code this}
         * @param totalFpgaMemory Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#total_fpga_memory DataAwsEc2InstanceType#total_fpga_memory}. This parameter is required.
         */
        public Builder totalFpgaMemory(final java.lang.Number totalFpgaMemory) {
            this.config.totalFpgaMemory(totalFpgaMemory);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#total_gpu_memory DataAwsEc2InstanceType#total_gpu_memory}.
         * <p>
         * @return {@code this}
         * @param totalGpuMemory Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#total_gpu_memory DataAwsEc2InstanceType#total_gpu_memory}. This parameter is required.
         */
        public Builder totalGpuMemory(final java.lang.Number totalGpuMemory) {
            this.config.totalGpuMemory(totalGpuMemory);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#total_instance_storage DataAwsEc2InstanceType#total_instance_storage}.
         * <p>
         * @return {@code this}
         * @param totalInstanceStorage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#total_instance_storage DataAwsEc2InstanceType#total_instance_storage}. This parameter is required.
         */
        public Builder totalInstanceStorage(final java.lang.Number totalInstanceStorage) {
            this.config.totalInstanceStorage(totalInstanceStorage);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ec2.DataAwsEc2InstanceType}.
         */
        @Override
        public imports.aws.ec2.DataAwsEc2InstanceType build() {
            return new imports.aws.ec2.DataAwsEc2InstanceType(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
