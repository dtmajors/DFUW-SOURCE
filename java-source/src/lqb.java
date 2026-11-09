/*
 * Decompiled with CFR.
 */
public class lqb
extends lpq {
    private static final lqb rWJ = new lqb();
    @lok(value="War")
    @lpl(value="The displayable name of the political stance: War")
    public static final lox rWK = rWJ.BC("War");
    @lok(value="Wary")
    @lpl(value="The displayable name of the political stance: Wary")
    public static final lox rWL = rWJ.BC("Wary");
    @lok(value="Neutral")
    @lpl(value="The displayable name of the political stance: Neutral")
    public static final lox rWM = rWJ.BC("Neutral");
    @lok(value="Friendly")
    @lpl(value="The displayable name of the political stance: Friendly")
    public static final lox rWN = rWJ.BC("Friendly");
    @lok(value="Ally")
    @lpl(value="The displayable name of the political stance: Ally")
    public static final lox rWO = rWJ.BC("Ally");
    @lok(value="NoClan")
    @lpl(value="The displayable name of the political stance: NoClan")
    public static final lox rWP = rWJ.BC("NoClan");

    protected lqb(String string) {
        super("PoliticalStances." + string);
    }

    private lqb() {
        super("PoliticalStances");
    }
}

