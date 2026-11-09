/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
@llc
public enum cxn {
    Base(mfo.txe),
    Crafting(mfo.rWT),
    Melee(mfo.CKv),
    AttackByMonster(mfo.CKw),
    MonsterAttack(mfo.CKx),
    MonsterAttackDebuff(mfo.CKy),
    ResistanceSkills(mfo.CKz),
    Spells(mfo.CKA),
    SpellHeirs(mfo.CKB);

    private lox NameString = null;

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private cxn(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static cxn getValueByName(String string) {
        if (string == null) {
            return null;
        }
        for (cxn cxn2 : cxn.values()) {
            if (cxn2.name().compareToIgnoreCase(string) != 0) continue;
            return cxn2;
        }
        return null;
    }
}

