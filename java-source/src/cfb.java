/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 */
public class cfb {
    private final cex aaY;
    private ew etP = null;
    private ldv etQ = null;
    private int etR = 0;

    public cfb(cex cex2) {
        this.aaY = cex2;
    }

    public void initialize() {
        this.etP = this.aaY.fi().ao(10400);
        if (this.etP != null) {
            this.etR = 0;
            this.etP.bi(this.etR);
        }
    }

    public void kG(ldv ldv2) {
        assert (ldv2 != null);
        if (this.etP == null) {
            return;
        }
        assert (this.etP.fQ() >= 0) : "Current Power Level : " + this.etP.fQ();
        assert (this.etP.fQ() <= 3) : "Current Power Level : " + this.etP.fQ();
        assert (this.etP.fQ() == this.etR);
        if (this.etQ != null && this.etQ.equals(ldv2)) {
            if (this.etR == 3) {
                this.aJK();
                return;
            }
            ++this.etR;
            this.etP.bi(this.etR);
        } else {
            this.etQ = ldv2;
            this.etR = 1;
            this.etP.bi(this.etR);
        }
    }

    public void aJK() {
        if (this.etQ == null) {
            return;
        }
        if (this.etP == null) {
            return;
        }
        this.etQ = null;
        this.etR = 0;
        this.etP.bi(this.etR);
    }
}

