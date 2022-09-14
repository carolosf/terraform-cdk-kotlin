package imports.aws.ec2;

/**
 * AWS EC2.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.550Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.Ec2TransitGatewayRouteConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2TransitGatewayRouteConfig.Jsii$Proxy.class)
public interface Ec2TransitGatewayRouteConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_route#destination_cidr_block Ec2TransitGatewayRoute#destination_cidr_block}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDestinationCidrBlock();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_route#transit_gateway_route_table_id Ec2TransitGatewayRoute#transit_gateway_route_table_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTransitGatewayRouteTableId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_route#blackhole Ec2TransitGatewayRoute#blackhole}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getBlackhole() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_route#id Ec2TransitGatewayRoute#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_route#transit_gateway_attachment_id Ec2TransitGatewayRoute#transit_gateway_attachment_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTransitGatewayAttachmentId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2TransitGatewayRouteConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2TransitGatewayRouteConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2TransitGatewayRouteConfig> {
        java.lang.String destinationCidrBlock;
        java.lang.String transitGatewayRouteTableId;
        java.lang.Object blackhole;
        java.lang.String id;
        java.lang.String transitGatewayAttachmentId;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getDestinationCidrBlock}
         * @param destinationCidrBlock Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_route#destination_cidr_block Ec2TransitGatewayRoute#destination_cidr_block}. This parameter is required.
         * @return {@code this}
         */
        public Builder destinationCidrBlock(java.lang.String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getTransitGatewayRouteTableId}
         * @param transitGatewayRouteTableId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_route#transit_gateway_route_table_id Ec2TransitGatewayRoute#transit_gateway_route_table_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder transitGatewayRouteTableId(java.lang.String transitGatewayRouteTableId) {
            this.transitGatewayRouteTableId = transitGatewayRouteTableId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getBlackhole}
         * @param blackhole Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_route#blackhole Ec2TransitGatewayRoute#blackhole}.
         * @return {@code this}
         */
        public Builder blackhole(java.lang.Boolean blackhole) {
            this.blackhole = blackhole;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getBlackhole}
         * @param blackhole Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_route#blackhole Ec2TransitGatewayRoute#blackhole}.
         * @return {@code this}
         */
        public Builder blackhole(com.hashicorp.cdktf.IResolvable blackhole) {
            this.blackhole = blackhole;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_route#id Ec2TransitGatewayRoute#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getTransitGatewayAttachmentId}
         * @param transitGatewayAttachmentId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_route#transit_gateway_attachment_id Ec2TransitGatewayRoute#transit_gateway_attachment_id}.
         * @return {@code this}
         */
        public Builder transitGatewayAttachmentId(java.lang.String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getDependsOn}
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
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link Ec2TransitGatewayRouteConfig#getProvisioners}
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
         * @return a new instance of {@link Ec2TransitGatewayRouteConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2TransitGatewayRouteConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Ec2TransitGatewayRouteConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2TransitGatewayRouteConfig {
        private final java.lang.String destinationCidrBlock;
        private final java.lang.String transitGatewayRouteTableId;
        private final java.lang.Object blackhole;
        private final java.lang.String id;
        private final java.lang.String transitGatewayAttachmentId;
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
            this.destinationCidrBlock = software.amazon.jsii.Kernel.get(this, "destinationCidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.transitGatewayRouteTableId = software.amazon.jsii.Kernel.get(this, "transitGatewayRouteTableId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.blackhole = software.amazon.jsii.Kernel.get(this, "blackhole", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.transitGatewayAttachmentId = software.amazon.jsii.Kernel.get(this, "transitGatewayAttachmentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.destinationCidrBlock = java.util.Objects.requireNonNull(builder.destinationCidrBlock, "destinationCidrBlock is required");
            this.transitGatewayRouteTableId = java.util.Objects.requireNonNull(builder.transitGatewayRouteTableId, "transitGatewayRouteTableId is required");
            this.blackhole = builder.blackhole;
            this.id = builder.id;
            this.transitGatewayAttachmentId = builder.transitGatewayAttachmentId;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        @Override
        public final java.lang.String getTransitGatewayRouteTableId() {
            return this.transitGatewayRouteTableId;
        }

        @Override
        public final java.lang.Object getBlackhole() {
            return this.blackhole;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getTransitGatewayAttachmentId() {
            return this.transitGatewayAttachmentId;
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

            data.set("destinationCidrBlock", om.valueToTree(this.getDestinationCidrBlock()));
            data.set("transitGatewayRouteTableId", om.valueToTree(this.getTransitGatewayRouteTableId()));
            if (this.getBlackhole() != null) {
                data.set("blackhole", om.valueToTree(this.getBlackhole()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getTransitGatewayAttachmentId() != null) {
                data.set("transitGatewayAttachmentId", om.valueToTree(this.getTransitGatewayAttachmentId()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.ec2.Ec2TransitGatewayRouteConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2TransitGatewayRouteConfig.Jsii$Proxy that = (Ec2TransitGatewayRouteConfig.Jsii$Proxy) o;

            if (!destinationCidrBlock.equals(that.destinationCidrBlock)) return false;
            if (!transitGatewayRouteTableId.equals(that.transitGatewayRouteTableId)) return false;
            if (this.blackhole != null ? !this.blackhole.equals(that.blackhole) : that.blackhole != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.transitGatewayAttachmentId != null ? !this.transitGatewayAttachmentId.equals(that.transitGatewayAttachmentId) : that.transitGatewayAttachmentId != null) return false;
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
            int result = this.destinationCidrBlock.hashCode();
            result = 31 * result + (this.transitGatewayRouteTableId.hashCode());
            result = 31 * result + (this.blackhole != null ? this.blackhole.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.transitGatewayAttachmentId != null ? this.transitGatewayAttachmentId.hashCode() : 0);
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