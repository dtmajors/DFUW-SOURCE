/*
 * Decompiled with CFR.
 */
public class mbe
extends mai {
    private static final mbe uip = new mbe();
    @lok(value="$(MemberRank) $(MemberName) is now online")
    @lpl(value="Displayed to all clan members when a clan member comes online")
    public static final lox uiq = uip.a("MemberOnline", mbe.b("MemberRank", bbs.class), mbe.Bk("MemberName"));
    @lok(value="$(MemberRank) $(MemberName) is now offline")
    @lpl(value="Displayed to all clan members when a clan member goes offline")
    public static final lox uir = uip.a("MemberOffline", mbe.b("MemberRank", bbs.class), mbe.Bk("MemberName"));
    @lok(value="$(PlayerName) has been accepted by $(AccepterRank) $(AccepterName) as a member of the clan")
    @lpl(value="Displayed to all clan members when a player's application to join the clan has been accepted")
    public static final lox uis = uip.a("PlayerJoinedClan", mbe.Bk("PlayerName"), mbe.b("AccepterRank", bbs.class), mbe.Bk("AccepterName"));
    @lok(value="$(PlayerName) has been accepted as a member of the clan")
    @lpl(value="Displayed to all clan members when a player's application to join the clan has been accepted, but the accepting player cannot be determined")
    public static final lox uit = uip.a("PlayerJoinedClanAccepterUnknown", mbe.Bk("PlayerName"));
    @lok(value="Your application to be a member of $(ClanName) has been accepted by $(AccepterRank) $(AccepterName)")
    @lpl(value="Displayed to a player when their application to join a clan has been accepted")
    public static final lox uiu = uip.a("PlayerJoinedPersonal", mbe.Bk("ClanName"), mbe.b("AccepterRank", bbs.class), mbe.Bk("AccepterName"));
    @lok(value="Your application to be a member of $(ClanName) has been accepted")
    @lpl(value="Displayed to a player when their application to join a clan has been accepted, but the accepting player cannot be determined")
    public static final lox uiv = uip.a("PlayerJoinedPersonalAccepterUnknown", mbe.Bk("ClanName"));
    @lok(value="$(PlayerName) has accepted the invitation from $(InviterRank) $(InviterName) to join the clan")
    @lpl(value="Displayed to all clan members when a player accepts an invitation to join the clan")
    public static final lox uiw = uip.a("InvitationAcceptedClan", mbe.Bk("PlayerName"), mbe.b("InviterRank", bbs.class), mbe.Bk("InviterName"));
    @lok(value="$(PlayerName) has accepted the invitation to join the clan")
    @lpl(value="Displayed to all clan members when a player accepts an invitation to join the clan, but the inviting member cannot be determined")
    public static final lox uix = uip.a("InvitationAcceptedClanInviterUnknown", mbe.Bk("PlayerName"));
    @lok(value="You accepted the invitation from $(InviterRank) $(InviterName) to join the clan, you are now a proud member of $(ClanName)")
    @lpl(value="Displayed to a player when they accept an invitation to join a clan")
    public static final lox uiy = uip.a("InvitationAcceptedPersonal", mbe.b("InviterRank", bbs.class), mbe.Bk("InviterName"), mbe.Bk("ClanName"));
    @lok(value="You accepted the invitation to join the clan, you are now a proud member of $(ClanName)")
    @lpl(value="Displayed to a player when they accept an invitation to join a clan, but the inviting member cannot be determined")
    public static final lox uiz = uip.a("InvitationAcceptedPersonalInviterUnknown", mbe.Bk("ClanName"));
    @lok(value="$(MemberRank) $(MemberName) has just left the clan")
    @lpl(value="Displayed to all clan members when a member leaves the clan")
    public static final lox uiA = uip.a("PlayerLeftClan", mbe.b("MemberRank", bbs.class), mbe.Bk("MemberName"));
    @lok(value="You are no longer a member of the clan $(ClanName)")
    @lpl(value="Displayed to a player when they leave a clan")
    public static final lox uiB = uip.a("PlayerLeftPersonal", mbe.Bk("ClanName"));
    @lok(value="$(KickerRank) $(KickerName) has kicked $(KickedRank) $(KickedName)")
    @lpl(value="Displayed to all clan members when a player is kicked from the clan")
    public static final lox uiC = uip.a("PlayerKickedClan", mbe.b("KickerRank", bbs.class), mbe.Bk("KickerName"), mbe.b("KickedRank", bbs.class), mbe.Bk("KickedName"));
    @lok(value="You were kicked from the clan $(ClanName) by $(KickerRank) $(KickerName)")
    @lpl(value="Displayed to a player when they are kicked from a clan")
    public static final lox uiD = uip.a("PlayerKickedPersonal", mbe.Bk("ClanName"), mbe.b("KickerRank", bbs.class), mbe.Bk("KickerName"));
    @lok(value="$(BannerRank) $(BannerName) has banned $(BannedName) from membership in the clan")
    @lpl(value="Displayed to all clan members when a player is banned from membership in the clan")
    public static final lox uiE = uip.a("PlayerBannedClan", mbe.b("BannerRank", bbs.class), mbe.Bk("BannerName"), mbe.Bk("BannedName"));
    @lok(value="$(BannedName) has been banned from membership in the clan")
    @lpl(value="Displayed to all clan members when a player is banned from membership in the clan, but the unbanning member cannot be determined")
    public static final lox uiF = uip.a("PlayerBannedClanBannerUnknown", mbe.Bk("BannedName"));
    @lok(value="You have been banned from membership in the clan $(ClanName) by $(BannerRank) $(BannerName)")
    @lpl(value="Displayed to a player when they are banned from membership in a clan")
    public static final lox uiG = uip.a("PlayerBannedPersonal", mbe.Bk("ClanName"), mbe.b("BannerRank", bbs.class), mbe.Bk("BannerName"));
    @lok(value="$(UnbannerRank) $(UnbannerName) has lifted the ban of $(UnbannedName) from membership in the clan")
    @lpl(value="Displayed to all clan members when a player is no longer banned from membership in the clan")
    public static final lox uiH = uip.a("PlayerUnbannedClan", mbe.b("UnbannerRank", bbs.class), mbe.Bk("UnbannerName"), mbe.Bk("UnbannedName"));
    @lok(value="The ban of $(UnbannedName) from membership in the clan has been lifted")
    @lpl(value="Displayed to all clan members when a player is no longer banned from membership in the clan, but the unbanning member cannot be determined")
    public static final lox uiI = uip.a("PlayerUnbannedClanUnbannerUnknown", mbe.Bk("UnbannedName"));
    @lok(value="You are no longer banned from membership in the clan $(ClanName) by $(UnbannerRank) $(UnbannerName)")
    @lpl(value="Displayed to a player when they are no longer banned from membership in a clan")
    public static final lox uiJ = uip.a("PlayerUnbannedPersonal", mbe.Bk("ClanName"), mbe.b("UnbannerRank", bbs.class), mbe.Bk("UnbannerName"));
    @lok(value="Your application to join $(ClanName) has been rejected")
    @lpl(value="Displayed to a player when their application to join a clan has been rejected")
    public static final lox uiK = uip.a("ApplicationRejected", mbe.Bk("ClanName"));
    @lok(value="In recognition of your performance in battle, your rank in the clan is now $(NewRank)!")
    @lpl(value="Notification displayed to the player when their military rank in the clan has changed")
    public static final lox uiL = uip.a("RankChanged", mbe.b("NewRank", bbs.class));
    @lok(value="A player just attempted to apply to join your clan, but was stopped due to your clan already containing the maximum number of members")
    @lpl(value="Displayed to all clan members when a player tries to send a membership application to the clan, but the application was denied due to the clan already containing the maximum number of members")
    public static final lox uiM = uip.BC("ClanFull");
    @lok(value="A player just attempted to apply to join your clan, but was stopped due to too many pending membership applications")
    @lpl(value="Displayed to all clan members when a player tries to send a membership application to the clan, but the application was denied due to the number of existing members plus the pending applications exceeding the maximum number of allowed members")
    public static final lox uiN = uip.BC("ClanFullDueToPendingApplicants");

    protected mbe(String string) {
        super("Membership." + string);
    }

    private mbe() {
        super("Membership");
    }
}

