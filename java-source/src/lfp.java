/*
 * Decompiled with CFR.
 */
public class lfp
extends ley {
    private static final lfq[] rkq = new lfq[]{new lfq(a.rkr, "Client", 10002, 10004), new lfq(a.rks, "AttributeInfoHarvester", 10010, 10015), new lfq(a.rkt, "FunctionGenerator", 10020, 10025), new lfq(a.rku, "SpeneTester", 10030, 10035), new lfq(a.rkv, "Standalone", 10006, 10008), new lfq(a.rkw, "XMLEditor", 10040, 10045), new lfq(a.rkx, "Dev Server 1", 10100, 10100), new lfq(a.rky, "Dev Server 2", 10100, 10150), new lfq(a.rkz, "Dev Server 3", 10100, 10200)};

    public lfp(int n, int n2) {
        super(n, n2);
    }

    public lfp(a a2) {
        super(lfp.b(a2), lfp.c(a2));
    }

    public static final int b(a a2) {
        lfq lfq2 = lfp.d(a2);
        if (lfq2 == null) {
            return -1;
        }
        return lfq2.rjW;
    }

    public static final String acD(int n) {
        for (int i = 0; i < rkq.length; ++i) {
            if (lfp.rkq[i].qog != n) continue;
            return lfp.rkq[i].Name;
        }
        return null;
    }

    public static final String[] eqy() {
        String[] stringArray = new String[rkq.length];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = lfp.rkq[i].Name;
        }
        return stringArray;
    }

    public static final int acE(int n) {
        if (n < 0 || n >= rkq.length) {
            return -1;
        }
        return lfp.c(a.values()[n]);
    }

    public static final int c(a a2) {
        lfq lfq2 = lfp.d(a2);
        if (lfq2 == null) {
            return -1;
        }
        return lfq2.qog;
    }

    private static final lfq d(a a2) {
        if (a2 == null) {
            return null;
        }
        return rkq[a2.ordinal()];
    }

    public void h(int n, String string, String string2) {
        long l = System.currentTimeMillis();
        byte[] byArray = new byte[8];
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(l >> 8 * i & 0xFFL);
        }
        byte[] byArray2 = new byte[4];
        byte[] byArray3 = new byte[8];
        byte[] byArray4 = string.getBytes();
        byte[] byArray5 = string2.getBytes();
        byte[] byArray6 = new byte[21 + byArray4.length + 1 + byArray5.length + 1];
        byArray6[0] = (byte)n;
        System.arraycopy(byArray, 0, byArray6, 1, byArray.length);
        System.arraycopy(byArray2, 0, byArray6, 9, byArray2.length);
        System.arraycopy(byArray3, 0, byArray6, 13, byArray3.length);
        System.arraycopy(byArray4, 0, byArray6, 21, byArray4.length);
        int n2 = 21 + byArray4.length;
        byArray6[n2] = 0;
        System.arraycopy(byArray5, 0, byArray6, ++n2, byArray5.length);
        byArray6[byArray6.length - 1] = 0;
        this.f(byArray6);
    }
}

