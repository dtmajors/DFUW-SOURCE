/*
 * Decompiled with CFR.
 */
public class lps
extends lpq {
    private static final lps rTW = new lps();
    @lok(value="No Protection")
    @lpl(value="Displayed as the description of no conquest protection")
    public static final lox rTX = rTW.a("NoProtection", lps.Bh("ProtectionLength"));
    @lok(value="$(ProtectionLength) Protection")
    @lpl(value="Displayed as the description of all conquest protections")
    public static final lox rTY = rTW.a("LengthProtection", lps.Bi("ProtectionLength"));

    protected lps(String string) {
        super("ConquestProtections." + string);
    }

    private lps() {
        super("ConquestProtections");
    }
}

