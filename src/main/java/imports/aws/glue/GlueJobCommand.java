package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.735Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueJobCommand")
@software.amazon.jsii.Jsii.Proxy(GlueJobCommand.Jsii$Proxy.class)
public interface GlueJobCommand extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_job#script_location GlueJob#script_location}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getScriptLocation();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_job#name GlueJob#name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_job#python_version GlueJob#python_version}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPythonVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueJobCommand}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueJobCommand}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueJobCommand> {
        java.lang.String scriptLocation;
        java.lang.String name;
        java.lang.String pythonVersion;

        /**
         * Sets the value of {@link GlueJobCommand#getScriptLocation}
         * @param scriptLocation Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_job#script_location GlueJob#script_location}. This parameter is required.
         * @return {@code this}
         */
        public Builder scriptLocation(java.lang.String scriptLocation) {
            this.scriptLocation = scriptLocation;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobCommand#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_job#name GlueJob#name}.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link GlueJobCommand#getPythonVersion}
         * @param pythonVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_job#python_version GlueJob#python_version}.
         * @return {@code this}
         */
        public Builder pythonVersion(java.lang.String pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueJobCommand}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueJobCommand build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GlueJobCommand}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueJobCommand {
        private final java.lang.String scriptLocation;
        private final java.lang.String name;
        private final java.lang.String pythonVersion;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.scriptLocation = software.amazon.jsii.Kernel.get(this, "scriptLocation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.pythonVersion = software.amazon.jsii.Kernel.get(this, "pythonVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.scriptLocation = java.util.Objects.requireNonNull(builder.scriptLocation, "scriptLocation is required");
            this.name = builder.name;
            this.pythonVersion = builder.pythonVersion;
        }

        @Override
        public final java.lang.String getScriptLocation() {
            return this.scriptLocation;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getPythonVersion() {
            return this.pythonVersion;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("scriptLocation", om.valueToTree(this.getScriptLocation()));
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getPythonVersion() != null) {
                data.set("pythonVersion", om.valueToTree(this.getPythonVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.glue.GlueJobCommand"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueJobCommand.Jsii$Proxy that = (GlueJobCommand.Jsii$Proxy) o;

            if (!scriptLocation.equals(that.scriptLocation)) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.pythonVersion != null ? this.pythonVersion.equals(that.pythonVersion) : that.pythonVersion == null;
        }

        @Override
        public final int hashCode() {
            int result = this.scriptLocation.hashCode();
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.pythonVersion != null ? this.pythonVersion.hashCode() : 0);
            return result;
        }
    }
}
