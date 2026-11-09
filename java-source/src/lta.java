/*
 * Decompiled with CFR.
 */
public final class lta
extends lsd {
    private static final lta sMM = new lta();
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_erodach_15 feat display name")
    public static final lox sMN = sMM.a("pe_kill_erodach_15_DisplayName", lta.Bl("Resource"), lta.Bl("Weapon"), lta.Bm("Skill"), lta.Bl("NodeResource"), lta.Bl("ContainerResource"), lta.Bh("Counter"), lta.Bk("Booster"), lta.Bk("Tile"), lta.Bk("Area"), lta.Bk("Attribute"));
    @lok(value="Perform the killing blow on the Erodach five times.")
    @lpl(value="The pe_kill_erodach_15 feat description")
    public static final lox sMO = sMM.a("pe_kill_erodach_15_Description", lta.Bl("Resource"), lta.Bl("Weapon"), lta.Bm("Skill"), lta.Bl("NodeResource"), lta.Bl("ContainerResource"), lta.Bh("Counter"), lta.Bk("Booster"), lta.Bk("Tile"), lta.Bk("Area"), lta.Bk("Attribute"));
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_erodach_1 feat display name")
    public static final lox sMP = sMM.a("pe_kill_erodach_1_DisplayName", lta.Bl("Resource"), lta.Bl("Weapon"), lta.Bm("Skill"), lta.Bl("NodeResource"), lta.Bl("ContainerResource"), lta.Bh("Counter"), lta.Bk("Booster"), lta.Bk("Tile"), lta.Bk("Area"), lta.Bk("Attribute"));
    @lok(value="Perform the killing blow on the Erodach once.")
    @lpl(value="The pe_kill_erodach_1 feat description")
    public static final lox sMQ = sMM.a("pe_kill_erodach_1_Description", lta.Bl("Resource"), lta.Bl("Weapon"), lta.Bm("Skill"), lta.Bl("NodeResource"), lta.Bl("ContainerResource"), lta.Bh("Counter"), lta.Bk("Booster"), lta.Bk("Tile"), lta.Bk("Area"), lta.Bk("Attribute"));

    public lta() {
        super("pe_kill_erodach");
    }

    public lta(String string) {
        super("pe_kill_erodach." + string);
    }
}

