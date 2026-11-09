/*
 * Decompiled with CFR.
 */
public final class lun
extends lsd {
    private static final lun sRR = new lun();
    @lok(value="Novice $(Resource.Name$(Counter.Plurality)) Slayer")
    @lpl(value="The pe_kill_monster_one feat display name")
    public static final lox sRS = sRR.a("pe_kill_monster_one_DisplayName", lun.Bl("Resource"), lun.Bl("Weapon"), lun.Bm("Skill"), lun.Bl("NodeResource"), lun.Bl("ContainerResource"), lun.Bh("Counter"), lun.Bk("Booster"), lun.Bk("Tile"), lun.Bk("Area"), lun.Bk("Attribute"));
    @lok(value="Perform the killing blow on one $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_monster_one feat description")
    public static final lox sRT = sRR.a("pe_kill_monster_one_Description", lun.Bl("Resource"), lun.Bl("Weapon"), lun.Bm("Skill"), lun.Bl("NodeResource"), lun.Bl("ContainerResource"), lun.Bh("Counter"), lun.Bk("Booster"), lun.Bk("Tile"), lun.Bk("Area"), lun.Bk("Attribute"));
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Slayer")
    @lpl(value="The pe_kill_monster_ground_five feat display name")
    public static final lox sRU = sRR.a("pe_kill_monster_ground_five_DisplayName", lun.Bl("Resource"), lun.Bl("Weapon"), lun.Bm("Skill"), lun.Bl("NodeResource"), lun.Bl("ContainerResource"), lun.Bh("Counter"), lun.Bk("Booster"), lun.Bk("Tile"), lun.Bk("Area"), lun.Bk("Attribute"));
    @lok(value="Perform the killing blow on five $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_monster_ground_five feat description")
    public static final lox sRV = sRR.a("pe_kill_monster_ground_five_Description", lun.Bl("Resource"), lun.Bl("Weapon"), lun.Bm("Skill"), lun.Bl("NodeResource"), lun.Bl("ContainerResource"), lun.Bh("Counter"), lun.Bk("Booster"), lun.Bk("Tile"), lun.Bk("Area"), lun.Bk("Attribute"));

    public lun() {
        super("pe_kill_starting");
    }

    public lun(String string) {
        super("pe_kill_starting." + string);
    }
}

