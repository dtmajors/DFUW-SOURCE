/*
 * Decompiled with CFR.
 */
public class iha
extends jba {
    private ign lUf;
    private ipx lUH;
    private ipb lUI;
    private ipb lUJ;
    private ipb lUK;
    private ist lUe;
    private a lUL;

    public iha(ign ign2) {
        super("FeatNotificationWindowNew", "FeatWindowNew.swf");
        this.lUf = ign2;
        this.U(295.0f, 27.0f);
        this.T(295.0f, 27.0f);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.cVL();
    }

    public static void QQ(int n) {
        ign ign2 = igq.QK(n);
        if (!ign2.cTM()) {
            return;
        }
        jbd.dwq().a(new jbb(ign2){
            final /* synthetic */ ign lUr;
            {
                this.lUr = ign2;
            }

            public jba cVQ() {
                iha iha2 = new iha(this.lUr);
                iha2.setGUID(hso.cxK().cxP().cyJ().getMessageDelegator().bzv());
                hso.cxK().cxP().cyJ().getMessageDelegator().a((amf)((Object)iha2));
                return iha2;
            }
        });
    }

    @Override
    public void a(jbc jbc2) {
        super.a(jbc2);
        switch (jbc2) {
            case mMF: {
                this.lUH.setVisible(true);
                this.cVK();
            }
        }
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.d("/dfdata/texture/gui/j2f/common/notifications/backgrounds/nbg_feats.png", 1, 14, 112, 14);
        this.rP("/dfdata/texture/gui/j2f/common/notifications/bars/feats/feat_notification_bar_" + this.lUf.cTI().cTm() + ".png");
        this.rQ("/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + this.lUf.cTI().cTm() + "/category_icons_main_" + this.lUf.cTI().cTm() + "_on_hover.png");
        this.D(lww.tjI.bD(new Object[0]));
        this.rR("/dfdata/texture/gui/j2f/common/notifications/icons/ni_feats.png");
        this.dvZ().W(this.cVM());
    }

    @Override
    protected isw cVG() {
        iso iso2 = new iso(isf.mwN, 13, 0xABABAB);
        iso2.setSize(190, 32);
        iso2.a(isu.mxP);
        iso2.sv(false);
        iso2.setText(this.lUf.getTitle());
        return iso2;
    }

    @Override
    protected void cVH() {
        super.cVH();
        this.lUH.setVisible(false);
        this.lUI.hz(0.0f);
        if (this.lUJ != null) {
            this.lUJ.hz(0.0f);
        }
        this.lUK.hz(0.0f);
        this.lUe.hz(0.0f);
    }

    @Override
    protected void cVI() {
        iha.cyJ().cIJ().p(this.lUf);
    }

    @Override
    protected void cVJ() {
        this.D(lww.tjH.bD(new Object[0]));
    }

    private void cVK() {
        if (this.lUL != null) {
            return;
        }
        this.lUL = new a(this);
        iha.czy().a(this.lUL);
    }

    private void cVL() {
        if (this.lUL == null) {
            return;
        }
        iha.czy().b(this.lUL);
        this.lUL = null;
    }

    private ipf cVM() {
        this.lUH = ipx.h(new ipf[0]);
        this.lUI = new ipb("/dfdata/texture/gui/j2f/common/notifications/icons/ni_feats_reward.png");
        this.lUH.W(this.lUI);
        this.lUH.W(this.cVO());
        if (this.lUf.cTP()) {
            this.lUH.W(ipx.d(this.cVN()));
        }
        return this.lUH;
    }

    private ipf cVN() {
        this.lUJ = new ipb("IconMaterialBitmap");
        return null;
    }

    private ipf cVO() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(this.cVP()));
        ipx2.W(ipx.d(this.cVs()));
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf cVP() {
        this.lUK = new ipb("IconProwessBitmap");
        return this.lUK;
    }

    private ipf cVs() {
        this.lUe = new ist(isf.mwO, 17, 12357465, this.lUf.cTH());
        return this.lUe;
    }

    static /* synthetic */ ipb a(iha iha2) {
        return iha2.lUI;
    }

    static /* synthetic */ ign b(iha iha2) {
        return iha2.lUf;
    }

    static /* synthetic */ ipb c(iha iha2) {
        return iha2.lUJ;
    }

    static /* synthetic */ ipb d(iha iha2) {
        return iha2.lUK;
    }

    static /* synthetic */ ist e(iha iha2) {
        return iha2.lUe;
    }
}

