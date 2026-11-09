/*
 * Decompiled with CFR.
 */
public final class jmg {
    private final jmf nvN;
    private final int PC;

    public jmg(jmf jmf2, int n) {
        this.nvN = jmf2;
        this.PC = n;
    }

    public final boolean dMw() {
        return this.nvN.dMo();
    }

    public final boolean dMx() {
        return this.dMw() && this.PC != 0;
    }

    public final boolean dMy() {
        return this.dMw() && this.PC == 0;
    }

    public final boolean dMz() {
        return !this.dMw();
    }

    public final int getValue() {
        assert (this.dMz());
        return this.PC;
    }
}

