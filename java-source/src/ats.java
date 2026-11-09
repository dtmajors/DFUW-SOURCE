/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class ats
extends atq {
    private Map<ldv, ccd> bZb = lcn.emw();
    private Map<ldv, ccd> bZc = lcn.emw();
    private Map<Integer, eaz> bZd = lcn.emw();
    private int bRk = 1;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17411: {
                this.a((eaz)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 17414: {
                this.a((ebx)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eaz eaz2) {
        assert (eaz2.az() > 0);
        if (eaz2.bFk() != null) assert (eaz2.bFj());
        this.bZd.put(new Integer(this.bRk), eaz2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = eaz2.bFk() == null ? this.GUID : eaz2.bFk();
        gfm2.ResourceType = eaz2.az();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(gfn gfn2) {
        eaz eaz2 = this.bZd.remove(new Integer(gfn2.aVk()));
        assert (eaz2 != null);
        if (gfn2.dtF == null) {
            if (eaz2.bFj()) {
                this.a(eaz2, null);
            }
            return;
        }
        assert (gfn2.dtF instanceof ccd);
        ccd ccd2 = (ccd)gfn2.dtF;
        ccd2.bL(eaz2.rz());
        this.a(ccd2, eaz2);
        if (eaz2.bFj()) {
            this.a(eaz2, ccd2);
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = ccd2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(eaz eaz2, ccd ccd2) {
        eba eba2 = (eba)this.MessageDelegator.h(17412, this.getGUID(), eaz2.aO());
        this.MessageDelegator.b(eaz2, eba2);
        if (ccd2 != null) {
            eba2.eM(ccd2.getGUID());
            eba2.e(ccd2);
        } else {
            eba2.e(null);
            eba2.eM(null);
        }
        this.MessageDelegator.F(eba2);
    }

    private void a(ccd ccd2, eaz eaz2) {
        bvd bvd2 = ccd2.aIl();
        ccd2.d(bvd2);
        bvd2.a(ccd2);
        ccd2.bh(eaz2.av());
        ccd2.aAG().c(eaz2.av());
        ccd2.aAG().a(eaz2.aw());
        if (eaz2.bFk() == null) {
            this.MessageDelegator.a((amf)((Object)ccd2));
            this.bZb.put(ccd2.getGUID(), ccd2);
        } else {
            this.bZc.put(ccd2.getGUID(), ccd2);
        }
        ccd2.aIK();
        this.c(ccd2);
    }

    private boolean b(ccd ccd2) {
        return ccd2.ry() == 2 || ccd2.ry() == 1;
    }

    private void c(ccd ccd2) {
        if (!this.b(ccd2)) {
            return;
        }
        ebp ebp2 = (ebp)this.MessageDelegator.h(17413, this.getGUID(), lcr.qEq);
        ebp2.jT(true);
        ebp2.eM(ccd2.getGUID());
        ebp2.cP(ccd2.ry());
        ebp2.bL(ccd2.rz());
        ebp2.Dy(ccd2.az());
        ebp2.bh(ccd2.aIG());
        this.MessageDelegator.F(ebp2);
    }

    private void d(ccd ccd2) {
        if (!this.b(ccd2)) {
            return;
        }
        ebp ebp2 = (ebp)this.MessageDelegator.h(17413, this.getGUID(), lcr.qEq);
        ebp2.jT(false);
        ebp2.eM(ccd2.getGUID());
        ebp2.cP(ccd2.ry());
        ebp2.bL(ccd2.rz());
        this.MessageDelegator.F(ebp2);
    }

    private void a(ebx ebx2) {
        assert (ebx2.acn() != null);
        ccd ccd2 = null;
        if (ebx2.bFq()) {
            ccd2 = this.bZc.remove(ebx2.acn());
            if (ccd2 == null) {
                return;
            }
        } else {
            ccd2 = this.bZb.remove(ebx2.acn());
            if (ccd2 == null) {
                return;
            }
            this.MessageDelegator.hd(ccd2.getGUID());
        }
        if (this.b(ccd2)) {
            this.d(ccd2);
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = false;
        gga2.ResourceType = ccd2.az();
        this.MessageDelegator.F(gga2);
    }
}

