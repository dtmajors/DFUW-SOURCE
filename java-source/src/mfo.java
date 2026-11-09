/*
 * Decompiled with CFR.
 */
public class mfo
extends meq {
    private static final mfo CKu = new mfo();
    @lok(value="Base")
    @lpl(value="Name of the skill gain XP modifier category 'Base'")
    public static final lox txe = CKu.BC("Base");
    @lok(value="Crafting")
    @lpl(value="Name of the skill gain XP modifier category 'Crafting'")
    public static final lox rWT = CKu.BC("Crafting");
    @lok(value="Melee")
    @lpl(value="Name of the skill gain XP modifier category 'Melee'")
    public static final lox CKv = CKu.BC("Melee");
    @lok(value="Attack By Monster")
    @lpl(value="Name of the skill gain XP modifier category 'AttackByMonster'")
    public static final lox CKw = CKu.BC("AttackByMonster");
    @lok(value="Monster Attack")
    @lpl(value="Name of the skill gain XP modifier category 'MonsterAttack'")
    public static final lox CKx = CKu.BC("MonsterAttack");
    @lok(value="Monster Attack Debuff")
    @lpl(value="Name of the skill gain XP modifier category 'MonsterAttackDebuff'")
    public static final lox CKy = CKu.BC("MonsterAttackDebuff");
    @lok(value="Resistance Skills")
    @lpl(value="Name of the skill gain XP modifier category 'ResistanceSkills'")
    public static final lox CKz = CKu.BC("ResistanceSkills");
    @lok(value="Spells")
    @lpl(value="Name of the skill gain XP modifier category 'Spells'")
    public static final lox CKA = CKu.BC("Spells");
    @lok(value="Spell Heirs")
    @lpl(value="Name of the skill gain XP modifier category 'SpellHeirs'")
    public static final lox CKB = CKu.BC("SpellHeirs");

    protected mfo(String string) {
        super("XPGainModifierCategories." + string);
    }

    private mfo() {
        super("XPGainModifierCategories");
    }
}

