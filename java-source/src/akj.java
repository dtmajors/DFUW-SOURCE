/*
 * Decompiled with CFR.
 */
public class akj
extends ajm {
    private int bnR = -1;
    private int SkillType = -1;

    public akj() {
        this.bog = ajb.b.bpc;
    }

    public int Cc() {
        return this.bnR;
    }

    public void fD(int n) {
        this.bnR = n;
    }

    public String Cd() {
        return cxh.fH(this.bnR);
    }

    public int zg() {
        return this.SkillType;
    }

    public void eI(int n) {
        this.SkillType = n;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        akj akj2 = (akj)aja2;
        akj2.fD(this.bnR);
        akj2.eI(this.SkillType);
    }
}

