/*
 * Decompiled with CFR.
 */
public class mbh
extends mbe {
    private static final mbh ujp = new mbh();
    @lok(value="An error occurred while attempting to change leaders!")
    @lpl(value="Displayed when an unhandled, non-specific, error occurs while attempting to change the leader of the clan")
    public static final lox ujq = ujp.BC("ChangeLeaderGenericError");
    @lok(value="You do not have permission to change the clan leader!")
    @lpl(value="Displayed when the clan member that is attempting to change the leader of the clan does not have the required permission to do so")
    public static final lox ujr = ujp.BC("ChangeLeaderPermissionDenied");
    @lok(value="You cannot change the clan leader, since you are not a clan member!")
    @lpl(value="Displayed when the clan member that is attempting to change the leader fo the clan is not themselves a member of the clan")
    public static final lox ujs = ujp.BC("ChangeLeaderRequestingPlayerNotClanMember");
    @lok(value="Cannot change leader, indicated new leader is not a clan member!")
    @lpl(value="Displayed when the player nominated to become the new clan leader is not a member of the clan")
    public static final lox ujt = ujp.BC("ChangeLeaderNewLeaderNotClanMember");
    @lok(value="Cannot change leader, indicated new leader is a trial account member!")
    @lpl(value="Displayed when the player nominated to become the new clan leader is playing using a trial account")
    public static final lox uju = ujp.BC("ChangeLeaderNewLeaderIsTrialAccountMember");
    @lok(value="Too soon to change clan leader again!")
    @lpl(value="Displayed when a clan member attempts to change the clan leader, but the leader was changed too recently to do so again at this time")
    public static final lox ujv = ujp.BC("ChangeLeaderTooSoonToChangeLeaderAgain");
    @lok(value="Clan leader successfully changed")
    @lpl(value="Displayed whent the request to change the leader of the clan is successfully completed")
    public static final lox ujw = ujp.BC("ChangeLeaderOperationSuccessful");
    @lok(value="One, or more, applicant updates failed to be completed successfully")
    @lpl(value="Displayed when a clan applicants update request result indicates that one, or more, of the applicant management operations failed to be completed")
    public static final lox ujx = ujp.BC("ClanApplicantsUpdateFailed");
    @lok(value="Applicants successfully updated!")
    @lpl(value="Displayed when a clan applicants update request is completed successfully")
    public static final lox ujy = ujp.BC("ClanApplicantsUpdatedSuccessfully");

    protected mbh(String string) {
        super("OperationResults." + string);
    }

    private mbh() {
        super("OperationResults");
    }
}

