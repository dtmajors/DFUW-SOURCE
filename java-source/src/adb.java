/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 */
public class adb
extends ads
implements abz {
    public adb(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public adb(wy wy2, acr acr2, int n, int n2, String string) {
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
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cew2.b((abz)this);
        super.deactivate();
    }

    @Override
    public void h(int n, ldv ldv2) {
        amf amf2 = this.wF().wg().getMessageDelegator().bzx().bzt().d(ldv2);
        if (amf2 == null) {
            return;
        }
        if (!(amf2 instanceof cbx)) {
            return;
        }
        cbx cbx2 = (cbx)amf2;
        if (!cbx2.aIj().ad(12720)) {
            return;
        }
        String string = cbx2.aIj().ar(12720);
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "objectInteractedWith() : Vendor ID Attribute is Null!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        if (this.xJ().toLowerCase().equals(string.toLowerCase())) {
            this.aC(true);
        }
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new adb(wy2, acr2, this.getID(), this.xk()));
    }
}

