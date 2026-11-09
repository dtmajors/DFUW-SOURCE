/*
 * Decompiled with CFR.
 */
public enum baq {
    cNj(mas.rXy),
    cNk(mas.udz),
    cNl(mas.udA),
    cNm(mas.udB),
    cNn(mas.udC),
    cNo(mas.ubl),
    cNp(mas.udD),
    cNq(mas.udE),
    cNr(mas.udF),
    cNs(mas.udG),
    cNt(mas.udH),
    cNu(mas.udI),
    cNv(mas.udJ),
    cNw(mas.udK),
    cNx(mas.udL),
    cNy(mas.udM),
    cNz(mas.udN),
    cNA(mas.udO),
    cNB(mas.udP),
    cNC(mas.udQ),
    cND(mas.udR),
    cNE(mas.udS),
    cNF(mas.udT),
    cNG(mas.udU),
    cNH(mas.udV),
    cNI(mas.udW),
    cNJ(mas.udX),
    cNK(mas.udY),
    cNL(mas.udZ),
    cNM(mas.uea);

    private lox Pn = null;

    public lox fA() {
        return this.Pn;
    }

    public boolean vA() {
        return this == cNn;
    }

    private baq(lox lox2) {
        this.Pn = lox2;
    }

    public static baq getValueByOrdinal(int n) {
        return n < 0 || n >= baq.values().length ? cNj : baq.values()[n];
    }
}

