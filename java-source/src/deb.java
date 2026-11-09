/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class deb
extends dea {
    private int bnM = 0;
    private int geX = 0;

    public int BV() {
        return this.bnM;
    }

    public void fC(int n2) {
        this.bnM = n2;
    }

    public int bkt() {
        return this.geX;
    }

    public void zM(int n2) {
        this.geX = n2;
    }

    @Override
    public dea bks() {
        deb deb2 = new deb();
        deb2.gh(this.fgs);
        deb2.fC(this.bnM);
        deb2.zM(this.geX);
        return deb2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFXPHeirAttribute: InheritancePortion=");
        stringBuilder.append(this.fgs);
        stringBuilder.append(" AttributeType='");
        stringBuilder.append(this.getAttributeName(this.bnM));
        stringBuilder.append("' AdvancementRateAttributeType='");
        stringBuilder.append(this.getAttributeName(this.geX));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    private String getAttributeName(int n2) {
        return ep.aM((int)n2);
    }
}

