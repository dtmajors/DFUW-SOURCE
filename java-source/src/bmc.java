/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cug
 *  lcr
 */
public class bmc
extends bke {
    private fdn duZ = null;
    private ljq be = null;
    private cnh dtO = null;

    public bmc() {
        this.dsy = bkd.a.dry;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9237) {
            this.Vc();
            return;
        }
        this.duZ = (fdn)fdo2;
        if (this.duZ.ResourceType <= 0) {
            this.Vc();
            return;
        }
        if (!ResourceTree.isDescendant(this.duZ.ResourceType, cug.fgJ) && !ResourceTree.isDescendant(this.duZ.ResourceType, cug.fgG)) {
            this.Vc();
            return;
        }
        this.be = this.duZ.be == null ? this.hV(fdo2.aZG) : this.duZ.be;
        boolean bl2 = ResourceTree.isDescendant(this.duZ.ResourceType, cug.fgJ);
        String string = this.duZ.DisplayName;
        this.dtO = hu.a(bl2, this.MessageDelegator, string, null, this.duZ.ResourceType);
        this.dtO.aAG().c(this.be);
        float f2 = (float)(Math.PI * 2 * Math.random());
        this.dtO.aAG().a(new lgl(0.0f, f2, 0.0f));
        this.dtO.rY(this.duZ.ResourceType);
        this.MessageDelegator.a((amf)((Object)this.dtO));
        if (bl2) {
            this.dt(false);
            this.Vc();
        } else {
            this.lg(this.dtO.aUj());
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6151: {
                this.a((gfv)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void dt(boolean bl2) {
        assert (this.duZ != null);
        assert (this.dtO != null);
        cte[] cteArray = this.duZ.dtP;
        if (cteArray == null && bl2 && (cteArray = ctf.c(this.dtO.aUj(), 1.0f, 1.0f)) == null) {
            return;
        }
        fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
        fcy2.bst = bkd.dqO;
        fcy2.aZG = this.dtO.getGUID();
        fcy2.akX = this.dtO.getGUID();
        fcy2.dtP = cteArray;
        fcy2.iyH = false;
        fcy2.b(bqy.dGQ);
        this.MessageDelegator.F(fcy2);
    }

    private ljq hV(ldv ldv2) {
        assert (ldv2 != null);
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
        if (amf2 == null) {
            return null;
        }
        return ((cdb)amf2).aAG().av();
    }

    private void a(gfv gfv2) {
        if (gfv2.jgq) {
            this.dt(true);
        }
        this.Vc();
    }

    private void lg(int n) {
        assert (n > 0);
        gfu gfu2 = (gfu)this.MessageDelegator.h(6150, this.GUID, lcr.qCq);
        gfu2.aqs = 1;
        gfu2.ResourceType = n;
        this.MessageDelegator.F(gfu2);
    }
}

