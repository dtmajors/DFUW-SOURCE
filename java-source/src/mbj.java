/*
 * Decompiled with CFR.
 */
public class mbj
extends mai {
    private static final mbj ujH = new mbj();
    @lok(value="An error occurred while processing your request!")
    @lpl(value="Displayed when a clan operation request fails because an unhandled, non-specific, error occurred while processing a clan operation request")
    public static final lox rXy = ujH.BC("GenericError");
    @lok(value="Request failed to complete successfully")
    @lpl(value="Displayed when a clan operation request fails and the reason is not to be displayed to the players")
    public static final lox ujI = ujH.BC("OperationUnsuccessful");
    @lok(value="You are not a member of the clan")
    @lpl(value="Displayed when a clan operation request fails because the requesting player is not, or is no longer, a member of the clan")
    public static final lox ujJ = ujH.BC("RequestingPlayerIsNotAClanMember");
    @lok(value="You do not have the correct permissions to perform the operation")
    @lpl(value="Displayed when a clan operation request fails because the requesting player does not have the appropriate permission to perform the requested operation")
    public static final lox ubr = ujH.BC("PermissionDenied");
    @lok(value="Player is not a member of the clan")
    @lpl(value="Displayed when a clan operation request fails because the target player is not, or is no longer, a member of the clan")
    public static final lox ujK = ujH.BC("TargetPlayerIsNotAClanMember");
    @lok(value="Player is already on the banned players list")
    @lpl(value="Displayed when a clan operation request fails because the target player is already banned from the clan")
    public static final lox ujL = ujH.BC("TargetPlayerAlreadyOnTheBannedPlayersList");
    @lok(value="Player is on the kill-on-sight list")
    @lpl(value="Displayed when a clan operation request fails because the target player is on the clan's kill-on-sight list")
    public static final lox ujM = ujH.BC("TargetPlayerIsOnTheKillOnSightList");
    @lok(value="Player is not on the banned players list")
    @lpl(value="Displayed when a clan operation request fails because the target player is not on the clan's banned players list")
    public static final lox ujN = ujH.BC("TargetPlayerIsNotOnTheBannedPlayersList");
    @lok(value="Leave clan operation is not in progress")
    @lpl(value="Displayed when a clan operation request fails because the target player is not in the process of leaving the clan")
    public static final lox ujO = ujH.BC("ClanMemberIsNotLeavingClan");
    @lok(value="You cannot request to leave the clan again yet... you must wait another $(WaitTime) before you can request to leave again")
    @lpl(value="Displayed when a clan operation request fails because the player has initaited, and cancelled, an identical request too recently to be allowed to do it again")
    public static final lox ujP = ujH.a("TooSoonToInitiateAnotherLeaveRequest", mbj.Bi("WaitTime"));
    @lok(value="Request completed successfully")
    @lpl(value="Displayed when a clan operation request is completed successfully")
    public static final lox uex = ujH.BC("OperationSuccessful");

    protected mbj(String string) {
        super("OperationResults." + string);
    }

    private mbj() {
        super("OperationResults");
    }
}

