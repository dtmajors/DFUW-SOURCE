/*
 * Decompiled with CFR.
 */
public class mdd
extends lzh {
    private static final mdd uFh = new mdd();
    @lok(value="You already have a pending transaction.")
    @lpl(value="Displayed when the player tries to initiate a transaction when there is already one active.")
    public static final lox uFi = uFh.BC("FoundPendingTransaction");
    @lok(value="You are purchasing too fast.")
    @lol(value="No barbers")
    public static final lox uFj = uFh.BC("TooFast");
    @lok(value="One or more items could not be bought.")
    @lpl(value="Displayed when the player fails to buy one or more items during the buy operation.")
    public static final lox uFk = uFh.BC("ItemsNotBought");
    @lok(value="One or more items could not be sold.")
    @lpl(value="Displayed when the player fails to sell one or more items during the sell operation.")
    public static final lox uFl = uFh.BC("ItemsNotSold");
    @lok(value="Your level is too low for the skill you wish to purchase. As the grizzled warrior said, \"grow stronger!\"")
    @lpl(value="Displayed when the player fails to learn a skill because the vendor for some reason does not posses the skill.")
    public static final lox uFm = uFh.BC("SkillNotLearned");
    @lok(value="You bought one or more items.")
    @lpl(value="Displayed when the player buys one or more items.")
    public static final lox uFn = uFh.BC("ItemsWereBought");
    @lok(value="You sold one or more items.")
    @lpl(value="Displayed when the player sells one or more items.")
    public static final lox uFo = uFh.BC("ItemsWereSold");
    @lok(value="You learned a skill.")
    @lpl(value="Displayed when the player learns a new skill from a vendor.")
    public static final lox uFp = uFh.BC("SkillWasLearned");
    @lok(value="You bought a skill extension.")
    @lol(value="No skill extensions")
    public static final lox uFq = uFh.BC("SkillExtensionWasBought");
    @lok(value="You were unable to buy the skill extension.")
    @lol(value="No skill extensions")
    public static final lox uFr = uFh.BC("SkillExtensionNotBought");
    @lok(value="The skill extension is invalid.")
    @lol(value="No skill extensions")
    public static final lox uFs = uFh.BC("SkillExtensionNotFound");
    @lok(value="Your visual features were changed.")
    @lol(value="No barbers")
    public static final lox uFt = uFh.BC("VisualFeaturesChanged");
    @lok(value="Your visual features were not changed.")
    @lol(value="No barbers")
    public static final lox uFu = uFh.BC("VisualFeaturesNotChanged");
    @lok(value="You removed a skill extension.")
    @lol(value="No skill extensions")
    public static final lox uFv = uFh.BC("SkillExtensionWasRemoved");
    @lok(value="$(Vendor.Profession) $(Vendor.Name) is ignoring you!")
    @lpl(value="Displayed when a player tries interact with a quest vendor that is not currently enabled")
    public static final lox uFw = uFh.a("QuestVendorDisabled", mdd.Bv("Vendor"));

    protected mdd(String string) {
        super("Vendor." + string);
    }

    private mdd() {
        super("Vendor");
    }
}

