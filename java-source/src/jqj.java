/*
 * Decompiled with CFR.
 */
public abstract class jqj {
    protected static final joi nHy = joi.nHV;
    protected final jqx nHJ;
    protected final ldv dbx;
    private boolean jLT;
    private boolean nSb;

    public jqj(jqx jqx2, ldv ldv2) {
        assert (jqx2 != null);
        assert (ldv2 != null);
        this.nHJ = jqx2;
        this.dbx = ldv2;
        this.jLT = true;
    }

    public final void dispose() {
        assert (this.jLT);
        this.cbg();
        assert (!this.jLT);
    }

    public final boolean dRd() {
        return this.nSb;
    }

    public final void dRe() {
        this.uD(true);
    }

    public final void dRf() {
        this.uD(false);
    }

    public final void e(int n, ldv ldv2, int n2) {
        assert (lda.acc(n2));
        assert (lda.by(ldv2));
        assert (lda.acc(n));
    }

    public final void aj(ldv ldv2, int n) {
        assert (lda.by(ldv2));
        switch (n) {
            case 0: {
                this.uD(true);
                break;
            }
            case 1: {
                this.uD(false);
                break;
            }
            case 2: {
                this.uD(false);
                break;
            }
            case 3: {
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                assert (false) : n;
                break;
            }
            case 7: {
                assert (false) : n;
                break;
            }
            default: {
                assert (false) : n;
                break;
            }
        }
    }

    public String toString() {
        return "SFDevice:" + this.ccJ();
    }

    protected abstract String ccJ();

    protected void cbg() {
        assert (this.jLT);
        this.jLT = false;
    }

    protected void dRg() {
    }

    private boolean uD(boolean bl) {
        if (bl == this.nSb) {
            return false;
        }
        this.nSb = bl;
        this.dRg();
        return true;
    }

    private static final String VJ(int n) {
        return null;
    }
}

