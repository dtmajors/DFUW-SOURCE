/*
 * Decompiled with CFR.
 */
public class crb
extends crj {
    public int eWV;
    public int pw;
    public int eWW;
    public int eWX;
    public int eWY;
    public int eWZ;
    public int eXa;
    public int eXb;
    public int eXc;
    public int eXd;
    public int eXe;
    public int eXf;
    public crc eXg = new crc();

    @Override
    public Object clone() {
        crb crb2 = (crb)super.clone();
        crb2.eXg = (crc)this.eXg.clone();
        return crb2;
    }

    public void b(kgx kgx2) {
        this.sL(kgx2.eWV);
        this.sM(kgx2.pw);
        this.sN(kgx2.eWW);
        this.sO(kgx2.eWX);
        this.sP(kgx2.eWY);
        this.sQ(kgx2.eWZ);
        this.sR(kgx2.eXa);
        this.sS(kgx2.eXb);
        this.sT(kgx2.eXc);
        this.sU(kgx2.eXd);
        this.sV(kgx2.eXe);
        this.sW(kgx2.eXf);
    }

    public void sL(int n) {
        this.eWV = n;
        if (this.eWV > this.eXg.eXi) {
            this.eXg.eXi = this.eWV;
        }
        if (this.eWV < this.eXg.eXh) {
            this.eXg.eXh = this.eWV;
        }
    }

    public void sM(int n) {
        this.pw = n;
        if (this.pw > this.eXg.eXk) {
            this.eXg.eXk = this.pw;
        }
        if (this.pw < this.eXg.eXj) {
            this.eXg.eXj = this.pw;
        }
    }

    public void sN(int n) {
        this.eWW = n;
        if (this.eWW > this.eXg.eXm) {
            this.eXg.eXm = this.eWW;
        }
        if (this.eWW < this.eXg.eXl) {
            this.eXg.eXl = this.eWW;
        }
    }

    public void sO(int n) {
        this.eWX = n;
        if (this.eWX > this.eXg.eXo) {
            this.eXg.eXo = this.eWX;
        }
        if (this.eWX < this.eXg.eXn) {
            this.eXg.eXn = this.eWX;
        }
    }

    public void sP(int n) {
        this.eWY = n;
        if (this.eWY > this.eXg.eXq) {
            this.eXg.eXq = this.eWY;
        }
        if (this.eWY < this.eXg.eXp) {
            this.eXg.eXp = this.eWY;
        }
    }

    public void sQ(int n) {
        this.eWZ = n;
        if (this.eWZ > this.eXg.eXs) {
            this.eXg.eXs = this.eWZ;
        }
        if (this.eWZ < this.eXg.eXr) {
            this.eXg.eXr = this.eWZ;
        }
    }

    public void sR(int n) {
        this.eXa = n;
        if (this.eXa > this.eXg.eXu) {
            this.eXg.eXu = this.eXa;
        }
        if (this.eXa < this.eXg.eXt) {
            this.eXg.eXt = this.eXa;
        }
    }

    public void sS(int n) {
        this.eXb = n;
        if (this.eXb > this.eXg.eXw) {
            this.eXg.eXw = this.eXb;
        }
        if (this.eXb < this.eXg.eXv) {
            this.eXg.eXv = this.eXb;
        }
    }

    public void sT(int n) {
        this.eXc = n;
        if (this.eXc > this.eXg.eXy) {
            this.eXg.eXy = this.eXc;
        }
        if (this.eXc < this.eXg.eXx) {
            this.eXg.eXx = this.eXc;
        }
    }

    public void sU(int n) {
        this.eXd = n;
        if (this.eXd > this.eXg.eXA) {
            this.eXg.eXA = this.eXd;
        }
        if (this.eXd < this.eXg.eXz) {
            this.eXg.eXz = this.eXd;
        }
    }

    public void sV(int n) {
        this.eXe = n;
        if (this.eXe > this.eXg.eXC) {
            this.eXg.eXC = this.eXe;
        }
        if (this.eXe < this.eXg.eXB) {
            this.eXg.eXB = this.eXe;
        }
    }

    public void sW(int n) {
        this.eXf = n;
        if (this.eXf > this.eXg.eXE) {
            this.eXg.eXE = this.eXf;
        }
        if (this.eXf < this.eXg.eXD) {
            this.eXg.eXD = this.eXf;
        }
    }
}

