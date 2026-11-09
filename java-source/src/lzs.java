/*
 * Decompiled with CFR.
 */
public class lzs
extends lzq {
    private static final lzs tYh = new lzs();
    @lok(value="Attribute name not provided")
    @lpl(value="Displayed to an admin/GM when they enter an attribute-specific command, but fail to provide the required attribute name")
    public static final lox tYi = tYh.BC("AttributeNameNotProvided");
    @lok(value="Invalid attribute name")
    @lpl(value="Displayed to an admin/GM when a request to set an attribute value contains an invalid attribtue name")
    public static final lox tYj = tYh.BC("InvalidName");
    @lok(value="Invalid attribute value")
    @lpl(value="Displayed to an admin/GM when a request to set an attribute value contains an invalid attribtue value")
    public static final lox tYk = tYh.BC("InvalidValue");
    @lok(value="Invalid attribute data-type")
    @lpl(value="Displayed to an admin/GM when a request to set an attribute value contains an invalid attribtue data type")
    public static final lox tYl = tYh.BC("InvalidDataType");
    @lok(value="Requested change of attribute $(Attribute) to $(Value) for $(PlayerName)")
    @lpl(value="Displayed when an admin/GM requests the value of a player's attribute be changed")
    public static final lox tYm = tYh.a("ValueChangeRequestedBoolean", lzs.Bo("Attribute"), lzs.Bk("Value"), lzs.Bk("PlayerName"));
    @lok(value="Requested change of attribute $(Attribute) to $(Value) for $(PlayerName)")
    @lpl(value="Displayed when an admin/GM requests the value of a player's attribute be changed")
    public static final lox tYn = tYh.a("ValueChangeRequestedFloat", lzs.Bo("Attribute"), lzs.ah("Value", 2), lzs.Bk("PlayerName"));
    @lok(value="Requested change of attribute $(Attribute) to $(Value) for $(PlayerName)")
    @lpl(value="Displayed when an admin/GM requests the value of a player's attribute be changed")
    public static final lox tYo = tYh.a("ValueChangeRequestedInteger", lzs.Bo("Attribute"), lzs.Bh("Value"), lzs.Bk("PlayerName"));
    @lok(value="Your level of $(Attribute) has been set to $(Value)")
    @lpl(value="Displayed to a player when a value of one of their attributes has been changed by an admin/GM")
    public static final lox tYp = tYh.a("ValueChanged", lzs.Bo("Attribute"), lzs.Bk("Value"));

    protected lzs(String string) {
        super("Attributes." + string);
    }

    private lzs() {
        super("Attributes");
    }
}

