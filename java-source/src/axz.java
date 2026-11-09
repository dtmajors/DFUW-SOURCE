/*
 * Decompiled with CFR.
 */
public enum axz {
    cuC(mbc.rXy),
    cuD(mbc.ubl),
    cuE(mbc.ubr),
    cuF(mbc.uaB),
    cuG(mbc.uhM),
    cuH(mbc.uhN),
    cuI(mbc.uhE),
    cuJ(mbc.uhO),
    cuK(mbc.uhP),
    cuL(mbc.uhQ),
    cuM(mbc.uhR),
    cuN(mbc.uhS),
    cuO(mbc.uhT),
    cuP(mbc.uhU),
    cuQ(mbc.uhV),
    cuR(mbc.uhW),
    cuS(mbc.uhX),
    cuT(mbc.uhY),
    cuU(mbc.uhZ),
    cuV(mbc.uia),
    cuW(mbc.uib),
    cuX(mbc.uic),
    cuY(mbc.uid),
    cuZ(mbc.uie),
    cva(mbc.uif);

    private lox ctl = null;

    public lox YF() {
        return this.ctl;
    }

    public boolean vA() {
        return this == cuY;
    }

    private axz(lox lox2) {
        this.ctl = lox2;
    }

    public static axz getValueByOrdinal(int n) {
        return n < 0 || n >= axz.values().length ? cuC : axz.values()[n];
    }
}

