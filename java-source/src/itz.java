/*
 * Decompiled with CFR.
 */
public abstract class itz
extends irv {
    private int mzc;
    private int mzd;
    private int mze;
    private int mzf;
    private int mod;
    private int moe;
    private int mof;
    private int lEY;

    public itz(ipf ipf2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        this.mzc = n;
        this.mzd = n2;
        this.mze = n3;
        this.mzf = n4;
        this.mod = n5;
        this.moe = n6;
        this.mof = n7;
        this.lEY = n8;
        irt irt2 = this.doB();
        this.removeAllChildren();
        this.a(new a(null));
        if (ipf2 != null) {
            this.W(ipf2);
        }
        if (irt2 != null) {
            this.W(irt2.dik());
        }
    }

    static /* synthetic */ int a(itz itz2) {
        return itz2.mzc;
    }

    static /* synthetic */ int b(itz itz2) {
        return itz2.mze;
    }

    static /* synthetic */ int c(itz itz2) {
        return itz2.mzd;
    }

    static /* synthetic */ int d(itz itz2) {
        return itz2.mzf;
    }

    static /* synthetic */ int e(itz itz2) {
        return itz2.moe;
    }

    static /* synthetic */ int f(itz itz2) {
        return itz2.lEY;
    }

    static /* synthetic */ int g(itz itz2) {
        return itz2.mod;
    }

    static /* synthetic */ int h(itz itz2) {
        return itz2.mof;
    }
}

