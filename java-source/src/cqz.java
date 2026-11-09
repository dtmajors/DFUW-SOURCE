/*
 * Decompiled with CFR.
 */
public class cqz
extends crj {
    public int eWI;
    public int eWJ;
    public int eWK;
    public int eWL;
    public int eWM;
    public int eWN;
    public cra eWO = new cra();

    @Override
    public Object clone() {
        cqz cqz2 = (cqz)super.clone();
        cqz2.eWO = (cra)this.eWO.clone();
        return cqz2;
    }

    public void b(kgx kgx2) {
        this.sF(kgx2.eWI);
        this.sG(kgx2.eWJ);
        this.sH(kgx2.eWK);
        this.sI(kgx2.eWL);
        this.sJ(kgx2.eWM);
        this.sK(kgx2.eWN);
    }

    public void sF(int n) {
        this.eWI = n;
        if (this.eWI > this.eWO.eWP) {
            this.eWO.eWP = this.eWI;
        }
    }

    public void sG(int n) {
        this.eWJ = n;
        if (this.eWJ > this.eWO.eWQ) {
            this.eWO.eWQ = this.eWJ;
        }
    }

    public void sH(int n) {
        this.eWK = n;
        if (this.eWK > this.eWO.eWR) {
            this.eWO.eWR = this.eWK;
        }
    }

    public void sI(int n) {
        this.eWL = n;
        if (this.eWL > this.eWO.eWS) {
            this.eWO.eWS = this.eWL;
        }
    }

    public void sJ(int n) {
        this.eWM = n;
        if (this.eWM > this.eWO.eWT) {
            this.eWO.eWT = this.eWM;
        }
    }

    public void sK(int n) {
        this.eWN = n;
        if (this.eWN > this.eWO.eWU) {
            this.eWO.eWU = this.eWN;
        }
    }
}

