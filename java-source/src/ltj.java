/*
 * Decompiled with CFR.
 */
public final class ltj
extends lsd {
    private static final ltj sNJ = new ltj();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_goblinoid_30 feat display name")
    public static final lox sNK = sNJ.a("pe_kill_goblinoid_30_DisplayName", ltj.Bl("Resource"), ltj.Bl("Weapon"), ltj.Bm("Skill"), ltj.Bl("NodeResource"), ltj.Bl("ContainerResource"), ltj.Bh("Counter"), ltj.Bk("Booster"), ltj.Bk("Tile"), ltj.Bk("Area"), ltj.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_goblinoid_30 feat description")
    public static final lox sNL = sNJ.a("pe_kill_goblinoid_30_Description", ltj.Bl("Resource"), ltj.Bl("Weapon"), ltj.Bm("Skill"), ltj.Bl("NodeResource"), ltj.Bl("ContainerResource"), ltj.Bh("Counter"), ltj.Bk("Booster"), ltj.Bk("Tile"), ltj.Bk("Area"), ltj.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_goblinoid_150 feat display name")
    public static final lox sNM = sNJ.a("pe_kill_goblinoid_150_DisplayName", ltj.Bl("Resource"), ltj.Bl("Weapon"), ltj.Bm("Skill"), ltj.Bl("NodeResource"), ltj.Bl("ContainerResource"), ltj.Bh("Counter"), ltj.Bk("Booster"), ltj.Bk("Tile"), ltj.Bk("Area"), ltj.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_goblinoid_150 feat description")
    public static final lox sNN = sNJ.a("pe_kill_goblinoid_150_Description", ltj.Bl("Resource"), ltj.Bl("Weapon"), ltj.Bm("Skill"), ltj.Bl("NodeResource"), ltj.Bl("ContainerResource"), ltj.Bh("Counter"), ltj.Bk("Booster"), ltj.Bk("Tile"), ltj.Bk("Area"), ltj.Bk("Attribute"));

    public ltj() {
        super("pe_kill_goblinoid");
    }

    public ltj(String string) {
        super("pe_kill_goblinoid." + string);
    }
}

