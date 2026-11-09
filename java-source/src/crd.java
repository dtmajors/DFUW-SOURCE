/*
 * Decompiled with CFR.
 */
public class crd
extends crj {
    public int eXF;
    public int eXG;
    cre eXH = new cre();

    @Override
    public Object clone() {
        crd crd2 = (crd)super.clone();
        crd2.eXH = (cre)this.eXH.clone();
        return crd2;
    }

    public void b(kgx kgx2) {
        this.sY(kgx2.eXG);
        this.sX(kgx2.eXF);
    }

    public void sX(int n) {
        this.eXF = n;
        if (this.eXF > this.eXH.eXI) {
            this.eXH.eXI = this.eXF;
        }
    }

    public void sY(int n) {
        this.eXG = n;
        if (this.eXG > this.eXH.eXJ) {
            this.eXH.eXJ = this.eXG;
        }
    }
}

