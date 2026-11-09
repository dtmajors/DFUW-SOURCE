/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  lcr
 */
public class xu
extends yc
implements ack {
    private acj bbz = null;
    private ldv bbA = null;

    @Override
    protected boolean wN() {
        return true;
    }

    public xu(wy wy2, xl xl2, int n) {
        super(wy2, xl2, xm.bbw, n);
    }

    @Override
    public void perform() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "perform() : Quest is Not Active!!!... Quest = " + this.wF() + ", Action = " + this);
            assert (false);
            return;
        }
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "perform() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Action = " + this);
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
            this.cv(cew2.getGUID());
        }
        super.perform();
    }

    @Override
    public void wO() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "undoTemporaryActions() : Quest is Not Active!!!... Quest = " + this.wF() + ", Action = " + this);
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

    private void cv(ldv ldv2) {
        if (this.bbz == null) {
            return;
        }
        if (this.bbA != null) {
            return;
        }
        this.bbA = this.bbz.getMessageDelegator().lL(lcr.qEa);
        glh glh2 = (glh)this.bbz.i(13057, lcr.qEa);
        glh2.setSpecialEffectType(this.xc());
        glh2.my(this.bbA);
        glh2.setTargetObjectGUID(ldv2);
        this.bbz.a(glh2);
    }

    private void wS() {
        if (this.bbz == null) {
            return;
        }
        glj glj2 = (glj)this.bbz.i(13058, lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = this.bbA;
        this.bbz.a(glj2);
    }

    @Override
    public boolean m(dxq dxq2) {
        return false;
    }

    @Override
    public xj a(wy wy2, xl xl2) {
        return super.a(new xu(wy2, xl2, this.getID()));
    }
}

