/*
 * Decompiled with CFR.
 */
public class bxf
extends bxe {
    private static final boolean dtQ = false;
    private bzc dYn = null;
    private bzc dYo = null;

    public bxf(col col2) {
        super(col2);
        this.ecW = new byu(this);
    }

    @Override
    public bzc aDe() {
        return this.dYn;
    }

    @Override
    public boolean isServerObject() {
        return false;
    }

    public void doTick(ldz ldz2) {
        if (this.ecW.aEa()) {
            assert (this.dYl.aAG() != null);
            assert (this.ecW != null);
            this.ecW.aEh();
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dYn = new bzc();
    }

    public void dF(float f2) {
        assert (!this.isServerObject());
        assert (this.ecW != null);
        this.ecW.dF(f2);
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
        if (this.dYn.edl != this.dYo.edl) {
            if (this.dYn.edl) {
                this.b(byw.c.ebZ);
            } else {
                this.b(byw.c.eca);
            }
        }
        if (this.dYn.edn != this.dYo.edn && !this.dYo.edn) {
            this.b(byw.c.ebY);
        }
    }

    @Override
    protected void a(byw.d d2, byz byz2) {
        switch (d2) {
            case ecQ: {
                float f2 = this.FZ();
                this.dYl.cL(f2);
                break;
            }
            default: {
                super.a(d2, byz2);
            }
        }
    }

    @Override
    protected void b(int n, String string, String string2) {
    }

    private float FZ() {
        return 7.0f;
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

