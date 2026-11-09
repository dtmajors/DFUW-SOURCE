/*
 * Decompiled with CFR.
 */
public class lyx
extends lvn {
    private static final lyx tLP = new lyx();
    @lok(value="Tracker")
    @lpl(value="Tracker window title")
    public static final lox sXP = tLP.BC("WindowTitle");
    @lok(value="Tracker Options")
    @lpl(value="Tracker options window title")
    public static final lox tLQ = tLP.BC("TrackerOptions");
    @lok(value="Keep Repeatables In List")
    @lpl(value="Text for keep repeatables in list option")
    public static final lox tLR = tLP.BC("KeepRepeatablesInList");
    @lok(value="Suggestion Popup")
    @lpl(value="Text for suggestion popup option")
    public static final lox tLS = tLP.BC("SuggestionPopup");
    @lok(value="Play Progress Sound")
    @lpl(value="Text for play progress sound option")
    public static final lox tLT = tLP.BC("ProgressUpdateAudio");

    protected lyx() {
        super("Tracker");
    }
}

