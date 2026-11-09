/*
 * Decompiled with CFR.
 */
public class lpy
extends lpx {
    private static final lpy rWu = new lpy();
    @lok(value="Access To All")
    @lpl(value="Localised name of the 'access to all' clan city bank access policy")
    public static final lox rWv = rWu.BC("AccessToAll");
    @lok(value="Access To All But Enemies")
    @lpl(value="Localised name of the 'access to all but enemies' clan city bank access policy")
    public static final lox rWw = rWu.BC("AccessToAllButEnemies");
    @lok(value="Access To Allies")
    @lpl(value="Localised name of the 'access to allies' clan city bank access policy")
    public static final lox rWx = rWu.BC("AccessToAllies");
    @lok(value="Access Only To Clan")
    @lpl(value="Localised name of the 'access only to clan' clan city bank access policy")
    public static final lox rWy = rWu.BC("AccessOnlyToClan");

    protected lpy(String string) {
        super("BankAccess." + string);
    }

    private lpy() {
        super("BankAccess");
    }
}

