/*
 * Decompiled with CFR.
 */
public class mcf
extends lzh {
    private static final mcf uta = new mcf();
    @lok(value="Linking to the $(Resource.NameSingular) of $(CityID) momentarily failed!... please try again!")
    @lpl(value="Displayed to a player when they attempt to link to a levy collector an the attempt fails due to an error")
    public static final lox utb = uta.a("InvalidLink", mcf.Bl("Resource"), mcf.Bp("CityID"));
    @lok(value="The coffers are empty! $(CityID) has nothing to requisition at the moment..try again later!")
    @lpl(value="Displayed to a player when they attempt to link to a levy collector and the attempt fails because there are not rewards that are ready for retrieval")
    public static final lox utc = uta.a("NoResourcesToRetrieve", mcf.Bp("CityID"));
    @lok(value="Another player is linked to $(CityID)'s $(Resource.NameSingular). Remove them to claim it yourself.")
    @lpl(value="Displayed to a player when they attempt to link to a levy collector and the attempt fails because another player is already linked")
    public static final lox utd = uta.a("PlayerAlreadyLinked", mcf.Bl("Resource"), mcf.Bp("CityID"));
    @lok(value="You're too far from $(CityID)'s $(Resource.NameSingular). Remain within $(MaxDistance)m to maintain the link!")
    @lpl(value="Displayed to a player when their link to a levy collector is removed due to them moving too far from it")
    public static final lox ute = uta.a("TooFarFromLevyCollector", mcf.Bl("Resource"), mcf.Bp("CityID"), mcf.Bh("MaxDistance"));
    @lok(value="You're now linked to $(CityID)'s $(Resource.NameSingular). Stay within $(MaxDistance)m, and in clear line-of-sight to maintain the link!")
    @lpl(value="Displayed to a player when they attempt to link to a levy collector and the attempt succeeds")
    public static final lox utf = uta.a("LinkCreatedSuccessfully", mcf.Bl("Resource"), mcf.Bp("CityID"), mcf.Bh("MaxDistance"));
    @lok(value="Before you can requisition goods from $(CityID), you must remove the existing $(AmmoResource.NamePlural) from $(Resource.NameSingular) (which will be placed in your backpack).")
    @lpl(value="Displayed to a player when they successfully link to a levy collector, but must remove existing ammo, before supplying their own")
    public static final lox utg = uta.a("PointsToRemoveInformation", mcf.Bl("Resource"), mcf.Bp("CityID"), mcf.Bl("AmmoResource"));
    @lok(value="$(PlayerName) has just established a link to  $(CityID)'s $(Resource.NameSingular). Deal with them before they use up all your $(AmmoResource.NamePlural)!")
    @lpl(value="Displayed to a player, or their party, when another player links to a levy collector that they have supplied ammo to")
    public static final lox uth = uta.a("OtherPlayerLinkedWarning", mcf.Bl("Resource"), mcf.Bk("PlayerName"), mcf.Bp("CityID"), mcf.Bl("AmmoResource"));
    @lok(value="$(PlayerName) is no longer linked to $(CityID)'s $(Resource.NameSingular)!")
    @lpl(value="Displayed to all members of a party, when a member's link to a levy collector is broken after supplying ammo to it")
    public static final lox uti = uta.a("PartyMemberLinkBrokenWarning", mcf.Bl("Resource"), mcf.Bk("PlayerName"), mcf.Bp("CityID"));
    @lok(value="To requisition goods from $(CityID) you must be linked long enough to supply $(RequiredPoints) $(AmmoResource.Name$(RequiredPoints.Plurality)) to $(Resource.NameSingular)!")
    @lpl(value="Displayed to a player, when they create a link to a levy collector, to inform them how to complete the task")
    public static final lox utj = uta.a("RequisitioningInstructions", mcf.Bp("CityID"), mcf.Bh("RequiredPoints"), mcf.Bl("AmmoResource"), mcf.Bl("Resource"));
    @lok(value="To requisition goods from $(CityID) you or a member of your party must be linked long enough to supply $(RequiredPoints) $(AmmoResource.Name$(RequiredPoints.Plurality)) to $(Resource.NameSingular)!")
    @lpl(value="Displayed to a player, that is a member of a party, when they create a link to a levy collector, to inform them how to complete the task")
    public static final lox utk = uta.a("RequisitioningInstructionsPartyMember", mcf.Bp("CityID"), mcf.Bh("RequiredPoints"), mcf.Bl("AmmoResource"), mcf.Bl("Resource"));
    @lok(value="You're out of $(AmmoResource.NameSingular) and thus cannot requisition $(CityID)'s $(Resource.NameSingular).")
    @lpl(value="Displayed to a player when their link to a levy collector is broken due to them not having any more ammo in their back-pack")
    public static final lox utl = uta.a("LinkCancelledNoAmmo", mcf.Bl("Resource"), mcf.Bp("CityID"), mcf.Bl("AmmoResource"));
    @lok(value="The $(AmmoResource.NamePlural) you're using on $(CityID)'s $(Resource.NameSingular) will begin to decay. Re-establish your link to prevent this.")
    @lpl(value="Displayed to a player when their link to a levy collector is broken, after supplying ammo, to warn them that the supplied ammo will decay over time while they are not linked")
    public static final lox utm = uta.a("PointsDecayWarning", mcf.Bp("CityID"), mcf.Bl("AmmoResource"), mcf.Bl("Resource"));
    @lok(value="The $(AmmoResource.NamePlural) your group is using on $(CityID)'s $(Resource.NameSingular) will begin to decay. Someone in your party needs to re-establish your link to prevent this.")
    @lpl(value="Displayed to all members of a party, when a member's link to a levy collector is broken, after supplying ammo, to warn them that the supplied ammo will decay over time while no party members are linked")
    public static final lox utn = uta.a("PointsDecayWarningPartyMember", mcf.Bl("Resource"), mcf.Bp("CityID"), mcf.Bl("AmmoResource"));
    @lok(value="Your party successfully levied the goods from $(CityID). They've been divided and placed into your back-packs!")
    @lpl(value="Displayed to a member of a party, when they complete the process of requisitioning from a levy collector and they have received the rewards")
    public static final lox uto = uta.a("RequisitioningCompletedParty", mcf.Bp("CityID"));
    @lok(value="You have successfully levied the goods from $(CityID)... they have been placed into your back-pack!")
    @lpl(value="Displayed to a player when they complete the process of requisitioning from a levy collector and they have received the rewards")
    public static final lox utp = uta.a("RequisitioningCompleted", mcf.Bp("CityID"));
    @lok(value="The coffers of $(Resource.NameSingular) in the $(CityID) are full and ready to be requisitioned.")
    @lpl(value="Displayed to all on-line players that a levy collector has become available for requisitioning")
    public static final lox utq = uta.a("LevyCollectorRequisitioningAvailableGlobal", mcf.Bl("Resource"), mcf.Bp("CityID"));
    @lok(value="$(ClanRank) $(PlayerName) has begun requisitioning goods from $(CityID)")
    @lpl(value="Displayed to all members of the city owner clan when a member of the clan begins the process of requisitioning rewards from its levy collector")
    public static final lox utr = uta.a("LevyCollectorRequisitioningStartedClanMember", mcf.b("ClanRank", bbs.class), mcf.Bk("PlayerName"), mcf.Bp("CityID"));
    @lok(value="$(PlayerName) is dipping into your coffers and requisitioning from $(CityID)'s $(Resource.NameSingular)! Go teach them why stealing from you is a mistake!")
    @lpl(value="Displayed to all members of the city owner clan when a player who is not a member of any clan begins the process of requisitioning rewards from its levy collector")
    public static final lox uts = uta.a("LevyCollectorRequisitioningStartedNonClanMember", mcf.Bk("PlayerName"), mcf.Bp("CityID"), mcf.Bl("Resource"));
    @lok(value="$(PlayerName) of the clan $(ClanName) is dipping into your coffers! Defend $(CityID)'s $(Resource.NameSingular) to teach them not to mess with your clan.")
    @lpl(value="Displayed to all members of the village owner clan when a player who is a member of a different clan begins the process of requisitioning rewards from one of its levy collector")
    public static final lox utt = uta.a("LevyCollectorRequisitioningStartedOtherClanMember", mcf.Bk("PlayerName"), mcf.Bk("ClanName"), mcf.Bp("CityID"), mcf.Bl("Resource"));
    @lok(value="$(ClanRank) $(PlayerName) has finished requisitioning goods from $(CityID). Escort them safely back to your clan vault!")
    @lpl(value="Displayed to all members of the village owner clan when a member of the clan completes the requisitioning of rewards from the village")
    public static final lox utu = uta.a("LevyCollectorRequisitioningCompletedClanMember", mcf.b("ClanRank", bbs.class), mcf.Bk("PlayerName"), mcf.Bp("CityID"));
    @lok(value="$(PlayerName) has just finished requisitioning your goods from $(CityID)! They're escaping the rewards of your hard work!")
    @lpl(value="Displayed to all members of the city owner clan when a player who is not a member of a clan completes the requisitioning of rewards from the levy collector")
    public static final lox utv = uta.a("LevyCollectorRequisitioningCompletedNonClanMember", mcf.Bk("PlayerName"), mcf.Bp("CityID"));
    @lok(value="$(PlayerName) of the clan $(ClanName) has just finished requisitioning your goods from $(CityID)! They're escaping the rewards of your hard work!")
    @lpl(value="Displayed to all members of the city owner clan when a member of another clan completes the requisitioning of rewards from the levy collector")
    public static final lox utw = uta.a("LevyCollectorRequisitioningCompletedOtherClanMember", mcf.Bk("PlayerName"), mcf.Bk("ClanName"), mcf.Bp("CityID"));
    @lok(value="Requisitioning of goods and levy from the city of $(CityID) has now been completed.")
    @lpl(value="Displayed to all online players when the requisitioning of rewards from the levy collector has been completed")
    public static final lox utx = uta.a("LevyCollectorRequisitioningCompletedGlobal", mcf.Bp("CityID"));
    @lok(value="City of $(CityID) is siege protected, therefore the $(Resource.NameSingular) is not available for requisitioning.")
    @lpl(value="Displayed to all online players when the requisitioning of rewards from the levy collector is not possible due to an active siege protection to the holding owner")
    public static final lox uty = uta.a("LevyCollectorCityUnderSiege", mcf.Bp("CityID"), mcf.Bl("Resource"));
    @lok(value="$(Resource.NameSingular) in the City of $(CityID) is now actively levying goods from your lands again.")
    @lpl(value="Displayed to all clan members that city's levy collector is enabled again")
    public static final lox utz = uta.a("LevyCollectorEnabled", mcf.Bp("CityID"), mcf.Bl("Resource"));

    protected mcf(String string) {
        super("LevyCollector." + string);
    }

    private mcf() {
        super("LevyCollector");
    }
}

