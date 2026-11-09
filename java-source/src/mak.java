/*
 * Decompiled with CFR.
 */
public class mak
extends mai {
    private static final mak ubo = new mak();
    @lok(value="An error occurred while processing the clan configuration update request!")
    @lpl(value="Displayed when an unhandled, non-specific, error is encountered while processing a clan configuration update request")
    public static final lox rXy = ubo.BC("GenericError");
    @lok(value="A clan configuration update request is already being processed... Please wait...")
    @lpl(value="Displayed when a request to update a clan's configuration is issued by a player that a request is already being processed for")
    public static final lox ubp = ubo.BC("ConfigurationUpdateRequestAlreadyBeingProcessed");
    @lok(value="You cannot change the clan configuration as you are not a member of the clan!")
    @lpl(value="Displayed when a request to update a clan's configuration is received from a player that is not, or is no longer, a member of the clan")
    public static final lox ubq = ubo.BC("PlayerIsNotAClanMember");
    @lok(value="You do not have the required permission to perform this update operation on the clan's configuration!")
    @lpl(value="Displayed when a request to update a clan's configuration is received from a player that does not have the required permission to perform the update operation")
    public static final lox ubr = ubo.BC("PermissionDenied");
    @lok(value="The clan motto you entered is too short!... Minimum length of a clan motto is $(MinClanMottoLength) character(s).")
    @lpl(value="Displayed when a request to update a clan's configuration is received and the motto does not meet the minimum character length for a clan motto")
    public static final lox ubs = ubo.a("ClanMottoTooShort", mak.Bh("MinClanMottoLength"));
    @lok(value="The clan motto you entered is too long!... Maximum length of a clan motto is $(MaxClanMottoLength) characters.")
    @lpl(value="Displayed when a request to update a clan's configuration is received and the motto exceeds the maximum character length for a clan motto")
    public static final lox ubt = ubo.a("ClanMottoTooLong", mak.Bh("MaxClanMottoLength"));
    @lok(value="The clan charter you entered is too short!... Minimum length of a clan charter is $(MinClanCharterLength) character(s).")
    @lpl(value="Displayed when a request to update a clan's configuration is received and the charter does not meet the minimum character length for a clan charter")
    public static final lox ubu = ubo.a("ClanCharterTooShort", mak.Bh("MinClanCharterLength"));
    @lok(value="The clan charter you entered is too long!... Maximum length of a clan charter is $(MaxClanCharterLength) characters.")
    @lpl(value="Displayed when a request to update a clan's configuration is received and the charter exceeds the maximum character length for a clan charter")
    public static final lox ubv = ubo.a("ClanCharterTooLong", mak.Bh("MaxClanCharterLength"));
    @lok(value="Your clan must accept at least one race as members.")
    @lpl(value="Displayed when a request to update a clan's configuration is received and no races are indicated as accepted members (Should be blocked by the GUI!)")
    public static final lox ubw = ubo.BC("ClanMustAcceptAtLeastOneRaceAsMembers");
    @lok(value="Your clan must accept your race as members.")
    @lpl(value="Displayed when a request to update a clan's configuration is received and the race of the player trying to update the clan's configuration is not indicated as accepted race (Should be blocked by the GUI!)")
    public static final lox ubx = ubo.BC("ClanMustAcceptFoundersRaceAsMembers");
    @lok(value="The player selected to become the new leader of the clan is not a clan member")
    @lpl(value="Displayed when a request to udpate a clan's configuration is recieved and the indicated player to promote to clan leader is not, or is no longer, a member of the clan")
    public static final lox uby = ubo.BC("NewLeaderNotClanMember");
    @lok(value="The selected clan member cannot be promoted to leader as they are using a trial account")
    @lpl(value="Displayed when a request to update a clan's configuration is received and the indicated player to promote to clan leader is using a trial account, and trial account players are not allowed to lead clans")
    public static final lox ubz = ubo.BC("NewLeaderIsTrialAccountPlayer");
    @lok(value="You cannot change leaders again so soon, you must wait at least $(WaitTime)")
    @lpl(value="Displayed when a request to update a clan's configuration is received that includes a request to change the leader of the clan, but the leader of the clan was changed too recently to allow it to be chagne again now")
    public static final lox ubA = ubo.a("TooSoonToChangeLeaders", mak.Bi("WaitTime"));
    @lok(value="Clan configuration updated successfully.")
    @lpl(value="Displayed when a request to update a clan's configuration is completed successfully, but no changes were required")
    public static final lox ubB = ubo.BC("ConfigurationUnchanged");
    @lok(value="Clan configuration updated successfully.")
    @lpl(value="Displayed when a request to update a clan's configuration is completed successfully")
    public static final lox ubC = ubo.BC("ConfigurationUpdated");
    @lok(value="The entered clan motto contains black-listed words!!!")
    @lpl(value="Displayed when a request to create a new clan contains a clan motto with blacklisted content")
    public static final lox ubD = ubo.BC("MottoBlacklisted");
    @lok(value="The entered clan charter contains black-listed words!!!")
    @lpl(value="Displayed when a request to create a new clan contains a clan charter with blacklisted content")
    public static final lox ubE = ubo.BC("CharterBlacklisted");

    protected mak(String string) {
        super("ConfigurationUpdateResults." + string);
    }

    private mak() {
        super("ConfigurationUpdateResults");
    }
}

