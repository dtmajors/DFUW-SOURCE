/*
 * Decompiled with CFR.
 */
public class lhu {
    public static final lhu rnR = new lhu(0, 0, "");
    public final String Name;
    public final lgg kec;
    public final lhf kLY;
    public final boolean rnS;
    public final boolean rnT;

    public lhu(int n, int n2, int n3, int n4, String string, boolean bl, boolean bl2) {
        this(new lgg(n, n2), new lhf(n3, n4), string, bl, bl2);
    }

    public lhu(lhf lhf2, String string) {
        this(lgg.rlI, lhf2, string, false, false);
    }

    public lhu(lgg lgg2, lhf lhf2, String string) {
        this(lgg2, lhf2, string, false, false);
    }

    public lhu(lgg lgg2, lhf lhf2, String string, boolean bl, boolean bl2) {
        assert (string != null);
        this.kec = lgg2;
        this.kLY = lhf2;
        this.Name = string;
        this.rnS = bl;
        this.rnT = bl2;
    }

    public lhu(int n, int n2, String string) {
        this(lgg.rlI, new lhf(n, n2), string, false, false);
    }

    public lhu(int n, int n2, String string, boolean bl, boolean bl2) {
        this(0, 0, n, n2, string, bl, bl2);
    }

    public lhu(int n, int n2, int n3, int n4, String string) {
        this(n, n2, n3, n4, string, false, false);
    }

    public static lhu a(lfu lfu2, lhu lhu2) {
        int n = lfu2.ad("X", lhu2.kec.cf);
        int n2 = lfu2.ad("Y", lhu2.kec.cg);
        int n3 = lfu2.ad("W", lhu2.kLY.rmN);
        int n4 = lfu2.ad("H", lhu2.kLY.H);
        String string = lfu2.aA("Name", lhu2.Name);
        if (n == lhu2.kec.cf && n2 == lhu2.kec.cg && n3 == lhu2.kLY.rmN && n4 == lhu2.kLY.H && string.equals(lhu2.Name)) {
            return lhu2;
        }
        return new lhu(n, n2, n3, n4, string);
    }

    public String toString() {
        return null;
    }

    public boolean equals(Object object) {
        if (object instanceof lhu) {
            return this.g((lhu)object);
        }
        return false;
    }

    public boolean g(lhu lhu2) {
        if (!this.kec.T(lhu2.kec)) {
            return false;
        }
        if (!this.kLY.r(lhu2.kLY)) {
            return false;
        }
        return this.Name.equals(lhu2.Name);
    }

    public static boolean a(lhu lhu2, lhu lhu3) {
        if (lhu2 == null && lhu3 == null) {
            return true;
        }
        if (lhu2 == null) {
            return false;
        }
        if (lhu3 == null) {
            return false;
        }
        return lhu2.g(lhu3);
    }
}

