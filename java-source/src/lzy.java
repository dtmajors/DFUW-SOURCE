/*
 * Decompiled with CFR.
 */
public class lzy
extends lzh {
    private static final lzy tZl = new lzy();
    @lok(value="Your $(Attribute) has increased to $(AttributeValue)!")
    @lpl(value="Displayed to player when one of the attributes has been increased.")
    @lpk(value="se_pe_attribute_up")
    public static final lox tZm = tZl.a("Up", lzy.Bo("Attribute"), lzy.ah("AttributeValue", 2));
    @lok(value="Your $(Attribute) has decreased to $(AttributeValue)!")
    @lpl(value="Displayed to player when one of the attributes has been decreased.")
    @lpk(value="se_pe_attribute_down")
    public static final lox tZn = tZl.a("Down", lzy.Bo("Attribute"), lzy.ah("AttributeValue", 2));
    @lok(value="Value of attribute '$(AttributeName)' for $(PlayerID) is $(AttributeValue)")
    @lpl(value="Displayed to print the effective value of a player's attribute")
    public static final lox tZo = tZl.a("PrintValue", lzy.Bo("AttributeName"), lzy.Bk("PlayerID"), lzy.ah("AttributeValue", 2));
    @lok(value="Modifier Added: $(ModifierName)")
    @lpl(value="Displayed to a player when a modifier is added to one of their attributes")
    public static final lox tZp = tZl.a("ModifierAdded", lzy.Bo("ModifierName"));

    protected lzy(String string) {
        super("Attributes." + string);
    }

    private lzy() {
        super("Attributes");
    }
}

