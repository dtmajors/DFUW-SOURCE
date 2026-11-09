/*
 * Decompiled with CFR.
 */
public class lxv
extends lvn {
    private static final lxv tza = new lxv();
    @lok(value="Select the default attack skill after the skill has been executed.")
    @lpl(value="This message appears to the player in the tooltip of auto revert check box in the radial menu assignment window.")
    public static final lox tzb = tza.BC("ConfigAutoRevert");
    @lok(value="Perform default attack when the skill is not available.")
    @lpl(value="This message appears to the player in the tooltip of auto default check box in the radial menu assignment window.")
    public static final lox tzc = tza.BC("ConfigAutoDefault");
    @lok(value="Cast the skill when it is selected using a shortcut key.")
    @lpl(value="This message appears to the player in the tooltip of auto cast button in the radial menu assignment window.")
    public static final lox tzd = tza.BC("ConfigAutoCast");

    protected lxv(String string) {
        super("RadialMenu." + string);
    }

    private lxv() {
        super("RadialMenu");
    }
}

