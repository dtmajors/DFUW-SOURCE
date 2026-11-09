/*
 * Decompiled with CFR.
 */
public final class lrs
extends lrp {
    private static final lrs sFg = new lrs();
    @lok(value="Harvester")
    @lpl(value="The hv_harvest_one feat display name")
    public static final lox sFh = sFg.a("hv_harvest_one_DisplayName", lrs.Bl("Resource"), lrs.Bl("Weapon"), lrs.Bm("Skill"), lrs.Bl("NodeResource"), lrs.Bl("ContainerResource"), lrs.Bh("Counter"), lrs.Bk("Booster"), lrs.Bk("Tile"), lrs.Bk("Area"), lrs.Bk("Attribute"));
    @lok(value="Harvest any one resource.")
    @lpl(value="The hv_harvest_one feat description")
    public static final lox sFi = sFg.a("hv_harvest_one_Description", lrs.Bl("Resource"), lrs.Bl("Weapon"), lrs.Bm("Skill"), lrs.Bl("NodeResource"), lrs.Bl("ContainerResource"), lrs.Bh("Counter"), lrs.Bk("Booster"), lrs.Bk("Tile"), lrs.Bk("Area"), lrs.Bk("Attribute"));

    public lrs() {
        super("hv_one");
    }

    public lrs(String string) {
        super("hv_one." + string);
    }
}

