/*
 * Decompiled with CFR.
 */
public class bxl
extends bxh {
    private static final boolean dtQ = false;
    private byq dYz = null;

    public bxl(byq byq2) {
        super(byq2);
        this.dYz = byq2;
    }

    @Override
    public byx aDj() {
        return this.dYz;
    }

    public void nh() {
        if (!this.dYr) {
            return;
        }
        this.dYr = false;
        byv byv2 = this.dYz.aEP();
        if (byv2.vK() != 3 && !byv2.aEy()) {
            return;
        }
        if (!byv2.isAlive()) {
            return;
        }
        byw.b b2 = this.aDl();
        if (b2 == null) {
            return;
        }
        byw.a a2 = this.a(b2, this.dYz.aEM());
        if (a2 == null) {
            return;
        }
        if (!byv2.aEy() && a2 == byw.a.eaQ && byv2.vN() != 1) {
            return;
        }
        int n = this.a(b2, a2);
        if (n <= 0) {
            return;
        }
        this.nG(n);
        if (!this.dYz.isServerObject()) {
            ldv ldv2 = ((cpf)this.dYz.aDd()).aXC();
            this.O(ldv2, n);
        }
    }

    private byw.b aDl() {
        byv byv2 = this.dYz.aEP();
        switch (byv2.vO()) {
            case 6: {
                boolean bl = false;
                switch (byv2.vN()) {
                    case 1: 
                    case 2: 
                    case 3: {
                        bl = true;
                        break;
                    }
                    case 4: {
                        bl = false;
                        break;
                    }
                    default: {
                        return null;
                    }
                }
                if (bl) {
                    return byw.b.ebv;
                }
                return byw.b.ebt;
            }
            case 7: {
                switch (byv2.vN()) {
                    case 1: 
                    case 2: 
                    case 3: {
                        return byw.b.ebu;
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override
    protected final void b(int n, String string, String string2) {
    }
}

