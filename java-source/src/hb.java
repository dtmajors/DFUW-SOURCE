/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 *  lcw
 */
public class hb {
    private final ha hF;
    aug[] aay = null;

    hb(ha ha2) {
        this.hF = ha2;
    }

    public aug[] lg() {
        return this.aay;
    }

    public void a(aug[] augArray) {
        this.aay = augArray;
    }

    void e(ehc ehc2) {
        switch (ehc2.bEz()) {
            case 2323: {
                this.a((ego)ehc2);
                break;
            }
            case 2334: {
                this.a((eha)ehc2);
                break;
            }
            default: {
                if (!this.hF.iY()) break;
                if (ehc2.bEz() == 2315) {
                    // empty if block
                }
                ldv ldv2 = null;
                ldv2 = lcw.qOS ? lcr.ak((ldv)lcr.qDy, (int)this.hF.jr()) : lcr.ak((ldv)lcr.qCM, (int)this.hF.jr());
                ehc2.on(ldv2);
                this.hF.getMessageDelegator().F(ehc2);
            }
        }
    }

    private void a(eha eha2, egz egz2) {
        egz2.ipK = eha2.ipK;
        egz2.Ri = eha2.Ri;
        egz2.ipL = eha2.ipL;
        egz2.ipM = eha2.ipM;
        egz2.ipN = eha2.ipN;
        egz2.ipO = eha2.ipO;
        egz2.ipP = eha2.ipP;
        egz2.ipQ = eha2.ipQ;
        egz2.ipR = eha2.ipR;
    }

    private void a(eha eha2) {
        if (eha2.ipS == aud.a.cav.ordinal()) {
            if (this.hF.jU().iC()) {
                egz egz2 = (egz)this.hF.getMessageDelegator().h(2315, this.hF.getGUID(), this.hF.jM());
                this.a(eha2, egz2);
                this.hF.getMessageDelegator().F(egz2);
            } else {
                this.hF.c(maf.NotPartyMember.bD(new Object[0]));
            }
        } else if (eha2.ipS == aud.a.cat.ordinal() || eha2.ipS == aud.a.cau.ordinal() || eha2.ipS == aud.a.caC.ordinal()) {
            if (!ldv.tU(this.hF.iG())) {
                this.hF.c(maf.NotClanMember.bD(new Object[0]));
            } else {
                egz egz3 = (egz)this.hF.getMessageDelegator().h(2315, this.hF.getGUID(), this.hF.iG());
                this.a(eha2, egz3);
                this.hF.getMessageDelegator().F(egz3);
            }
        }
    }

    private void a(ego ego2) {
        if (ego2.aO().ib() < 0 || ego2.aO().ib() > 1023) {
            lfn.b(4, this.getClass().getSimpleName(), "handleChatIgnoreRequestMessage(): Ignoring " + ego2 + " - not from a server");
            assert (false);
            return;
        }
        switch (ego2.ed) {
            case 0: {
                egp egp2 = (egp)this.hF.getMessageDelegator().h(2324, this.hF.getGUID(), ego2.aO());
                egp2.ipD = ego2.ed;
                egp2.ipC = this.aay;
                this.hF.getMessageDelegator().F(egp2);
                break;
            }
            case 1: {
                this.aay = ego2.ipC;
                break;
            }
            default: {
                assert (false) : "Unhandled SFChatIgnoreRequestMessage.RequestType";
                break;
            }
        }
    }
}

