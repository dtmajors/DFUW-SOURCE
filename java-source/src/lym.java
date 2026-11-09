/*
 * Decompiled with CFR.
 */
public class lym
extends lyk {
    private static final lym tGl = new lym();
    @lok(value="Show On Map")
    @lpl(value="Tooltip of the clan city overview's show on map button")
    public static final lox tGm = tGl.BC("HoldingShowOnMapTitle");
    @lok(value="Displays the world map, centered on the holding's location")
    @lpl(value="Tooltip of the clan city overview's show on map button")
    public static final lox tGn = tGl.BC("HoldingShowOnMapDescription");

    protected lym(String string) {
        super("CityOverview." + string);
    }

    private lym() {
        super("CityOverview");
    }
}

