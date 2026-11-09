/*
 * Decompiled with CFR.
 */
public class ljg
extends lip {
    public static final ljg roH = new ljg("");
    public static final ljg roI = new ljg(" ");
    private final String rkd;

    protected ljg() {
        this.rkd = "";
    }

    public ljg(String string) {
        assert (string != null);
        this.rkd = string;
    }

    @Override
    public String esy() {
        return this.rkd;
    }

    public boolean a(ljg ljg2) {
        return lin.i(this.rkd, ljg2.rkd);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ljg) {
            return this.a((ljg)object);
        }
        return super.equals(object);
    }

    public final int b(ljg ljg2) {
        return this.rkd.compareTo(ljg2.rkd);
    }

    @Override
    protected int j(lip lip2) {
        if (lip2 instanceof ljg) {
            return this.b((ljg)lip2);
        }
        return this.esy().compareTo(lip2.esy());
    }
}

