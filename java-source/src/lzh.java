/*
 * Decompiled with CFR.
 */
public class lzh
extends lpa {
    private static final lzh Instance = new lzh();
    @lok(value="Welcome to Darkfall")
    @lpl(value="Displayed to players when they spawn into the world")
    public static final lox WelcomeToDarkfall = Instance.BC("WelcomeToDarkfall");

    protected lzh(String string) {
        super("Notifications." + string);
    }

    private lzh() {
        super("Notifications");
    }
}

