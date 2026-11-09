/*
 * Decompiled with CFR.
 */
public final class lti
extends lsd {
    private static final lti sNE = new lti();
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_gnoll_30 feat display name")
    public static final lox sNF = sNE.a("pe_kill_gnoll_30_DisplayName", lti.Bl("Resource"), lti.Bl("Weapon"), lti.Bm("Skill"), lti.Bl("NodeResource"), lti.Bl("ContainerResource"), lti.Bh("Counter"), lti.Bk("Booster"), lti.Bk("Tile"), lti.Bk("Area"), lti.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_gnoll_30 feat description")
    public static final lox sNG = sNE.a("pe_kill_gnoll_30_Description", lti.Bl("Resource"), lti.Bl("Weapon"), lti.Bm("Skill"), lti.Bl("NodeResource"), lti.Bl("ContainerResource"), lti.Bh("Counter"), lti.Bk("Booster"), lti.Bk("Tile"), lti.Bk("Area"), lti.Bk("Attribute"));
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Killer")
    @lpl(value="The pe_kill_gnoll_150 feat display name")
    public static final lox sNH = sNE.a("pe_kill_gnoll_150_DisplayName", lti.Bl("Resource"), lti.Bl("Weapon"), lti.Bm("Skill"), lti.Bl("NodeResource"), lti.Bl("ContainerResource"), lti.Bh("Counter"), lti.Bk("Booster"), lti.Bk("Tile"), lti.Bk("Area"), lti.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_gnoll_150 feat description")
    public static final lox sNI = sNE.a("pe_kill_gnoll_150_Description", lti.Bl("Resource"), lti.Bl("Weapon"), lti.Bm("Skill"), lti.Bl("NodeResource"), lti.Bl("ContainerResource"), lti.Bh("Counter"), lti.Bk("Booster"), lti.Bk("Tile"), lti.Bk("Area"), lti.Bk("Attribute"));

    public lti() {
        super("pe_kill_gnoll");
    }

    public lti(String string) {
        super("pe_kill_gnoll." + string);
    }
}

