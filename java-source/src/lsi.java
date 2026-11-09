/*
 * Decompiled with CFR.
 */
public final class lsi
extends lsd {
    private static final lsi sKU = new lsi();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_alfar_monster_30 feat display name")
    public static final lox sKV = sKU.a("pe_kill_alfar_monster_30_DisplayName", lsi.Bl("Resource"), lsi.Bl("Weapon"), lsi.Bm("Skill"), lsi.Bl("NodeResource"), lsi.Bl("ContainerResource"), lsi.Bh("Counter"), lsi.Bk("Booster"), lsi.Bk("Tile"), lsi.Bk("Area"), lsi.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_alfar_monster_30 feat description")
    public static final lox sKW = sKU.a("pe_kill_alfar_monster_30_Description", lsi.Bl("Resource"), lsi.Bl("Weapon"), lsi.Bm("Skill"), lsi.Bl("NodeResource"), lsi.Bl("ContainerResource"), lsi.Bh("Counter"), lsi.Bk("Booster"), lsi.Bk("Tile"), lsi.Bk("Area"), lsi.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_alfar_monster_150 feat display name")
    public static final lox sKX = sKU.a("pe_kill_alfar_monster_150_DisplayName", lsi.Bl("Resource"), lsi.Bl("Weapon"), lsi.Bm("Skill"), lsi.Bl("NodeResource"), lsi.Bl("ContainerResource"), lsi.Bh("Counter"), lsi.Bk("Booster"), lsi.Bk("Tile"), lsi.Bk("Area"), lsi.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_alfar_monster_150 feat description")
    public static final lox sKY = sKU.a("pe_kill_alfar_monster_150_Description", lsi.Bl("Resource"), lsi.Bl("Weapon"), lsi.Bm("Skill"), lsi.Bl("NodeResource"), lsi.Bl("ContainerResource"), lsi.Bh("Counter"), lsi.Bk("Booster"), lsi.Bk("Tile"), lsi.Bk("Area"), lsi.Bk("Attribute"));

    public lsi() {
        super("pe_kill_alfar_monster");
    }

    public lsi(String string) {
        super("pe_kill_alfar_monster." + string);
    }
}

