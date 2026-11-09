/*
 * Decompiled with CFR.
 */
public class lhv {
    public static final lhv rnU = new lhv(lhu.rnR.kLY.rmN, lhu.rnR.kLY.H, "", "");
    public final lhf kLY;
    private final lhu rnV;
    private final lhu rnW;

    public lhv(int n, int n2, String string, String string2, boolean bl, boolean bl2) {
        lhf lhf2;
        assert (string != null);
        assert (string2 != null);
        lgg lgg2 = lgg.rlI;
        this.kLY = lhf2 = new lhf(n, n2);
        this.rnV = new lhu(lgg2, lhf2, string, bl, bl2);
        this.rnW = new lhu(lgg2, lhf2, string2, bl, bl2);
    }

    public lhv(lhu lhu2) {
        this(lhu2.kLY.rmN, lhu2.kLY.H, lhu2.Name, lhu2.Name, lhu2.rnS, lhu2.rnT);
    }

    public lhv(int n, int n2, String string, String string2) {
        this(n, n2, string, string2, false, false);
    }

    public lhu acS(int n) {
        switch (n) {
            case 0: {
                return this.rnV;
            }
            case 1: {
                return this.rnW;
            }
        }
        assert (false);
        return this.rnW;
    }

    public String toString() {
        return null;
    }
}

