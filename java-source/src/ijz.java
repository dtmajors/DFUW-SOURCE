/*
 * Decompiled with CFR.
 */
public class ijz
extends ijc {
    private boolean meX;
    private ipb mew = new ipb("ti_normal_health_bg_noise");
    private ipb mbG;
    private ipb meY;
    private ipb meZ;
    private ist lUP;
    private int mbX = 18;

    public ijz() {
        super(true, true, lyu.tKF);
        this.cXE().W(ipx.d(this.mew));
        this.mbG = new ipb("ti_normal_health_bg");
        this.cXE().W(ipx.d(this.mbG));
        this.meY = new ipb("ti_normal_health_bar");
        this.cXE().W(ipx.d(this.meY));
        this.meZ = new ipb("ti_normal_health_bar_percentage");
        this.cXE().W(ipx.d(this.meZ));
        this.lUP = new ist(isf.mwM, 10, 0xD8D8D8, "100%");
        this.cXE().W(ipx.d(this.lUP));
    }

    public boolean dbV() {
        return this.meX;
    }

    public void qE(boolean bl) {
        this.meX = bl;
        this.meZ.setVisible(bl);
        this.lUP.setVisible(bl);
        this.mci.dLF();
    }

    @Override
    public ije dae() {
        return new ijx(this);
    }

    @Override
    public ikd daf() {
        return ikd.mfv;
    }

    @Override
    public void cZZ() {
        switch (this.daD()) {
            case mcL: {
                this.mew.qP("ti_small_health_bg_noise");
                this.mbG.qP("ti_small_health_bg");
                this.meY.qP("ti_small_health_bar");
                this.meZ.qP("ti_small_health_bar_percentage");
                this.mbX = 19;
                break;
            }
            case mcM: {
                this.mew.qP("ti_normal_health_bg_noise");
                this.mbG.qP("ti_normal_health_bg");
                this.meY.qP("ti_normal_health_bar");
                this.meZ.qP("ti_normal_health_bar_percentage");
                this.mbX = 18;
                break;
            }
            case mcN: {
                this.mew.qP("ti_large_health_bg_noise");
                this.mbG.qP("ti_large_health_bg");
                this.meY.qP("ti_large_health_bar");
                this.meZ.qP("ti_large_health_bar_percentage");
                this.mbX = 17;
            }
        }
    }

    @Override
    public void daa() {
        if (this.mew != null) {
            this.mew.hz(this.daE());
        }
        if (this.mbG != null) {
            this.mbG.hz(this.daE());
        }
        if (this.meY != null) {
            this.meY.hz(this.daE());
        }
        if (this.meZ != null) {
            this.meZ.hz(this.daE());
        }
    }

    @Override
    public int daz() {
        return this.day() + this.mew.getX() + this.daF();
    }

    @Override
    public void Re(int n) {
        this.Rd(n - this.daF());
    }

    @Override
    public int dar() {
        return this.daA() + this.mew.getY() + this.daF();
    }

    @Override
    public void Rc(int n) {
        this.Rf(n - this.mbX);
    }
}

