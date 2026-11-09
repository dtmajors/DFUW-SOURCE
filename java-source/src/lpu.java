/*
 * Decompiled with CFR.
 */
public class lpu
extends lpq {
    private static final lpu rUd = new lpu();
    @lok(value="No Rank")
    @lpl(value="Name of the abscence of a rank... Not displayed!")
    public static final lox rUe = rUd.BC("NoRank");
    @lok(value="Recruit")
    @lpl(value="Name of the clan military rank of recruit")
    public static final lox rUf = rUd.BC("Recruit");
    @lok(value="Private")
    @lpl(value="Name of the clan military rank of private")
    public static final lox rUg = rUd.BC("Private");
    @lok(value="Corporal")
    @lpl(value="Name of the clan military rank of corporal")
    public static final lox rUh = rUd.BC("Corporal");
    @lok(value="Sergeant")
    @lpl(value="Name of the clan military rank of sergeant")
    public static final lox rUi = rUd.BC("Sergeant");
    @lok(value="Lieutenant")
    @lpl(value="Name of the clan military rank of lieutenant")
    public static final lox rUj = rUd.BC("Lieutenant");
    @lok(value="Captain")
    @lpl(value="Name of the clan military rank of captain")
    public static final lox rUk = rUd.BC("Captain");
    @lok(value="Major")
    @lpl(value="Name of the clan military rank of major")
    public static final lox rUl = rUd.BC("Major");
    @lok(value="Colonel")
    @lpl(value="Name of the clan military rank of colonel")
    public static final lox rUm = rUd.BC("Colonel");
    @lok(value="General")
    @lpl(value="Name of the clan military rank of general")
    public static final lox rUn = rUd.BC("General");
    @lok(value="Supreme General")
    @lpl(value="Name of the clan military rank of supreme general")
    public static final lox rUo = rUd.BC("SupremeGeneral");

    protected lpu(String string) {
        super("MilitaryRanks." + string);
    }

    private lpu() {
        super("MilitaryRanks");
    }
}

