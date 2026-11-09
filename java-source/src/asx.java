/*
 * Decompiled with CFR.
 */
public class asx {
    private static int bXM = 1;
    private final Integer bXN;
    private final a bXO;

    protected asx(boolean bl, a a2) {
        this.bXN = bl ? Integer.valueOf(bXM++) : Integer.valueOf(0);
        this.bXO = a2;
    }

    protected asx(int n, a a2) {
        this.bXN = n;
        this.bXO = a2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        asx asx2 = (asx)object;
        if (this.bXN == null && asx2.bXN != null || !this.bXN.equals(asx2.bXN)) {
            return false;
        }
        return (this.bXO != null || asx2.bXO == null) && this.bXO.equals((Object)asx2.bXO);
    }

    public Integer UY() {
        return this.bXN;
    }

    public a UZ() {
        return this.bXO;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.bXN == null ? 0 : this.bXN.hashCode());
        n2 = 31 * n2 + (this.bXO == null ? 0 : this.bXO.hashCode());
        return n2;
    }
}

