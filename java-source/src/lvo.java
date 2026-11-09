/*
 * Decompiled with CFR.
 */
public class lvo
extends lvn {
    private static final lvo sXO = new lvo();
    @lok(value="Advisory")
    @lpl(value="Window Title")
    public static final lox sXP = sXO.BC("WindowTitle");
    @lok(value="Filter Entries...")
    @lpl(value="Label for the filter entries box")
    public static final lox sXQ = sXO.BC("FilterEntriesLabel");
    @lok(value="Found $(Count) Entries")
    @lpl(value="Label for the results found by applying the filter")
    public static final lox sXR = sXO.a("ResultsFoundLabel", lvo.Bh("Count"));
    @lok(value="Hide/Show Contents")
    @lpl(value="Tooltip text for the hide/show contents button")
    public static final lox sXS = sXO.BC("TooltipContentList");
    @lok(value="Clear Filter")
    @lpl(value="Tooltip text for the clear filter button")
    public static final lox sXT = sXO.BC("TooltipClearFilter");
    @lok(value="Enable/Disable automatic Advisory Entries Display")
    @lpl(value="Tooltip text for the auto-show button")
    public static final lox sXU = sXO.BC("TooltipAutoShowAdvisoryButton");
    @lok(value="Enable/Disable automatic Audio Play")
    @lpl(value="Tooltip text for the auto-play sound button")
    public static final lox sXV = sXO.BC("TooltipAutoPlaySoundButton");
    @lok(value="Previous Page")
    @lpl(value="Tooltip text for the previous page button")
    public static final lox sXW = sXO.BC("TooltipPrevPageButton");
    @lok(value="Next Page")
    @lpl(value="Tooltip text for the next page button")
    public static final lox sXX = sXO.BC("TooltipNextPageButton");
    @lok(value="Next Unread Topic")
    @lpl(value="Tooltip text for the next unread topic button")
    public static final lox sXY = sXO.BC("TooltipNextUnreadTopicButton");
    @lok(value="$(Count) Unread Advisory Topics")
    @lpl(value="Tooltip text for the advisory prompt")
    public static final lox sXZ = sXO.a("TooltipAdvisoryPrompt", lvo.Bh("Count"));

    private lvo() {
        super("AdvisoryWindow");
    }
}

