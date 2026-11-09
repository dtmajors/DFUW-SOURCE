/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class deg
extends def {
    private Map<ldv, cmz> dLH = lcn.emw();
    private Map<ldv, cmz> dLI = lcn.emw();
    private Map<Integer, gkh> dLJ = lcn.emw();
    private int bRk = 1;

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 26113: {
                this.a((gkh)dxq2);
                break;
            }
            case 26115: {
                this.a((gkq)dxq2);
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

    private void a(gkh gkh2) {
        assert (gkh2.az() > 0);
        if (gkh2.bFz() != null) assert (gkh2.bFj());
        this.dLJ.put(this.bRk, gkh2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = gkh2.bFz() == null ? this.GUID : gkh2.bFz();
        gfm2.ResourceType = gkh2.az();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(gkq gkq2) {
        assert (gkq2.jjS != null);
        cmz cmz2 = null;
        if (gkq2.isExternal()) {
            cmz2 = this.dLI.remove(gkq2.bVG());
            if (cmz2 == null) {
                return;
            }
        } else {
            cmz2 = this.dLH.remove(gkq2.bVG());
            if (cmz2 == null) {
                return;
            }
            this.MessageDelegator.hd(cmz2.getGUID());
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = false;
        gga2.ResourceType = cmz2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(gfn gfn2) {
        gkh gkh2 = this.dLJ.remove(gfn2.aVk());
        if (gkh2 == null) {
            lfn.b(5, "SFSlotMachineManagerServer", "handleResourceCreateResponse() Could not find CreateMessage");
            assert (false);
            return;
        }
        if (gfn2.dtF == null) {
            lfn.b(5, "SFSlotMachineManagerServer", "handleResourceCreateResponse() Could not create Obj");
            if (gkh2.bFj()) {
                this.a(gkh2, null);
            }
            return;
        }
        assert (gfn2.dtF instanceof cmz);
        cmz cmz2 = (cmz)gfn2.dtF;
        this.a(cmz2, gkh2);
        if (gkh2.bFj()) {
            this.a(gkh2, cmz2);
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = cmz2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(gkh gkh2, cmz cmz2) {
        gki gki2 = (gki)this.MessageDelegator.h(26114, this.getGUID(), gkh2.aO());
        this.MessageDelegator.b(gkh2, gki2);
        if (cmz2 != null) {
            gki2.qp(cmz2.getGUID());
            gki2.b(cmz2);
        } else {
            gki2.qp(null);
            gki2.b(null);
        }
        this.MessageDelegator.F(gki2);
    }

    private void a(cmz cmz2, gkh gkh2) {
        bvd bvd2 = cmz2.aIl();
        cmz2.d(bvd2);
        bvd2.c(gkh2.av());
        bvd2.a(gkh2.aw());
        cmz2.aAG().c(gkh2.av());
        cmz2.aAG().a(gkh2.aw());
        if (gkh2.bFz() == null) {
            this.MessageDelegator.a((amf)((Object)cmz2));
            this.dLH.put(cmz2.getGUID(), cmz2);
        } else {
            this.dLI.put(cmz2.getGUID(), cmz2);
        }
    }
}

