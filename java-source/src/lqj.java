/*
 * Decompiled with CFR.
 */
public class lqj
extends lqd {
    private static final lqj sde = new lqj();
    @lok(value="Command to output information about a territory... [int:TerritoryID] Optional: Uses player's current position, if TerritoryID parameter is not supplied")
    @lol(value="Developer command help text")
    public static final lox sdf = sde.BC("HelpDefineTerritory");
    @lok(value="Command to output information about a region... [int:TerritoryID] Optional: Uses player's current position, if TerritryID parameter is not supplied")
    @lol(value="Developer command help text")
    public static final lox sdg = sde.BC("HelpDefineRegion");
    @lok(value="Command to output information about all defined territories in the world")
    @lol(value="Developer command help text")
    public static final lox sdh = sde.BC("HelpDefineAllTerritories");
    @lok(value="Command to output information about the collector in a territory... [int:TerritoryID] Optional: Uses player's current position, if TerritoryID parameter is not supplied")
    @lol(value="Developer command help text")
    public static final lox sdi = sde.BC("HelpQueryTerritoryCollectorStatus");
    @lok(value="Command to output information about all collectors in a region... [int:TerritoryID] Optional: Uses player's current position, if TerritoryID parameter is not supplied")
    @lol(value="Developer command help text")
    public static final lox sdj = sde.BC("HelpQueryRegionCollectorsStatus");
    @lok(value="Command to output information about all collectors in the world")
    @lol(value="Developer command help text")
    public static final lox sdk = sde.BC("HelpQueryAllCollectorsStatus");
    @lok(value="No defined territory found!")
    @lol(value="Response from developer command")
    public static final lox sdl = sde.BC("NoTerritoryOutput");
    @lok(value="No collector exists in the indicated territory!")
    @lol(value="Response from developer command")
    public static final lox sdm = sde.BC("NoCollectorInTerritory");
    @lok(value="No region found for territory!")
    @lol(value="Response from developer command")
    public static final lox sdn = sde.BC("NoRegionOutput");
    @lok(value="No collectors exist in the indicated region!")
    @lol(value="Response from developer command")
    public static final lox sdo = sde.BC("NoCollectorsInRegion");
    @lok(value="Holding Territory :: ID = $(TerritoryID) : Type = $(HoldingType) : Name = $(HoldingName) : Owner Clan = $(ClanName)")
    @lol(value="Response from developer command")
    public static final lox sdp = sde.a("HoldingTerritoryOutputWithClan", lqj.Bh("TerritoryID"), lqj.b("HoldingType", ayb.class), lqj.Bp("HoldingName"), lqj.Bk("ClanName"));
    @lok(value="Holding Territory :: ID = $(TerritoryID) : Type = $(HoldingType) : Name = $(HoldingName) : No Current Owner Clan!")
    @lol(value="Response from developer command")
    public static final lox sdq = sde.a("HoldingTerritoryOutputNoClan", lqj.Bh("TerritoryID"), lqj.b("HoldingType", ayb.class), lqj.Bp("HoldingName"));
    @lok(value="Holding Territory :: ID = $(TerritoryID) : Type = $(HoldingType) : Name = $(HoldingName)")
    @lol(value="Response from developer command")
    public static final lox sdr = sde.a("HoldingTerritoryOutputWithoutClan", lqj.Bh("TerritoryID"), lqj.b("HoldingType", ayb.class), lqj.Bp("HoldingName"));
    @lok(value="Village Territory :: ID = $(TerritoryID) : Name = $(VillageName) : Owner Clan = $(ClanName)")
    @lol(value="Response from developer command")
    public static final lox sds = sde.a("VillageTerritoryOutputWithClan", lqj.Bh("TerritoryID"), lqj.Bq("VillageName"), lqj.Bk("ClanName"));
    @lok(value="Village Territory :: ID = $(TerritoryID) : Name = $(VillageName) : No Current Owner Clan!")
    @lol(value="Response from developer command")
    public static final lox sdt = sde.a("VillageTerritoryOutputNoClan", lqj.Bh("TerritoryID"), lqj.Bq("VillageName"));
    @lok(value="Village Territory :: ID = $(TerritoryID) : Name = $(VillageName)")
    @lol(value="Response from developer command")
    public static final lox sdu = sde.a("VillageTerritoryOutputWithoutClan", lqj.Bh("TerritoryID"), lqj.Bq("VillageName"));
    @lok(value="Fortress Territory :: ID = $(TerritoryID) : Name = $(FortressName) : Owner Clan = $(ClanName)")
    @lol(value="Response from developer command")
    public static final lox sdv = sde.a("FortressTerritoryOutputWithClan", lqj.Bh("TerritoryID"), lqj.Bk("FortressName"), lqj.Bk("ClanName"));
    @lok(value="Fortress Territory :: ID = $(TerritoryID) : Name = $(FortressName) : No Current Owner Clan!")
    @lol(value="Response from developer command")
    public static final lox sdw = sde.a("FortressTerritoryOutputNoClan", lqj.Bh("TerritoryID"), lqj.Bk("FortressName"));
    @lok(value="Fortress Territory :: ID = $(TerritoryID) : Name = $(FortressName)")
    @lol(value="Response from developer command")
    public static final lox sdx = sde.a("FortressTerritoryOutputWithoutClan", lqj.Bh("TerritoryID"), lqj.Bk("FortressName"));
    @lok(value="Region Info :: Size = $(Total) {Cities: $(Cities), Hamlets: $(Hamlets), Villages: $(Villages), Fortresses: $(Fortresses)} : Owner Clan = $(ClanName)")
    @lol(value="Response from developer command")
    public static final lox sdy = sde.a("RegionOutputHeader", lqj.Bh("Total"), lqj.Bh("Cities"), lqj.Bh("Hamlets"), lqj.Bh("Villages"), lqj.Bh("Fortresses"), lqj.Bk("ClanName"));
    @lok(value=" - Collector Status :: Size = $(CollectorSize) : Capacity = $(CollectorCapacity)")
    @lol(value="Response from developer command")
    public static final lox sdz = sde.a("CollectorStatus", lqj.Bh("CollectorSize"), lqj.Bh("CollectorCapacity"));

    private lqj() {
        super("Territories");
    }

    protected lqj(String string) {
        super("Territories." + string);
    }
}

