/*
 * Decompiled with CFR.
 */
public class lvu
extends lvt {
    private static final lvu tar = new lvu();
    @lok(value="Unknown command: $(Command)")
    @lpl(value="Chat error message displayed when the user types in an unrecognized chat command.")
    public static final lox tas = tar.a("UnknownCommandError", lvu.Bk("Command"));
    @lok(value="Parameter missing: $(Parameter)")
    @lpl(value="Chat error message displayed when the user misses an obligatory chat command parameter.")
    public static final lox tat = tar.a("MissingParameterError", lvu.Bk("Parameter"));
    @lok(value="Superfluous parameter: $(Parameter)")
    @lpl(value="Chat error message displayed when the user provides too many chat command parameters.")
    public static final lox tau = tar.a("ExtraParameterError", lvu.Bk("Parameter"));
    @lok(value="The value $(Value) cannot be assigned to parameter $(Parameter) of command $(Command)")
    @lpl(value="Chat error message displayed when there are problems parsing the provided chat command parameters.")
    public static final lox tav = tar.a("ParsingParameterError", lvu.Bk("Value"), lvu.Bk("Parameter"), lvu.Bk("Command"));
    @lok(value="Invalid parameter, please use a number between $(LowerLimit) and $(UpperLimit) (inclusive)")
    @lpl(value="Chat error message displayed when the user supplies an invalid parameter for the roll command.")
    public static final lox taw = tar.a("DiceRollParameterError", lvu.Bh("LowerLimit"), lvu.Bh("UpperLimit"));

    protected lvu(String string) {
        super("Errors." + string);
    }

    private lvu() {
        super("Errors");
    }
}

