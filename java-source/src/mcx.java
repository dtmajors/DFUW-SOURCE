/*
 * Decompiled with CFR.
 */
public class mcx
extends lzh {
    private static final mcx uCA = new mcx();
    @lok(value="Your $(Resource.NameSingular) vanished with the passage of time.")
    @lol(value="System is not enabled.")
    public static final lox uCB = uCA.a("EntranceTimeOut", mcx.Bl("Resource"));
    @lok(value="Your $(Resource.NameSingular) vanished with the passage of time.")
    @lol(value="System is not enabled.")
    public static final lox uCC = uCA.a("GeneralTimeOut", mcx.Bl("Resource"));
    @lok(value="You must stand still to place a $(Resource.NameSingular).")
    @lol(value="System is not enabled.")
    public static final lox uCD = uCA.a("PlacementGeneral", mcx.Bl("Resource"));
    @lok(value="You already have a $(Resource.NameSingular). You can only have one active at a time.")
    @lol(value="System is not enabled.")
    public static final lox uCE = uCA.a("AlreadyGeneralAnEntrance", mcx.Bl("Resource"));
    @lok(value="You already have a $(Resource.NameSingular). You can only have one active at a time.")
    @lol(value="System is not enabled.")
    public static final lox uCF = uCA.a("AlreadyHaveAnExit", mcx.Bl("Resource"));
    @lok(value="A $(Resource.NameSingular) must be placed before you can create a $(ResourceAlt.NameSingular).")
    @lol(value="System is not enabled.")
    public static final lox uCG = uCA.a("NeedEntranceBeforeExit", mcx.Bl("Resource"), mcx.Bl("ResourceAlt"));
    @lok(value="Your $(Resource.NameSingular) is too close to another $(ResourceAlt.NameSingular).")
    @lol(value="System is not enabled.")
    public static final lox uCH = uCA.a("ExitTooClose", mcx.Bl("Resource"), mcx.Bl("ResourceAlt"));
    @lok(value="You can not place a $(Resource.NameSingular) here.")
    @lol(value="System is not enabled.")
    public static final lox uCI = uCA.a("NoSuitablePlace", mcx.Bl("Resource"));
    @lok(value="Could not remove $(Resource.NameSingular) from your backpack.")
    @lol(value="System is not enabled.")
    public static final lox uCJ = uCA.a("CouldNotRemoveFromBackPack", mcx.Bl("Resource"));
    @lok(value="Your $(Resource.NameSingular) is being attacked!")
    @lol(value="System is not enabled.")
    public static final lox uCK = uCA.a("EntranceAttacked", mcx.Bl("Resource"));
    @lok(value="Your $(Resource.NameSingular) is being attacked!")
    @lol(value="System is not enabled.")
    public static final lox uCL = uCA.a("ExitAttacked", mcx.Bl("Resource"));
    @lok(value="Your $(Resource.NameSingular) was removed because of maximum limit of teleports was reached!")
    @lol(value="System is not enabled.")
    public static final lox uCM = uCA.a("RemovedMaximumTeleportersReached", mcx.Bl("Resource"));
    @lok(value="$(PlayerName) used your $(Resource.NameSingular).")
    @lol(value="System is not enabled.")
    public static final lox uCN = uCA.a("NonClanAccess", mcx.Bk("PlayerName"), mcx.Bl("Resource"));
    @lok(value="$(PlayerTitle) $(PlayerName) from the $(Clan) used your $(Resource.NameSingular).")
    @lol(value="System is not enabled.")
    public static final lox uCO = uCA.a("ClanAccess", mcx.Bk("PlayerTitle"), mcx.Bk("PlayerName"), mcx.Bk("Clan"), mcx.Bl("Resource"));
    @lok(value="$(PlayerName) destroyed your $(Resource.NameSingular)!")
    @lol(value="System is not enabled.")
    public static final lox uCP = uCA.a("NonClanDestroyedExit", mcx.Bk("PlayerName"), mcx.Bl("Resource"));
    @lok(value="$(PlayerTitle) $(PlayerName) from $(Clan) destroyed your $(Resource.NameSingular)!")
    @lol(value="System is not enabled.")
    public static final lox uCQ = uCA.a("ClanDestroyedExit", mcx.Bk("PlayerTitle"), mcx.Bk("PlayerName"), mcx.Bk("Clan"), mcx.Bl("Resource"));
    @lok(value="$(PlayerName) destroyed your $(Resource.NameSingular)!")
    @lol(value="System is not enabled.")
    public static final lox uCR = uCA.a("NonClanDestroyedEntrance", mcx.Bk("PlayerName"), mcx.Bl("Resource"));
    @lok(value="$(PlayerTitle) $(PlayerName) from $(Clan) destroyed your $(Resource.NameSingular)!")
    @lol(value="System is not enabled.")
    public static final lox uCS = uCA.a("ClanDestroyedEntrance", mcx.Bk("PlayerTitle"), mcx.Bk("PlayerName"), mcx.Bk("Clan"), mcx.Bl("Resource"));
    @lok(value="Your $(Resource.NameSingular) was destroyed!")
    @lol(value="System is not enabled.")
    public static final lox uCT = uCA.a("DestroyedExit", mcx.Bl("Resource"));
    @lok(value="Your $(Resource.NameSingular) was destroyed!")
    @lol(value="System is not enabled.")
    public static final lox uCU = uCA.a("DestroyedEntrance", mcx.Bl("Resource"));
    @lok(value="This is not a $(Resource.NameSingular)!")
    @lol(value="System is not enabled.")
    public static final lox uCV = uCA.a("NotATeleporterEntrance", mcx.Bl("Resource"));
    @lok(value="This $(Resource.NameSingular) is destroyed!")
    @lol(value="System is not enabled.")
    public static final lox uCW = uCA.a("TeleporterDead", mcx.Bl("Resource"));
    @lok(value="The $(Resource.NameSingular) is recharging!")
    @lol(value="System is not enabled.")
    public static final lox uCX = uCA.a("TeleporteWaiting", mcx.Bl("Resource"));
    @lok(value="You do not have access to this $(Resource.NameSingular)!")
    @lol(value="System is not enabled.")
    public static final lox uCY = uCA.a("NoAccess", mcx.Bl("Resource"));

    protected mcx(String string) {
        super("Teleporters." + string);
    }

    private mcx() {
        super("Teleporters");
    }
}

