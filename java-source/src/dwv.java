/*
 * Decompiled with CFR.
 */
public class dwv
extends dwa {
    private int SN = -1;
    private dwq hmx = null;

    public int qe() {
        return this.SN;
    }

    public dwq bDL() {
        return this.hmx;
    }

    public dwv(int n2) {
        super(dwq.CM(n2));
        this.SN = n2;
    }

    @Override
    public boolean bCh() {
        if (this.bCq() == null || this.bCq().isEmpty() || !this.Initialized) {
            return false;
        }
        this.b(this.bCq(), 0, "Darkfall_Read");
        return true;
    }

    @Override
    protected void e(lmn lmn2, int n2) {
        if (lmn2.euT() == null || lmn2.euT().length != 1) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSQLResult() : Result Does Not Contain 1, And Only 1, Row!!!");
            assert (false);
            this.bCv();
        } else {
            this.hmx = dwq.a(this.SN, lmn2.euT()[0].euV(), lmn2.euS());
            this.bCu();
        }
    }
}

