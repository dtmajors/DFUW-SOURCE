/*
 * Decompiled with CFR.
 */
public class dwu
extends dwa {
    private dwp hmw = null;
    private boolean hmt = false;

    public dwp bDJ() {
        return this.hmw;
    }

    private dwu(String string, boolean bl) {
        super(string);
        this.hmt = bl;
    }

    @Override
    public boolean bCh() {
        if (this.bCq() == null || this.bCq().isEmpty() || !this.Initialized) {
            return false;
        }
        this.b(this.bCq(), 0, this.hmt ? "Darkfall" : "Darkfall_Read");
        return true;
    }

    @Override
    protected void e(lmn lmn2, int n2) {
        if (this.hmt) {
            if (lmn2.euU() == 0) {
                this.bCv();
                return;
            }
            this.bCu();
            return;
        }
        if (lmn2.euT() == null || lmn2.euS() == null || lmn2.euS().length == 0) {
            this.bCv();
            return;
        }
        if (lmn2.euT().length > 1) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSQLResult() : System Entry Query Returned Multiple Rows!!!");
            assert (false);
            this.bCv();
            return;
        }
        this.hmw = lmn2.euT().length == 0 ? new dwp() : dwp.h(lmn2.euT()[0].euV(), lmn2.euS());
        this.bCu();
    }

    public static dwu bDK() {
        return new dwu(dwp.bDx(), false);
    }

    public static dwu l(dwp dwp2) {
        return new dwu(dwp.k(dwp2), true);
    }
}

