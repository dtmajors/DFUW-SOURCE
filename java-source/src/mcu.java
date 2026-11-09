/*
 * Decompiled with CFR.
 */
public class mcu
extends lzh {
    private static final mcu uCm = new mcu();
    @lok(value="Winter has come! The Feast Lord, enraged at the squishing of his servants, challenges all who dare face his wrath!")
    @lpl(value="Message shown to all online players when the special event boss is ready to spawn.")
    public static final lox uCn = uCm.BC("BossWarningVoice");
    @lok(value="Who dares abuse my frosty minions! I will rend you miserable curs in twain! Come, face the Feast Lord in $(Tile)!")
    @lpl(value="Message shown to all online players when the special event boss spawns.")
    public static final lox uCo = uCm.a("BossSpawned", mcu.Bl("Resource"), mcu.Br("Tile"));
    @lok(value="The $(Resource.NameSingular) has Fallen in $(Tile)! Bring your $(Sparks.NamePlural) and thaw out his stolen Gift Boxes!")
    @lpl(value="Message shown to all online players when the special event boss spawns.")
    public static final lox uCp = uCm.a("BossDied", mcu.Bl("Resource"), mcu.Br("Tile"), mcu.Bl("Sparks"));

    protected mcu(String string) {
        super("SpecialEvents." + string);
    }

    private mcu() {
        super("SpecialEvents");
    }
}

