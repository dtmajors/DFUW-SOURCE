/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 *  lcr
 */
import java.util.Map;

public class xv
extends yh
implements aby,
ack,
cbz {
    private acj bbz = null;
    private Map<ldv, ldv> bbB = lcn.emw();

    @Override
    protected boolean wN() {
        return true;
    }

    public xv(wy wy2, xl xl2, int n) {
        super(wy2, xl2, n);
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
        this.bbz = this.wF().a(this);
        cew2.a((aby)this, this.az());
    }

    @Override
    public void wO() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "undoTemporaryActions() : Quest is Not Active!!!... Quest = " + this.wF() + ", Action = " + this);
            assert (false);
            return;
        }
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "undoTemporaryActions() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Action = " + this);
            assert (false);
            return;
        }
        cew2.b((aby)this, this.az());
        this.wF().a(this.bbz);
        this.bbz = null;
    }

    @Override
    public void a(int n, ldv ldv2, ljq ljq2, int n2) {
        if (this.bbB.containsKey(ldv2)) {
            return;
        }
        ldv ldv3 = this.cw(ldv2);
        if (ldv3 != null) {
            this.a(ldv2, ldv3, ljq2);
        }
    }

    @Override
    public void a(int n, ldv ldv2, int n2) {
        if (!this.bbB.containsKey(ldv2)) {
            return;
        }
        this.cx(this.bbB.remove(ldv2));
    }

    private ldv cw(ldv ldv2) {
        amf amf2 = this.wF().wg().getMessageDelegator().bzx().bzt().d(ldv2);
        if (amf2 == null) {
            return null;
        }
        if (!(amf2 instanceof cbx)) {
            return null;
        }
        cbx cbx2 = (cbx)amf2;
        if (cbx2.aAG() == null) {
            cbx2.a((cbz)this);
            return null;
        }
        return cbx2.KY();
    }

    @Override
    public void d(cbx cbx2) {
        if (cbx2 == null) {
            return;
        }
        cbx2.b((cbz)this);
        ldv ldv2 = cbx2.KY();
        if (ldv2 != null) {
            this.a(cbx2.getGUID(), ldv2, cbx2.aAG().azb());
        }
    }

    private void a(ldv ldv2, ldv ldv3, ljq ljq2) {
        ldv ldv4 = this.bbz.getMessageDelegator().lL(lcr.qEa);
        this.bbB.put(ldv2, ldv4);
        this.a(ldv3, ljq2, ldv4);
    }

    private void a(ldv ldv2, ljq ljq2, ldv ldv3) {
        if (this.bbz == null) {
            return;
        }
        glh glh2 = (glh)this.bbz.i(13057, lcr.qEa);
        glh2.setSpecialEffectType(this.xc());
        glh2.my(ldv3);
        glh2.setTargetObjectGUID(ldv2);
        glh2.setTargetPosition(ljq2);
        this.bbz.a(glh2);
    }

    private void cx(ldv ldv2) {
        if (this.bbz == null) {
            return;
        }
        glj glj2 = (glj)this.bbz.i(13058, lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = ldv2;
        this.bbz.a(glj2);
    }

    @Override
    public boolean m(dxq dxq2) {
        return false;
    }

    @Override
    public xj a(wy wy2, xl xl2) {
        return super.a(new xv(wy2, xl2, this.getID()));
    }
}

