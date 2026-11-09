/*
 * Decompiled with CFR.
 */
public class chg
extends che {
    public int ObjectType = -1;
    public int bSL = -1;
    public ckj ezM = null;
    public int ezN = -1;
    public boolean ezO = false;

    public chg() {
        this.ezL = cgi.BUY;
    }

    public boolean a(int n, int n2, ckj ckj2, int n3) {
        if (this.ObjectType != n) {
            return false;
        }
        cgd cgd2 = cgd.getValueByOrdinal(this.ObjectType);
        switch (cgd2) {
            case ewS: {
                if (this.bSL != -1 && this.bSL != n2) {
                    return false;
                }
                if (this.ezM != null && this.ezM.ordinal() != ckj2.ordinal()) {
                    return false;
                }
                return this.ezN == -1 || this.ezN == n3;
            }
            case ewT: {
                if (this.bSL != -1 && !lea.enZ().isDescendant(n2, this.bSL)) {
                    return false;
                }
                return !this.ezO || lea.epx().qV(this.bSL);
            }
            case ewU: {
                return this.bSL == -1 || lea.enW().isDescendant(n2, this.bSL);
            }
        }
        return false;
    }
}

