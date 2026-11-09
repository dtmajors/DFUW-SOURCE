/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class bfl
extends bfn {
    public int bnM = 0;
    public int aYC = 0;
    public int aYG = 0;
    public float Magnitude = 0.0f;

    public String getAttributeName() {
        assert (this.bnM > 0);
        return ep.aM((int)this.bnM);
    }

    public String aoa() {
        assert (this.aYC > 0);
        return lea.enZ().getName(this.aYC);
    }

    public String CE() {
        assert (this.aYG > 0);
        return lea.enT().getName(this.aYG);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" CauseSkill='");
        stringBuilder.append(this.aoa());
        stringBuilder.append("' Effect='");
        stringBuilder.append(this.CE());
        stringBuilder.append("' Attribute='");
        stringBuilder.append(this.getAttributeName());
        stringBuilder.append("' Magnitude=");
        stringBuilder.append(this.Magnitude);
        return stringBuilder.toString();
    }

    @Override
    protected void b(bfn bfn2) {
        assert (this.bnM > 0);
        assert (this.aYC > 0);
        assert (this.aYG > 0);
        super.b(bfn2);
        bfl bfl2 = (bfl)bfn2;
        bfl2.bnM = this.bnM;
        bfl2.aYC = this.aYC;
        bfl2.aYG = this.aYG;
        bfl2.Magnitude = this.Magnitude;
    }
}

