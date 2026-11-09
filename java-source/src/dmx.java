/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class dmx
extends dmw {
    private Map<ldv, coh> daM = lcn.emw();
    private Map<ldv, coh> gJv = lcn.emw();
    private Map<Integer, gwe> gJw = lcn.emw();
    private int bRk = 1;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 27137: {
                this.a((gwe)dxq2);
                break;
            }
            case 27139: {
                this.a((gwi)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gwe gwe2) {
        assert (gwe2.az() > 0);
        if (gwe2.bFz() != null) assert (gwe2.bFj());
        this.gJw.put(this.bRk, gwe2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = gwe2.bFz() == null ? this.GUID : gwe2.bFz();
        gfm2.ResourceType = gwe2.az();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(gwi gwi2) {
        assert (gwi2.Rs != null);
        coh coh2 = null;
        if (gwi2.isExternal()) {
            coh2 = this.gJv.remove(gwi2.oq());
            if (coh2 == null) {
                assert (false);
                return;
            }
        } else {
            coh2 = this.daM.remove(gwi2.oq());
            if (coh2 == null) {
                assert (false);
                return;
            }
            this.MessageDelegator.hd(coh2.getGUID());
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = false;
        gga2.ResourceType = coh2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(gfn gfn2) {
        gwe gwe2 = this.gJw.remove(gfn2.aVk());
        if (gwe2 == null) {
            lfn.b(5, "SFTrackFlagManagerServer", "handleTrackFlagRemoveMessage() Could not find SFTrackFlagCreateRequestMessage");
            assert (false);
            return;
        }
        if (gfn2.dtF == null) {
            lfn.b(5, "SFTrackFlagManagerServer", "handleResourceCreateResponse() Could not create TrackFlag: " + lea.enW().getName(gwe2.ResourceType));
            if (gwe2.bFj()) {
                this.a(gwe2, null);
            }
            return;
        }
        if (!(gfn2.dtF instanceof coh)) {
            // empty if block
        }
        assert (gfn2.dtF instanceof coh);
        coh coh2 = (coh)gfn2.dtF;
        this.a(coh2, gwe2);
        if (gwe2.bFj()) {
            this.a(gwe2, coh2);
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = coh2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(gwe gwe2, coh coh2) {
        gwf gwf2 = (gwf)this.MessageDelegator.h(27138, this.getGUID(), gwe2.aO());
        this.MessageDelegator.b(gwe2, gwf2);
        if (coh2 != null) {
            gwf2.hC(coh2.getGUID());
            gwf2.d(coh2);
        } else {
            gwf2.hC(null);
            gwf2.d(null);
        }
        this.MessageDelegator.F(gwf2);
    }

    private void a(coh coh2, gwe gwe2) {
        bvd bvd2 = coh2.aAG();
        if (bvd2 == null) {
            bvd2 = coh2.aIl();
            coh2.d(bvd2);
        }
        bvd2.c(gwe2.av());
        bvd2.a(gwe2.aw());
        coh2.aAG().c(gwe2.av());
        coh2.aAG().a(gwe2.aw());
        if (gwe2.bFz() == null) {
            this.MessageDelegator.a((amf)((Object)coh2));
            coh2.Hy();
            this.daM.put(coh2.getGUID(), coh2);
        } else {
            this.gJv.put(coh2.getGUID(), coh2);
        }
    }
}

