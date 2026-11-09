/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 */
public class bsi {
    public static boolean mv(int n) {
        return lea.enW().isDescendant(n, cug.fiC);
    }

    public static boolean mw(int n) {
        return lea.enW().isDescendant(n, cug.fiu);
    }

    public static boolean mx(int n) {
        return lea.enW().isDescendant(n, cug.fiB);
    }

    public static boolean my(int n) {
        return lea.enW().isDescendant(n, cug.fkF);
    }

    public static boolean mz(int n) {
        return lea.enW().isDescendant(n, cug.fiL);
    }

    public static boolean mA(int n) {
        return bsi.mz(n) && bqm.d.isOneHandedWeapon(bqm.d.getWeaponType(n));
    }

    public static boolean mB(int n) {
        return bsi.mz(n) && bqm.d.isTwoHandedWeapon(bqm.d.getWeaponType(n));
    }

    public static boolean mC(int n) {
        return lea.enW().isDescendant(n, cug.fiN) || lea.enW().isDescendant(n, cug.fiO);
    }

    public static boolean mD(int n) {
        return lea.enW().isDescendant(n, cug.fiz);
    }

    public static boolean mE(int n) {
        return lea.enW().isDescendant(n, cug.ful);
    }

    public static boolean mF(int n) {
        return lea.enW().isDescendant(n, cug.fgH);
    }

    public static boolean a(int n, bsj bsj2) {
        if (n >= 0 && bsj2 != null) {
            int n2 = ((bsn)bsj2.awE()).getType();
            jva jva2 = cxd.xU((int)n2);
            return jva2.Wf(n);
        }
        return true;
    }

    public static boolean mG(int n) {
        if (bsi.mv(n)) {
            return !bsi.mC(n) && !bsi.mD(n) && !bsi.mE(n);
        }
        return bsi.mw(n) || bsi.mx(n) || bsi.my(n);
    }

    public static boolean b(int n, bsj bsj2) {
        return bsi.my(n) || bsi.a(n, bsj2);
    }

    public static boolean a(bsh bsh2) {
        return bsh2 != null ? bsi.mv(bsh2.az()) : false;
    }

    public static boolean b(bsh bsh2) {
        return bsh2 != null ? bsi.mw(bsh2.az()) : false;
    }

    public static boolean c(bsh bsh2) {
        return bsh2 != null ? bsi.mx(bsh2.az()) : false;
    }

    public static boolean d(bsh bsh2) {
        return bsh2 != null && bsi.my(bsh2.az());
    }

    public static boolean e(bsh bsh2) {
        return bsh2 != null && bsi.mz(bsh2.az());
    }

    public static boolean f(bsh bsh2) {
        return bsh2 != null && bsi.mA(bsh2.az());
    }

    public static boolean g(bsh bsh2) {
        return bsh2 != null && bsi.mB(bsh2.az());
    }

    public static boolean mH(int n) {
        return bsi.mA(n) || bsi.my(n);
    }

    public static boolean h(bsh bsh2) {
        return bsh2 != null && (bsi.mA(bsh2.az()) || bsi.d(bsh2));
    }

    public static boolean i(bsh bsh2) {
        return bsh2 != null && bsi.mC(bsh2.az());
    }

    public static boolean j(bsh bsh2) {
        return bsh2 != null && bsi.mD(bsh2.az());
    }

    public static boolean k(bsh bsh2) {
        return bsh2 != null && bsi.mE(bsh2.az());
    }

    public static boolean a(bsh bsh2, bsh bsh3) {
        return bsh2 == bsh3 || bsh2 != null && bsh3 != null && ldv.au(bsh2.getGUID(), bsh3.getGUID());
    }

    public static boolean a(bsh bsh2, bsj bsj2) {
        return bsh2 != null ? bsi.a(bsh2.az(), bsj2) : true;
    }

    public static boolean l(bsh bsh2) {
        return bsh2 != null ? bsi.mG(bsh2.az()) : false;
    }

    public static boolean b(bsh bsh2, bsj bsj2) {
        return bsi.d(bsh2) || bsi.a(bsh2, bsj2);
    }

    public static int m(bsh bsh2) {
        ej[] ejArray = bsh2.arJ();
        if (ejArray != null) {
            for (ej ej2 : ejArray) {
                if (ej2.getType() != 13216) continue;
                return ((ew)ej2).fQ();
            }
        }
        return 0;
    }

    public static int mI(int n) {
        return n & 0xFFFF;
    }

    public static int mJ(int n) {
        return n >> 16;
    }

    public static cab mK(int n) {
        return lea.epO().get(n);
    }

    public static cab mL(int n) {
        return lea.epO().get(n);
    }

    public static lfs<cab, cab> n(bsh bsh2) {
        if (bsh2 != null && cug.wB((int)bsh2.az())) {
            int n = bsi.m(bsh2);
            int n2 = bsi.mI(n);
            int n3 = bsi.mJ(n);
            cab cab2 = bsi.mK(n2);
            cab cab3 = bsi.mK(n3);
            if (cab2 != null && cab2.aFK() > 0 || cab3 != null && cab3.aFK() > 0) {
                return new lfs<cab, cab>(cab2, cab3);
            }
        }
        return null;
    }

    public static boolean mM(int n) {
        return cug.mM((int)n);
    }

    public static boolean c(int n, bsj bsj2) {
        return bsi.mG(n) && bsi.b(n, bsj2);
    }

    public static boolean aq(int n, int n2) {
        return bsi.mA(n) && bsi.my(n2) || bsi.my(n) && bsi.mA(n2);
    }

    public static boolean mN(int n) {
        return lea.enW().isDescendant(n, cug.fjl);
    }
}

