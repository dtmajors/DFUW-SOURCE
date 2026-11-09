/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;

public class hzj
extends hzk
implements bto {
    private boolean kpO = false;
    private double oV = 0.0;
    private double lvV = 0.0;
    private cjr lvW = null;
    private List<gxu> bbR = lcn.emv();

    public hzj() {
        super("TutorialWindow", "tutorial.swf");
        this.OQ(jnz.nGi | jnz.nGk | jnz.nGe | jnz.nGh);
        this.a(hyb.lmC);
    }

    public void initialize() {
        super.initialize();
    }

    protected void cEk() {
        this.cHf();
    }

    public void cBa() {
        super.cBa();
        for (gxu gxu2 : this.bbR) {
            if (!hzj.cxP().czl() && gxu2.gOd != 1) continue;
            this.d(gxu2);
        }
        this.bbR.clear();
    }

    public void cleanUp() {
        super.cleanUp();
    }

    public boolean isExpanded() {
        return this.kpO;
    }

    protected void h(int n, int n2, String string) {
        if (this.getAlpha() != 1.0f) {
            this.cqF();
        }
    }

    protected void g(int n, int n2, String string) {
        super.g(n, n2, string);
        this.expand(!this.kpO);
    }

    public void expand(boolean bl) {
        if (this.lvV != 0.0) {
            return;
        }
        if (bl == this.kpO) {
            return;
        }
        this.a("expand", new Object[]{bl});
        if (bl) {
            this.cqF();
            this.kpO = true;
            hzj.cyJ().updateLayout();
        } else {
            this.lvV = this.MessageDelegator.arc().rgz;
        }
    }

    protected void kq(float f) {
        this.a("onWidthChangedByLayout", new Object[]{Float.valueOf(f / this.cEJ())});
    }

    protected void kr(float f) {
        this.a("onHeightChangedByLayout", new Object[]{Float.valueOf(f / this.cDc())});
    }

    protected boolean d(int n, int n2, String string) {
        return true;
    }

    protected void d(gxu gxu2) {
        if (!this.isInitialized()) {
            this.bbR.add(gxu2);
            return;
        }
        switch (gxu2.gOd) {
            case 1: {
                hzj.cxP().oL(true);
                this.setVisible(true);
                hzj.cyJ().updateLayout();
                this.expand(true);
                if (hzj.cxP().cyJ() == null || hzj.cxP().cyJ().cHT() == null) break;
                hzj.cxP().cyJ().cHT().setVisible(false);
                break;
            }
            case 2: {
                hzj.cxP().oL(false);
                this.setVisible(false);
                if (hzj.cxP().cyJ() != null && hzj.cxP().cyJ().cHT() != null) {
                    hzj.cxP().cyJ().cHT().setVisible(true);
                    hzj.cxP().cyJ().cHT().a(ifm.lRt);
                }
                hzj.cyJ().updateLayout();
                break;
            }
            case 3: {
                this.lvW = (cjr)lea.epr().aQi().get(gxu2.jtD);
                this.cHf();
                this.Pc(this.lvW.adk);
                this.a(this.lvW.eEl);
                this.cqF();
                break;
            }
            case 4: {
                this.lvW = (cjr)lea.epr().aQi().get(gxu2.jtD);
                hzj.cxP().a(hxz.lmh);
                break;
            }
            default: {
                assert (false) : "Unhandled Operation : " + gxu2.gOd;
                break;
            }
        }
    }

    private void cHf() {
        if (this.lvW == null) {
            return;
        }
        String string = lpd.rHs.exL().substring(0, 2);
        String string2 = string.equals("en") ? this.lvW.eEh : this.lvW.eEh.substring(0, this.lvW.eEh.lastIndexOf(".dds")) + "_" + string + ".dds";
        this.a("showImage", new Object[]{string2, this.lvW.eEi});
        this.cqF();
    }

    private void Pc(int n) {
        int n2 = lea.epr().eEo;
        int n3 = lea.epr().eEp;
        int n4 = lea.epr().eEq;
        int n5 = lea.epr().eEr;
        if (n >= n2) {
            if (hzj.cxP().czq()) {
                hzj.cxP().oN(false);
            }
        } else if (!hzj.cxP().czq()) {
            hzj.cxP().oN(true);
        }
        if (n >= n3) {
            if (hzj.cxP().czr()) {
                hzj.cxP().oO(false);
            }
        } else if (!hzj.cxP().czr()) {
            hzj.cxP().oO(true);
        }
        if (n >= n4) {
            if (hzj.cxP().czs()) {
                hzj.cxP().oP(false);
            }
        } else if (!hzj.cxP().czs()) {
            hzj.cxP().oP(true);
        }
        if (n >= n5) {
            if (hzj.cxP().czt()) {
                hzj.cxP().oQ(false);
            }
        } else if (!hzj.cxP().czt()) {
            hzj.cxP().oQ(true);
        }
    }

    private void a(cjq cjq2) {
        if (cjq2 != null) {
            cjq.a a2 = cjq2.eEd;
            int n = cjq2.adk;
            switch (a2) {
                case eEe: {
                    int n2 = cjq2.eDY;
                    hwo hwo2 = hzj.cyJ().cHO().Ql(n2);
                    if (hwo2 == null) break;
                    hzj.cxP().cyH().a(n, hwo2);
                    if (n != 0) break;
                    iao.cKB().Pr(0);
                    break;
                }
                case eEf: {
                    hwv hwv2;
                    int n3 = cjq2.eDY;
                    cxc cxc2 = hzj.cxP().cyZ().ht(n3);
                    if (cxc2 == null || (hwv2 = new hwv(cxc2)) == null) break;
                    if (lcw.aQH()) {
                        jen.dzL().dzM().dzE().Ur(9).b(jfd.Um(hwv2.zg()));
                        break;
                    }
                    hzj.cyJ().cHY().a(n, hwv2);
                    hzj.cyJ().cHW().a(n, hwv2);
                }
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.lvV != 0.0 && ldz2.rgz - this.lvV > 0.5) {
            this.kpO = false;
            hzj.cyJ().updateLayout();
            this.lvV = 0.0;
        }
    }
}

