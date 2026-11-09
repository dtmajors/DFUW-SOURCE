/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cex
 */
public class dcb
extends dbw {
    private static final float gcI = 1.7f;
    private static final float gcF = 1.0f;
    private cex aaY = null;
    private double dth = 0.0;
    private double gcJ = 0.0;

    public dcb() {
        super(cxd.j.fRy);
    }

    @Override
    public void nh() {
        if (this.aaY == null) {
            return;
        }
        double d2 = this.boj.getMessageDelegator().arc().rgz;
        while (d2 >= this.gcJ) {
            this.gcJ += 1.0;
            if (this.aaY.fi().fq()) continue;
            ((czb)this.boj).bhq();
        }
        if (this.dth <= 0.0) {
            return;
        }
        if (this.dth > d2) {
            return;
        }
        this.dth = 0.0;
        if (this.boj.bfF()) {
            this.boj.beM();
        }
    }

    public boolean bjo() {
        return this.dth > 0.0;
    }

    @Override
    public void bjk() {
        cdb cdb2 = this.boj.aJz().bgQ();
        if (cdb2 instanceof cex) {
            this.aaY = (cex)cdb2;
            this.gcJ = this.boj.getMessageDelegator().arc().rgz + 1.0;
        }
        cdb2.aJD().a(byw.c.ecv);
    }

    public void startTimer() {
        if (this.bjo()) {
            return;
        }
        this.dth = this.boj.getMessageDelegator().arc().rgz + (double)1.7f;
        this.boj.aJz().bgQ().aJD().aDc().nG(655445);
    }

    @Override
    public void beQ() {
        this.aaY = null;
        this.dth = 0.0;
        this.gcJ = 0.0;
        this.boj.aJz().bgQ().aJD().a(byw.c.ecu);
    }
}

