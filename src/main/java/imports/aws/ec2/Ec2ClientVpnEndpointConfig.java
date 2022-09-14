package imports.aws.ec2;

/**
 * AWS EC2.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.538Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.Ec2ClientVpnEndpointConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2ClientVpnEndpointConfig.Jsii$Proxy.class)
public interface Ec2ClientVpnEndpointConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * authentication_options block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#authentication_options Ec2ClientVpnEndpoint#authentication_options}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getAuthenticationOptions();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#client_cidr_block Ec2ClientVpnEndpoint#client_cidr_block}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getClientCidrBlock();

    /**
     * connection_log_options block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#connection_log_options Ec2ClientVpnEndpoint#connection_log_options}
     */
    @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2ClientVpnEndpointConnectionLogOptions getConnectionLogOptions();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#server_certificate_arn Ec2ClientVpnEndpoint#server_certificate_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getServerCertificateArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#description Ec2ClientVpnEndpoint#description}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#dns_servers Ec2ClientVpnEndpoint#dns_servers}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDnsServers() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#id Ec2ClientVpnEndpoint#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#self_service_portal Ec2ClientVpnEndpoint#self_service_portal}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSelfServicePortal() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#split_tunnel Ec2ClientVpnEndpoint#split_tunnel}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSplitTunnel() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#tags Ec2ClientVpnEndpoint#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#tags_all Ec2ClientVpnEndpoint#tags_all}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#transport_protocol Ec2ClientVpnEndpoint#transport_protocol}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTransportProtocol() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2ClientVpnEndpointConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2ClientVpnEndpointConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2ClientVpnEndpointConfig> {
        java.lang.Object authenticationOptions;
        java.lang.String clientCidrBlock;
        imports.aws.ec2.Ec2ClientVpnEndpointConnectionLogOptions connectionLogOptions;
        java.lang.String serverCertificateArn;
        java.lang.String description;
        java.util.List<java.lang.String> dnsServers;
        java.lang.String id;
        java.lang.String selfServicePortal;
        java.lang.Object splitTunnel;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.Map<java.lang.String, java.lang.String> tagsAll;
        java.lang.String transportProtocol;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getAuthenticationOptions}
         * @param authenticationOptions authentication_options block. This parameter is required.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#authentication_options Ec2ClientVpnEndpoint#authentication_options}
         * @return {@code this}
         */
        public Builder authenticationOptions(com.hashicorp.cdktf.IResolvable authenticationOptions) {
            this.authenticationOptions = authenticationOptions;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getAuthenticationOptions}
         * @param authenticationOptions authentication_options block. This parameter is required.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#authentication_options Ec2ClientVpnEndpoint#authentication_options}
         * @return {@code this}
         */
        public Builder authenticationOptions(java.util.List<? extends imports.aws.ec2.Ec2ClientVpnEndpointAuthenticationOptions> authenticationOptions) {
            this.authenticationOptions = authenticationOptions;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getClientCidrBlock}
         * @param clientCidrBlock Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#client_cidr_block Ec2ClientVpnEndpoint#client_cidr_block}. This parameter is required.
         * @return {@code this}
         */
        public Builder clientCidrBlock(java.lang.String clientCidrBlock) {
            this.clientCidrBlock = clientCidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getConnectionLogOptions}
         * @param connectionLogOptions connection_log_options block. This parameter is required.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#connection_log_options Ec2ClientVpnEndpoint#connection_log_options}
         * @return {@code this}
         */
        public Builder connectionLogOptions(imports.aws.ec2.Ec2ClientVpnEndpointConnectionLogOptions connectionLogOptions) {
            this.connectionLogOptions = connectionLogOptions;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getServerCertificateArn}
         * @param serverCertificateArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#server_certificate_arn Ec2ClientVpnEndpoint#server_certificate_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder serverCertificateArn(java.lang.String serverCertificateArn) {
            this.serverCertificateArn = serverCertificateArn;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getDescription}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#description Ec2ClientVpnEndpoint#description}.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getDnsServers}
         * @param dnsServers Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#dns_servers Ec2ClientVpnEndpoint#dns_servers}.
         * @return {@code this}
         */
        public Builder dnsServers(java.util.List<java.lang.String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#id Ec2ClientVpnEndpoint#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getSelfServicePortal}
         * @param selfServicePortal Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#self_service_portal Ec2ClientVpnEndpoint#self_service_portal}.
         * @return {@code this}
         */
        public Builder selfServicePortal(java.lang.String selfServicePortal) {
            this.selfServicePortal = selfServicePortal;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getSplitTunnel}
         * @param splitTunnel Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#split_tunnel Ec2ClientVpnEndpoint#split_tunnel}.
         * @return {@code this}
         */
        public Builder splitTunnel(java.lang.Boolean splitTunnel) {
            this.splitTunnel = splitTunnel;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getSplitTunnel}
         * @param splitTunnel Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#split_tunnel Ec2ClientVpnEndpoint#split_tunnel}.
         * @return {@code this}
         */
        public Builder splitTunnel(com.hashicorp.cdktf.IResolvable splitTunnel) {
            this.splitTunnel = splitTunnel;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#tags Ec2ClientVpnEndpoint#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getTagsAll}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#tags_all Ec2ClientVpnEndpoint#tags_all}.
         * @return {@code this}
         */
        public Builder tagsAll(java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getTransportProtocol}
         * @param transportProtocol Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_client_vpn_endpoint#transport_protocol Ec2ClientVpnEndpoint#transport_protocol}.
         * @return {@code this}
         */
        public Builder transportProtocol(java.lang.String transportProtocol) {
            this.transportProtocol = transportProtocol;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getDependsOn}
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
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link Ec2ClientVpnEndpointConfig#getProvisioners}
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
         * @return a new instance of {@link Ec2ClientVpnEndpointConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2ClientVpnEndpointConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Ec2ClientVpnEndpointConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2ClientVpnEndpointConfig {
        private final java.lang.Object authenticationOptions;
        private final java.lang.String clientCidrBlock;
        private final imports.aws.ec2.Ec2ClientVpnEndpointConnectionLogOptions connectionLogOptions;
        private final java.lang.String serverCertificateArn;
        private final java.lang.String description;
        private final java.util.List<java.lang.String> dnsServers;
        private final java.lang.String id;
        private final java.lang.String selfServicePortal;
        private final java.lang.Object splitTunnel;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> tagsAll;
        private final java.lang.String transportProtocol;
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
            this.authenticationOptions = software.amazon.jsii.Kernel.get(this, "authenticationOptions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.clientCidrBlock = software.amazon.jsii.Kernel.get(this, "clientCidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connectionLogOptions = software.amazon.jsii.Kernel.get(this, "connectionLogOptions", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2ClientVpnEndpointConnectionLogOptions.class));
            this.serverCertificateArn = software.amazon.jsii.Kernel.get(this, "serverCertificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dnsServers = software.amazon.jsii.Kernel.get(this, "dnsServers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.selfServicePortal = software.amazon.jsii.Kernel.get(this, "selfServicePortal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.splitTunnel = software.amazon.jsii.Kernel.get(this, "splitTunnel", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagsAll = software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.transportProtocol = software.amazon.jsii.Kernel.get(this, "transportProtocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.authenticationOptions = java.util.Objects.requireNonNull(builder.authenticationOptions, "authenticationOptions is required");
            this.clientCidrBlock = java.util.Objects.requireNonNull(builder.clientCidrBlock, "clientCidrBlock is required");
            this.connectionLogOptions = java.util.Objects.requireNonNull(builder.connectionLogOptions, "connectionLogOptions is required");
            this.serverCertificateArn = java.util.Objects.requireNonNull(builder.serverCertificateArn, "serverCertificateArn is required");
            this.description = builder.description;
            this.dnsServers = builder.dnsServers;
            this.id = builder.id;
            this.selfServicePortal = builder.selfServicePortal;
            this.splitTunnel = builder.splitTunnel;
            this.tags = builder.tags;
            this.tagsAll = builder.tagsAll;
            this.transportProtocol = builder.transportProtocol;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.Object getAuthenticationOptions() {
            return this.authenticationOptions;
        }

        @Override
        public final java.lang.String getClientCidrBlock() {
            return this.clientCidrBlock;
        }

        @Override
        public final imports.aws.ec2.Ec2ClientVpnEndpointConnectionLogOptions getConnectionLogOptions() {
            return this.connectionLogOptions;
        }

        @Override
        public final java.lang.String getServerCertificateArn() {
            return this.serverCertificateArn;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<java.lang.String> getDnsServers() {
            return this.dnsServers;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getSelfServicePortal() {
            return this.selfServicePortal;
        }

        @Override
        public final java.lang.Object getSplitTunnel() {
            return this.splitTunnel;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
            return this.tagsAll;
        }

        @Override
        public final java.lang.String getTransportProtocol() {
            return this.transportProtocol;
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

            data.set("authenticationOptions", om.valueToTree(this.getAuthenticationOptions()));
            data.set("clientCidrBlock", om.valueToTree(this.getClientCidrBlock()));
            data.set("connectionLogOptions", om.valueToTree(this.getConnectionLogOptions()));
            data.set("serverCertificateArn", om.valueToTree(this.getServerCertificateArn()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDnsServers() != null) {
                data.set("dnsServers", om.valueToTree(this.getDnsServers()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getSelfServicePortal() != null) {
                data.set("selfServicePortal", om.valueToTree(this.getSelfServicePortal()));
            }
            if (this.getSplitTunnel() != null) {
                data.set("splitTunnel", om.valueToTree(this.getSplitTunnel()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTagsAll() != null) {
                data.set("tagsAll", om.valueToTree(this.getTagsAll()));
            }
            if (this.getTransportProtocol() != null) {
                data.set("transportProtocol", om.valueToTree(this.getTransportProtocol()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.ec2.Ec2ClientVpnEndpointConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2ClientVpnEndpointConfig.Jsii$Proxy that = (Ec2ClientVpnEndpointConfig.Jsii$Proxy) o;

            if (!authenticationOptions.equals(that.authenticationOptions)) return false;
            if (!clientCidrBlock.equals(that.clientCidrBlock)) return false;
            if (!connectionLogOptions.equals(that.connectionLogOptions)) return false;
            if (!serverCertificateArn.equals(that.serverCertificateArn)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.dnsServers != null ? !this.dnsServers.equals(that.dnsServers) : that.dnsServers != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.selfServicePortal != null ? !this.selfServicePortal.equals(that.selfServicePortal) : that.selfServicePortal != null) return false;
            if (this.splitTunnel != null ? !this.splitTunnel.equals(that.splitTunnel) : that.splitTunnel != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tagsAll != null ? !this.tagsAll.equals(that.tagsAll) : that.tagsAll != null) return false;
            if (this.transportProtocol != null ? !this.transportProtocol.equals(that.transportProtocol) : that.transportProtocol != null) return false;
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
            int result = this.authenticationOptions.hashCode();
            result = 31 * result + (this.clientCidrBlock.hashCode());
            result = 31 * result + (this.connectionLogOptions.hashCode());
            result = 31 * result + (this.serverCertificateArn.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.dnsServers != null ? this.dnsServers.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.selfServicePortal != null ? this.selfServicePortal.hashCode() : 0);
            result = 31 * result + (this.splitTunnel != null ? this.splitTunnel.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tagsAll != null ? this.tagsAll.hashCode() : 0);
            result = 31 * result + (this.transportProtocol != null ? this.transportProtocol.hashCode() : 0);
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
