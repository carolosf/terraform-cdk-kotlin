package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:19.729Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueCrawlerCatalogTarget")
@software.amazon.jsii.Jsii.Proxy(GlueCrawlerCatalogTarget.Jsii$Proxy.class)
public interface GlueCrawlerCatalogTarget extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#database_name GlueCrawler#database_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#tables GlueCrawler#tables}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTables();

    /**
     * @return a {@link Builder} of {@link GlueCrawlerCatalogTarget}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueCrawlerCatalogTarget}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueCrawlerCatalogTarget> {
        java.lang.String databaseName;
        java.util.List<java.lang.String> tables;

        /**
         * Sets the value of {@link GlueCrawlerCatalogTarget#getDatabaseName}
         * @param databaseName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#database_name GlueCrawler#database_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder databaseName(java.lang.String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerCatalogTarget#getTables}
         * @param tables Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#tables GlueCrawler#tables}. This parameter is required.
         * @return {@code this}
         */
        public Builder tables(java.util.List<java.lang.String> tables) {
            this.tables = tables;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueCrawlerCatalogTarget}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueCrawlerCatalogTarget build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GlueCrawlerCatalogTarget}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueCrawlerCatalogTarget {
        private final java.lang.String databaseName;
        private final java.util.List<java.lang.String> tables;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.databaseName = software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tables = software.amazon.jsii.Kernel.get(this, "tables", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.databaseName = java.util.Objects.requireNonNull(builder.databaseName, "databaseName is required");
            this.tables = java.util.Objects.requireNonNull(builder.tables, "tables is required");
        }

        @Override
        public final java.lang.String getDatabaseName() {
            return this.databaseName;
        }

        @Override
        public final java.util.List<java.lang.String> getTables() {
            return this.tables;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("databaseName", om.valueToTree(this.getDatabaseName()));
            data.set("tables", om.valueToTree(this.getTables()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.glue.GlueCrawlerCatalogTarget"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueCrawlerCatalogTarget.Jsii$Proxy that = (GlueCrawlerCatalogTarget.Jsii$Proxy) o;

            if (!databaseName.equals(that.databaseName)) return false;
            return this.tables.equals(that.tables);
        }

        @Override
        public final int hashCode() {
            int result = this.databaseName.hashCode();
            result = 31 * result + (this.tables.hashCode());
            return result;
        }
    }
}
