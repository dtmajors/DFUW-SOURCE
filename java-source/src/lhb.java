/*
 * Decompiled with CFR.
 */
public class lhb {
    public static final int rni = 240;
    public static final int rnj = 241;
    public static final int rnk = 242;
    public static final int rnl = 308;
    public static final int rnm = 309;
    private static final a[] rnn = new a[]{new a(240, "MOUSE BUTTON 0"), new a(241, "MOUSE BUTTON 1"), new a(242, "MOUSE BUTTON 2"), new a(308, "MOUSE WHEEL UP"), new a(309, "MOUSE WHEEL DOWN")};

    private lhb() {
    }

    public static int Af(String string) {
        assert (string != null);
        for (int i = 0; i < rnn.length; ++i) {
            if (!lhb.rnn[i].rno.equalsIgnoreCase(string)) continue;
            return lhb.rnn[i].nvH;
        }
        return lhc.Af(string);
    }

    public static String acL(int n) {
        for (int i = 0; i < rnn.length; ++i) {
            if (lhb.rnn[i].nvH != n) continue;
            return lhb.rnn[i].rno;
        }
        return lhc.acL(n);
    }

    public static String acM(int n) {
        String string = lhb.acL(n);
        if (string == null) {
            return "0x" + Integer.toHexString(n);
        }
        return string;
    }
}

