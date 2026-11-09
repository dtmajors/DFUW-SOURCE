/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lqf
 */
public class ks
extends jk {
    @Override
    public void nU() {
        this.a(a.ars.toString().toLowerCase(), hc.aaP, lqf.sbZ, mhs.INTEGER);
        this.a(a.art.toString().toLowerCase(), hc.aaP, lqf.sca);
        this.a(a.aru.toString().toLowerCase(), hc.aaP, lqf.scb);
        this.a(a.arv.toString().toLowerCase(), hc.aaP, lqf.scc);
        this.a(a.arw.toString().toLowerCase(), hc.aaP, lqf.scd, mhs.BOOLEAN);
        this.a(a.arx.toString().toLowerCase(), hc.aaP, lqf.sce);
        this.a(a.ary.toString().toLowerCase(), hc.aaP, lqf.scf);
    }

    private a bF(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bF(jj2.akV);
        if (a2 == null) {
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case ars: {
                int n = ((mho)jj2.cA((int)0)).PC;
                if (n == 0) {
                    n = -1;
                }
                kqb kqb2 = (kqb)this.MessageDelegator.h(3844);
                kqb2.pVD = 1;
                kqb2.iyx = 1;
                kqb2.iye = n;
                kqb2.ts(this.getGUID());
                kqb2.jM(false);
                kqb2.wD(false);
                this.MessageDelegator.a(kqb2);
                jj2.nT();
                break;
            }
            case art: {
                kqb kqb3 = (kqb)this.MessageDelegator.h(3844);
                kqb3.pVD = 8;
                kqb3.iyx = 1;
                kqb3.ts(this.getGUID());
                kqb3.jM(false);
                kqb3.wD(false);
                this.MessageDelegator.a(kqb3);
                jj2.nT();
                break;
            }
            case aru: {
                kqb kqb4 = (kqb)this.MessageDelegator.h(3844);
                kqb4.pVD = 2;
                kqb4.iyx = 1;
                kqb4.ts(this.getGUID());
                kqb4.jM(false);
                kqb4.wD(false);
                this.MessageDelegator.a(kqb4);
                jj2.nT();
                break;
            }
            case arv: {
                kqb kqb5 = (kqb)this.MessageDelegator.h(3844);
                kqb5.pVD = 3;
                kqb5.iyx = 1;
                kqb5.ts(this.getGUID());
                kqb5.jM(false);
                kqb5.wD(false);
                this.MessageDelegator.a(kqb5);
                jj2.nT();
                break;
            }
            case arw: {
                boolean bl = ((mhl)jj2.cA((int)0)).Pp;
                kqb kqb6 = (kqb)this.MessageDelegator.h(3844);
                kqb6.pVD = 7;
                kqb6.iyx = 1;
                kqb6.iyf = bl;
                kqb6.ts(this.getGUID());
                kqb6.jM(false);
                kqb6.wD(false);
                this.MessageDelegator.a(kqb6);
                jj2.nT();
                break;
            }
            case arx: {
                kqb kqb7 = (kqb)this.MessageDelegator.h(3844);
                kqb7.pVD = 4;
                kqb7.iyx = 1;
                kqb7.ts(this.getGUID());
                kqb7.jM(false);
                kqb7.wD(false);
                this.MessageDelegator.a(kqb7);
                jj2.nT();
                break;
            }
            case ary: {
                kqb kqb8 = (kqb)this.MessageDelegator.h(3844);
                kqb8.pVD = 6;
                kqb8.iyx = 1;
                kqb8.ts(this.getGUID());
                kqb8.jM(false);
                kqb8.wD(false);
                this.MessageDelegator.a(kqb8);
                jj2.nT();
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }
}

