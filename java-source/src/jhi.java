/*
 * Decompiled with CFR.
 */
public abstract class jhi
extends jhj {
    private ipx lUu;
    private ipx neB;
    private ipx neC;
    private ipx neD;
    private ist neE;
    private ist neF;
    private boolean lCf;
    private ipx mct;
    private iso neG;
    private iso neH;
    private ipf neI;
    private iox myV;
    private ipf neJ;
    private ipf neK;
    private ipf neL;
    private ipf neM;
    private ipf neN;
    private ipf neO;
    private ipf neP;
    private ipf neQ;
    private ipx neR;
    private ipf neS;
    private ipx neT;
    private boolean neU;
    private lie neV;

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.dFZ()) {
            this.dFI();
        }
    }

    @Override
    public boolean getSelected() {
        return this.lCf;
    }

    @Override
    public void setSelected(boolean bl) {
        if (bl == this.lCf) {
            return;
        }
        this.lCf = bl;
        this.lUu.setVisible(bl);
        this.neB.setVisible(bl);
        this.myV.hX(bl);
        jhk jhk2 = this.dGg();
        if (jhk2 != null) {
            jhk2.a(this);
        }
    }

    public iso dFV() {
        return this.neG;
    }

    public iso dFW() {
        return this.neH;
    }

    public ist dFX() {
        return this.neE;
    }

    public ist dFY() {
        return this.neF;
    }

    public boolean dFZ() {
        return this.neU;
    }

    public void tv(boolean bl) {
        if (this.neE == null) {
            return;
        }
        int n = this.dFD();
        int n2 = this.dFE();
        this.neE.setText("" + Math.min(n, n2));
        boolean bl2 = n >= n2;
        this.neE.Rk(!bl2 ? 0xD0D0D0 : 12357465);
        if (bl && !this.dFZ() && !bl2) {
            this.dFH();
        }
    }

    @Override
    public void kh(float f2) {
        super.kh(f2);
        if (this.neJ != null) {
            this.neJ.hz(f2);
        }
        if (this.neK != null) {
            this.neK.hz(f2);
        }
        if (this.neL != null) {
            this.neL.hz(f2);
        }
        if (this.lUu != null) {
            this.lUu.hz(f2);
        }
        if (this.neM != null) {
            this.neM.hz(f2);
        }
        if (this.neN != null) {
            this.neN.hz(f2);
        }
        if (this.neO != null) {
            this.neO.hz(f2);
        }
        if (this.neP != null) {
            this.neP.hz(f2);
        }
        if (this.neQ != null) {
            this.neQ.hz(f2);
        }
    }

    public jhi dFQ() {
        return null;
    }

    public boolean dFR() {
        return false;
    }

    public ipx dGa() {
        return this.neT;
    }

    public ipf dFN() {
        iut iut2 = new iut(this){
            final /* synthetic */ jhi neW;
            {
                this.neW = jhi2;
            }

            public void pn(boolean bl) {
                this.neW.setSelected(bl);
            }
        };
        this.neJ = new ipk(0x161616);
        iut2.c(this.neJ, 0);
        this.myV = iut2;
        return iut2;
    }

    public ipf dFO() {
        iso iso2;
        ipx ipx2;
        this.neR = ipx2 = ipx.h(new ipf[0]);
        this.neK = new ipk(0x161616);
        ipx2.W(this.neK);
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx3);
        ipx ipx4 = new ipx(this, new iqu(36, 35)){
            final /* synthetic */ jhi neW;
            {
                this.neW = jhi2;
                super(iqz2);
            }

            public boolean du(int n, int n2) {
                return true;
            }

            public boolean dx(int n, int n2) {
                return this.neW.dFR();
            }
        };
        ipx3.W(ipx4);
        this.g(ipx4);
        this.neN = new ipk(0x2F2F2F, 1, 29);
        ipx3.W(ipx.d(this.neN));
        ipx3.W(ipx.a(8, 1, new ipf[0]));
        this.neG = iso2 = new iso();
        iso2.a(isf.mwN, 12);
        iso2.Rk(0xD0D0D0);
        iso2.o(this.dFC());
        iso2.setWidth(199);
        iso2.a(isu.mxP);
        ipx3.W(ipx.a(199, 35, ipx.d(iso2)));
        ipx3.W(ipx.a(8, 1, new ipf[0]));
        this.neO = new ipk(0x2F2F2F, 1, 29);
        ipx3.W(ipx.d(this.neO));
        ipx ipx5 = ipx.h(new ipf[0]);
        ipx3.W(ipx5);
        ipx ipx6 = ipx.a(79, 35, new ipf[0]);
        ipx5.W(ipx6);
        this.b(ipx6);
        ipx6.W(this.daL());
        ipx5.W(this.cVt());
        return ipx2;
    }

    public void b(ipx ipx2) {
        this.neT = ipx.d(this.dGf());
        ipx2.W(this.neT);
    }

    public ipf dGb() {
        iso iso2;
        ipx ipx2 = ipx.h(new ipf[0]);
        this.neL = new ipk(0x161616);
        ipx2.W(this.neL);
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx3);
        int n = 33;
        ipf ipf2 = this.UF(n);
        if (ipf2 != null) {
            ipx3.W(ipf2);
            this.neP = new ipk(0x2F2F2F, 1, 1);
            ipx3.W(ipx.j(ipx.a(1, 7, new ipf[0]), ipx.c(this.neP), ipx.a(1, 7, new ipf[0])));
        }
        this.neH = iso2 = new iso();
        iso2.a(isf.mwN, 12);
        iso2.Rk(0xABABAB);
        int n2 = 316 - (ipf2 != null ? n + 1 : 0);
        iso2.setWidth(n2);
        iso2.a(isu.mxP);
        iso2.setText(this.dFF());
        ipx3.W(ipx.c(8, 8, 8, 8, iso2));
        return ipx2;
    }

    public ipf dGc() {
        ipf ipf2 = this.dFG();
        if (ipf2 == null) {
            return null;
        }
        ipx ipx2 = ipx.h(new ipf[0]);
        this.neM = new ipk(0x161616, 263, 1);
        ipx2.W(this.neM);
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx3);
        int n = 33;
        ipf ipf3 = this.UG(n);
        if (ipf3 != null) {
            ipx3.W(ipf3);
            this.neQ = new ipk(0x2F2F2F, 1, 1);
            ipx3.W(ipx.j(ipx.a(1, 7, new ipf[0]), ipx.c(this.neQ), ipx.a(1, 7, new ipf[0])));
        }
        ipx3.W(ipx.c(8, 8, 8, 8, ipf2));
        return ipx2;
    }

    public abstract void g(iph var1);

    public abstract loz dFC();

    public abstract int dFD();

    public abstract int dFE();

    public abstract ipf UF(int var1);

    public abstract String dFF();

    public abstract ipf UG(int var1);

    public abstract ipf dFG();

    @Override
    public void cND() {
        super.cND();
        this.mct.setVisible(this.dkb() && this.dFM());
        this.dFT();
    }

    public void dFT() {
        this.neG.Rk(this.dkb() ? 12357465 : 0xD0D0D0);
    }

    @Override
    public void b(jnz jnz2, jnz jnz3) {
        boolean bl;
        super.b(jnz2, jnz3);
        boolean bl2 = bl = jnz3 != jnz.nFE;
        if (this.neI != null) {
            this.neI.setVisible(bl);
        }
        ((iqu)this.neC.djQ()).setWidth(bl ? 18 : 2);
        this.pack();
    }

    public void a(ipx ipx2) {
        ipx2.W(new iwi(this){
            final /* synthetic */ jhi neW;
            {
                this.neW = jhi2;
            }

            public void cLq() {
                this.neW.cGR();
            }
        });
    }

    @Override
    public ifg dy(int n, int n2) {
        ioa ioa2 = this.dGd();
        return ioa2 != null ? ioa.a(n, n2, ioa2) : null;
    }

    public ioa dGd() {
        jhi jhi2 = this.dFQ();
        return jhi2 != null ? new jhq(jhi2, this) : null;
    }

    public void dFH() {
        if (this.djE() == null) {
            return;
        }
        this.neU = true;
        ipb ipb2 = new ipb("feat_tracker_progress_gradient");
        this.neS = ipb2;
        ipb2.hz(0.0f);
        this.neR.c(ipb2, 1);
        this.neV = new lie(this, 0.1, true){
            final /* synthetic */ jhi neW;
            {
                this.neW = jhi2;
                super(d2, bl);
            }

            public void dh(double d2) {
                this.neW.dy(d2);
            }
        };
        this.neV.e(this.djE().getMessageDelegator());
    }

    public void dy(double d2) {
        if (d2 < 0.5) {
            float f2 = (float)(1.0 * (d2 / 0.5));
            this.neS.hz(f2);
        } else if (d2 < 1.0) {
            float f3 = 1.0f;
            this.neS.hz(f3);
        } else {
            float f4 = (float)(1.0 - 1.0 * ((d2 - 1.0) / 0.5));
            this.neS.hz(f4);
        }
        if (d2 >= 1.5) {
            this.dFI();
        }
    }

    public void dFI() {
        this.neU = false;
        this.neS.removeFromParent();
        this.neS = null;
        this.neV.stop();
        this.neV = null;
    }

    protected void dFU() {
        int n = 18;
        this.a(iqo.dmT());
        this.neI = this.dFN();
        this.neI.setVisible(hso.cxK().cxN() != jnz.nFE);
        this.W(ipx.l(this.neI, ipx.a(2, 1, new ipf[0]), this.dFO()));
        this.neB = ipx.l(new ipf[0]);
        this.neB.setVisible(false);
        this.W(this.neB);
        this.neC = ipx.a(n, 1, new ipf[0]);
        this.neB.W(this.neC);
        this.neD = ipx.j(new ipf[0]);
        this.neB.W(this.neD);
        this.neD.W(ipx.a(0, 2, new ipf[0]));
        this.neD.W(this.dGb());
        ipf ipf2 = this.dGc();
        if (ipf2 != null) {
            this.neD.W(ipx.a(0, 2, new ipf[0]));
            this.neD.W(ipf2);
        }
        this.W(ipx.a(1, 4, new ipf[0]));
    }

    protected ipx dGe() {
        return this.neD;
    }

    private ipf cVt() {
        this.lUu = ipx.j(ipx.c(new ipf[0]), ipx.d(ipx.c(0, 6, new ipb("IconArrowBitmap"))));
        this.lUu.setVisible(false);
        this.lUu.rF(false);
        return this.lUu;
    }

    private ipf dGf() {
        ist ist2;
        ipx ipx2 = ipx.l(new ipf[0]);
        this.neE = new ist();
        this.neE.a(isf.mwN, 12);
        this.neE.Rk(0x4F4F4F);
        this.tv(false);
        ipx2.W(this.neE);
        this.neF = ist2 = new ist();
        ist2.a(isf.mwN, 12);
        ist2.Rk(12357465);
        ist2.setText("/" + this.dFE());
        ipx2.W(ist2);
        return ipx2;
    }

    private ipf daL() {
        this.mct = ipx.h(new ipf[0]);
        this.mct.setVisible(false);
        this.mct.W(ipx.l(ipx.c(new ipf[0]), new ipb("feat_tracker_clear_bg")));
        ipx ipx2 = ipx.l(ipx.c(new ipf[0]));
        this.mct.W(ipx2);
        ipx ipx3 = ipx.j(new ipf[0]);
        this.a(ipx3);
        ipx2.W(ipx.d(ipx3));
        return this.mct;
    }

    public /* synthetic */ Object clone() {
        return this.dFQ();
    }
}

