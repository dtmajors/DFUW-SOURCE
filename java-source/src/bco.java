/*
 * Decompiled with CFR.
 */
public enum bco {
    cWG(mbo.rXy),
    cWH(mbo.ukC),
    cWI(mbo.ubl),
    cWJ(mbo.ukD),
    cWK(mbo.ukE),
    cWL(mbo.ukF),
    cWM(mbo.uik),
    cWN(mbo.ukG),
    cWO(mbo.ukH),
    cWP(mbo.ukI),
    cWQ(mbo.ukJ),
    cWR(mbo.ukK),
    cWS(mbo.ukL),
    cWT(mbo.ukM),
    cWU(mbo.ukN),
    cWV(mbo.ukO),
    cWW(mbo.ukQ),
    cWX(mbo.ukP),
    cWY(mbo.ukR);

    private lox ctl = null;

    public boolean vA() {
        return this == cWY;
    }

    public lox YF() {
        return this.ctl;
    }

    private bco(lox lox2) {
        this.ctl = lox2;
    }

    public static bco getValueByOrdinal(int n) {
        return n < 0 || n >= bco.values().length ? cWG : bco.values()[n];
    }
}

