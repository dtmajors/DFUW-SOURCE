/*
 * Decompiled with CFR.
 */
public final class lre
extends lra {
    private static final lre smO = new lre();
    @lok(value="The Obviously Unskilled")
    @lpl(value="The cf_fail_crafting_100 feat display name")
    public static final lox smP = smO.a("cf_fail_crafting_100_DisplayName", lre.Bl("Resource"), lre.Bl("Weapon"), lre.Bm("Skill"), lre.Bl("NodeResource"), lre.Bl("ContainerResource"), lre.Bh("Counter"), lre.Bk("Booster"), lre.Bk("Tile"), lre.Bk("Area"), lre.Bk("Attribute"));
    @lok(value="Fail at crafting any item 100 times.")
    @lpl(value="The cf_fail_crafting_100 feat description")
    public static final lox smQ = smO.a("cf_fail_crafting_100_Description", lre.Bl("Resource"), lre.Bl("Weapon"), lre.Bm("Skill"), lre.Bl("NodeResource"), lre.Bl("ContainerResource"), lre.Bh("Counter"), lre.Bk("Booster"), lre.Bk("Tile"), lre.Bk("Area"), lre.Bk("Attribute"));
    @lok(value="The Slightly Unskilled")
    @lpl(value="The cf_fail_crafting_30 feat display name")
    public static final lox smR = smO.a("cf_fail_crafting_30_DisplayName", lre.Bl("Resource"), lre.Bl("Weapon"), lre.Bm("Skill"), lre.Bl("NodeResource"), lre.Bl("ContainerResource"), lre.Bh("Counter"), lre.Bk("Booster"), lre.Bk("Tile"), lre.Bk("Area"), lre.Bk("Attribute"));
    @lok(value="Fail at crafting any item thirty times.")
    @lpl(value="The cf_fail_crafting_30 feat description")
    public static final lox smS = smO.a("cf_fail_crafting_30_Description", lre.Bl("Resource"), lre.Bl("Weapon"), lre.Bm("Skill"), lre.Bl("NodeResource"), lre.Bl("ContainerResource"), lre.Bh("Counter"), lre.Bk("Booster"), lre.Bk("Tile"), lre.Bk("Area"), lre.Bk("Attribute"));
    @lok(value="The Coincidentlly Unskilled")
    @lpl(value="The cf_fail_crafting_1 feat display name")
    public static final lox smT = smO.a("cf_fail_crafting_1_DisplayName", lre.Bl("Resource"), lre.Bl("Weapon"), lre.Bm("Skill"), lre.Bl("NodeResource"), lre.Bl("ContainerResource"), lre.Bh("Counter"), lre.Bk("Booster"), lre.Bk("Tile"), lre.Bk("Area"), lre.Bk("Attribute"));
    @lok(value="Fail at crafting any item once.")
    @lpl(value="The cf_fail_crafting_1 feat description")
    public static final lox smU = smO.a("cf_fail_crafting_1_Description", lre.Bl("Resource"), lre.Bl("Weapon"), lre.Bm("Skill"), lre.Bl("NodeResource"), lre.Bl("ContainerResource"), lre.Bh("Counter"), lre.Bk("Booster"), lre.Bk("Tile"), lre.Bk("Area"), lre.Bk("Attribute"));

    public lre() {
        super("cf_fail_crafting");
    }

    public lre(String string) {
        super("cf_fail_crafting." + string);
    }
}

