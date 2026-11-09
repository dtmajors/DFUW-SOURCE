/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class xt
extends yf
implements ack {
    private acj bbz = null;
    private ldv bbA = null;

    public xt(wy wy2, xl xl2, int n) {
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
            this.wR();
        }
        super.perform();
    }

    @Override
    public void wO() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "perform() : Quest is Not Active!!!... Quest = " + this.wF() + ", Action = " + this);
            assert (false);
            return;
        }
        if (this.bbz == null) {
            return;
        }
        if (this.bbA == null) {
            return;
        }
        this.wS();
        this.wF().a(this.bbz);
        this.bbz = null;
        super.wO();
    }

    private void wR() {
        if (this.bbz == null) {
            return;
        }
        if (this.bbA != null) {
            return;
        }
        this.bbA = this.bbz.getMessageDelegator().lL(lcr.qEa);
        glh glh2 = (glh)this.bbz.i(13057, lcr.qEa);
        glh2.SpecialEffectType = this.xc();
        glh2.aZD = this.av();
        glh2.aUa = this.bbA;
        this.bbz.a(glh2);
    }

    private void wS() {
        if (this.bbz == null) {
            return;
        }
        if (this.bbA == null) {
            return;
        }
        glj glj2 = (glj)this.bbz.i(13058, lcr.qEa);
        glj2.aUa = this.bbA;
        this.bbz.a(glj2);
        this.bbA = null;
    }

    @Override
    public boolean m(dxq dxq2) {
        return false;
    }

    @Override
    public xj a(wy wy2, xl xl2) {
        return super.a(new xt(wy2, xl2, this.getID()));
    }
}

