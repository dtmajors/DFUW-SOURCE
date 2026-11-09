/*
 * Decompiled with CFR.
 */
public final class lsp
extends lsd {
    private static final lsp sLF = new lsp();
    @lok(value="Master $(Resource.Name$(Counter.Plurality)) Trapper")
    @lpl(value="The pe_kill_brown_bear_150 feat display name")
    public static final lox sLG = sLF.a("pe_kill_brown_bear_150_DisplayName", lsp.Bl("Resource"), lsp.Bl("Weapon"), lsp.Bm("Skill"), lsp.Bl("NodeResource"), lsp.Bl("ContainerResource"), lsp.Bh("Counter"), lsp.Bk("Booster"), lsp.Bk("Tile"), lsp.Bk("Area"), lsp.Bk("Attribute"));
    @lok(value="Perform the killing blow on $(Counter) $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_brown_bear_150 feat description")
    public static final lox sLH = sLF.a("pe_kill_brown_bear_150_Description", lsp.Bl("Resource"), lsp.Bl("Weapon"), lsp.Bm("Skill"), lsp.Bl("NodeResource"), lsp.Bl("ContainerResource"), lsp.Bh("Counter"), lsp.Bk("Booster"), lsp.Bk("Tile"), lsp.Bk("Area"), lsp.Bk("Attribute"));
    @lok(value="Competent $(Resource.Name$(Counter.Plurality)) Trapper")
    @lpl(value="The pe_kill_brown_bear_30 feat display name")
    public static final lox sLI = sLF.a("pe_kill_brown_bear_30_DisplayName", lsp.Bl("Resource"), lsp.Bl("Weapon"), lsp.Bm("Skill"), lsp.Bl("NodeResource"), lsp.Bl("ContainerResource"), lsp.Bh("Counter"), lsp.Bk("Booster"), lsp.Bk("Tile"), lsp.Bk("Area"), lsp.Bk("Attribute"));
    @lok(value="Perform the killing blow on thirty $(Resource.Name$(Counter.Plurality)).")
    @lpl(value="The pe_kill_brown_bear_30 feat description")
    public static final lox sLJ = sLF.a("pe_kill_brown_bear_30_Description", lsp.Bl("Resource"), lsp.Bl("Weapon"), lsp.Bm("Skill"), lsp.Bl("NodeResource"), lsp.Bl("ContainerResource"), lsp.Bh("Counter"), lsp.Bk("Booster"), lsp.Bk("Tile"), lsp.Bk("Area"), lsp.Bk("Attribute"));

    public lsp() {
        super("pe_kill_brown_bear");
    }

    public lsp(String string) {
        super("pe_kill_brown_bear." + string);
    }
}

