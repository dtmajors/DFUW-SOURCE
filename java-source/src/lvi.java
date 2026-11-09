/*
 * Decompiled with CFR.
 */
public final class lvi
extends lvh {
    private static final lvi sVc = new lvi();
    @lok(value="Party Planner")
    @lpl(value="The so_create_party feat display name")
    public static final lox sVd = sVc.a("so_create_party_DisplayName", lvi.Bl("Resource"), lvi.Bl("Weapon"), lvi.Bm("Skill"), lvi.Bl("NodeResource"), lvi.Bl("ContainerResource"), lvi.Bh("Counter"), lvi.Bk("Booster"), lvi.Bk("Tile"), lvi.Bk("Area"), lvi.Bk("Attribute"));
    @lok(value="Invite another player and create a party.")
    @lpl(value="The so_create_party feat description")
    public static final lox sVe = sVc.a("so_create_party_Description", lvi.Bl("Resource"), lvi.Bl("Weapon"), lvi.Bm("Skill"), lvi.Bl("NodeResource"), lvi.Bl("ContainerResource"), lvi.Bh("Counter"), lvi.Bk("Booster"), lvi.Bk("Tile"), lvi.Bk("Area"), lvi.Bk("Attribute"));
    @lok(value="Possibly Popular")
    @lpl(value="The so_joinparty_1 feat display name")
    public static final lox sVf = sVc.a("so_joinparty_1_DisplayName", lvi.Bl("Resource"), lvi.Bl("Weapon"), lvi.Bm("Skill"), lvi.Bl("NodeResource"), lvi.Bl("ContainerResource"), lvi.Bh("Counter"), lvi.Bk("Booster"), lvi.Bk("Tile"), lvi.Bk("Area"), lvi.Bk("Attribute"));
    @lok(value="Join a party.")
    @lpl(value="The so_joinparty_1 feat description")
    public static final lox sVg = sVc.a("so_joinparty_1_Description", lvi.Bl("Resource"), lvi.Bl("Weapon"), lvi.Bm("Skill"), lvi.Bl("NodeResource"), lvi.Bl("ContainerResource"), lvi.Bh("Counter"), lvi.Bk("Booster"), lvi.Bk("Tile"), lvi.Bk("Area"), lvi.Bk("Attribute"));

    public lvi() {
        super("so_party");
    }

    public lvi(String string) {
        super("so_party." + string);
    }
}

