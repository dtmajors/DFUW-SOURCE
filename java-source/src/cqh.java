/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.Map;

public class cqh
extends cqf {
    private Map<ldv, cma> eUJ = lcn.emw();
    private Map<ldv, cma> eUK = lcn.emw();
    private Map<Integer, gbx> eUL = lcn.emw();
    private int bRk = 0;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 23041: {
                this.a((gbx)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 23043: {
                this.a((gcd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gbx gbx2) {
        assert (gbx2.bTp() > 0);
        this.eUL.put(this.bRk, gbx2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = gbx2.bFz() != null ? gbx2.bFz() : this.GUID;
        gfm2.ResourceType = gbx2.bTp();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(gcd gcd2) {
        assert (gcd2.bTr() != null);
        cma cma2 = null;
        if (gcd2.bTs()) {
            cma2 = this.eUK.remove(gcd2.bTr());
            if (cma2 == null) {
                lfn.b(5, "SFPortalManagerServer", "handlePortalRemoveMessage() Could not find EXTERNAL portal: " + gcd2.bTr());
                return;
            }
        } else {
            cma2 = this.eUJ.remove(gcd2.bTr());
            if (cma2 == null) {
                lfn.b(5, "SFPortalManagerServer", "handlePortalRemoveMessage() Could not find portal: " + gcd2.bTr());
                return;
            }
            this.MessageDelegator.hd(cma2.getGUID());
        }
    }

    private void a(gfn gfn2) {
        gbx gbx2 = this.eUL.remove(gfn2.aVk());
        assert (gbx2 != null);
        if (gfn2.dtF == null) {
            this.a(gbx2, null, null);
            return;
        }
        assert (gfn2.dtF instanceof cma);
        cma cma2 = (cma)gfn2.dtF;
        this.a(cma2, gbx2);
        if (gbx2.bFz() != null) {
            this.eUK.put(cma2.getGUID(), cma2);
        } else {
            this.MessageDelegator.a((amf)((Object)cma2));
            this.eUJ.put(cma2.getGUID(), cma2);
        }
        this.a(gbx2, cma2, cma2.getGUID());
    }

    private void a(cma cma2, gbx gbx2) {
        bvd bvd2 = cma2.aIl();
        cma2.d(bvd2);
        bvd2.c(gbx2.bTk());
        bvd2.a(gbx2.bTl());
        cma2.cB(gbx2.bTn());
        int n = -1;
        if (gbx2.aSS()) {
            n = lea.enW().getType(gbx2.bTo());
            assert (n > 0);
        }
        if (n > 0) {
            cma2.gn(true);
        } else {
            cma2.gn(false);
        }
        cma2.rG(n);
        ArrayList<ljq> arrayList = lcn.abH(gbx2.bTm().length);
        for (ljq ljq2 : gbx2.bTm()) {
            arrayList.add(ljq2);
        }
        cma2.ay(arrayList);
    }

    private void a(gbx gbx2, cma cma2, ldv ldv2) {
        gby gby2 = (gby)this.MessageDelegator.h(23042, this.getGUID(), gbx2.aO());
        gby2.a(cma2);
        gby2.qc(ldv2);
        this.MessageDelegator.b(gbx2, gby2);
        this.MessageDelegator.F(gby2);
    }
}

