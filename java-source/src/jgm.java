/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hyn
 */
public class jgm
extends hzk {
    protected ghd naz = null;

    public jgm() {
        super("ScrollOfVengeance", "scrollofvengeance.swf");
        this.a(hyb.lmC);
        this.OQ(jnz.nGi);
        this.a(hya.lmp, true);
    }

    public void cBa() {
        ghc ghc2 = (ghc)this.MessageDelegator.h(32523, this.GUID, hso.cxK().bAn().gYX);
        ghc2.Jv(0);
        this.MessageDelegator.E(ghc2);
        float f = hso.cxK().cxY().dOj();
        float f2 = hso.cxK().cxY().TG();
        this.N(f / this.cEJ(), f2 / this.cDc());
        this.kq(f);
        this.kr(f2);
        String string = "texture/dds/" + ((lgw)lea.enW().acv((int)cug.ftZ)).atw().Name;
        this.a("setIconFileName", new Object[]{string});
        this.cEk();
    }

    public void cEk() {
        this.a("setText", new Object[]{lxf.tod.bD(cug.ftZ).exA(), lxz.tCa.bD(new Object[0]).exA(), lxz.tBV.bD(new Object[0]).exA(), lxz.tBX.bD(new Object[0]).exA(), lxz.tBY.bD(new Object[0]).exA(), lxz.tBZ.bD(new Object[0]).exA(), "100"});
    }

    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 32524) {
            this.a((ghd)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    public void a(ghd ghd2) {
        this.naz = ghd2;
        this.dEG();
    }

    protected void dEG() {
        if (this.naz == null) {
            return;
        }
        for (int i = 0; i < this.naz.getNames().length; ++i) {
            String string = this.naz.getNames()[i];
            int n = this.naz.bUX()[i];
            String string2 = "";
            int n2 = 0;
            if (string.length() == 0) {
                string = "";
                string2 = "";
                n = 3;
            } else if (n == 0) {
                string2 = lxz.tBy.bD(new Object[0]).exA();
                n2 = 8235050;
            } else if (n == 1) {
                string2 = lxz.tBz.bD(new Object[0]).exA();
                n2 = 12729367;
            } else if (n == 2) {
                string2 = lxz.tBA.bD(new Object[0]).exA();
                n2 = 12729367;
            }
            this.a("setItem", new Object[]{i, string, n, string2, n2});
        }
    }

    protected void b(jnz jnz2, jnz jnz3) {
        this.MessageDelegator.hd(this.GUID);
    }

    @llk
    public void onTeleportButtonClicked(int n) {
        ghc ghc2 = (ghc)this.MessageDelegator.h(32523, this.GUID, hso.cxK().bAn().gYX);
        ghc2.Jv(3);
        ghc2.Jw(n);
        this.MessageDelegator.E(ghc2);
        this.MessageDelegator.hd(this.GUID);
    }

    @llk
    public void onDeleteButtonClicked(int n) {
        hzr hzr2 = new hzr();
        hzr2.setGUID(this.MessageDelegator.bzv());
        hzr2.oq("SFYesNoDialogSelentine");
        hzr2.G(lxz.tBB.bD(this.naz.getNames()[n]).exA(), lxz.tBM.bD(new Object[0]).exA());
        int n2 = n;
        hzr2.a(new hzq(this, n2){
            final /* synthetic */ int naA;
            final /* synthetic */ jgm naB;
            {
                this.naB = jgm2;
                this.naA = n;
            }

            public void O(float f, float f2) {
            }

            public void oH(boolean bl) {
                if (bl) {
                    ghc ghc2 = (ghc)jgm.b(this.naB).h(32523, jgm.a(this.naB), hso.cxK().bAn().gYX);
                    ghc2.Jv(1);
                    ghc2.Jw(this.naA);
                    jgm.c(this.naB).E(ghc2);
                }
            }
        });
        this.MessageDelegator.a((amf)((Object)hzr2));
    }

    @llk
    public void onCloseButtonClicked() {
        this.hide();
    }

    protected void g(int n, int n2, String string) {
        if (string != null && (string.equals("overlay") || string.startsWith("movie"))) {
            this.hide();
        }
    }

    protected void hide() {
        this.MessageDelegator.hd(this.GUID);
    }

    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        if (string.startsWith("delete")) {
            return new iae(lxz.tCb.bD(new Object[0]).exA(), n, n2, 2, 2);
        }
        if (string.startsWith("teleport")) {
            return new iae(lxz.tCc.bD(new Object[0]).exA(), n, n2, 2, 2);
        }
        return null;
    }

    static /* synthetic */ ldv a(jgm jgm2) {
        return jgm2.GUID;
    }

    static /* synthetic */ dxr b(jgm jgm2) {
        return jgm2.MessageDelegator;
    }

    static /* synthetic */ dxr c(jgm jgm2) {
        return jgm2.MessageDelegator;
    }
}

