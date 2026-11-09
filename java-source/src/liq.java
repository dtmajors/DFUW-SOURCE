/*
 * Decompiled with CFR.
 */
public class liq
extends lip {
    public final boolean Pp;

    protected liq() {
        this.Pp = false;
    }

    public liq(boolean bl) {
        this.Pp = bl;
    }

    public boolean a(liq liq2) {
        if (liq2 == null) {
            return false;
        }
        return this.Pp == liq2.Pp;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof liq) {
            return this.a((liq)object);
        }
        return super.equals(object);
    }

    @Override
    public String esy() {
        return String.valueOf(this.Pp);
    }
}

