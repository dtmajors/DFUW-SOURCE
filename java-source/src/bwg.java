/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class bwg {
    private static void a(kli kli2) {
        ldv ldv2 = ldv.rfe;
        int n = 1;
        kli2.hC(ldv2);
        kli2.GUID = ldv2;
        kli2.ts(ldv2);
        n |= 0x10;
        kli2.setType(n |= 0x200);
        kli2.aM(new int[0]);
        kli2.eU(true);
        kli2.eY(false);
        kli2.wY(false);
        kli2.YO(2);
        kli2.wZ(false);
        kli2.xa(false);
        kli2.YP(5);
        kli2.mx(0.31415927f);
        kli2.setRadius(100.0f);
        kli2.bg(null);
        kli2.my(100.0f);
    }

    public static kli aBf() {
        kli kli2 = new kli();
        bwg.a(kli2);
        kli2.setRadius(50.0f);
        kli2.YO(2);
        kli2.YP(5);
        int n = 1;
        n |= 0x10;
        kli2.setType(n |= 0x200);
        return kli2;
    }

    public static kli aBg() {
        kli kli2 = new kli();
        bwg.a(kli2);
        kli2.eU(false);
        int n = 1;
        n |= 0x10;
        kli2.setType(n |= 0x400);
        return kli2;
    }

    public static kli aBh() {
        kli kli2 = new kli();
        bwg.a(kli2);
        kli2.eU(true);
        kli2.xb(true);
        int n = 1;
        kli2.setType(n |= 0x100);
        return kli2;
    }

    public static kli aBi() {
        kli kli2 = new kli();
        bwg.a(kli2);
        int[] nArray = new int[]{cug.fkr};
        kli2.aM(nArray);
        kli2.setRadius(50.0f);
        kli2.eU(false);
        int n = 1;
        n |= 0x10;
        kli2.setType(n |= 0x400);
        return kli2;
    }

    public static kli aBj() {
        kli kli2 = new kli();
        bwg.a(kli2);
        int[] nArray = new int[]{cug.fkr, cug.fkp, cug.fly};
        kli2.aM(nArray);
        kli2.setRadius(50.0f);
        kli2.eU(false);
        int n = 1;
        n |= 0x10;
        kli2.setType(n |= 0x400);
        return kli2;
    }

    public static kli aBk() {
        kli kli2 = new kli();
        bwg.a(kli2);
        kli2.setRadius(100.0f);
        kli2.my(200.0f);
        int[] nArray = new int[]{cug.fqr};
        kli2.aM(nArray);
        kli2.eU(false);
        int n = 1;
        n |= 0x20;
        kli2.setType(n |= 0x400);
        return kli2;
    }
}

