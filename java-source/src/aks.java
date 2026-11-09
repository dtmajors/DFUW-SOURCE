/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jps
 *  lcr
 *  mcs
 */
public class aks
extends akt {
    private boolean bqF = false;
    private jps bqG = null;
    private ljq bpG = null;
    private int bqH = 5;
    private int bqI = 0;
    private float bqJ = 1.0f;
    private double bcE = 1.0;
    private double bcH = 0.0;

    public int Dx() {
        return this.bqH;
    }

    public void fR(int n) {
        this.bqH = n;
    }

    public float Dy() {
        return this.bqJ;
    }

    public void am(float f2) {
        this.bqJ = f2;
    }

    public double Dz() {
        return this.bcE;
    }

    public void w(double d2) {
        this.bcE = d2;
    }

    public aks() {
        this.bog = ajb.b.bps;
    }

    private boolean DA() {
        if (this.bqF) {
            return true;
        }
        if (this.boj.aJz().bgR() == null || this.boj.aJz().bgR().aAG() == null || this.boj.aJz().bgR().aAG().azb() == null) {
            this.bok = mcs.uzZ.bD(new Object[0]);
            return false;
        }
        bun bun2 = (bun)this.boj.getMessageDelegator().bzx().bzt().d(lcr.qBP);
        if (bun2 == null) {
            this.bok = mcs.uzZ.bD(new Object[0]);
            return false;
        }
        this.bqM = bun2.ayq();
        if (this.bqM == null) {
            this.bok = mcs.uzZ.bD(new Object[0]);
            return false;
        }
        if (!this.bqL.zJ(this.bqM.az())) {
            this.bok = mcs.uAa.bD(new Object[0]);
            return false;
        }
        this.akX = this.bqM.KY();
        if (this.akX == null) {
            this.bok = mcs.uAa.bD(new Object[0]);
            return false;
        }
        this.bpG = this.bqM.av();
        if (this.bpG == null) {
            this.bok = mcs.uAa.bD(new Object[0]);
            return false;
        }
        this.bqG = (jps)this.boj.getMessageDelegator().bzx().bzt().d(lcr.qBR);
        if (this.bqG == null) {
            this.bok = mcs.uzZ.bD(new Object[0]);
            return false;
        }
        this.bqF = true;
        return true;
    }

    @Override
    protected boolean BU() {
        if (this.boj.bfF()) {
            return true;
        }
        if (!this.DA()) {
            return false;
        }
        if (this.boj.getMessageDelegator().arc().rgz - this.bcH < this.bcE) {
            return true;
        }
        this.bcH = this.boj.getMessageDelegator().arc().rgz;
        ljq ljq2 = lgl.a(this.bqG.bPR(), new ljq(0.0f, 0.0f, 1.0f));
        ljq2.normalize();
        ljq ljq3 = ljq.z(this.bpG, this.boj.aJz().bgQ().aAG().azb());
        ljq3.normalize();
        float f2 = ljq.u(ljq2, ljq3);
        if (f2 > 1.0f - this.bqJ * 2.0f) {
            this.bqI = 0;
            return true;
        }
        ++this.bqI;
        if (this.bqI < this.bqH) {
            return true;
        }
        this.bok = mcs.uAe.bD(new Object[0]);
        return false;
    }

    @Override
    public void reset() {
        this.bqF = false;
        this.bqG = null;
        this.bpG = null;
        this.bqI = 0;
        this.bcH = 0.0;
        super.reset();
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        aks aks2 = (aks)aja2;
        aks2.fR(this.bqH);
        aks2.am(this.bqJ);
        aks2.w(this.bcE);
    }
}

