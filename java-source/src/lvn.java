/*
 * Decompiled with CFR.
 */
public class lvn
extends lpa {
    private static final lvn sXE = new lvn();
    @lok(value="FPS")
    @lpl(value="short for number of Frames per second. Displayed at the top right of the gui.")
    public static final lox sXF = sXE.BC("FPS");
    @lok(value="Ping")
    @lpl(value="The network latency of the application . Displayed at the top right of the gui.")
    public static final lox sXG = sXE.BC("Ping");
    @lok(value="Search All...")
    @lpl(value="The text to put inside text boxes that are for searching.")
    public static final lox sXH = sXE.BC("SearchLabel");
    @lok(value="Filter...")
    @lpl(value="Default text for filter text input boxes")
    public static final lox sXI = sXE.BC("TextFilterInputDefaultValue");
    @lok(value="Sort By")
    @lpl(value="Sort by label")
    public static final lox sXJ = sXE.BC("SortBy");
    @lok(value="Ascending")
    @lpl(value="Text of the sorting option 'Ascending'")
    public static final lox sXK = sXE.BC("SortOrderAscending");
    @lok(value="Descending")
    @lpl(value="Text of the sorting option 'Descending'")
    public static final lox sXL = sXE.BC("SortOrderDescending");
    @lok(value="No Results!")
    @lpl(value="Text for lists that have no results")
    public static final lox sXM = sXE.BC("NoResults");
    @lok(value="$(String)")
    @lpl(value="Text used for testing purposes")
    public static final lox sXN = sXE.a("TestString", lvn.Bk("String"));

    protected lvn(String string) {
        super("Gui." + string);
    }

    private lvn() {
        super("Gui");
    }
}

