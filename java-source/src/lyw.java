/*
 * Decompiled with CFR.
 */
public class lyw
extends lyi {
    private static final lyw tLC = new lyw();
    @lok(value="Total Number of Territories")
    @lpl(value="Tooltip for the total number of territories icon")
    public static final lox tLD = tLC.BC("TotalTerritoriesIcon");
    @lok(value="Number of Cities")
    @lpl(value="Tooltip for the total number of cities icon")
    public static final lox tLE = tLC.BC("TotalCitiesIcon");
    @lok(value="Number of Hamlets")
    @lpl(value="Tooltip for the total number of hamlets icon")
    public static final lox tLF = tLC.BC("TotalHamletsIcon");
    @lok(value="Number of Villages")
    @lpl(value="Tooltip for the total number of villages icon")
    public static final lox tLG = tLC.BC("TotalVillagesIcon");
    @lok(value="Number of Fortresses")
    @lpl(value="Tooltip for the total number of fortresses icon")
    public static final lox tLH = tLC.BC("TotalFortressesIcon");
    @lok(value="Total Area of Territories")
    @lpl(value="Tooltip for the total area of territories icon")
    public static final lox tLI = tLC.BC("TotalAreaIcon");
    @lok(value="Selected Clan")
    @lpl(value="Tooltip for the stance icon when it is diplaying the selected clan icon")
    public static final lox tLJ = tLC.BC("StanceIconSelectedClan");
    @lok(value="Click to select a colour for this clan's territories")
    @lpl(value="Tooltip for the colour selector buttons on the territories pop-up window, when the user can select colours")
    public static final lox tLK = tLC.BC("ColourSelectorEnabled");
    @lok(value="You cannot provide your own colour for this clan's territory while a clan is selected in the list!")
    @lpl(value="Tooltip for the colour selector buttons on the territories pop-up window, when the user cannot select colours")
    public static final lox tLL = tLC.BC("ColourSelectorDisabled");
    @lok(value="Territory Bonuses")
    @lpl(value="Displayed as the title of the territorial bonuses group in tooltips")
    public static final lox tLM = tLC.BC("TerritoryBonusesTitle");
    @lok(value="+$(BonusMagnitude)% $(BonusName)")
    @lpl(value="Displayed to show the magnitude of a specific increase bonus")
    public static final lox tLN = tLC.a("TerritoryBonusMagnitudeIncrease", lyw.ah("BonusMagnitude", 2), lyw.b("BonusName", dmh.class));
    @lok(value="-$(BonusMagnitude)% $(BonusName)")
    @lpl(value="Displayed to show the magnitude of a specific increase bonus")
    public static final lox tLO = tLC.a("TerritoryBonusMagnitudeDecrease", lyw.ah("BonusMagnitude", 2), lyw.b("BonusName", dmh.class));

    protected lyw(String string) {
        super("Territories." + string);
    }

    private lyw() {
        super("Territories");
    }
}

