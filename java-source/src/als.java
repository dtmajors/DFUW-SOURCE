/*
 * Decompiled with CFR.
 */
public class als
extends alq {
    private float bsv = 0.0f;
    private float bsw = 0.0f;
    private float bsx = 0.0f;

    public float DS() {
        return this.bsv;
    }

    public void aq(float f2) {
        this.bsv = f2;
    }

    public float DT() {
        return this.bsw;
    }

    public void ar(float f2) {
        this.bsw = f2;
    }

    public float DU() {
        return this.bsx;
    }

    public void as(float f2) {
        this.bsx = f2;
    }

    public void nh() {
        if (this.El()) {
            assert (this.DY() > 0);
            this.bsv += this.bsw;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" Attribute='");
        stringBuilder.append(this.getAttributeName());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    @Override
    protected void g(alt alt2) {
        super.g(alt2);
        als als2 = (als)alt2;
        als2.aq(this.bsv);
        als2.ar(this.bsw);
        als2.as(this.bsx);
    }
}

