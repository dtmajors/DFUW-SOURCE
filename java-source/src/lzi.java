/*
 * Decompiled with CFR.
 */
public class lzi
extends lzh {
    private static final lzi tVZ = new lzi();
    @lok(value="Something wicked this way comes. Beware the $(BossResourceName.NameSingular)!")
    @lpl(value="On-screen notification when a low level 'boss' monster spawns, to all nearby players")
    public static final lox tWa = tVZ.a("BossSpawned_0", lzi.Bl("BossResourceName"));
    @lok(value="$(BossResourceName.NameSingular) has awoken and hungers for victims!")
    @lpl(value="On-screen notification when a 'boss' monster spawns, to all nearby players")
    public static final lox tWb = tVZ.a("BossSpawned_1", lzi.Bl("BossResourceName"));
    @lok(value="The walls shake and dust falls from the ceiling. $(BossResourceName.NameSingular) has arrived and calls for battle!")
    @lpl(value="On-screen notification when a 'boss' monster spawns, to all nearby players")
    public static final lox tWc = tVZ.a("BossSpawned_2", lzi.Bl("BossResourceName"));
    @lok(value="Take heed and beware! $(BossResourceName.NameSingular) has spawned nearby and hungers for fresh kills!")
    @lpl(value="On-screen notification when a 'boss' monster spawns, to all nearby players")
    public static final lox tWd = tVZ.a("BossSpawned_3", lzi.Bl("BossResourceName"));
    @lok(value="Glory, loot, and possibly death lie close! $(BossResourceName.NameSingular) has woken and seeks a fight!")
    @lpl(value="On-screen notification when a 'boss' monster spawns, to all nearby players")
    public static final lox tWe = tVZ.a("BossSpawned_4", lzi.Bl("BossResourceName"));
    @lok(value="Tread lightly or tread valiantly! $(BossResourceName.NameSingular) is closeby!")
    @lpl(value="On-screen notification when a 'boss' monster spawns, to all nearby players")
    public static final lox tWf = tVZ.a("BossSpawned_5", lzi.Bl("BossResourceName"));
    @lok(value="$(BossResourceName.NameSingular) is to be awaken in $(Time) minutes!")
    @lpl(value="On-screen notification when a 'boss' monster spawns, to all players")
    public static final lox tWg = tVZ.a("BossToSpawn_Global", lzi.Bl("BossResourceName"), lzi.Bh("Time"));

    protected lzi(String string) {
        super("AI." + string);
    }

    private lzi() {
        super("AI");
    }
}

