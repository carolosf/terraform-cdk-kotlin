package imports.aws.vpc;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection_options aws_vpc_peering_connection_options}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.293Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.VpcPeeringConnectionOptions")
public class VpcPeeringConnectionOptions extends com.hashicorp.cdktf.TerraformResource {

    protected VpcPeeringConnectionOptions(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected VpcPeeringConnectionOptions(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.vpc.VpcPeeringConnectionOptions.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection_options aws_vpc_peering_connection_options} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public VpcPeeringConnectionOptions(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcPeeringConnectionOptionsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAccepter(final @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcPeeringConnectionOptionsAccepter value) {
        software.amazon.jsii.Kernel.call(this, "putAccepter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRequester(final @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcPeeringConnectionOptionsRequester value) {
        software.amazon.jsii.Kernel.call(this, "putRequester", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAccepter() {
        software.amazon.jsii.Kernel.call(this, "resetAccepter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequester() {
        software.amazon.jsii.Kernel.call(this, "resetRequester", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcPeeringConnectionOptionsAccepterOutputReference getAccepter() {
        return software.amazon.jsii.Kernel.get(this, "accepter", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcPeeringConnectionOptionsAccepterOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcPeeringConnectionOptionsRequesterOutputReference getRequester() {
        return software.amazon.jsii.Kernel.get(this, "requester", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcPeeringConnectionOptionsRequesterOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.vpc.VpcPeeringConnectionOptionsAccepter getAccepterInput() {
        return software.amazon.jsii.Kernel.get(this, "accepterInput", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcPeeringConnectionOptionsAccepter.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.vpc.VpcPeeringConnectionOptionsRequester getRequesterInput() {
        return software.amazon.jsii.Kernel.get(this, "requesterInput", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcPeeringConnectionOptionsRequester.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcPeeringConnectionIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcPeeringConnectionIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcPeeringConnectionId() {
        return software.amazon.jsii.Kernel.get(this, "vpcPeeringConnectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcPeeringConnectionId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcPeeringConnectionId", java.util.Objects.requireNonNull(value, "vpcPeeringConnectionId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.vpc.VpcPeeringConnectionOptions}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.vpc.VpcPeeringConnectionOptions> {
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
        private final imports.aws.vpc.VpcPeeringConnectionOptionsConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.vpc.VpcPeeringConnectionOptionsConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection_options#vpc_peering_connection_id VpcPeeringConnectionOptions#vpc_peering_connection_id}.
         * <p>
         * @return {@code this}
         * @param vpcPeeringConnectionId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection_options#vpc_peering_connection_id VpcPeeringConnectionOptions#vpc_peering_connection_id}. This parameter is required.
         */
        public Builder vpcPeeringConnectionId(final java.lang.String vpcPeeringConnectionId) {
            this.config.vpcPeeringConnectionId(vpcPeeringConnectionId);
            return this;
        }

        /**
         * accepter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection_options#accepter VpcPeeringConnectionOptions#accepter}
         * <p>
         * @return {@code this}
         * @param accepter accepter block. This parameter is required.
         */
        public Builder accepter(final imports.aws.vpc.VpcPeeringConnectionOptionsAccepter accepter) {
            this.config.accepter(accepter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection_options#id VpcPeeringConnectionOptions#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection_options#id VpcPeeringConnectionOptions#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * requester block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection_options#requester VpcPeeringConnectionOptions#requester}
         * <p>
         * @return {@code this}
         * @param requester requester block. This parameter is required.
         */
        public Builder requester(final imports.aws.vpc.VpcPeeringConnectionOptionsRequester requester) {
            this.config.requester(requester);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.vpc.VpcPeeringConnectionOptions}.
         */
        @Override
        public imports.aws.vpc.VpcPeeringConnectionOptions build() {
            return new imports.aws.vpc.VpcPeeringConnectionOptions(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
