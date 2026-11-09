/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public abstract class lpe {
    public final lpi rHI;
    private static final String rHJ = "([";
    private static final String rHK = ")]";

    private static lpe a(a a2) {
        char c2;
        int n;
        ArrayList<lpe> arrayList = lcn.emv();
        int n2 = n = a2.rHM;
        int n3 = a2.rHL.length();
        block4: while (n2 < n3 && (c2 = a2.rHL.charAt(n2)) != a2.rHN) {
            if (c2 != '$') {
                ++n2;
                continue;
            }
            if (n2 + 1 >= n3) {
                ++n2;
                continue;
            }
            int n4 = rHJ.indexOf(a2.rHL.charAt(n2 + 1));
            if (n4 < 0) {
                ++n2;
                continue;
            }
            if (n2 > n) {
                arrayList.add(new lpg(a2.rHL.substring(n, n2)));
            }
            a2.rHM = n2 + 2;
            char c3 = a2.rHN;
            a2.rHN = rHK.charAt(n4);
            lpe lpe2 = lpe.a(a2);
            a2.rHN = c3;
            if (lpe2 == null) break;
            n = n2 = a2.rHO + 1;
            switch (n4) {
                case 0: {
                    arrayList.add(new lpj(lpe2));
                    continue block4;
                }
                case 1: {
                    arrayList.add(new lph(lpe2));
                    continue block4;
                }
            }
            arrayList.add(lpe2);
            assert (false);
        }
        if (n2 > n) {
            arrayList.add(new lpg(a2.rHL.substring(n, n2)));
        }
        a2.rHO = n2;
        if (arrayList.isEmpty()) {
            return new lpg("");
        }
        if (arrayList.size() > 1) {
            return new lpf(arrayList);
        }
        return (lpe)arrayList.get(0);
    }

    public static final lpe BI(String string) {
        a a2 = new a(null);
        a2.rHM = 0;
        a2.rHN = '\u0000';
        a2.rHO = 0;
        a2.rHL = string;
        return lpe.a(a2);
    }

    protected lpe(lpi lpi2) {
        this.rHI = lpi2;
    }

    public abstract String a(lom var1);
}

