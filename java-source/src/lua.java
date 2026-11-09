/*
 * Decompiled with CFR.
 */
public final class lua
extends lsd {
    private static final lua sPw = new lua();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Feller")
    @lpl(value="The pe_kill_minotaur_30 feat display name")
    public static final lox sPx = sPw.a("pe_kill_minotaur_30_DisplayName", lua.Bl("Resource"), lua.Bl("Weapon"), lua.Bm("Skill"), lua.Bl("NodeResource"), lua.Bl("ContainerResource"), lua.Bh("Counter"), lua.Bk("Booster"), lua.Bk("Tile"), lua.Bk("Area"), lua.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_minotaur_30 feat description")
    public static final lox sPy = sPw.a("pe_kill_minotaur_30_Description", lua.Bl("Resource"), lua.Bl("Weapon"), lua.Bm("Skill"), lua.Bl("NodeResource"), lua.Bl("ContainerResource"), lua.Bh("Counter"), lua.Bk("Booster"), lua.Bk("Tile"), lua.Bk("Area"), lua.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Feller")
    @lpl(value="The pe_kill_minotaur_150 feat display name")
    public static final lox sPz = sPw.a("pe_kill_minotaur_150_DisplayName", lua.Bl("Resource"), lua.Bl("Weapon"), lua.Bm("Skill"), lua.Bl("NodeResource"), lua.Bl("ContainerResource"), lua.Bh("Counter"), lua.Bk("Booster"), lua.Bk("Tile"), lua.Bk("Area"), lua.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_minotaur_150 feat description")
    public static final lox sPA = sPw.a("pe_kill_minotaur_150_Description", lua.Bl("Resource"), lua.Bl("Weapon"), lua.Bm("Skill"), lua.Bl("NodeResource"), lua.Bl("ContainerResource"), lua.Bh("Counter"), lua.Bk("Booster"), lua.Bk("Tile"), lua.Bk("Area"), lua.Bk("Attribute"));

    public lua() {
        super("pe_kill_minotaur");
    }

    public lua(String string) {
        super("pe_kill_minotaur." + string);
    }
}

