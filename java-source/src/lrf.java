/*
 * Decompiled with CFR.
 */
public final class lrf
extends lra {
    private static final lrf smV = new lrf();
    @lok(value="Novice crafter")
    @lpl(value="The cf_craft_1 feat display name")
    public static final lox smW = smV.a("cf_craft_1_DisplayName", lrf.Bl("Resource"), lrf.Bl("Weapon"), lrf.Bm("Skill"), lrf.Bl("NodeResource"), lrf.Bl("ContainerResource"), lrf.Bh("Counter"), lrf.Bk("Booster"), lrf.Bk("Tile"), lrf.Bk("Area"), lrf.Bk("Attribute"));
    @lok(value="Successfully craft one item.")
    @lpl(value="The cf_craft_1 feat description")
    public static final lox smX = smV.a("cf_craft_1_Description", lrf.Bl("Resource"), lrf.Bl("Weapon"), lrf.Bm("Skill"), lrf.Bl("NodeResource"), lrf.Bl("ContainerResource"), lrf.Bh("Counter"), lrf.Bk("Booster"), lrf.Bk("Tile"), lrf.Bk("Area"), lrf.Bk("Attribute"));

    public lrf() {
        super("cf_first_lesson");
    }

    public lrf(String string) {
        super("cf_first_lesson." + string);
    }
}

