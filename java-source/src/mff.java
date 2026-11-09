/*
 * Decompiled with CFR.
 */
public final class mff
extends meq {
    private static final mff CCr = new mff();
    @lok(value="Old Spellcraft Spells")
    @lpl(value="The s_old_spellcraft_spells skill name in singular form")
    public static final lox CCs = CCr.BC("s_old_spellcraft_spells_NameSingular");
    @lok(value="This school specializes in granting bonuses to companions rather than dealing damage to foes. As such, a spell chanter is valuable in a party, but much less so on his own.")
    @lpl(value="The s_old_spellcraft_spells skill description")
    public static final lox CCt = CCr.BC("s_old_spellcraft_spells_Description");
    @lok(value="Ominous Drain")
    @lpl(value="The s_ominous_drain skill name in singular form")
    public static final lox CCu = CCr.BC("s_ominous_drain_NameSingular");
    @lok(value="Fires a missile that may reduce all its target\\'s Base Attributes.")
    @lpl(value="The s_ominous_drain skill description")
    public static final lox CCv = CCr.BC("s_ominous_drain_Description");
    @lok(value="Other Skills")
    @lpl(value="The s_other_skills skill name in singular form")
    public static final lox CCw = CCr.BC("s_other_skills_NameSingular");
    @lok(value="Description of s_Other Skills")
    @lpl(value="The s_other_skills skill description")
    public static final lox CCx = CCr.BC("s_other_skills_Description");

    public mff() {
        super("O");
    }

    public mff(String string) {
        super("O." + string);
    }
}

