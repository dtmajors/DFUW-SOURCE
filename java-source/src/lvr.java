/*
 * Decompiled with CFR.
 */
public class lvr
extends lvn {
    private static final lvr sZz = new lvr();
    @lok(value="You are attempting to send too many messages. Message has been delayed.")
    @lpl(value="Message displayed in chat when player tries to send too many chat messages in a short time.")
    public static final lox sZA = sZz.BC("MessageDelay");
    @lok(value="You are attempting to send too many commands. Command has been delayed.")
    @lpl(value="Message displayed in chat when player tries to send too many chat commands in a short time.")
    public static final lox sZB = sZz.BC("CommandDelay");
    @lok(value="System")
    @lpl(value="String appended to the start of all messages received from the system")
    public static final lox sZC = sZz.BC("SystemMessagePrefix");

    protected lvr(String string) {
        super("Chat." + string);
    }

    private lvr() {
        super("Chat");
    }
}

