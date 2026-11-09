/*
 * Decompiled with CFR.
 */
public class lqa
extends lpx {
    private static final lqa rWF = new lqa();
    @lok(value="Kill All But Allies")
    @lpl(value="Localised name of the 'kill all but allies' clan city guard-tower policy")
    public static final lox rWG = rWF.BC("KillAllButAllies");
    @lok(value="Kill Only Enemies")
    @lpl(value="Localised name of the 'kill only enemies' clan city guard-tower policy")
    public static final lox rWH = rWF.BC("KillOnlyEnemies");
    @lok(value="Never Attack")
    @lpl(value="Localised name of the 'never attack' clan city guard-tower policy")
    public static final lox rWI = rWF.BC("NeverAttack");

    protected lqa(String string) {
        super("GuardTower." + string);
    }

    private lqa() {
        super("GuardTower");
    }
}

