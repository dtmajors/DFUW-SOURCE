/*
 * Decompiled with CFR.
 */
public class lpt
extends lpq {
    private static final lpt rTZ = new lpt();
    @lok(value="Unknown")
    @lpl(value="Display name for unknown clan holdings")
    public static final lox rUa = rTZ.BC("Unknown");
    @lok(value="City")
    @lpl(value="Display name for large clan holdings")
    public static final lox rUb = rTZ.BC("City");
    @lok(value="Hamlet")
    @lpl(value="Display name for small clan holdings")
    public static final lox rUc = rTZ.BC("Hamlet");

    protected lpt(String string) {
        super("Holdings." + string);
    }

    private lpt() {
        super("Holdings");
    }
}

