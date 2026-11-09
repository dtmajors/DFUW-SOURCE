/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lqf
 */
public class km
extends jk {
    @Override
    public void nU() {
        this.a(a.aqh.toString().toLowerCase(), hc.aaP, lqf.sbQ, mhs.INTEGER);
        this.a(a.aqi.toString().toLowerCase(), hc.aaP, lqf.sbR, mhs.FLOAT);
        this.a(a.aqj.toString().toLowerCase(), hc.aaP, lqf.sbS);
        this.a(a.aqk.toString().toLowerCase(), hc.aaP, lqf.sbT);
        this.a(a.aql.toString().toLowerCase(), hc.aaP, lqf.sbU, mhs.BOOLEAN);
        this.a(a.aqm.toString().toLowerCase(), hc.aaP, lqf.sbV, mhs.BOOLEAN);
        this.a(a.aqn.toString().toLowerCase(), hc.aaP, lqf.sbW, mhs.BOOLEAN);
        this.a(a.aqo.toString().toLowerCase(), hc.aaP, lqf.sbX, mhs.FLOAT);
        this.a(a.aqp.toString().toLowerCase(), hc.aaP, lqf.sbY, mhs.FLOAT);
    }

    private a by(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.by(jj2.akV);
        if (a2 == null) {
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case aqh: {
                int n = ((mho)jj2.cA((int)0)).PC;
                kms kms2 = (kms)this.MessageDelegator.h(3331);
                kms2.pOz = 4096;
                kms2.pOJ = n;
                kms2.hC(this.getGUID());
                kms2.ts(this.getGUID());
                kms2.jM(false);
                kms2.wD(false);
                this.MessageDelegator.a(kms2);
                jj2.nT();
                break;
            }
            case aqi: {
                float f = ((mhn)jj2.cA((int)0)).Pz;
                kms kms3 = (kms)this.MessageDelegator.h(3331);
                kms3.pOz = 1;
                kms3.gVx = new ljq(0.0f, f, 0.0f);
                kms3.hC(this.getGUID());
                kms3.ts(this.getGUID());
                kms3.jM(false);
                kms3.wD(false);
                this.MessageDelegator.a(kms3);
                jj2.nT();
                break;
            }
            case aqj: {
                kqj kqj2 = (kqj)this.MessageDelegator.h(3843);
                kqj2.pWc = 1;
                kqj2.ts(this.getGUID());
                kqj2.jM(false);
                kqj2.wD(false);
                this.MessageDelegator.a(kqj2);
                jj2.nT();
                break;
            }
            case aqk: {
                kqj kqj3 = (kqj)this.MessageDelegator.h(3843);
                kqj3.pWc = 2;
                kqj3.ts(this.getGUID());
                kqj3.jM(false);
                kqj3.wD(false);
                this.MessageDelegator.a(kqj3);
                jj2.nT();
                break;
            }
            case aql: {
                boolean bl = ((mhl)jj2.cA((int)0)).Pp;
                kms kms4 = (kms)this.MessageDelegator.h(3331);
                kms4.pOz = 512;
                kms4.pOD = bl;
                kms4.hC(this.getGUID());
                kms4.ts(this.getGUID());
                kms4.jM(false);
                kms4.wD(false);
                this.MessageDelegator.a(kms4);
                jj2.nT();
                break;
            }
            case aqm: {
                boolean bl = ((mhl)jj2.cA((int)0)).Pp;
                kms kms5 = (kms)this.MessageDelegator.h(3331);
                kms5.pOz = 1024;
                kms5.pOE = bl;
                kms5.hC(this.getGUID());
                kms5.ts(this.getGUID());
                kms5.jM(false);
                kms5.wD(false);
                this.MessageDelegator.a(kms5);
                jj2.nT();
                break;
            }
            case aqn: {
                boolean bl = ((mhl)jj2.cA((int)0)).Pp;
                kms kms6 = (kms)this.MessageDelegator.h(3331);
                kms6.pOz = 16;
                kms6.pOF = bl;
                kms6.hC(this.getGUID());
                kms6.ts(this.getGUID());
                kms6.jM(false);
                kms6.wD(false);
                this.MessageDelegator.a(kms6);
                jj2.nT();
                break;
            }
            case aqo: {
                float f = ((mhn)jj2.cA((int)0)).Pz;
                kms kms7 = (kms)this.MessageDelegator.h(3331);
                kms7.pOz = 16384;
                kms7.pOL = f;
                kms7.hC(this.getGUID());
                kms7.ts(this.getGUID());
                kms7.jM(false);
                kms7.wD(false);
                this.MessageDelegator.a(kms7);
                jj2.nT();
                break;
            }
            case aqp: {
                float f = ((mhn)jj2.cA((int)0)).Pz;
                kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
                kmw2.ts(this.GUID);
                kmw2.hC(new ldv(0L));
                kmw2.pPe = 131072;
                kmw2.pPk = f;
                this.MessageDelegator.a(kmw2);
                jj2.nT();
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }
}

