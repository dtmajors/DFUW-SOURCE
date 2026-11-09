/*
 * Decompiled with CFR.
 */
public class crh
extends crj {
    public int eXR;
    public int eXS;
    public int eXT;
    public int eXU;
    public int eXV;
    public int eXW;
    public cri eXX = new cri();

    @Override
    public Object clone() {
        crh crh2 = (crh)super.clone();
        crh2.eXX = (cri)this.eXX.clone();
        return crh2;
    }

    public void b(kgx kgx2) {
        this.tf(kgx2.eXR);
        this.tg(kgx2.eXS);
        this.th(kgx2.eXT);
        this.ti(kgx2.eXU);
        this.tj(kgx2.eXV);
        this.tk(kgx2.eXW);
    }

    public void tf(int n) {
        this.eXR = n;
        if (this.eXR > this.eXX.eXY) {
            this.eXX.eXY = this.eXR;
        }
    }

    public void tg(int n) {
        this.eXS = n;
        if (this.eXS > this.eXX.eXZ) {
            this.eXX.eXZ = this.eXS;
        }
    }

    public void th(int n) {
        this.eXT = n;
        if (this.eXT > this.eXX.eYa) {
            this.eXX.eYa = this.eXT;
        }
    }

    public void ti(int n) {
        this.eXU = n;
        if (this.eXU > this.eXX.eYb) {
            this.eXX.eYb = this.eXU;
        }
    }

    public void tj(int n) {
        this.eXV = n;
        if (this.eXV > this.eXX.eYc) {
            this.eXX.eYc = this.eXV;
        }
    }

    public void tk(int n) {
        this.eXW = n;
        if (this.eXW > this.eXX.eYd) {
            this.eXX.eYd = this.eXW;
        }
    }
}

