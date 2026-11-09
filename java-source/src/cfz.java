/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cfz
extends btk {
    private b evV = b.ewo;
    private hyv evW = null;
    private a evX = a.ewk;
    private ldv evY = null;
    private ldv evZ = null;
    private ldv ewa = null;
    private int ewb = -1;
    private int ewc = -1;
    private String ewd = null;
    private int ewe = -1;
    private ldv ewf = null;
    private ljq ewg = null;

    private void a(ezq ezq2) {
        if (this.evV != b.ewo) {
            lfn.b(5, this.getClass().getSimpleName(), "handleDuelingClientChallengerInfoResponseMessage() State : " + (Object)((Object)this.evV));
            assert (false);
            return;
        }
        if (this.evW != null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleDuelingClientChallengerInfoResponseMessage() DuelWindow NOT NULL");
            assert (false);
            return;
        }
        this.ewb = ezq2.bNx();
        this.ewd = ezq2.iU();
        this.ewe = ezq2.bNt();
        this.ewa = ezq2.aoC();
        if (this.ewb < 0 || this.ewd == null || this.ewe < 0 || this.ewa == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleDuelingClientChallengerInfoResponseMessage() DuelFeeMax : " + this.ewb + " OpponentName : " + this.ewd + " OpponentProwess : " + this.ewe + " OpponentGUID : " + this.ewa);
            assert (false);
            return;
        }
        this.evZ = lcr.o((ldv)this.ewa, (int)this.getGUID().ib(), (int)this.ewa.enw());
        this.evX = a.ewl;
        this.evV = b.ewp;
        this.evY = ezq2.aO();
        this.evW = new hyv(this);
        this.evW.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)this.evW));
        this.evW.R(-3000.0f, -2000.0f);
        this.evW.setVisible(true);
    }

    private void a(ezn ezn2) {
        if (this.evV != b.ewo) {
            lfn.b(5, this.getClass().getSimpleName(), "handleDuelingClientChallengeeDuelRequestMessage() State : " + (Object)((Object)this.evV));
            assert (false);
            return;
        }
        if (this.evW != null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleDuelingClientChallengeeDuelRequestMessage() DuelWindow NOT NULL");
            assert (false);
            return;
        }
        this.ewb = ezn2.bNu();
        this.ewc = ezn2.aNM();
        this.ewd = ezn2.iU();
        this.ewe = ezn2.bNt();
        this.ewa = ezn2.aoC();
        if (this.ewc < 0 || this.ewd == null || this.ewe < 0 || this.ewa == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleDuelingClientChallengeeDuelRequestMessage() DuelFeeMax : " + this.ewb + " OpponentName : " + this.ewd + " OpponentProwess : " + this.ewe + " OpponentGUID : " + this.ewa);
            assert (false);
            return;
        }
        this.evZ = lcr.o((ldv)this.ewa, (int)this.getGUID().ib(), (int)this.ewa.enw());
        this.evX = a.ewm;
        this.evV = b.ewq;
        this.evY = ezn2.aO();
        this.evW = new hyv(this);
        this.evW.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)this.evW));
        this.evW.R(-3000.0f, -2000.0f);
        this.evW.setVisible(true);
    }

    private void a(ezy ezy2) {
        ezy ezy3 = ezy2;
        if (this.evW != null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleDuelingStateUpdateMessage() received a non initialization message while the window is not null");
            assert (false);
            return;
        }
        cga.a a2 = cga.a.getValueByOrdinal(ezy3.getState());
        switch (a2) {
            case ewz: {
                this.aNR();
                this.Li();
                break;
            }
            case ewE: {
                this.evV = b.ewt;
                this.ewg = ezy2.bNB();
                this.aNQ();
                break;
            }
            case ewF: {
                this.evV = b.ewu;
            }
        }
    }

    public void a(cfx cfx2) {
        switch (this.evX) {
            case ewl: {
                switch (cfx2) {
                    case evz: {
                        this.pP(cfx2.ordinal());
                        this.Li();
                        this.closeWindow();
                        return;
                    }
                    case evy: {
                        this.evV = b.ewr;
                        this.pP(cfx2.ordinal());
                        this.closeWindow();
                        return;
                    }
                }
                this.pP(cfx.evH.ordinal());
                this.Li();
                this.closeWindow();
                assert (false) : "Action : " + (Object)((Object)cfx2);
                return;
            }
            case ewm: {
                switch (cfx2) {
                    case evz: 
                    case evA: {
                        this.pO(cfx2.ordinal());
                        this.Li();
                        this.closeWindow();
                        return;
                    }
                    case evy: {
                        this.evV = b.ews;
                        this.pO(cfx2.ordinal());
                        this.closeWindow();
                        return;
                    }
                }
                this.pO(cfx.evH.ordinal());
                this.Li();
                this.closeWindow();
                assert (false) : "Action : " + (Object)((Object)cfx2);
                return;
            }
        }
        this.pO(cfx.evH.ordinal());
        this.Li();
        this.closeWindow();
        assert (false) : "DuelMode : " + (Object)((Object)this.evX);
    }

    private void pO(int n) {
        ezo ezo2 = (ezo)this.MessageDelegator.h(33287, this.getGUID(), this.evY);
        ezo2.pv(this.ewa);
        ezo2.EQ(n);
        this.MessageDelegator.F(ezo2);
    }

    private void pP(int n) {
        ezr ezr2 = (ezr)this.MessageDelegator.h(33283, this.getGUID(), this.evY);
        ezr2.pw(this.ewa);
        ezr2.DR(n);
        ezr2.pQ(this.ewc);
        this.MessageDelegator.F(ezr2);
    }

    private void Li() {
        this.evV = b.ewo;
        this.evX = a.ewk;
        this.ewc = 0;
        this.ewb = -1;
        this.evY = null;
        this.ewd = null;
        this.ewe = -1;
        this.ewa = null;
        this.evZ = null;
        this.ewf = null;
        this.ewg = null;
    }

    private void closeWindow() {
        if (this.evW == null) {
            assert (false);
            return;
        }
        this.MessageDelegator.hd(this.evW.getGUID());
        this.evW = null;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 33289: {
                this.a((ezy)dxq2);
                break;
            }
            case 33282: {
                this.a((ezq)dxq2);
                break;
            }
            case 33286: {
                this.a((ezn)dxq2);
            }
        }
    }

    public boolean kH(ldv ldv2) {
        if (this.evV != b.ewu) {
            return false;
        }
        if (this.ewa == null) {
            return false;
        }
        if (this.evZ == null) {
            return false;
        }
        if (ldv2 == null) {
            return false;
        }
        return ldv2.equals(this.evZ) || ldv2.equals(this.ewa);
    }

    public void pQ(int n) {
        if (n > this.aNL()) {
            n = this.aNL();
        } else if (n < 0) {
            n = 0;
        }
        this.ewc = n;
    }

    public final int aNL() {
        return this.ewb;
    }

    public final int aNM() {
        return this.ewc;
    }

    public final String aNN() {
        return this.ewd;
    }

    public final int aNO() {
        return this.ewe;
    }

    public final a aNP() {
        return this.evX;
    }

    private void aNQ() {
        if (this.ewf != null) {
            assert (false) : "DuelArenaSpecialEffectGUID : " + this.ewf;
            return;
        }
        this.ewf = this.MessageDelegator.lL(lcr.qEa);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
        glh2.SpecialEffectType = cfy.evU;
        glh2.aUa = this.ewf;
        glh2.aZD = this.ewg;
        this.MessageDelegator.F(glh2);
    }

    private void aNR() {
        if (this.evV == b.ewu || this.evV == b.ewt) {
            if (this.ewf == null) {
                assert (false) : "DuelArenaSpecialEffectGUID : " + this.ewf;
                return;
            }
            glj glj2 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEa);
            glj2.aUa = this.ewf;
            glj2.jkV = 1;
            this.MessageDelegator.F(glj2);
            return;
        }
        assert (this.ewf == null);
    }
}

