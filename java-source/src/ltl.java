/*
 * Decompiled with CFR.
 */
public final class ltl
extends lsd {
    private static final ltl sNT = new ltl();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_grungroc_30 feat display name")
    public static final lox sNU = sNT.a("pe_kill_grungroc_30_DisplayName", ltl.Bl("Resource"), ltl.Bl("Weapon"), ltl.Bm("Skill"), ltl.Bl("NodeResource"), ltl.Bl("ContainerResource"), ltl.Bh("Counter"), ltl.Bk("Booster"), ltl.Bk("Tile"), ltl.Bk("Area"), ltl.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_grungroc_30 feat description")
    public static final lox sNV = sNT.a("pe_kill_grungroc_30_Description", ltl.Bl("Resource"), ltl.Bl("Weapon"), ltl.Bm("Skill"), ltl.Bl("NodeResource"), ltl.Bl("ContainerResource"), ltl.Bh("Counter"), ltl.Bk("Booster"), ltl.Bk("Tile"), ltl.Bk("Area"), ltl.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_grungroc_150 feat display name")
    public static final lox sNW = sNT.a("pe_kill_grungroc_150_DisplayName", ltl.Bl("Resource"), ltl.Bl("Weapon"), ltl.Bm("Skill"), ltl.Bl("NodeResource"), ltl.Bl("ContainerResource"), ltl.Bh("Counter"), ltl.Bk("Booster"), ltl.Bk("Tile"), ltl.Bk("Area"), ltl.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_grungroc_150 feat description")
    public static final lox sNX = sNT.a("pe_kill_grungroc_150_Description", ltl.Bl("Resource"), ltl.Bl("Weapon"), ltl.Bm("Skill"), ltl.Bl("NodeResource"), ltl.Bl("ContainerResource"), ltl.Bh("Counter"), ltl.Bk("Booster"), ltl.Bk("Tile"), ltl.Bk("Area"), ltl.Bk("Attribute"));

    public ltl() {
        super("pe_kill_grungroc");
    }

    public ltl(String string) {
        super("pe_kill_grungroc." + string);
    }
}

