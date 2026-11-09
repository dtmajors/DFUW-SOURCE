/*
 * Decompiled with CFR.
 */
public final class lrz
extends lrx {
    private static final lrz sJP = new lrz();
    @lok(value="Responsible Renter")
    @lpl(value="The hz_pay_rent feat display name")
    public static final lox sJQ = sJP.a("hz_pay_rent_DisplayName", lrz.Bl("Resource"), lrz.Bl("Weapon"), lrz.Bm("Skill"), lrz.Bl("NodeResource"), lrz.Bl("ContainerResource"), lrz.Bh("Counter"), lrz.Bk("Booster"), lrz.Bk("Tile"), lrz.Bk("Area"), lrz.Bk("Attribute"));
    @lok(value="Pay the rent on a property you reside in.")
    @lpl(value="The hz_pay_rent feat description")
    public static final lox sJR = sJP.a("hz_pay_rent_Description", lrz.Bl("Resource"), lrz.Bl("Weapon"), lrz.Bm("Skill"), lrz.Bl("NodeResource"), lrz.Bl("ContainerResource"), lrz.Bh("Counter"), lrz.Bk("Booster"), lrz.Bk("Tile"), lrz.Bk("Area"), lrz.Bk("Attribute"));

    public lrz() {
        super("hz_pay_rent");
    }

    public lrz(String string) {
        super("hz_pay_rent." + string);
    }
}

