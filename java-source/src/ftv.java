/*
 * Decompiled with CFR.
 */
public class ftv
extends ftt {
    public static final int gpo = 1;
    public static final int gpp = 2;
    public static final int gpq = 4;
    public static final int iWe = 1;
    public static final int iWf = 2;
    public static final int iWg = 3;
    protected int sZ = 0;
    protected int iWh = 0;
    public static final int iWi = 1;
    public static final int iWj = 2;
    public static final int iWk = 4;
    public static final int iWl = 8;
    public static final int iWm = 16;
    public static final int iWn = 32;
    public static final int iWo = 64;
    public static final int iWp = 128;
    public static final int iWq = 32;
    public static final int iWr = 33;
    protected int iFO = 0;
    protected ljq Position;
    protected lgl Rotation;
    private boolean iWs = false;

    ftv() {
        super(1025);
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public int bRZ() {
        return this.iFO;
    }

    public void HT(int n) {
        this.iFO = n;
    }

    public int bSa() {
        return this.sZ;
    }

    public void HU(int n) {
        this.sZ = n;
    }

    public int bSb() {
        return this.iWh;
    }

    public void HV(int n) {
        this.iWh = n;
    }

    public boolean bSc() {
        return this.iWs;
    }

    public void ly(boolean bl) {
        this.iWs = bl;
    }
}

