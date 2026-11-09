/*
 * Decompiled with CFR.
 */
public class hqb
extends hqa<String[]> {
    public final hri kTm;

    public static lhf a(hnc hnc2, hqa.a a2, hoq.c[] cArray, String[][] stringArray) {
        int n = 0;
        for (int i = 0; i < cArray.length; ++i) {
            hnb hnb2 = cArray[i].kiK.jFE;
            int n2 = 0;
            for (int j = 0; j < stringArray.length; ++j) {
                int n3 = hnc2.a((hnb)hnb2, (String)stringArray[j][i]).rmN;
                n2 = Math.max(n2, n3);
            }
            n += (n2 += hnc2.a((hnb)hnb2, (String)"W").rmN);
        }
        return new lhf(a2.kXQ.kLY.rmN + n, a2.kXQ.kLY.H);
    }

    public hqb(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqa.a a2, hoq.c[] cArray, int[] nArray, lbn lbn2) {
        this(hnc2, string, lgg2, lhf2, a2, cArray, nArray, new hri(cArray.length), lbn2);
    }

    private hqb(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqa.a a2, hoq.c[] cArray, int[] nArray, hri hri2, lbn lbn2) {
        super(hnc2, string, lgg2, lhf2, a2, cArray, nArray, hri2, lbn2);
        this.kTm = hri2;
    }
}

