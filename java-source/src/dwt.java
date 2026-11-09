/*
 * Decompiled with CFR.
 */
public class dwt
extends dwa {
    private dwo hmv = null;

    public dwo bDI() {
        return this.hmv;
    }

    private dwt(String string) {
        super(string);
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
        this.hmv = dwo.b(lmn2.euT(), lmn2.euS());
        if (this.hmv == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSQLResult() : Failed to Parse Database Object!!!");
            assert (false);
            this.bCv();
            return;
        }
        this.bCu();
    }

    public static dwt CP(int n2) {
        return new dwt(dwo.CJ(n2));
    }

    public static dwt CQ(int n2) {
        return new dwt(dwo.CK(n2));
    }

    public static dwt CR(int n2) {
        return new dwt(dwo.CL(n2));
    }
}

