/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class dlh
extends dlg {
    private Map<ldv, cnc> gFM = lcn.emw();
    private Map<ldv, cnc> gFN = lcn.emw();
    private Map<Integer, glt> gFO = lcn.emw();
    private int bRk = 1;

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25089: {
                this.a((glt)dxq2);
                break;
            }
            case 25091: {
                this.a((glz)dxq2);
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

    private void a(glt glt2) {
        assert (glt2.az() > 0);
        if (glt2.bFz() != null) assert (glt2.bFj());
        this.gFO.put(new Integer(this.bRk), glt2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = glt2.bFz() == null ? this.GUID : glt2.bFz();
        gfm2.ResourceType = glt2.az();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(gfn gfn2) {
        glt glt2 = this.gFO.remove(gfn2.aVk());
        if (glt2 == null) {
            lfn.b(5, "SFStationManagerServer", "handleResourceCreateResponse() Could not find StationCreateMessage");
            assert (false);
            return;
        }
        if (gfn2.dtF == null) {
            lfn.b(5, "SFStationManagerServer", "handleResourceCreateResponse() Could not create station");
            if (glt2.bFj()) {
                this.a(glt2, null);
            }
            return;
        }
        assert (gfn2.dtF instanceof cnc);
        cnc cnc2 = (cnc)gfn2.dtF;
        this.a(cnc2, glt2);
        if (glt2.bFj()) {
            this.a(glt2, cnc2);
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = cnc2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(cnc cnc2, glt glt2) {
        bvd bvd2 = cnc2.aIl();
        cnc2.d(bvd2);
        bvd2.c(glt2.av());
        bvd2.a(glt2.aw());
        cnc2.aAG().c(glt2.av());
        cnc2.aAG().a(glt2.aw());
        if (glt2.bFz() == null) {
            this.MessageDelegator.a((amf)((Object)cnc2));
            this.gFM.put(cnc2.getGUID(), cnc2);
        } else {
            this.gFN.put(cnc2.getGUID(), cnc2);
        }
    }

    private void a(glt glt2, cnc cnc2) {
        glu glu2 = (glu)this.MessageDelegator.h(25090, this.getGUID(), glt2.aO());
        this.MessageDelegator.b(glt2, glu2);
        if (cnc2 != null) {
            glu2.qr(cnc2.getGUID());
            glu2.a(cnc2);
        } else {
            glu2.qr(null);
            glu2.a(null);
        }
        this.MessageDelegator.F(glu2);
    }

    private void a(glz glz2) {
        assert (glz2.jlk != null);
        cnc cnc2 = null;
        if (glz2.isExternal()) {
            cnc2 = this.gFN.remove(glz2.bVO());
            if (cnc2 == null) {
                return;
            }
        } else {
            cnc2 = this.gFM.remove(glz2.bVO());
            if (cnc2 == null) {
                return;
            }
            this.MessageDelegator.hd(cnc2.getGUID());
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = false;
        gga2.ResourceType = cnc2.az();
        this.MessageDelegator.F(gga2);
    }
}

