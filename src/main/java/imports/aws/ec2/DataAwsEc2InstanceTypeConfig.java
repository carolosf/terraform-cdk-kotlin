package imports.aws.ec2;

/**
 * AWS EC2.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.508Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.DataAwsEc2InstanceTypeConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsEc2InstanceTypeConfig.Jsii$Proxy.class)
public interface DataAwsEc2InstanceTypeConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#instance_type DataAwsEc2InstanceType#instance_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getInstanceType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#default_cores DataAwsEc2InstanceType#default_cores}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDefaultCores() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#default_threads_per_core DataAwsEc2InstanceType#default_threads_per_core}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDefaultThreadsPerCore() {
        return null;
    }

    /**
     * fpgas block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#fpgas DataAwsEc2InstanceType#fpgas}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getFpgas() {
        return null;
    }

    /**
     * gpus block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#gpus DataAwsEc2InstanceType#gpus}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getGpus() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#hypervisor DataAwsEc2InstanceType#hypervisor}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHypervisor() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#id DataAwsEc2InstanceType#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * inference_accelerators block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#inference_accelerators DataAwsEc2InstanceType#inference_accelerators}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getInferenceAccelerators() {
        return null;
    }

    /**
     * instance_disks block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#instance_disks DataAwsEc2InstanceType#instance_disks}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getInstanceDisks() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#maximum_ipv6_addresses_per_interface DataAwsEc2InstanceType#maximum_ipv6_addresses_per_interface}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximumIpv6AddressesPerInterface() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#total_fpga_memory DataAwsEc2InstanceType#total_fpga_memory}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTotalFpgaMemory() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#total_gpu_memory DataAwsEc2InstanceType#total_gpu_memory}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTotalGpuMemory() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#total_instance_storage DataAwsEc2InstanceType#total_instance_storage}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTotalInstanceStorage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsEc2InstanceTypeConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsEc2InstanceTypeConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsEc2InstanceTypeConfig> {
        java.lang.String instanceType;
        java.lang.Number defaultCores;
        java.lang.Number defaultThreadsPerCore;
        java.lang.Object fpgas;
        java.lang.Object gpus;
        java.lang.String hypervisor;
        java.lang.String id;
        java.lang.Object inferenceAccelerators;
        java.lang.Object instanceDisks;
        java.lang.Number maximumIpv6AddressesPerInterface;
        java.lang.Number totalFpgaMemory;
        java.lang.Number totalGpuMemory;
        java.lang.Number totalInstanceStorage;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getInstanceType}
         * @param instanceType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#instance_type DataAwsEc2InstanceType#instance_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getDefaultCores}
         * @param defaultCores Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#default_cores DataAwsEc2InstanceType#default_cores}.
         * @return {@code this}
         */
        public Builder defaultCores(java.lang.Number defaultCores) {
            this.defaultCores = defaultCores;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getDefaultThreadsPerCore}
         * @param defaultThreadsPerCore Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#default_threads_per_core DataAwsEc2InstanceType#default_threads_per_core}.
         * @return {@code this}
         */
        public Builder defaultThreadsPerCore(java.lang.Number defaultThreadsPerCore) {
            this.defaultThreadsPerCore = defaultThreadsPerCore;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getFpgas}
         * @param fpgas fpgas block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#fpgas DataAwsEc2InstanceType#fpgas}
         * @return {@code this}
         */
        public Builder fpgas(com.hashicorp.cdktf.IResolvable fpgas) {
            this.fpgas = fpgas;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getFpgas}
         * @param fpgas fpgas block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#fpgas DataAwsEc2InstanceType#fpgas}
         * @return {@code this}
         */
        public Builder fpgas(java.util.List<? extends imports.aws.ec2.DataAwsEc2InstanceTypeFpgas> fpgas) {
            this.fpgas = fpgas;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getGpus}
         * @param gpus gpus block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#gpus DataAwsEc2InstanceType#gpus}
         * @return {@code this}
         */
        public Builder gpus(com.hashicorp.cdktf.IResolvable gpus) {
            this.gpus = gpus;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getGpus}
         * @param gpus gpus block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#gpus DataAwsEc2InstanceType#gpus}
         * @return {@code this}
         */
        public Builder gpus(java.util.List<? extends imports.aws.ec2.DataAwsEc2InstanceTypeGpus> gpus) {
            this.gpus = gpus;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getHypervisor}
         * @param hypervisor Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#hypervisor DataAwsEc2InstanceType#hypervisor}.
         * @return {@code this}
         */
        public Builder hypervisor(java.lang.String hypervisor) {
            this.hypervisor = hypervisor;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#id DataAwsEc2InstanceType#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getInferenceAccelerators}
         * @param inferenceAccelerators inference_accelerators block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#inference_accelerators DataAwsEc2InstanceType#inference_accelerators}
         * @return {@code this}
         */
        public Builder inferenceAccelerators(com.hashicorp.cdktf.IResolvable inferenceAccelerators) {
            this.inferenceAccelerators = inferenceAccelerators;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getInferenceAccelerators}
         * @param inferenceAccelerators inference_accelerators block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#inference_accelerators DataAwsEc2InstanceType#inference_accelerators}
         * @return {@code this}
         */
        public Builder inferenceAccelerators(java.util.List<? extends imports.aws.ec2.DataAwsEc2InstanceTypeInferenceAccelerators> inferenceAccelerators) {
            this.inferenceAccelerators = inferenceAccelerators;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getInstanceDisks}
         * @param instanceDisks instance_disks block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#instance_disks DataAwsEc2InstanceType#instance_disks}
         * @return {@code this}
         */
        public Builder instanceDisks(com.hashicorp.cdktf.IResolvable instanceDisks) {
            this.instanceDisks = instanceDisks;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getInstanceDisks}
         * @param instanceDisks instance_disks block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#instance_disks DataAwsEc2InstanceType#instance_disks}
         * @return {@code this}
         */
        public Builder instanceDisks(java.util.List<? extends imports.aws.ec2.DataAwsEc2InstanceTypeInstanceDisks> instanceDisks) {
            this.instanceDisks = instanceDisks;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getMaximumIpv6AddressesPerInterface}
         * @param maximumIpv6AddressesPerInterface Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#maximum_ipv6_addresses_per_interface DataAwsEc2InstanceType#maximum_ipv6_addresses_per_interface}.
         * @return {@code this}
         */
        public Builder maximumIpv6AddressesPerInterface(java.lang.Number maximumIpv6AddressesPerInterface) {
            this.maximumIpv6AddressesPerInterface = maximumIpv6AddressesPerInterface;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getTotalFpgaMemory}
         * @param totalFpgaMemory Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#total_fpga_memory DataAwsEc2InstanceType#total_fpga_memory}.
         * @return {@code this}
         */
        public Builder totalFpgaMemory(java.lang.Number totalFpgaMemory) {
            this.totalFpgaMemory = totalFpgaMemory;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getTotalGpuMemory}
         * @param totalGpuMemory Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#total_gpu_memory DataAwsEc2InstanceType#total_gpu_memory}.
         * @return {@code this}
         */
        public Builder totalGpuMemory(java.lang.Number totalGpuMemory) {
            this.totalGpuMemory = totalGpuMemory;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getTotalInstanceStorage}
         * @param totalInstanceStorage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type#total_instance_storage DataAwsEc2InstanceType#total_instance_storage}.
         * @return {@code this}
         */
        public Builder totalInstanceStorage(java.lang.Number totalInstanceStorage) {
            this.totalInstanceStorage = totalInstanceStorage;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsEc2InstanceTypeConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsEc2InstanceTypeConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsEc2InstanceTypeConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsEc2InstanceTypeConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsEc2InstanceTypeConfig {
        private final java.lang.String instanceType;
        private final java.lang.Number defaultCores;
        private final java.lang.Number defaultThreadsPerCore;
        private final java.lang.Object fpgas;
        private final java.lang.Object gpus;
        private final java.lang.String hypervisor;
        private final java.lang.String id;
        private final java.lang.Object inferenceAccelerators;
        private final java.lang.Object instanceDisks;
        private final java.lang.Number maximumIpv6AddressesPerInterface;
        private final java.lang.Number totalFpgaMemory;
        private final java.lang.Number totalGpuMemory;
        private final java.lang.Number totalInstanceStorage;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultCores = software.amazon.jsii.Kernel.get(this, "defaultCores", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.defaultThreadsPerCore = software.amazon.jsii.Kernel.get(this, "defaultThreadsPerCore", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.fpgas = software.amazon.jsii.Kernel.get(this, "fpgas", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.gpus = software.amazon.jsii.Kernel.get(this, "gpus", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.hypervisor = software.amazon.jsii.Kernel.get(this, "hypervisor", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.inferenceAccelerators = software.amazon.jsii.Kernel.get(this, "inferenceAccelerators", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.instanceDisks = software.amazon.jsii.Kernel.get(this, "instanceDisks", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.maximumIpv6AddressesPerInterface = software.amazon.jsii.Kernel.get(this, "maximumIpv6AddressesPerInterface", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.totalFpgaMemory = software.amazon.jsii.Kernel.get(this, "totalFpgaMemory", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.totalGpuMemory = software.amazon.jsii.Kernel.get(this, "totalGpuMemory", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.totalInstanceStorage = software.amazon.jsii.Kernel.get(this, "totalInstanceStorage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.instanceType = java.util.Objects.requireNonNull(builder.instanceType, "instanceType is required");
            this.defaultCores = builder.defaultCores;
            this.defaultThreadsPerCore = builder.defaultThreadsPerCore;
            this.fpgas = builder.fpgas;
            this.gpus = builder.gpus;
            this.hypervisor = builder.hypervisor;
            this.id = builder.id;
            this.inferenceAccelerators = builder.inferenceAccelerators;
            this.instanceDisks = builder.instanceDisks;
            this.maximumIpv6AddressesPerInterface = builder.maximumIpv6AddressesPerInterface;
            this.totalFpgaMemory = builder.totalFpgaMemory;
            this.totalGpuMemory = builder.totalGpuMemory;
            this.totalInstanceStorage = builder.totalInstanceStorage;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.lang.Number getDefaultCores() {
            return this.defaultCores;
        }

        @Override
        public final java.lang.Number getDefaultThreadsPerCore() {
            return this.defaultThreadsPerCore;
        }

        @Override
        public final java.lang.Object getFpgas() {
            return this.fpgas;
        }

        @Override
        public final java.lang.Object getGpus() {
            return this.gpus;
        }

        @Override
        public final java.lang.String getHypervisor() {
            return this.hypervisor;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getInferenceAccelerators() {
            return this.inferenceAccelerators;
        }

        @Override
        public final java.lang.Object getInstanceDisks() {
            return this.instanceDisks;
        }

        @Override
        public final java.lang.Number getMaximumIpv6AddressesPerInterface() {
            return this.maximumIpv6AddressesPerInterface;
        }

        @Override
        public final java.lang.Number getTotalFpgaMemory() {
            return this.totalFpgaMemory;
        }

        @Override
        public final java.lang.Number getTotalGpuMemory() {
            return this.totalGpuMemory;
        }

        @Override
        public final java.lang.Number getTotalInstanceStorage() {
            return this.totalInstanceStorage;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("instanceType", om.valueToTree(this.getInstanceType()));
            if (this.getDefaultCores() != null) {
                data.set("defaultCores", om.valueToTree(this.getDefaultCores()));
            }
            if (this.getDefaultThreadsPerCore() != null) {
                data.set("defaultThreadsPerCore", om.valueToTree(this.getDefaultThreadsPerCore()));
            }
            if (this.getFpgas() != null) {
                data.set("fpgas", om.valueToTree(this.getFpgas()));
            }
            if (this.getGpus() != null) {
                data.set("gpus", om.valueToTree(this.getGpus()));
            }
            if (this.getHypervisor() != null) {
                data.set("hypervisor", om.valueToTree(this.getHypervisor()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getInferenceAccelerators() != null) {
                data.set("inferenceAccelerators", om.valueToTree(this.getInferenceAccelerators()));
            }
            if (this.getInstanceDisks() != null) {
                data.set("instanceDisks", om.valueToTree(this.getInstanceDisks()));
            }
            if (this.getMaximumIpv6AddressesPerInterface() != null) {
                data.set("maximumIpv6AddressesPerInterface", om.valueToTree(this.getMaximumIpv6AddressesPerInterface()));
            }
            if (this.getTotalFpgaMemory() != null) {
                data.set("totalFpgaMemory", om.valueToTree(this.getTotalFpgaMemory()));
            }
            if (this.getTotalGpuMemory() != null) {
                data.set("totalGpuMemory", om.valueToTree(this.getTotalGpuMemory()));
            }
            if (this.getTotalInstanceStorage() != null) {
                data.set("totalInstanceStorage", om.valueToTree(this.getTotalInstanceStorage()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ec2.DataAwsEc2InstanceTypeConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsEc2InstanceTypeConfig.Jsii$Proxy that = (DataAwsEc2InstanceTypeConfig.Jsii$Proxy) o;

            if (!instanceType.equals(that.instanceType)) return false;
            if (this.defaultCores != null ? !this.defaultCores.equals(that.defaultCores) : that.defaultCores != null) return false;
            if (this.defaultThreadsPerCore != null ? !this.defaultThreadsPerCore.equals(that.defaultThreadsPerCore) : that.defaultThreadsPerCore != null) return false;
            if (this.fpgas != null ? !this.fpgas.equals(that.fpgas) : that.fpgas != null) return false;
            if (this.gpus != null ? !this.gpus.equals(that.gpus) : that.gpus != null) return false;
            if (this.hypervisor != null ? !this.hypervisor.equals(that.hypervisor) : that.hypervisor != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.inferenceAccelerators != null ? !this.inferenceAccelerators.equals(that.inferenceAccelerators) : that.inferenceAccelerators != null) return false;
            if (this.instanceDisks != null ? !this.instanceDisks.equals(that.instanceDisks) : that.instanceDisks != null) return false;
            if (this.maximumIpv6AddressesPerInterface != null ? !this.maximumIpv6AddressesPerInterface.equals(that.maximumIpv6AddressesPerInterface) : that.maximumIpv6AddressesPerInterface != null) return false;
            if (this.totalFpgaMemory != null ? !this.totalFpgaMemory.equals(that.totalFpgaMemory) : that.totalFpgaMemory != null) return false;
            if (this.totalGpuMemory != null ? !this.totalGpuMemory.equals(that.totalGpuMemory) : that.totalGpuMemory != null) return false;
            if (this.totalInstanceStorage != null ? !this.totalInstanceStorage.equals(that.totalInstanceStorage) : that.totalInstanceStorage != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.instanceType.hashCode();
            result = 31 * result + (this.defaultCores != null ? this.defaultCores.hashCode() : 0);
            result = 31 * result + (this.defaultThreadsPerCore != null ? this.defaultThreadsPerCore.hashCode() : 0);
            result = 31 * result + (this.fpgas != null ? this.fpgas.hashCode() : 0);
            result = 31 * result + (this.gpus != null ? this.gpus.hashCode() : 0);
            result = 31 * result + (this.hypervisor != null ? this.hypervisor.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.inferenceAccelerators != null ? this.inferenceAccelerators.hashCode() : 0);
            result = 31 * result + (this.instanceDisks != null ? this.instanceDisks.hashCode() : 0);
            result = 31 * result + (this.maximumIpv6AddressesPerInterface != null ? this.maximumIpv6AddressesPerInterface.hashCode() : 0);
            result = 31 * result + (this.totalFpgaMemory != null ? this.totalFpgaMemory.hashCode() : 0);
            result = 31 * result + (this.totalGpuMemory != null ? this.totalGpuMemory.hashCode() : 0);
            result = 31 * result + (this.totalInstanceStorage != null ? this.totalInstanceStorage.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
