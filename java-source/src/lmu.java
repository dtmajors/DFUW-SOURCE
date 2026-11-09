/*
 * Decompiled with CFR.
 */
public class lmu {
    public static final lmu rET = new lmu();
    public final lmu rEU;

    private lmu() {
        this.rEU = null;
    }

    public lmu(lmu lmu2) {
        this.rEU = lmu2;
    }

    public final lmv euX() {
        lmv lmv2 = this.dPk();
        assert (lmv2.evb() == this);
        return lmv2;
    }

    public final lmu euY() {
        assert (this.rEU != null || this == rET);
        return this.rEU;
    }

    public final boolean a(lmu lmu2) {
        do {
            if (!lmu2.b(this)) continue;
            return true;
        } while ((lmu2 = lmu2.euY()) != null);
        return false;
    }

    public final String getName() {
        return this.ccJ();
    }

    public final lmu euZ() {
        return this.eva();
    }

    public boolean equals(Object object) {
        if (object instanceof lmu) {
            return this.b((lmu)object);
        }
        assert (false);
        return false;
    }

    public final boolean b(lmu lmu2) {
        if (this == lmu2) {
            return true;
        }
        return this.euZ() == lmu2.euZ();
    }

    public final boolean g(lmv lmv2) {
        if (!this.b(lmv2.evb())) {
            return false;
        }
        lmv lmv3 = this.dPk();
        lmv3.i(lmv2);
        return lmv3.j(lmv2);
    }

    protected lmv dPk() {
        assert (false);
        return null;
    }

    protected String ccJ() {
        return "Document";
    }

    protected lmu eva() {
        return this;
    }
}

