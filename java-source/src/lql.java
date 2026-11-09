/*
 * Decompiled with CFR.
 */
public class lql
extends lpa {
    private static final lql sdE = new lql();
    @lok(value="Unknown")
    @lpl(value="Indicates that the danger-level of the area is currently unknown")
    public static final lox rUa = sdE.BC("Unknown");
    @lok(value="Safe")
    @lpl(value="Indicates that the area is considered safe")
    public static final lox sdF = sdE.BC("Safe");
    @lok(value="Cautious")
    @lpl(value="Indicates that the area is considered cautious")
    public static final lox sdG = sdE.BC("Cautious");
    @lok(value="Risky")
    @lpl(value="Indicates that the area is considered risky")
    public static final lox sdH = sdE.BC("Risky");
    @lok(value="Dangerous")
    @lpl(value="Indicates that the area is considered dangerous")
    public static final lox sdI = sdE.BC("Dangerous");
    @lok(value="Darkfall")
    @lpl(value="Indicates that the area is considered to be the most dangerous in the world")
    public static final lox sdJ = sdE.BC("Darkfall");
    @lok(value="Protected")
    @lpl(value="Indicates that the area is considered protected")
    public static final lox sdK = sdE.BC("Protected");

    protected lql(String string) {
        super("DangerLevels." + string);
    }

    private lql() {
        super("DangerLevels");
    }
}

