/*
 * Decompiled with CFR.
 */
public class lyh
extends lvn {
    private static final lyh tDV = new lyh();
    @lok(value="Territory Map")
    @lpl(value="Displayed as the title to the main territories pop-up window")
    public static final lox trO = tDV.BC("MainWindowTitle");
    @lok(value="Leading Clan")
    @lpl(value="Displayed as the label for the leading clan name")
    public static final lox tDW = tDV.BC("LeadingClanName");
    @lok(value="Select Colour for Clan")
    @lpl(value="Displayed as the title of the colour selection pop-out window")
    public static final lox tDX = tDV.BC("ColourSelectionWindowTitle");
    @lok(value="Name")
    @lpl(value="Display name of the sort-order Name")
    public static final lox tDY = tDV.BC("SortOrderName");
    @lok(value="Politics")
    @lpl(value="Display name of the sort-order Politics")
    public static final lox tDZ = tDV.BC("SortOrderPolitics");
    @lok(value="Territories")
    @lpl(value="Display name of the sort-order Territories")
    public static final lox tEa = tDV.BC("SortOrderTerritories");
    @lok(value="Total Area")
    @lpl(value="Display name of the sort-order Coverage")
    public static final lox tEb = tDV.BC("SortOrderCoverage");
    @lok(value="Holdings")
    @lpl(value="Display name of the sort-order Holdings")
    public static final lox tEc = tDV.BC("SortOrderHoldings");
    @lok(value="Cities")
    @lpl(value="Display name of the sort-order Cities")
    public static final lox tEd = tDV.BC("SortOrderCities");
    @lok(value="Hamlets")
    @lpl(value="Display name of the sort-order Hamlets")
    public static final lox tEe = tDV.BC("SortOrderHamlets");
    @lok(value="Villages")
    @lpl(value="Display name of the sort-order Villages")
    public static final lox tEf = tDV.BC("SortOrderVillages");
    @lok(value="Fortresses")
    @lpl(value="Display name of the sort-order Fortresses")
    public static final lox tEg = tDV.BC("SortOrderFortresses");
    @lok(value="Territory Opacity")
    @lpl(value="Text shown next to the territory opacity slider in the window options pop-out")
    public static final lox tEh = tDV.BC("OpacitySliderLabel");
    @lok(value="Options")
    @lpl(value="Text shown as the title for the options pop-out window")
    public static final lox tEi = tDV.BC("OptionsPopOutTitle");

    protected lyh(String string) {
        super("Territories." + string);
    }

    private lyh() {
        super("Territories");
    }
}

