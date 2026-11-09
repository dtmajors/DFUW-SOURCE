/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
public class bmb
extends bke {
    private fdj duY = null;

    public bmb() {
        this.dsy = bkd.a.drv;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9234) {
            this.Vc();
            return;
        }
        this.duY = (fdj)fdo2;
        if (this.duY.ResourceType <= 0) {
            this.Vc();
            return;
        }
        if (this.duY.Position == null) {
            this.Vc();
            return;
        }
        if (this.duY.Rotation == null) {
            this.Vc();
            return;
        }
        lgw lgw2 = (lgw)ResourceTree.acv(this.duY.ResourceType);
        if (lgw2.erK()) {
            this.m(this.duY.ResourceType, this.MessageDelegator.lL(lcr.qzY));
        } else {
            this.lf(this.duY.ResourceType);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void lf(int n) {
        assert (n > 0);
        lgw lgw2 = (lgw)ResourceTree.acv(n);
        if (lgw2.bBt() == null || lgw2.bBt().trim().equals("")) {
            this.Vc();
            return;
        }
        bvd bvd2 = bvt.c(bve.a.dQH);
        bvd2.setGUID(this.MessageDelegator.lL(lcr.qzY));
        bvd2.setFileName(lgw2.bBt());
        bvd2.c(this.duY.Position);
        bvd2.a(this.duY.Rotation);
        bvd2.l(n);
        this.MessageDelegator.a(bvd2);
        this.Vc();
    }

    private void a(gfn gfn2) {
        cbx cbx2 = gfn2.dtF;
        if (cbx2 == null) {
            this.Vc();
            return;
        }
        if (cbx2.aIh().getGUID() == null) {
            cbx2.aIh().setGUID(this.MessageDelegator.lL(cbx2.getGUID()));
        }
        bvd bvd2 = bvt.c(cbx2.aIh().aza());
        bvd2.setGUID(cbx2.aIh().getGUID());
        bvd2.c(this.duY.Position);
        bvd2.a(this.duY.Rotation);
        bvd2.setFileName(cbx2.aIh().getFileName());
        bvd2.l(cbx2.az());
        cbx2.d(bvd2);
        this.MessageDelegator.a((amf)cbx2);
        this.Vc();
    }
}

