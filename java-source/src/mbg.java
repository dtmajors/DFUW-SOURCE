/*
 * Decompiled with CFR.
 */
public class mbg
extends mbe {
    private static final mbg uiY = new mbg();
    @lok(value="You are not a member of the clan!")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but they are no longer a member of the clan")
    public static final lox uiZ = uiY.BC("SourcePlayerNotClanMember");
    @lok(value="$(PlayerName) ignored your invitation... all future requests will also be ignored")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the player added them to their ignore list")
    public static final lox uja = uiY.a("SourcePlayerAddedTargetPlayerToIgnoreList", mbg.Bk("PlayerName"));
    @lok(value="All your requests are being ignored by $(PlayerName)")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but they are on the player's ignore list")
    public static final lox ujb = uiY.a("SourcePlayerInTargetPlayersIgnoreList", mbg.Bk("PlayerName"));
    @lok(value="You cannot invite yourself into your clan")
    @lpl(value="Displayed to a player when they attempt to invite themselves into their clan")
    public static final lox ujc = uiY.BC("SourcePlayerIsTargetPlayer");
    @lok(value="You do not have permission to invite players to join the clan")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but they do not have the required permission to do so")
    public static final lox ubr = uiY.BC("PermissionDenied");
    @lok(value="The player already has a pending invitation")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the player already has an invitation pending accept or reject")
    public static final lox ujd = uiY.BC("InvitationAlreadyPending");
    @lok(value="$(PlayerName) is in the process of responding to another invitation to join the clan")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the player is already processing another request to join the clan")
    public static final lox uje = uiY.a("InvitationBeingProcessed", mbg.Bk("PlayerName"));
    @lok(value="$(PlayerName) is already a member of a clan")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the player is already a member of another clan")
    public static final lox ujf = uiY.a("TargetPlayerIsAlreadyAClanMember", mbg.Bk("PlayerName"));
    @lok(value="$(PlayerName) is banned from joining your clan, you cannot invite a banned player")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the player is on the clan's ban list")
    public static final lox ujg = uiY.a("TargetPlayerIsBanned", mbg.Bk("PlayerName"));
    @lok(value="$(PlayerName) is on your clan's kill-on-sight list, you cannot invite a kill-on-sight player")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the player is on the clan's kill-on-sight list")
    public static final lox ujh = uiY.a("TargetPlayerIsKOS", mbg.Bk("PlayerName"));
    @lok(value="$(PlayerName) is not logged-in, you cannot invite players into the clan when they are offline")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the player is not online")
    public static final lox uji = uiY.a("TargetPlayerNotLoggedIn", mbg.Bk("PlayerName"));
    @lok(value="$(PlayerName) declined your invitation to join your clan")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the player declines the invitation")
    public static final lox ujj = uiY.a("TargetPlayerDeclinedInvitation", mbg.Bk("PlayerName"));
    @lok(value="$(PlayerName) did not respond to your invitation to join your clan")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the player did not repsond to the invitation")
    public static final lox ujk = uiY.a("TargetPlayerDidNotRespond", mbg.Bk("PlayerName"));
    @lok(value="$(PlayerName) has already been invited to join your clan")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the player has already been invited")
    public static final lox ujl = uiY.a("TargetPlayerAlreadyInvited", mbg.Bk("PlayerName"));
    @lok(value="$(PlayerName) accepted your invitation and is now a proud member of your clan")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan and the player accepts the invitation")
    public static final lox ujm = uiY.a("TargetPlayerAcceptedInvitation", mbg.Bk("PlayerName"));
    @lok(value="You cannot accept the invitation as you are already a member of another clan")
    @lpl(value="Displayed to a player when they are invited to join a clan, and accept the invitation, but are already a member of another clan")
    public static final lox ujn = uiY.BC("TargetPlayerCannotAcceptInvitationDueToExistingClanMembership");
    @lok(value="Your clan is not accepting new members at this time")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the clan is not accepting new members")
    public static final lox uiV = uiY.BC("ClanNotAcceptingNewMembers");
    @lok(value="Your clan is not accepting new members from the race of $(PlayerName)")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the clan is not accepting new members from the invited player's race")
    public static final lox ujo = uiY.a("ClanNotAcceptingTargetPlayersRace", mbg.Bk("PlayerName"));
    @lok(value="An error occurred while trying to process your clan invitation, please wait a moment and try again")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but a non-specific error occurs")
    public static final lox rXy = uiY.BC("GenericError");
    @lok(value="Your clan already has the maximum number of members, or has too many pending application requests, to invite any more players to become members at this time")
    @lpl(value="Displayed to a player when they attempt to invite another player into their clan, but the clan has reached the maximum number of allowed members")
    public static final lox uiM = uiY.BC("ClanFull");

    protected mbg(String string) {
        super("InvitationResults." + string);
    }

    private mbg() {
        super("InvitationResults");
    }
}

