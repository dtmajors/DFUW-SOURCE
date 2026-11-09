/*
 * Decompiled with CFR.
 */
public class cru
extends crj {
    public int eWW;
    public int eWX;
    public crz eYQ = new crz();
    public crz eYR = new crz();
    public crz eYS = new crz();
    public crz eYT = new crz();

    @Override
    public Object clone() {
        cru cru2 = (cru)super.clone();
        cru2.eYQ = (crz)this.eYQ.clone();
        cru2.eYR = (crz)this.eYR.clone();
        cru2.eYS = (crz)this.eYS.clone();
        cru2.eYT = (crz)this.eYT.clone();
        return cru2;
    }

    public void b(kgy kgy2) {
        this.eWW = 0;
        this.eWW += kgy2.prh;
        this.eWW += kgy2.prl;
        this.eWW += kgy2.prp;
        this.eWW += kgy2.prt;
        this.eWW += kgy2.prj;
        this.eWW += kgy2.prn;
        this.eWW += kgy2.prr;
        this.eWW += kgy2.prv;
        this.eWX = 0;
        this.eWX += kgy2.pri;
        this.eWX += kgy2.prm;
        this.eWX += kgy2.prq;
        this.eWX += kgy2.pru;
        this.eWX += kgy2.prk;
        this.eWX += kgy2.pro;
        this.eWX += kgy2.prs;
        this.eWX += kgy2.prw;
        this.eYQ.tO(kgy2.pri);
        this.eYQ.tQ(kgy2.prk);
        this.eYQ.tN(kgy2.prh);
        this.eYQ.tP(kgy2.prj);
        this.eYR.tO(kgy2.prm);
        this.eYR.tQ(kgy2.pro);
        this.eYR.tN(kgy2.prl);
        this.eYR.tP(kgy2.prn);
        this.eYS.tO(kgy2.prq);
        this.eYS.tQ(kgy2.prs);
        this.eYS.tN(kgy2.prp);
        this.eYS.tP(kgy2.prr);
        this.eYT.tO(kgy2.pru);
        this.eYT.tQ(kgy2.prw);
        this.eYT.tN(kgy2.prt);
        this.eYT.tP(kgy2.prv);
    }
}

