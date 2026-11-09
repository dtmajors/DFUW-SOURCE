/*
 * Decompiled with CFR.
 */
public class byk
extends byj {
    private bzc dYn = null;
    private bzc dYo = null;
    private ldg dZh = null;
    private ldg dZi = new ldg();
    private boolean dZa;

    public byk(cdr cdr2) {
        super(cdr2);
    }

    @Override
    public final bzc aDe() {
        return this.dYn;
    }

    public final ldg aDV() {
        return this.dZh;
    }

    public final void b(ldg ldg2) {
        this.dZi = this.dZh;
        this.dZh = ldg2;
        this.dZf.aDh();
    }

    public ldg aDW() {
        return this.dZi;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dYn = new bzc();
    }

    @Override
    public void a(byv byv2, boolean bl) {
        super.a(byv2, bl);
        this.dZe.aJz().a(cbx.a.ekM);
    }

    @Override
    public final void b(bzc bzc2) {
        assert (bzc2 != null);
        if (this.dYn.equals(bzc2)) {
            return;
        }
        this.dYo = this.dYn;
        this.dYn = bzc2;
        if (this.dYn.edl != this.dYo.edl) {
            if (this.dYn.edl) {
                this.b(byw.c.ebZ);
            } else {
                this.b(byw.c.eca);
            }
        }
        this.dZf.aDh();
    }

    @Override
    public void zO() {
        super.zO();
        this.dYn = new bzc();
    }

    @Override
    protected void a(byz byz2) {
        if (!this.aEP().isAlive()) {
            return;
        }
        switch (byz2.eda) {
            case 5: {
                this.dYV = true;
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                this.dYV = false;
                break;
            }
            default: {
                return;
            }
        }
    }
}

