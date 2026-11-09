/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class bth
extends btk
implements bto {
    public static boolean dKO = true;
    private dez dKP = new dez();
    private dfr dKQ = null;
    private dfr dKR = null;
    private dfr dKS = null;
    private dfr dKT = null;
    private dfr dKU = null;
    private dfr dKV = null;
    private dfr dKW = null;
    private int dKX = 2048;
    private int dKY = 1024;
    private String dKZ = "ls_vortex_01.dds";
    private int dLa = 512;
    private int dLb = 512;
    private String dLc = "ls_vortex_02.dds";
    private int dLd = 512;
    private int dLe = 512;
    private String dLf = "ls_frame.dds";
    private int dLg = 1024;
    private int dLh = 1024;
    private double dLi = 0.0;
    public static loz[] dLj = new loz[0];
    public static loz[] dLk = new loz[0];
    private String[] dLl = new String[]{"ls_element_01.dds", "ls_element_02.dds", "ls_element_03.dds", "ls_element_04.dds", "ls_element_05.dds", "ls_element_06.dds", "ls_element_07.dds"};
    private int dLm = 1024;
    private int dLn = 1024;
    private float dLo = Math.abs(0.01f);
    private boolean avz = false;
    private float dLp = 0.001f;
    private float dLq = 0.0023f;
    private float dLr = -0.0037f;
    private float dLs = 0.3f;
    private float dLt = 0.3f;
    private float dLu = 0.9f;
    private float dLv = 0.9f;
    private boolean dLw = true;
    private boolean dLx = false;
    private boolean dLy = true;
    private boolean dLz = false;
    private float dLA = 0.05f;
    private float dLB = 0.01f;
    private dew dLC = null;
    private dew dLD = null;
    private lcq dLE = new lcq(0.5f, 0.5f, 0.5f, 1.0f);
    private lcq dLF = new lcq(0.73f, 0.56f, 0.34f, 1.0f);
    float mh = 0.0f;
    double dLG = 0.0;

    public bth() {
        this.GUID = lcr.qAG;
    }

    @Override
    public void initialize() {
        if (lcw.ena() || lcw.enb()) {
            this.enable();
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (lcw.enf() || lcw.eng()) {
            return;
        }
        this.axC();
        if (this.dLG != 0.0) {
            float f2 = (float)(ldz2.rgz - this.dLG) / 3.0f;
            if (f2 >= 1.0f) {
                this.MessageDelegator.hd(this.dKQ.getGUID());
                if (this.dKR != null) {
                    this.MessageDelegator.hd(this.dKR.getGUID());
                }
                this.MessageDelegator.hd(this.dKT.getGUID());
                this.MessageDelegator.hd(this.dKS.getGUID());
                if (this.dKV != null) {
                    this.MessageDelegator.hd(this.dKV.getGUID());
                }
                if (this.dKW != null) {
                    this.MessageDelegator.hd(this.dKW.getGUID());
                }
                if (this.dLC != null) {
                    this.MessageDelegator.hd(this.dLC.getGUID());
                }
                if (this.dLD != null) {
                    this.MessageDelegator.hd(this.dLD.getGUID());
                }
                this.dLG = 0.0;
            } else {
                lcq lcq2 = new lcq(1.0f, 1.0f, 1.0f, 1.0f - f2);
                this.dKQ.setColor(lcq2);
                if (this.dKR != null) {
                    this.dKR.setColor(lcq2);
                }
                if (this.dKV != null) {
                    this.dKV.setColor(lcq2);
                }
                if (this.dKW != null) {
                    this.dKW.setColor(lcq2);
                }
                this.dKT.setColor(lcq2);
                this.dKS.setColor(lcq2);
                if (this.dLC != null) {
                    this.dLC.setColor(new lcq(this.dLE.r, this.dLE.g, this.dLE.b, 1.0f - f2));
                }
                if (this.dLD != null) {
                    this.dLD.setColor(new lcq(this.dLF.r, this.dLF.g, this.dLF.b, 1.0f - f2));
                }
            }
        }
        if (!this.avz) {
            return;
        }
        this.updateLayout();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11072: {
                this.a((grg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(grg grg2) {
        if (grg2.jqh) {
            this.enable();
        } else {
            this.disable();
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        super.receiveResponse(ktv2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    public void updateLayout() {
        float f2 = (float)lcw.qFU / (float)this.dKY;
        if (this.dKQ != null) {
            this.dKQ.j(new ljp(f2, f2));
        }
        if (this.dKR != null) {
            this.dKR.k(new ljp(lcw.qFT - 400, 100.0f));
        }
        if (this.dKV != null) {
            this.dKV.k(new ljp(0.0f, 0.0f));
        }
        if (this.dKW != null) {
            this.dKW.k(new ljp(0.0f, (float)lcw.qFU - 128.0f));
        }
        if (this.dKT != null) {
            this.dKT.gu(this.mh);
            this.mh -= 0.01f;
            this.dKT.k(new ljp(lcw.qFT - 108, lcw.qFU - 62));
        }
        if (this.dKS != null) {
            this.dKS.k(new ljp(lcw.qFT - 2048, lcw.qFU - 128));
        }
        if (this.dLD != null) {
            this.dLD.g(new ljp(724.0f * f2 + 30.0f, 834.0f * f2));
            this.dLD.h(new ljp(lcw.qFT, lcw.qFU));
        }
        if (this.dLC != null) {
            this.dLC.g(new ljp(724.0f * f2, 834.0f * f2 + 30.0f));
            ljp ljp2 = this.dKT.bmT();
            this.dLC.h(new ljp(ljp2.x - 70.0f, lcw.qFU));
        }
    }

    public void enable() {
        lfn.b(0, "SFLevelLoaderScreen", "enable() ENABLING ?");
        if (this.avz || lcw.enf() || lcw.eng()) {
            return;
        }
        loi.exd().yS(true);
        if (!dKO) {
            return;
        }
        String[] stringArray = new String[]{"loading_screen_01.dds", "loading_screen_02.dds", "loading_screen_03.dds", "loading_screen_04.dds"};
        String string = stringArray[(int)(Math.random() * (double)stringArray.length) % stringArray.length];
        lfn.b(0, "SFLevelLoaderScreen", "enable() ENABLING yes");
        ljp ljp2 = new ljp();
        this.dKQ = (dfr)this.dKP.Af(15);
        this.dKQ.setTextureName(string);
        this.dKQ.setVisible(true);
        this.dKQ.k(new ljp(0.0f, 0.0f));
        this.dKQ.hT(false);
        this.dKQ.hU(false);
        this.dKQ.hV(true);
        this.dKQ.setColor(lcq.BRIGHT_WHITE);
        this.dKQ.setGUID(this.MessageDelegator.bzv());
        this.dKQ.fb(0.0f + this.dLo);
        if (!lcw.qGm) {
            this.dKR = (dfr)this.dKP.Af(15);
            this.dKR.setTextureName("loading_screen_title.dds");
            this.dKR.setVisible(true);
            this.dKR.hT(false);
            this.dKR.hU(false);
            this.dKR.hV(true);
            this.dKR.setColor(lcq.BRIGHT_WHITE);
            this.dKR.setGUID(this.MessageDelegator.bzv());
            this.dKR.fb(0.0f + this.dLo * 2.0f);
        }
        if (lcw.bcB == 2 && lpd.rHs.exL().startsWith("ko")) {
            this.dKV = (dfr)this.dKP.Af(15);
            this.dKV.setTextureName("DFUW_Rating.dds");
            this.dKV.setVisible(true);
            this.dKV.hT(false);
            this.dKV.hU(false);
            this.dKV.hV(true);
            this.dKV.setColor(lcq.BRIGHT_WHITE);
            this.dKV.setGUID(this.MessageDelegator.bzv());
            this.dKV.fb(0.0f + this.dLo * 3.0f);
            this.dKW = (dfr)this.dKP.Af(15);
            this.dKW.setTextureName("ko_warning_blackscreen.dds");
            this.dKW.setVisible(true);
            this.dKW.hT(false);
            this.dKW.hU(false);
            this.dKW.hV(true);
            this.dKW.setColor(lcq.BRIGHT_WHITE);
            this.dKW.setGUID(this.MessageDelegator.bzv());
            this.dKW.fb(0.0f + this.dLo * 3.0f);
        }
        this.dKT = (dfr)this.dKP.Af(15);
        this.dKT.setTextureName("loading_screen_rotator.dds");
        this.dKT.setVisible(true);
        this.dKT.hT(false);
        this.dKT.hU(true);
        this.dKT.hV(true);
        this.dKT.bS(new ljq(64.0f, 64.0f, 0.0f));
        this.dKT.setGUID(this.MessageDelegator.bzv());
        this.dKT.fb(0.0f + this.dLo * 4.0f);
        this.dKS = (dfr)this.dKP.Af(15);
        this.dKS.setTextureName("loading_screen_loader.dds");
        this.dKS.setVisible(true);
        this.dKS.hT(false);
        this.dKS.hU(false);
        this.dKS.hV(true);
        this.dKS.setColor(new lcq(0.8f, 0.7f, 0.6f, 0.95f));
        this.dKS.setGUID(this.MessageDelegator.bzv());
        this.dKS.fb(0.0f + this.dLo * 2.0f);
        if (!lcw.emW()) {
            this.dLC = (dew)this.dKP.Af(27);
            this.dLC.setGUID(this.MessageDelegator.bzv());
            this.dLC.zZ(400);
            this.dLC.zY(15);
            this.dLC.Aa(1);
            this.dLC.iK("Times New Roman");
            this.dLC.hL(false);
            this.dLC.gk(2.0f);
            this.dLC.setColor(this.dLE);
            this.dLC.xf(132);
            this.dLC.g(new ljp(0.0f, 0.0f));
            this.dLC.h(new ljp(lcw.qFT, 300.0f));
            this.dLC.hM(false);
            this.dLD = (dew)this.dKP.Af(27);
            this.dLD.setGUID(this.MessageDelegator.bzv());
            this.dLD.zZ(400);
            this.dLD.zY(18);
            this.dLD.Aa(1);
            this.dLD.iK("Times New Roman");
            this.dLD.hL(false);
            this.dLD.gk(2.0f);
            this.dLD.xf(132);
            this.dLD.g(new ljp(0.0f, 0.0f));
            this.dLD.h(new ljp(lcw.qFT, 300.0f));
            this.dLD.setColor(this.dLF);
            this.dLD.hM(false);
            this.dLD.setText(lwx.tlb.bD(new Object[0]).exA());
            this.dLi = 0.0;
            this.axC();
        }
        this.updateLayout();
        this.MessageDelegator.a(this.dKQ);
        if (this.dKR != null) {
            this.MessageDelegator.a(this.dKR);
        }
        this.MessageDelegator.a(this.dKT);
        this.MessageDelegator.a(this.dKS);
        if (this.dKV != null) {
            this.MessageDelegator.a(this.dKV);
        }
        if (this.dKW != null) {
            this.MessageDelegator.a(this.dKW);
        }
        if (this.dLC != null) {
            this.MessageDelegator.a(this.dLC);
        }
        if (this.dLD != null) {
            this.MessageDelegator.a(this.dLD);
        }
        this.avz = true;
        this.axB();
    }

    private void axB() {
        fak fak2 = (fak)this.MessageDelegator.h(1809, this.GUID, lcr.qDY);
        fak2.avz = this.avz;
        this.MessageDelegator.I(fak2);
    }

    public void disable() {
        lfn.b(0, "SFLevelLoaderScreen", "disable() DISABLING ?");
        loi.exd().yS(false);
        if (!dKO) {
            return;
        }
        if (!this.avz || lcw.enf() || lcw.eng()) {
            return;
        }
        lfn.b(0, "SFLevelLoaderScreen", "disable() DISABLING yes");
        this.avz = false;
        this.dLG = this.MessageDelegator.arc().rgz;
        this.axB();
    }

    private boolean a(dfr dfr2, boolean bl2, ldz ldz2, float f2, float f3, float f4) {
        lcq lcq2 = dfr2.getColor();
        if (bl2) {
            float f5 = lcq2.a + f4;
            if (f5 > f2) {
                f5 = f2;
                bl2 = false;
            }
            lcq2 = new lcq(lcq2.r, lcq2.g, lcq2.b, f5, true);
            dfr2.setColor(lcq2);
        } else {
            float f6 = lcq2.a - f4;
            if (f6 <= f3) {
                f6 = f3;
                bl2 = true;
            }
            lcq2 = new lcq(lcq2.r, lcq2.g, lcq2.b, f6, true);
            dfr2.setColor(lcq2);
        }
        return bl2;
    }

    public boolean isEnabled() {
        return this.avz;
    }

    private void axC() {
        if (this.dLi == 0.0 || this.MessageDelegator.arc().rgz > this.dLi + 20.0) {
            this.dLi = this.MessageDelegator.arc().rgz;
            int n = dLj.length + dLk.length;
            int n2 = (int)(Math.random() * (double)n) % n;
            loz loz2 = null;
            if (n2 >= dLj.length) {
                loz2 = dLk[n2 - dLj.length];
                this.dLD.setText(lwx.tlc.bD(new Object[0]).exA().toUpperCase());
            } else {
                this.dLD.setText(lwx.tlb.bD(new Object[0]).exA().toUpperCase());
                loz2 = dLj[n2];
            }
            this.dLC.setText(loz2.exA());
        }
    }
}

