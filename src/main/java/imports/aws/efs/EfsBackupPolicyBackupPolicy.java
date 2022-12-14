package imports.aws.efs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.605Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.efs.EfsBackupPolicyBackupPolicy")
@software.amazon.jsii.Jsii.Proxy(EfsBackupPolicyBackupPolicy.Jsii$Proxy.class)
public interface EfsBackupPolicyBackupPolicy extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/efs_backup_policy#status EfsBackupPolicy#status}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStatus();

    /**
     * @return a {@link Builder} of {@link EfsBackupPolicyBackupPolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EfsBackupPolicyBackupPolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EfsBackupPolicyBackupPolicy> {
        java.lang.String status;

        /**
         * Sets the value of {@link EfsBackupPolicyBackupPolicy#getStatus}
         * @param status Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/efs_backup_policy#status EfsBackupPolicy#status}. This parameter is required.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EfsBackupPolicyBackupPolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EfsBackupPolicyBackupPolicy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EfsBackupPolicyBackupPolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EfsBackupPolicyBackupPolicy {
        private final java.lang.String status;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.status = java.util.Objects.requireNonNull(builder.status, "status is required");
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("status", om.valueToTree(this.getStatus()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.efs.EfsBackupPolicyBackupPolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EfsBackupPolicyBackupPolicy.Jsii$Proxy that = (EfsBackupPolicyBackupPolicy.Jsii$Proxy) o;

            return this.status.equals(that.status);
        }

        @Override
        public final int hashCode() {
            int result = this.status.hashCode();
            return result;
        }
    }
}
