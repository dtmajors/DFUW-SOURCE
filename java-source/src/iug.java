/*
 * Decompiled with CFR.
 */
public class iug
extends iul {
    private ire msb = ire.mul;

    public iug() {
        this.drJ();
    }

    @Override
    public boolean drj() {
        return this.msb == ire.muk && super.drj();
    }

    @Override
    public boolean drk() {
        return this.msb == ire.mul && super.drk();
    }

    public ire dlY() {
        return this.msb;
    }

    public void b(ire ire2) {
        if (ire2 == this.msb) {
            return;
        }
        this.msb = ire2;
        this.drJ();
    }

    @Override
    public int drH() {
        return this.msb == ire.mul ? this.drS() : this.drR();
    }

    @Override
    public void Ta(int n) {
        if (this.msb == ire.mul) {
            this.Tc(n);
        } else {
            this.Tb(n);
        }
    }

    @Override
    public void Sg(int n) {
        if (this.msb == ire.mul) {
            this.eO(0, n);
        } else {
            this.eO(n, 0);
        }
    }

    @Override
    public void LO(int n) {
        if (this.msb == ire.mul) {
            this.eP(0, n);
        } else {
            this.eO(n, 0);
        }
    }

    @Override
    public void drI() {
        this.drJ();
    }

    @Override
    public boolean qD(String string) {
        if (!this.dse()) {
            return false;
        }
        if (string == "UP") {
            this.eP(0, this.drH());
            this.eQ(this.drl(), this.dnx());
            this.z("UP", true);
            return true;
        }
        if (string == "DOWN") {
            this.eP(0, -this.drH());
            this.eQ(this.drl(), this.dnx());
            this.z("DOWN", true);
            return true;
        }
        return super.qD(string);
    }

    private void drJ() {
        iuc iuc2 = this.drN();
        if (iuc2 == null) {
            return;
        }
        iuc2.a(this.msb == ire.mul ? iqo.dmT() : iqo.dmS());
    }
}

