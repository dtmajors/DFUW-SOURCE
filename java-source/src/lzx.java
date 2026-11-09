/*
 * Decompiled with CFR.
 */
public class lzx
extends lzq {
    private static final lzx tYY = new lzx();
    @lok(value="Could not find groud level for indicated position")
    @lpl(value="Displayed to an admin/GM when they request to be teleported to a position, but no ground could be found at the location to teleport them to")
    public static final lox tYZ = tYY.BC("NoGroundLevelFound");
    @lok(value="Target position is outside of the world bounds, cannot complete request")
    @lpl(value="Displayed to an admin/GM when they request to be teleported to a position, but the position is outside of the world bounds")
    public static final lox tZa = tYY.BC("PositionOutsideWorldBounds");
    @lok(value="Teleport request received and handled by $(PlayerName), who has responded indicating success!")
    @lpl(value="Displayed to an admin/GM when their command to teleport another player has been processed")
    public static final lox tZb = tYY.a("TeleportPlayerProcessed", lzx.Bk("PlayerName"));
    @lok(value="BE AWARE: Quick teleporting a regular player will result in a 'potential teleport' report being sent to all online GMs!")
    @lpl(value="Displayed to an admin/GM when they quick-teleport another player")
    public static final lox tZc = tYY.BC("QuickTeleportPlayerWarning");
    @lok(value="You are being teleported to a new location by $(AdminCharacterName)")
    @lpl(value="Displayed to a player when they are teleported by an admin/GM")
    public static final lox tZd = tYY.a("PlayerNotification", lzx.Bk("AdminCharacterName"));
    @lok(value="Player $(PlayerName) is offline and cannot be teleported")
    @lpl(value="Displayed to an admin/GM when they attempt to teleport an offline player")
    public static final lox tZe = tYY.a("TargetPlayerIsOffline", lzx.Bk("PlayerName"));
    @lok(value="Teleport instructions have already been sent to $(PlayerName), you must wait for the previous request to be completed before issuing another")
    @lpl(value="Displayed to an admin/GM when they send a request to teleport a player, but a previous request to teleport the player is being processed")
    public static final lox tZf = tYY.a("RequestAlreadyBeingProcessed", lzx.Bk("PlayerName"));
    @lok(value="No position supplied to teleport the player to")
    @lpl(value="Displayed to an admin/GM when they request the teleport of a player, but no target coordinates were received")
    public static final lox tZg = tYY.BC("NoPositionSupplied");
    @lok(value="No player name supplied to teleport to")
    @lpl(value="Displayed to an admin/GM when they request a teleport to a specific player, but no target player name was supplied")
    public static final lox tZh = tYY.BC("NoPlayerNameSupplied");
    @lok(value="No holding ID supplied to teleport to")
    @lpl(value="Displayed to an admin/GM when they request to be teleported to a specific holding, but no holding ID was supplied")
    public static final lox tZi = tYY.BC("NoHoldingIDSupplied");
    @lok(value="Player $(PlayerName) has a higher access level than you, you cannot teleport players with higher access level than you")
    @lpl(value="Displayed to an admin/GM when they request the teleport of a player, but the player has a higher access level")
    public static final lox tZj = tYY.a("TargetPlayerHasHigherAccessLevel", lzx.Bk("PlayerName"));
    @lok(value="Player $(PlayerName) is currently controlling a GM monster, and cannot be teleported")
    @lpl(value="Displayed to an admin/GM when they request the teleport of a player, but the player is controlling a monster")
    public static final lox tZk = tYY.a("TargetPlayerIsControllingMonster", lzx.Bk("PlayerName"));

    protected lzx(String string) {
        super("Teleport." + string);
    }

    private lzx() {
        super("Teleport");
    }
}

