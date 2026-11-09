/*
 * Decompiled with CFR.
 */
public final class lux
extends lsd {
    private static final lux sSR = new lux();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_vargashi_30 feat display name")
    public static final lox sSS = sSR.a("pe_kill_vargashi_30_DisplayName", lux.Bl("Resource"), lux.Bl("Weapon"), lux.Bm("Skill"), lux.Bl("NodeResource"), lux.Bl("ContainerResource"), lux.Bh("Counter"), lux.Bk("Booster"), lux.Bk("Tile"), lux.Bk("Area"), lux.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_vargashi_30 feat description")
    public static final lox sST = sSR.a("pe_kill_vargashi_30_Description", lux.Bl("Resource"), lux.Bl("Weapon"), lux.Bm("Skill"), lux.Bl("NodeResource"), lux.Bl("ContainerResource"), lux.Bh("Counter"), lux.Bk("Booster"), lux.Bk("Tile"), lux.Bk("Area"), lux.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_vargashi_150 feat display name")
    public static final lox sSU = sSR.a("pe_kill_vargashi_150_DisplayName", lux.Bl("Resource"), lux.Bl("Weapon"), lux.Bm("Skill"), lux.Bl("NodeResource"), lux.Bl("ContainerResource"), lux.Bh("Counter"), lux.Bk("Booster"), lux.Bk("Tile"), lux.Bk("Area"), lux.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_vargashi_150 feat description")
    public static final lox sSV = sSR.a("pe_kill_vargashi_150_Description", lux.Bl("Resource"), lux.Bl("Weapon"), lux.Bm("Skill"), lux.Bl("NodeResource"), lux.Bl("ContainerResource"), lux.Bh("Counter"), lux.Bk("Booster"), lux.Bk("Tile"), lux.Bk("Area"), lux.Bk("Attribute"));

    public lux() {
        super("pe_kill_vargashi");
    }

    public lux(String string) {
        super("pe_kill_vargashi." + string);
    }
}

