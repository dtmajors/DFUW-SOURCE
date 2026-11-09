/*
 * Decompiled with CFR.
 */
public final class lqw
extends lqr {
    private static final lqw sge = new lqw();
    @lok(value="Novice Relic Destroyer")
    @lpl(value="The cq_relic_destruction_per_1 feat display name")
    public static final lox sgf = sge.a("cq_relic_destruction_per_1_DisplayName", lqw.Bl("Resource"), lqw.Bl("Weapon"), lqw.Bm("Skill"), lqw.Bl("NodeResource"), lqw.Bl("ContainerResource"), lqw.Bh("Counter"), lqw.Bk("Booster"), lqw.Bk("Tile"), lqw.Bk("Area"), lqw.Bk("Attribute"));
    @lok(value="Destroy one relic at the altar.")
    @lpl(value="The cq_relic_destruction_per_1 feat description")
    public static final lox sgg = sge.a("cq_relic_destruction_per_1_Description", lqw.Bl("Resource"), lqw.Bl("Weapon"), lqw.Bm("Skill"), lqw.Bl("NodeResource"), lqw.Bl("ContainerResource"), lqw.Bh("Counter"), lqw.Bk("Booster"), lqw.Bk("Tile"), lqw.Bk("Area"), lqw.Bk("Attribute"));

    public lqw() {
        super("cq_relic_destruction_personal");
    }

    public lqw(String string) {
        super("cq_relic_destruction_personal." + string);
    }
}

