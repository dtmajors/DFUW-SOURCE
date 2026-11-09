/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  mcs
 */
public class akz
extends aja {
    public akz() {
        this.bog = ajb.b.bpl;
    }

    @Override
    protected final boolean BU() {
        cbx cbx2;
        et et2;
        this.bok = null;
        if (this.boj.bfF()) {
            return true;
        }
        ldv ldv2 = this.boj.beo().akX;
        boolean bl = false;
        amf amf2 = this.boj.getMessageDelegator().bzx().bzt().d(ldv2);
        if (amf2 == null) {
            lfn.b(5, "SFUnspawnableClientCheckConstraint", "checkConstraint() Could not find object " + ldv2);
            this.bok = mcs.uBJ.bD(new Object[0]);
            return false;
        }
        if (amf2 instanceof cbx && ((et2 = (cbx2 = (cbx)amf2).fi().ah(352)) == null || et2.fN() <= 0.0f)) {
            this.bok = lea.enW().isDescendant(this.boj.beo().dhr, cug.fgE) ? mcs.uBI.bD(new Object[0]) : mcs.uBH.bD(new Object[0]);
            return false;
        }
        return true;
    }
}

