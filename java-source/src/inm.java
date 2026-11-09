/*
 * Decompiled with CFR.
 */
import java.util.Comparator;

public class inm
implements Comparator<ipf> {
    private imn mlk;

    public inm(imn imn2) {
        this.mlk = imn2;
    }

    public int a(ipf ipf2, ipf ipf3) {
        boolean bl = ipf2 instanceof inj;
        boolean bl2 = ipf3 instanceof inj;
        if (bl && bl2) {
            boolean bl3;
            inj inj2 = (inj)ipf2;
            inj inj3 = (inj)ipf3;
            boolean bl4 = inj2.dey() instanceof imb;
            if (bl4 == (bl3 = inj3.dey() instanceof imb)) {
                for (int i = 0; i < 3; ++i) {
                    int n = this.a(inj2, inj3, this.mlk.mjW[i]) * this.mlk.mjX[i].del();
                    if (n == 0) continue;
                    return n;
                }
                return 0;
            }
            if (bl4) {
                return -1;
            }
            return 1;
        }
        if (bl) {
            return -1;
        }
        return 1;
    }

    private int a(inj inj2, inj inj3, imp imp2) {
        switch (imp2) {
            case mkc: {
                return this.a(inj2, inj3);
            }
            case mkd: {
                return this.b(inj2, inj3);
            }
            case mke: {
                return this.c(inj2, inj3);
            }
            case mkf: {
                return this.d(inj2, inj3);
            }
            case mkg: {
                return this.e(inj2, inj3);
            }
            case mkh: {
                return this.f(inj2, inj3);
            }
        }
        return 0;
    }

    private int a(inj inj2, inj inj3) {
        String string = inj2.dey().ddF().exA();
        String string2 = inj3.dey().ddF().exA();
        return string.compareToIgnoreCase(string2);
    }

    private int b(inj inj2, inj inj3) {
        String string = inj2.dey().ddN();
        String string2 = inj3.dey().ddN();
        return string.compareToIgnoreCase(string2);
    }

    private int c(inj inj2, inj inj3) {
        int n = inj2.dey().ddO();
        int n2 = inj3.dey().ddO();
        return n - n2;
    }

    private int d(inj inj2, inj inj3) {
        int n = inj2.dey().vf();
        int n2 = inj3.dey().vf();
        return n - n2;
    }

    private int e(inj inj2, inj inj3) {
        float f;
        float f2 = inj2.dey().ddM();
        return f2 < (f = inj3.dey().ddM()) ? -1 : (f2 > f ? 1 : 0);
    }

    private int f(inj inj2, inj inj3) {
        float f;
        float f2 = inj2.dey().ddl();
        return f2 < (f = inj3.dey().ddl()) ? -1 : (f2 > f ? 1 : 0);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ipf)object, (ipf)object2);
    }
}

