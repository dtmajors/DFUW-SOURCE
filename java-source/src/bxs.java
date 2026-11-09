/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public abstract class bxs
extends byx
implements byi {
    protected final cop dZb;

    public bxs(cop cop2) {
        assert (cop2 != null);
        this.dZb = cop2;
    }

    @Override
    public final bxh aDc() {
        return null;
    }

    @Override
    public final cbx aDd() {
        return this.dZb;
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
        this.dZb.b(byv2, bl);
    }

    @Override
    protected void a(byw.d d2, byz byz2) {
        switch (d2) {
            case ecF: {
                break;
            }
            case ecK: {
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
}

