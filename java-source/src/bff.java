/*
 * Decompiled with CFR.
 */
public class bff
extends bfc {
    private float Pz;

    public Object getValue() {
        return new Float(this.Pz);
    }

    public void setValue(float f2) {
        this.Pz = f2;
    }

    public bff anW() {
        bff bff2 = new bff();
        bff2.Pz = this.Pz;
        bff2.Uo = this.Uo;
        bff2.des = this.des;
        bff2.dgc = this.dgc;
        bff2.det = this.det;
        bff2.dgd = this.dgd;
        bff2.dev = this.dev;
        return bff2;
    }
}

