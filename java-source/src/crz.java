/*
 * Decompiled with CFR.
 */
public class crz
extends crj {
    public int eZo;
    public int eZp;
    public int eZq;
    public int eZr;
    public csa eZs = new csa();

    @Override
    public Object clone() {
        crz crz2 = (crz)super.clone();
        crz2.eZs = (csa)this.eZs.clone();
        return crz2;
    }

    public void tN(int n) {
        this.eZo = n;
        this.eZs.tR(n);
    }

    public void tO(int n) {
        this.eZp = n;
        this.eZs.tS(n);
    }

    public void tP(int n) {
        this.eZq = n;
        this.eZs.tT(n);
    }

    public void tQ(int n) {
        this.eZr = n;
        this.eZs.tU(n);
    }
}

