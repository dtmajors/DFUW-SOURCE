/*
 * Decompiled with CFR.
 */
public class mcm
extends lzh {
    private static final mcm uwi = new mcm();
    @lok(value="Prowess : $(Prowess)")
    @lpl(value="Display the prowess starting balance.")
    public static final lox rTO = uwi.a("StartingBalance", mcm.ah("Prowess", 2));
    @lok(value="You have gained $(Prowess) Prowess from resource stealing.")
    @lpl(value="Display the prowess points gain via resource stealing.")
    public static final lox uwj = uwi.a("ResourceStealing", mcm.ah("Prowess", 2));
    @lok(value="Your Prowess has been altered by an administrator by : $(Prowess)")
    @lpl(value="Display prowess points assigned by a game admin.")
    public static final lox uwk = uwi.a("FromGM", mcm.ah("Prowess", 2));
    @lok(value="You have gained $(Prowess) Prowess (Feat Progress).")
    @lpl(value="Display the prowess gained via a feat completion.")
    public static final lox uwl = uwi.a("FromFeat", mcm.ah("Prowess", 2));
    @lok(value="You have gained $(Prowess) Prowess from $(ProwessMonolith.NameSingular).")
    @lpl(value="Display the prowess gained via a prowess monolith.")
    public static final lox uwm = uwi.a("FromProwessMonolith", mcm.ah("Prowess", 0), mcm.Bl("ProwessMonolith"));
    @lok(value="You have gained $(Prowess) Prowess (Party Activity).")
    @lpl(value="Display the prowess gained via an action, player did, while is in a party.")
    public static final lox uwn = uwi.a("PartySourceMember", mcm.ah("Prowess", 2));
    @lok(value="You have been rewarded with $(Prowess) Prowess as a party member.")
    @lpl(value="Display the prowess gained as a member in a party when another member kills/destroys something.")
    public static final lox uwo = uwi.a("PartyMember", mcm.ah("Prowess", 2));
    @lok(value="You have gained $(Prowess) Prowess (Activity)")
    @lpl(value="Display the prowess gained via an action (gather/kill a monster etc).")
    public static final lox uwp = uwi.a("FromAction", mcm.ah("Prowess", 2));
    @lok(value="For your invaluable aid you have received $(Prowess) Prowess.")
    @lpl(value="Display the prowess gained when there is an active spirit bond link with a player who killed something.")
    public static final lox uwq = uwi.a("FromSupport", mcm.ah("Prowess", 2));
    @lok(value="Your skilled mentoring has yeilded $(Prowess) Prowess.")
    @lpl(value="Display the prowess gained when there is an active spirit bond link with a player who killed something.")
    public static final lox uwr = uwi.a("FromMentoring", mcm.ah("Prowess", 2));
    @lok(value="You have gained $(Prowess) Prowess from the completion of a quest.")
    @lpl(value="Display the prowess gained via completing a quest.")
    public static final lox uws = uwi.a("FromQuest", mcm.ah("Prowess", 2));
    @lok(value="You have gained a small amount of Prowess (Activity).")
    @lpl(value="Display that a small amount of prowess gained.")
    public static final lox uwt = uwi.BC("Tiny");
    @lok(value="Your prowess has increased!")
    @lpl(value="Display that a small amount of prowess gained.")
    public static final lox uwu = uwi.BC("TinyFromMentoring");
    @lok(value="You have spent $(Prowess) Prowess by purchasing a booster.")
    @lpl(value="Display the prowess spent by purchasing a booster.")
    public static final lox uwv = uwi.a("ToBooster", mcm.ah("Prowess", 2));
    @lok(value="You have spent $(Prowess) Prowess via a vendor transaction.")
    @lpl(value="Display the prowess spent via a vendor transaction.")
    public static final lox uww = uwi.a("ToVendor", mcm.ah("Prowess", 2));
    @lok(value="You have spent $(Prowess) Prowess to level up a skill.")
    @lpl(value="Display the prowess spent via bying points to level up a skill.")
    public static final lox uwx = uwi.a("ToLevelUp", mcm.ah("Prowess", 2));
    @lok(value="You have spent $(Prowess) Prowess to level up an attribute.")
    @lpl(value="Display the prowess spent via bying points to level up an attribute.")
    public static final lox uwy = uwi.a("ToLevelUpAttribute", mcm.ah("Prowess", 2));
    @lok(value="You have spent $(Prowess) Prowess to buy a perk.")
    @lpl(value="Display the prowess spent via bying points to level up an attribute.")
    public static final lox uwz = uwi.a("ToBuyPerk", mcm.ah("Prowess", 2));
    @lok(value="You have spent $(Prowess) Prowess to upgrade a perk.")
    @lpl(value="Display the prowess spent via bying points to level up an attribute.")
    public static final lox uwA = uwi.a("ToUpgradePerk", mcm.ah("Prowess", 2));
    @lok(value="You have spent $(Prowess) Prowess to activate a perk.")
    @lpl(value="Display the prowess spent via bying points to level up an attribute.")
    public static final lox uwB = uwi.a("ToActivatePerk", mcm.ah("Prowess", 2));
    @lok(value="$(Prowess) Prowess Points were reset. ")
    @lpl(value="Displays the amount of prowess points that were reset by spending selentine gold.")
    public static final lox uwC = uwi.a("ResetProwessPoints", mcm.Bh("Prowess"));
    @lok(value="As a non-trial account, you now have access to the additional $(Prowess) Prowess that you earned as a trial account player!")
    @lpl(value="Dsiplayed when a trial account player becomes a non-trial player and gains access to the prowess that was postponed during their trial account period")
    public static final lox uwD = uwi.a("FromBecommingNonTrial", mcm.Bh("Prowess"));
    @lok(value="Demon wants to thank you for the sacrifice of $(Resource.NameSingular) providing to you  $(Prowess) Prowess.")
    @lpl(value="Display the prowess gained when there a player sacrifices a relic in the demonic altar.")
    public static final lox uwE = uwi.a("FromDestroyingRelic", mcm.Bl("Resource"), mcm.ah("Prowess", 2));

    protected mcm(String string) {
        super("Prowess." + string);
    }

    private mcm() {
        super("Prowess");
    }
}

