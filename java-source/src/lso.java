/*
 * Decompiled with CFR.
 */
public final class lso
extends lsd {
    private static final lso sLA = new lso();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Wrecker")
    @lpl(value="The pe_kill_black_knight_30 feat display name")
    public static final lox sLB = sLA.a("pe_kill_black_knight_30_DisplayName", lso.Bl("Resource"), lso.Bl("Weapon"), lso.Bm("Skill"), lso.Bl("NodeResource"), lso.Bl("ContainerResource"), lso.Bh("Counter"), lso.Bk("Booster"), lso.Bk("Tile"), lso.Bk("Area"), lso.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_black_knight_30 feat description")
    public static final lox sLC = sLA.a("pe_kill_black_knight_30_Description", lso.Bl("Resource"), lso.Bl("Weapon"), lso.Bm("Skill"), lso.Bl("NodeResource"), lso.Bl("ContainerResource"), lso.Bh("Counter"), lso.Bk("Booster"), lso.Bk("Tile"), lso.Bk("Area"), lso.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Wrecker")
    @lpl(value="The pe_kill_black_knight_150 feat display name")
    public static final lox sLD = sLA.a("pe_kill_black_knight_150_DisplayName", lso.Bl("Resource"), lso.Bl("Weapon"), lso.Bm("Skill"), lso.Bl("NodeResource"), lso.Bl("ContainerResource"), lso.Bh("Counter"), lso.Bk("Booster"), lso.Bk("Tile"), lso.Bk("Area"), lso.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_black_knight_150 feat description")
    public static final lox sLE = sLA.a("pe_kill_black_knight_150_Description", lso.Bl("Resource"), lso.Bl("Weapon"), lso.Bm("Skill"), lso.Bl("NodeResource"), lso.Bl("ContainerResource"), lso.Bh("Counter"), lso.Bk("Booster"), lso.Bk("Tile"), lso.Bk("Area"), lso.Bk("Attribute"));

    public lso() {
        super("pe_kill_black_knight");
    }

    public lso(String string) {
        super("pe_kill_black_knight." + string);
    }
}

