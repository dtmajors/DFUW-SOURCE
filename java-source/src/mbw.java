/*
 * Decompiled with CFR.
 */
public class mbw
extends lzh {
    private static final mbw uol = new mbw();
    @lok(value="This Resource Monolith is currently disabled")
    @lpl(value="Displayed to a player when they try to interact with a disabled hill fortress")
    public static final lox uom = uol.BC("Disabled");
    @lok(value="Someone else is taking ownership of this Resource Monolith")
    @lpl(value="Displayed to a player when they try to take ownership of a hill fortress, but another player is already doing so")
    public static final lox uon = uol.BC("RequestPending");
    @lok(value="A nearby Resource Monolith has been conquered by $(PlayerName)")
    @lpl(value="Displayed to all players in the local area, when a player takes ownership of a hill fortress")
    public static final lox uoo = uol.a("Conquered", mbw.Bk("PlayerName"));
    @lok(value="Another player already owns this Resource Monolith")
    @lpl(value="Displayed to a player when they try to take ownership of a hill fortress, but another player already owns it")
    public static final lox scN = uol.BC("Owned");
    @lok(value="You are already the owner of this Resource Monolith")
    @lpl(value="Displayed to a player when they try to take ownership of a hill fortress, but they already own it")
    public static final lox uop = uol.BC("OwnedByPlayer");
    @lok(value="Request failed")
    @lpl(value="Displayed to a player when they try to take ownership of a hill fortress, but a non-specific error occurrs")
    public static final lox uoq = uol.BC("RequestFailed");
    @lok(value="Trial account players cannot conquer Resource Monoliths")
    @lpl(value="Displayed to a player when they try to take ownership of a hill fortress, but they are using a trial account")
    public static final lox uor = uol.BC("PlayerIsTrialAccount");
    @lok(value="You are too far from your Resource Monolith, return back to the area to keep ownerhip of the Resource Monolith")
    @lpl(value="Displayed to a player when they move too far from a hill fortress, that they own, to maintain their ownership of it")
    public static final lox uos = uol.BC("OutOfAreaWarning");
    @lok(value="You are back in the area limit")
    @lpl(value="Displayed to a player that had moved too far from a hill fortress, that they own, but has now moved close enough again to maintain their ownership")
    public static final lox uot = uol.BC("BackInArea");
    @lok(value="You lost the ownership of the Resource Monolith because you stayed too far away for too long!")
    @lpl(value="Displayed to a player that loses ownership of a hill fortress, because they moved too far away from it for too long")
    public static final lox uou = uol.BC("LostAccessOutOfArea");
    @lok(value="Ownership of the Resource Monolith has been lost because of time-out... You can try to regain ownership again, if you like")
    @lpl(value="Displayed to a player when their ownership of a hill fortress has reached its maximum length, and they have now lost ownership of it")
    public static final lox uov = uol.BC("LostAccessTimeOut");
    @lok(value="Your Resource Monolith rewarded you with $(RewardQuantity) $(ResourceReward.Name$(RewardQuantity.Plurality)) in your backpack")
    @lpl(value="Displayed to a player when they receive a reward for ownership of a hill fortress, which has been placed in their backpack")
    public static final lox uow = uol.a("ItemAddedInventory", mbw.Bh("RewardQuantity"), mbw.Bl("ResourceReward"));
    @lok(value="Your Resource Monolith rewarded you with $(RewardQuantity) $(ResourceReward.Name$(RewardQuantity.Plurality)) in your bank")
    @lpl(value="Displayed to a player when they receive a reward for ownership of a hill fortress, which has been placed in their bank")
    public static final lox uox = uol.a("ItemAddedBank", mbw.Bh("RewardQuantity"), mbw.Bl("ResourceReward"));

    protected mbw(String string) {
        super("HillFortresses." + string);
    }

    private mbw() {
        super("HillFortresses");
    }
}

