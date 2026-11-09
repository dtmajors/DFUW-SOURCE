/*
 * Decompiled with CFR.
 */
public class lqk
extends lqd {
    private static final lqk sdA = new lqk();
    @lok(value="The harvester was started.")
    @lol(value="Developer command")
    public static final lox sdB = sdA.BC("HarvesterStarted");
    @lok(value="The resource were verified succesfully.")
    @lol(value="Developer command")
    public static final lox sdC = sdA.BC("ResourcesVerified");
    @lok(value="The resources were not verified succesfully.")
    @lol(value="Developer command")
    public static final lox sdD = sdA.BC("ResourcesNotVerified");

    protected lqk(String string) {
        super("Xml." + string);
    }

    private lqk() {
        super("Xml");
    }
}

