package imports.aws.chime;

/**
 * Amazon Chime.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.249Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.chime.ChimeVoiceConnectorOriginationConfig")
@software.amazon.jsii.Jsii.Proxy(ChimeVoiceConnectorOriginationConfig.Jsii$Proxy.class)
public interface ChimeVoiceConnectorOriginationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * route block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_origination#route ChimeVoiceConnectorOrigination#route}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getRoute();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_origination#voice_connector_id ChimeVoiceConnectorOrigination#voice_connector_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVoiceConnectorId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_origination#disabled ChimeVoiceConnectorOrigination#disabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDisabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_origination#id ChimeVoiceConnectorOrigination#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ChimeVoiceConnectorOriginationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ChimeVoiceConnectorOriginationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ChimeVoiceConnectorOriginationConfig> {
        java.lang.Object route;
        java.lang.String voiceConnectorId;
        java.lang.Object disabled;
        java.lang.String id;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getRoute}
         * @param route route block. This parameter is required.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_origination#route ChimeVoiceConnectorOrigination#route}
         * @return {@code this}
         */
        public Builder route(com.hashicorp.cdktf.IResolvable route) {
            this.route = route;
            return this;
        }

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getRoute}
         * @param route route block. This parameter is required.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_origination#route ChimeVoiceConnectorOrigination#route}
         * @return {@code this}
         */
        public Builder route(java.util.List<? extends imports.aws.chime.ChimeVoiceConnectorOriginationRoute> route) {
            this.route = route;
            return this;
        }

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getVoiceConnectorId}
         * @param voiceConnectorId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_origination#voice_connector_id ChimeVoiceConnectorOrigination#voice_connector_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder voiceConnectorId(java.lang.String voiceConnectorId) {
            this.voiceConnectorId = voiceConnectorId;
            return this;
        }

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getDisabled}
         * @param disabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_origination#disabled ChimeVoiceConnectorOrigination#disabled}.
         * @return {@code this}
         */
        public Builder disabled(java.lang.Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getDisabled}
         * @param disabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_origination#disabled ChimeVoiceConnectorOrigination#disabled}.
         * @return {@code this}
         */
        public Builder disabled(com.hashicorp.cdktf.IResolvable disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_origination#id ChimeVoiceConnectorOrigination#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getDependsOn}
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
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link ChimeVoiceConnectorOriginationConfig#getProvisioners}
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
         * @return a new instance of {@link ChimeVoiceConnectorOriginationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ChimeVoiceConnectorOriginationConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ChimeVoiceConnectorOriginationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ChimeVoiceConnectorOriginationConfig {
        private final java.lang.Object route;
        private final java.lang.String voiceConnectorId;
        private final java.lang.Object disabled;
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
            this.route = software.amazon.jsii.Kernel.get(this, "route", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.voiceConnectorId = software.amazon.jsii.Kernel.get(this, "voiceConnectorId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.disabled = software.amazon.jsii.Kernel.get(this, "disabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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
            this.route = java.util.Objects.requireNonNull(builder.route, "route is required");
            this.voiceConnectorId = java.util.Objects.requireNonNull(builder.voiceConnectorId, "voiceConnectorId is required");
            this.disabled = builder.disabled;
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
        public final java.lang.Object getRoute() {
            return this.route;
        }

        @Override
        public final java.lang.String getVoiceConnectorId() {
            return this.voiceConnectorId;
        }

        @Override
        public final java.lang.Object getDisabled() {
            return this.disabled;
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

            data.set("route", om.valueToTree(this.getRoute()));
            data.set("voiceConnectorId", om.valueToTree(this.getVoiceConnectorId()));
            if (this.getDisabled() != null) {
                data.set("disabled", om.valueToTree(this.getDisabled()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.chime.ChimeVoiceConnectorOriginationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ChimeVoiceConnectorOriginationConfig.Jsii$Proxy that = (ChimeVoiceConnectorOriginationConfig.Jsii$Proxy) o;

            if (!route.equals(that.route)) return false;
            if (!voiceConnectorId.equals(that.voiceConnectorId)) return false;
            if (this.disabled != null ? !this.disabled.equals(that.disabled) : that.disabled != null) return false;
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
            int result = this.route.hashCode();
            result = 31 * result + (this.voiceConnectorId.hashCode());
            result = 31 * result + (this.disabled != null ? this.disabled.hashCode() : 0);
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
