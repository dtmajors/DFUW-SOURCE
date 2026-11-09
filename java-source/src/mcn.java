/*
 * Decompiled with CFR.
 */
public class mcn
extends lzh {
    private static final mcn uwF = new mcn();
    @lok(value="$(Resource.NameSingular) in $(Area) will open in $(Time).")
    @lpl(value="Shows a global notification to every online player about in how many minutes the specific prowess monolith will open.")
    public static final lox uwG = uwF.a("ProwessMonolithEnteredPreparationPhase", mcn.Bl("Resource"), mcn.Br("Area"), mcn.Bi("Time"));
    @lok(value="$(Resource.NameSingular) in $(Area) is now open.")
    @lpl(value="Shows a global notification to every online player that the specific prowess monolith is now open.")
    public static final lox uwH = uwF.a("ProwessMonolithOpened", mcn.Bl("Resource"), mcn.Br("Area"));

    protected mcn(String string) {
        super("ProwessMonolith." + string);
    }

    private mcn() {
        super("ProwessMonolith");
    }
}

