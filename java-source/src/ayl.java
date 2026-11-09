/*
 * Decompiled with CFR.
 */
public enum ayl {
    cze(mav.rXy),
    czf(mav.ufi),
    czg(mav.ufj),
    czh(mav.ufk),
    czi(mav.ufl),
    czj(mav.ufm),
    czk(mav.ufn),
    czl(mav.ufo),
    czm(mav.ubs),
    czn(mav.ubt),
    czo(mav.ubu),
    czp(mav.ubv),
    czq(mav.ubw),
    czr(mav.ubx),
    czs(mav.ufp),
    czt(mav.uev),
    czu(mav.ufq),
    czv(mav.ufr),
    czw(mav.ufs),
    czx(mav.ubD),
    czy(mav.ubE),
    czz(mav.uft),
    czA(mav.ufu);

    private lox ctl = null;

    public boolean vA() {
        return this == czv;
    }

    public lox YF() {
        return this.ctl;
    }

    private ayl(lox lox2) {
        this.ctl = lox2;
    }

    public static ayl getValueByOrdinal(int n) {
        return n < 0 || n >= ayl.values().length ? cze : ayl.values()[n];
    }
}

