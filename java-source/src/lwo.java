/*
 * Decompiled with CFR.
 */
public class lwo
extends lvn {
    private static final lwo tfz = new lwo();
    @lok(value="Clan Vault Logs")
    @lpl(value="Window Title.")
    public static final lox tfA = tfz.BC("WindowTitle1");
    @lok(value="Number Of Entries:")
    @lpl(value="Number of entries label.")
    public static final lox tfB = tfz.BC("LabelNumberOfEntries");
    @lok(value="Search Vault Entries...")
    @lpl(value="Search text label.")
    public static final lox tfC = tfz.BC("LabelSearchText");
    @lok(value="Previous Entry")
    @lpl(value="Tooltip text for the next entry button.")
    public static final lox tfD = tfz.BC("TooltipPrevEntry");
    @lok(value="Next Entry")
    @lpl(value="Tooltip text for the next entry button.")
    public static final lox tfE = tfz.BC("TooltipNextEntry");
    @lok(value=" x $(Value)")
    @lpl(value="Window Title.")
    public static final lox tfF = tfz.a("Quantity", lwo.Bh("Value"));
    @lok(value="$(ItemName)$(CountText) deposited by $(PlayerName) on $(DateTime)")
    @lpl(value="Clan vault log entry for player depositing to the clan vault.")
    public static final lox tfG = tfz.a("EntryPlayerActionDeposit", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("PlayerName"), lwo.Bk("DateTime"));
    @lok(value="$(ItemName)$(CountText) withdrawn by $(PlayerName) on $(DateTime)")
    @lpl(value="Clan vault log entry for player withdrawing from the clan vault.")
    public static final lox tfH = tfz.a("EntryPlayerActionWithdraw", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("PlayerName"), lwo.Bk("DateTime"));
    @lok(value="$(ItemName)$(CountText) deposited as village capture reward on Village $(VillageName) on $(DateTime)")
    @lpl(value="Clan vault log entry for village capture reward.")
    public static final lox tfI = tfz.a("EntryVillageCaptureReward", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("VillageName"), lwo.Bk("DateTime"));
    @lok(value="$(ItemName)$(CountText) deposited as ownership village reward on Village $(VillageName) on $(DateTime)")
    @lpl(value="Clan vault log entry for village capture reward.")
    public static final lox tfJ = tfz.a("EntryVillageOnwershipReward", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("VillageName"), lwo.Bk("DateTime"));
    @lok(value="$(ItemName)$(CountText) deposited as fortress capture reward on Fortress $(FortressName) on $(DateTime)")
    @lpl(value="Clan vault log entry for village capture reward.")
    public static final lox tfK = tfz.a("EntryFortressCaptureReward", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("FortressName"), lwo.Bk("DateTime"));
    @lok(value="$(ItemName)$(CountText) deposited as $(WorkstationName) tax reward on Holding $(HoldingName) on $(DateTime)")
    @lpl(value="Clan vault log entry for village capture reward.")
    public static final lox tfL = tfz.a("EntryWorkstationTaxReward", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("WorkstationName"), lwo.Bk("HoldingName"), lwo.Bk("DateTime"));
    @lok(value="$(ItemName)$(CountText) deposited as conquest challenge wager on Holding $(HoldingName) on $(DateTime)")
    @lpl(value="Clan vault log entry for village capture reward.")
    public static final lox tfM = tfz.a("EntryConquestChallengeWagerDeposit", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("HoldingName"), lwo.Bk("DateTime"));
    @lok(value="$(ItemName)$(CountText) withdrawn as conquest challenge wager on Holding $(HoldingName) on $(DateTime)")
    @lpl(value="Clan vault log entry for village capture reward.")
    public static final lox tfN = tfz.a("EntryConquestChallengeWagerWithdraw", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("HoldingName"), lwo.Bk("DateTime"));
    @lok(value="$(ItemName)$(CountText) deposited as conquest challenge win reward on Holding $(HoldingName) on $(DateTime)")
    @lpl(value="Clan vault log entry for village capture reward.")
    public static final lox tfO = tfz.a("EntryConquestChallengeWin", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("HoldingName"), lwo.Bk("DateTime"));
    @lok(value="$(ItemName)$(CountText) deposited as siege stone destruction reward at Holding $(HoldingName) on $(DateTime)")
    @lpl(value="Clan vault log entry for village capture reward.")
    public static final lox tfP = tfz.a("EntryConquestChallengeSiegeStoneDestructionReward", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("HoldingName"), lwo.Bk("DateTime"));
    @lok(value="$(ItemName)$(CountText) deposited as mercenary contract bond on $(DateTime)")
    @lpl(value="Clan vault log entry for village capture reward.")
    public static final lox tfQ = tfz.a("EntryConquestMercenaryContractBondDeposit", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("DateTime"));
    @lok(value="$(ItemName)$(CountText) withdrawn as mercenary contract bond on $(DateTime)")
    @lpl(value="Clan vault log entry for village capture reward.")
    public static final lox tfR = tfz.a("EntryConquestMercenaryContractBondWithdraw", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("DateTime"));
    @lok(value="$(ItemName)$(CountText) deposited as mercenary contract reward on $(DateTime)")
    @lpl(value="Clan vault log entry for village capture reward.")
    public static final lox tfS = tfz.a("EntryConquestMercenaryContractReward", lwo.Bk("ItemName"), lwo.Bk("CountText"), lwo.Bk("DateTime"));

    protected lwo() {
        super("ClanVaultLogsWindow");
    }
}

