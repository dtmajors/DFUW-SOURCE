/*
 * Decompiled with CFR.
 */
public class hqc
extends hqa<String> {
    public final hrj kTn;

    public static lhf a(hnc hnc2, hqa.a a2, hoq.c c2, String[] stringArray) {
        hnb hnb2 = c2.kiK.jFE;
        int n = 0;
        for (int i = 0; i < stringArray.length; ++i) {
            int n2 = hnc2.a((hnb)hnb2, (String)stringArray[i]).rmN;
            n = Math.max(n, n2);
        }
        return new lhf(a2.kXQ.kLY.rmN + (n += a2.kXQ.kLY.rmN), a2.kXQ.kLY.H);
    }

    public hqc(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqa.a a2, hoq.c c2, int n, lbn lbn2) {
        this(hnc2, string, lgg2, lhf2, a2, c2, n, new hrj(), lbn2);
    }

    private hqc(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqa.a a2, hoq.c c2, int n, hrj hrj2, lbn lbn2) {
        super(hnc2, string, lgg2, lhf2, a2, new hoq.c[]{c2}, new int[]{n}, hrj2, lbn2);
        this.kTn = hrj2;
    }
}

