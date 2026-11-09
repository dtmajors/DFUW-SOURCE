/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bep
extends btk {
    private Map<ldv, ccv> ddq = lcn.emw();
    private Map<ldv, ccv> ddr = lcn.emw();
    private Map<Integer, exx> dds = lcn.emw();
    private int Qs = 0;

    private void b(int n, ldv ldv2, int n2) {
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.GUID, lcr.qCq);
        gfm2.sk(n);
        gfm2.Yc = ldv2;
        gfm2.ResourceType = n2;
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
    }

    private void a(exx exx2, ccv ccv2) {
        exy exy2 = (exy)this.MessageDelegator.h(24066, this.GUID, exx2.aO());
        this.MessageDelegator.b(exx2, exy2);
        exy2.b(ccv2);
        this.MessageDelegator.F(exy2);
    }

    private void d(boolean bl, int n) {
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.GUID, lcr.qCv);
        gga2.jgt = bl;
        gga2.ResourceType = n;
        this.MessageDelegator.F(gga2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24065: {
                this.a((exx)dxq2);
                break;
            }
            case 6146: {
                this.b((gfn)dxq2);
                break;
            }
            case 24067: {
                this.a((eyb)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(exx exx2) {
        assert (exx2.az() > 0);
        if (exx2.bFz() != null) assert (exx2.bFj());
        this.b(++this.Qs, exx2.bFz() == null ? this.GUID : exx2.bFz(), exx2.az());
        this.dds.put(new Integer(this.Qs), exx2);
    }

    private void b(gfn gfn2) {
        exx exx2 = this.dds.remove(gfn2.aVk());
        if (exx2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleResourceCreateResponseMessage() : No control-point create request found for recieved resource create response!!!");
            assert (false);
            return;
        }
        if (gfn2.dtF == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleResourceCreateResponseMessage() : Control-point resource failed to create!!!");
            assert (false);
            if (exx2.bFj()) {
                this.a(exx2, null);
            }
            return;
        }
        if (!(gfn2.dtF instanceof ccv)) {
            lfn.b(5, this.getClass().getSimpleName(), "handleResourceCreateResponseMessage() : Control-point resource is not expected class-type!!!");
            assert (false);
            if (exx2.bFj()) {
                this.a(exx2, null);
            }
            return;
        }
        ccv ccv2 = (ccv)gfn2.dtF;
        bvd bvd2 = ccv2.aIl();
        ccv2.d(bvd2);
        bvd2.c(exx2.av());
        bvd2.a(exx2.aw());
        ccv2.aAG().c(bvd2.av());
        ccv2.aAG().a(bvd2.aw());
        if (exx2.bFz() == null) {
            this.ddq.put(ccv2.getGUID(), ccv2);
            this.MessageDelegator.a((amf)((Object)ccv2));
        } else {
            this.ddr.put(ccv2.getGUID(), ccv2);
        }
        if (exx2.bFj()) {
            this.a(exx2, ccv2);
        }
        this.d(true, ccv2.az());
    }

    private void a(eyb eyb2) {
        assert (eyb2.ajD() != null);
        ccv ccv2 = null;
        if (eyb2.isExternal()) {
            ccv2 = this.ddr.remove(eyb2.ajD());
            if (ccv2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleControlPointRemoveMessage() : External control-point not found!!!... Control-Point GUID = " + eyb2.ajD());
                assert (false);
                return;
            }
        } else {
            ccv2 = this.ddq.remove(eyb2.ajD());
            if (ccv2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleControlPointRemoveMessage() : Control-point not found!!!... Control-Point GUID = " + eyb2.ajD());
                assert (false);
                return;
            }
            this.MessageDelegator.hd(ccv2.getGUID());
        }
        this.d(false, ccv2.az());
    }
}

