/*
 * Decompiled with CFR.
 */
public class crf
extends crj {
    public int eXK;
    public int eXL;
    public int eXM;
    public crg eXN = new crg();

    @Override
    public Object clone() {
        crf crf2 = (crf)super.clone();
        crf2.eXN = (crg)this.eXN.clone();
        return crf2;
    }

    public void b(kgx kgx2) {
        this.sZ(kgx2.eXK);
        this.ta(kgx2.eXL);
        this.tb(kgx2.eXM);
    }

    public void sZ(int n) {
        this.eXK = n;
        this.eXN.tc(n);
    }

    public void ta(int n) {
        this.eXL = n;
        this.eXN.td(n);
    }

    public void tb(int n) {
        this.eXM = n;
        this.eXN.te(n);
    }
}

