/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum jnt {
    nEx(lzg.trG),
    nEy(lzg.tVD),
    nEz(lzg.tVE),
    nEA(lzg.tVF),
    nEB(lzg.tVG),
    nEC(lzg.tLZ),
    nED(lzg.rWT),
    nEE(lzg.tEs),
    nEF(lzg.tiN),
    nEG(lzg.tiM),
    nEH(lzg.tiO),
    nEI(lzg.tVH),
    nEJ(lzg.trt),
    nEK(lzg.tie),
    nEL(lzg.txQ),
    nEM(lzg.tEn),
    nEN(lzg.tiP),
    nEO(lzg.tVI),
    nEP(lzg.tab),
    nEQ(lzg.tVJ),
    nER(lzg.tVK),
    nES(lzg.tVL),
    nET(lzg.rUv),
    nEU(lzg.tVM),
    nEV(lzg.tVN),
    nEW(lzg.tVO),
    nEX(lzg.tNB),
    nEY(lzg.taa),
    nEZ(lzg.tok),
    nFa(lzg.toM),
    nFb(lzg.tVP),
    nFc(lzg.tVQ),
    nFd(lzg.tVR),
    nFe(lzg.tVS),
    nFf(lzg.tVT),
    nFg(lzg.tbh),
    nFh(lzg.tVU),
    nFi(lzg.tVV),
    nFj(lzg.tTM),
    nFk(lzg.tVW),
    nFl(lzg.tVY),
    nFm(lzg.tVX);

    private lox DisplayName = null;

    public boolean dOa() {
        return this == nEy;
    }

    public boolean dOb() {
        return this == nEz;
    }

    public boolean dOc() {
        return this == nEA;
    }

    public boolean dOe() {
        return this == nEB;
    }

    public boolean dOd() {
        return this == nEP;
    }

    public boolean cTR() {
        return this == nEY;
    }

    public lox wp() {
        return this.DisplayName;
    }

    public String cu() {
        return this.DisplayName == null ? null : this.DisplayName.getIdentifier();
    }

    private jnt(lox lox2) {
        this.DisplayName = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.DisplayName.bD(new Object[0]).exA() : super.toString();
    }

    public static jnt getCategorySectionByName(String string) {
        for (jnt jnt2 : jnt.values()) {
            if (jnt2.name().compareToIgnoreCase(string) != 0) continue;
            return jnt2;
        }
        return nEx;
    }
}

