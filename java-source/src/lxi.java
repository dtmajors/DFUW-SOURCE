/*
 * Decompiled with CFR.
 */
public class lxi
extends lvn {
    private static final lxi tqk = new lxi();
    @lok(value="$(Count) Characters Minimum")
    @lpl(value="Text appearing in tooltip when the search text is invalid")
    public static final lox tql = tqk.a("TooltipInvalidSearchText", lxi.Bh("Count"));
    @lok(value="Search Agon...")
    @lpl(value="Text appearing in search text box when the text box does not have the input focus")
    public static final lox tqm = tqk.BC("SearchAgon");
    @lok(value="$(Count) Results")
    @lpl(value="Number of results.")
    public static final lox tqn = tqk.a("Results", lxi.Bh("Count"));
    @lok(value="Player Bindstone")
    @lpl(value="Title of the player's bindstone marker.")
    public static final lox tqo = tqk.BC("PlayerBindstoneTitle");
    @lok(value="Party")
    @lpl(value="Title of a party marker.")
    public static final lox tqp = tqk.BC("PartyTitle");
    @lok(value="$(ClanCityName) Clan City")
    @lpl(value="Title of a clan city marker.")
    public static final lox tqq = tqk.a("ClanCityTitle", lxi.Bp("ClanCityName"));
    @lok(value="$(ClanHamletName) Clan Hamlet")
    @lpl(value="Title of a clan hamlet marker.")
    public static final lox tqr = tqk.a("ClanHamletTitle", lxi.Bp("ClanHamletName"));
    @lok(value="$(ClanVillageName) Clan Village")
    @lpl(value="Title of a clan village marker.")
    public static final lox tqs = tqk.a("ClanVillageTitle", lxi.Bq("ClanVillageName"));
    @lok(value="$(TileName) Sea Fortress")
    @lpl(value="Title of a sea fortress marker.")
    public static final lox tqt = tqk.a("SeaFortressTitle", lxi.Br("TileName"));
    @lok(value="$(TileName) Prowess Monolith")
    @lpl(value="Title of a prowess monolith marker.")
    public static final lox tqu = tqk.a("ProwessMonolithTitle", lxi.Br("TileName"));
    @lok(value="$(TileName) Levy Collector")
    @lpl(value="Title of a levy collector marker.")
    public static final lox tqv = tqk.a("LevyCollectorTitle", lxi.Br("TileName"));
    @lok(value="Vendor")
    @lpl(value="Title of a vendor marker.")
    public static final lox tqw = tqk.BC("VendorTitle");
    @lok(value="$(TileName) Market")
    @lpl(value="Title of a market marker.")
    public static final lox tqx = tqk.a("MarketTitle", lxi.Br("TileName"));
    @lok(value="$(TileName) Bindstone")
    @lpl(value="Title of a bindstone marker.")
    public static final lox tqy = tqk.a("BindstoneTitle", lxi.Br("TileName"));
    @lok(value="$(TileName) Bank")
    @lpl(value="Title of a bank marker.")
    public static final lox tpg = tqk.a("BankTitle", lxi.Br("TileName"));
    @lok(value="$(TileName) Portal Chamber")
    @lpl(value="Title of a portal chamber (teleport) marker.")
    public static final lox tqz = tqk.a("TeleportPortalTitle", lxi.Br("TileName"));
    @lok(value="$(TileName) Dungeon Portal")
    @lpl(value="Title of a dungeon portal marker.")
    public static final lox tqA = tqk.a("DungeonPortalTitle", lxi.Br("TileName"));

    protected lxi() {
        super("MapSearch");
    }
}

