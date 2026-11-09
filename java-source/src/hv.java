/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public abstract class hv
extends hu {
    public boolean mp() {
        return true;
    }

    protected final void cl(int n) {
        assert (n > 0);
        gpv gpv2 = (gpv)this.MessageDelegator.h(11037, this.GUID, this.hk());
        gpv2.hsP = true;
        gpv2.joR = n;
        this.MessageDelegator.F(gpv2);
    }

    protected final void b(ldv ldv2, ldv ldv3, int n) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (n > 0);
        gqe gqe2 = (gqe)this.MessageDelegator.h(11013, this.GUID, lcr.qAJ);
        gqe2.Sy = ldv2;
        gqe2.jpf = true;
        gqe2.Ui = ldv3;
        gqe2.ResourceType = n;
        this.MessageDelegator.E(gqe2);
    }

    protected final void aW(ldv ldv2) {
        assert (ldv2 != null);
        grq grq2 = (grq)this.MessageDelegator.h(11046, this.GUID, lcr.qAJ);
        grq2.Sy = ldv2;
        this.MessageDelegator.E(grq2);
    }
}

