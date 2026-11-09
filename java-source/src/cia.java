/*
 * Decompiled with CFR.
 */
public class cia {
    private final cic eAr;
    private final int eyG;
    private final cib eAs;
    private final boolean aFw;
    private final float[] eAt;
    private final long Duration;
    private final int Cost;
    private final boolean eAu;
    private final boolean eAv;

    protected cia(cic cic2, int n, cib cib2, boolean bl, float[] fArray, long l, int n2, boolean bl2, boolean bl3) {
        assert (fArray != null && fArray.length > 0);
        this.eAr = cic2;
        this.eyG = n;
        this.eAs = cib2;
        this.aFw = bl;
        this.eAt = fArray;
        this.Duration = l;
        this.Cost = n2;
        this.eAu = bl2;
        this.eAv = bl3;
    }

    public float qd(int n) {
        if (n >= this.eAt.length || n < 0) {
            assert (false);
            return 0.0f;
        }
        return this.eAt[n];
    }

    public int aOI() {
        assert (this.eAt != null && this.eAt.length > 0);
        return this.eAt.length;
    }

    public final cic aOJ() {
        return this.eAr;
    }

    public final int aOK() {
        return this.eyG;
    }

    public final cib aOL() {
        return this.eAs;
    }

    public final boolean aOM() {
        return this.aFw;
    }

    public final long getDuration() {
        return this.Duration;
    }

    public final int cl() {
        return this.Cost;
    }

    public final boolean aON() {
        return this.eAu;
    }

    public final boolean aOO() {
        return this.eAv;
    }

    public static int aM(int n, int n2) {
        return n * n2;
    }

    public static int aN(int n, int n2) {
        cia cia2 = lea.epN().qe(n);
        if (cia2 == null) {
            assert (false);
            return 0;
        }
        return cia.aM(cia2.cl(), n2);
    }
}

