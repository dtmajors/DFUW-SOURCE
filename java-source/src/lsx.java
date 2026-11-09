/*
 * Decompiled with CFR.
 */
public final class lsx
extends lsd {
    private static final lsx sMv = new lsx();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_davosh_1 feat display name")
    public static final lox sMw = sMv.a("pe_kill_davosh_1_DisplayName", lsx.Bl("Resource"), lsx.Bl("Weapon"), lsx.Bm("Skill"), lsx.Bl("NodeResource"), lsx.Bl("ContainerResource"), lsx.Bh("Counter"), lsx.Bk("Booster"), lsx.Bk("Tile"), lsx.Bk("Area"), lsx.Bk("Attribute"));
    @lok(value="Perform the killing blow on Sir Davosh the Damned once.")
    @lpl(value="The pe_kill_davosh_1 feat description")
    public static final lox sMx = sMv.a("pe_kill_davosh_1_Description", lsx.Bl("Resource"), lsx.Bl("Weapon"), lsx.Bm("Skill"), lsx.Bl("NodeResource"), lsx.Bl("ContainerResource"), lsx.Bh("Counter"), lsx.Bk("Booster"), lsx.Bk("Tile"), lsx.Bk("Area"), lsx.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_davosh_5 feat display name")
    public static final lox sMy = sMv.a("pe_kill_davosh_5_DisplayName", lsx.Bl("Resource"), lsx.Bl("Weapon"), lsx.Bm("Skill"), lsx.Bl("NodeResource"), lsx.Bl("ContainerResource"), lsx.Bh("Counter"), lsx.Bk("Booster"), lsx.Bk("Tile"), lsx.Bk("Area"), lsx.Bk("Attribute"));
    @lok(value="Perform the killing blow on Sir Davosh the Damned five times.")
    @lpl(value="The pe_kill_davosh_5 feat description")
    public static final lox sMz = sMv.a("pe_kill_davosh_5_Description", lsx.Bl("Resource"), lsx.Bl("Weapon"), lsx.Bm("Skill"), lsx.Bl("NodeResource"), lsx.Bl("ContainerResource"), lsx.Bh("Counter"), lsx.Bk("Booster"), lsx.Bk("Tile"), lsx.Bk("Area"), lsx.Bk("Attribute"));

    public lsx() {
        super("pe_kill_davosh");
    }

    public lsx(String string) {
        super("pe_kill_davosh." + string);
    }
}

