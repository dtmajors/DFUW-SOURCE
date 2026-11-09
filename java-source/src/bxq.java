/*
 * Decompiled with CFR.
 */
public class bxq
extends bxp {
    private bzc dYn = null;
    private bzc dYo = null;
    private ldg dYY = null;
    private ldg dYZ = new ldg();
    private boolean dZa;

    public bxq(cdh cdh2) {
        super(cdh2);
    }

    @Override
    public final bzc aDe() {
        return this.dYn;
    }

    public final ldg aDP() {
        return this.dYY;
    }

    public final void a(ldg ldg2) {
        this.dYZ = this.dYY;
        this.dYY = ldg2;
        this.dYU.aDh();
    }

    public final ldg aDQ() {
        return this.dYZ;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dYn = new bzc();
    }

    @Override
    public void a(byv byv2, boolean bl) {
        super.a(byv2, bl);
        this.dYT.aJz().a(cbx.a.ekM);
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
        this.dYU.aDh();
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

