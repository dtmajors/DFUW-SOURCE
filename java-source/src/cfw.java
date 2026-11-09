/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
public class cfw
extends cea
implements bto {
    private boolean euW = false;
    private static final int euX = 0;
    private static final int euY = 1;
    private static final int euZ = 2;
    private static final int eva = 3;
    private static final int evb = 4;
    private static final int evc = 5;
    private static final int evd = 6;
    private static final int eve = 7;
    private int evf = 0;
    private static final float evg = 0.0f;
    private static final float evh = 0.8f;
    private static final lcq evi = new lcq(0.05882353f, 0.27450982f, 0.3529412f, 1.0f);
    private static final lcq evj = new lcq(0.9019608f, 0.27450982f, 0.0f, 1.0f);
    private static final lcq evk = new lcq(0.0f, 1.0f, 0.43137255f, 1.0f);
    private static final lcq evl = new lcq(0.8235294f, 0.7058824f, 0.15686275f, 1.0f);
    private static final lcq evm = new lcq(0.5882353f, 0.078431375f, 0.27450982f, 1.0f);
    private static final lcq evn = new lcq(0.5882353f, 0.078431375f, 0.27450982f, 1.0f);
    private static final String evo = "shaderppfinalunderwater.xml";
    private static final String evp = "shaderppfinalunderwater.xml";
    private static final String evq = "shaderppfinalunderwater.xml";
    private static final String evr = "shaderppfinalunderwater.xml";
    private static final String evs = "shaderppfinalunderwater.xml";
    private static double lW = 0.0;
    private static double evt = 0.0;
    dfb evu = null;
    dfb evv = null;
    dfb evw = null;

    @Override
    public cea aKA() {
        cfw cfw2 = new cfw();
        return cfw2;
    }

    @Override
    public void setActive(boolean bl) {
        super.setActive(bl);
        if (bl && !this.euW) {
            this.aNG();
        }
        if (!bl && this.euW) {
            this.pM(1);
            this.aNH();
        }
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.aNH();
        if (this.evu != null) {
            this.MessageDelegator.hd(this.evu.getGUID());
        }
        if (this.evw != null) {
            this.MessageDelegator.hd(this.evw.getGUID());
        }
        if (this.evv != null) {
            this.MessageDelegator.hd(this.evv.getGUID());
        }
        if (this.evf == 1) {
            return;
        }
        this.aNK();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        lW = ldz2.rgz;
    }

    private void aNG() {
        if (this.eou == null) {
            return;
        }
        kok kok2 = this.aNI();
        kok2.ZR(1);
        kok2.lQ(false);
        kok2.wD(false);
        kok2.sy(this.getGUID());
        kok2.zP(10);
        this.MessageDelegator.a(kok2);
        this.euW = true;
    }

    private void aNH() {
        if (!this.euW) {
            return;
        }
        kok kok2 = (kok)this.MessageDelegator.h(525);
        kok2.jM(false);
        kok2.wD(false);
        kok2.ts(this.getGUID());
        kok2.mF(10.0f);
        kok2.mG(100.0f);
        kok2.ZR(2);
        kok2.sy(this.getGUID());
        this.MessageDelegator.a(kok2);
        this.euW = false;
    }

    private kok aNI() {
        kok kok2 = (kok)this.MessageDelegator.h(525);
        kok2.jM(false);
        kok2.wD(false);
        kok2.ts(this.getGUID());
        kok2.hK(this.eou.axa());
        kok2.sy(this.getGUID());
        kok2.mF(10.0f);
        kok2.mG(100.0f);
        return kok2;
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 525: {
                this.a((kvz)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public void oU(int n) {
        super.oU(n);
        if (this.evf == 1) {
            return;
        }
        switch (n) {
            case 5: {
                this.aNK();
                break;
            }
            case 4: {
                this.aNK();
                break;
            }
        }
    }

    private void a(boolean bl, lcq lcq2) {
        far far2 = (far)this.MessageDelegator.h(1793, this.GUID, lcr.qDR);
        if (bl) {
            far2.kP(true);
            far2.Ge(1020);
            far2.d(new lcq(lcq2.r, lcq2.g, lcq2.b, 1.0f));
            far2.cb(0.01f);
            far2.ca(0.2f);
            far2.bX(2.0f);
            far2.jc(true);
            far2.jd(true);
            far2.Gf(1);
            far2.je(true);
        } else {
            far2.kQ(true);
        }
        this.MessageDelegator.F(far2);
    }

    private void pM(int n) {
        if (this.evf == n) {
            return;
        }
        boolean bl = this.evf != 0;
        this.evf = n;
        switch (this.evf) {
            case 1: {
                this.a(false, null);
                this.aNK();
                break;
            }
            case 3: {
                this.a(true, evj);
                this.k(evj);
                this.hj("shaderppfinalunderwater.xml");
                break;
            }
            case 4: {
                this.a(true, evl);
                this.k(evl);
                this.hj("shaderppfinalunderwater.xml");
                break;
            }
            case 5: {
                this.a(true, evm);
                this.k(evm);
                this.hj("shaderppfinalunderwater.xml");
                break;
            }
            case 7: {
                this.a(true, evn);
                this.k(evn);
                this.hj("shaderppfinalunderwater.xml");
                break;
            }
            case 2: {
                this.a(true, evi);
                this.k(evi);
                this.hj("shaderppfinalunderwater.xml");
                break;
            }
            case 6: {
                this.a(true, evk);
                this.k(evk);
                this.hj("shaderppfinalunderwater.xml");
                break;
            }
            default: {
                assert (false) : "Unknown State!";
                break;
            }
        }
        this.k(this.evf != 1 && this.evf != 0, bl);
    }

    private void k(lcq lcq2) {
        kgb kgb2 = new kgb();
        kgb2.tr(this.getGUID());
        kgb2.ts(this.getGUID());
        kgb2.plj = 4;
        kgb2.pll = lcq2;
        this.MessageDelegator.b(kgb2);
    }

    private void aNJ() {
        if (!this.euW) {
            return;
        }
        kok kok2 = this.aNI();
        kok2.ZR(16);
        this.MessageDelegator.a(kok2);
    }

    private void a(kvz kvz2) {
        this.aNJ();
        if (kvz2.qfh >= 0.0f || kvz2.qfi == 0) {
            this.pM(1);
        } else if (kvz2.qfi == cug.fqm) {
            this.pM(3);
        } else if (kvz2.qfi == cug.fqo) {
            this.pM(4);
        } else if (kvz2.qfi == cug.fqp) {
            this.pM(5);
        } else if (kvz2.qfi == cug.fqr) {
            this.pM(2);
        } else if (kvz2.qfi == cug.fqk) {
            this.pM(6);
        } else if (kvz2.qfi == cug.fql) {
            this.pM(7);
        } else {
            this.pM(2);
        }
    }

    private void aNK() {
        kgb kgb2 = new kgb();
        kgb2.tr(this.getGUID());
        kgb2.ts(this.getGUID());
        kgb2.plj = 2;
        this.MessageDelegator.b(kgb2);
    }

    private void hj(String string) {
        kgb kgb2 = new kgb();
        kgb2.tr(this.getGUID());
        kgb2.ts(this.getGUID());
        kgb2.plj = 1;
        kgb2.plk = string;
        this.MessageDelegator.b(kgb2);
    }

    private void k(boolean bl, boolean bl2) {
        kil kil2 = (kil)this.MessageDelegator.h(1284);
        kil2.ts(this.GUID);
        kil2.tB(new ldv(0, 0, 0));
        kil2.XS(2048);
        kil2.wM(bl);
        this.MessageDelegator.a(kil2);
        dez dez2 = new dez();
        if (bl) {
            if (this.evu == null) {
                this.evu = (dfb)dez2.Af(3);
                this.evu.setXMLFileName("audio/environmental/terrain/env_underwater_01.xml");
                this.evu.setEnableModifyVolume(true);
                this.evu.setLooping(true);
                this.evu.gl(0.3f);
                this.evu.hO(true);
                this.evu.setGUID(this.MessageDelegator.bzv());
                this.evu.hN(false);
                this.MessageDelegator.a(this.evu);
            } else {
                this.evu.play();
                this.evu.gl(0.3f);
            }
            if (this.evw == null) {
                this.evw = (dfb)dez2.Af(3);
                this.evw.setXMLFileName("audio/environmental/terrain/env_underwater_submerge.xml");
                this.evw.setEnableModifyVolume(true);
                this.evw.setLooping(false);
                this.evw.hO(true);
                this.evw.gl(0.3f);
                this.evw.setGUID(this.MessageDelegator.bzv());
                this.evw.hN(false);
                this.MessageDelegator.a(this.evw);
                evt = lW;
            } else if (lW - evt > 1.0) {
                evt = lW;
                this.evw.play();
            }
            evt = lW;
        } else {
            if (this.evu != null) {
                this.evu.stop();
            }
            if (this.evv == null) {
                if (bl2) {
                    this.evv = (dfb)dez2.Af(3);
                    this.evv.setXMLFileName("audio/environmental/terrain/env_underwater_emerge.xml");
                    this.evv.setEnableModifyVolume(true);
                    this.evv.setLooping(false);
                    this.evv.hO(true);
                    this.evv.gl(0.3f);
                    this.evv.setGUID(this.MessageDelegator.bzv());
                    this.evv.hN(false);
                    this.MessageDelegator.a(this.evv);
                    evt = lW;
                }
            } else if (lW - evt > 1.0) {
                this.evv.play();
            }
            evt = lW;
        }
    }
}

