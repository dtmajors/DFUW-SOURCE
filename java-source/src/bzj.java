/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public abstract class bzj
extends byx
implements byi {
    protected final cpi edN;
    protected boolean edO = false;
    protected boolean edP = false;

    public bzj(cpi cpi2) {
        assert (cpi2 != null);
        this.edN = cpi2;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public final bxh aDc() {
        return null;
    }

    @Override
    public final cbx aDd() {
        return this.edN;
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
        for (int i2 = 0; i2 < blArray.length; ++i2) {
            if (!blArray[i2]) continue;
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
        this.edN.b(byv2, bl);
    }

    protected abstract void a(byz var1);

    @Override
    protected void a(byw.d d2, byz byz2) {
        switch (d2) {
            case ecF: {
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
            case ecK: {
                if (this.isServerObject()) break;
                ((cpj)this.edN).su(byz2.eda);
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
        block0 : switch (n2) {
            case 3: {
                assert (n == 1);
                break;
            }
            case 4: {
                switch (n) {
                    case 3: {
                        if (!this.isServerObject() || !this.edO) break block0;
                        this.edP = true;
                        break;
                    }
                }
                break;
            }
            default: {
                return;
            }
        }
    }
}

