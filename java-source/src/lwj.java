/*
 * Decompiled with CFR.
 */
public class lwj
extends lvx {
    private static final lwj teg = new lwj();
    @lok(value="$(Item.NameSingular)")
    @lol(value="Parameter Only String!")
    public static final lox sXP = teg.a("WindowTitle", lwj.Bl("Item"));
    @lok(value="Clan Name:")
    @lpl(value="Text to display in the label next to the text input box for entering a clan name")
    public static final lox teh = teg.BC("TextInputLabel");

    protected lwj(String string) {
        super("NameChange." + string);
    }

    private lwj() {
        super("NameChange");
    }
}

