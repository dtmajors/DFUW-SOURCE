/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 */
public class lx
extends btk
implements bto {
    private static final String TC = "SFNewBieProtectionManager";
    private static final double aww = 1.0;
    public static final double awx = 30.0;
    public static final double awy = 10.0;
    private final ha hF;
    private double abo;
    private ldv awz = null;
    private boolean QO = false;
    private double awA = -604800.0;
    private double awB = -604800.0;

    public lx(ha ha2) {
        this.hF = ha2;
        this.abo = 0.0;
    }

    public void ad(boolean bl) {
        if (bl) {
            if (this.QO) {
                this.hF.c(mcl.uos.bD(new Object[0]));
            }
            if (this.qj()) {
                this.qg();
            }
            this.QO = false;
            return;
        }
        if (this.awB != -604800.0) {
            this.awB = -604800.0;
            this.a(-1.0, this.QO);
        }
        if (this.awA != -604800.0) {
            this.QO = false;
            return;
        }
        if (!this.qj()) {
            if (this.QO) {
                this.hF.c(mcl.uos.bD(new Object[0]));
            }
            this.QO = false;
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz;
        this.awA = d2 + 10.0;
        this.hF.c(mcl.uwc.bD(10));
        this.QO = false;
        this.a(d2, this.QO);
    }

    public void ae(boolean bl) {
        if (this.hF.jf().lF() != -1) {
            this.hF.jf().aMT();
        }
        if (bl) {
            if (this.QO) {
                this.hF.c(mcl.uwd.bD(new Object[0]));
            }
            if (!this.qj()) {
                this.qh();
            }
            this.QO = true;
            return;
        }
        if (this.awA != -604800.0) {
            this.awA = -604800.0;
            this.a(-1.0, this.QO);
        }
        if (this.awB != -604800.0) {
            this.QO = true;
            return;
        }
        if (this.qj()) {
            if (!this.QO) {
                this.hF.c(mcl.uwd.bD(new Object[0]));
            }
            this.QO = true;
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz;
        this.awB = d2 + 30.0;
        this.hF.c(mcl.uwe.bD(30));
        this.QO = true;
        this.a(d2, this.QO);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.qk() || !this.hF.jf().aIs()) {
            return;
        }
        if (this.abo > ldz2.rgz) {
            return;
        }
        this.abo = ldz2.rgz + 1.0;
        if (this.awA != -604800.0 && this.awA < ldz2.rgz) {
            this.qg();
            return;
        }
        if (this.awB != -604800.0 && this.awB < ldz2.rgz) {
            this.qh();
            return;
        }
    }

    private void qg() {
        if (!this.qk() || !this.hF.jf().aIs()) {
            return;
        }
        ej ej2 = this.hF.jf().jm().ae(10928);
        if (ej2 == null) {
            assert (false) : "Impossible!";
            return;
        }
        if (!(ej2 instanceof eq)) {
            assert (false);
            return;
        }
        this.awA = -604800.0;
        eq eq2 = (eq)ej2;
        eq2.x(false);
        this.hF.c(mcl.uwb.bD(new Object[0]));
    }

    public void qh() {
        if (!this.qk() || !this.hF.jf().aIs()) {
            return;
        }
        ej ej2 = this.hF.jf().jm().ae(10928);
        if (ej2 == null) {
            assert (false) : "Impossible!";
            return;
        }
        if (!(ej2 instanceof eq)) {
            assert (false);
            return;
        }
        this.awB = -604800.0;
        if (this.hF.jf().jm().ad(10928)) {
            eq eq2 = (eq)ej2;
            eq2.x(true);
        } else {
            eq eq3 = new eq();
            eq3.setType(10928);
            eq3.x(true);
            this.hF.jf().jm().b((ej)eq3);
        }
        this.hF.c(mcl.uwa.bD(new Object[0]));
    }

    public void qi() {
        if (!this.hF.iY()) {
            return;
        }
        if (!this.qj()) {
            return;
        }
        this.hF.c(mcl.uvZ.bD(new Object[0]));
        this.qg();
    }

    public final boolean qj() {
        if (!this.qk()) {
            return false;
        }
        return this.hF.jf().aIq();
    }

    private boolean qk() {
        if (!this.hF.iY()) {
            return false;
        }
        if (this.hF.jf() == null) {
            return false;
        }
        if (this.hF.jf().aJD() == null) {
            return false;
        }
        if (this.hF.jf().aJD().aEP() == null) {
            return false;
        }
        return this.hF.jf().fi() != null;
    }

    public void lw() {
        this.awz = new ldv(this.hF.jr(), lcr.acL.enw(), lcr.acL.enx());
    }

    public void lx() {
    }

    private void a(double d2, boolean bl) {
        ldv ldv2 = lcr.p((ldv)lcr.acL, (int)this.hF.jr(), (int)this.GUID.enw());
        gye gye2 = (gye)this.MessageDelegator.h(12057, this.getGUID(), ldv2);
        gye2.QO = bl;
        gye2.jjy = d2;
        this.MessageDelegator.F(gye2);
    }
}

