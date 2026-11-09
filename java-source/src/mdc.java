/*
 * Decompiled with CFR.
 */
public class mdc
extends lzh {
    private static final mdc uEL = new mdc();
    @lok(value="Trial accounts are not allowed to conquer a village.")
    @lpl(value="Displayed when the player tries to conquer a village control point playing with a trial account.")
    public static final lox uEM = uEL.BC("ControlPointConquestNotPermitted");
    @lok(value="Trial accounts are not allowed to conquer a city or a hamlet.")
    @lpl(value="Displayed when the player tries to conquer a city playing with a trial account.")
    public static final lox uEN = uEL.BC("CityConquestNotPermitted");
    @lok(value="Trial accounts are not allowed to conquer a fortress.")
    @lpl(value="Displayed when the player tries to conquer a fortress playing with a trial account.")
    public static final lox uEO = uEL.BC("FortressConquestNotPermitted");
    @lok(value="Trial accounts are not allowed to buy extra weapon slots.")
    @lpl(value="Displayed when the player tries to buy some extra slots for default weapons.")
    public static final lox uEP = uEL.BC("CanNotBuyExtraSlots");
    @lok(value="Trial accounts are not allowed to learn this skill.")
    @lpl(value="Displayed when the player, playing with a trial account, tries to learn a skill which is locked for trial accounts.")
    public static final lox uEQ = uEL.BC("CanNotLearnThisSkill");
    @lok(value="Trial accounts are not allowed to own a house.")
    @lpl(value="Displayed when the player, playing with a trial account, tries to place a house deed.")
    public static final lox uER = uEL.BC("CanNotOwnAHouse");
    @lok(value="Trial accounts are not allowed to buy skill extensions.")
    @lpl(value="Displayed when the player, playing with a trial account, tries to add a skill extension.")
    public static final lox uES = uEL.BC("SkillExtensionNotPermitted");
    @lok(value="Trial accounts are not allowed to use boats.")
    @lpl(value="Displayed when the player, playing with a trial account, tries to use a boat.")
    public static final lox uET = uEL.BC("CanNotUseBoats");
    @lok(value="Trial accounts are not allowed to use cannons.")
    @lpl(value="Displayed when the player, playing with a trial account, tries to use a cannon.")
    public static final lox uEU = uEL.BC("CanNotUseCannons");
    @lok(value="Trial accounts are not allowed to use warhulks.")
    @lpl(value="Displayed when the player, playing with a trial account, tries to use a warhulk.")
    public static final lox uEV = uEL.BC("CanNotUseWarhulks");
    @lok(value="Trial accounts are not allowed to create a party.")
    @lpl(value="Displayed when the player, playing with a trial account, tries to create a party.")
    public static final lox uEW = uEL.BC("CanNotCreateParty");
    @lok(value="Trial accounts are not allowed to use airships.")
    @lpl(value="Displayed when the player, playing with a trial account, tries to use an airship.")
    public static final lox uEX = uEL.BC("CanNotUseAirships");
    @lok(value="Trial accounts are not allowed to use siege engines.")
    @lpl(value="Displayed when the player, playing with a trial account, tries to use a siege engine.")
    public static final lox uEY = uEL.BC("CanNotUseSiegeEngines");
    @lok(value="You have reached your daily $(Skill.NameSingular) limit... Purchace a full account to continue harvesting using $(Skill.NameSingular)")
    @lpl(value="Displayed when the player, playing with a trial account, tries to start a harvesting skill, but they have reached their daily harvesting limit for this skill")
    public static final lox uEZ = uEL.a("CannotHarvestMoreToday", mdc.Bm("Skill"));
    @lok(value="As you have reached the trial account Prowess limit, the Prowess you just earned has been set aside, and will be unavailable to you, until you purchase a full account!")
    @lpl(value="Displayed when the player, playing with a trial account, earns prowess beyond the defined prowess limit for trial accounts")
    public static final lox uFa = uEL.BC("ProwessPosponed");
    @lok(value="Trial accounts are not allowed to use $(Resource.NamePlural)")
    @lpl(value="Displayed when a player, playing with a trial account, tries to use a restricted resource")
    public static final lox uFb = uEL.a("CannotUseResource", mdc.Bl("Resource"));
    @lok(value="Trial accounts are not allowed to write to this chat channel!")
    @lpl(value="Displayed when a player, playing with a trial account, tries to write to a restricted chat channel")
    public static final lox uFc = uEL.BC("CannotWriteToChatChannel");
    @lok(value="You cannot place buy orders while using a trial account... purchase a full account to gain unrestricted access to the market")
    @lpl(value="Displayed to a trial account player when they attempt to place a buy order on a market, but the current trial account restriction setting do not allow it")
    public static final lox uFd = uEL.BC("CannotPlaceMarketBuyOrders");
    @lok(value="You cannot place sell orders while using a trial account... purchase a full account to gain unrestricted access to the market")
    @lpl(value="Displayed to a trial account player when they attempt to place a sell order on a market, but the current trial account restriction setting do not allow it")
    public static final lox uFe = uEL.BC("CannotPlaceMarketSellOrders");
    @lok(value="You cannot fulfil buy orders while using a trial account... purchase a full account to gain unrestricted access to the market")
    @lpl(value="Displayed to a trial account player when they attempt to fulfil a buy order on a market, but the current trial account restriction setting do not allow it")
    public static final lox uFf = uEL.BC("CannotFulfilMarketBuyOrders");
    @lok(value="You cannot fulfil sell orders while using a trial account... purchase a full account to gain unrestricted access to the market")
    @lpl(value="Displayed to a trial account player when they attempt to fulfil a sell order on a market, but the current trial account restriction setting do not allow it")
    public static final lox uFg = uEL.BC("CannotFulfilMarketSellOrders");

    protected mdc(String string) {
        super("Trial." + string);
    }

    private mdc() {
        super("Trial");
    }
}

