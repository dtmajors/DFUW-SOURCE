/*
 * Decompiled with CFR.
 */
public class lwq
extends lvn {
    private static final lwq tfV = new lwq();
    @lok(value="$(Rank) $(PlayerName) invites you to join clan $(ClanName).")
    @lpl(value="Message shown on a player when another player invites him in his clan.")
    public static final lox tfW = tfV.a("ClanInvitation", lwq.Bk("Rank"), lwq.Bk("PlayerName"), lwq.Bk("ClanName"));
    @lok(value="$(PlayerName) asks if you would like to join his party.")
    @lpl(value="Message shown on a player when another player invites him in his party.")
    public static final lox tfX = tfV.a("PartyInvitation", lwq.Bk("PlayerName"));
    @lok(value="Accept summon from $(PlayerName)?")
    @lpl(value="Message shown to a player when another player asks him if he wants to be summoned.")
    public static final lox tfY = tfV.a("SummonRequest", lwq.Bk("PlayerName"));
    @lok(value="$(PlayerName) asks if you would like to be revived.")
    @lpl(value="Message shown on a player when another player asks him if he wants to be revived.")
    public static final lox tfZ = tfV.a("ReviveRequest", lwq.Bk("PlayerName"));
    @lok(value="$(PlayerName) asks if you would like to accept quest $(QuestName).")
    @lpl(value="Message shown on a player when another player asks him if he wants to be revived.")
    public static final lox tga = tfV.a("QuestOffering", lwq.Bk("PlayerName"), lwq.Bk("QuestName"));
    @lok(value="$(PlayerName) invites you to live in his house located in $(AreaName).")
    @lpl(value="Message shown on a player when another player asks invites him to live in his house.")
    public static final lox tgb = tfV.a("HouseInvitation", lwq.Bk("PlayerName"), lwq.Bk("AreaName"));
    @lok(value="You are about to transfer your house to $(PlayerName).")
    @lpl(value="Message shown on a player when is about to transfer his house to someone else.")
    public static final lox tgc = tfV.a("HouseTransfer", lwq.Bk("PlayerName"));
    @lok(value="Do you want to apply for membership in clan $(ClanName).")
    @lpl(value="Message shown on a player when is about to apply for membership in a clan.")
    public static final lox tgd = tfV.a("ClanApplication", lwq.Bk("ClanName"));
    @lok(value="Do you want to spend $(MinimumAnte) $(Resource.Name$(MinimumAnte.Plurality)) for a trade route run?")
    @lpl(value="Message shown on a player when is about to start a traderoute.")
    public static final lox tge = tfV.a("TraderouteRun", lwq.Bh("MinimumAnte"), lwq.Bl("Resource"));
    @lok(value="If you start this challenge $(GoldCost) $(GoldResource.Name$(GoldCost.Plurality)) will be deducted from you clan's vault... Do you still want to start this challenge?")
    @lpl(value="Message shown on a player when is about to start a challenge.")
    public static final lox tgf = tfV.a("ChallengeDeclaration", lwq.Bh("GoldCost"), lwq.Bl("GoldResource"));
    @lok(value="If you issue this contract a bond of $(GoldCost) $(GoldResource.Name$(GoldCost.Plurality)) will be deducted from you clan's vault, to be returned upon successful completion of the contract... Do you still want to issue this contract?")
    @lpl(value="Message shown on a player when is about to issue a contract.")
    public static final lox tgg = tfV.a("ChallengeContract", lwq.Bh("GoldCost"), lwq.Bl("GoldResource"));
    @lok(value="Would you like to be recalled by a game master?")
    @lpl(value="Message shown on a player when a game master wants to recall him.")
    public static final lox tgh = tfV.BC("Recall");
    @lok(value="You are about to replace $(Resource.NameSingular). Are you sure you want to accept this?\n\r $(Resource.NameSingular) will be lost.")
    @lpl(value="Message shown on a player when is about to replace a house upgrade which will be lost.")
    public static final lox tgi = tfV.a("ReplaceBuildableLost", lwq.Bl("Resource"));
    @lok(value="You are about to replace $(Resource.NameSingular) with $(Resource2.NameSingular). Are you sure you want to accept this?\n\r $(Resource.NameSingular) will be placed in your inventory.")
    @lpl(value="Message shown on a player when is about to replace a house upgrade which will be placed back to player's inventory")
    public static final lox tgj = tfV.a("ReplaceBuildable", lwq.Bl("Resource"), lwq.Bl("Resource2"));
    @lok(value="$(PlayerName) asks if you would like to trade with him.")
    @lpl(value="Message shown on a player when another player wants to trade with him.")
    public static final lox tgk = tfV.a("TradeInvitation", lwq.Bk("PlayerName"));
    @lok(value="+$(NumberOfPendingRequests) pending requests.")
    @lpl(value="Shows the number of the pending confirmation requests.")
    public static final lox tgl = tfV.a("ConfirmationPendingRequests", lwq.Bh("NumberOfPendingRequests"));

    protected lwq(String string) {
        super("Confirmations." + string);
    }

    private lwq() {
        super("Confirmations");
    }
}

