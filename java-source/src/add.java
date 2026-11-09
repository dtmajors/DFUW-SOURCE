/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 *  cug
 */
public class add
extends adu
implements abz {
    public add(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public add(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, n, n2, string);
    }

    @Override
    public void activate() {
        if (this.isActive()) {
            return;
        }
        super.activate();
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Task Not Active!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cew2.a((abz)this);
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Task Not Active!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cew2.b((abz)this);
        super.deactivate();
    }

    @Override
    public void h(int n, ldv ldv2) {
        if (!lea.enW().isDescendant(n, cug.fgx)) {
            return;
        }
        if (this.wF() == null || this.wF().wg() == null || !(this.wF().wg() instanceof xd)) {
            return;
        }
        dxr dxr2 = ((xd)this.wF().wg()).getMessageDelegator();
        if (dxr2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "objectInteractedWith() : Message Delegator is Null!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cbx cbx2 = (cbx)dxr2.bzx().bzt().d(ldv2);
        if (cbx2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "objectInteractedWith() : Corpse Physical Object is Null!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        if (!cbx2.fi().ad(12592)) {
            lfn.b(5, this.getClass().getSimpleName(), "objectInteractedWith() : Corpse Does Not Have Dead Resource Attribute!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        int n2 = cbx2.fi().ap(12592);
        if (lea.enW().isDescendant(n2, this.az())) {
            this.aC(true);
        }
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new add(wy2, acr2, this.getID(), this.xk()));
    }
}

