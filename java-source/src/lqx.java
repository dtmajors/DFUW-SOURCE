/*
 * Decompiled with CFR.
 */
public final class lqx
extends lqr {
    private static final lqx sgh = new lqx();
    @lok(value="The Bricklayer")
    @lpl(value="The cq_repairstructure feat display name")
    public static final lox sgi = sgh.a("cq_repairstructure_DisplayName", lqx.Bl("Resource"), lqx.Bl("Weapon"), lqx.Bm("Skill"), lqx.Bl("NodeResource"), lqx.Bl("ContainerResource"), lqx.Bh("Counter"), lqx.Bk("Booster"), lqx.Bk("Tile"), lqx.Bk("Area"), lqx.Bk("Attribute"));
    @lok(value="Repair a structure that belongs to your clan during a siege.")
    @lpl(value="The cq_repairstructure feat description")
    public static final lox sgj = sgh.a("cq_repairstructure_Description", lqx.Bl("Resource"), lqx.Bl("Weapon"), lqx.Bm("Skill"), lqx.Bl("NodeResource"), lqx.Bl("ContainerResource"), lqx.Bh("Counter"), lqx.Bk("Booster"), lqx.Bk("Tile"), lqx.Bk("Area"), lqx.Bk("Attribute"));
    @lok(value="The Demolitionist")
    @lpl(value="The cq_lasthitenemystructure feat display name")
    public static final lox sgk = sgh.a("cq_lasthitenemystructure_DisplayName", lqx.Bl("Resource"), lqx.Bl("Weapon"), lqx.Bm("Skill"), lqx.Bl("NodeResource"), lqx.Bl("ContainerResource"), lqx.Bh("Counter"), lqx.Bk("Booster"), lqx.Bk("Tile"), lqx.Bk("Area"), lqx.Bk("Attribute"));
    @lok(value="Perform the final blow to destroy an enemy clan structure using siege weaponry during a siege.")
    @lpl(value="The cq_lasthitenemystructure feat description")
    public static final lox sgl = sgh.a("cq_lasthitenemystructure_Description", lqx.Bl("Resource"), lqx.Bl("Weapon"), lqx.Bm("Skill"), lqx.Bl("NodeResource"), lqx.Bl("ContainerResource"), lqx.Bh("Counter"), lqx.Bk("Booster"), lqx.Bk("Tile"), lqx.Bk("Area"), lqx.Bk("Attribute"));

    public lqx() {
        super("cq_rest");
    }

    public lqx(String string) {
        super("cq_rest." + string);
    }
}

