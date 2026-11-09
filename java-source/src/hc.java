/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum hc {
    aaz(mdg.tpS),
    aaA(mdg.uGh),
    aaB(mdg.uGi),
    aaC(mdg.uGj),
    aaD(mdg.uGk),
    aaE(mdg.uGl),
    aaF(mdg.uGm),
    aaG(mdg.uGn),
    aaH(mdg.uGo),
    aaI(mdg.uGp),
    aaJ(mdg.uGq),
    aaK(mdg.uGr),
    aaL(mdg.uGs),
    aaM(mdg.uGt),
    aaN(mdg.uGu),
    aaO(mdg.uGv),
    aaP(mdg.uGw);

    private lox DisplayName = null;
    public static final hc aaQ;
    public static final hc aaR;
    public static final hc aaS;
    public static final hc aaT;
    public static final hc aaU;
    public static final hc aaV;
    public static hc[] aaW;

    public String cu() {
        return this.DisplayName == null ? null : this.DisplayName.getIdentifier();
    }

    private hc(lox lox2) {
        this.DisplayName = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.DisplayName.bD(new Object[0]).exA() : super.toString();
    }

    public boolean lh() {
        return this.li();
    }

    public boolean li() {
        return this.ordinal() >= aaQ.ordinal();
    }

    public boolean lj() {
        return this.ordinal() >= aaR.ordinal();
    }

    public boolean lk() {
        return this.ordinal() >= aaS.ordinal();
    }

    public boolean ll() {
        return this.ordinal() >= aaT.ordinal();
    }

    public boolean lm() {
        return this.ordinal() >= aaU.ordinal();
    }

    public boolean ln() {
        return this.ordinal() >= aaV.ordinal();
    }

    public boolean lo() {
        return this.ordinal() == aaP.ordinal();
    }

    public boolean lp() {
        return this.ordinal() >= aaA.ordinal();
    }

    public static hc getAccessLevelType(int n) {
        if (n < 0 || n >= aaW.length) {
            return null;
        }
        return aaW[n];
    }

    public static hc getAccessLevelType(String string) {
        if (string == null) {
            return null;
        }
        int n = aaW.length;
        for (int i = 0; i < n; ++i) {
            if (!aaW[i].name().equalsIgnoreCase(string)) continue;
            return aaW[i];
        }
        return null;
    }

    public boolean b(dzo dzo2) {
        return this.ordinal() >= aaP.ordinal();
    }

    public boolean b(dzp dzp2) {
        return this.ordinal() >= aaP.ordinal();
    }

    public boolean a(erc erc2) {
        return this.ordinal() >= aaP.ordinal();
    }

    public boolean a(erd erd2) {
        if (lcw.enb()) {
            return true;
        }
        return this.ordinal() >= aaP.ordinal();
    }

    public boolean a(ere ere2) {
        return this.lo();
    }

    public boolean a(erm erm2) {
        return this.ln();
    }

    public boolean c(ern ern2) {
        return this.lh();
    }

    public boolean a(ert ert2) {
        return this.lo();
    }

    public boolean a(eru eru2) {
        return this.lo();
    }

    public boolean a(erv erv2) {
        return this.lo();
    }

    public boolean a(erw erw2) {
        return this.lo();
    }

    public boolean a(erx erx2) {
        return this.lo();
    }

    public boolean a(erj erj2) {
        return this.lo();
    }

    public boolean a(erk erk2) {
        return this.lo();
    }

    public boolean d(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4633: 
            case 4635: 
            case 5377: 
            case 5379: 
            case 6162: 
            case 7976: 
            case 9234: 
            case 9237: 
            case 9241: 
            case 16652: 
            case 23301: 
            case 23302: {
                if (!this.lo()) break;
                return true;
            }
            case 4624: 
            case 4626: 
            case 9235: 
            case 10753: 
            case 10754: 
            case 10755: 
            case 10756: 
            case 10757: {
                if (this.ordinal() < aaO.ordinal()) break;
                return true;
            }
            case 9245: {
                if (this.ordinal() < aaA.ordinal()) break;
                return true;
            }
            default: {
                return false;
            }
        }
        return false;
    }

    static {
        aaQ = aaB;
        aaR = aaD;
        aaS = aaF;
        aaT = aaH;
        aaU = aaJ;
        aaV = aaO;
        aaW = (hc[])hc.class.getEnumConstants();
    }
}

