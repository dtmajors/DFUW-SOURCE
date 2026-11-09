/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  hzo
 */
public class ide {
    public static final int lJt = 1;
    public static final int lJu = 2;

    public static lox a(hyn hyn2, fvd fvd2) {
        if (fvd2.iXC == null || fvd2.iXC.length != 1 || fvd2.iXC[0] == null) {
            return null;
        }
        ldv ldv2 = fvd2.iXC[0].Ri;
        String string = fvd2.iXC[0].bc;
        if (ldv2 == null || string == null || string.isEmpty()) {
            return null;
        }
        hzo hzo2 = hyn2.cyJ();
        if (hzo2 == null) {
            return null;
        }
        jgr jgr2 = hzo2.cHM();
        if (jgr2 == null) {
            return null;
        }
        if (jgr2.rL(ldv2)) {
            return lyb.tCO;
        }
        if (jgr2.rN(ldv2)) {
            return lyb.tCP;
        }
        if (jgr2.rM(ldv2)) {
            return lyb.tCR;
        }
        if (jgr2.rO(ldv2)) {
            return lyb.tCQ;
        }
        switch (fvd2.aqs) {
            case 1: {
                ide.a(hyn2, ldv2, string, 0);
                break;
            }
            case 2: {
                ide.a(hyn2, ldv2, string, 5);
                break;
            }
        }
        return null;
    }

    public static void a(hyn hyn2, ldv ldv2, String string, int n) {
        if (ldv2 == null || string == null || string.isEmpty()) {
            return;
        }
        gkt gkt2 = (gkt)hyn2.getMessageDelegator().h(31491, hyn2.getGUID(), hso.cxK().bAn().Tr);
        gkt2.YN = ldv2;
        gkt2.YL = string;
        gkt2.ed = n;
        hyn2.getMessageDelegator().F(gkt2);
    }
}

