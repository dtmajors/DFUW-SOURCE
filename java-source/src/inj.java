/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  lcw
 */
import java.util.List;

public class inj
extends iud
implements ims {
    private static final int mmo = 32;
    private static ipe mmp = new ipe(0.2f, 0.2f, 0.2f, 1.0f, 60.0f, 60.0f, 60.0f, 0.0f);
    private ilx mkK;
    private imj mmq = imj.mjw;
    private hwo mmr;
    private float mms = 0.0f;
    private imu mmt;
    private imv mmu;
    private ipt mmv;
    private ipj mmw;
    private ipj mmx;
    private ink mmy;
    private ink mmz;
    private ipk mmA;
    private ipb mmB;
    private iso mmC;
    private ipk mmD;

    public inj(ilx ilx2) {
        this.mkK = ilx2;
        this.mmt = new imu(this.mkK);
        this.mmu = new imv(this);
        if (ilx2.cBu() != null) {
            this.mmr = new hwo(ilx2.cBu());
        }
        this.drt().qP(ilx2.cCU());
        this.cjT();
        this.cHb();
        if (this.mkK.ddU()) {
            this.drs().dlL().setColor(6503204);
        }
    }

    @Override
    public ilx dey() {
        return this.mkK;
    }

    @Override
    public itb dgM() {
        return new ita(isr.eN(0, lcw.emW() ? 12 : 24), 0, false);
    }

    public float cBk() {
        return this.mms;
    }

    public void setProgress(float f) {
        if ((f = lew.E(0.0f, f, 1.0f)) == this.mms) {
            return;
        }
        this.mms = f;
        if (f > 0.0f) {
            if (this.mmD == null) {
                this.mmD = new ipk(0xABABAB);
                this.mmD.hz(0.5f);
                this.W(this.mmD);
            }
            this.pack();
        } else if (this.mmD != null) {
            this.mmD.removeFromParent();
            this.mmD = null;
        }
    }

    @Override
    public boolean dez() {
        return this.mkK.ddH() ? super.dez() : false;
    }

    public void b(imm imm2) {
        float f;
        ilt ilt2;
        ilu ilu2 = this.mkK.ddr();
        this.mmq = imm2.mjN;
        this.drs().setSize(this.mmq.getFrameSize(), this.mmq.getFrameSize());
        this.drt().setSize(this.mmq.getSize(), this.mmq.getSize());
        if (imm2.mjS) {
            if (this.mmv == null) {
                this.mmv = new ipt(ilu2.color);
                this.W(this.mmv);
            }
            this.dgN();
        } else {
            if (this.mmv != null) {
                this.mmv.removeFromParent();
                this.mmv = null;
            }
            this.dqE().Rk(0xABABAB);
        }
        this.dgS();
        if (imm2.mjU) {
            if (this.mmy == null) {
                this.mmy = new ink();
                this.W(this.mmy);
            }
            this.mmy.dan().zY(this.mmq.dee());
            this.dgP();
        } else if (this.mmy != null) {
            this.mmy.removeFromParent();
            this.mmy = null;
        }
        this.dgT();
        boolean bl = true;
        if (imm2.mjT && this.mkK.ddQ() && (ilt2 = this.mkK.ddS()) != null && (f = jbg.W(ilt2.cBu())) > 0.0f) {
            bl = false;
            if (this.mmA == null) {
                this.mmA = new ipk(0xC33636);
                this.W(this.mmA);
            }
        }
        if (bl && this.mmA != null) {
            this.mmA.removeFromParent();
            this.mmA = null;
        }
        this.dqE().zY(imm2.mjO.bll());
        this.dqE().setSize(imm2.mjO.deh(), imm2.mjO.dei());
        if (imm2.mjR) {
            if (this.mmB == null) {
                this.mmB = new ipb("/dfdata/texture/gui/j2f/inventory/main/custom_tag_arrow.png");
                this.W(this.mmB);
                this.mmC = new iso(isf.mwM, imm2.mjO.bll(), 0xABABAB);
                this.mmC.a((iqz)null);
                this.mmC.sv(false);
                this.mmC.a(isu.mxO);
                this.mmC.a(isx.myo);
                this.mmC.a(ite.myF);
                this.W(this.mmC);
            }
            this.mmC.zY(imm2.mjO.bll());
            this.dgR();
        } else if (this.mmB != null) {
            this.mmB.removeFromParent();
            this.mmB = null;
            this.mmC.removeFromParent();
            this.mmC = null;
        }
        switch (imm2.mjP) {
            case mjD: {
                this.b(ire.mul);
                break;
            }
            case mjE: {
                this.b(ire.muk);
            }
        }
        this.dqE().setVisible(imm2.mjQ);
    }

    @Override
    public joa deA() {
        ioc ioc2 = this.drt().eo(0, 0);
        return new joa(ioc2.cf, ioc2.cg, this.drt().getWidth(), this.drt().getHeight());
    }

    public void a(imh imh2) {
        this.setVisible(this.mkK.ddQ() && imh2.dec().isEmpty() || this.mkK.ddF().exA().toLowerCase().contains(imh2.dec()));
    }

    public void dgN() {
        if (this.mmv != null) {
            int n = this.mkK.ddr().color;
            if (n != 0xFFFFFF) {
                this.mmv.setVisible(true);
                this.mmv.setColor(n);
                this.dqE().Rk(n);
            } else {
                this.mmv.setVisible(false);
                this.dqE().Rk(0xABABAB);
            }
        }
    }

    public void dgO() {
        lfs<cab, cab> lfs2 = this.mkK.ddP();
        if (lfs2 != null) {
            cab cab2;
            if (this.mmw == null) {
                this.mmw = new ipj();
                this.mmw.dlL().setColor(0x313131);
                this.mmw.dlK().a((iqz)null);
                this.mmw.dlL().a((iqz)null);
                this.W(this.mmw);
            }
            if (this.mmx == null) {
                this.mmx = new ipj();
                this.mmx.dlL().setColor(0x313131);
                this.mmx.dlK().a((iqz)null);
                this.mmx.dlL().a((iqz)null);
                this.W(this.mmx);
            }
            if ((cab2 = (cab)lfs2.reX) != null) {
                this.mmw.dlK().setVisible(true);
                this.mmw.dlK().setColor(cab2.aFK());
            } else {
                this.mmw.dlK().setVisible(false);
            }
            cab cab3 = (cab)lfs2.reY;
            if (cab3 != null) {
                this.mmx.dlK().setVisible(true);
                this.mmx.dlK().setColor(cab3.aFK());
            } else {
                this.mmx.dlK().setVisible(false);
            }
            this.dgS();
            this.pack();
        } else {
            if (this.mmw != null) {
                this.mmw.removeFromParent();
                this.mmw = null;
            }
            if (this.mmx != null) {
                this.mmx.removeFromParent();
                this.mmx = null;
            }
        }
    }

    public void dgP() {
        if (this.mmy != null) {
            float f = this.mkK.ddl();
            if (f > 0.0f) {
                this.mmy.setVisible(true);
                this.mmy.dan().setText(jny.dC(f) + " Kg");
            } else {
                this.mmy.setVisible(false);
            }
        }
    }

    public void cjT() {
        int n = this.mkK.vf();
        if (n > 1) {
            if (this.mmz == null) {
                this.mmz = new ink();
                this.dgT();
                this.W(this.mmz);
            }
            this.mmz.dan().setText("" + jny.dB(n));
            this.pack();
        } else if (this.mmz != null) {
            this.mmz.removeFromParent();
            this.mmz = null;
        }
    }

    public void dgQ() {
        if (this.mmA != null) {
            this.mmA.pack();
        }
    }

    public void cHb() {
        this.dqE().o(this.mkK.ddF());
    }

    public void dgR() {
        if (this.mmB != null) {
            String string = this.mkK.ddr().mip;
            boolean bl = string != null && !string.isEmpty();
            this.mmB.setVisible(bl);
            this.mmC.setVisible(bl);
            if (bl) {
                this.mmC.setText(string);
            }
        }
    }

    public void cjf() {
        if (this.mmr == null) {
            return;
        }
        if (!this.mmr.cCi()) {
            return;
        }
        this.mmr.cCk();
        this.drt().a(this.mmr.cCj() ? null : mmp);
    }

    public void b(cxc cxc2, float f, double d2) {
        if (this.mmr == null) {
            return;
        }
        this.mmr.a(cxc2, f, this.djE().getMessageDelegator().arc().lpr);
        this.setProgress(this.mmr.cBk());
    }

    public boolean qI(String string) {
        if (this.djL()) {
            List<ipf> list = this.getChildren();
            for (ipf ipf2 : list) {
                ipq ipq2;
                if (!ipf2.djL()) continue;
                String string2 = null;
                if (ipf2 instanceof isw) {
                    ipq2 = (isw)ipf2;
                    string2 = ((isw)ipq2).getText();
                } else if (ipf2 instanceof ink) {
                    ipq2 = (ink)ipf2;
                    string2 = ((ink)ipq2).dan().getText();
                }
                if (string2 == null || !string2.toLowerCase().contains(string)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public void cPj() {
        super.cPj();
        int n = this.getHeight();
        if (this.mmB != null && this.mmB.djL()) {
            this.setHeight(n += this.mmB.getHeight() + 32);
        }
    }

    @Override
    public void cPk() {
        super.cPk();
        if (this.mmD != null) {
            this.mmD.cqF();
            int n = (int)((float)this.drs().getHeight() * this.mms);
            this.mmD.r(this.drs().getX(), this.drs().getY() + this.drs().getHeight() - n, this.drs().getWidth(), n);
        }
        if (this.mmv != null && this.mmv.djL()) {
            this.mmv.r(this.drs().getX(), this.drs().getY(), this.drs().getWidth(), this.drs().getHeight());
        }
        if (this.mmw != null) {
            this.mmw.r(this.drs().getX() + 1, this.drs().getY() + 1, this.mmq.def(), this.mmq.def());
        }
        if (this.mmx != null) {
            this.mmx.r(this.drs().getX() + 1, this.drs().getY() + 1 + this.mmq.def(), this.mmq.def(), this.mmq.def());
        }
        if (this.mmy != null) {
            this.mmy.ek(this.drs().getX() + this.drs().getWidth() - this.mmy.getWidth() - 1, this.drs().getY() + 1);
        }
        if (this.mmA != null) {
            bsh bsh2 = this.mkK.cBu();
            float f = jbg.W(bsh2);
            float f2 = jbg.V(bsh2);
            float f3 = Math.min(f2 / f, 1.0f);
            this.mmA.r(this.drs().getX() + 1, this.drs().getY() + this.drs().getHeight() - this.mmq.deg() - 1, (int)((float)(this.drs().getWidth() - 2) * f3), this.mmq.deg());
        }
        if (this.mmz != null) {
            this.mmz.ek(this.drs().getX() + this.drs().getWidth() - this.mmz.getWidth() - 1, (this.mmA != null ? this.mmA.getY() : this.drs().getY() + this.drs().getHeight()) - this.mmz.getHeight() - 1);
        }
        if (this.mmB != null && this.mmB.djL()) {
            this.mmB.ek((this.getWidth() - this.mmB.getWidth()) / 2, this.getHeight() - 32 - this.mmB.getHeight());
            this.mmC.r(0, this.getHeight() - 32, this.getWidth(), 32);
        }
    }

    @Override
    public void qB(String string) {
        this.mkK.w(string);
        this.cHb();
    }

    @Override
    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        return this.mmu.a(n, n2, hzk2, ifg2);
    }

    @Override
    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        return this.mmu.d(n, n2, hzk2, ifg2);
    }

    @Override
    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        return this.mmu.b(n, n2, hzk2, ifg2);
    }

    @Override
    public boolean e(ifg ifg2) {
        return this.mmt.e(ifg2);
    }

    @Override
    public boolean f(ifg ifg2) {
        return this.mmt.f(ifg2);
    }

    @Override
    public hyn dd(int n, int n2) {
        if (this.mkK.ddQ() && this.djE() != null) {
            iac iac2 = new iac(new hwo(this.mkK.cBu()), hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), false, true, true);
            return iac2.cKb() ? iac2 : null;
        }
        return null;
    }

    private void dgS() {
        if (this.mmw != null) {
            this.mmw.setSize(this.mmq.def(), this.mmq.def());
        }
        if (this.mmx != null) {
            this.mmx.setSize(this.mmq.def(), this.mmq.def());
        }
    }

    private void dgT() {
        if (this.mmz != null) {
            this.mmz.dan().zY(this.mmq.dee());
        }
    }
}

