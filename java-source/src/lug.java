/*
 * Decompiled with CFR.
 */
public final class lug
extends lsd {
    private static final lug sRi = new lug();
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_sadayel_150 feat display name")
    public static final lox sRj = sRi.a("pe_kill_sadayel_150_DisplayName", lug.Bl("Resource"), lug.Bl("Weapon"), lug.Bm("Skill"), lug.Bl("NodeResource"), lug.Bl("ContainerResource"), lug.Bh("Counter"), lug.Bk("Booster"), lug.Bk("Tile"), lug.Bk("Area"), lug.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_sadayel_150 feat description")
    public static final lox sRk = sRi.a("pe_kill_sadayel_150_Description", lug.Bl("Resource"), lug.Bl("Weapon"), lug.Bm("Skill"), lug.Bl("NodeResource"), lug.Bl("ContainerResource"), lug.Bh("Counter"), lug.Bk("Booster"), lug.Bk("Tile"), lug.Bk("Area"), lug.Bk("Attribute"));
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_sadayel_30 feat display name")
    public static final lox sRl = sRi.a("pe_kill_sadayel_30_DisplayName", lug.Bl("Resource"), lug.Bl("Weapon"), lug.Bm("Skill"), lug.Bl("NodeResource"), lug.Bl("ContainerResource"), lug.Bh("Counter"), lug.Bk("Booster"), lug.Bk("Tile"), lug.Bk("Area"), lug.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_sadayel_30 feat description")
    public static final lox sRm = sRi.a("pe_kill_sadayel_30_Description", lug.Bl("Resource"), lug.Bl("Weapon"), lug.Bm("Skill"), lug.Bl("NodeResource"), lug.Bl("ContainerResource"), lug.Bh("Counter"), lug.Bk("Booster"), lug.Bk("Tile"), lug.Bk("Area"), lug.Bk("Attribute"));

    public lug() {
        super("pe_kill_sadayel");
    }

    public lug(String string) {
        super("pe_kill_sadayel." + string);
    }
}

