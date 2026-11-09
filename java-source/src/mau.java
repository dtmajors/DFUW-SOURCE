/*
 * Decompiled with CFR.
 */
public class mau
extends mai {
    private static final mau ueB = new mau();
    @lok(value="$(CapturerRank) $(CapturerName) has captured the control-point $(ControlPointName) for the clan")
    @lpl(value="Displayed to all clan members when the clan captures a control-point")
    public static final lox ueC = ueB.a("ControlPointCapturedClan", mau.b("CapturerRank", bbs.class), mau.Bk("CapturerName"), mau.Bq("ControlPointName"));
    @lok(value="Your clan has captured the control-point $(ControlPointName)")
    @lpl(value="Displayed to all clan members when the clan captures a control-point, but the capturing member cannot be determined")
    public static final lox ueD = ueB.a("ControlPointCapturedClanCapturerUnknown", mau.Bq("ControlPointName"));
    @lok(value="$(ClanName) has captured the control-point $(ControlPointName)")
    @lpl(value="Displayed to all on-line players when a clan captures a control-point")
    public static final lox ueE = ueB.a("ControlPointCapturedGlobal", mau.Bk("ClanName"), mau.Bq("ControlPointName"));
    @lok(value="$(CapturerRank) $(CapturerName) has recaptured the control-point $(ControlPointName) for the clan")
    @lpl(value="Displayed to all clan members when the clan recaptures a control-point")
    public static final lox ueF = ueB.a("ControlPointRecapturedClan", mau.b("CapturerRank", bbs.class), mau.Bk("CapturerName"), mau.Bq("ControlPointName"));
    @lok(value="Your clan has recaptured the control-point $(ControlPointName)")
    @lpl(value="Displayed to all clan members when the clan recaptures a control-point, but the capturing member cannot be determined")
    public static final lox ueG = ueB.a("ControlPointRecapturedClanCapturerUnknown", mau.Bq("ControlPointName"));
    @lok(value="$(ClanName) has recaptured the control-point $(ControlPointName)")
    @lpl(value="Displayed to all on-line players when a clan recaptures a control-point")
    public static final lox ueH = ueB.a("ControlPointRecapturedGlobal", mau.Bk("ClanName"), mau.Bq("ControlPointName"));
    @lok(value="You have lost control of the control-point $(ControlPointName) due to it timing-out")
    @lpl(value="Displayed to all clan members when the clan loses a control-point due to it timing-out")
    public static final lox ueI = ueB.a("ControlPointLostTimeOutClan", mau.Bq("ControlPointName"));
    @lok(value="$(ClanName) have lost control of the control-point $(ControlPointName)")
    @lpl(value="Displayed to all on-line players when a clan loses a control-point due to it timing-out")
    public static final lox ueJ = ueB.a("ControlPointLostTimeOutGlobal", mau.Bk("ClanName"), mau.Bq("ControlPointName"));
    @lok(value="$(ClanName) have taken control of the control-point $(ControlPointName)")
    @lpl(value="Displayed to all clan members when the clan loses a control-point to another clan")
    public static final lox ueK = ueB.a("ControlPointLostToOtherClanClan", mau.Bk("ClanName"), mau.Bq("ControlPointName"));
    @lok(value="$(ClanName) have taken control of the control-point $(ControlPointName) from $(PreviousOwnerClanName)")
    @lpl(value="Displayed to all on-line players when a clan loses a control-point to another clan")
    public static final lox ueL = ueB.a("ControlPointLostToOtherClanGlobal", mau.Bk("ClanName"), mau.Bq("ControlPointName"), mau.Bk("PreviousOwnerClanName"));
    @lok(value="$(ControlPointName) now has $(HousesCount) houses built that the clan will receive rent income from")
    @lpl(value="Displayed to all clan members when a the number of houses in a player village that must pay rent changes")
    public static final lox ueM = ueB.a("ControlPointTaxableHousesUpdated", mau.Bq("ControlPointName"), mau.Bh("HousesCount"));
    @lok(value="$(TaxAmount) $(TaxResource.Name$(TaxAmount.Plurality)) has been added to the clan-vault for the rent income from $(ControlPointName)")
    @lpl(value="Displayed to all clan members when the rent income is paid from a control-point")
    public static final lox ueN = ueB.a("ControlPointClanTaxReward", mau.Bh("TaxAmount"), mau.Bl("TaxResource"), mau.Bq("ControlPointName"));
    @lok(value="For controling the control-point $(ControlPointName) $(ResourceRewardQuantity) $(ResourceRewardType.Name$(ResourceRewardQuantity.Plurality)) has been added to the clan-vault")
    @lpl(value="Displayed to all clan members when a resource reward is received for owning a control-point")
    public static final lox ueO = ueB.a("ControlPointResourceReward", mau.Bq("ControlPointName"), mau.Bh("ResourceRewardQuantity"), mau.Bl("ResourceRewardType"));
    @lok(value="$(CapturerRank) $(CapturerName) has received $(TaxAmount) $(TaxResource.Name$(TaxAmount.Plurality)) as their share of the rent from $(ControlPointName), since they captured the control-point for the clan")
    @lpl(value="Displayed to all clan members when a control-point capturer member receives their share of the rent reward from the captured control-point")
    public static final lox ueP = ueB.a("ControlPointPersonalTaxRewardClan", mau.b("CapturerRank", bbs.class), mau.Bk("CapturerName"), mau.Bh("TaxAmount"), mau.Bl("TaxResource"), mau.Bq("ControlPointName"));
    @lok(value="You have received $(TaxAmount) $(TaxResource.Name$(TaxAmount.Plurality)) as your share of the rent from $(ControlPointName), since you captured the control-point for the clan")
    @lpl(value="Displayed to the capturer clan member when they receive their share of the rent reward from the captured control-point")
    public static final lox ueQ = ueB.a("ControlPointPersonalTaxRewardCapturer", mau.Bh("TaxAmount"), mau.Bl("TaxResource"), mau.Bq("ControlPointName"));
    @lok(value="The control-point $(ControlPointName) is now vulnerable to capture by other clans in the territory... You have $(CountDown) to recapture it, or it will time-out and become free again")
    @lpl(value="Displayed to all clan members when a control-point that they own becomes vulnerable to capture")
    public static final lox ueR = ueB.a("ControlPointVulnerable", mau.Bq("ControlPointName"), mau.Bi("CountDown"));
    @lok(value="The control-point $(ControlPointName) is now vulnerable to capture by other clans... Recapture it, or risk losing control over the territory!")
    @lpl(value="Displayed to all clan members when a control-point that they own becomes vulnerable to capture")
    public static final lox ueS = ueB.a("ControlPointVulnerableNoTerritoryRestrictions", mau.Bq("ControlPointName"));
    @lok(value="The village control-point of $(ControlPointName) will become vulnerable in $(VulnerableCountDown)")
    @lpl(value="Displayed to all on-line players when a village control-point is due to become vulnerable")
    public static final lox ueT = ueB.a("ControlPointVulnerableSoonGlobal", mau.Bq("ControlPointName"), mau.Bi("VulnerableCountDown"));
    @lok(value="You cannot capture this village control-point because you are not a member of a clan")
    @lpl(value="Displayed to a player when they try to capture a village control-point, but they are not a member of a clan")
    public static final lox ueU = ueB.BC("CannotCaptureBecauseOfNoClan");
    @lok(value="You cannot capture this village control-point because your clan does not own a holding in the village's territory")
    @lpl(value="Displayed to a player when they try to capture a village control-point, but their clan does not own a holding in the village's territory")
    public static final lox ueV = ueB.BC("CannotCaptureBecauseOfTerritoralControlRestrictions");
    @lok(value="You cannot capture this village control-point because you are using a trial account")
    @lpl(value="Displayed to a player when they try to capture a village control-point, but they are using a trial account")
    public static final lox ueW = ueB.BC("CannotCaptureBecauseOfTrialAccount");
    @lok(value="The control-point in the village of $(VillageID) will be available for reward requisitioning in $(CountDown)")
    @lpl(value="Displayed to all on-line players when a village control-point will become available for requisitioning soon")
    public static final lox ueX = ueB.a("ControlPointRequisitioningAvailableSoonGlobal", mau.Bq("VillageID"), mau.Bi("CountDown"));
    @lok(value="$(ClanRank) $(PlayerName) has begun requisitioning rewards from your village of $(VillageID)")
    @lpl(value="Displayed to all members of the village owner clan when a member of the clan begins the process of requisitioning rewards from one of the clan's villages")
    public static final lox ueY = ueB.a("ControlPointRequisitioningStartedClanMember", mau.b("ClanRank", bbs.class), mau.Bk("PlayerName"), mau.Bq("VillageID"));
    @lok(value="$(PlayerName) has begun requisitioning rewards from your village of $(VillageID)... defend your village, and your rewards!")
    @lpl(value="Displayed to all members of the village owner clan when a player who is not a member of any clan begins the process of requisitioning rewards from one of the clan's villages")
    public static final lox ueZ = ueB.a("ControlPointRequisitioningStartedNonClanMember", mau.Bk("PlayerName"), mau.Bq("VillageID"));
    @lok(value="$(PlayerName) of the clan $(ClanName) has begun requisitioning rewards from your village of $(VillageID)... defend your village, and your rewards!")
    @lpl(value="Displayed to all members of the village owner clan when a player who is a member of a different clan begins the process of requisitioning rewards from one of the clan's villages")
    public static final lox ufa = ueB.a("ControlPointRequisitioningStartedOtherClanMember", mau.Bk("PlayerName"), mau.Bk("ClanName"), mau.Bq("VillageID"));
    @lok(value="$(ClanRank) $(PlayerName) has completed the requisitioning of rewards from your village of $(VillageID)... help them get the loot back to the clan-vault!")
    @lpl(value="Displayed to all members of the village owner clan when a member of the clan completes the requisitioning of rewards from the village")
    public static final lox ufb = ueB.a("ControlPointRequisitioningCompletedClanMember", mau.b("ClanRank", bbs.class), mau.Bk("PlayerName"), mau.Bq("VillageID"));
    @lok(value="$(PlayerName) has completed the requisitioning of rewards from your village of $(VillageID)... they are getting away with your loot!")
    @lpl(value="Displayed to all members of the village owner clan when a player who is not a member of a clan completes the requisitioning of rewards from the village")
    public static final lox ufc = ueB.a("ControlPointRequisitioningCompletedNonClanMember", mau.Bk("PlayerName"), mau.Bq("VillageID"));
    @lok(value="$(PlayerName) of the clan $(ClanName) has completed the requisitioning of rewards from your village of $(VillageID)... they are getting away with your loot!")
    @lpl(value="Displayed to all members of the village owner clan when a member of another clan completes the requisitioning of rewards from the village")
    public static final lox ufd = ueB.a("ControlPointRequisitioningCompletedOtherClanMember", mau.Bk("PlayerName"), mau.Bk("ClanName"), mau.Bq("VillageID"));
    @lok(value="Requisitioning of rewards from the village of $(VillageID) has been completed")
    @lpl(value="Displayed to all online players when the requisitioning of rewards from the village has been completed")
    public static final lox ufe = ueB.a("ControlPointRequisitioningCompletedGlobal", mau.Bq("VillageID"));
    @lok(value="Your village of $(VillageID) has begun generating rewards... rewards will become available for requisitioning in $(CountDown)")
    @lpl(value="Displayed to all members of the village owner clan when a village begins to generate rewards for later requisitioning")
    public static final lox uff = ueB.a("ControlPointRewardGenerationStarted", mau.Bq("VillageID"), mau.Bi("CountDown"));
    @lok(value="Your new village of $(VillageID) is in the process of generating rewards... rewards will become available for requisitioning in $(CountDown)")
    @lpl(value="Displayed to all members of the village owner clan when they take ownership of a village that is already in the process of generating rewards for later requisitioning")
    public static final lox ufg = ueB.a("ControlPointRewardGenerationProgressReportForNewOwners", mau.Bq("VillageID"), mau.Bi("CountDown"));

    protected mau(String string) {
        super("ControlPoints." + string);
    }

    private mau() {
        super("ControlPoints");
    }
}

