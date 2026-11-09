/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Map;

public class btj
extends bti {
    private Map<ldv, clt> dLH = lcn.emw();
    private Map<ldv, clt> dLI = lcn.emw();
    private Map<Integer, fpp> dLJ = lcn.emw();
    private int bRk = 1;

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25857: {
                this.a((fpp)dxq2);
                break;
            }
            case 25859: {
                this.a((fpt)dxq2);
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

    private void a(fpp fpp2) {
        assert (fpp2.az() > 0);
        if (fpp2.bFz() != null) assert (fpp2.bFj());
        this.dLJ.put(this.bRk, fpp2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = fpp2.bFz() == null ? this.GUID : fpp2.bFz();
        gfm2.ResourceType = fpp2.az();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(fpt fpt2) {
        assert (fpt2.iTo != null);
        clt clt2 = null;
        if (fpt2.isExternal()) {
            clt2 = this.dLI.remove(fpt2.bQO());
            if (clt2 == null) {
                return;
            }
        } else {
            clt2 = this.dLH.remove(fpt2.bQO());
            if (clt2 == null) {
                return;
            }
            this.MessageDelegator.hd(clt2.getGUID());
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = false;
        gga2.ResourceType = clt2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(gfn gfn2) {
        fpp fpp2 = this.dLJ.remove(gfn2.aVk());
        if (fpp2 == null) {
            lfn.b(5, "SFLocalStorageObjectManagerServer", "handleResourceCreateResponse() Could not find CreateMessage");
            assert (false);
            return;
        }
        if (gfn2.dtF == null) {
            lfn.b(5, "SFLocalStorageObjectManagerServer", "handleResourceCreateResponse() Could not create LSO");
            if (fpp2.bFj()) {
                this.a(fpp2, null);
            }
            return;
        }
        assert (gfn2.dtF instanceof clv);
        clv clv2 = (clv)gfn2.dtF;
        this.a(clv2, fpp2);
        if (fpp2.bFj()) {
            this.a(fpp2, clv2);
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = clv2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(fpp fpp2, clv clv2) {
        fpq fpq2 = (fpq)this.MessageDelegator.h(25858, this.getGUID(), fpp2.aO());
        this.MessageDelegator.b(fpp2, fpq2);
        if (clv2 != null) {
            fpq2.pO(clv2.getGUID());
            fpq2.b(clv2);
        } else {
            fpq2.pO(null);
            fpq2.b(null);
        }
        this.MessageDelegator.F(fpq2);
    }

    private void a(clv clv2, fpp fpp2) {
        bvd bvd2 = clv2.aIl();
        clv2.d(bvd2);
        bvd2.c(fpp2.av());
        bvd2.a(fpp2.aw());
        clv2.aAG().c(fpp2.av());
        clv2.aAG().a(fpp2.aw());
        if (fpp2.bFz() == null) {
            this.MessageDelegator.a((amf)((Object)clv2));
            this.dLH.put(clv2.getGUID(), clv2);
        } else {
            this.dLI.put(clv2.getGUID(), clv2);
        }
        if (cug.vk((int)clv2.az())) {
            clw clw2 = (clw)clv2;
            clw2.aSv();
        }
    }
}

