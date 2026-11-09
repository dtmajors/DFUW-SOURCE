/*
 * Decompiled with CFR.
 */
public class mbn
extends mai {
    private static final mbn ukf = new mbn();
    @lok(value="$(MemberRank) $(MemberName) has added $(PlayerRank) $(PlayerName), of the clan $(PlayerClan), to the clan's allowed-to-bind list")
    @lpl(value="Displayed to all clan members when a player, who is a member of another clan, is added to the clan's allowed to bind list")
    public static final lox ukg = ukf.a("AllowedToBindAddedClan", mbn.b("MemberRank", bbs.class), mbn.Bk("MemberName"), mbn.b("PlayerRank", bbs.class), mbn.Bk("PlayerName"), mbn.Bk("PlayerClan"));
    @lok(value="$(MemberRank) $(MemberName) has added $(PlayerName) to the clan's allowed-to-bind list")
    @lpl(value="Displayed to all clan members when a player, who is not a member of any clan, is added to the clan's allowed-to-bind list")
    public static final lox ukh = ukf.a("AllowedToBindAddedClanNoClan", mbn.b("MemberRank", bbs.class), mbn.Bk("MemberName"), mbn.Bk("PlayerName"));
    @lok(value="You have been granded permission by $(MemberRank) $(MemberName) to bind in all holdings owned by $(ClanName)")
    @lpl(value="Displayed to a player when they are added to a clan's allowed-to-bind list")
    public static final lox uki = ukf.a("AllowedToBindAddedPlayer", mbn.b("MemberRank", bbs.class), mbn.Bk("MemberName"), mbn.Bk("ClanName"));
    @lok(value="You have been granded permission by $(ClanName) to bind in their holdings")
    @lpl(value="Displayed to a player when they are added to a clan's allowed-to-bind list, but the clan member that added the player to the allowed-to-bind list cannot be determined")
    public static final lox ukj = ukf.a("AllowedToBindAddedPlayerCauseUnknown", mbn.Bk("ClanName"));
    @lok(value="$(MemberRank) $(MemberName) has removed $(PlayerRank) $(PlayerName), of the clan $(PlayerClan), from the clan's allowed-to-bind list")
    @lpl(value="Displayed to all clan members when a player, who is a member of another clan, is removed from the clan's allowed-to-bind list")
    public static final lox ukk = ukf.a("AllowedToBindRemovedClan", mbn.b("MemberRank", bbs.class), mbn.Bk("MemberName"), mbn.b("PlayerRank", bbs.class), mbn.Bk("PlayerName"), mbn.Bk("PlayerClan"));
    @lok(value="$(MemberRank) $(MemberName) has removed $(PlayerName) from the clan's allowed-to-bind list")
    @lpl(value="Displayed to all clan members when a player, who is not a member of any clan, is removed from the clan's allowed-to-bind list")
    public static final lox ukl = ukf.a("AllowedToBindRemovedClanNoClan", mbn.b("MemberRank", bbs.class), mbn.Bk("MemberName"), mbn.Bk("PlayerName"));
    @lok(value="Your permission to bind in the holdings owned by $(ClanName), has been removed by $(MemberRank) $(MemberName)")
    @lpl(value="Displayed to a player when they are removed from a clan's allowed-to-bind list")
    public static final lox ukm = ukf.a("AllowedToBindRemovedPlayer", mbn.Bk("ClanName"), mbn.b("MemberRank", bbs.class), mbn.Bk("MemberName"));
    @lok(value="You are no longer allowed to bind to holdings owned by '$(ClanName)'")
    @lpl(value="Displayed to a player when they are removed from a clan's allowed-to-bind list, but the clan member that removed the player from the allowed-to-bind list cannot be determined")
    public static final lox ukn = ukf.a("AllowedToBindRemovedPlayerCauseUnknown", mbn.Bk("ClanName"));
    @lok(value="$(PlayerName) is no longer on the clan's allowed-to-bind list, since $(PlayerName) is now a member of the clan")
    @lpl(value="Displayed to all clan members when a player is removed from the allowed-to-bind list because they joined the clan")
    public static final lox uko = ukf.a("AllowedToBindRemovedPlayerDueToClanJoin", mbn.Bk("PlayerName"));
    @lok(value="$(KickerRank) $(KickerName) has kicked $(KickedRank) $(KickedName) from their bind at the clan's $(HoldingType) of $(HoldingName)")
    @lpl(value="Displayed to all clan members when a clan member is kicked from a bindstone in one of the clan's holdings")
    public static final lox ukp = ukf.a("BindKickedClan", mbn.b("KickerRank", bbs.class), mbn.Bk("KickerName"), mbn.b("KickedRank", bbs.class), mbn.Bk("KickedName"), mbn.b("HoldingType", ayb.class), mbn.Bp("HoldingName"));
    @lok(value="$(KickerRank) $(KickerName) has kicked $(KickedRank) $(KickedName), of the clan $(KickedClan), from their bind at the clan's $(HoldingType) of $(HoldingName)")
    @lpl(value="Displayed to all clan members when a player, who is a member of another clan, is kicked from a binstone in one of the clan's holdings")
    public static final lox ukq = ukf.a("BindKickedClanNonMember", mbn.b("KickerRank", bbs.class), mbn.Bk("KickerName"), mbn.b("KickedRank", bbs.class), mbn.Bk("KickedName"), mbn.Bk("KickedClan"), mbn.b("HoldingType", ayb.class), mbn.Bp("HoldingName"));
    @lok(value="$(KickerRank) $(KickerName) has kicked $(KickedName) from their bind at the clan's $(HoldingType) of $(HoldingName)")
    @lpl(value="Displayed to all clan members when a player, who is not a member of any clan, is kicked from a binstone in one of the clan's holdings")
    public static final lox ukr = ukf.a("BindKickedClanNonMemberNoClan", mbn.b("KickerRank", bbs.class), mbn.Bk("KickerName"), mbn.Bk("KickedName"), mbn.b("HoldingType", ayb.class), mbn.Bp("HoldingName"));
    @lok(value="$(KickerRank) $(KickerName) has kicked you from your bind at the clan's $(HoldingType) of $(HoldingName)")
    @lpl(value="Displayed to a player when they are kicked from a binstone in one of the holdings owned by their own clan")
    public static final lox uks = ukf.a("BindKickedPlayer", mbn.b("KickerRank", bbs.class), mbn.Bk("KickerName"), mbn.b("HoldingType", ayb.class), mbn.Bp("HoldingName"));
    @lok(value="$(KickerRank) $(KickerName) has kicked you from your bind a the $(HoldingType) of $(HoldingName) owned by $(KickerClan)")
    @lpl(value="Displayed to a player when they are kicked from a binstone in a holding owned by another clan")
    public static final lox ukt = ukf.a("BindKickedPlayerNonMember", mbn.b("KickerRank", bbs.class), mbn.Bk("KickerName"), mbn.b("HoldingType", ayb.class), mbn.Bp("HoldingName"), mbn.Bk("KickerClan"));
    @lok(value="$(MemberRank) $(MemberName) has added $(PlayerRank) $(PlayerName), of the clan $(PlayerClan), to the clan's kill-on-sight list")
    @lpl(value="Displayed to all clan members when a player, who is a member of another clan, is added to the clan's kill-on-sight list")
    public static final lox uku = ukf.a("KillOnSightAddedClan", mbn.b("MemberRank", bbs.class), mbn.Bk("MemberName"), mbn.b("PlayerRank", bbs.class), mbn.Bk("PlayerName"), mbn.Bk("PlayerClan"));
    @lok(value="$(MemberRank) $(MemberName) has added $(PlayerName) to the clan's kill-on-sight list")
    @lpl(value="Displayed to all clan members when a player, who is not a member of any clan, is added to the clan's kill-on-sight list")
    public static final lox ukv = ukf.a("KillOnSightAddedClanNoClan", mbn.b("MemberRank", bbs.class), mbn.Bk("MemberName"), mbn.Bk("PlayerName"));
    @lok(value="$(MemberRank) $(MemberName) has added you to the kill-on-sight list of $(ClanName)")
    @lpl(value="Displayed to a player when they are added to a clan's kill-on-sight list")
    public static final lox ukw = ukf.a("KillOnSightAddedPlayer", mbn.b("MemberRank", bbs.class), mbn.Bk("MemberName"), mbn.Bk("ClanName"));
    @lok(value="$(MemberRank) $(MemberName) has removed $(PlayerRank) $(PlayerName), of the clan $(PlayerClan), from the clan's kill-on-sight list")
    @lpl(value="Displayed to all clan members when a player, who is a member of another clan, is removed from the clan's kill-on-sight list")
    public static final lox ukx = ukf.a("KillOnSightRemovedClan", mbn.b("MemberRank", bbs.class), mbn.Bk("MemberName"), mbn.b("PlayerRank", bbs.class), mbn.Bk("PlayerName"), mbn.Bk("PlayerClan"));
    @lok(value="$(MemberRank) $(MemberName) has removed $(PlayerName) from the clan's kill-on-sight list")
    @lpl(value="Displayed to all clan members when a player, who is not a member of any clan, is removed from the clan's kill-on-sight list")
    public static final lox uky = ukf.a("KillOnSightRemovedClanNoClan", mbn.b("MemberRank", bbs.class), mbn.Bk("MemberName"), mbn.Bk("PlayerName"));
    @lok(value="You have been removed from the kill-on-sight list of $(ClanName), by $(MemberRank) $(MemberName)")
    @lpl(value="Displayed to a player when they are removed from a clan's kill-on-sight list")
    public static final lox ukz = ukf.a("KillOnSightRemovedPlayer", mbn.Bk("ClanName"), mbn.b("MemberRank", bbs.class), mbn.Bk("MemberName"));
    @lok(value="$(PlayerName) is no longer on the clan's kill-on-sight list, since $(PlayerName) is now a member of the clan")
    @lpl(value="Displayed to all clan members when a player is removed from the kill-on-sight list because they joined the clan")
    public static final lox ukA = ukf.a("KillOnSightRemovedClanDueToClanJoin", mbn.Bk("PlayerName"));

    protected mbn(String string) {
        super("PlayerPolitics." + string);
    }

    private mbn() {
        super("PlayerPolitics");
    }
}

