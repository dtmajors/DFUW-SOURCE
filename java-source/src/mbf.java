/*
 * Decompiled with CFR.
 */
public class mbf
extends mbe {
    private static final mbf uiO = new mbf();
    @lok(value="An error occurred while processing your application for membership in the clan!")
    @lpl(value="Displayed when a non-specific error occurrs while attempting to process a player's application to join a clan")
    public static final lox rXy = uiO.BC("GenericError");
    @lok(value="A membership application request is currently being processed, please wait!")
    @lpl(value="Displayed when a membership application is already being processed for the player")
    public static final lox uiP = uiO.BC("ClanMembershipApplicationAlreadyBeingProcessed");
    @lok(value="You cannot apply to join another clan yet... you must wait another $(WaitTime) before issuing another membership application request!")
    @lpl(value="Displayed when the player issues a clan membership application too soon after successfully issuing an application to another clan")
    public static final lox uiQ = uiO.a("TooSoonToSendAnotherClanMembershipApplication", mbf.Bi("WaitTime"));
    @lok(value="You are already a member of a clan, you must leave your clan before applying for membership in another!")
    @lpl(value="Displayed when a player issues a membership application when they are already a member of a clan")
    public static final lox uiR = uiO.BC("PlayerAlreadyAClanMember");
    @lok(value="You have already applied to join this clan!")
    @lpl(value="Displayed when a player attempts to issue a membership application to a clan that they have already issed an application request to")
    public static final lox uiS = uiO.BC("PlayerAlreadyAppliedToClan");
    @lok(value="You are banned from applying to join this clan!")
    @lpl(value="Displayed when a player attempts to issue a membership application to a clan from which they are currently banned")
    public static final lox uiT = uiO.BC("PlayerIsBannedFromClan");
    @lok(value="You cannot join this clan while you are on their kill-on-sight list!")
    @lpl(value="Displayed when a player attempts to issue a membership application to a clan that they are on the kill-on-sight list of")
    public static final lox uiU = uiO.BC("PlayerIsInKillOnSightList");
    @lok(value="The clan is not accepting new members at this time!")
    @lpl(value="Displayed when a player attempts to issue a membership application to a clan that is not currently accepting new members")
    public static final lox uiV = uiO.BC("ClanNotAcceptingNewMembers");
    @lok(value="The clan is not accepting new members from your race!")
    @lpl(value="Displayed when a player attempts to issue a membership application to a clan that is not currently accepting new members of the player's race")
    public static final lox uiW = uiO.BC("ClanNotAcceptingMembersFromPlayersRace");
    @lok(value="Application for membership received... it is awaiting processing by a recruiter from the clan!")
    @lpl(value="Displayed when a player issues a clan membership application to a clan and it is successfully recieved by the clan")
    public static final lox uiX = uiO.BC("ApplicationReceived");
    @lok(value="The clan is full and cannot accept any new application requests at this time")
    @lpl(value="Displayed when a player attempts to issue a membership application to a clan that already has the maximum number of members")
    public static final lox uiM = uiO.BC("ClanFull");

    protected mbf(String string) {
        super("ApplicationResults." + string);
    }

    private mbf() {
        super("ApplicationResults");
    }
}

