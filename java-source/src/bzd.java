/*
 * Decompiled with CFR.
 */
public class bzd {
    private static final boolean dtQ = false;
    private static final double edt = 0.06;
    private final byx dZu;
    private bzc edu = null;
    private bzc edv = null;
    private boolean edw = false;

    public bzd(byx byx2) {
        assert (byx2 != null);
        assert (!byx2.isServerObject());
        this.dZu = byx2;
    }

    public boolean aFd() {
        return this.edw;
    }

    public void fm(boolean bl) {
        this.edw = bl;
    }

    public void P(ldz ldz2) {
        if (this.edu != null && this.edu.QM <= ldz2.rgz) {
            this.dZu.b(this.edu);
            this.edu = null;
        }
    }

    public void a(bzc bzc2) {
        this.dZu.a(bzc2);
        if (this.edw) {
            this.edw = false;
        } else if (this.edv != null && this.edv.equals(bzc2)) {
            return;
        }
        this.edv = bzc2.aFa();
        if (this.edu == null) {
            if (bzc2.edl) {
                assert (bzc2.edr != null);
                assert (bzc2.edr.length > 0);
                this.dZu.b(bzc2);
            } else {
                this.edu = bzc2.aFa();
                this.edu.QM = this.aFe() + 0.06;
                bzc2.edl = true;
                this.dZu.b(bzc2);
            }
        } else {
            assert (!this.edu.edl);
            if (bzc2.edl) {
                assert (bzc2.edr != null);
                assert (bzc2.edr.length > 0);
                this.edu = null;
                this.dZu.b(bzc2);
            } else {
                this.edu = bzc2.aFa();
                this.edu.QM = this.aFe() + 0.06;
                bzc2.edl = true;
                this.dZu.b(bzc2);
            }
        }
    }

    private double aFe() {
        return this.dZu.aDd().getMessageDelegator().arc().rgz;
    }
}

