/*
 * Decompiled with CFR.
 */
public final class luv
extends lsd {
    private static final luv sSF = new luv();
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_trollkin_150 feat display name")
    public static final lox sSG = sSF.a("pe_kill_trollkin_150_DisplayName", luv.Bl("Resource"), luv.Bl("Weapon"), luv.Bm("Skill"), luv.Bl("NodeResource"), luv.Bl("ContainerResource"), luv.Bh("Counter"), luv.Bk("Booster"), luv.Bk("Tile"), luv.Bk("Area"), luv.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_trollkin_150 feat description")
    public static final lox sSH = sSF.a("pe_kill_trollkin_150_Description", luv.Bl("Resource"), luv.Bl("Weapon"), luv.Bm("Skill"), luv.Bl("NodeResource"), luv.Bl("ContainerResource"), luv.Bh("Counter"), luv.Bk("Booster"), luv.Bk("Tile"), luv.Bk("Area"), luv.Bk("Attribute"));
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_trollkin_30 feat display name")
    public static final lox sSI = sSF.a("pe_kill_trollkin_30_DisplayName", luv.Bl("Resource"), luv.Bl("Weapon"), luv.Bm("Skill"), luv.Bl("NodeResource"), luv.Bl("ContainerResource"), luv.Bh("Counter"), luv.Bk("Booster"), luv.Bk("Tile"), luv.Bk("Area"), luv.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_trollkin_30 feat description")
    public static final lox sSJ = sSF.a("pe_kill_trollkin_30_Description", luv.Bl("Resource"), luv.Bl("Weapon"), luv.Bm("Skill"), luv.Bl("NodeResource"), luv.Bl("ContainerResource"), luv.Bh("Counter"), luv.Bk("Booster"), luv.Bk("Tile"), luv.Bk("Area"), luv.Bk("Attribute"));

    public luv() {
        super("pe_kill_trollkin");
    }

    public luv(String string) {
        super("pe_kill_trollkin." + string);
    }
}

