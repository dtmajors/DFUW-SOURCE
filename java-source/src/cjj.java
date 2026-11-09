/*
 * Decompiled with CFR.
 */
public class cjj
extends cjf {
    public int ResourceType;

    public cjj() {
        super(cjo.KILL);
    }

    public boolean qb(int n) {
        return this.ResourceType == -1 || lea.enW().isDescendant(n, this.ResourceType);
    }

    public cjj aQd() {
        super.aPZ();
        cjj cjj2 = (cjj)super.aPZ();
        cjj2.ResourceType = this.ResourceType;
        cjj2.ayN = this.ayN;
        return cjj2;
    }

    @Override
    public /* synthetic */ cjf aPZ() {
        return this.aQd();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.aQd();
    }
}

