/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lqf
 */
public class jy
extends jk {
    private boolean amv = false;
    private ldv amw = null;
    private int amx = 0;
    private String amy = "";
    private int amz = 0;
    private boolean amA = false;
    private boolean amB = false;
    private int amC = 0;

    @Override
    public void nU() {
        this.a(a.amE.toString().toLowerCase(), hc.aaP, lqf.rZx);
        this.a(a.amF.toString().toLowerCase(), hc.aaP, lqf.rZy, mhs.STRING);
        this.a(a.amG.toString().toLowerCase(), hc.aaP, lqf.rZz, mhs.INTEGER);
        this.a(a.amH.toString().toLowerCase(), hc.aaP, lqf.rZA, mhs.INTEGER);
        this.a(a.amI.toString().toLowerCase(), hc.aaP, lqf.rZB, mhs.INTEGER);
        this.a(a.amJ.toString().toLowerCase(), hc.aaP, true, new mhs[]{mhs.BOOLEAN}, lqf.rZC);
        this.a(a.amK.toString().toLowerCase(), hc.aaP, true, new mhs[]{mhs.BOOLEAN}, lqf.rZD);
        this.a(a.amL.toString().toLowerCase(), hc.aaP, lqf.rZE, mhs.INTEGER);
        this.a(a.amM.toString().toLowerCase(), hc.aaP, lqf.rZF, mhs.INTEGER);
        this.a(a.amN.toString().toLowerCase(), hc.aaP, lqf.rZG, mhs.INTEGER);
        this.a(a.amO.toString().toLowerCase(), hc.aaP, lqf.rZH);
        this.a(a.amP.toString().toLowerCase(), hc.aaP, lqf.rZI);
        this.a(a.amQ.toString().toLowerCase(), hc.aaP, lqf.rZJ, mhs.STRING);
        this.a(a.amR.toString().toLowerCase(), hc.aaP, lqf.rZK, mhs.STRING);
        this.a(a.amS.toString().toLowerCase(), hc.aaP, lqf.rZL, mhs.INTEGER);
        this.a(a.amT.toString().toLowerCase(), hc.aaP, lqf.rZM, mhs.INTEGER);
        this.a(a.amU.toString().toLowerCase(), hc.aaP, lqf.rZM, mhs.INTEGER);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bk(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case amE: {
                this.y(jj2);
                break;
            }
            case amF: {
                this.z(jj2);
                break;
            }
            case amG: {
                this.A(jj2);
                break;
            }
            case amH: {
                this.B(jj2);
                break;
            }
            case amI: {
                this.C(jj2);
                break;
            }
            case amJ: {
                this.D(jj2);
                break;
            }
            case amK: {
                this.E(jj2);
                break;
            }
            case amL: {
                this.F(jj2);
                break;
            }
            case amM: {
                this.G(jj2);
                break;
            }
            case amN: {
                this.H(jj2);
                break;
            }
            case amO: {
                this.I(jj2);
                break;
            }
            case amP: {
                this.J(jj2);
                break;
            }
            case amQ: {
                this.a(jj2, true);
                break;
            }
            case amR: {
                this.a(jj2, false);
                break;
            }
            case amS: {
                this.K(jj2);
                break;
            }
            case amT: {
                this.L(jj2);
                break;
            }
            case amU: {
                this.M(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private a bk(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void y(jj jj2) {
        int n = this.amx;
        String string = this.amy;
        int n2 = this.amz;
        this.amx = 0;
        this.amy = "";
        this.amz = 0;
        this.a(n, string, n2);
        jj2.nT();
    }

    private void z(jj jj2) {
        int n = this.amx;
        String string = this.amy;
        int n2 = this.amz;
        this.amx = -1;
        this.amy = ((mhr)jj2.cA((int)0)).Value;
        this.amz = 1;
        if (this.amy.equals(dsv.byP().iU())) {
            this.amx = 0;
            this.amy = "";
            this.amz = 0;
        }
        this.a(n, string, n2);
        jj2.nT();
    }

    private void A(jj jj2) {
        int n = this.amx;
        String string = this.amy;
        int n2 = this.amz;
        this.amx = ((mho)jj2.cA((int)0)).PC;
        this.amy = "";
        this.amz = this.amx == 0 ? 0 : 1;
        this.a(n, string, n2);
        jj2.nT();
    }

    private void B(jj jj2) {
        int n = this.amx;
        String string = this.amy;
        int n2 = this.amz;
        this.amx = ((mho)jj2.cA((int)0)).PC;
        this.amy = "";
        this.amz = 3;
        this.a(n, string, n2);
        jj2.nT();
    }

    private void C(jj jj2) {
        int n = this.amx;
        String string = this.amy;
        int n2 = this.amz;
        this.amx = ((mho)jj2.cA((int)0)).PC;
        this.amy = "";
        this.amz = 2;
        this.a(n, string, n2);
        jj2.nT();
    }

    private void D(jj jj2) {
        if (this.amv) {
            jj2.b(lqd.rXe.bD(new Object[0]), true);
            return;
        }
        if (jj2.getArgCount() > 0) {
            this.amA = ((mhl)jj2.cA((int)0)).Pp;
        } else {
            boolean bl = this.amA = !this.amA;
        }
        if (this.amx == 0) {
            this.j(0, this.amA);
        } else {
            if (!this.b(jj2)) {
                return;
            }
            this.a(this.amx, this.amy, this.amz, this.amA);
        }
        jj2.nT();
    }

    private void E(jj jj2) {
        if (jj2.getArgCount() > 0) {
            this.amB = ((mhl)jj2.cA((int)0)).Pp;
        } else {
            boolean bl = this.amB = !this.amB;
        }
        if (this.amA) {
            if (this.amx == 0) {
                kqf kqf2 = (kqf)this.MessageDelegator.h(3841);
                kqf2.iyu = 2;
                kqf2.iyw = this.amB;
                kqf2.ts(this.getGUID());
                kqf2.jM(false);
                kqf2.wD(false);
                this.MessageDelegator.a(kqf2);
            } else {
                if (!this.b(jj2)) {
                    return;
                }
                erk erk2 = (erk)this.MessageDelegator.h(16656, this.GUID, this.nW().getGUID());
                erk2.iyu = 2;
                erk2.iyw = this.amB;
                erk2.di = this.amx;
                erk2.iyA = this.amy;
                erk2.fV = this.amz;
                this.MessageDelegator.F(erk2);
            }
        }
        jj2.nT();
    }

    private void F(jj jj2) {
        this.amC = ((mho)jj2.cA((int)0)).PC;
        if (!this.b(jj2)) {
            return;
        }
        if (this.amA) {
            if (this.amx == 0) {
                kqf kqf2 = (kqf)this.MessageDelegator.h(3841);
                kqf2.iyu = 4;
                kqf2.iyx = this.amC;
                kqf2.ts(this.getGUID());
                kqf2.jM(false);
                kqf2.wD(false);
                this.MessageDelegator.a(kqf2);
            } else {
                erk erk2 = (erk)this.MessageDelegator.h(16656, this.GUID, this.nW().getGUID());
                erk2.iyu = 4;
                erk2.iyx = this.amC;
                erk2.di = this.amx;
                erk2.iyA = this.amy;
                erk2.fV = this.amz;
                this.MessageDelegator.F(erk2);
            }
        }
        jj2.nT();
    }

    private void G(jj jj2) {
        if (this.amA) {
            int n = ((mho)jj2.cA((int)0)).PC;
            if (this.amx == 0) {
                kqf kqf2 = (kqf)this.MessageDelegator.h(3841);
                kqf2.iyu = 8;
                kqf2.iyy = n;
                kqf2.ts(this.getGUID());
                kqf2.jM(false);
                kqf2.wD(false);
                this.MessageDelegator.a(kqf2);
            } else {
                if (!this.b(jj2)) {
                    return;
                }
                erk erk2 = (erk)this.MessageDelegator.h(16656, this.GUID, this.nW().getGUID());
                erk2.iyu = 8;
                erk2.iyy = n;
                erk2.di = this.amx;
                erk2.iyA = this.amy;
                erk2.fV = this.amz;
                this.MessageDelegator.F(erk2);
            }
        }
        jj2.nT();
    }

    private void H(jj jj2) {
        if (this.amA) {
            if (this.amx == 0) {
                kqf kqf2 = (kqf)this.MessageDelegator.h(3841);
                kqf2.iyu = 16;
                kqf2.iyz = ((mho)jj2.cA((int)0)).PC;
                kqf2.ts(this.getGUID());
                kqf2.jM(false);
                kqf2.wD(false);
                this.MessageDelegator.a(kqf2);
            } else {
                if (!this.b(jj2)) {
                    return;
                }
                erk erk2 = (erk)this.MessageDelegator.h(16656, this.GUID, this.nW().getGUID());
                erk2.iyu = 16;
                erk2.iyz = ((mho)jj2.cA((int)0)).PC;
                erk2.di = this.amx;
                erk2.iyA = this.amy;
                erk2.fV = this.amz;
                this.MessageDelegator.F(erk2);
            }
        }
        jj2.nT();
    }

    private void I(jj jj2) {
        if (this.amA) {
            if (this.amx == 0) {
                kqf kqf2 = (kqf)this.MessageDelegator.h(3841);
                kqf2.iyu = 32;
                kqf2.ts(this.getGUID());
                kqf2.jM(false);
                kqf2.wD(false);
                this.MessageDelegator.a(kqf2);
            } else {
                if (!this.b(jj2)) {
                    return;
                }
                erk erk2 = (erk)this.MessageDelegator.h(16656, this.GUID, this.nW().getGUID());
                erk2.iyu = 32;
                erk2.di = this.amx;
                erk2.iyA = this.amy;
                erk2.fV = this.amz;
                this.MessageDelegator.F(erk2);
            }
        }
        jj2.nT();
    }

    private void J(jj jj2) {
        if (this.amA) {
            if (this.amx == 0) {
                kqf kqf2 = (kqf)this.MessageDelegator.h(3841);
                kqf2.iyu = 64;
                kqf2.ts(this.getGUID());
                kqf2.jM(false);
                kqf2.wD(false);
                this.MessageDelegator.a(kqf2);
            } else {
                erk erk2 = (erk)this.MessageDelegator.h(16656, this.GUID, this.nW().getGUID());
                erk2.iyu = 64;
                erk2.di = this.amx;
                erk2.iyA = this.amy;
                erk2.fV = this.amz;
                this.MessageDelegator.F(erk2);
            }
        }
        jj2.nT();
    }

    private void a(jj jj2, boolean bl) {
        if (this.amA) {
            kqf kqf2 = (kqf)this.MessageDelegator.h(3841);
            kqf2.iyu = bl ? 512 : 1024;
            kqf2.Filename = ((mhr)jj2.cA((int)0)).Value;
            kqf2.ts(this.getGUID());
            kqf2.jM(false);
            kqf2.wD(false);
            this.MessageDelegator.a(kqf2);
        }
        jj2.nT();
    }

    private void a(int n, String string, int n2) {
        if (n == this.amx && string.equals(this.amy)) {
            return;
        }
        if (this.amA) {
            if (n == 0) {
                this.j(0, false);
                this.a(this.amx, this.amy, this.amz, true);
            } else if (this.amx == 0) {
                this.a(n, string, n2, false);
                this.j(0, true);
            } else {
                this.a(n, string, n2, false);
                this.a(this.amx, this.amy, this.amz, true);
            }
        } else if (n == 0) {
            this.j(0, false);
        } else if (this.amx == 0) {
            this.a(n, string, n2, false);
        } else {
            this.a(n, string, n2, false);
        }
    }

    private void j(int n, boolean bl) {
        kqf kqf2 = (kqf)this.MessageDelegator.h(3841);
        kqf2.iyu = 385;
        kqf2.iyv = bl;
        kqf2.pVQ = false;
        kqf2.pVR = bl;
        kqf2.ts(this.getGUID());
        kqf2.jM(false);
        kqf2.wD(false);
        this.MessageDelegator.a(kqf2);
    }

    private void a(int n, String string, int n2, boolean bl) {
        if (this.nW() == null) {
            return;
        }
        erk erk2 = (erk)this.MessageDelegator.h(16656, this.GUID, this.nW().getGUID());
        erk2.iyu = 3;
        erk2.iyv = bl;
        erk2.iyw = !this.amB;
        erk2.di = n;
        erk2.iyA = string;
        erk2.fV = n2;
        this.MessageDelegator.F(erk2);
        this.W(bl);
    }

    private void W(boolean bl) {
        kqe kqe2 = (kqe)this.MessageDelegator.h(3848);
        kqe2.iyu = 1;
        kqe2.imB = bl;
        kqe2.ts(this.getGUID());
        kqe2.jM(false);
        kqe2.wD(false);
        this.MessageDelegator.a(kqe2);
    }

    private void K(jj jj2) {
        mho mho2 = (mho)jj2.cA(0);
        kqb kqb2 = (kqb)this.MessageDelegator.h(3844);
        kqb2.pVD = mho2.PC;
        kqb2.iye = 0;
        kqb2.iyf = true;
        kqb2.iyx = 1;
        kqb2.ec = this.getGUID();
        kqb2.iBr = false;
        this.MessageDelegator.a(kqb2);
    }

    private void L(jj jj2) {
        mho mho2 = (mho)jj2.cA(0);
        ksi ksi2 = (ksi)this.MessageDelegator.j(30);
        ksi2.ts(this.GUID);
        ksi2.pZw = mho2.PC;
        this.MessageDelegator.a(ksi2);
    }

    private void M(jj jj2) {
        mho mho2 = (mho)jj2.cA(0);
        int[] nArray = new int[0x100000 * mho2.PC / 4];
        nArray = null;
        Runtime.getRuntime().gc();
    }
}

