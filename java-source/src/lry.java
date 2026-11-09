/*
 * Decompiled with CFR.
 */
public final class lry
extends lrx {
    private static final lry sJM = new lry();
    @lok(value="Slumlord")
    @lpl(value="The hz_add_tenant feat display name")
    public static final lox sJN = sJM.a("hz_add_tenant_DisplayName", lry.Bl("Resource"), lry.Bl("Weapon"), lry.Bm("Skill"), lry.Bl("NodeResource"), lry.Bl("ContainerResource"), lry.Bh("Counter"), lry.Bk("Booster"), lry.Bk("Tile"), lry.Bk("Area"), lry.Bk("Attribute"));
    @lok(value="Add a tenant to a house you own.")
    @lpl(value="The hz_add_tenant feat description")
    public static final lox sJO = sJM.a("hz_add_tenant_Description", lry.Bl("Resource"), lry.Bl("Weapon"), lry.Bm("Skill"), lry.Bl("NodeResource"), lry.Bl("ContainerResource"), lry.Bh("Counter"), lry.Bk("Booster"), lry.Bk("Tile"), lry.Bk("Area"), lry.Bk("Attribute"));

    public lry() {
        super("hz_invite_tenant");
    }

    public lry(String string) {
        super("hz_invite_tenant." + string);
    }
}

