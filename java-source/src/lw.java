/*
 * Decompiled with CFR.
 */
public abstract class lw {
    protected ldv Ri;
    protected String FirstName;
    protected String LastName;
    protected boolean adc;

    public final ldv qd() {
        return this.Ri;
    }

    public final int qe() {
        return this.Ri.enw();
    }

    public final String cz() {
        return this.FirstName;
    }

    public final String cA() {
        return this.LastName;
    }

    public final boolean qf() {
        return this.adc;
    }

    public final void ac(boolean bl) {
        this.adc = bl;
    }

    public final void j(String string, String string2) {
        this.FirstName = string;
        this.LastName = string2;
    }
}

