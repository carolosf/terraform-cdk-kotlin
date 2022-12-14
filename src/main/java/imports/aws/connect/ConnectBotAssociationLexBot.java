package imports.aws.connect;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.374Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.connect.ConnectBotAssociationLexBot")
@software.amazon.jsii.Jsii.Proxy(ConnectBotAssociationLexBot.Jsii$Proxy.class)
public interface ConnectBotAssociationLexBot extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_bot_association#name ConnectBotAssociation#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_bot_association#lex_region ConnectBotAssociation#lex_region}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLexRegion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConnectBotAssociationLexBot}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConnectBotAssociationLexBot}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConnectBotAssociationLexBot> {
        java.lang.String name;
        java.lang.String lexRegion;

        /**
         * Sets the value of {@link ConnectBotAssociationLexBot#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_bot_association#name ConnectBotAssociation#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ConnectBotAssociationLexBot#getLexRegion}
         * @param lexRegion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_bot_association#lex_region ConnectBotAssociation#lex_region}.
         * @return {@code this}
         */
        public Builder lexRegion(java.lang.String lexRegion) {
            this.lexRegion = lexRegion;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConnectBotAssociationLexBot}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConnectBotAssociationLexBot build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ConnectBotAssociationLexBot}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConnectBotAssociationLexBot {
        private final java.lang.String name;
        private final java.lang.String lexRegion;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lexRegion = software.amazon.jsii.Kernel.get(this, "lexRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.lexRegion = builder.lexRegion;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getLexRegion() {
            return this.lexRegion;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getLexRegion() != null) {
                data.set("lexRegion", om.valueToTree(this.getLexRegion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.connect.ConnectBotAssociationLexBot"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConnectBotAssociationLexBot.Jsii$Proxy that = (ConnectBotAssociationLexBot.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.lexRegion != null ? this.lexRegion.equals(that.lexRegion) : that.lexRegion == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.lexRegion != null ? this.lexRegion.hashCode() : 0);
            return result;
        }
    }
}
