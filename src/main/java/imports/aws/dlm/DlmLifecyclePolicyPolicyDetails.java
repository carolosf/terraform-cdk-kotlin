package imports.aws.dlm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.466Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dlm.DlmLifecyclePolicyPolicyDetails")
@software.amazon.jsii.Jsii.Proxy(DlmLifecyclePolicyPolicyDetails.Jsii$Proxy.class)
public interface DlmLifecyclePolicyPolicyDetails extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#resource_types DlmLifecyclePolicy#resource_types}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getResourceTypes();

    /**
     * schedule block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#schedule DlmLifecyclePolicy#schedule}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getSchedule();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#target_tags DlmLifecyclePolicy#target_tags}.
     */
    @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTargetTags();

    /**
     * @return a {@link Builder} of {@link DlmLifecyclePolicyPolicyDetails}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DlmLifecyclePolicyPolicyDetails}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DlmLifecyclePolicyPolicyDetails> {
        java.util.List<java.lang.String> resourceTypes;
        java.lang.Object schedule;
        java.util.Map<java.lang.String, java.lang.String> targetTags;

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetails#getResourceTypes}
         * @param resourceTypes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#resource_types DlmLifecyclePolicy#resource_types}. This parameter is required.
         * @return {@code this}
         */
        public Builder resourceTypes(java.util.List<java.lang.String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetails#getSchedule}
         * @param schedule schedule block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#schedule DlmLifecyclePolicy#schedule}
         * @return {@code this}
         */
        public Builder schedule(com.hashicorp.cdktf.IResolvable schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetails#getSchedule}
         * @param schedule schedule block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#schedule DlmLifecyclePolicy#schedule}
         * @return {@code this}
         */
        public Builder schedule(java.util.List<? extends imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsSchedule> schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetails#getTargetTags}
         * @param targetTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#target_tags DlmLifecyclePolicy#target_tags}. This parameter is required.
         * @return {@code this}
         */
        public Builder targetTags(java.util.Map<java.lang.String, java.lang.String> targetTags) {
            this.targetTags = targetTags;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DlmLifecyclePolicyPolicyDetails}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DlmLifecyclePolicyPolicyDetails build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DlmLifecyclePolicyPolicyDetails}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DlmLifecyclePolicyPolicyDetails {
        private final java.util.List<java.lang.String> resourceTypes;
        private final java.lang.Object schedule;
        private final java.util.Map<java.lang.String, java.lang.String> targetTags;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resourceTypes = software.amazon.jsii.Kernel.get(this, "resourceTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.schedule = software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.targetTags = software.amazon.jsii.Kernel.get(this, "targetTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resourceTypes = java.util.Objects.requireNonNull(builder.resourceTypes, "resourceTypes is required");
            this.schedule = java.util.Objects.requireNonNull(builder.schedule, "schedule is required");
            this.targetTags = java.util.Objects.requireNonNull(builder.targetTags, "targetTags is required");
        }

        @Override
        public final java.util.List<java.lang.String> getResourceTypes() {
            return this.resourceTypes;
        }

        @Override
        public final java.lang.Object getSchedule() {
            return this.schedule;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTargetTags() {
            return this.targetTags;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("resourceTypes", om.valueToTree(this.getResourceTypes()));
            data.set("schedule", om.valueToTree(this.getSchedule()));
            data.set("targetTags", om.valueToTree(this.getTargetTags()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.dlm.DlmLifecyclePolicyPolicyDetails"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DlmLifecyclePolicyPolicyDetails.Jsii$Proxy that = (DlmLifecyclePolicyPolicyDetails.Jsii$Proxy) o;

            if (!resourceTypes.equals(that.resourceTypes)) return false;
            if (!schedule.equals(that.schedule)) return false;
            return this.targetTags.equals(that.targetTags);
        }

        @Override
        public final int hashCode() {
            int result = this.resourceTypes.hashCode();
            result = 31 * result + (this.schedule.hashCode());
            result = 31 * result + (this.targetTags.hashCode());
            return result;
        }
    }
}
