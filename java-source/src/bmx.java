/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bmx
extends bmw {
    private Map<ldv, ckx> dvH = lcn.emw();
    private Map<ldv, ckx> dvI = lcn.emw();
    private Map<Integer, fem> dvJ = lcn.emw();
    private int bRk = 1;

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        for (ckx ckx2 : this.dvH.values()) {
            if (!ckx2.aRr() || ckx2.aRq() != 0.0) continue;
            feq feq2 = (feq)this.MessageDelegator.h(25347, this.getGUID(), this.getGUID());
            feq2.iFu = false;
            feq2.iKB = ckx2.getGUID();
            this.MessageDelegator.F(feq2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25345: {
                this.a((fem)dxq2);
                break;
            }
            case 25347: {
                this.a((feq)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 25348: {
                this.a((fer)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private boolean hW(ldv ldv2) {
        return false;
    }

    private void a(fem fem2) {
        assert (fem2.az() > 0);
        if (fem2.bFz() != null) assert (fem2.bFj());
        this.dvJ.put(this.bRk, fem2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = fem2.bFz() == null ? this.GUID : fem2.bFz();
        gfm2.ResourceType = fem2.az();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(feq feq2) {
        assert (feq2.iKB != null);
        ckx ckx2 = null;
        if (feq2.isExternal()) {
            ckx2 = this.dvI.remove(feq2.bOL());
            if (ckx2 == null) {
                assert (false);
                return;
            }
        } else {
            ckx2 = this.dvH.remove(feq2.bOL());
            if (ckx2 == null) {
                return;
            }
            this.MessageDelegator.hd(ckx2.getGUID());
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = false;
        gga2.ResourceType = ckx2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(fer fer2) {
        ckx ckx2 = this.dvH.get(fer2.bOL());
        if (ckx2 == null) {
            return;
        }
        if (fer2.bON() == 0.0) {
            // empty if block
        }
        ckx2.bu(fer2.bON());
    }

    private void a(gfn gfn2) {
        fem fem2 = this.dvJ.remove(gfn2.aVk());
        if (fem2 == null) {
            lfn.b(5, "SFGenericPhysicalObjectManagerServer", "handleResourceCreateResponse() Could not find StationCreateMessage");
            assert (false);
            return;
        }
        if (gfn2.dtF == null) {
            lfn.b(5, "SFGenericPhysicalObjectManagerServer", "handleResourceCreateResponse() Could not create GPO: " + lea.enW().getName(fem2.ResourceType));
            if (fem2.bFj()) {
                this.a(fem2, null);
            }
            return;
        }
        if (!(gfn2.dtF instanceof ckx)) {
            // empty if block
        }
        assert (gfn2.dtF instanceof ckx);
        ckx ckx2 = (ckx)gfn2.dtF;
        this.a(ckx2, fem2);
        if (fem2.bFj()) {
            this.a(fem2, ckx2);
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = ckx2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(fem fem2, ckx ckx2) {
        fen fen2 = (fen)this.MessageDelegator.h(25346, this.getGUID(), fem2.aO());
        this.MessageDelegator.b(fem2, fen2);
        if (ckx2 != null) {
            fen2.pC(ckx2.getGUID());
            fen2.d(ckx2);
        } else {
            fen2.pC(null);
            fen2.d(null);
        }
        this.MessageDelegator.F(fen2);
    }

    private void a(ckx ckx2, fem fem2) {
        bvd bvd2 = ckx2.aAG();
        if (bvd2 == null) {
            bvd2 = ckx2.aIl();
            ckx2.d(bvd2);
        }
        bvd2.c(fem2.av());
        bvd2.a(fem2.aw());
        ckx2.aAG().c(fem2.av());
        ckx2.aAG().a(fem2.aw());
        if (fem2.bFz() == null) {
            this.MessageDelegator.a((amf)((Object)ckx2));
            if (fem2.iKA > 0.0) {
                ckx2.bu(fem2.iKA);
            }
            this.dvH.put(ckx2.getGUID(), ckx2);
        } else {
            this.dvI.put(ckx2.getGUID(), ckx2);
        }
    }
}

