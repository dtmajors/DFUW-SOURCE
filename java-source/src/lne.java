/*
 * Decompiled with CFR.
 */
public final class lne
extends lnd {
    private boolean Pp;

    public lne() {
        super(a.rFu);
    }

    public lne(boolean bl) {
        this();
        this.Pp = bl;
    }

    public lne(lne lne2) {
        this();
        this.b(lne2);
    }

    @Override
    protected final boolean evF() {
        return this.Pp;
    }

    @Override
    protected final void yQ(boolean bl) {
        this.Pp = bl;
    }
}

