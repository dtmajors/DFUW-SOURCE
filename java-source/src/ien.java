/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 */
public class ien
extends hzk
implements bto,
hte,
htf,
htg,
hth {
    private double lKf = 1.0;
    private azz lKD = null;
    private float lOg = 1.0f;
    private float lOh = 1.0f;

    public float getWidth() {
        return this.lOg;
    }

    public float getHeight() {
        return this.lOh;
    }

    public azz cQf() {
        return this.lKD;
    }

    public void c(azz azz2) {
        this.lKD = azz2;
        if (this.lKD != null) {
            this.a("takeConquestChallenge", new Object[]{this.lKD.a(hso.cxK().cxP().czb())});
        }
    }

    public ien() {
        super("ConquestWindow", "conquestwindow.swf");
        this.OQ(jnz.nGe);
        this.a(hya.lmu, false);
        this.a(hxu.lle);
        this.a(hyb.lmC);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.cDj()) {
            return;
        }
        if (this.lKD == null) {
            if (this.isVisible()) {
                this.setVisible(false);
            }
            return;
        }
        if (!this.isVisible()) {
            this.setVisible(true);
        }
        this.lKf -= ldz2.qwh;
        if (this.lKf <= 0.0) {
            this.lKf = 1.0;
            this.a("doTick", new Object[0]);
        }
    }

    @Override
    public void oj() {
    }

    @Override
    public void oi() {
        if (this.isVisible()) {
            this.setVisible(false);
        }
    }

    @Override
    public void cyx() {
        if (this.lKD == null) {
            return;
        }
        if (hso.cxK() == null || hso.cxK().cxP() == null || hso.cxK().cxP().czb() == null) {
            return;
        }
        this.lKD = hso.cxK().cxP().czc().sX(this.lKD.afl());
        if (this.lKD == null) {
            if (this.isVisible()) {
                this.setVisible(false);
            }
            return;
        }
        this.a("takeConquestChallenge", new Object[]{this.lKD.a(hso.cxK().cxP().czb())});
    }

    @Override
    public void b(azz azz2) {
        if (this.lKD == null) {
            return;
        }
        if (!this.lKD.afl().equals(azz2.afl())) {
            return;
        }
        this.lKD = azz2;
        this.a("takeConquestChallenge", new Object[]{this.lKD.a(hso.cxK().cxP().czb())});
    }

    @Override
    public void f(azx azx2) {
        if (this.lKD == null) {
            return;
        }
        if (azx2 == null) {
            return;
        }
        if (!this.lKD.afl().equals(azx2.afl())) {
            return;
        }
        this.a("updateBindstoneHealth", new Object[]{Float.valueOf(azx2.afn())});
    }

    @Override
    public void d(azx azx2, azv azv2, azw azw2) {
        if (this.lKD == null) {
            return;
        }
        if (azx2 == null || azv2 == null || azw2 == null) {
            return;
        }
        if (!this.lKD.afl().equals(azx2.afl())) {
            return;
        }
        if (!hso.cxK().cxP().czb().sz(azv2.getGUID())) {
            return;
        }
        this.a("updateSiegeStoneHealth", new Object[]{azw2.getName(), Float.valueOf(azw2.afi())});
    }

    @Override
    public void e(azx azx2, azv azv2) {
        if (this.lKD == null) {
            return;
        }
        if (azx2 == null || azv2 == null) {
            return;
        }
        if (!this.lKD.afl().equals(azx2.afl())) {
            return;
        }
        this.a("updateAttackerScore", new Object[]{this.lKD.fC(azv2.getGUID()), azv2.aer()});
    }

    @Override
    public void g(azx azx2) {
        if (this.lKD == null) {
            return;
        }
        if (azx2 == null) {
            return;
        }
        if (!this.lKD.afl().equals(azx2.afl())) {
            return;
        }
        this.a("updateWallRequirement", new Object[]{azx2.afo()});
    }

    public void cBa() {
        super.cBa();
        if (hso.cxK() == null || hso.cxK().cxP() == null || hso.cxK().cxP().czb() == null) {
            return;
        }
        hso.cxK().cxP().czb().a(this);
    }

    public void cEk() {
        super.cEk();
        this.a("takeConquestStrings", new Object[]{lwr.exR()});
    }

    protected void b(jnz jnz2, jnz jnz3) {
        if (jnz3 == jnz.nFE) {
            if (this.lKD == null) {
                return;
            }
            if (hso.cxK() == null || hso.cxK().cxP() == null || hso.cxK().cxP().czb() == null) {
                return;
            }
            this.lKD = hso.cxK().cxP().czc().sX(this.lKD.afl());
        }
    }

    @llk
    public void setComponentSize(double d2, double d3) {
        this.lOg = (float)d2;
        this.lOh = (float)d3;
        if (hso.cxK() != null && hso.cxK().cxO() != null && hso.cxK().cxO() instanceof hzo) {
            ((hzo)hso.cxK().cxO()).updateLayout();
        }
    }
}

