/*
 * Decompiled with CFR.
 */
public abstract class liz
extends lip {
    protected final int PC;

    protected liz() {
        this.PC = 0;
    }

    public liz(int n) {
        this.PC = n;
    }

    public boolean a(liz liz2) {
        return this.PC == liz2.PC;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof liz) {
            return this.a((liz)object);
        }
        return super.equals(object);
    }

    public final int b(liz liz2) {
        return this.PC - liz2.PC;
    }

    @Override
    protected int j(lip lip2) {
        if (lip2 instanceof liz) {
            return this.b((liz)lip2);
        }
        return this.esy().compareTo(lip2.esy());
    }
}

