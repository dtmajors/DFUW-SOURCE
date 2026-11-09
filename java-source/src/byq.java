/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public abstract class byq
extends byx
implements byi {
    protected final cpe dZn;
    private bxl dZo = null;

    public byq(cpe cpe2) {
        assert (cpe2 != null);
        this.dZn = cpe2;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.MessageDelegator.hd(this.dZo.getGUID());
    }

    public void doTick(ldz ldz2) {
        assert (this.dZn != null);
        this.dZo.nh();
    }

    @Override
    public final bxh aDc() {
        return this.dZo;
    }

    @Override
    public final cbx aDd() {
        return this.dZn;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dZo = new bxl(this);
        this.dZo.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dZo);
    }

    @Override
    public final boolean isServerObject() {
        return this.dZn.isServerObject();
    }

    @Override
    public final void a(int n, boolean[] blArray) {
        if (n <= 0) {
            return;
        }
        if (blArray == null) {
            return;
        }
        boolean bl = false;
        for (int i = 0; i < blArray.length; ++i) {
            if (!blArray[i]) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return;
        }
        assert (this.ecU.length == blArray.length);
        if (this.ecV != n) {
            this.ecV = n;
            this.d(blArray);
            this.b(byw.c.ebT);
        }
    }

    @Override
    public final void nF(int n) {
        if (n <= 0) {
            return;
        }
        if (this.ecV == n) {
            this.ecV = 0;
            this.d(new boolean[6]);
            this.b(byw.c.ebU);
        }
    }

    @Override
    public final void a(byv byv2, boolean bl) {
        this.dZo.aDh();
        this.dZn.b(byv2, bl);
    }

    protected abstract void a(byz var1);

    @Override
    protected void a(byw.d d2, byz byz2) {
        switch (d2) {
            case ecF: {
                this.dZo.aDh();
                break;
            }
            case ecG: {
                this.a(byz2);
                break;
            }
            case ecI: {
                this.aw(byz2.ecZ, byz2.eda);
                break;
            }
            case ecJ: {
                break;
            }
            case ecN: {
                this.e(byz2);
                break;
            }
            case ecQ: {
                break;
            }
            default: {
                super.a(d2, byz2);
            }
        }
    }

    private void aw(int n, int n2) {
        switch (n2) {
            case 4: {
                this.dZn.aWX();
                if (!this.isServerObject()) break;
                this.aEb();
                break;
            }
            default: {
                return;
            }
        }
    }

    private void e(byz byz2) {
        assert (byz2.bpX == 1);
        switch (byz2.eda) {
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                switch (byz2.ecZ) {
                    case 1: 
                    case 2: 
                    case 5: {
                        if (this.ecS.aEP().Uv()) break;
                        this.dZo.nG(262494);
                    }
                }
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                this.dZo.nG(262402);
                break;
            }
            default: {
                return;
            }
        }
    }
}

