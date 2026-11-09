/*
 * Decompiled with CFR.
 */
public class mbk
extends mai {
    private static final mbk ujQ = new mbk();
    @lok(value="You do not have permission to write to clan or clan alliance chat")
    @lpl(value="Displayed to a player when they write a message to the clan or clan alliance chat, but do not have permission to do so")
    public static final lox ujR = ujQ.BC("AccessToClanChatDenied");

    protected mbk(String string) {
        super("Permissions." + string);
    }

    private mbk() {
        super("Permissions");
    }
}

