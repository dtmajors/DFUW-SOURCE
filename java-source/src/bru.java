/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class bru
implements bsh {
    private lgw dJb;
    private ej[] DR;

    public bru(lgw lgw2, ej[] ejArray) {
        this.dJb = lgw2;
        this.DR = ejArray;
    }

    public bru(lgw lgw2) {
        this(lgw2, lea.eov().get(lgw2.getType()).arJ());
    }

    @Override
    public bsf awy() {
        return new bru(this.dJb);
    }

    @Override
    public ldv getGUID() {
        return null;
    }

    @Override
    public String awz() {
        return this.dJb.getName();
    }

    @Override
    public lip awA() {
        return this.dJb.awO();
    }

    @Override
    public boolean awD() {
        return true;
    }

    @Override
    public bsg awE() {
        return this.dJb;
    }

    @Override
    public float Bb() {
        return cug.vc((int)this.dJb.getType());
    }

    @Override
    public int az() {
        return this.dJb.getType();
    }

    @Override
    public int vf() {
        return cug.uF((int)this.dJb.getType());
    }

    @Override
    public bsm awx() {
        return this.dJb;
    }

    @Override
    public float awB() {
        return cug.mr((int)this.dJb.getType()) * (float)this.vf();
    }

    @Override
    public ldv AW() {
        return null;
    }

    @Override
    public ldv avU() {
        return null;
    }

    @Override
    public cak.c auO() {
        return this.dJb.auO();
    }

    @Override
    public int AR() {
        return 0;
    }

    @Override
    public alc.a awF() {
        return null;
    }

    @Override
    public ej[] arJ() {
        return this.DR;
    }

    @Override
    public boolean ad(int n) {
        return false;
    }

    @Override
    public boolean AT() {
        return false;
    }

    @Override
    public long AQ() {
        return -1L;
    }
}

