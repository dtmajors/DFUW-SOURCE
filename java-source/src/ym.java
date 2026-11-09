/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
public class ym
extends xz
implements ack {
    private acj bbz = null;

    public ym(wy wy2, xl xl2, int n) {
        super(wy2, xl2, n);
    }

    @Override
    public void perform() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "perform() : Quest is Not Active!!!... Quest = " + this.wF() + ", Action = " + this);
            assert (false);
            return;
        }
        if (this.wH()) {
            return;
        }
        if (this.bbz == null) {
            this.bbz = this.wF().a(this);
            if (this.bbz == null) {
                lfn.b(5, this.getClass().getSimpleName(), "perform() : Message Proxy is Null!!!... Quest = " + this.wF() + ", Action = " + this);
                assert (false);
                return;
            }
            ha ha2 = this.wF().mA();
            if (ha2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "perform() : PSO is Null!!!... Quest = " + this.wF() + ", Action = " + this);
                assert (false);
                return;
            }
            this.cy(ha2.getGUID());
        }
    }

    private void cy(ldv ldv2) {
        if (this.bbz == null) {
            return;
        }
        fmz fmz2 = (fmz)this.bbz.i(7955, ldv2);
        fmz2.iQH = this.wX();
        fmz2.iJG = true;
        fmz2.bqd = new int[]{this.az()};
        fmz2.iIY = new int[]{this.vf()};
        fmz2.b(this.wI() instanceof aax ? bqy.dGv : bqy.dHi);
        this.bbz.a(fmz2);
    }

    @Override
    public boolean m(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7956: {
                this.b((fna)dxq2);
                return true;
            }
        }
        return false;
    }

    private void b(fna fna2) {
        this.wF().a(this.bbz);
        super.perform();
        this.bbz = null;
    }

    @Override
    public xj a(wy wy2, xl xl2) {
        return super.a(new ym(wy2, xl2, this.getID()));
    }
}

