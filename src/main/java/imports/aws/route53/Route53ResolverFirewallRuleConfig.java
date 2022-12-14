package imports.aws.route53;

/**
 * AWS Route 53.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.040Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.route53.Route53ResolverFirewallRuleConfig")
@software.amazon.jsii.Jsii.Proxy(Route53ResolverFirewallRuleConfig.Jsii$Proxy.class)
public interface Route53ResolverFirewallRuleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#action Route53ResolverFirewallRule#action}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAction();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#firewall_domain_list_id Route53ResolverFirewallRule#firewall_domain_list_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFirewallDomainListId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#firewall_rule_group_id Route53ResolverFirewallRule#firewall_rule_group_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFirewallRuleGroupId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#name Route53ResolverFirewallRule#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#priority Route53ResolverFirewallRule#priority}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getPriority();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_override_dns_type Route53ResolverFirewallRule#block_override_dns_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBlockOverrideDnsType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_override_domain Route53ResolverFirewallRule#block_override_domain}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBlockOverrideDomain() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_override_ttl Route53ResolverFirewallRule#block_override_ttl}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getBlockOverrideTtl() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_response Route53ResolverFirewallRule#block_response}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBlockResponse() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#id Route53ResolverFirewallRule#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Route53ResolverFirewallRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Route53ResolverFirewallRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Route53ResolverFirewallRuleConfig> {
        java.lang.String action;
        java.lang.String firewallDomainListId;
        java.lang.String firewallRuleGroupId;
        java.lang.String name;
        java.lang.Number priority;
        java.lang.String blockOverrideDnsType;
        java.lang.String blockOverrideDomain;
        java.lang.Number blockOverrideTtl;
        java.lang.String blockResponse;
        java.lang.String id;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getAction}
         * @param action Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#action Route53ResolverFirewallRule#action}. This parameter is required.
         * @return {@code this}
         */
        public Builder action(java.lang.String action) {
            this.action = action;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getFirewallDomainListId}
         * @param firewallDomainListId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#firewall_domain_list_id Route53ResolverFirewallRule#firewall_domain_list_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder firewallDomainListId(java.lang.String firewallDomainListId) {
            this.firewallDomainListId = firewallDomainListId;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getFirewallRuleGroupId}
         * @param firewallRuleGroupId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#firewall_rule_group_id Route53ResolverFirewallRule#firewall_rule_group_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder firewallRuleGroupId(java.lang.String firewallRuleGroupId) {
            this.firewallRuleGroupId = firewallRuleGroupId;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#name Route53ResolverFirewallRule#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getPriority}
         * @param priority Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#priority Route53ResolverFirewallRule#priority}. This parameter is required.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getBlockOverrideDnsType}
         * @param blockOverrideDnsType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_override_dns_type Route53ResolverFirewallRule#block_override_dns_type}.
         * @return {@code this}
         */
        public Builder blockOverrideDnsType(java.lang.String blockOverrideDnsType) {
            this.blockOverrideDnsType = blockOverrideDnsType;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getBlockOverrideDomain}
         * @param blockOverrideDomain Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_override_domain Route53ResolverFirewallRule#block_override_domain}.
         * @return {@code this}
         */
        public Builder blockOverrideDomain(java.lang.String blockOverrideDomain) {
            this.blockOverrideDomain = blockOverrideDomain;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getBlockOverrideTtl}
         * @param blockOverrideTtl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_override_ttl Route53ResolverFirewallRule#block_override_ttl}.
         * @return {@code this}
         */
        public Builder blockOverrideTtl(java.lang.Number blockOverrideTtl) {
            this.blockOverrideTtl = blockOverrideTtl;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getBlockResponse}
         * @param blockResponse Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_response Route53ResolverFirewallRule#block_response}.
         * @return {@code this}
         */
        public Builder blockResponse(java.lang.String blockResponse) {
            this.blockResponse = blockResponse;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#id Route53ResolverFirewallRule#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getDependsOn}
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
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link Route53ResolverFirewallRuleConfig#getProvisioners}
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
         * @return a new instance of {@link Route53ResolverFirewallRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Route53ResolverFirewallRuleConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Route53ResolverFirewallRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Route53ResolverFirewallRuleConfig {
        private final java.lang.String action;
        private final java.lang.String firewallDomainListId;
        private final java.lang.String firewallRuleGroupId;
        private final java.lang.String name;
        private final java.lang.Number priority;
        private final java.lang.String blockOverrideDnsType;
        private final java.lang.String blockOverrideDomain;
        private final java.lang.Number blockOverrideTtl;
        private final java.lang.String blockResponse;
        private final java.lang.String id;
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
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.firewallDomainListId = software.amazon.jsii.Kernel.get(this, "firewallDomainListId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.firewallRuleGroupId = software.amazon.jsii.Kernel.get(this, "firewallRuleGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.blockOverrideDnsType = software.amazon.jsii.Kernel.get(this, "blockOverrideDnsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.blockOverrideDomain = software.amazon.jsii.Kernel.get(this, "blockOverrideDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.blockOverrideTtl = software.amazon.jsii.Kernel.get(this, "blockOverrideTtl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.blockResponse = software.amazon.jsii.Kernel.get(this, "blockResponse", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.action = java.util.Objects.requireNonNull(builder.action, "action is required");
            this.firewallDomainListId = java.util.Objects.requireNonNull(builder.firewallDomainListId, "firewallDomainListId is required");
            this.firewallRuleGroupId = java.util.Objects.requireNonNull(builder.firewallRuleGroupId, "firewallRuleGroupId is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.priority = java.util.Objects.requireNonNull(builder.priority, "priority is required");
            this.blockOverrideDnsType = builder.blockOverrideDnsType;
            this.blockOverrideDomain = builder.blockOverrideDomain;
            this.blockOverrideTtl = builder.blockOverrideTtl;
            this.blockResponse = builder.blockResponse;
            this.id = builder.id;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getAction() {
            return this.action;
        }

        @Override
        public final java.lang.String getFirewallDomainListId() {
            return this.firewallDomainListId;
        }

        @Override
        public final java.lang.String getFirewallRuleGroupId() {
            return this.firewallRuleGroupId;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        public final java.lang.String getBlockOverrideDnsType() {
            return this.blockOverrideDnsType;
        }

        @Override
        public final java.lang.String getBlockOverrideDomain() {
            return this.blockOverrideDomain;
        }

        @Override
        public final java.lang.Number getBlockOverrideTtl() {
            return this.blockOverrideTtl;
        }

        @Override
        public final java.lang.String getBlockResponse() {
            return this.blockResponse;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
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

            data.set("action", om.valueToTree(this.getAction()));
            data.set("firewallDomainListId", om.valueToTree(this.getFirewallDomainListId()));
            data.set("firewallRuleGroupId", om.valueToTree(this.getFirewallRuleGroupId()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("priority", om.valueToTree(this.getPriority()));
            if (this.getBlockOverrideDnsType() != null) {
                data.set("blockOverrideDnsType", om.valueToTree(this.getBlockOverrideDnsType()));
            }
            if (this.getBlockOverrideDomain() != null) {
                data.set("blockOverrideDomain", om.valueToTree(this.getBlockOverrideDomain()));
            }
            if (this.getBlockOverrideTtl() != null) {
                data.set("blockOverrideTtl", om.valueToTree(this.getBlockOverrideTtl()));
            }
            if (this.getBlockResponse() != null) {
                data.set("blockResponse", om.valueToTree(this.getBlockResponse()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.route53.Route53ResolverFirewallRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Route53ResolverFirewallRuleConfig.Jsii$Proxy that = (Route53ResolverFirewallRuleConfig.Jsii$Proxy) o;

            if (!action.equals(that.action)) return false;
            if (!firewallDomainListId.equals(that.firewallDomainListId)) return false;
            if (!firewallRuleGroupId.equals(that.firewallRuleGroupId)) return false;
            if (!name.equals(that.name)) return false;
            if (!priority.equals(that.priority)) return false;
            if (this.blockOverrideDnsType != null ? !this.blockOverrideDnsType.equals(that.blockOverrideDnsType) : that.blockOverrideDnsType != null) return false;
            if (this.blockOverrideDomain != null ? !this.blockOverrideDomain.equals(that.blockOverrideDomain) : that.blockOverrideDomain != null) return false;
            if (this.blockOverrideTtl != null ? !this.blockOverrideTtl.equals(that.blockOverrideTtl) : that.blockOverrideTtl != null) return false;
            if (this.blockResponse != null ? !this.blockResponse.equals(that.blockResponse) : that.blockResponse != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
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
            int result = this.action.hashCode();
            result = 31 * result + (this.firewallDomainListId.hashCode());
            result = 31 * result + (this.firewallRuleGroupId.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.priority.hashCode());
            result = 31 * result + (this.blockOverrideDnsType != null ? this.blockOverrideDnsType.hashCode() : 0);
            result = 31 * result + (this.blockOverrideDomain != null ? this.blockOverrideDomain.hashCode() : 0);
            result = 31 * result + (this.blockOverrideTtl != null ? this.blockOverrideTtl.hashCode() : 0);
            result = 31 * result + (this.blockResponse != null ? this.blockResponse.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
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
