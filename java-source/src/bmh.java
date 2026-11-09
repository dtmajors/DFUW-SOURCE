/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
public class bmh
extends bke {
    private fdj duY = null;

    public bmh() {
        this.dsy = bkd.a.drV;
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
        this.arI();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11527: {
                this.b((fon)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void arI() {
        lgw lgw2 = (lgw)ResourceTree.acv(this.duY.ResourceType);
        if (lgw2.bBt() == null || lgw2.bBt().trim().equals("")) {
            this.Vc();
            return;
        }
        bve.a a2 = cug.getMeshType((int)this.duY.ResourceType);
        if (a2 == null) {
            this.Vc();
            return;
        }
        if (bve.a(a2)) {
            this.a(lgw2.bBt(), a2);
            return;
        }
        bvd bvd2 = bvt.c(a2);
        if (bvd2 == null) {
            this.Vc();
            return;
        }
        bvd2.setGUID(this.MessageDelegator.lL(lcr.qzY));
        bvd2.setFileName(lgw2.bBt());
        bvd2.c(this.duY.Position);
        bvd2.a(this.duY.Rotation);
        bvd2.l(this.duY.ResourceType);
        cma cma2 = new cma();
        cma2.setGUID(this.MessageDelegator.lL(lcr.qzY));
        cma2.l(this.duY.ResourceType);
        cma2.d(bvd2);
        this.MessageDelegator.a((amf)((Object)cma2));
    }

    private void b(fon fon2) {
        bvr bvr2 = (bvr)fon2.iSe;
        if (bvr2 == null) {
            this.Vc();
            return;
        }
        bvr2.setGUID(this.MessageDelegator.lL(lcr.qzY));
        bvr2.c(this.duY.Position);
        bvr2.a(this.duY.Rotation);
        bvr2.l(this.duY.ResourceType);
        cma cma2 = new cma();
        cma2.setGUID(this.MessageDelegator.lL(lcr.qzY));
        cma2.l(this.duY.ResourceType);
        cma2.d(bvr2);
        this.MessageDelegator.a((amf)((Object)cma2));
    }

    private void a(String string, bve.a a2) {
        foo foo2 = (foo)this.MessageDelegator.h(11526, this.GUID, lcr.qzt);
        foo2.setObjectType(13);
        foo2.setServerObject(true);
        foo2.setDirectoryName(null);
        foo2.cd(string);
        foo2.lh(true);
        foo2.pM(this.GUID);
        foo2.d(a2);
        this.MessageDelegator.E(foo2);
    }
}

