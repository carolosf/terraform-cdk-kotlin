package imports.aws.kinesis;

/**
 * AWS Kinesis.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.806Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kinesis.KinesisFirehoseDeliveryStreamConfig")
@software.amazon.jsii.Jsii.Proxy(KinesisFirehoseDeliveryStreamConfig.Jsii$Proxy.class)
public interface KinesisFirehoseDeliveryStreamConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#destination KinesisFirehoseDeliveryStream#destination}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDestination();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#name KinesisFirehoseDeliveryStream#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#arn KinesisFirehoseDeliveryStream#arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getArn() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#destination_id KinesisFirehoseDeliveryStream#destination_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDestinationId() {
        return null;
    }

    /**
     * elasticsearch_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#elasticsearch_configuration KinesisFirehoseDeliveryStream#elasticsearch_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamElasticsearchConfiguration getElasticsearchConfiguration() {
        return null;
    }

    /**
     * extended_s3_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#extended_s3_configuration KinesisFirehoseDeliveryStream#extended_s3_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3Configuration getExtendedS3Configuration() {
        return null;
    }

    /**
     * http_endpoint_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#http_endpoint_configuration KinesisFirehoseDeliveryStream#http_endpoint_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamHttpEndpointConfiguration getHttpEndpointConfiguration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#id KinesisFirehoseDeliveryStream#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * kinesis_source_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#kinesis_source_configuration KinesisFirehoseDeliveryStream#kinesis_source_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration getKinesisSourceConfiguration() {
        return null;
    }

    /**
     * redshift_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#redshift_configuration KinesisFirehoseDeliveryStream#redshift_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfiguration getRedshiftConfiguration() {
        return null;
    }

    /**
     * s3_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#s3_configuration KinesisFirehoseDeliveryStream#s3_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamS3Configuration getS3Configuration() {
        return null;
    }

    /**
     * server_side_encryption block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#server_side_encryption KinesisFirehoseDeliveryStream#server_side_encryption}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamServerSideEncryption getServerSideEncryption() {
        return null;
    }

    /**
     * splunk_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#splunk_configuration KinesisFirehoseDeliveryStream#splunk_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfiguration getSplunkConfiguration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#tags KinesisFirehoseDeliveryStream#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#tags_all KinesisFirehoseDeliveryStream#tags_all}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#version_id KinesisFirehoseDeliveryStream#version_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVersionId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisFirehoseDeliveryStreamConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisFirehoseDeliveryStreamConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisFirehoseDeliveryStreamConfig> {
        java.lang.String destination;
        java.lang.String name;
        java.lang.String arn;
        java.lang.String destinationId;
        imports.aws.kinesis.KinesisFirehoseDeliveryStreamElasticsearchConfiguration elasticsearchConfiguration;
        imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3Configuration extendedS3Configuration;
        imports.aws.kinesis.KinesisFirehoseDeliveryStreamHttpEndpointConfiguration httpEndpointConfiguration;
        java.lang.String id;
        imports.aws.kinesis.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration kinesisSourceConfiguration;
        imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfiguration redshiftConfiguration;
        imports.aws.kinesis.KinesisFirehoseDeliveryStreamS3Configuration s3Configuration;
        imports.aws.kinesis.KinesisFirehoseDeliveryStreamServerSideEncryption serverSideEncryption;
        imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfiguration splunkConfiguration;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.Map<java.lang.String, java.lang.String> tagsAll;
        java.lang.String versionId;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getDestination}
         * @param destination Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#destination KinesisFirehoseDeliveryStream#destination}. This parameter is required.
         * @return {@code this}
         */
        public Builder destination(java.lang.String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#name KinesisFirehoseDeliveryStream#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getArn}
         * @param arn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#arn KinesisFirehoseDeliveryStream#arn}.
         * @return {@code this}
         */
        public Builder arn(java.lang.String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getDestinationId}
         * @param destinationId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#destination_id KinesisFirehoseDeliveryStream#destination_id}.
         * @return {@code this}
         */
        public Builder destinationId(java.lang.String destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getElasticsearchConfiguration}
         * @param elasticsearchConfiguration elasticsearch_configuration block.
         *                                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#elasticsearch_configuration KinesisFirehoseDeliveryStream#elasticsearch_configuration}
         * @return {@code this}
         */
        public Builder elasticsearchConfiguration(imports.aws.kinesis.KinesisFirehoseDeliveryStreamElasticsearchConfiguration elasticsearchConfiguration) {
            this.elasticsearchConfiguration = elasticsearchConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getExtendedS3Configuration}
         * @param extendedS3Configuration extended_s3_configuration block.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#extended_s3_configuration KinesisFirehoseDeliveryStream#extended_s3_configuration}
         * @return {@code this}
         */
        public Builder extendedS3Configuration(imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3Configuration extendedS3Configuration) {
            this.extendedS3Configuration = extendedS3Configuration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getHttpEndpointConfiguration}
         * @param httpEndpointConfiguration http_endpoint_configuration block.
         *                                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#http_endpoint_configuration KinesisFirehoseDeliveryStream#http_endpoint_configuration}
         * @return {@code this}
         */
        public Builder httpEndpointConfiguration(imports.aws.kinesis.KinesisFirehoseDeliveryStreamHttpEndpointConfiguration httpEndpointConfiguration) {
            this.httpEndpointConfiguration = httpEndpointConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#id KinesisFirehoseDeliveryStream#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getKinesisSourceConfiguration}
         * @param kinesisSourceConfiguration kinesis_source_configuration block.
         *                                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#kinesis_source_configuration KinesisFirehoseDeliveryStream#kinesis_source_configuration}
         * @return {@code this}
         */
        public Builder kinesisSourceConfiguration(imports.aws.kinesis.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration kinesisSourceConfiguration) {
            this.kinesisSourceConfiguration = kinesisSourceConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getRedshiftConfiguration}
         * @param redshiftConfiguration redshift_configuration block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#redshift_configuration KinesisFirehoseDeliveryStream#redshift_configuration}
         * @return {@code this}
         */
        public Builder redshiftConfiguration(imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfiguration redshiftConfiguration) {
            this.redshiftConfiguration = redshiftConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getS3Configuration}
         * @param s3Configuration s3_configuration block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#s3_configuration KinesisFirehoseDeliveryStream#s3_configuration}
         * @return {@code this}
         */
        public Builder s3Configuration(imports.aws.kinesis.KinesisFirehoseDeliveryStreamS3Configuration s3Configuration) {
            this.s3Configuration = s3Configuration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getServerSideEncryption}
         * @param serverSideEncryption server_side_encryption block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#server_side_encryption KinesisFirehoseDeliveryStream#server_side_encryption}
         * @return {@code this}
         */
        public Builder serverSideEncryption(imports.aws.kinesis.KinesisFirehoseDeliveryStreamServerSideEncryption serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getSplunkConfiguration}
         * @param splunkConfiguration splunk_configuration block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#splunk_configuration KinesisFirehoseDeliveryStream#splunk_configuration}
         * @return {@code this}
         */
        public Builder splunkConfiguration(imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfiguration splunkConfiguration) {
            this.splunkConfiguration = splunkConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#tags KinesisFirehoseDeliveryStream#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getTagsAll}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#tags_all KinesisFirehoseDeliveryStream#tags_all}.
         * @return {@code this}
         */
        public Builder tagsAll(java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getVersionId}
         * @param versionId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream#version_id KinesisFirehoseDeliveryStream#version_id}.
         * @return {@code this}
         */
        public Builder versionId(java.lang.String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.ISSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.IWinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link KinesisFirehoseDeliveryStreamConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisFirehoseDeliveryStreamConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisFirehoseDeliveryStreamConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KinesisFirehoseDeliveryStreamConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisFirehoseDeliveryStreamConfig {
        private final java.lang.String destination;
        private final java.lang.String name;
        private final java.lang.String arn;
        private final java.lang.String destinationId;
        private final imports.aws.kinesis.KinesisFirehoseDeliveryStreamElasticsearchConfiguration elasticsearchConfiguration;
        private final imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3Configuration extendedS3Configuration;
        private final imports.aws.kinesis.KinesisFirehoseDeliveryStreamHttpEndpointConfiguration httpEndpointConfiguration;
        private final java.lang.String id;
        private final imports.aws.kinesis.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration kinesisSourceConfiguration;
        private final imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfiguration redshiftConfiguration;
        private final imports.aws.kinesis.KinesisFirehoseDeliveryStreamS3Configuration s3Configuration;
        private final imports.aws.kinesis.KinesisFirehoseDeliveryStreamServerSideEncryption serverSideEncryption;
        private final imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfiguration splunkConfiguration;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> tagsAll;
        private final java.lang.String versionId;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.destination = software.amazon.jsii.Kernel.get(this, "destination", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.arn = software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.destinationId = software.amazon.jsii.Kernel.get(this, "destinationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.elasticsearchConfiguration = software.amazon.jsii.Kernel.get(this, "elasticsearchConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamElasticsearchConfiguration.class));
            this.extendedS3Configuration = software.amazon.jsii.Kernel.get(this, "extendedS3Configuration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3Configuration.class));
            this.httpEndpointConfiguration = software.amazon.jsii.Kernel.get(this, "httpEndpointConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamHttpEndpointConfiguration.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kinesisSourceConfiguration = software.amazon.jsii.Kernel.get(this, "kinesisSourceConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration.class));
            this.redshiftConfiguration = software.amazon.jsii.Kernel.get(this, "redshiftConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfiguration.class));
            this.s3Configuration = software.amazon.jsii.Kernel.get(this, "s3Configuration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamS3Configuration.class));
            this.serverSideEncryption = software.amazon.jsii.Kernel.get(this, "serverSideEncryption", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamServerSideEncryption.class));
            this.splunkConfiguration = software.amazon.jsii.Kernel.get(this, "splunkConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfiguration.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagsAll = software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.versionId = software.amazon.jsii.Kernel.get(this, "versionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destination = java.util.Objects.requireNonNull(builder.destination, "destination is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.arn = builder.arn;
            this.destinationId = builder.destinationId;
            this.elasticsearchConfiguration = builder.elasticsearchConfiguration;
            this.extendedS3Configuration = builder.extendedS3Configuration;
            this.httpEndpointConfiguration = builder.httpEndpointConfiguration;
            this.id = builder.id;
            this.kinesisSourceConfiguration = builder.kinesisSourceConfiguration;
            this.redshiftConfiguration = builder.redshiftConfiguration;
            this.s3Configuration = builder.s3Configuration;
            this.serverSideEncryption = builder.serverSideEncryption;
            this.splunkConfiguration = builder.splunkConfiguration;
            this.tags = builder.tags;
            this.tagsAll = builder.tagsAll;
            this.versionId = builder.versionId;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getDestination() {
            return this.destination;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getArn() {
            return this.arn;
        }

        @Override
        public final java.lang.String getDestinationId() {
            return this.destinationId;
        }

        @Override
        public final imports.aws.kinesis.KinesisFirehoseDeliveryStreamElasticsearchConfiguration getElasticsearchConfiguration() {
            return this.elasticsearchConfiguration;
        }

        @Override
        public final imports.aws.kinesis.KinesisFirehoseDeliveryStreamExtendedS3Configuration getExtendedS3Configuration() {
            return this.extendedS3Configuration;
        }

        @Override
        public final imports.aws.kinesis.KinesisFirehoseDeliveryStreamHttpEndpointConfiguration getHttpEndpointConfiguration() {
            return this.httpEndpointConfiguration;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final imports.aws.kinesis.KinesisFirehoseDeliveryStreamKinesisSourceConfiguration getKinesisSourceConfiguration() {
            return this.kinesisSourceConfiguration;
        }

        @Override
        public final imports.aws.kinesis.KinesisFirehoseDeliveryStreamRedshiftConfiguration getRedshiftConfiguration() {
            return this.redshiftConfiguration;
        }

        @Override
        public final imports.aws.kinesis.KinesisFirehoseDeliveryStreamS3Configuration getS3Configuration() {
            return this.s3Configuration;
        }

        @Override
        public final imports.aws.kinesis.KinesisFirehoseDeliveryStreamServerSideEncryption getServerSideEncryption() {
            return this.serverSideEncryption;
        }

        @Override
        public final imports.aws.kinesis.KinesisFirehoseDeliveryStreamSplunkConfiguration getSplunkConfiguration() {
            return this.splunkConfiguration;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
            return this.tagsAll;
        }

        @Override
        public final java.lang.String getVersionId() {
            return this.versionId;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("destination", om.valueToTree(this.getDestination()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getArn() != null) {
                data.set("arn", om.valueToTree(this.getArn()));
            }
            if (this.getDestinationId() != null) {
                data.set("destinationId", om.valueToTree(this.getDestinationId()));
            }
            if (this.getElasticsearchConfiguration() != null) {
                data.set("elasticsearchConfiguration", om.valueToTree(this.getElasticsearchConfiguration()));
            }
            if (this.getExtendedS3Configuration() != null) {
                data.set("extendedS3Configuration", om.valueToTree(this.getExtendedS3Configuration()));
            }
            if (this.getHttpEndpointConfiguration() != null) {
                data.set("httpEndpointConfiguration", om.valueToTree(this.getHttpEndpointConfiguration()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getKinesisSourceConfiguration() != null) {
                data.set("kinesisSourceConfiguration", om.valueToTree(this.getKinesisSourceConfiguration()));
            }
            if (this.getRedshiftConfiguration() != null) {
                data.set("redshiftConfiguration", om.valueToTree(this.getRedshiftConfiguration()));
            }
            if (this.getS3Configuration() != null) {
                data.set("s3Configuration", om.valueToTree(this.getS3Configuration()));
            }
            if (this.getServerSideEncryption() != null) {
                data.set("serverSideEncryption", om.valueToTree(this.getServerSideEncryption()));
            }
            if (this.getSplunkConfiguration() != null) {
                data.set("splunkConfiguration", om.valueToTree(this.getSplunkConfiguration()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTagsAll() != null) {
                data.set("tagsAll", om.valueToTree(this.getTagsAll()));
            }
            if (this.getVersionId() != null) {
                data.set("versionId", om.valueToTree(this.getVersionId()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.kinesis.KinesisFirehoseDeliveryStreamConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisFirehoseDeliveryStreamConfig.Jsii$Proxy that = (KinesisFirehoseDeliveryStreamConfig.Jsii$Proxy) o;

            if (!destination.equals(that.destination)) return false;
            if (!name.equals(that.name)) return false;
            if (this.arn != null ? !this.arn.equals(that.arn) : that.arn != null) return false;
            if (this.destinationId != null ? !this.destinationId.equals(that.destinationId) : that.destinationId != null) return false;
            if (this.elasticsearchConfiguration != null ? !this.elasticsearchConfiguration.equals(that.elasticsearchConfiguration) : that.elasticsearchConfiguration != null) return false;
            if (this.extendedS3Configuration != null ? !this.extendedS3Configuration.equals(that.extendedS3Configuration) : that.extendedS3Configuration != null) return false;
            if (this.httpEndpointConfiguration != null ? !this.httpEndpointConfiguration.equals(that.httpEndpointConfiguration) : that.httpEndpointConfiguration != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.kinesisSourceConfiguration != null ? !this.kinesisSourceConfiguration.equals(that.kinesisSourceConfiguration) : that.kinesisSourceConfiguration != null) return false;
            if (this.redshiftConfiguration != null ? !this.redshiftConfiguration.equals(that.redshiftConfiguration) : that.redshiftConfiguration != null) return false;
            if (this.s3Configuration != null ? !this.s3Configuration.equals(that.s3Configuration) : that.s3Configuration != null) return false;
            if (this.serverSideEncryption != null ? !this.serverSideEncryption.equals(that.serverSideEncryption) : that.serverSideEncryption != null) return false;
            if (this.splunkConfiguration != null ? !this.splunkConfiguration.equals(that.splunkConfiguration) : that.splunkConfiguration != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tagsAll != null ? !this.tagsAll.equals(that.tagsAll) : that.tagsAll != null) return false;
            if (this.versionId != null ? !this.versionId.equals(that.versionId) : that.versionId != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.destination.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.arn != null ? this.arn.hashCode() : 0);
            result = 31 * result + (this.destinationId != null ? this.destinationId.hashCode() : 0);
            result = 31 * result + (this.elasticsearchConfiguration != null ? this.elasticsearchConfiguration.hashCode() : 0);
            result = 31 * result + (this.extendedS3Configuration != null ? this.extendedS3Configuration.hashCode() : 0);
            result = 31 * result + (this.httpEndpointConfiguration != null ? this.httpEndpointConfiguration.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.kinesisSourceConfiguration != null ? this.kinesisSourceConfiguration.hashCode() : 0);
            result = 31 * result + (this.redshiftConfiguration != null ? this.redshiftConfiguration.hashCode() : 0);
            result = 31 * result + (this.s3Configuration != null ? this.s3Configuration.hashCode() : 0);
            result = 31 * result + (this.serverSideEncryption != null ? this.serverSideEncryption.hashCode() : 0);
            result = 31 * result + (this.splunkConfiguration != null ? this.splunkConfiguration.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tagsAll != null ? this.tagsAll.hashCode() : 0);
            result = 31 * result + (this.versionId != null ? this.versionId.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
