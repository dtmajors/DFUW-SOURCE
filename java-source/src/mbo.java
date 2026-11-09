/*
 * Decompiled with CFR.
 */
public class mbo
extends mbn {
    private static final mbo ukB = new mbo();
    @lok(value="A error occurred while attempting to update the clan-to-player political stance!")
    @lpl(value="Indicates that the player political stance operation failed due to a non-specific unhandled error occurring")
    public static final lox rXy = ukB.BC("GenericError");
    @lok(value="You cannot add player '$(PlayerName)' to both the kill-on-sight and allowed to bind lists")
    @lpl(value="Indicates that the player political stance operation failed due to the request involving adding a player to both the kill-on-sight and allowed to bind lists, when they are mutually exclusive")
    public static final lox ukC = ukB.a("CannotAddPlayerToKillOnSightAndAllowedToBindLists", mbo.Bk("PlayerName"));
    @lok(value="You cannot update the clan-to-player political stance, as you are not a member of the clan")
    @lpl(value="Indicates that the player political stance operation failed because the requesting player is not a member of the clan")
    public static final lox ubl = ukB.BC("RequestingPlayerNotClanMember");
    @lok(value="You do not have permission to modify the clan's kill-on-sight list")
    @lpl(value="Indicates that the player political stance operation failed because the requesting player does not have permission to modify the clan's kill-on-sight list")
    public static final lox ukD = ukB.BC("PermissionDeniedKillOnSightList");
    @lok(value="You do not have permission to modify the clan's allowed to bind list")
    @lpl(value="Indicates that the player political stance operation failed because the requesting player does not have permission to modify the clan's allowed to bind list")
    public static final lox ukE = ukB.BC("PermissionDeniedAllowedToBindList");
    @lok(value="You do not have permission to modify the clan's banned players list")
    @lpl(value="Indicates that the player political stance operation failed because the requesting player does not have permission to modify the clan's banned players list")
    public static final lox ukF = ukB.BC("PermissionDeniedBannedPlayersList");
    @lok(value="Kill-on-sight list capacity exceeded, current list size $(ListSize) / $(MaxListSize), you must remove $(RequestOverflow) players from the list to complete this request")
    @lpl(value="Indicates that the player political stance operation failed because the request would exceed the maximum capacity of the kill-on-sight list")
    public static final lox uik = ukB.a("KillOnSightListFull", mbo.Bh("ListSize"), mbo.Bh("MaxListSize"), mbo.Bh("RequestOverflow"));
    @lok(value="Allowed to bind list capacity exceeded, current list size $(ListSize) / $(MaxListSize), you must remove $(RequestOverflow) players from the list to complete this request")
    @lpl(value="Indicates that the player political stance operation failed because the request would exceed the maximum capacity of the allowed to bind list")
    public static final lox ukG = ukB.a("AllowedToBindListFull", mbo.Bh("ListSize"), mbo.Bh("MaxListSize"), mbo.Bh("RequestOverflow"));
    @lok(value="Player '$(PlayerName)' is already on the clan's kill-on-sight list")
    @lpl(value="Indicates that the player political stance operation failed because a player to add to the kill-on-sight list is already on the list")
    public static final lox ukH = ukB.a("PlayerAlreadyOnKillOnSightList", mbo.Bk("PlayerName"));
    @lok(value="Player '$(PlayerName)' is already on the clan's allowed to bind list")
    @lpl(value="Indicates that the player political stance operation failed because a player to add to the allowed to bind list is already on the list")
    public static final lox ukI = ukB.a("PlayerAlreadyOnAllowedToBindList", mbo.Bk("PlayerName"));
    @lok(value="Player '$(PlayerName)' is already on the clan's banned players list")
    @lpl(value="Indicates that the player political stance operation failed because a player to add to the banned players list is already on the list")
    public static final lox ukJ = ukB.a("PlayerAlreadyOnBannedPlayersList", mbo.Bk("PlayerName"));
    @lok(value="Player '$(PlayerName)' is not on the clan's kill-on-sight list")
    @lpl(value="Indicates that the player political stance operation failed because a player to remove from the kill-on-sight list is not on the list")
    public static final lox ukK = ukB.a("PlayerIsNotOnKillOnSightList", mbo.Bk("PlayerName"));
    @lok(value="Player '$(PlayerName)' is not on the clan's allowed to bind list")
    @lpl(value="Indicates that the player political stance operation failed because a player to remove from the allowed to bind list is not on the list")
    public static final lox ukL = ukB.a("PlayerIsNotOnAllowedToBindList", mbo.Bk("PlayerName"));
    @lok(value="Player '$(PlayerName)' is not on the clan's banned players list")
    @lpl(value="Indicates that the player political stance operation failed because a player to remove from the banned players list is not on the list")
    public static final lox ukM = ukB.a("PlayerIsNotOnBannedPlayersList", mbo.Bk("PlayerName"));
    @lok(value="Player '$(PlayerName)' is on the clan's kill-on-sight list, and cannot be allowed to bind")
    @lpl(value="Indicates that the player political stance operation failed because a player to add to the allowed to bind list is currently on the kill-on-sight list and these lists are mutually exclusive")
    public static final lox ukN = ukB.a("PlayerOnKillOnSightListAndCannotBind", mbo.Bk("PlayerName"));
    @lok(value="Player '$(PlayerName)' is on the clan's allowed to bind list, and cannot be killed-on-sight")
    @lpl(value="Indicates that the player political stance operation failed because a player to add to the kill-on-sight list is currently on the allowed to bind list and these lists are mutually exclusive")
    public static final lox ukO = ukB.a("PlayerOnAllowedToBindListAndCannotBeKilledOnSight", mbo.Bk("PlayerName"));
    @lok(value="Player '$(PlayerName)' is a member of the clan and cannot be added to the kill-on-sight or allowed to bind lists")
    @lpl(value="Indicates that the player political stance operation failed because a player to add to the allowed to bind or kill-on-sight lists is a member of the clan")
    public static final lox ukP = ukB.a("PlayerIsClanMember", mbo.Bk("PlayerName"));
    @lok(value="An operation is pending for player '$(PlayerName)', it must complete before another is issued")
    @lpl(value="Indicates that the player political stance operation failed because a delayed operation is already pending for the indicated player and must complete before another can be scheduled")
    public static final lox ukQ = ukB.a("DelayedOperationPendingForPlayer", mbo.Bk("PlayerName"));
    @lok(value="Clan-to-player politics updated successfully")
    @lpl(value="Indicates that the player political stance operation was completed successfully")
    public static final lox ukR = ukB.BC("UpdatePerformedSuccessfully");

    protected mbo(String string) {
        super("UpdateOperationResults." + string);
    }

    private mbo() {
        super("UpdateOperationResults");
    }
}

