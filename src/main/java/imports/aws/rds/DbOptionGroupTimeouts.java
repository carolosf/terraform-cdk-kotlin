package imports.aws.rds;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.002Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.rds.DbOptionGroupTimeouts")
@software.amazon.jsii.Jsii.Proxy(DbOptionGroupTimeouts.Jsii$Proxy.class)
public interface DbOptionGroupTimeouts extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_option_group#delete DbOptionGroup#delete}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDelete() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DbOptionGroupTimeouts}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DbOptionGroupTimeouts}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DbOptionGroupTimeouts> {
        java.lang.String delete;

        /**
         * Sets the value of {@link DbOptionGroupTimeouts#getDelete}
         * @param delete Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_option_group#delete DbOptionGroup#delete}.
         * @return {@code this}
         */
        public Builder delete(java.lang.String delete) {
            this.delete = delete;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DbOptionGroupTimeouts}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DbOptionGroupTimeouts build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DbOptionGroupTimeouts}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DbOptionGroupTimeouts {
        private final java.lang.String delete;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.delete = software.amazon.jsii.Kernel.get(this, "delete", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.delete = builder.delete;
        }

        @Override
        public final java.lang.String getDelete() {
            return this.delete;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDelete() != null) {
                data.set("delete", om.valueToTree(this.getDelete()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.rds.DbOptionGroupTimeouts"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DbOptionGroupTimeouts.Jsii$Proxy that = (DbOptionGroupTimeouts.Jsii$Proxy) o;

            return this.delete != null ? this.delete.equals(that.delete) : that.delete == null;
        }

        @Override
        public final int hashCode() {
            int result = this.delete != null ? this.delete.hashCode() : 0;
            return result;
        }
    }
}
