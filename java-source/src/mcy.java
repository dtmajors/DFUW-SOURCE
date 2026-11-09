/*
 * Decompiled with CFR.
 */
public class mcy
extends lzh {
    private static final mcy uCZ = new mcy();
    @lok(value="You have entered the territory of $(ClanName)!!!")
    @lpl(value="Displayed to a player when they enter a new territory that is owned by another clan")
    public static final lox uDa = uCZ.a("EnteredTerritoryOwnedByOtherClan", mcy.Bk("ClanName"));
    @lok(value="You have entered the territory of $(ClanName)... this is enemy territory, be careful!!!")
    @lpl(value="Displayed to a player when they enter a new territory that is owned by another clan that is an enemy of the player's clan")
    public static final lox uDb = uCZ.a("EnteredTerritoryOwnedByOtherClanEnemy", mcy.Bk("ClanName"));
    @lok(value="You have entered the territory of $(ClanName)... this is allied territory!!!")
    @lpl(value="Displayed to a player when they enter a new territory that is owned by another clna that is allied to the player's clan")
    public static final lox uDc = uCZ.a("EnteredTerritoryOwnedByOtherClanAlly", mcy.Bk("ClanName"));
    @lok(value="You have entered your clan's territory!!!")
    @lpl(value="Displayed to a player when they enter a new territory that is owned by the player's own clan")
    public static final lox uDd = uCZ.BC("EnteredTerritoryOwnedByPlayersClan");
    @lok(value="You have entered a territory that is not owned by a clan... capture the territorial object to claim it for your clan!!!")
    @lpl(value="Displayed to a player when they enter a new territory that is not owned by a clan and the player is a member of a clan")
    public static final lox uDe = uCZ.BC("EnteredTerritoryNoClanPlayerHasClan");
    @lok(value="You have entered a territory that is not owned by a clan!!!")
    @lpl(value="Displayed to a player when they enter a new territory that is not owned by a clan and the player is not a member of a clan")
    public static final lox uDf = uCZ.BC("EnteredTerritoryNoClanPlayerHasNoClan");
    @lok(value="The territory you are in is now owned by $(ClanName)!!!")
    @lpl(value="Displayed to a player when the territory that they are in changes owner to another clan")
    public static final lox uDg = uCZ.a("TerritoryOwnerChangedNewClanOtherClan", mcy.Bk("ClanName"));
    @lok(value="The territory you are in is now owned by $(ClanName)... this is now enemy territory, be careful!!!")
    @lpl(value="Displayed to a player when the territory that they are in changes owner to another clan that is an enemy of the player's clan")
    public static final lox uDh = uCZ.a("TerritoryOwnerChangedNewClanOtherClanEnemy", mcy.Bk("ClanName"));
    @lok(value="The territory you are in is now owned by $(ClanName)... this is now allied territory!!!")
    @lpl(value="Displayed to a player when the territory that they are in changes owner to another clan that is allied to the player's clan")
    public static final lox uDi = uCZ.a("TerritoryOwnerChangedNewClanOtherClanAlly", mcy.Bk("ClanName"));
    @lok(value="The territory you are in is now owned by your clan!!!")
    @lpl(value="Displayed to a player when the territory that they are in changes owner to the player's own clan")
    public static final lox uDj = uCZ.BC("TerritoryOwnerChangedNewClanPlayersClan");
    @lok(value="The territory you are in is no longer owned by any clan... capture the territorial object to claim it for your clan!!!")
    @lpl(value="Displayed to a player when the territory that they are in becomes unowned by any clan and the player is a member of a clan")
    public static final lox uDk = uCZ.BC("TerritoryOwnerChangedNoClanPlayerHasClan");
    @lok(value="The territory you are in is no longer owned by any clan!!!")
    @lpl(value="Displayed to a player when the territory that they are in becomes unowned by any clan and the player is not a member of a clan")
    public static final lox uDl = uCZ.BC("TerritoryOwnerChangedNoClanPlayerHasNoClan");
    @lok(value="The territory you are in is now enemy territory... be careful!!!")
    @lpl(value="Displayed to a player when the political stance between their clan and the clan that currently owns the territory that the player is in is changed to war")
    public static final lox uDm = uCZ.BC("TerritoryStanceChangedEnemy");
    @lok(value="The territory you are in is now allied territory!!!")
    @lpl(value="Displayed to a player when the political stance between their clan and the clan that currently owns the territory that the player is in is changed to allied")
    public static final lox uDn = uCZ.BC("TerritoryStanceChangedAlly");
    @lok(value="The territory you are in is not owned by a clan... capture the territorial object to claim it for your new clan!!!")
    @lpl(value="Displayed to a player when join a new clan while they are within a territory that is not owned by any clans")
    public static final lox uDo = uCZ.BC("ClanChangedNoClanPlayerHasClan");
    @lok(value="The territory you are in is not owned by a clan!!!")
    @lpl(value="Displayed to a player when they leave their clan while they are within a territory that is not owned by any clans")
    public static final lox uDp = uCZ.BC("ClanChangedNoClanPlayerHasNoClan");
    @lok(value="The territory you are in is owned by $(ClanName)!!!")
    @lpl(value="Displayed to a player when they join a new clan while they are within a territory that is owned by another clan with no political stance towards the player's new clan")
    public static final lox uDq = uCZ.a("ClanChangedClanOtherClan", mcy.Bk("ClanName"));
    @lok(value="The territory you are in is owned by $(ClanName)... this is enemy territory for your new clan, be careful!!!")
    @lpl(value="Displayed to a player when they join a new clan while they are within a territory that is owned by another clan who is an enemy of the player's new clan")
    public static final lox uDr = uCZ.a("ClanChangedClanOtherClanEnemy", mcy.Bk("ClanName"));
    @lok(value="The territory you are in is owned by $(ClanName)... this is allied territory for your new clan!!!")
    @lpl(value="Displayed to a player when they join a new clan while they are within a territory that is owned by another clan who is allied to the player's new clan")
    public static final lox uDs = uCZ.a("ClanChangedClanOtherClanAlly", mcy.Bk("ClanName"));
    @lok(value="The territory you are in is owned by your new clan!!!")
    @lpl(value="Displayed to a player when they join a new clan while they are within a territory that is owned by the player's new clan")
    public static final lox uDt = uCZ.BC("ClanChangedClanPlayersClan");
    @lok(value="Within this territory you receive +$(BonusMagnitude)% $(BonusName)")
    @lpl(value="Displayed to a player when the territory they are in, or their affiliation towards its owners, changes, to inform them of the new magnitude of a received increase bonus")
    public static final lox uDu = uCZ.a("TerritoryBonusIncrease", mcy.ah("BonusMagnitude", 2), mcy.b("BonusName", dmh.class));
    @lok(value="Within this territory you receive -$(BonusMagnitude)% $(BonusName)")
    @lpl(value="Displayed to a player when the territory they are in, or their affiliation towards its owners, changes, to inform them of the new magnitude of a received decrease bonus")
    public static final lox uDv = uCZ.a("TerritoryBonusDecrease", mcy.ah("BonusMagnitude", 2), mcy.b("BonusName", dmh.class));
    @lok(value="You have entered \"no-man's land\", you will receive no territorial bonuses here!!!")
    @lpl(value="Displayed to a player when they enter an area of the world that is not assigned to any territorial regions")
    public static final lox uDw = uCZ.BC("EnteredNoMansLand");
    @lok(value="You received $(ProwessBonus) extra Prowess, due to your territory bonus of +$(BonusMagnitude)% $(BonusName)")
    @lpl(value="Displayed to a player when they gain additional prowess due to bonuses applied by the territory that they are currently in")
    public static final lox uDx = uCZ.a("ProwessBonusApplied", mcy.ah("ProwessBonus", 2), mcy.ah("BonusMagnitude", 2), mcy.b("BonusName", dmh.class));
    @lok(value="You will receive no territorial bonuses here... capture the territory for your clan to receive its bonuses!!!")
    @lpl(value="Displayed to a player when they enter a region that they will receive no territorial bonuses from, and the player has a clan")
    public static final lox uDy = uCZ.BC("TerritoryBonusesZeroPlayerHasClan");
    @lok(value="You will receive no territorial bonuses here!!!")
    @lpl(value="Displayed to a player when they enter a region that they will receive no territorial bonuses from, and the player does not have a clan")
    public static final lox uDz = uCZ.BC("TerritoryBonusesZeroPlayerHasNoClan");
    @lok(value="The shape of your empire has changed!!!")
    @lpl(value="Displayed to a player when they are in a territorial region, owned by their clan, and their bonuses change due to ownership changes in another part of the region")
    public static final lox uDA = uCZ.BC("RegionChangedPlayersClan");
    @lok(value="The shape of this allied empire has changed!!!")
    @lpl(value="Displayed to a player when they are in a territorial region, owned by an allied clan, and their bonuses change due to ownership changes in another part of the region")
    public static final lox uDB = uCZ.BC("RegionChangedAlliedClan");

    protected mcy(String string) {
        super("TerritorialControl." + string);
    }

    private mcy() {
        super("TerritorialControl");
    }
}

