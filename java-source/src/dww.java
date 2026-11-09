/*
 * Decompiled with CFR.
 */
public class dww
extends dwa {
    private dwr hmy = null;

    public dwr bDM() {
        return this.hmy;
    }

    public dww() {
        super(dwr.hmd);
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
        this.hmy = dwr.c(lmn2.euT(), lmn2.euS());
        if (this.hmy == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSQLResult() : Failed to Parse Database Object!!!");
            assert (false);
            this.bCv();
            return;
        }
        this.bCu();
    }
}

