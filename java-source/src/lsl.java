/*
 * Decompiled with CFR.
 */
public final class lsl
extends lsd {
    private static final lsl sLl = new lsl();
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_bandit_150 feat display name")
    public static final lox sLm = sLl.a("pe_kill_bandit_150_DisplayName", lsl.Bl("Resource"), lsl.Bl("Weapon"), lsl.Bm("Skill"), lsl.Bl("NodeResource"), lsl.Bl("ContainerResource"), lsl.Bh("Counter"), lsl.Bk("Booster"), lsl.Bk("Tile"), lsl.Bk("Area"), lsl.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_bandit_150 feat description")
    public static final lox sLn = sLl.a("pe_kill_bandit_150_Description", lsl.Bl("Resource"), lsl.Bl("Weapon"), lsl.Bm("Skill"), lsl.Bl("NodeResource"), lsl.Bl("ContainerResource"), lsl.Bh("Counter"), lsl.Bk("Booster"), lsl.Bk("Tile"), lsl.Bk("Area"), lsl.Bk("Attribute"));
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_bandit_30 feat display name")
    public static final lox sLo = sLl.a("pe_kill_bandit_30_DisplayName", lsl.Bl("Resource"), lsl.Bl("Weapon"), lsl.Bm("Skill"), lsl.Bl("NodeResource"), lsl.Bl("ContainerResource"), lsl.Bh("Counter"), lsl.Bk("Booster"), lsl.Bk("Tile"), lsl.Bk("Area"), lsl.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_bandit_30 feat description")
    public static final lox sLp = sLl.a("pe_kill_bandit_30_Description", lsl.Bl("Resource"), lsl.Bl("Weapon"), lsl.Bm("Skill"), lsl.Bl("NodeResource"), lsl.Bl("ContainerResource"), lsl.Bh("Counter"), lsl.Bk("Booster"), lsl.Bk("Tile"), lsl.Bk("Area"), lsl.Bk("Attribute"));

    public lsl() {
        super("pe_kill_bandit");
    }

    public lsl(String string) {
        super("pe_kill_bandit." + string);
    }
}

