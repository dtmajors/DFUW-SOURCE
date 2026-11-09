/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class bvi
extends bvj {
    private boolean dTg = true;
    private float dTh = 0.5f;
    private double dTi = 0.0;
    private float dTj = this.dTh;

    public bvi(bve.a a2) {
        super(a2);
        this.es(false);
    }

    public void eD(boolean bl) {
        this.dTg = bl;
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.aAi();
    }

    public final void dl(float f2) {
        if (!this.azB()) {
            return;
        }
        this.dTi = this.MessageDelegator.arc().rgz;
        this.dTh = this.azC();
        this.dTj = f2;
    }

    public final void initialize() {
        super.initialize();
    }

    @Override
    protected void azj() {
        this.dQm = true;
        switch (this.dQn) {
            case dQG: {
                if (!this.dTg) {
                    return;
                }
                bwd bwd2 = new bwd((bwi)((Object)this));
                bwd2.setGUID(this.MessageDelegator.bzv());
                bwd2.eN(true);
                bwd2.eO(true);
                bwd2.eP(true);
                bwd2.eQ(true);
                bwd2.eR(true);
                this.dQM = bwd2;
                this.MessageDelegator.a(this.dQM);
                this.dQM.aAV();
                break;
            }
            default: {
                super.azj();
            }
        }
        if (lea.enW().isDescendant(this.ResourceType, cug.fgJ)) {
            this.es(true);
        }
    }

    private void aAi() {
        if (this.dTj == this.dTh) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz - this.dTi;
        if ((d2 /= (double)0.08f) >= 1.0) {
            this.dTh = this.dTj;
            d2 = 1.0;
        } else if (d2 < 0.0) {
            d2 = 0.0;
        }
        double d3 = (double)this.dTh * (1.0 - d2) + (double)this.dTj * d2;
        this.bd(d3);
    }
}

