package imports.aws.dlm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.466Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dlm.DlmLifecyclePolicyPolicyDetailsSchedule")
@software.amazon.jsii.Jsii.Proxy(DlmLifecyclePolicyPolicyDetailsSchedule.Jsii$Proxy.class)
public interface DlmLifecyclePolicyPolicyDetailsSchedule extends software.amazon.jsii.JsiiSerializable {

    /**
     * create_rule block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#create_rule DlmLifecyclePolicy#create_rule}
     */
    @org.jetbrains.annotations.NotNull imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule getCreateRule();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#name DlmLifecyclePolicy#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * retain_rule block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#retain_rule DlmLifecyclePolicy#retain_rule}
     */
    @org.jetbrains.annotations.NotNull imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule getRetainRule();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#copy_tags DlmLifecyclePolicy#copy_tags}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCopyTags() {
        return null;
    }

    /**
     * cross_region_copy_rule block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#cross_region_copy_rule DlmLifecyclePolicy#cross_region_copy_rule}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCrossRegionCopyRule() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#tags_to_add DlmLifecyclePolicy#tags_to_add}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsToAdd() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DlmLifecyclePolicyPolicyDetailsSchedule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DlmLifecyclePolicyPolicyDetailsSchedule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DlmLifecyclePolicyPolicyDetailsSchedule> {
        imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule createRule;
        java.lang.String name;
        imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule retainRule;
        java.lang.Object copyTags;
        java.lang.Object crossRegionCopyRule;
        java.util.Map<java.lang.String, java.lang.String> tagsToAdd;

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getCreateRule}
         * @param createRule create_rule block. This parameter is required.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#create_rule DlmLifecyclePolicy#create_rule}
         * @return {@code this}
         */
        public Builder createRule(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule createRule) {
            this.createRule = createRule;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#name DlmLifecyclePolicy#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getRetainRule}
         * @param retainRule retain_rule block. This parameter is required.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#retain_rule DlmLifecyclePolicy#retain_rule}
         * @return {@code this}
         */
        public Builder retainRule(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule retainRule) {
            this.retainRule = retainRule;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getCopyTags}
         * @param copyTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#copy_tags DlmLifecyclePolicy#copy_tags}.
         * @return {@code this}
         */
        public Builder copyTags(java.lang.Boolean copyTags) {
            this.copyTags = copyTags;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getCopyTags}
         * @param copyTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#copy_tags DlmLifecyclePolicy#copy_tags}.
         * @return {@code this}
         */
        public Builder copyTags(com.hashicorp.cdktf.IResolvable copyTags) {
            this.copyTags = copyTags;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getCrossRegionCopyRule}
         * @param crossRegionCopyRule cross_region_copy_rule block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#cross_region_copy_rule DlmLifecyclePolicy#cross_region_copy_rule}
         * @return {@code this}
         */
        public Builder crossRegionCopyRule(com.hashicorp.cdktf.IResolvable crossRegionCopyRule) {
            this.crossRegionCopyRule = crossRegionCopyRule;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getCrossRegionCopyRule}
         * @param crossRegionCopyRule cross_region_copy_rule block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#cross_region_copy_rule DlmLifecyclePolicy#cross_region_copy_rule}
         * @return {@code this}
         */
        public Builder crossRegionCopyRule(java.util.List<? extends imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule> crossRegionCopyRule) {
            this.crossRegionCopyRule = crossRegionCopyRule;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsSchedule#getTagsToAdd}
         * @param tagsToAdd Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#tags_to_add DlmLifecyclePolicy#tags_to_add}.
         * @return {@code this}
         */
        public Builder tagsToAdd(java.util.Map<java.lang.String, java.lang.String> tagsToAdd) {
            this.tagsToAdd = tagsToAdd;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DlmLifecyclePolicyPolicyDetailsSchedule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DlmLifecyclePolicyPolicyDetailsSchedule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DlmLifecyclePolicyPolicyDetailsSchedule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DlmLifecyclePolicyPolicyDetailsSchedule {
        private final imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule createRule;
        private final java.lang.String name;
        private final imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule retainRule;
        private final java.lang.Object copyTags;
        private final java.lang.Object crossRegionCopyRule;
        private final java.util.Map<java.lang.String, java.lang.String> tagsToAdd;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.createRule = software.amazon.jsii.Kernel.get(this, "createRule", software.amazon.jsii.NativeType.forClass(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.retainRule = software.amazon.jsii.Kernel.get(this, "retainRule", software.amazon.jsii.NativeType.forClass(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule.class));
            this.copyTags = software.amazon.jsii.Kernel.get(this, "copyTags", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.crossRegionCopyRule = software.amazon.jsii.Kernel.get(this, "crossRegionCopyRule", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.tagsToAdd = software.amazon.jsii.Kernel.get(this, "tagsToAdd", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.createRule = java.util.Objects.requireNonNull(builder.createRule, "createRule is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.retainRule = java.util.Objects.requireNonNull(builder.retainRule, "retainRule is required");
            this.copyTags = builder.copyTags;
            this.crossRegionCopyRule = builder.crossRegionCopyRule;
            this.tagsToAdd = builder.tagsToAdd;
        }

        @Override
        public final imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleCreateRule getCreateRule() {
            return this.createRule;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule getRetainRule() {
            return this.retainRule;
        }

        @Override
        public final java.lang.Object getCopyTags() {
            return this.copyTags;
        }

        @Override
        public final java.lang.Object getCrossRegionCopyRule() {
            return this.crossRegionCopyRule;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTagsToAdd() {
            return this.tagsToAdd;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("createRule", om.valueToTree(this.getCreateRule()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("retainRule", om.valueToTree(this.getRetainRule()));
            if (this.getCopyTags() != null) {
                data.set("copyTags", om.valueToTree(this.getCopyTags()));
            }
            if (this.getCrossRegionCopyRule() != null) {
                data.set("crossRegionCopyRule", om.valueToTree(this.getCrossRegionCopyRule()));
            }
            if (this.getTagsToAdd() != null) {
                data.set("tagsToAdd", om.valueToTree(this.getTagsToAdd()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.dlm.DlmLifecyclePolicyPolicyDetailsSchedule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DlmLifecyclePolicyPolicyDetailsSchedule.Jsii$Proxy that = (DlmLifecyclePolicyPolicyDetailsSchedule.Jsii$Proxy) o;

            if (!createRule.equals(that.createRule)) return false;
            if (!name.equals(that.name)) return false;
            if (!retainRule.equals(that.retainRule)) return false;
            if (this.copyTags != null ? !this.copyTags.equals(that.copyTags) : that.copyTags != null) return false;
            if (this.crossRegionCopyRule != null ? !this.crossRegionCopyRule.equals(that.crossRegionCopyRule) : that.crossRegionCopyRule != null) return false;
            return this.tagsToAdd != null ? this.tagsToAdd.equals(that.tagsToAdd) : that.tagsToAdd == null;
        }

        @Override
        public final int hashCode() {
            int result = this.createRule.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.retainRule.hashCode());
            result = 31 * result + (this.copyTags != null ? this.copyTags.hashCode() : 0);
            result = 31 * result + (this.crossRegionCopyRule != null ? this.crossRegionCopyRule.hashCode() : 0);
            result = 31 * result + (this.tagsToAdd != null ? this.tagsToAdd.hashCode() : 0);
            return result;
        }
    }
}
