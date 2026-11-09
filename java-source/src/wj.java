/*
 * Decompiled with CFR.
 */
public class wj {
    private int aYC = -1;
    private short aYD = (short)-1;
    private int aYE = -1;
    private ldv aYF = null;
    private int aYG = 0;
    private int aYH = 0;
    private float aYI = 0.0f;
    private short aYJ = 0;

    public void c(alu alu2) {
        this.aYC = alu2.Eb();
        this.aYD = lbc.mV(alu2.uO());
        this.aYE = alu2.DW();
        this.aYF = alu2.DZ();
        this.aYG = alu2.CD();
        this.aYH = alu2.Ec();
        this.aYI = (float)alu2.Em();
        this.aYJ = lbc.mV((float)alu2.En());
    }

    public void d(alu alu2) {
        alu2.ge(this.aYC);
        alu2.N(lbc.j(this.aYD));
        alu2.ga(this.aYE);
        alu2.cP(this.aYF);
        alu2.fJ(this.aYG);
        alu2.gf(this.aYH);
        alu2.y(this.aYI);
        alu2.z(lbc.j(this.aYJ));
    }

    public boolean e(alu alu2) {
        if (this.aYC != alu2.Eb()) {
            return false;
        }
        if (Math.abs((double)lbc.j(this.aYD) - (double)alu2.uO()) > 0.01) {
            return false;
        }
        if (this.aYE != alu2.DW()) {
            return false;
        }
        if (!this.k(this.aYF, alu2.DZ())) {
            return false;
        }
        if (this.aYG != alu2.CD()) {
            return false;
        }
        if (this.aYH != alu2.Ec()) {
            return false;
        }
        if (Math.abs((double)this.aYI - alu2.Em()) > 0.001) {
            return false;
        }
        return !(Math.abs((double)lbc.j(this.aYJ) - alu2.En()) > 0.01);
    }

    private boolean k(ldv ldv2, ldv ldv3) {
        if (ldv2 == null != (ldv3 == null)) {
            return false;
        }
        if (ldv2 == null) {
            return true;
        }
        return ldv2.equals(ldv3);
    }
}

