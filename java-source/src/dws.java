/*
 * Decompiled with CFR.
 */
import java.util.List;

public class dws
extends dwa {
    private static final int hmn = 1;
    private static final int hmo = 2;
    private int hmp = -1;
    private dwn hmq = null;
    private int hmr = -1;
    private List<dwn> hms = null;
    private boolean hmt = false;
    private int hmu = 0;

    public dwn bDG() {
        return this.hmq;
    }

    public List<dwn> bDH() {
        return this.hms;
    }

    private dws(String string, boolean bl, int n2, dwn dwn2, int n3, int n4) {
        super(string);
        this.hmt = bl;
        this.hmp = n2;
        this.hmq = dwn2;
        this.hmr = n3;
        this.hmu = n4;
    }

    @Override
    public boolean bCh() {
        if (this.bCq() == null || this.bCq().isEmpty() || !this.Initialized) {
            return false;
        }
        this.b(this.bCq(), this.hmu, this.hmt ? "Darkfall" : "Darkfall_Read");
        return true;
    }

    @Override
    protected void e(lmn lmn2, int n2) {
        if (this.hmt) {
            if (lmn2.euU() == 0) {
                lfn.b(5, this.getClass().getSimpleName(), "handleSQLResults() : Write Query Affected No Rows!!!");
                this.bCv();
                return;
            }
            this.bCu();
            return;
        }
        if (lmn2.euT() == null || lmn2.euS() == null || lmn2.euS().length == 0) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSQLResults() : Malformed Result!!!");
            this.bCv();
            return;
        }
        switch (n2) {
            case 1: {
                if (this.hmq == null) {
                    this.hmq = new dwn(this.hmp);
                }
                this.hmq.f(lmn2.euT().length == 0 ? null : lmn2.euT()[0].euV(), lmn2.euS());
                break;
            }
            case 2: {
                this.hms = lcn.emA();
                for (int i2 = 0; i2 < lmn2.euT().length; ++i2) {
                    dwn dwn2 = dwn.g(lmn2.euT()[i2].euV(), lmn2.euS());
                    if (dwn2 == null) {
                        lfn.b(5, this.getClass().getSimpleName(), "handleSQLResult() : Failed to Parse Leader-Board Entry from Results!!!");
                        assert (false);
                        continue;
                    }
                    this.hms.add(dwn2);
                }
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleSQLResult() : Unrecognised Query Context!!!... Context = " + n2);
                assert (false);
                this.bCv();
                return;
            }
        }
        this.bCu();
    }

    public static dws b(int n2, int n3, dwn.b b2) {
        return new dws(dwn.a(n2, n3, b2), false, n2, null, n3, 1);
    }

    public static dws a(dwn dwn2, int n2, dwn.b b2) {
        return new dws(dwn.a(dwn2.qe(), n2, b2), false, dwn2.qe(), dwn2, n2, 1);
    }

    public static dws b(dwn dwn2, int n2, int n3) {
        return new dws(dwn.a(dwn2, n2, n3), true, dwn2.qe(), dwn2, n2, 0);
    }

    public static dws CO(int n2) {
        return new dws(dwn.CH(n2), false, -1, null, n2, 2);
    }

    public static dws b(List<dwn> list, int n2, int n3) {
        String string = dwn.a(list, n2, n3);
        return string.isEmpty() ? null : new dws(string, true, -1, null, n2, 2);
    }
}

