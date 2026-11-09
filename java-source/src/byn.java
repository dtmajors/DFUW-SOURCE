/*
 * Decompiled with CFR.
 */
public class byn
extends bym {
    private bzc dYn = null;
    private bzc dYo = null;
    private float bxG = 0.0f;

    public byn(cdu cdu2) {
        super(cdu2);
        this.ecW = new byu(this);
    }

    @Override
    public final bzc aDe() {
        return this.dYn;
    }

    public final void c(bzc bzc2) {
        this.dYn = bzc2;
        this.dYo = bzc2;
    }

    @Override
    public void aDZ() {
        float f2 = this.aEO();
        if (this.bxG == f2) {
            return;
        }
        this.bxG = f2;
        boolean bl = this.ecS.aEP().aEB();
        this.dZk.aJN().c(this.bxG, bl);
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.ecW.aEa()) {
            assert (this.dZk.aAG() != null);
            assert (this.ecW != null);
            this.ecW.aEh();
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dYn = new bzc();
    }

    @Override
    public void a(byv byv2, boolean bl) {
        super.a(byv2, bl);
        this.dZk.aJz().a(cbx.a.ekM);
    }

    @Override
    public final void b(bzc bzc2) {
        assert (bzc2 != null);
        if (this.dYn.equals(bzc2)) {
            return;
        }
        this.dYo = this.dYn;
        this.dYn = bzc2;
        if (this.dYo.edp != this.dYn.edp) {
            switch (this.dYn.edp) {
                case 0: {
                    this.b(byw.c.ecx);
                    break;
                }
                case 1: {
                    this.b(byw.c.ecy);
                    break;
                }
                case 2: {
                    this.b(byw.c.ecz);
                    break;
                }
                case 3: {
                    this.b(byw.c.ecA);
                    break;
                }
            }
        }
        boolean bl = this.dYn.aFc();
        boolean bl2 = this.dYo.aFc();
        if (this.dYn.edl != this.dYo.edl) {
            if (this.dYn.edl) {
                this.b(byw.c.ebZ);
            } else {
                this.b(byw.c.eca);
            }
        }
        if (this.dYn.edm != this.dYo.edm) {
            if (this.dYn.edm) {
                this.b(byw.c.ebV);
            } else {
                this.b(byw.c.ebW);
            }
        }
        if (this.dYn.edn != this.dYo.edn && !this.dYo.edn) {
            this.b(byw.c.ebY);
        }
    }

    @Override
    public void zO() {
        super.zO();
        this.dYn = new bzc();
    }

    @Override
    protected void a(byz byz2) {
        assert (this.ecW != null);
        if (!this.aEP().isAlive()) {
            return;
        }
        this.ecW.ay(byz2.ecZ, byz2.eda);
    }
}

