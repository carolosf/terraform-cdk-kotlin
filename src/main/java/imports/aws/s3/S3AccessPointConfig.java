package imports.aws.s3;

/**
 * AWS Simple Storage Service.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.049Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3AccessPointConfig")
@software.amazon.jsii.Jsii.Proxy(S3AccessPointConfig.Jsii$Proxy.class)
public interface S3AccessPointConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_access_point#bucket S3AccessPoint#bucket}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getBucket();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_access_point#name S3AccessPoint#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_access_point#account_id S3AccessPoint#account_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAccountId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_access_point#id S3AccessPoint#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_access_point#policy S3AccessPoint#policy}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return null;
    }

    /**
     * public_access_block_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3_access_point#public_access_block_configuration S3AccessPoint#public_access_block_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.s3.S3AccessPointPublicAccessBlockConfiguration getPublicAccessBlockConfiguration() {
        return null;
    }

    /**
     * vpc_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3_access_point#vpc_configuration S3AccessPoint#vpc_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.s3.S3AccessPointVpcConfiguration getVpcConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3AccessPointConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3AccessPointConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3AccessPointConfig> {
        java.lang.String bucket;
        java.lang.String name;
        java.lang.String accountId;
        java.lang.String id;
        java.lang.String policy;
        imports.aws.s3.S3AccessPointPublicAccessBlockConfiguration publicAccessBlockConfiguration;
        imports.aws.s3.S3AccessPointVpcConfiguration vpcConfiguration;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link S3AccessPointConfig#getBucket}
         * @param bucket Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_access_point#bucket S3AccessPoint#bucket}. This parameter is required.
         * @return {@code this}
         */
        public Builder bucket(java.lang.String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_access_point#name S3AccessPoint#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getAccountId}
         * @param accountId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_access_point#account_id S3AccessPoint#account_id}.
         * @return {@code this}
         */
        public Builder accountId(java.lang.String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_access_point#id S3AccessPoint#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getPolicy}
         * @param policy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_access_point#policy S3AccessPoint#policy}.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getPublicAccessBlockConfiguration}
         * @param publicAccessBlockConfiguration public_access_block_configuration block.
         *                                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3_access_point#public_access_block_configuration S3AccessPoint#public_access_block_configuration}
         * @return {@code this}
         */
        public Builder publicAccessBlockConfiguration(imports.aws.s3.S3AccessPointPublicAccessBlockConfiguration publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getVpcConfiguration}
         * @param vpcConfiguration vpc_configuration block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3_access_point#vpc_configuration S3AccessPoint#vpc_configuration}
         * @return {@code this}
         */
        public Builder vpcConfiguration(imports.aws.s3.S3AccessPointVpcConfiguration vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getDependsOn}
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
         * Sets the value of {@link S3AccessPointConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link S3AccessPointConfig#getProvisioners}
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
         * @return a new instance of {@link S3AccessPointConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3AccessPointConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3AccessPointConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3AccessPointConfig {
        private final java.lang.String bucket;
        private final java.lang.String name;
        private final java.lang.String accountId;
        private final java.lang.String id;
        private final java.lang.String policy;
        private final imports.aws.s3.S3AccessPointPublicAccessBlockConfiguration publicAccessBlockConfiguration;
        private final imports.aws.s3.S3AccessPointVpcConfiguration vpcConfiguration;
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
            this.bucket = software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accountId = software.amazon.jsii.Kernel.get(this, "accountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.publicAccessBlockConfiguration = software.amazon.jsii.Kernel.get(this, "publicAccessBlockConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3AccessPointPublicAccessBlockConfiguration.class));
            this.vpcConfiguration = software.amazon.jsii.Kernel.get(this, "vpcConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3AccessPointVpcConfiguration.class));
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
            this.bucket = java.util.Objects.requireNonNull(builder.bucket, "bucket is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.accountId = builder.accountId;
            this.id = builder.id;
            this.policy = builder.policy;
            this.publicAccessBlockConfiguration = builder.publicAccessBlockConfiguration;
            this.vpcConfiguration = builder.vpcConfiguration;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getBucket() {
            return this.bucket;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getPolicy() {
            return this.policy;
        }

        @Override
        public final imports.aws.s3.S3AccessPointPublicAccessBlockConfiguration getPublicAccessBlockConfiguration() {
            return this.publicAccessBlockConfiguration;
        }

        @Override
        public final imports.aws.s3.S3AccessPointVpcConfiguration getVpcConfiguration() {
            return this.vpcConfiguration;
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

            data.set("bucket", om.valueToTree(this.getBucket()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAccountId() != null) {
                data.set("accountId", om.valueToTree(this.getAccountId()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getPolicy() != null) {
                data.set("policy", om.valueToTree(this.getPolicy()));
            }
            if (this.getPublicAccessBlockConfiguration() != null) {
                data.set("publicAccessBlockConfiguration", om.valueToTree(this.getPublicAccessBlockConfiguration()));
            }
            if (this.getVpcConfiguration() != null) {
                data.set("vpcConfiguration", om.valueToTree(this.getVpcConfiguration()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3AccessPointConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3AccessPointConfig.Jsii$Proxy that = (S3AccessPointConfig.Jsii$Proxy) o;

            if (!bucket.equals(that.bucket)) return false;
            if (!name.equals(that.name)) return false;
            if (this.accountId != null ? !this.accountId.equals(that.accountId) : that.accountId != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.publicAccessBlockConfiguration != null ? !this.publicAccessBlockConfiguration.equals(that.publicAccessBlockConfiguration) : that.publicAccessBlockConfiguration != null) return false;
            if (this.vpcConfiguration != null ? !this.vpcConfiguration.equals(that.vpcConfiguration) : that.vpcConfiguration != null) return false;
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
            int result = this.bucket.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.accountId != null ? this.accountId.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.publicAccessBlockConfiguration != null ? this.publicAccessBlockConfiguration.hashCode() : 0);
            result = 31 * result + (this.vpcConfiguration != null ? this.vpcConfiguration.hashCode() : 0);
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
