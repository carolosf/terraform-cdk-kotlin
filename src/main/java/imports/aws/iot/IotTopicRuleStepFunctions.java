package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.797Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotTopicRuleStepFunctions")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleStepFunctions.Jsii$Proxy.class)
public interface IotTopicRuleStepFunctions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#role_arn IotTopicRule#role_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#state_machine_name IotTopicRule#state_machine_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStateMachineName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#execution_name_prefix IotTopicRule#execution_name_prefix}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExecutionNamePrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleStepFunctions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleStepFunctions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleStepFunctions> {
        java.lang.String roleArn;
        java.lang.String stateMachineName;
        java.lang.String executionNamePrefix;

        /**
         * Sets the value of {@link IotTopicRuleStepFunctions#getRoleArn}
         * @param roleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#role_arn IotTopicRule#role_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleStepFunctions#getStateMachineName}
         * @param stateMachineName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#state_machine_name IotTopicRule#state_machine_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder stateMachineName(java.lang.String stateMachineName) {
            this.stateMachineName = stateMachineName;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleStepFunctions#getExecutionNamePrefix}
         * @param executionNamePrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#execution_name_prefix IotTopicRule#execution_name_prefix}.
         * @return {@code this}
         */
        public Builder executionNamePrefix(java.lang.String executionNamePrefix) {
            this.executionNamePrefix = executionNamePrefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleStepFunctions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleStepFunctions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleStepFunctions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleStepFunctions {
        private final java.lang.String roleArn;
        private final java.lang.String stateMachineName;
        private final java.lang.String executionNamePrefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stateMachineName = software.amazon.jsii.Kernel.get(this, "stateMachineName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.executionNamePrefix = software.amazon.jsii.Kernel.get(this, "executionNamePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.roleArn = java.util.Objects.requireNonNull(builder.roleArn, "roleArn is required");
            this.stateMachineName = java.util.Objects.requireNonNull(builder.stateMachineName, "stateMachineName is required");
            this.executionNamePrefix = builder.executionNamePrefix;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getStateMachineName() {
            return this.stateMachineName;
        }

        @Override
        public final java.lang.String getExecutionNamePrefix() {
            return this.executionNamePrefix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("stateMachineName", om.valueToTree(this.getStateMachineName()));
            if (this.getExecutionNamePrefix() != null) {
                data.set("executionNamePrefix", om.valueToTree(this.getExecutionNamePrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.iot.IotTopicRuleStepFunctions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleStepFunctions.Jsii$Proxy that = (IotTopicRuleStepFunctions.Jsii$Proxy) o;

            if (!roleArn.equals(that.roleArn)) return false;
            if (!stateMachineName.equals(that.stateMachineName)) return false;
            return this.executionNamePrefix != null ? this.executionNamePrefix.equals(that.executionNamePrefix) : that.executionNamePrefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.roleArn.hashCode();
            result = 31 * result + (this.stateMachineName.hashCode());
            result = 31 * result + (this.executionNamePrefix != null ? this.executionNamePrefix.hashCode() : 0);
            return result;
        }
    }
}
