/*
 * Decompiled with CFR.
 */
public class cji
extends cjf {
    public cja eAa;
    public int eDX;
    public int eDY;

    public cji() {
        super(cjo.GUI);
    }

    public boolean k(int n, int n2, int n3) {
        if (this.eAa.ordinal() != n) {
            return false;
        }
        if (this.eDX != -1 && this.eDX != n2) {
            return false;
        }
        switch (this.eAa) {
            case eDu: 
            case eDy: {
                if (this.eDY == -1 || lea.enZ().isDescendant(n3, this.eDY)) break;
                return false;
            }
            case eDA: {
                if (this.eDY == -1 || lea.enW().isDescendant(n3, this.eDY)) break;
                return false;
            }
        }
        return true;
    }

    public cji aQc() {
        super.aPZ();
        cji cji2 = (cji)super.aPZ();
        cji2.ayN = this.ayN;
        return cji2;
    }

    @Override
    public /* synthetic */ cjf aPZ() {
        return this.aQc();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.aQc();
    }
}

