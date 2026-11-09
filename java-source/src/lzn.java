/*
 * Decompiled with CFR.
 */
public class lzn
extends lzj {
    private static final lzn tWY = new lzn();
    @lok(value="Animation Distance Timer Set: $(Result)")
    @lpl(value="Displayed when the animation distance timer has been set")
    public static final lox tWZ = tWY.a("AnimationDistanceTimerSetResult", lzn.Bk("Result"));
    @lok(value="Gamelogic Config Options:")
    @lpl(value="Displayed as the header for the output list of config option values")
    public static final lox tXa = tWY.BC("PrintHeaderGamelogic");
    @lok(value="AI Config Options:")
    @lpl(value="Displayed as the header for the output list of config option values")
    public static final lox tXb = tWY.BC("PrintHeaderAI");
    @lok(value="$(OptionName) = $(OptionValue)")
    @lol(value="Value Option Pair, Nothing to Translate Here!!!")
    public static final lox tXc = tWY.a("PrintEntry", lzn.Bk("OptionName"), lzn.Bk("OptionValue"));
    @lok(value="The value of $(Parameter) is $(Value)")
    @lpl(value="Displayed to indicate the value of a system parameter")
    public static final lox tXd = tWY.a("ParameterValue", lzn.Bk("Parameter"), lzn.Bk("Value"));

    protected lzn(String string) {
        super("Config." + string);
    }

    private lzn() {
        super("Config");
    }
}

