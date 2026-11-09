/*
 * Decompiled with CFR.
 */
public class crm
extends crj {
    public int eYp;
    public int eYq;
    public int eYr;
    public int eYs;
    public int eYt;
    public crn eYu = new crn();

    @Override
    public Object clone() {
        crm crm2 = (crm)super.clone();
        crm2.eYu = (crn)this.eYu.clone();
        return crm2;
    }

    public void b(kgx kgx2) {
        this.tq(kgx2.eYp);
        this.tr(kgx2.eYq);
        this.ts(kgx2.eYr);
        this.tt(kgx2.eYs);
        this.tu(kgx2.eYt);
    }

    public void tq(int n) {
        this.eYp = n;
        if (this.eYp > this.eYu.eYv) {
            this.eYu.eYv = this.eYp;
        }
    }

    public void tr(int n) {
        this.eYq = n;
        if (this.eYq > this.eYu.eYw) {
            this.eYu.eYw = this.eYq;
        }
    }

    public void ts(int n) {
        this.eYr = n;
        if (this.eYr > this.eYu.eYx) {
            this.eYu.eYx = this.eYr;
        }
    }

    public void tt(int n) {
        this.eYs = n;
        if (this.eYs > this.eYu.eYy) {
            this.eYu.eYy = this.eYs;
        }
    }

    public void tu(int n) {
        this.eYt = n;
        if (this.eYt > this.eYu.eYz) {
            this.eYu.eYz = this.eYt;
        }
    }
}

