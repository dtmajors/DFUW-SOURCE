/*
 * Decompiled with CFR.
 */
public final class lei
implements Comparable<lei> {
    private int PC;

    public static int zv(String string) {
        return Integer.parseInt(string);
    }

    public static lei zw(String string) {
        return new lei(lei.zv(string));
    }

    public lei() {
    }

    public lei(int n) {
        this.PC = n;
    }

    public final int intValue() {
        return this.PC;
    }

    public final boolean equals(Object object) {
        if (object instanceof lei) {
            return ((lei)object).PC == this.PC;
        }
        assert (false);
        return false;
    }

    public final int hashCode() {
        return this.PC;
    }

    public final String toString() {
        return null;
    }

    public void za(String string) {
        this.PC = lei.zv(string);
    }

    public final int c(lei lei2) {
        return this.PC - lei2.PC;
    }

    public static final int P(int n, int n2, int n3) {
        assert (n2 <= n3);
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }

    public void setValue(int n) {
        this.PC = n;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.c((lei)object);
    }
}

