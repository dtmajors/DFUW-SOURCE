/*
 * Decompiled with CFR.
 */
public final class ltt
extends lsd {
    private static final ltt sOJ = new ltt();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_kobold_30 feat display name")
    public static final lox sOK = sOJ.a("pe_kill_kobold_30_DisplayName", ltt.Bl("Resource"), ltt.Bl("Weapon"), ltt.Bm("Skill"), ltt.Bl("NodeResource"), ltt.Bl("ContainerResource"), ltt.Bh("Counter"), ltt.Bk("Booster"), ltt.Bk("Tile"), ltt.Bk("Area"), ltt.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_kobold_30 feat description")
    public static final lox sOL = sOJ.a("pe_kill_kobold_30_Description", ltt.Bl("Resource"), ltt.Bl("Weapon"), ltt.Bm("Skill"), ltt.Bl("NodeResource"), ltt.Bl("ContainerResource"), ltt.Bh("Counter"), ltt.Bk("Booster"), ltt.Bk("Tile"), ltt.Bk("Area"), ltt.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_kobold_150 feat display name")
    public static final lox sOM = sOJ.a("pe_kill_kobold_150_DisplayName", ltt.Bl("Resource"), ltt.Bl("Weapon"), ltt.Bm("Skill"), ltt.Bl("NodeResource"), ltt.Bl("ContainerResource"), ltt.Bh("Counter"), ltt.Bk("Booster"), ltt.Bk("Tile"), ltt.Bk("Area"), ltt.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_kobold_150 feat description")
    public static final lox sON = sOJ.a("pe_kill_kobold_150_Description", ltt.Bl("Resource"), ltt.Bl("Weapon"), ltt.Bm("Skill"), ltt.Bl("NodeResource"), ltt.Bl("ContainerResource"), ltt.Bh("Counter"), ltt.Bk("Booster"), ltt.Bk("Tile"), ltt.Bk("Area"), ltt.Bk("Attribute"));

    public ltt() {
        super("pe_kill_kobold");
    }

    public ltt(String string) {
        super("pe_kill_kobold." + string);
    }
}

