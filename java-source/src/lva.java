/*
 * Decompiled with CFR.
 */
public final class lva
extends lsd {
    private static final lva sTk = new lva();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Inhumer")
    @lpl(value="The pe_kill_zombie_30 feat display name")
    public static final lox sTl = sTk.a("pe_kill_zombie_30_DisplayName", lva.Bl("Resource"), lva.Bl("Weapon"), lva.Bm("Skill"), lva.Bl("NodeResource"), lva.Bl("ContainerResource"), lva.Bh("Counter"), lva.Bk("Booster"), lva.Bk("Tile"), lva.Bk("Area"), lva.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_zombie_30 feat description")
    public static final lox sTm = sTk.a("pe_kill_zombie_30_Description", lva.Bl("Resource"), lva.Bl("Weapon"), lva.Bm("Skill"), lva.Bl("NodeResource"), lva.Bl("ContainerResource"), lva.Bh("Counter"), lva.Bk("Booster"), lva.Bk("Tile"), lva.Bk("Area"), lva.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Inhumer")
    @lpl(value="The pe_kill_zombie_150 feat display name")
    public static final lox sTn = sTk.a("pe_kill_zombie_150_DisplayName", lva.Bl("Resource"), lva.Bl("Weapon"), lva.Bm("Skill"), lva.Bl("NodeResource"), lva.Bl("ContainerResource"), lva.Bh("Counter"), lva.Bk("Booster"), lva.Bk("Tile"), lva.Bk("Area"), lva.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_zombie_150 feat description")
    public static final lox sTo = sTk.a("pe_kill_zombie_150_Description", lva.Bl("Resource"), lva.Bl("Weapon"), lva.Bm("Skill"), lva.Bl("NodeResource"), lva.Bl("ContainerResource"), lva.Bh("Counter"), lva.Bk("Booster"), lva.Bk("Tile"), lva.Bk("Area"), lva.Bk("Attribute"));

    public lva() {
        super("pe_kill_zombie");
    }

    public lva(String string) {
        super("pe_kill_zombie." + string);
    }
}

