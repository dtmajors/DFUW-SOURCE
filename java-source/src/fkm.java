/*
 * Decompiled with CFR.
 */
public class fkm
extends fkc
implements dxu {
    public static final int iOH = 1;
    public static final int iOI = 2;
    public static final int iOJ = 3;
    public static final int iOK = 4;
    public static final int iOL = 5;
    public int aqs = -1;
    public int ija = 0;
    public int iOM = -1;
    public String iON = null;
    public String ResourceName = null;
    public int iOO = -1;
    public dpi gMv;
    public ldv aCK = null;
    public int iOP = -1;

    public void a(fkm fkm2) {
        this.aqs = fkm2.aqs;
        this.ija = fkm2.ija;
        this.iOM = fkm2.iOM;
        this.iON = fkm2.iON;
        this.ResourceName = fkm2.ResourceName;
        this.iOO = fkm2.iOO;
        this.gMv = fkm2.gMv;
        this.aCK = fkm2.aCK;
        this.iOP = fkm2.iOP;
    }

    @Deprecated
    private fkm() {
        super(0);
    }

    protected fkm(int n) {
        super(n);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }
}

