/*
 * Decompiled with CFR.
 */
public class lvt
extends lvr {
    private static final lvt sZW = new lvt();
    @lok(value="Whisper")
    @lpl(value="Chat command name for the whisper command. Used throughout the chat system.")
    public static final lox sZX = sZW.BC("Whisper");
    @lok(value="Reply")
    @lpl(value="Chat command name for the reply command. Used throughout the chat system.")
    public static final lox sZY = sZW.BC("Reply");
    @lok(value="Invite")
    @lpl(value="Chat command name for the invite command. Used throughout the chat system.")
    public static final lox sZZ = sZW.BC("Invite");
    @lok(value="Party")
    @lpl(value="Chat command name for the party command. Used throughout the chat system.")
    public static final lox taa = sZW.BC("Party");
    @lok(value="Clan")
    @lpl(value="Chat command name for the clan command. Used throughout the chat system.")
    public static final lox tab = sZW.BC("Clan");
    @lok(value="Kick")
    @lpl(value="Chat command name for the kick command. Used throughout the chat system.")
    public static final lox tac = sZW.BC("Kick");
    @lok(value="Add")
    @lpl(value="Chat command name for the add command. Used throughout the chat system.")
    public static final lox tad = sZW.BC("Add");
    @lok(value="Block")
    @lpl(value="Chat command name for the block command. Used throughout the chat system.")
    public static final lox tae = sZW.BC("Block");
    @lok(value="Promote")
    @lpl(value="Chat command name for the promote command. Used throughout the chat system.")
    public static final lox taf = sZW.BC("Promote");
    @lok(value="Invite")
    @lpl(value="Chat command name for the claninvite command. Used throughout the chat system.")
    public static final lox tag = sZW.BC("ClanInvite");
    @lok(value="Kick")
    @lpl(value="Chat command name for the clankick command. Used throughout the chat system.")
    public static final lox tah = sZW.BC("ClanKick");
    @lok(value="Help")
    @lpl(value="Chat command name for the gmhelp command. Used throughout the chat system.")
    public static final lox tai = sZW.BC("GMHelp");
    @lok(value="Report")
    @lpl(value="Chat command name for the gmreport command. Used throughout the chat system.")
    public static final lox taj = sZW.BC("GMReport");
    @lok(value="Dice Roll")
    @lpl(value="Chat command name for the roll command. Used throughout the chat system.")
    public static final lox tak = sZW.BC("Roll");
    @lok(value="Stuck")
    @lpl(value="Chat command name for the unstuck command. Used throughout the chat system.")
    public static final lox tal = sZW.BC("Stuck");
    @lok(value="Ban player")
    @lpl(value="Context menu entry to bring up the command window filling also the default information for the ban command. Visible only to a gm/adm.")
    public static final lox tam = sZW.BC("BanPlayer");
    @lok(value="Kick player")
    @lpl(value="Context menu entry to bring up the command window filling also the default information for the kick command. Visible only to a gm/adm.")
    public static final lox tan = sZW.BC("KickPlayer");
    @lok(value="Attach to player")
    @lpl(value="Context menu entry to bring up the command window filling also the default information for the attach command. Visible only to a gm/adm.")
    public static final lox tao = sZW.BC("AttachToPlayer");
    @lok(value="Teleport to player")
    @lpl(value="Context menu entry to bring up the command window filling also the default information for the teleport to player command. Visible only to a gm/adm.")
    public static final lox tap = sZW.BC("TeleportToPlayer");
    @lok(value="Quick teleport to player")
    @lpl(value="Context menu entry to bring up the command window filling also the default information for the quick teleport to player command. Visible only to a gm/adm.")
    public static final lox taq = sZW.BC("QuickTeleportToPlayer");

    protected lvt(String string) {
        super("Commands." + string);
    }

    private lvt() {
        super("Commands");
    }
}

