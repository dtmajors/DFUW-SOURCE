/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class bpx {
    public final int bnM;
    private float Pz = 0.0f;

    public bpx(int n) {
        assert (n > 0);
        this.bnM = n;
    }

    public void da(float f2) {
        this.Pz += f2;
    }

    public float getValue() {
        return this.Pz;
    }

    public void setValue(float f2) {
        this.Pz = f2;
    }

    public String getAttributeName() {
        return ep.aM((int)this.bnM);
    }

    public void reset() {
        this.Pz = 0.0f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFAttributeSum: Attribute='");
        stringBuilder.append(this.getAttributeName());
        stringBuilder.append("' Value=");
        stringBuilder.append(this.Pz);
        return stringBuilder.toString();
    }
}

