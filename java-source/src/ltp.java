/*
 * Decompiled with CFR.
 */
public final class ltp
extends lsd {
    private static final ltp sOn = new ltp();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_human_monster_30 feat display name")
    public static final lox sOo = sOn.a("pe_kill_human_monster_30_DisplayName", ltp.Bl("Resource"), ltp.Bl("Weapon"), ltp.Bm("Skill"), ltp.Bl("NodeResource"), ltp.Bl("ContainerResource"), ltp.Bh("Counter"), ltp.Bk("Booster"), ltp.Bk("Tile"), ltp.Bk("Area"), ltp.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_human_monster_30 feat description")
    public static final lox sOp = sOn.a("pe_kill_human_monster_30_Description", ltp.Bl("Resource"), ltp.Bl("Weapon"), ltp.Bm("Skill"), ltp.Bl("NodeResource"), ltp.Bl("ContainerResource"), ltp.Bh("Counter"), ltp.Bk("Booster"), ltp.Bk("Tile"), ltp.Bk("Area"), ltp.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_human_monster_150 feat display name")
    public static final lox sOq = sOn.a("pe_kill_human_monster_150_DisplayName", ltp.Bl("Resource"), ltp.Bl("Weapon"), ltp.Bm("Skill"), ltp.Bl("NodeResource"), ltp.Bl("ContainerResource"), ltp.Bh("Counter"), ltp.Bk("Booster"), ltp.Bk("Tile"), ltp.Bk("Area"), ltp.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_human_monster_150 feat description")
    public static final lox sOr = sOn.a("pe_kill_human_monster_150_Description", ltp.Bl("Resource"), ltp.Bl("Weapon"), ltp.Bm("Skill"), ltp.Bl("NodeResource"), ltp.Bl("ContainerResource"), ltp.Bh("Counter"), ltp.Bk("Booster"), ltp.Bk("Tile"), ltp.Bk("Area"), ltp.Bk("Attribute"));

    public ltp() {
        super("pe_kill_human_monster");
    }

    public ltp(String string) {
        super("pe_kill_human_monster." + string);
    }
}

