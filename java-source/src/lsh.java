/*
 * Decompiled with CFR.
 */
public final class lsh
extends lsd {
    private static final lsh sKP = new lsh();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_akathar_30 feat display name")
    public static final lox sKQ = sKP.a("pe_kill_akathar_30_DisplayName", lsh.Bl("Resource"), lsh.Bl("Weapon"), lsh.Bm("Skill"), lsh.Bl("NodeResource"), lsh.Bl("ContainerResource"), lsh.Bh("Counter"), lsh.Bk("Booster"), lsh.Bk("Tile"), lsh.Bk("Area"), lsh.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_akathar_30 feat description")
    public static final lox sKR = sKP.a("pe_kill_akathar_30_Description", lsh.Bl("Resource"), lsh.Bl("Weapon"), lsh.Bm("Skill"), lsh.Bl("NodeResource"), lsh.Bl("ContainerResource"), lsh.Bh("Counter"), lsh.Bk("Booster"), lsh.Bk("Tile"), lsh.Bk("Area"), lsh.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_akathar_150 feat display name")
    public static final lox sKS = sKP.a("pe_kill_akathar_150_DisplayName", lsh.Bl("Resource"), lsh.Bl("Weapon"), lsh.Bm("Skill"), lsh.Bl("NodeResource"), lsh.Bl("ContainerResource"), lsh.Bh("Counter"), lsh.Bk("Booster"), lsh.Bk("Tile"), lsh.Bk("Area"), lsh.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_akathar_150 feat description")
    public static final lox sKT = sKP.a("pe_kill_akathar_150_Description", lsh.Bl("Resource"), lsh.Bl("Weapon"), lsh.Bm("Skill"), lsh.Bl("NodeResource"), lsh.Bl("ContainerResource"), lsh.Bh("Counter"), lsh.Bk("Booster"), lsh.Bk("Tile"), lsh.Bk("Area"), lsh.Bk("Attribute"));

    public lsh() {
        super("pe_kill_akathar");
    }

    public lsh(String string) {
        super("pe_kill_akathar." + string);
    }
}

