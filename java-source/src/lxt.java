/*
 * Decompiled with CFR.
 */
public class lxt
extends lvn {
    private static final lxt txx = new lxt();
    @lok(value="Monolith")
    @lpl(value="Displayed as the label for the prowess monolith name in the prowess monolith gui window.")
    public static final lox txy = txx.BC("DisplayNameLabel");
    @lok(value="Prowess")
    @lpl(value="Displayed as the label for the reward timer in the prowess monolith gui window.")
    public static final lox txz = txx.BC("DisplayRewardLabel");
    @lok(value="Blast")
    @lpl(value="Displayed as the label for the blast timer in the prowess monolith gui window.")
    public static final lox txA = txx.BC("DisplayBlastLabel");
    @lok(value="Participants")
    @lpl(value="Displayed as the label for the registered players in the prowess monolith gui window.")
    public static final lox txB = txx.BC("DisplayPlayersLabel");
    @lok(value="$(Time)")
    @lpl(value="Display the time on the prowess monolith window before an action will occure.")
    public static final lox txC = txx.a("DisplayTime", lxt.Bi("Time"));
    @lok(value="Enable In: $(CountDown)")
    @lpl(value="Text to display in a tool-tip for a prowess monolith that is counting-down to becoming disabled")
    public static final lox txD = txx.a("ProwessMonolithEnableCountdown", lxt.Bi("CountDown"));
    @lok(value="Disable In: $(CountDown)")
    @lpl(value="Text to display in a tool-tip for a prowess monolith that is counting-down to becoming enabled")
    public static final lox txE = txx.a("ProwessMonolithDisableCountdown", lxt.Bi("CountDown"));
    @lok(value="Tier I")
    @lpl(value="Prowess Monolith Tier 1 identifier with latin number")
    public static final lox txF = txx.BC("Tier1");
    @lok(value="Tier II")
    @lpl(value="Prowess Monolith Tier 2 identifier with latin number")
    public static final lox txG = txx.BC("Tier2");
    @lok(value="Tier III")
    @lpl(value="Prowess Monolith Tier 3 identifier with latin number")
    public static final lox txH = txx.BC("Tier3");

    protected lxt(String string) {
        super("ProwessMonolith." + string);
    }

    private lxt() {
        super("ProwessMonolith");
    }
}

