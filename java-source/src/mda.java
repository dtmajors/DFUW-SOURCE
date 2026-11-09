/*
 * Decompiled with CFR.
 */
public class mda
extends lzh {
    private static final mda uEi = new mda();
    @lok(value="$(TradeRouteName) is not open yet... It will open in $(CountDown)")
    @lpl(value="Displayed when a player attempts to begin a trade route that is not yet available")
    public static final lox uEj = uEi.a("NotReady", mda.Bk("TradeRouteName"), mda.Bi("CountDown"));
    @lok(value="You don't have enough $(CostResource.Name$(Cost.Plurality)) in your backpack to make a trade route run... You need at least $(Cost) $(CostResource.Name$(Cost.Plurality))")
    @lpl(value="Displayed when a player does not have enough gold to begin the trade route")
    public static final lox uev = uEi.a("NotEnoughGold", mda.Bl("CostResource"), mda.Bh("Cost"));
    @lok(value="$(TradeRouteName) has no more goods... Check back when it re-opens")
    @lpl(value="Displayed when a player attempts to begin a trade route that has been depleated of all goods")
    public static final lox sdM = uEi.a("Empty", mda.Bk("TradeRouteName"));
    @lok(value="Deliver these goods to $(TradeRouteEndName)... You will receive between $(MinimumReward) and $(MaximumReward) $(RewardResource.NameSingular) in payment, upon delivery, depending on how fast you complete the route")
    @lpl(value="Displayed when a player accepts a trade route and the route begins")
    public static final lox uEk = uEi.a("Accepted", mda.Bk("TradeRouteEndName"), mda.Bh("MinimumReward"), mda.Bh("MaximumReward"), mda.Bl("RewardResource"));
    @lok(value="You can not carry any more goods")
    @lpl(value="Displayed to a player when they are already carrying the maximum allowed goods for a trade route, and attempt to carry more")
    public static final lox uEl = uEi.BC("MaxDeliveryReached");
    @lok(value="You don't have anything to deliver")
    @lpl(value="Displayed to a player when they attempt to complete a trade route, but do not have any deliverable goods")
    public static final lox uEm = uEi.BC("NothingToDeliver");
    @lok(value="This is not the correct destination for your active trade route")
    @lpl(value="Displayed to a player when they attempt to complete a trade route, but they are at the wrong destination")
    public static final lox uEn = uEi.BC("WrongDestination");
    @lok(value="The trade route did not accept your delivery... please try again")
    @lpl(value="Displayed to a player when they attempt to complete a trade route, but an unhandled error occurrs")
    public static final lox uEo = uEi.BC("DeliveryNotAccepted");
    @lok(value="You took too long to deliver your goods... you receive no rewards")
    @lpl(value="Displayed to a player when they complete a trade route, but the maximum time has already passed")
    public static final lox uEp = uEi.BC("DeliveryTooLate");
    @lok(value="You cannot deliver your goods at this time... wait until the destination is available and try again")
    @lpl(value="Displayed to a player when they attempt to complete a trade route, but the minimum time has not yet passed")
    public static final lox uEq = uEi.BC("DeliveryTooSoon");
    @lok(value="$(NPCName) thanks you for completing trade route run $(RunCount)... you have received $(RewardQuantity) $(RewardResource.Name$(RewardQuantity.Plurality)) as a reward")
    @lpl(value="Displayed to a player when they successfully complete a trade route, and receive a reward")
    public static final lox uEr = uEi.a("DeliverySuccessWithReward", mda.Bk("NPCName"), mda.Bh("RunCount"), mda.Bh("RewardQuantity"), mda.Bl("RewardResource"));
    @lok(value="$(NPCName) thanks you for completing trade route run $(RunCount)... as a reward for delivering your goods so fast, you have receved $(RewardQuantity) $(RewardResource.Name$(RewardQuantity.Plurality)) as a bonus reward")
    @lpl(value="Displayed to a player when they successfully complete a trade route, and receive a speed bonus reward")
    public static final lox uEs = uEi.a("DeliverySuccessWithRewardAndBonus", mda.Bk("NPCName"), mda.Bh("RunCount"), mda.Bh("RewardQuantity"), mda.Bl("RewardResource"));
    @lok(value="$(NPCName) has also given you $(RewardQuantity) $(RewardResource.Name$(RewardQuantity.Plurality)) as an additional reward for completing your trade route")
    @lpl(value="Displayed to a player when they successfully complete a trade route, and receive additional rewards")
    public static final lox uEt = uEi.a("DeliverySuccessWithAdditionalReward", mda.Bk("NPCName"), mda.Bh("RewardQuantity"), mda.Bl("RewardResource"));
    @lok(value="$(TradeRouteName) is now open for business")
    @lpl(value="Displayed to all on-line players when a trade route opens")
    public static final lox uEu = uEi.a("SystemOpenGlobal", mda.Bk("TradeRouteName"));
    @lok(value="$(TradeRouteName) is now closed")
    @lpl(value="Displayed to all on-line players when a trade route closes due to time-out")
    public static final lox uEv = uEi.a("SystemClosedTimerGlobal", mda.Bk("TradeRouteName"));
    @lok(value="$(TradeRouteName) has run out of goods and has closed for the time being")
    @lpl(value="Displayed to all on-line players when a trade route closes due to not having any goods left")
    public static final lox uEw = uEi.a("SystemClosedEmptyGlobal", mda.Bk("TradeRouteName"));

    protected mda(String string) {
        super("TradeRoutes." + string);
    }

    private mda() {
        super("TradeRoutes");
    }
}

