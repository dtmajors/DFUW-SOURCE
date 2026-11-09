/*
 * Decompiled with CFR.
 */
public class lxs
extends lvn {
    private static final lxs txr = new lxs();
    @lok(value="ADD FRIEND")
    @lpl(value="Context menu option to add someone as a friend")
    public static final lox txs = txr.BC("AddFriend");
    @lok(value="BLOCK")
    @lpl(value="Context menu option to block someone and ignore or chat messages and confirmation requests from him.")
    public static final lox tae = txr.BC("Block");
    @lok(value="WHISPER")
    @lpl(value="Context menu option to send a whisper chat message to someone.")
    public static final lox sZX = txr.BC("Whisper");
    @lok(value="KICK")
    @lpl(value="Context menu option to kick someone from your party")
    public static final lox tac = txr.BC("Kick");
    @lok(value="PROMOTE")
    @lpl(value="Context menu option to promote someone to a leader in your party.")
    public static final lox taf = txr.BC("Promote");
    @lok(value="REMOVE FROM CLAN")
    @lpl(value="Context menu option to remove someone from you clan.")
    public static final lox txt = txr.BC("RemoveFromClan");
    @lok(value="INVITE TO CLAN")
    @lpl(value="Context menu option to invite someone in your clan.")
    public static final lox tgM = txr.BC("InviteToClan");
    @lok(value="LEAVE FROM PARTY")
    @lpl(value="Context menu option to leave from the party.")
    public static final lox txu = txr.BC("Leave");
    @lok(value="TOGGLE MODIFIERS")
    @lpl(value="Context menu option to toggle party modifiers.")
    public static final lox txv = txr.BC("ToggleModifiers");
    @lok(value="TOGGLE ROUND ROBIN")
    @lpl(value="Context menu option to toggle round robin system.")
    public static final lox txw = txr.BC("ToggleRoundRobin");

    protected lxs(String string) {
        super("Party." + string);
    }

    private lxs() {
        super("Party");
    }
}

