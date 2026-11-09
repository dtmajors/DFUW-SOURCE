/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 */
public class zo
extends aah
implements abz {
    public zo(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, n, n2);
    }

    @Override
    public void at(boolean bl) {
        if (this.isActive()) {
            return;
        }
        super.at(bl);
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Condition Not Active!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cew2.a((abz)this);
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Condition Not Active!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
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
            lfn.b(5, this.getClass().getSimpleName(), "objectInteractedWith() : Vendor ID Attribute is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        if (this.xJ().toLowerCase().equals(string.toLowerCase())) {
            this.av(true);
        }
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        return super.a(new zo(wy2, zb2, this.getID(), this.xk()));
    }
}

