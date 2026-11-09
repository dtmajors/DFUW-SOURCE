/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  dta
 *  hvj
 *  lqf
 */
public class ju
extends jk {
    hvj alV = null;
    dsu alW = null;

    @Override
    public void nU() {
        this.a(a.alY.toString().toLowerCase(), hc.aaP, lqf.rYx, mhs.INTEGER, mhs.INTEGER, mhs.STRING);
        this.a(a.alZ.toString().toLowerCase(), hc.aaP, lqf.rYy, mhs.INTEGER, mhs.INTEGER, mhs.STRING);
        this.a(a.ama.toString().toLowerCase(), hc.aaP, lqf.rYz, mhs.BOOLEAN);
        this.a(a.amb.toString().toLowerCase(), hc.aaP, lqf.rYA, mhs.BOOLEAN);
        this.a(a.amc.toString().toLowerCase(), hc.aaP, lqf.rYB, mhs.BOOLEAN);
        this.a(a.amd.toString().toLowerCase(), hc.aaP, lqf.rYB, mhs.INTEGER);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bi(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case alY: {
                this.o(jj2);
                break;
            }
            case alZ: {
                this.p(jj2);
                break;
            }
            case ama: {
                this.n(jj2);
                break;
            }
            case amb: {
                this.q(jj2);
                break;
            }
            case amc: {
                this.r(jj2);
                break;
            }
            case amd: {
                this.s(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private a bi(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void n(jj jj2) {
        boolean bl = ((mhl)jj2.cA((int)0)).Pp;
        for (dta dta2 : this.MessageDelegator.bzx().bzt().am().values()) {
            if (dta2.bzz() != 0) continue;
            for (amf amf2 : dta2.bzr()) {
                if (!(amf2 instanceof cew)) continue;
                cew cew2 = (cew)amf2;
                cew2.fR(bl);
            }
        }
    }

    private void o(jj jj2) {
        jj2.nT();
    }

    private void p(jj jj2) {
        jj2.nT();
    }

    private void q(jj jj2) {
        boolean bl = ((mhl)jj2.cA((int)0)).Pp;
        if (hyw.cGt() != bl) {
            hyw.pj(bl);
            jj2.b(lqd.rXs.bD(jj2.akV, Boolean.toString(bl)), false);
        } else {
            jj2.b(lqd.rXr.bD(jj2.akV, Boolean.toString(bl)), false);
        }
    }

    private void r(jj jj2) {
        boolean bl = ((mhl)jj2.cA((int)0)).Pp;
        if (hyw.cGu() != bl) {
            hyw.pk(bl);
            jj2.b(lqd.rXs.bD(jj2.akV, Boolean.toString(bl)), false);
        } else {
            jj2.b(lqd.rXr.bD(jj2.akV, Boolean.toString(bl)), false);
        }
    }

    private void s(jj jj2) {
        hso.cxK().cxP().cyJ().cIo().Eh(((mho)jj2.cA((int)0)).PC);
    }
}

