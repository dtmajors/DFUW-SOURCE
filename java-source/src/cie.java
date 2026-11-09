/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  cew
 *  cex
 *  cug
 */
public class cie {
    public static lil<Float, Float, Float> a(cex cex2, float f, float f2, float f3) {
        lea.epN();
        if (!cid.eAW) {
            return null;
        }
        cih cih2 = (cih)cex2.aLY();
        if (cih2 == null) {
            return null;
        }
        chz chz2 = cih2.qm(cib.eAw.ordinal());
        if (chz2 == null) {
            return null;
        }
        cia cia2 = lea.epN().qe(chz2.Bm());
        float f4 = cia2.qd(chz2.aOH());
        return new lil<Float, Float, Float>(Float.valueOf(f + f * f4), Float.valueOf(f2), Float.valueOf(f3 + f3 * f4));
    }

    public static float a(int[] nArray, int[] nArray2, float f) {
        lea.epN();
        if (!cid.eAW) {
            return f;
        }
        if (nArray == null || nArray2 == null || nArray.length == 0 || nArray2.length == 0 || nArray.length != nArray2.length) {
            return f;
        }
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            if (n != cib.eAx.ordinal()) continue;
            cia cia2 = lea.epN().qe(cib.eAx.ordinal());
            float f2 = cia2.qd(nArray2[i]);
            return f + f * f2;
        }
        return f;
    }

    public static float c(cex cex2, float f) {
        lea.epN();
        if (!cid.eAW) {
            return f;
        }
        cih cih2 = (cih)cex2.aLY();
        if (cih2 == null) {
            return f;
        }
        chz chz2 = cih2.qm(cib.eAy.ordinal());
        if (chz2 == null) {
            return f;
        }
        cia cia2 = lea.epN().qe(chz2.Bm());
        float f2 = cia2.qd(chz2.aOH());
        return f - f * f2;
    }

    public static float e(cdb cdb2, float f) {
        lea.epN();
        if (!cid.eAW) {
            return f;
        }
        if (!(cdb2 instanceof cex)) {
            return f;
        }
        cex cex2 = (cex)cdb2;
        cif cif2 = cex2.aLY();
        if (cif2 == null) {
            return f;
        }
        chz chz2 = cif2.qm(cib.eAI.ordinal());
        if (chz2 == null) {
            return f;
        }
        cia cia2 = lea.epN().qe(chz2.Bm());
        float f2 = cia2.qd(chz2.aOH());
        return f + f * f2;
    }

    public static float d(cex cex2, float f) {
        lea.epN();
        if (!cid.eAW) {
            return f;
        }
        cif cif2 = cex2.aLY();
        if (cif2 == null) {
            return f;
        }
        chz chz2 = cif2.qm(cib.eAJ.ordinal());
        if (chz2 == null || !chz2.isActive()) {
            return f;
        }
        cia cia2 = lea.epN().qe(chz2.Bm());
        float f2 = cia2.qd(chz2.aOH());
        return f + f2;
    }

    public static float a(int[] nArray, int[] nArray2, float f, int n, ldi ldi2, int n2) {
        lea.epN();
        if (!cid.eAW) {
            return f;
        }
        if (nArray == null || nArray2 == null || nArray.length == 0 || nArray2.length == 0 || nArray.length != nArray2.length) {
            return f;
        }
        for (int i = 0; i < nArray.length; ++i) {
            int n3 = nArray[i];
            if (n3 != cib.eAK.ordinal()) continue;
            if (ldi2.getType() != bfk.dgC) {
                return f;
            }
            if (lea.enW().isDescendant(n, cug.fgz)) {
                return f;
            }
            cia cia2 = lea.epN().qe(cib.eAK.ordinal());
            float f2 = cia2.qd(nArray2[i]);
            return f + f * f2;
        }
        return f;
    }

    public static float e(cex cex2, float f) {
        lea.epN();
        if (!cid.eAW) {
            return f;
        }
        if (cex2.aMP()) {
            return f;
        }
        cif cif2 = cex2.aLY();
        if (cif2 == null) {
            return f;
        }
        chz chz2 = cif2.qm(cib.eAL.ordinal());
        if (chz2 == null) {
            return f;
        }
        cia cia2 = lea.epN().qe(chz2.Bm());
        float f2 = cia2.qd(chz2.aOH());
        return f + f2;
    }

    public static void a(cex cex2, cbx cbx2) {
        lea.epN();
        if (!cid.eAW) {
            return;
        }
        cif cif2 = cex2.aLY();
        if (cif2 == null) {
            return;
        }
        int n = cbx2.az();
        cib cib2 = null;
        int n2 = -1;
        boolean bl = false;
        if (lea.enW().isDescendant(n, cug.fsI)) {
            cib2 = cib.eAz;
            n2 = 13264;
        } else if (lea.enW().isDescendant(n, cug.fsJ)) {
            cib2 = cib.eAA;
            n2 = 13296;
        } else if (lea.enW().isDescendant(n, cug.fsK)) {
            cib2 = cib.eAB;
            n2 = 13248;
        } else if (lea.enW().isDescendant(n, cug.fsL)) {
            cib2 = cib.eAC;
            n2 = 13280;
        } else if (lea.enW().isDescendant(n, cug.fiu)) {
            cib2 = cib.eAD;
            n2 = 640;
            bl = true;
        } else if (lea.enW().isDescendant(n, cug.fiC)) {
            cib2 = cib.eAE;
            n2 = 640;
            bl = true;
        } else if (lea.enW().isDescendant(n, cug.fiB)) {
            cib2 = cib.eAF;
            n2 = 640;
            bl = true;
        } else {
            return;
        }
        chz chz2 = cif2.qm(cib2.ordinal());
        if (chz2 == null) {
            return;
        }
        et et2 = cbx2.jm().ah(n2);
        if (et2 == null) {
            return;
        }
        float f = et2.fN();
        cia cia2 = lea.epN().qe(chz2.Bm());
        float f2 = cia2.qd(chz2.aOH());
        if (bl) {
            et2.o(f + f2);
        } else {
            et2.o(f + f * f2);
        }
    }

    public static float f(cdb cdb2, float f) {
        lea.epN();
        if (!cid.eAW) {
            return f;
        }
        if (!(cdb2 instanceof cev)) {
            return f;
        }
        cev cev2 = (cev)cdb2;
        cif cif2 = cev2.aLY();
        if (cif2 == null) {
            return f;
        }
        chz chz2 = cif2.qm(cib.eAG.ordinal());
        if (chz2 == null) {
            return f;
        }
        cia cia2 = lea.epN().qe(chz2.Bm());
        float f2 = cia2.qd(chz2.aOH());
        return f + f * f2;
    }

    public static float a(cdb cdb2, float f) {
        lea.epN();
        if (!cid.eAW) {
            return f;
        }
        if (!(cdb2 instanceof cew)) {
            return f;
        }
        cew cew2 = (cew)cdb2;
        cif cif2 = cew2.aLY();
        if (cif2 == null) {
            return f;
        }
        chz chz2 = cif2.qm(cib.eAH.ordinal());
        if (chz2 == null) {
            return f;
        }
        cia cia2 = lea.epN().qe(chz2.Bm());
        float f2 = cia2.qd(chz2.aOH());
        return f + f * f2;
    }

    public static float f(cdb cdb2) {
        lea.epN();
        if (!cid.eAW) {
            return 0.0f;
        }
        if (!(cdb2 instanceof cew)) {
            return 0.0f;
        }
        cew cew2 = (cew)cdb2;
        cif cif2 = cew2.aLY();
        if (cif2 == null) {
            return 0.0f;
        }
        chz chz2 = cif2.qm(cib.eAH.ordinal());
        if (chz2 == null) {
            return 0.0f;
        }
        cia cia2 = lea.epN().qe(chz2.Bm());
        float f = cia2.qd(chz2.aOH());
        return f;
    }

    public static int a(chz[] chzArray, int n) {
        lea.epN();
        if (!cid.eAW) {
            return -1;
        }
        if (chzArray == null || chzArray.length == 0) {
            return -1;
        }
        for (chz chz2 : chzArray) {
            if (chz2.Bm() != n) continue;
            return chz2.aOH();
        }
        return -1;
    }
}

