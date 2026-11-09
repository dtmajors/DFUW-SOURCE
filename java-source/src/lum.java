/*
 * Decompiled with CFR.
 */
public final class lum
extends lsd {
    private static final lum sRM = new lum();
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_squireofsin_150 feat display name")
    public static final lox sRN = sRM.a("pe_kill_squireofsin_150_DisplayName", lum.Bl("Resource"), lum.Bl("Weapon"), lum.Bm("Skill"), lum.Bl("NodeResource"), lum.Bl("ContainerResource"), lum.Bh("Counter"), lum.Bk("Booster"), lum.Bk("Tile"), lum.Bk("Area"), lum.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_squireofsin_150 feat description")
    public static final lox sRO = sRM.a("pe_kill_squireofsin_150_Description", lum.Bl("Resource"), lum.Bl("Weapon"), lum.Bm("Skill"), lum.Bl("NodeResource"), lum.Bl("ContainerResource"), lum.Bh("Counter"), lum.Bk("Booster"), lum.Bk("Tile"), lum.Bk("Area"), lum.Bk("Attribute"));
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_squireofsin_30 feat display name")
    public static final lox sRP = sRM.a("pe_kill_squireofsin_30_DisplayName", lum.Bl("Resource"), lum.Bl("Weapon"), lum.Bm("Skill"), lum.Bl("NodeResource"), lum.Bl("ContainerResource"), lum.Bh("Counter"), lum.Bk("Booster"), lum.Bk("Tile"), lum.Bk("Area"), lum.Bk("Attribute"));
    @lok(value="Perform the killing blow on 30 $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_squireofsin_30 feat description")
    public static final lox sRQ = sRM.a("pe_kill_squireofsin_30_Description", lum.Bl("Resource"), lum.Bl("Weapon"), lum.Bm("Skill"), lum.Bl("NodeResource"), lum.Bl("ContainerResource"), lum.Bh("Counter"), lum.Bk("Booster"), lum.Bk("Tile"), lum.Bk("Area"), lum.Bk("Attribute"));

    public lum() {
        super("pe_kill_squireofsin");
    }

    public lum(String string) {
        super("pe_kill_squireofsin." + string);
    }
}

