/*
 * Decompiled with CFR.
 */
public class lwg
extends lvx {
    private static final lwg tdJ = new lwg();
    @lok(value="Clan Member Overview")
    @lpl(value="Title of the clan member overview window when the player is viewing another clan member")
    public static final lox tdK = tdJ.BC("TitleClanMember");
    @lok(value="My Clan Member Overview")
    @lpl(value="Title of the clan member overview window when the player is viewing their own member overview")
    public static final lox tdL = tdJ.BC("TitlePlayerMember");
    @lok(value="Player-Points")
    @lpl(value="Title of the clan member's player-points total")
    public static final lox tdM = tdJ.BC("PlayerPointsTitle");
    @lok(value="Clan-Points")
    @lpl(value="Title of the clan member's total earned clan-points")
    public static final lox tdN = tdJ.BC("ClanPointsTitle");
    @lok(value="Kills")
    @lpl(value="Title of the clan member's kills achieved during conquest")
    public static final lox tdO = tdJ.BC("KillsTitle");
    @lok(value="Permissions")
    @lpl(value="Title of the clan member's permissions")
    public static final lox tdP = tdJ.BC("PermissionsTitle");
    @lok(value="Leave Clan")
    @lpl(value="Action label for the button when it will initiate the clan member's exit from the clan")
    public static final lox tdQ = tdJ.BC("LeaveClanButtonAction");
    @lok(value="Leaving the clan takes $(LeaveTime)")
    @lpl(value="Message for the button to indicate how long it takes to complete a request to leave the clan")
    public static final lox tdR = tdJ.a("LeaveClanMessage", lwg.Bi("LeaveTime"));
    @lok(value="Leaving clan in $(RemainingTime)")
    @lpl(value="Action label for the button when the process of leaving the clan has begun")
    public static final lox tdS = tdJ.a("LeavingClanButtonAction", lwg.Bi("RemainingTime"));
    @lok(value="Click again to cancel leave")
    @lpl(value="Message to indicate that the process of leaving the clan can be cancelled")
    public static final lox tdT = tdJ.BC("LeavingClanMessage");
    @lok(value="Save changes")
    @lpl(value="Action label for the button when it will send a permissions update request to the server for handling")
    public static final lox tdU = tdJ.BC("SavePermissionsButtonAction");
    @lok(value="Saving changes... Please wait...")
    @lpl(value="Action label for the button when a permissions update request is currently being processed by the server")
    public static final lox tdV = tdJ.BC("SavingPermissionsButtonAction");
    @lok(value="Kick Player")
    @lpl(value="Action label for the button when it will kick the member from the clan")
    public static final lox tdW = tdJ.BC("KickPlayerButtonAction");
    @lok(value="Kicking Player... Please Wait...")
    @lpl(value="Action label for the button when a request to kick the member from the clan is being processed by the server")
    public static final lox tdX = tdJ.BC("KickingPlayerButtonAction");
    @lok(value="Ban Player")
    @lpl(value="Action label for the button when it will ban the member from the clan")
    public static final lox tdY = tdJ.BC("BanPlayerButtonAction");
    @lok(value="Banning Player... Please Wait...")
    @lpl(value="Action label for the button when a request to ban the member from the clan is being processed by the server")
    public static final lox tdZ = tdJ.BC("BanningPlayerButtonAction");

    protected lwg(String string) {
        super("MemberOverview." + string);
    }

    private lwg() {
        super("MemberOverview");
    }
}

