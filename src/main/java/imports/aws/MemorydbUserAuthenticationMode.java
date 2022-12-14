package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.070Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.MemorydbUserAuthenticationMode")
@software.amazon.jsii.Jsii.Proxy(MemorydbUserAuthenticationMode.Jsii$Proxy.class)
public interface MemorydbUserAuthenticationMode extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/memorydb_user#passwords MemorydbUser#passwords}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPasswords();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/memorydb_user#type MemorydbUser#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * @return a {@link Builder} of {@link MemorydbUserAuthenticationMode}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MemorydbUserAuthenticationMode}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MemorydbUserAuthenticationMode> {
        java.util.List<java.lang.String> passwords;
        java.lang.String type;

        /**
         * Sets the value of {@link MemorydbUserAuthenticationMode#getPasswords}
         * @param passwords Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/memorydb_user#passwords MemorydbUser#passwords}. This parameter is required.
         * @return {@code this}
         */
        public Builder passwords(java.util.List<java.lang.String> passwords) {
            this.passwords = passwords;
            return this;
        }

        /**
         * Sets the value of {@link MemorydbUserAuthenticationMode#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/memorydb_user#type MemorydbUser#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MemorydbUserAuthenticationMode}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MemorydbUserAuthenticationMode build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MemorydbUserAuthenticationMode}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MemorydbUserAuthenticationMode {
        private final java.util.List<java.lang.String> passwords;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.passwords = software.amazon.jsii.Kernel.get(this, "passwords", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.passwords = java.util.Objects.requireNonNull(builder.passwords, "passwords is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
        }

        @Override
        public final java.util.List<java.lang.String> getPasswords() {
            return this.passwords;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("passwords", om.valueToTree(this.getPasswords()));
            data.set("type", om.valueToTree(this.getType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.MemorydbUserAuthenticationMode"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MemorydbUserAuthenticationMode.Jsii$Proxy that = (MemorydbUserAuthenticationMode.Jsii$Proxy) o;

            if (!passwords.equals(that.passwords)) return false;
            return this.type.equals(that.type);
        }

        @Override
        public final int hashCode() {
            int result = this.passwords.hashCode();
            result = 31 * result + (this.type.hashCode());
            return result;
        }
    }
}
