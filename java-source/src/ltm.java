/*
 * Decompiled with CFR.
 */
public final class ltm
extends lsd {
    private static final ltm sNY = new ltm();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_hag_30 feat display name")
    public static final lox sNZ = sNY.a("pe_kill_hag_30_DisplayName", ltm.Bl("Resource"), ltm.Bl("Weapon"), ltm.Bm("Skill"), ltm.Bl("NodeResource"), ltm.Bl("ContainerResource"), ltm.Bh("Counter"), ltm.Bk("Booster"), ltm.Bk("Tile"), ltm.Bk("Area"), ltm.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_hag_30 feat description")
    public static final lox sOa = sNY.a("pe_kill_hag_30_Description", ltm.Bl("Resource"), ltm.Bl("Weapon"), ltm.Bm("Skill"), ltm.Bl("NodeResource"), ltm.Bl("ContainerResource"), ltm.Bh("Counter"), ltm.Bk("Booster"), ltm.Bk("Tile"), ltm.Bk("Area"), ltm.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_hag_150 feat display name")
    public static final lox sOb = sNY.a("pe_kill_hag_150_DisplayName", ltm.Bl("Resource"), ltm.Bl("Weapon"), ltm.Bm("Skill"), ltm.Bl("NodeResource"), ltm.Bl("ContainerResource"), ltm.Bh("Counter"), ltm.Bk("Booster"), ltm.Bk("Tile"), ltm.Bk("Area"), ltm.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_hag_150 feat description")
    public static final lox sOc = sNY.a("pe_kill_hag_150_Description", ltm.Bl("Resource"), ltm.Bl("Weapon"), ltm.Bm("Skill"), ltm.Bl("NodeResource"), ltm.Bl("ContainerResource"), ltm.Bh("Counter"), ltm.Bk("Booster"), ltm.Bk("Tile"), ltm.Bk("Area"), ltm.Bk("Attribute"));

    public ltm() {
        super("pe_kill_hag");
    }

    public ltm(String string) {
        super("pe_kill_hag." + string);
    }
}

