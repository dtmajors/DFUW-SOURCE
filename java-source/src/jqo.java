/*
 * Decompiled with CFR.
 */
public class jqo
extends jqj {
    private final lbi<jpp> nSO;

    public jqo(jqx jqx2, ldv ldv2, lbi<jpp> lbi2) {
        super(jqx2, ldv2);
        assert (lbi2 != null);
        this.nSO = lbi2;
    }

    public final void uE(boolean bl) {
        this.nHJ.a(this.dbx, bl, new int[0]);
    }

    public final void dRh() {
        this.nHJ.th(this.dbx);
    }

    public final void b(int n, int n2, int n3, int n4, int n5, int n6) {
        assert (lda.acc(n6));
        jpp jpp2 = new jpp(n, n2, n3, n4, n5);
        this.nSO.m(jpp2);
    }

    @Override
    protected String ccJ() {
        return "Winmsg";
    }
}

