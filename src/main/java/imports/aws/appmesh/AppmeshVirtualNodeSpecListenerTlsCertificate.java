package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.179Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificate")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecListenerTlsCertificate.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecListenerTlsCertificate extends software.amazon.jsii.JsiiSerializable {

    /**
     * acm block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#acm AppmeshVirtualNode#acm}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateAcm getAcm() {
        return null;
    }

    /**
     * file block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#file AppmeshVirtualNode#file}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateFile getFile() {
        return null;
    }

    /**
     * sds block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#sds AppmeshVirtualNode#sds}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateSds getSds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecListenerTlsCertificate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecListenerTlsCertificate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecListenerTlsCertificate> {
        imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateAcm acm;
        imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateFile file;
        imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateSds sds;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerTlsCertificate#getAcm}
         * @param acm acm block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#acm AppmeshVirtualNode#acm}
         * @return {@code this}
         */
        public Builder acm(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateAcm acm) {
            this.acm = acm;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerTlsCertificate#getFile}
         * @param file file block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#file AppmeshVirtualNode#file}
         * @return {@code this}
         */
        public Builder file(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateFile file) {
            this.file = file;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerTlsCertificate#getSds}
         * @param sds sds block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#sds AppmeshVirtualNode#sds}
         * @return {@code this}
         */
        public Builder sds(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateSds sds) {
            this.sds = sds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecListenerTlsCertificate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecListenerTlsCertificate build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecListenerTlsCertificate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecListenerTlsCertificate {
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateAcm acm;
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateFile file;
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateSds sds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.acm = software.amazon.jsii.Kernel.get(this, "acm", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateAcm.class));
            this.file = software.amazon.jsii.Kernel.get(this, "file", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateFile.class));
            this.sds = software.amazon.jsii.Kernel.get(this, "sds", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateSds.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.acm = builder.acm;
            this.file = builder.file;
            this.sds = builder.sds;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateAcm getAcm() {
            return this.acm;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateFile getFile() {
            return this.file;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateSds getSds() {
            return this.sds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAcm() != null) {
                data.set("acm", om.valueToTree(this.getAcm()));
            }
            if (this.getFile() != null) {
                data.set("file", om.valueToTree(this.getFile()));
            }
            if (this.getSds() != null) {
                data.set("sds", om.valueToTree(this.getSds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecListenerTlsCertificate.Jsii$Proxy that = (AppmeshVirtualNodeSpecListenerTlsCertificate.Jsii$Proxy) o;

            if (this.acm != null ? !this.acm.equals(that.acm) : that.acm != null) return false;
            if (this.file != null ? !this.file.equals(that.file) : that.file != null) return false;
            return this.sds != null ? this.sds.equals(that.sds) : that.sds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.acm != null ? this.acm.hashCode() : 0;
            result = 31 * result + (this.file != null ? this.file.hashCode() : 0);
            result = 31 * result + (this.sds != null ? this.sds.hashCode() : 0);
            return result;
        }
    }
}