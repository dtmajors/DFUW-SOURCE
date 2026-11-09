/*
 * Decompiled with CFR.
 */
public class lpz
extends lpx {
    private static final lpz rWz = new lpz();
    @lok(value="Controllable By All")
    @lpl(value="Localised name of the 'controllable by all' gate control policy")
    public static final lox rWA = rWz.BC("ControllableByAll");
    @lok(value="Controllable By All But Enemies")
    @lpl(value="Localised name of the 'controllable by all but enemies' gate control policy")
    public static final lox rWB = rWz.BC("ControllableByAllButEnemies");
    @lok(value="Controllable By Allies")
    @lpl(value="Localised name of the 'controllable by allies' gate control policy")
    public static final lox rWC = rWz.BC("ControllableByAllies");
    @lok(value="Controllable By All Clan Members")
    @lpl(value="Localised name of the 'controllable by all clan members' gate control policy")
    public static final lox rWD = rWz.BC("ControllableByAllClanMembers");
    @lok(value="Controllable By Permitted Clan Members Only")
    @lpl(value="Localised name of the 'controllable by permitted clan members only' gate control policy")
    public static final lox rWE = rWz.BC("ControllableByPermittedClanMembers");

    protected lpz(String string) {
        super("GateControl." + string);
    }

    private lpz() {
        super("GateControl");
    }
}

