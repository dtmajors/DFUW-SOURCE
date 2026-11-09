/*
 * Decompiled with CFR.
 */
public final class ltz
extends lsd {
    private static final ltz sPr = new ltz();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_menhir_30 feat display name")
    public static final lox sPs = sPr.a("pe_kill_menhir_30_DisplayName", ltz.Bl("Resource"), ltz.Bl("Weapon"), ltz.Bm("Skill"), ltz.Bl("NodeResource"), ltz.Bl("ContainerResource"), ltz.Bh("Counter"), ltz.Bk("Booster"), ltz.Bk("Tile"), ltz.Bk("Area"), ltz.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_menhir_30 feat description")
    public static final lox sPt = sPr.a("pe_kill_menhir_30_Description", ltz.Bl("Resource"), ltz.Bl("Weapon"), ltz.Bm("Skill"), ltz.Bl("NodeResource"), ltz.Bl("ContainerResource"), ltz.Bh("Counter"), ltz.Bk("Booster"), ltz.Bk("Tile"), ltz.Bk("Area"), ltz.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_menhir_150 feat display name")
    public static final lox sPu = sPr.a("pe_kill_menhir_150_DisplayName", ltz.Bl("Resource"), ltz.Bl("Weapon"), ltz.Bm("Skill"), ltz.Bl("NodeResource"), ltz.Bl("ContainerResource"), ltz.Bh("Counter"), ltz.Bk("Booster"), ltz.Bk("Tile"), ltz.Bk("Area"), ltz.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_menhir_150 feat description")
    public static final lox sPv = sPr.a("pe_kill_menhir_150_Description", ltz.Bl("Resource"), ltz.Bl("Weapon"), ltz.Bm("Skill"), ltz.Bl("NodeResource"), ltz.Bl("ContainerResource"), ltz.Bh("Counter"), ltz.Bk("Booster"), ltz.Bk("Tile"), ltz.Bk("Area"), ltz.Bk("Attribute"));

    public ltz() {
        super("pe_kill_menhir");
    }

    public ltz(String string) {
        super("pe_kill_menhir." + string);
    }
}

