/*
 * Decompiled with CFR.
 */
public class efd
extends eea {
    public static final int iop = 1;
    public static final int ioq = 2;
    public static final int ior = 3;
    public cdy ioe;
    public int ios = 0;
    public int SkillType = 0;

    efd() {
        super(12809);
    }

    public static efd a(lbm<dxq> lbm2, ldv ldv2, int n2, int n3) {
        efd efd2 = (efd)lbm2.ik(12809);
        efd2.on(ldv2);
        efd2.ios = n2;
        efd2.SkillType = n3;
        efd2.ioe = cdy.eod;
        return efd2;
    }
}

