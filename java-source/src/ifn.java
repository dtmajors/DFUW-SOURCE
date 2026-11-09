/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class ifn
extends hzk {
    private ifm lRv = ifm.lRt;
    private ifm lRw = ifm.lRt;
    private ign liv = null;
    private boolean lRx = false;
    private double lRy = 0.0;
    private lie lRz = null;

    public ifn() {
        super("FeatTray", "FeatTray.swf");
        this.OQ(0xFFFFFFFF & ~(jnz.nGw | jnz.nGx));
        this.a(hya.lmp, true);
        this.a(hyb.lmC);
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.lRz != null) {
            this.lRz.stop();
        }
    }

    public ifm cSr() {
        return this.lRv;
    }

    public void a(ifm ifm2) {
        if (ifm2 == this.lRv) {
            return;
        }
        this.lRv = ifm2;
        this.cSx();
        if (this.lRz == null) {
            this.lRz = new lie(this, 1.0, true){
                final /* synthetic */ ifn lRA;
                {
                    this.lRA = ifn2;
                    super(d2, bl);
                }

                public void dh(double d2) {
                    ifn.a(this.lRA);
                }
            };
            this.lRz.e(this.MessageDelegator);
        }
    }

    public void c(ign ign2) {
        this.liv = ign2;
        this.cSC();
    }

    public void cSs() {
        this.liv = null;
        this.cSC();
    }

    public void cSt() {
        this.a("playStarButtonFx", new Object[0]);
    }

    public boolean a(igm igm2) {
        return this.liv != null && this.liv.cTI() == igm2;
    }

    public void cFb() {
        if (ifn.cxP().cyJ() != null && ifn.cxP().cyJ().cHS() != null) {
            ifn.cxP().cyJ().cHS().cqF();
        }
    }

    public boolean cSu() {
        return this.lRx;
    }

    public void cSv() {
        if (this.liv != null) {
            this.cSB();
        }
    }

    public void d(ign ign2) {
        if (ign2 == this.liv) {
            this.cSv();
        }
    }

    public void cSw() {
        this.N(1.0f, (float)this.lRy / this.cDc());
    }

    protected void cBa() {
        super.cBa();
        this.cSC();
        this.setVisible(true);
    }

    protected void b(jnz jnz2, jnz jnz3) {
        if (jnz2 == jnz.nFE) {
            this.lRw = this.lRv;
        } else if (jnz3 == jnz.nFE) {
            this.a(this.lRw);
            this.lRx = false;
        }
    }

    private void cSx() {
        if (this.lRv == null) {
            return;
        }
        switch (this.lRv) {
            case lRr: {
                this.a("setCollapsed", new Object[0]);
                break;
            }
            case lRs: {
                this.a("setSemiCollapsed", new Object[0]);
                break;
            }
            case lRt: {
                this.a("setExpanded", new Object[0]);
            }
        }
    }

    private String cSy() {
        return this.liv != null ? this.liv.getTitle() : "";
    }

    private String cSz() {
        return this.liv != null ? this.liv.getDescription() : "";
    }

    private SFGUIElementDTO cSA() {
        return this.liv != null ? this.liv.cBj() : null;
    }

    private void cSB() {
        this.a("setGUIElementDTO", new Object[]{this.cSA()});
    }

    private void cSC() {
        this.a("setContent", new Object[]{this.cSy(), this.cSz()});
        this.cSB();
        this.cSx();
    }

    @llk
    private void _starButtonClicked() {
        ifm ifm2;
        this.lRw = ifm2 = ifm.getNextState(this.lRv);
        this.lRx = hso.cxK().cxN() != jnz.nFE;
        this.a(ifm2);
    }

    @llk
    private void _reportSize(double d2) {
        if (this.lRz != null) {
            this.lRz.stop();
            this.lRz = null;
        }
        this.lRy = d2;
        this.cSw();
    }

    private void cSD() {
        this.a("requestHeight", new Object[0]);
    }

    static /* synthetic */ void a(ifn ifn2) {
        ifn2.cSD();
    }
}

