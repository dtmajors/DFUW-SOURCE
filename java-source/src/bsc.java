/*
 * Decompiled with CFR.
 */
public class bsc
extends brm
implements bsj {
    private int SkillType = 0;
    private float SkillLevel;
    private float aXV = 0.0f;

    public int zg() {
        return this.SkillType;
    }

    public void eI(int n) {
        this.SkillType = n;
    }

    @Override
    public float Bt() {
        return this.SkillLevel;
    }

    public void ag(float f2) {
        this.SkillLevel = f2;
    }

    @Override
    public float Bb() {
        return this.aXV;
    }

    public void aa(float f2) {
        this.aXV = f2;
    }

    @Override
    public final brm aue() {
        return (brm)((Object)this.awy());
    }

    public boolean equals(Object object) {
        if (object instanceof bsc) {
            bsc bsc2 = (bsc)object;
            return this.GUID.equals(bsc2.getGUID());
        }
        return false;
    }

    public final bsn awK() {
        bsn bsn2 = lea.acm(this.SkillType);
        if (bsn2 == null) {
            // empty if block
        }
        return bsn2;
    }

    public String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" SkillType='");
        stringBuilder.append(this.Bu());
        stringBuilder.append("' SkillLevel=");
        stringBuilder.append(this.SkillLevel);
        stringBuilder.append(" Cost=");
        stringBuilder.append(this.aXV);
        return stringBuilder.toString();
    }

    @Override
    public bsf awy() {
        bsc bsc2 = new bsc();
        bsc2.setGUID(this.GUID);
        bsc2.eI(this.SkillType);
        bsc2.ag(this.SkillLevel);
        bsc2.aa(this.aXV);
        return bsc2;
    }

    @Override
    public String awz() {
        return this.Bu();
    }

    @Override
    public lip awA() {
        return new ljk(this.awz());
    }

    @Override
    public float pe() {
        return 0.0f;
    }

    public float awL() {
        return 0.0f;
    }

    @Override
    public boolean awD() {
        return true;
    }

    @Override
    public bsg awE() {
        return this.awK();
    }
}

