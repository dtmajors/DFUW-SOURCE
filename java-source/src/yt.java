/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
public class yt
extends yi
implements ack {
    private acj bbz = null;

    public yt(wy wy2, xl xl2, int n) {
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
            this.cz(ha2.getGUID());
        }
    }

    private void cz(ldv ldv2) {
        if (this.bbz == null) {
            return;
        }
        fne fne2 = (fne)this.bbz.i(7981, ldv2);
        fne2.iQN = this.xe();
        fne2.ResourceType = this.az();
        fne2.asi = this.vf();
        fne2.b(bqy.dIh);
        this.bbz.a(fne2);
    }

    @Override
    public boolean m(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7982: {
                this.a((fnf)dxq2);
                return true;
            }
        }
        return false;
    }

    private void a(fnf fnf2) {
        this.wF().a(this.bbz);
        super.perform();
        this.bbz = null;
    }

    @Override
    public xj a(wy wy2, xl xl2) {
        return super.a(new yt(wy2, xl2, this.getID()));
    }
}

