/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  clg
 *  lcr
 */
import java.util.Map;

public class bnm
extends bnk {
    private Map<ldv, clg> dwo = lcn.emw();
    private Map<ldv, clg> dwp = lcn.emw();
    private Map<Integer, fgx> dwq = lcn.emw();
    private int bRk = 1;

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 23809: {
                this.a((fgx)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 23811: {
                this.a((fhq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fgx fgx2) {
        assert (fgx2.az() > 0);
        if (fgx2.aGQ != null) assert (fgx2.bFj());
        this.dwq.put(new Integer(this.bRk), fgx2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        if (fgx2.aGQ == null) {
            gfm2.Yc = this.GUID;
        } else {
            gfm2.Yc = fgx2.aGQ.bFk();
            gfm2.gb = fgx2.aGQ;
        }
        gfm2.ResourceType = fgx2.az();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(gfn gfn2) {
        fgx fgx2 = this.dwq.remove(gfn2.aVk());
        if (fgx2 == null) {
            lfn.b(5, "SFHouseManagerServer", "handleResourceCreateResponse() Could not find housecreatemessage");
            assert (false);
            return;
        }
        if (gfn2.dtF == null) {
            if (fgx2.bFj()) {
                this.a(fgx2, null);
            }
            return;
        }
        assert (gfn2.dtF instanceof clg);
        clg clg2 = (clg)gfn2.dtF;
        this.a(clg2, fgx2);
        if (fgx2.bFj()) {
            this.a(fgx2, clg2);
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = clg2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(fhq fhq2) {
        assert (fhq2.bPy() != null);
        clg clg2 = null;
        if (fhq2.ilY) {
            clg2 = this.dwp.remove(fhq2.bPy());
            if (clg2 == null) {
                assert (false);
                return;
            }
        } else {
            clg2 = this.dwo.remove(fhq2.bPy());
            if (clg2 == null) {
                return;
            }
            this.MessageDelegator.hd(clg2.getGUID());
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = false;
        gga2.ResourceType = clg2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(fgx fgx2, clg clg2) {
        fgy fgy2 = (fgy)this.MessageDelegator.h(23810, this.getGUID(), fgx2.aO());
        this.MessageDelegator.b(fgx2, fgy2);
        if (clg2 != null) {
            fgy2.pE(clg2.getGUID());
            fgy2.a(clg2);
        } else {
            fgy2.pE(null);
            fgy2.a(null);
        }
        this.MessageDelegator.F(fgy2);
    }

    private void a(clg clg2, fgx fgx2) {
        bvd bvd2 = clg2.aIl();
        clg2.d(bvd2);
        bvd2.c(fgx2.av());
        bvd2.a(fgx2.aw());
        clg2.aAG().c(fgx2.av());
        clg2.aAG().a(fgx2.aw());
        if (fgx2.aGQ == null) {
            this.MessageDelegator.a((amf)clg2);
            this.dwo.put(clg2.getGUID(), clg2);
        } else {
            this.dwp.put(clg2.getGUID(), clg2);
        }
    }
}

