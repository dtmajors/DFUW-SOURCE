/*
 * Decompiled with CFR.
 */
public class lwk
extends lvx {
    private static final lwk tei = new lwk();
    @lok(value="Clan Overview")
    @lpl(value="Text to display as the title to the window that is used to display the overview about a single clan that is not the player's own clan")
    public static final lox tej = tei.BC("TitleOtherClan");
    @lok(value="My Clan Overview")
    @lpl(value="Text to display as the title to the window that is used to display the overview about the player's own clan")
    public static final lox tek = tei.BC("TitlePlayerClan");
    @lok(value="Charter")
    @lpl(value="String to display above the clan charter")
    public static final lox tda = tei.BC("ClanCharterTitle");
    @lok(value="Leader")
    @lpl(value="String to display above the clan leader's name")
    public static final lox tdi = tei.BC("LeaderTitle");
    @lok(value="Founder")
    @lpl(value="String to display above the clan founder's name")
    public static final lox tdj = tei.BC("FounderTitle");
    @lok(value="Members")
    @lpl(value="String to display the total membership count for the clan")
    public static final lox tel = tei.BC("MembersCount");
    @lok(value="Accepting New Member Applications")
    @lpl(value="String to display next to the accepting new members check-box")
    public static final lox tdd = tei.BC("AcceptingNewMembersText");
    @lok(value="Owned Holdings")
    @lpl(value="String to display above the list of owned holdings")
    public static final lox tem = tei.BC("HoldingsTitle");
    @lok(value="Tags")
    @lpl(value="String to display above the collection of attached clan tags")
    public static final lox tde = tei.BC("ClanTagsTitle");
    @lok(value="Apply To Join")
    @lpl(value="Text to display when the player can issue a join request to the clan")
    public static final lox ten = tei.BC("JoinClanText");
    @lok(value="Application Sent")
    @lpl(value="Text to display whent the player has issued a join request to the clan")
    public static final lox teo = tei.BC("JoiningClanText");
    @lok(value="Update")
    @lpl(value="Text to display next to the action button when the player can update their clan's political stance towards the displayed clan")
    public static final lox tep = tei.BC("UpdateClanText");
    @lok(value="Updating Clan... Please Wait...")
    @lpl(value="Text to display next to the acation button when the request to update the clan's political stance is being processed by the server")
    public static final lox tdh = tei.BC("UpdatingClanText");
    @lok(value="The clan's membership restrictions prevent you from applying to join!")
    @lpl(value="Text to display when the player cannot join the diplayed clan due to their selected membership restrictions")
    public static final lox teq = tei.BC("RestrictionsPreventApplicationText");
    @lok(value="You are banned from applying to join the clan")
    @lpl(value="Text to display to indicate that the player cannot apply to join the clan because they are on the clan's banned players list")
    public static final lox ter = tei.BC("PlayerBannedFromJoiningClanText");
    @lok(value="Clan-Points")
    @lpl(value="Text to display as the title of the clan's clan-points value")
    public static final lox tdN = tei.BC("ClanPointsTitle");
    @lok(value="Owned Villages")
    @lpl(value="Text to display as the title of the list of owned villages")
    public static final lox tcV = tei.BC("VillagesTitle");
    @lok(value="Owned Fortresses")
    @lpl(value="Text to display as the title of the list of owned fortresses")
    public static final lox tes = tei.BC("FortressesTitle");
    @lok(value="Protected For: $(CountDown)")
    @lpl(value="Text to display in a tool-tip for a holding that is currently protected from conquest challenges")
    public static final lox tet = tei.a("ProtectedCountdown", lwk.Bi("CountDown"));
    @lok(value="Vulnerable In: $(CountDown)")
    @lpl(value="Text to display in a tool-tip for a holding or village that is counting-down to becoming vulnerable")
    public static final lox teu = tei.a("VulnerableCountdown", lwk.Bi("CountDown"));
    @lok(value="Conquest End In: $(CountDown)")
    @lpl(value="Text to display in a tool-tip for a holding that is counting-down to conquest end")
    public static final lox tev = tei.a("ConquestEndCountdown", lwk.Bi("CountDown"));
    @lok(value="Vulnerable")
    @lpl(value="Text to display in a tool-tip for a village that is currently vulnerable")
    public static final lox tew = tei.BC("VulnerableToCapture");
    @lok(value="Reward Requisitioning")
    @lpl(value="Text to display in a tool-tip for a village as the header to the requisitioning status section")
    public static final lox tex = tei.BC("RequisitionStatus");
    @lok(value="Available In: $(CountDown)")
    @lpl(value="Text to display in a tool-tip for a village that is counting-down to requisitioning availability")
    public static final lox tey = tei.a("RequisitionCountDown", lwk.Bi("CountDown"));
    @lok(value="Available Now!")
    @lpl(value="Text to display in a tool-tip for a village that is available for requisitioning")
    public static final lox tez = tei.BC("RequisitionAvailable");

    protected lwk(String string) {
        super("Overview." + string);
    }

    private lwk() {
        super("Overview");
    }
}

