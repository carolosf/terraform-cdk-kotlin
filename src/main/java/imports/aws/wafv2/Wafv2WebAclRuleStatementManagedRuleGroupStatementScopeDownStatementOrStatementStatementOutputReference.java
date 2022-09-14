package imports.aws.wafv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-20T11:58:20.455Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOutputReference")
public class Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putAndStatement(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatement value) {
        software.amazon.jsii.Kernel.call(this, "putAndStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putByteMatchStatement(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementByteMatchStatement value) {
        software.amazon.jsii.Kernel.call(this, "putByteMatchStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGeoMatchStatement(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatement value) {
        software.amazon.jsii.Kernel.call(this, "putGeoMatchStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIpSetReferenceStatement(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementIpSetReferenceStatement value) {
        software.amazon.jsii.Kernel.call(this, "putIpSetReferenceStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLabelMatchStatement(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementLabelMatchStatement value) {
        software.amazon.jsii.Kernel.call(this, "putLabelMatchStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNotStatement(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatement value) {
        software.amazon.jsii.Kernel.call(this, "putNotStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOrStatement(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatement value) {
        software.amazon.jsii.Kernel.call(this, "putOrStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRegexPatternSetReferenceStatement(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatement value) {
        software.amazon.jsii.Kernel.call(this, "putRegexPatternSetReferenceStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSizeConstraintStatement(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementSizeConstraintStatement value) {
        software.amazon.jsii.Kernel.call(this, "putSizeConstraintStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSqliMatchStatement(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementSqliMatchStatement value) {
        software.amazon.jsii.Kernel.call(this, "putSqliMatchStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putXssMatchStatement(final @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementXssMatchStatement value) {
        software.amazon.jsii.Kernel.call(this, "putXssMatchStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAndStatement() {
        software.amazon.jsii.Kernel.call(this, "resetAndStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetByteMatchStatement() {
        software.amazon.jsii.Kernel.call(this, "resetByteMatchStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGeoMatchStatement() {
        software.amazon.jsii.Kernel.call(this, "resetGeoMatchStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIpSetReferenceStatement() {
        software.amazon.jsii.Kernel.call(this, "resetIpSetReferenceStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLabelMatchStatement() {
        software.amazon.jsii.Kernel.call(this, "resetLabelMatchStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNotStatement() {
        software.amazon.jsii.Kernel.call(this, "resetNotStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOrStatement() {
        software.amazon.jsii.Kernel.call(this, "resetOrStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegexPatternSetReferenceStatement() {
        software.amazon.jsii.Kernel.call(this, "resetRegexPatternSetReferenceStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSizeConstraintStatement() {
        software.amazon.jsii.Kernel.call(this, "resetSizeConstraintStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSqliMatchStatement() {
        software.amazon.jsii.Kernel.call(this, "resetSqliMatchStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetXssMatchStatement() {
        software.amazon.jsii.Kernel.call(this, "resetXssMatchStatement", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementOutputReference getAndStatement() {
        return software.amazon.jsii.Kernel.get(this, "andStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementByteMatchStatementOutputReference getByteMatchStatement() {
        return software.amazon.jsii.Kernel.get(this, "byteMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementByteMatchStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementOutputReference getGeoMatchStatement() {
        return software.amazon.jsii.Kernel.get(this, "geoMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementIpSetReferenceStatementOutputReference getIpSetReferenceStatement() {
        return software.amazon.jsii.Kernel.get(this, "ipSetReferenceStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementIpSetReferenceStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementLabelMatchStatementOutputReference getLabelMatchStatement() {
        return software.amazon.jsii.Kernel.get(this, "labelMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementLabelMatchStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementOutputReference getNotStatement() {
        return software.amazon.jsii.Kernel.get(this, "notStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementOutputReference getOrStatement() {
        return software.amazon.jsii.Kernel.get(this, "orStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatementOutputReference getRegexPatternSetReferenceStatement() {
        return software.amazon.jsii.Kernel.get(this, "regexPatternSetReferenceStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementSizeConstraintStatementOutputReference getSizeConstraintStatement() {
        return software.amazon.jsii.Kernel.get(this, "sizeConstraintStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementSizeConstraintStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementSqliMatchStatementOutputReference getSqliMatchStatement() {
        return software.amazon.jsii.Kernel.get(this, "sqliMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementSqliMatchStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementXssMatchStatementOutputReference getXssMatchStatement() {
        return software.amazon.jsii.Kernel.get(this, "xssMatchStatement", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementXssMatchStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatement getAndStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "andStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatement.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementByteMatchStatement getByteMatchStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "byteMatchStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementByteMatchStatement.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatement getGeoMatchStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "geoMatchStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatement.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementIpSetReferenceStatement getIpSetReferenceStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "ipSetReferenceStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementIpSetReferenceStatement.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementLabelMatchStatement getLabelMatchStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "labelMatchStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementLabelMatchStatement.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatement getNotStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "notStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatement.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatement getOrStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "orStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatement.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatement getRegexPatternSetReferenceStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "regexPatternSetReferenceStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementRegexPatternSetReferenceStatement.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementSizeConstraintStatement getSizeConstraintStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "sizeConstraintStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementSizeConstraintStatement.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementSqliMatchStatement getSqliMatchStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "sqliMatchStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementSqliMatchStatement.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementXssMatchStatement getXssMatchStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "xssMatchStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementXssMatchStatement.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafv2.Wafv2WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatement value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
