/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.util.List;

public class jbg {
    public static jbf b(jbh jbh2) {
        switch (jbh2) {
            case mNh: {
                return jbg.a(208, 5232, jbh2, hso.cxK().cxP().cyZ().bnS());
            }
            case mNi: {
                return jbg.a(160, 2576, jbh2, hso.cxK().cxP().cyZ().cAF());
            }
            case mNj: {
                return jbg.a(176, 3360, jbh2, hso.cxK().cxP().cyZ().cAH());
            }
            case mNk: {
                return jbg.a(240, 5744, jbh2, hso.cxK().cxP().cyZ().cAG());
            }
            case mNz: {
                return jbg.a(13248, 13248, jbh2, hso.cxK().cxP().cyZ().Oy(13248));
            }
            case mNA: {
                return jbg.a(13264, 13264, jbh2, hso.cxK().cxP().cyZ().Oy(13264));
            }
            case mNB: {
                return jbg.a(14128, 14128, jbh2, hso.cxK().cxP().cyZ().Oy(14128));
            }
            case mNC: {
                return jbg.a(13296, 13296, jbh2, hso.cxK().cxP().cyZ().Oy(13296));
            }
            case mND: {
                return jbg.a(13280, 13280, jbh2, hso.cxK().cxP().cyZ().Oy(13280));
            }
        }
        return null;
    }

    private static jbf a(int n, int n2, jbh jbh2, float f2) {
        jbf jbf2 = new jbf();
        jbf2.bnM = n;
        jbf2.mNa = jbh2;
        jbf2.mNb = f2;
        jbf2.mNf = jbg.TH(n2);
        jbf2.mNd = jbg.fg(n, 2);
        jbf2.mNe = Math.abs(jbg.fg(n, 3));
        jbf2.mNc = jbf2.mNb - jbf2.mNd + jbf2.mNe - jbf2.mNf;
        return jbf2;
    }

    private static float fg(int n, int n2) {
        List<hvz> list = hso.cxK().cxP().cyJ().cIo().gh();
        if (list == null) {
            return 0.0f;
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (hvz hvz2 : list) {
            List<alu> list2 = hvz2.gh();
            if (list2 == null) continue;
            block5: for (alu alu2 : list2) {
                switch (alu2.DW()) {
                    case 3: 
                    case 5: 
                    case 7: {
                        if (n2 != 3) break;
                        float f4 = jbg.c(alu2, n);
                        if (!(f4 < f3)) continue block5;
                        f3 = f4;
                        break;
                    }
                    case 2: 
                    case 4: {
                        float f4;
                        if (n2 != 2 || !((f4 = jbg.c(alu2, n)) > f2)) break;
                        f2 = f4;
                    }
                }
            }
        }
        return f2 + f3;
    }

    private static float c(alu alu2, int n) {
        ldi ldi2 = (ldi)lea.enT().acv(alu2.CD());
        if (ldi2.enl() != null) {
            for (lce lce2 : ldi2.enl()) {
                if (lce2.bnM != n) continue;
                return alu2.uO();
            }
        }
        return 0.0f;
    }

    private static int t(alu alu2) {
        String string = alu2.CE();
        if (string == null) {
            return -1;
        }
        int n = ep.as((String)string);
        return n;
    }

    private static float TH(int n) {
        String string = hso.cxK().cxP().cyZ().Oz(n);
        if (string == null) {
            return 0.0f;
        }
        ckk ckk2 = lea.epw().hz(string);
        if (ckk2 == null) {
            return 0.0f;
        }
        cki cki2 = ckk2.aQU().get(n);
        if (cki2 == null) {
            return 0.0f;
        }
        return cki2.aQR();
    }

    public static int TI(int n) {
        int n2 = 0;
        jbh[] jbhArray = new jbh[]{jbh.mNh, jbh.mNi, jbh.mNk, jbh.mNj};
        for (int i = 0; i < jbhArray.length; ++i) {
            jbf jbf2 = jbg.b(jbhArray[i]);
            if (Math.round(jbf2.mNc) < n) continue;
            ++n2;
        }
        return n2;
    }

    public static float d(bsh bsh2, int n) {
        ej[] ejArray;
        for (ej ej2 : ejArray = bsh2.arJ()) {
            if (ej2.getType() != n) continue;
            Object object = ej2.getValue();
            Float f2 = (Float)object;
            return f2.floatValue();
        }
        return 0.0f;
    }

    public static int e(bsh bsh2, int n) {
        ej[] ejArray;
        for (ej ej2 : ejArray = bsh2.arJ()) {
            if (ej2.getType() != n) continue;
            Object object = ej2.getValue();
            Integer n2 = (Integer)object;
            return n2;
        }
        return 0;
    }

    public static String f(bsh bsh2, int n) {
        ej[] ejArray;
        for (ej ej2 : ejArray = bsh2.arJ()) {
            if (ej2.getType() != n) continue;
            return (String)ej2.getValue();
        }
        return null;
    }

    public static float V(bsh bsh2) {
        float f2 = jbg.d(bsh2, 1232);
        if (f2 == 999.0f) {
            f2 = 0.0f;
        }
        return f2;
    }

    public static float W(bsh bsh2) {
        return jbg.d(bsh2, 1234);
    }
}

