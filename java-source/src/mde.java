/*
 * Decompiled with CFR.
 */
public class mde
extends lzh {
    private static final mde uFx = new mde();
    @lok(value="Linking to the control-point of $(VillageID) failed!... please try again!")
    @lpl(value="Displayed to a player when they attempt to link to a village control-point an the attempt fails due to an error")
    public static final lox utb = uFx.a("InvalidLink", mde.Bq("VillageID"));
    @lok(value="No rewards are currently available for requisitioning in $(VillageID)... try again later!")
    @lpl(value="Displayed to a player when they attempt to link to a village control-point and the attempt fails because there are not rewards in the control-point that are ready for retrieval")
    public static final lox utc = uFx.a("NoResourcesToRetrieve", mde.Bq("VillageID"));
    @lok(value="Another player is already linked to the control-point of $(VillageID)... you must break their link before creating your own!")
    @lpl(value="Displayed to a player when they attempt to link to a village control-point and the attempt fails because another player is already linked")
    public static final lox utd = uFx.a("PlayerAlreadyLinked", mde.Bq("VillageID"));
    @lok(value="You moved too far from the control-point of $(VillageID) to remain linked... you must remain within $(MaxDistance)m to maintain your link!")
    @lpl(value="Displayed to a player when their link to a village control-point is removed due to them moving too far from the control-point ")
    public static final lox uFy = uFx.a("TooFarFromControlPoint", mde.Bq("VillageID"), mde.Bh("MaxDistance"));
    @lok(value="You are now linked to the control-point of $(VillageID)... you must stay within $(MaxDistance)m, and in clear line-of-sight, of the control-point to maintain your link!")
    @lpl(value="Displayed to a player when they attempt to link to a village control-point and the attempt succeeds")
    public static final lox utf = uFx.a("LinkCreatedSuccessfully", mde.Bq("VillageID"), mde.Bh("MaxDistance"));
    @lok(value="Before you can begin requisitioning rewards from $(VillageID), you must first remove the existing $(AmmoResource.NamePlural) from the control-point... removed $(AmmoResource.NamePlural) will be placed in your back-pack")
    @lpl(value="Displayed to a player when they successfully link to a village control-point, but must remove existing ammo, before supplying their own")
    public static final lox utg = uFx.a("PointsToRemoveInformation", mde.Bq("VillageID"), mde.Bl("AmmoResource"));
    @lok(value="$(PlayerName) has linked to the control-point of $(VillageID)... break their link before they steal all of your supplied $(AmmoResource.NamePlural)")
    @lpl(value="Displayed to a player, or their party, when another player links to a village control-point that they have supplied ammo to")
    public static final lox uth = uFx.a("OtherPlayerLinkedWarning", mde.Bk("PlayerName"), mde.Bq("VillageID"), mde.Bl("AmmoResource"));
    @lok(value="$(PlayerName) is no longer linked to the control-point of $(VillageID)!")
    @lpl(value="Displayed to all members of a party, when a member's link to a village control-point is broken after supplying ammo to it")
    public static final lox uti = uFx.a("PartyMemberLinkBrokenWarning", mde.Bk("PlayerName"), mde.Bq("VillageID"));
    @lok(value="To requisition the rewards from $(VillageID) you must remain linked for long enough to supply $(RequiredPoints) $(AmmoResource.Name$(RequiredPoints.Plurality)) to the control-point!")
    @lpl(value="Displayed to a player, that is a member of a party, when they create a link to a village control-point, to inform them how to complete the task")
    public static final lox utj = uFx.a("RequisitioningInstructions", mde.Bq("VillageID"), mde.Bh("RequiredPoints"), mde.Bl("AmmoResource"));
    @lok(value="To requisition the rewards from $(VillageID) you, or members of your party, must remain linked for long enough to supply $(RequiredPoints) $(AmmoResource.Name$(RequiredPoints.Plurality)) to the control-point!")
    @lpl(value="Displayed to a player, that is a member of a party, when they create a link to a village control-point, to inform them how to complete the task")
    public static final lox utk = uFx.a("RequisitioningInstructionsPartyMember", mde.Bq("VillageID"), mde.Bh("RequiredPoints"), mde.Bl("AmmoResource"));
    @lok(value="Your link to the control-point of $(VillageID) has been broken, as you do not have any $(AmmoResource.NameSingular) remaining in your back-pack!")
    @lpl(value="Displayed to a player when their link to a village control-point is broken due to them not having any more ammo in their back-pack")
    public static final lox utl = uFx.a("LinkCancelledNoAmmo", mde.Bq("VillageID"), mde.Bl("AmmoResource"));
    @lok(value="The $(AmmoResource.NamePlural) you supplied to the control-point of $(VillageID) will begin to decay... you must re-link to the control-point as fast as you can to prevent this!")
    @lpl(value="Displayed to a player when their link to a village control-point is broken, after supplying ammo, to warn them that the supplied ammo will decay over time while they are not linked")
    public static final lox utm = uFx.a("PointsDecayWarning", mde.Bq("VillageID"), mde.Bl("AmmoResource"));
    @lok(value="The $(AmmoResource.NamePlural) supplied to the control-point of $(VillageID) will begin to decay... a party member must link to the control-point as fast as possible to prevent this!")
    @lpl(value="Displayed to all members of a party, when a member's link to a village control-point is broken, after supplying ammo, to warn them that the supplied ammo will decay over time while no party members are linked")
    public static final lox utn = uFx.a("PointsDecayWarningPartyMember", mde.Bq("VillageID"), mde.Bl("AmmoResource"));
    @lok(value="You have successfully requisitioned the rewards from $(VillageID)... they have been placed into your back-pack!")
    @lpl(value="Displayed to a player when they complete the process of requisitioning from a village control-point and they have received the rewards")
    public static final lox utp = uFx.a("RequisitioningCompleted", mde.Bq("VillageID"));
    @lok(value="Your party has successfully requisitioned the rewards from $(VillageID)... the rewards have been divided between all eligible party members and placed into your back-packs!")
    @lpl(value="Displayed to a member of a party, when they complete the process of requisitioning from a village control-point and they have received the rewards")
    public static final lox uto = uFx.a("RequisitioningCompletedParty", mde.Bq("VillageID"));

    protected mde(String string) {
        super("Villages." + string);
    }

    private mde() {
        super("Villages");
    }
}

