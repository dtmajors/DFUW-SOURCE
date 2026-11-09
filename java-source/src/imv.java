/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;

public class imv {
    private ims mkL;

    public imv(ims ims2) {
        this.mkL = ims2;
    }

    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        Object object;
        Object object2;
        hyn hyn2;
        if (this.mkL.dey().ddh()) {
            return false;
        }
        if (ifg2 instanceof ifh && (hyn2 = (ifh)ifg2).cQm() instanceof hwo) {
            object2 = (hwo)hyn2.cQm();
            object = ilw.ddy().ddz().R(((hwo)object2).cBu());
            if (object == null) {
                object = ilz.c(((hwo)object2).cBu().getGUID(), ((hwo)object2).cBu());
            }
            if (this.mkL.dey().b((ilx)object)) {
                this.mkL.ri(true);
                return true;
            }
        }
        if ((hyn2 = ioa.o(ifg2)) instanceof imt) {
            object2 = ((imt)hyn2).deB();
            object = object2.iterator();
            while (object.hasNext()) {
                inj inj2 = (inj)object.next();
                ilx ilx2 = inj2.dey();
                if (!ilx2.ddQ()) {
                    return false;
                }
                if (this.mkL.dey().b(ilx2)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        if (this.mkL.dey().ddh()) {
            return false;
        }
        this.mkL.ri(false);
        return true;
    }

    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        if (this.mkL.dey().ddh()) {
            return false;
        }
        this.mkL.ri(false);
        if (ifg2 instanceof ifh) {
            ifh ifh2 = (ifh)ifg2;
            if (ifh2.cQm() instanceof hwo) {
                hwo hwo2 = (hwo)ifh2.cQm();
                ilx ilx2 = ilw.ddy().ddz().R(hwo2.cBu());
                if (ilx2 == null) {
                    ilx2 = ilz.c(hwo2.cBu().getGUID(), hwo2.cBu());
                }
                if (this.mkL.dey().b(ilx2)) {
                    hxd hxd2 = hso.cxK().cxP().cza().ri(hwo2.cBu().AW());
                    if (this.mkL.dey().auW() && ilx2.auW() && this.mkL.dey().uw() == ilx2.uw()) {
                        this.mkL.dey().e(ilx2);
                        return true;
                    }
                    hxd hxd3 = this.mkL.dey().cBs();
                    ilx2.c(hxd3);
                    return true;
                }
            }
            return false;
        }
        ioa ioa2 = ioa.o(ifg2);
        if (ioa2 instanceof imt) {
            Object object;
            List<inj> list = ((imt)ioa2).deB();
            for (inj inj2 : list) {
                object = inj2.dey();
                if (!((ilx)object).ddQ()) {
                    return false;
                }
                if (this.mkL.dey().b((ilx)object)) continue;
                return false;
            }
            if (this.mkL.dey().auW()) {
                for (inj inj2 : list) {
                    this.mkL.dey().e(inj2.dey());
                }
            } else {
                for (inj inj2 : list) {
                    object = this.mkL.dey().cBs();
                    inj2.dey().c((hxd)object);
                }
            }
            return true;
        }
        return false;
    }
}

