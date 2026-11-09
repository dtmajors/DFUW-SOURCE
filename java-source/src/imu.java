/*
 * Decompiled with CFR.
 */
public class imu {
    private ilx mkK;

    public imu(ilx ilx2) {
        this.mkK = ilx2;
    }

    public boolean e(ifg ifg2) {
        ilx ilx2 = this.n(ifg2);
        return ilx2 != this.mkK && ilx2 instanceof ilq;
    }

    public boolean f(ifg ifg2) {
        ilx ilx2 = this.n(ifg2);
        if (ilx2 != this.mkK) {
            return false;
        }
        if (this.mkK instanceof ilq) {
            inc inc2 = new inc((ilq)this.mkK, (ilq)this.mkK, true);
            inc2.setGUID(hso.cxK().cxP().cyJ().getMessageDelegator().bzv());
            hso.cxK().cxP().cyJ().getMessageDelegator().a((amf)((Object)inc2));
            inc2.setOpen(true);
            return true;
        }
        return false;
    }

    private ilx n(ifg ifg2) {
        if (ifg2 instanceof ifh) {
            return this.a((ifh)ifg2);
        }
        return null;
    }

    private ilx a(ifh ifh2) {
        hwo hwo2;
        hwm hwm2 = ifh2.cQm();
        if (hwm2 instanceof hwo && (hwo2 = (hwo)hwm2).cBu() != null) {
            return ilw.ddy().ddz().R(hwo2.cBu());
        }
        return null;
    }
}

