/*
 * Decompiled with CFR.
 */
public final class lox {
    final String Identifier;
    final loy[] rHh;
    private static final loy[] rHi = new loy[0];

    lox(String string) {
        this.rHh = rHi;
        this.Identifier = string;
        lpd.rHs.j(this);
    }

    lox(String string, loy ... loyArray) {
        this.Identifier = string;
        this.rHh = loyArray == null ? rHi : loyArray;
        lpd.rHs.j(this);
    }

    public final loz bD(Object ... objectArray) {
        return new loz(this, objectArray);
    }

    public String getIdentifier() {
        return this.Identifier;
    }
}

