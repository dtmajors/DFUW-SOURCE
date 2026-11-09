/*
 * Decompiled with CFR.
 */
public final class lpn
extends lpa {
    private static final lpn rKB = new lpn();
    @lok(value="Human Tiles")
    @lpl(value="Display name for area human_tiles")
    public static final lox rKC = rKB.BC("human_tiles_DisplayName");
    @lok(value="Ork Tiles")
    @lpl(value="Display name for area ork_tiles")
    public static final lox rKD = rKB.BC("ork_tiles_DisplayName");
    @lok(value="center")
    @lpl(value="Display name for area center")
    public static final lox rKE = rKB.BC("center_DisplayName");
    @lok(value="subcontinent_1")
    @lpl(value="Display name for area subcontinent_1")
    public static final lox rKF = rKB.BC("subcontinent_1_DisplayName");
    @lok(value="subcontinent_2")
    @lpl(value="Display name for area subcontinent_2")
    public static final lox rKG = rKB.BC("subcontinent_2_DisplayName");
    @lok(value="subcontinent_3")
    @lpl(value="Display name for area subcontinent_3")
    public static final lox rKH = rKB.BC("subcontinent_3_DisplayName");
    @lok(value="subcontinent_4")
    @lpl(value="Display name for area subcontinent_4")
    public static final lox rKI = rKB.BC("subcontinent_4_DisplayName");
    @lok(value="Starting Dungeon")
    @lpl(value="Display name for area first_dungeon")
    public static final lox rKJ = rKB.BC("first_dungeon_DisplayName");
    @lok(value="NPC and faction cities")
    @lpl(value="Display name for area npc_faction_cities")
    public static final lox rKK = rKB.BC("npc_faction_cities_DisplayName");

    public lpn() {
        super("Area");
    }

    public lpn(String string) {
        super("Area." + string);
    }
}

