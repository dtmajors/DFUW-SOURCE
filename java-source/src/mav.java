/*
 * Decompiled with CFR.
 */
public class mav
extends mai {
    private static final mav ufh = new mav();
    @lok(value="An error occurred while processing the clan create request!")
    @lpl(value="Displayed when an unhandled, non-specific, error is encountered while processing a create clan request")
    public static final lox rXy = ufh.BC("GenericError");
    @lok(value="A clan create request is already being processed... Please wait...")
    @lpl(value="Displayed when a request to create a clan is issued by a player that a request is already being processed for")
    public static final lox ufi = ufh.BC("CreateRequestAlreadyBeingProcessed");
    @lok(value="You cannot create a clan while playing using a trial account!")
    @lpl(value="Displayed when a request to create a new clan is received from a trial account player")
    public static final lox ufj = ufh.BC("TrialAccountPlayersCannotCreateClans");
    @lok(value="You cannot create a clan while under noobie protection!")
    @lpl(value="Displayed when a request to create a new clan is received from a player that is currently under noobie protection")
    public static final lox ufk = ufh.BC("NoobieProtectedPlayerCannotCreateClans");
    @lok(value="You cannot create a new clan while still being a member of the clan '$(ClanName)'!")
    @lpl(value="Displayed when a request to create a new clan is received from a player that is already a member of a clan")
    public static final lox ufl = ufh.a("PlayerIsAlreadyAClanMember", mav.Bk("ClanName"));
    @lok(value="The clan name you entered is too short!... Minimum length of a clan name is $(MinClanNameLength) character(s).")
    @lpl(value="Displayed when a request to create a new clan is received and the name of the clan to create does not meet the minimum character length for a clan name")
    public static final lox ufm = ufh.a("ClanNameTooShort", mav.Bh("MinClanNameLength"));
    @lok(value="The clan name you entered is too long!... Maximum length of a clan name is $(MaxClanNameLength) characters.")
    @lpl(value="Displayed when a request to create a new clan is received and the name of the clan to create exceeds the maximum character length for a clan name")
    public static final lox ufn = ufh.a("ClanNameTooLong", mav.Bh("MaxClanNameLength"));
    @lok(value="Clan names can contain only letters, numbers, spaces and under-scores!")
    @lpl(value="Displayed when a request to create a new clan is received and teh name contains characters that are not allowed")
    public static final lox ufo = ufh.BC("ClanNameInvalid");
    @lok(value="The clan motto you entered is too short!... Minimum length of a clan motto is $(MinClanMottoLength) character(s).")
    @lpl(value="Displayed when a request to create a new clan is received and the motto of the clan to create does not meet the minimum character length for a clan motto")
    public static final lox ubs = ufh.a("ClanMottoTooShort", mav.Bh("MinClanMottoLength"));
    @lok(value="The clan motto you entered is too long!... Maximum length of a clan motto is $(MaxClanMottoLength) characters.")
    @lpl(value="Displayed when a request to create a new clan is received and the motto of the clan to create exceeds the maximum character length for a clan motto")
    public static final lox ubt = ufh.a("ClanMottoTooLong", mav.Bh("MaxClanMottoLength"));
    @lok(value="The clan charter you entered is too short!... Minimum length of a clan charter is $(MinClanCharterLength) character(s).")
    @lpl(value="Displayed when a request to create a new clan is received and the charter of the clan to create does not meet the minimum character length for a clan charter")
    public static final lox ubu = ufh.a("ClanCharterTooShort", mav.Bh("MinClanCharterLength"));
    @lok(value="The clan charter you entered is too long!... Maximum length of a clan charter is $(MaxClanCharterLength) characters.")
    @lpl(value="Displayed when a request to create a new clan is received and the charter of the clan to create exceeds the maximum character length for a clan charter")
    public static final lox ubv = ufh.a("ClanCharterTooLong", mav.Bh("MaxClanCharterLength"));
    @lok(value="The clan you are trying to create must accept at least one race as members.")
    @lpl(value="Displayed when a request to create a new clan is received and no races are indicated as accepted members (Should be blocked by the GUI!)")
    public static final lox ubw = ufh.BC("ClanMustAcceptAtLeastOneRaceAsMembers");
    @lok(value="The clan you are trying to create must accept your race as members.")
    @lpl(value="Displayed when a request to create a new clan is received and the race of the player trying to create the clan is not indicated as accepted race (Should be blocked by the GUI!)")
    public static final lox ubx = ufh.BC("ClanMustAcceptFoundersRaceAsMembers");
    @lok(value="The clan name you entered, '$(ClanName)', is already in use!")
    @lpl(value="Displayed when a request to create a new clan is received and the name of the clan to create is not unique")
    public static final lox ufp = ufh.a("ClanNameAlreadyInUse", mav.Bk("ClanName"));
    @lok(value="You do not have enough $(CostResource.Name$(ClanCreateCost.Plurality)) in your back-pack to create a new clan!... Creating a new clan costs $(ClanCreateCost) $(CostResource.Name$(ClanCreateCost.Plurality)).")
    @lpl(value="Displayed when a request to create a new clan is received and the player issuing the request does not have enough gold in their back-pack to afford the cost of creating a new clan")
    public static final lox uev = ufh.a("NotEnoughGold", mav.Bh("ClanCreateCost"), mav.Bl("CostResource"));
    @lok(value="You cannot create a new clan at this time!... Players are limited to creating one clan every $(ClanCreateWaitTime), you must wait another $(PlayerWaitTime) before you can create another clan.")
    @lpl(value="Displayed when a request to create a new clan is recieved from a player that successfully created a clan too recently to create another at this time")
    public static final lox ufq = ufh.a("TooSoonToCreateAnotherClan", mav.Bi("ClanCreateWaitTime"), mav.Bi("PlayerWaitTime"));
    @lok(value="Clan, '$(ClanName)', created successfully!... You are now the leader of the clan!")
    @lpl(value="Displayed when a request to create a new clan is completed successfully")
    public static final lox ufr = ufh.a("ClanCreated", mav.Bk("ClanName"));
    @lok(value="The entered clan name contains black-listed words!!!")
    @lpl(value="Displayed when a request to create a new clan contains a clan name with blacklisted content")
    public static final lox ufs = ufh.BC("NameBlacklisted");
    @lok(value="The entered clan motto contains black-listed words!!!")
    @lpl(value="Displayed when a request to create a new clan contains a clan motto with blacklisted content")
    public static final lox ubD = ufh.BC("MottoBlacklisted");
    @lok(value="The entered clan charter contains black-listed words!!!")
    @lpl(value="Displayed when a request to create a new clan contains a clan charter with blacklisted content")
    public static final lox ubE = ufh.BC("CharterBlacklisted");
    @lok(value="Name cannot start or end with a space")
    @lpl(value="Displayed when a request to create a new clan contains a clan name that starts or ends with white-space")
    public static final lox uft = ufh.BC("NameStartsEndsWithWhitespace");
    @lok(value="Name cannot contain multiple consecutive spaces")
    @lpl(value="Displayed when a request to create a new clan contains a clan name that contains multiple consecutive spaces")
    public static final lox ufu = ufh.BC("NameContainsMultipleConsecutiveSpaces");

    protected mav(String string) {
        super("CreateResults." + string);
    }

    private mav() {
        super("CreateResults");
    }
}

