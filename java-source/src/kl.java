/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  ha
 *  lqf
 */
public class kl
extends jk {
    @Override
    public void nU() {
        this.a(a.apY.toString().toLowerCase(), hc.aaP, lqf.scj, mhs.STRING);
        this.a(a.apZ.toString().toLowerCase(), hc.aaP, lqf.sck, mhs.STRING);
        this.a(a.aqa.toString().toLowerCase(), hc.aaP, lqf.scl, mhs.STRING);
        this.a(a.aqb.toString().toLowerCase(), hc.aaP, lqf.scm, mhs.STRING);
        this.a(a.aqc.toString().toLowerCase(), hc.aaP, lqf.scn, mhs.STRING);
        this.a(a.aqd.toString().toLowerCase(), hc.aaP, lqf.sco, mhs.STRING);
        this.a(a.aqe.toString().toLowerCase(), hc.aaP, lqf.scp, mhs.STRING, mhs.INTEGER);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bx(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        cia cia2 = lea.epN().hq(string);
        if (cia2 == null) {
            lfn.b(5, "SFConsoleCommandHandlerPerks", "handleCommand() Perk name '" + string + "' is invalid.");
            jj2.b(lqd.rXj.bD(a2.name().toLowerCase(), string), true);
            return;
        }
        switch (a2) {
            case apY: {
                this.q(cia2.aOL().ordinal(), 0);
                break;
            }
            case apZ: {
                this.q(cia2.aOL().ordinal(), 1);
                break;
            }
            case aqa: {
                this.q(cia2.aOL().ordinal(), 2);
                break;
            }
            case aqb: {
                this.q(cia2.aOL().ordinal(), 3);
                break;
            }
            case aqc: {
                this.q(cia2.aOL().ordinal(), 4);
                break;
            }
            case aqd: {
                this.q(cia2.aOL().ordinal(), 5);
                break;
            }
            case aqe: {
                this.a(jj2, cia2);
            }
        }
    }

    private void a(jj jj2, cia cia2) {
        if (!cia2.aON()) {
            jj2.b(lqd.rXj.bD(jj2.akV, cia2.aOL().name()), true);
            return;
        }
        cex cex2 = this.nW();
        if (cex2 == null) {
            jj2.b(lqd.rXl.bD(jj2.akV), true);
            return;
        }
        ha ha2 = cex2.mA();
        if (ha2 == null) {
            jj2.b(lqd.rXl.bD(jj2.akV), true);
            return;
        }
        ldv ldv2 = ha2.iG();
        if (ldv2 == null || ldv2.equals(ldv.rfd)) {
            jj2.b(lqd.rXm.bD(jj2.akV), true);
            return;
        }
        int n = ((mho)jj2.cA((int)1)).PC;
        enb enb2 = (enb)this.MessageDelegator.h(13931, this.getGUID(), ldv2);
        enb2.X(new int[]{cia2.aOL().ordinal()});
        enb2.gx(ha2.getGUID());
        enb2.Y(new int[]{n});
        this.MessageDelegator.F(enb2);
    }

    private void q(int n, int n2) {
        eel eel2 = (eel)this.MessageDelegator.h(12847, this.GUID, this.nW().getGUID());
        eel2.DV(n2);
        eel2.DW(n);
        this.MessageDelegator.F(eel2);
    }

    private a bx(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }
}

