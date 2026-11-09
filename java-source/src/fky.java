/*
 * Decompiled with CFR.
 */
public class fky
extends fkc
implements dxu {
    public static final int gKG = 1;
    public static final int gKH = 2;
    public static final int gKy = 3;
    public static final int iPe = 4;
    public static final int iPf = 5;
    public int cZn = 0;
    public int aqs = -1;
    public ldv dxt;
    public ldv aCK;
    public brp[] iPg;
    public int aRX = 0;
    public int iPh = 0;
    public float iPi;
    public ldv YN;
    public int dJc = -1;
    public int gLa = -1;
    public int gKW = -1;
    public int SkillType = 0;
    public int imo = -1;
    public int[] ims = null;
    public int[] imt = null;

    fky() {
        super(11781);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public static fky a(lbm<dxq> lbm2, ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5) {
        fky fky2 = (fky)lbm2.ik(11781);
        fky2.on(ldv2);
        fky2.YN = ldv3;
        fky2.dxt = ldv4;
        fky2.aCK = ldv5;
        return fky2;
    }
}

