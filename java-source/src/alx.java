/*
 * Decompiled with CFR.
 */
public abstract class alx
extends alt {
    private int SkillType = 0;

    public final int zg() {
        return this.SkillType;
    }

    public final void eI(int n) {
        this.SkillType = n;
    }

    public final String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    @Override
    protected void g(alt alt2) {
        super.g(alt2);
        alx alx2 = (alx)alt2;
        alx2.eI(this.SkillType);
    }
}

