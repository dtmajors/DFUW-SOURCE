/*
 * Decompiled with CFR.
 */
public final class lsc
extends lrx {
    private static final lsc sKk = new lsc();
    @lok(value="The Tenant")
    @lpl(value="The hz_become_tenant feat display name")
    public static final lox sKl = sKk.a("hz_become_tenant_DisplayName", lsc.Bl("Resource"), lsc.Bl("Weapon"), lsc.Bm("Skill"), lsc.Bl("NodeResource"), lsc.Bl("ContainerResource"), lsc.Bh("Counter"), lsc.Bk("Booster"), lsc.Bk("Tile"), lsc.Bk("Area"), lsc.Bk("Attribute"));
    @lok(value="Become a tenant in player housing.")
    @lpl(value="The hz_become_tenant feat description")
    public static final lox sKm = sKk.a("hz_become_tenant_Description", lsc.Bl("Resource"), lsc.Bl("Weapon"), lsc.Bm("Skill"), lsc.Bl("NodeResource"), lsc.Bl("ContainerResource"), lsc.Bh("Counter"), lsc.Bk("Booster"), lsc.Bk("Tile"), lsc.Bk("Area"), lsc.Bk("Attribute"));

    public lsc() {
        super("hz_tenant");
    }

    public lsc(String string) {
        super("hz_tenant." + string);
    }
}

