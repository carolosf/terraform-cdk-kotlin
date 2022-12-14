package imports.aws.dynamodb;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.494Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dynamodb.DynamodbTableReplica")
@software.amazon.jsii.Jsii.Proxy(DynamodbTableReplica.Jsii$Proxy.class)
public interface DynamodbTableReplica extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#region_name DynamodbTable#region_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRegionName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#kms_key_arn DynamodbTable#kms_key_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DynamodbTableReplica}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DynamodbTableReplica}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DynamodbTableReplica> {
        java.lang.String regionName;
        java.lang.String kmsKeyArn;

        /**
         * Sets the value of {@link DynamodbTableReplica#getRegionName}
         * @param regionName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#region_name DynamodbTable#region_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder regionName(java.lang.String regionName) {
            this.regionName = regionName;
            return this;
        }

        /**
         * Sets the value of {@link DynamodbTableReplica#getKmsKeyArn}
         * @param kmsKeyArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#kms_key_arn DynamodbTable#kms_key_arn}.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DynamodbTableReplica}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DynamodbTableReplica build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DynamodbTableReplica}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DynamodbTableReplica {
        private final java.lang.String regionName;
        private final java.lang.String kmsKeyArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.regionName = software.amazon.jsii.Kernel.get(this, "regionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.regionName = java.util.Objects.requireNonNull(builder.regionName, "regionName is required");
            this.kmsKeyArn = builder.kmsKeyArn;
        }

        @Override
        public final java.lang.String getRegionName() {
            return this.regionName;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("regionName", om.valueToTree(this.getRegionName()));
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.dynamodb.DynamodbTableReplica"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DynamodbTableReplica.Jsii$Proxy that = (DynamodbTableReplica.Jsii$Proxy) o;

            if (!regionName.equals(that.regionName)) return false;
            return this.kmsKeyArn != null ? this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.regionName.hashCode();
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            return result;
        }
    }
}
