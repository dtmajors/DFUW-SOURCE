/*
 * Decompiled with CFR.
 */
public class lzr
extends lzq {
    private static final lzr tXU = new lzr();
    @lok(value="Attached to player $(CharacterName)")
    @lpl(value="Displayed when an attach to player command succeeds")
    public static final lox tXV = tXU.a("AttachSucceeded", lzr.Bk("CharacterName"));
    @lok(value="Could not attach to player $(CharacterName)")
    @lpl(value="Displayed when an attach to player command fails")
    public static final lox tXW = tXU.a("AttachFailed", lzr.Bk("CharacterName"));
    @lok(value="Detached from player $(CharacterName)")
    @lpl(value="Displayed when a detach from player command succeeds")
    public static final lox tXX = tXU.a("DetachSucceeded", lzr.Bk("CharacterName"));
    @lok(value="Could not detach from player $(CharacterName)")
    @lpl(value="Displayed when a detach from player command fails")
    public static final lox tXY = tXU.a("DetachFailed", lzr.Bk("CharacterName"));
    @lok(value="Detached from player $(CharacterName), because the player is no longer in the world")
    @lpl(value="Displayed when a GM is automatically detached from an attached player, because the player logged-out")
    public static final lox tXZ = tXU.a("DetachedDueToLogOut", lzr.Bk("CharacterName"));
    @lok(value="Already attaching to a player")
    @lpl(value="Displayed to an admin/GM when they attempt to attach to another player but an attach request is already being processed")
    public static final lox tYa = tXU.BC("AlreadyAttachingToPlayer");
    @lok(value="Already attached to a player")
    @lpl(value="Displayed to an admin/GM when they attempt to attach to another player but they are already attached to another player")
    public static final lox tYb = tXU.BC("AlreadyAttachedToPlayer");
    @lok(value="Detaching from a player - try again soon")
    @lpl(value="Displayed to an admin/GM when they attempt to attach to another player but a detach request is already being processed")
    public static final lox tYc = tXU.BC("DetachingFromPlayer");
    @lok(value="Another player is attached to you")
    @lpl(value="Displayed to an admin/GM when they attempt to attach to another player but another player is attached to the admin/GM")
    public static final lox tYd = tXU.BC("AnotherPlayerAttached");
    @lok(value="Not attached to anyone")
    @lpl(value="Displayed to an admin/GM when they attempt to detach from a player but they are not attached to a player")
    public static final lox tYe = tXU.BC("NotAttachedToPlayer");
    @lok(value="Attach to player pending - retry detach soon")
    @lpl(value="Displayed to an admin/GM when they attempt to detach from a player but an attach request is still being processed")
    public static final lox tYf = tXU.BC("AttachInProgress");
    @lok(value="Already detaching")
    @lpl(value="Displayed to an admin/GM when they attempt to detach from a player but the detach request is already being handled")
    public static final lox tYg = tXU.BC("AlreadyDetachingFromPlayer");

    protected lzr(String string) {
        super("Attach." + string);
    }

    private lzr() {
        super("Attach");
    }
}

