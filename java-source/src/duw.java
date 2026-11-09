/*
 * Decompiled with CFR.
 */
public class duw
extends duq {
    private int bhh = -1;

    public int aFZ() {
        return this.bhh;
    }

    public void eA(int n) {
        this.bhh = n;
    }

    @Override
    public duq bBl() {
        assert (this.bhh >= 0);
        assert (this.eeD != null);
        duw duw2 = new duw();
        duw2.eA(this.bhh);
        duw2.oo(this.eeC);
        duw2.j(this.aFR());
        return duw2;
    }

    @Override
    public boolean equals(Object object) {
        duw duw2;
        return object instanceof duw && (duw2 = (duw)object).aFZ() == this.bhh && duw2.aFO() == this.eeC && this.k(duw2.aFP());
    }

    @Override
    public dur bBm() {
        assert (this.bhh >= 0);
        assert (this.eeC >= 0);
        if (this.hfc == null) {
            this.hfc = new dur(this.bhh, this.eeC);
        }
        return this.hfc;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSubsetMaterial: SubsetID=");
        stringBuilder.append(this.bhh);
        stringBuilder.append(" MaterialID=");
        stringBuilder.append(this.eeC);
        int n = this.eeD.length;
        for (int i = 0; i < n; ++i) {
            stringBuilder.append(" TextureName[");
            stringBuilder.append(i);
            stringBuilder.append("]='");
            stringBuilder.append(this.eeD[i]);
            stringBuilder.append(this.eeD[i]);
            if (i >= this.eeD.length - 1) continue;
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}

