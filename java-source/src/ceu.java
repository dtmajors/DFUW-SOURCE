/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  cxd
 *  en
 *  ha
 *  lcr
 *  lcw
 */
public class ceu {
    private static final String TC = "SFPlayerMonolithManager";
    private final cex abN;
    private ldv awz;
    private String erq;
    private ldv err;
    private float ers;
    private ljq ert;
    private int eru;
    private int erv;
    private double erw;
    private double erx;
    private int ery;

    public ceu(cex cex2) {
        this.abN = cex2;
    }

    private void a(gck gck2) {
        if (this.err != null) {
            lfn.b(5, TC, "handleRegisterMessage() Player is already registered with monolith : " + this.err);
            assert (false);
            return;
        }
        if (gck2.av() == null || gck2.bTx() <= 0 || gck2.bTt() <= 0 || gck2.bTu() <= 0 || gck2.getRadius() <= 0.0f || gck2.bTw() < 0.0 || gck2.bTv() < 0.0) {
            lfn.b(5, TC, "handleRegisterMessage() for monolith : " + gck2.aO() + " Position : " + gck2.av() + " ProwessMax : " + gck2.bTx() + " RegisteredPlayer : " + gck2.bTt() + " ProwessLimit : " + gck2.bTu() + " Radius : " + gck2.getRadius() + " BlastTimer : " + gck2.bTw() + " RewardTimer : " + gck2.bTv());
            assert (false);
            return;
        }
        this.err = gck2.aO();
        this.ert = gck2.av();
        this.ers = gck2.getRadius();
        this.eru = gck2.bTx();
        this.erv = gck2.bTt();
        this.ery = gck2.bTu();
        this.erw = gck2.bTv();
        this.erx = gck2.bTw();
        this.erq = lcw.ea((ljq)this.ert);
        this.a((gch)gck2);
    }

    private void a(gcm gcm2) {
        if (this.err == null) {
            lfn.b(5, TC, "handleUnRegisterMessage() Player is not registered with monolith : " + gcm2.aO());
            return;
        }
        if (!this.err.equals(gcm2.aO())) {
            lfn.b(5, TC, "handleUnRegisterMessage() Player is not registered with monolith : " + gcm2.aO() + " but with monolith : " + this.err);
            assert (false);
            return;
        }
        this.aLS();
        this.a((gch)gcm2);
    }

    private void a(gcg gcg2) {
        if (this.err == null) {
            lfn.b(5, TC, "handleClosedMessage() Player is not registered with monolith : " + gcg2.aO());
            assert (false);
            return;
        }
        if (!this.err.equals(gcg2.aO())) {
            lfn.b(5, TC, "handleClosedMessage() Player is not registered with monolith : " + gcg2.aO() + " but with monolith : " + this.err);
            assert (false);
            return;
        }
        this.aLS();
        this.a((gch)gcg2);
    }

    private void a(gcl gcl2) {
        if (this.err == null) {
            lfn.b(5, TC, "handleRewardMessage() Player is not registered with monolith : " + gcl2.aO());
            assert (false);
            return;
        }
        if (!this.err.equals(gcl2.aO())) {
            lfn.b(5, TC, "handleRewardMessage() Player is not registered with monolith : " + gcl2.aO() + " but with monolith : " + this.err);
            assert (false);
            return;
        }
        en en2 = this.abN.jm();
        if (en2 == null) {
            return;
        }
        boolean bl = en2.ag(1344);
        if (bl) {
            return;
        }
        if (this.abN.aJD() == null) {
            return;
        }
        if (this.abN.aJD().aEP() == null) {
            return;
        }
        boolean bl2 = this.abN.aJD().aEP().isAlive();
        if (!bl2) {
            return;
        }
        float f2 = this.aLQ();
        if (f2 <= 0.0f) {
            lfn.b(5, TC, "handleRewardMessage() Player : " + this.abN.getGUID() + " will get no reward from monolith : " + this.err);
            return;
        }
        this.abN.mA().kz().a(tv.aVw, f2, this.erq);
        this.pz(gcl2.getSpecialEffectType());
    }

    private float aLQ() {
        ha ha2 = this.abN.mA();
        if (ha2 == null) {
            return 0.0f;
        }
        float f2 = ha2.kA();
        if (f2 >= (float)this.ery) {
            return 0.0f;
        }
        if (this.abN.aAG() == null) {
            return 0.0f;
        }
        if (this.abN.aAG().azb() == null) {
            return 0.0f;
        }
        if (this.ert == null) {
            return 0.0f;
        }
        float f3 = ljq.s(this.abN.aAG().azb(), this.ert);
        float f4 = (1.0f - f3 / (this.ers + 3.1f)) * (float)this.eru / (float)this.erv;
        float f5 = lea.epA().vz() * f4;
        return f5;
    }

    private void a(gcp gcp2) {
        if (this.err == null) {
            lfn.b(5, TC, "handleUpdateRewardTimerMessage() Player is not registered with monolith : " + gcp2.aO());
            assert (false);
            return;
        }
        if (!this.err.equals(gcp2.aO())) {
            lfn.b(5, TC, "handleUpdateRewardTimerMessage() Player is not registered with monolith : " + gcp2.aO() + " but with monolith : " + this.err);
            assert (false);
            return;
        }
        this.erw = gcp2.bTv();
        this.a((gch)gcp2);
    }

    private void a(gcn gcn2) {
        if (this.err == null) {
            lfn.b(5, TC, "handleUpdateBlastTimerMessage() Player is not registered with monolith : " + gcn2.aO());
            assert (false);
            return;
        }
        if (!this.err.equals(gcn2.aO())) {
            lfn.b(5, TC, "handleUpdateBlastTimerMessage() Player is not registered with monolith : " + gcn2.aO() + " but with monolith : " + this.err);
            assert (false);
            return;
        }
        this.erx = gcn2.bTw();
        this.a((gch)gcn2);
        en en2 = this.abN.jm();
        if (en2 == null) {
            return;
        }
        boolean bl = en2.ag(1344);
        if (bl) {
            return;
        }
        if (this.abN.aJD() == null) {
            return;
        }
        if (this.abN.aJD().aEP() == null) {
            return;
        }
        boolean bl2 = this.abN.aJD().aEP().isAlive();
        if (!bl2) {
            return;
        }
        this.pz(gcn2.getSpecialEffectType());
        for (int i2 = 0; i2 < 4; ++i2) {
            this.aLR();
        }
    }

    private void pz(int n) {
        if (n == -1) {
            return;
        }
        glh glh2 = (glh)this.abN.getMessageDelegator().h(13057, this.abN.getGUID(), lcr.qEb);
        glh2.SpecialEffectType = n;
        glh2.aZG = null;
        glh2.akX = this.abN.KY();
        glh2.aZD = this.abN.aAG().av();
        this.abN.getMessageDelegator().F(glh2);
    }

    private void aLR() {
        fcw fcw2 = (fcw)this.abN.getMessageDelegator().h(9227, this.abN.getGUID(), this.abN.getMessageDelegator().getGUID());
        fcw2.dul = 0;
        fcw2.bst = bkd.dqy;
        fcw2.aZG = this.err;
        fcw2.akX = this.abN.getGUID();
        fcw2.dsL = this.abN.KY();
        fcw2.dum = 0.0f;
        fcw2.aYF = this.err;
        fcw2.bsG = cug.fso;
        fcw2.aYC = cxd.fJY;
        fcw2.Magnitude = 150.0f;
        fcw2.gpI = -3.0;
        fcw2.eKm = -3.0;
        fcw2.bsE = 1;
        fcw2.aYH = 1;
        fcw2.aYG = bfk.dgf;
        fcw2.bRD = 5;
        fcw2.duq = 1.0f;
        fcw2.aZH = this.abN.aAG().azb();
        fcw2.a(cxd.f.fQW);
        this.abN.getMessageDelegator().H(fcw2);
    }

    private void a(gco gco2) {
        if (this.err == null) {
            lfn.b(5, TC, "handleUpdateRegisteredPlayersMessage() Player is not registered with monolith : " + gco2.aO());
            assert (false);
            return;
        }
        if (!this.err.equals(gco2.aO())) {
            lfn.b(5, TC, "handleUpdateRegisteredPlayersMessage() Player is not registered with monolith : " + gco2.aO() + " but with monolith : " + this.err);
            assert (false);
            return;
        }
        this.erv = gco2.bTt();
        this.a((gch)gco2);
    }

    private void a(gch gch2) {
        if (this.awz == null) {
            lfn.b(5, TC, "notifyClient() Message can not be forwarded to client.");
            assert (false);
            return;
        }
        switch (gch2.bEz()) {
            case 32769: {
                gck gck2 = (gck)gch2;
                gcj gcj2 = (gcj)this.abN.getMessageDelegator().h(32776, gch2.aO(), this.awz);
                gcj2.cH(gck2.bTw());
                gcj2.II(gck2.bTu());
                gcj2.IH(gck2.bTt());
                gcj2.cG(gck2.bTv());
                this.abN.getMessageDelegator().E(gcj2);
                break;
            }
            case 32770: {
                gch2.on(this.awz);
                this.abN.getMessageDelegator().E(gch2);
                break;
            }
            case 32771: {
                gch2.on(this.awz);
                this.abN.getMessageDelegator().E(gch2);
                break;
            }
            case 32773: {
                gch2.on(this.awz);
                this.abN.getMessageDelegator().E(gch2);
                break;
            }
            case 32774: {
                gch2.on(this.awz);
                this.abN.getMessageDelegator().E(gch2);
                break;
            }
            case 32775: {
                gch2.on(this.awz);
                this.abN.getMessageDelegator().E(gch2);
            }
        }
    }

    private void aLS() {
        this.err = null;
        this.ert = null;
        this.ers = 0.0f;
        this.eru = -1;
        this.erv = 0;
        this.ery = 0;
        this.erw = 0.0;
        this.erx = 0.0;
    }

    public void b(gch gch2) {
        if (this.awz == null && this.abN.mA() != null && this.abN.mA().hk() != null) {
            this.awz = lcr.ak((ldv)lcr.acL, (int)this.abN.mA().hk().ib());
        }
        int n = gch2.bEz();
        switch (n) {
            case 32769: {
                this.a((gck)gch2);
                break;
            }
            case 32770: {
                this.a((gcm)gch2);
                break;
            }
            case 32771: {
                this.a((gcg)gch2);
                break;
            }
            case 32772: {
                this.a((gcl)gch2);
                break;
            }
            case 32773: {
                this.a((gcp)gch2);
                break;
            }
            case 32774: {
                this.a((gcn)gch2);
                break;
            }
            case 32775: {
                this.a((gco)gch2);
            }
        }
    }

    public boolean aLT() {
        return this.err != null;
    }
}

