/*
 * Decompiled with CFR.
 */
public final class luc
extends lsd {
    private static final luc sPG = new luc();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Wrecker")
    @lpl(value="The pe_kill_orb_30 feat display name")
    public static final lox sPH = sPG.a("pe_kill_orb_30_DisplayName", luc.Bl("Resource"), luc.Bl("Weapon"), luc.Bm("Skill"), luc.Bl("NodeResource"), luc.Bl("ContainerResource"), luc.Bh("Counter"), luc.Bk("Booster"), luc.Bk("Tile"), luc.Bk("Area"), luc.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_orb_30 feat description")
    public static final lox sPI = sPG.a("pe_kill_orb_30_Description", luc.Bl("Resource"), luc.Bl("Weapon"), luc.Bm("Skill"), luc.Bl("NodeResource"), luc.Bl("ContainerResource"), luc.Bh("Counter"), luc.Bk("Booster"), luc.Bk("Tile"), luc.Bk("Area"), luc.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Wrecker")
    @lpl(value="The pe_kill_orb_150 feat display name")
    public static final lox sPJ = sPG.a("pe_kill_orb_150_DisplayName", luc.Bl("Resource"), luc.Bl("Weapon"), luc.Bm("Skill"), luc.Bl("NodeResource"), luc.Bl("ContainerResource"), luc.Bh("Counter"), luc.Bk("Booster"), luc.Bk("Tile"), luc.Bk("Area"), luc.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_orb_150 feat description")
    public static final lox sPK = sPG.a("pe_kill_orb_150_Description", luc.Bl("Resource"), luc.Bl("Weapon"), luc.Bm("Skill"), luc.Bl("NodeResource"), luc.Bl("ContainerResource"), luc.Bh("Counter"), luc.Bk("Booster"), luc.Bk("Tile"), luc.Bk("Area"), luc.Bk("Attribute"));

    public luc() {
        super("pe_kill_orb");
    }

    public luc(String string) {
        super("pe_kill_orb." + string);
    }
}

