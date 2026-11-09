/*
 * Decompiled with CFR.
 */
public class gdf
extends gdb {
    public static final int jef = 0;
    public static final int jeg = 1;
    public static final int jeh = 2;
    public static final int jei = 3;
    public static final int jej = 4;
    public static final int jek = 5;
    public static final int jel = 6;
    public static final int jem = 7;
    public static final int jen = 8;
    public static final int jeo = 9;
    private int jep = 0;
    private ldv ComplexQuestGUID = null;
    private ldv jec = null;
    private int aDf = -1;
    private int jed = -1;
    private boolean jeq = false;
    private String ayB = null;

    gdf() {
        super(10244);
    }

    public int bTK() {
        return this.jep;
    }

    public void IR(int n) {
        this.jep = n;
    }

    public ldv bTL() {
        return this.ComplexQuestGUID;
    }

    public void qe(ldv ldv2) {
        this.ComplexQuestGUID = ldv2;
    }

    public boolean bTM() {
        return this.jeq;
    }

    public void lJ(boolean bl) {
        this.jeq = bl;
    }

    public ldv bTN() {
        return this.jec;
    }

    public void qf(ldv ldv2) {
        this.jec = ldv2;
    }

    public String getVendorName() {
        return this.ayB;
    }

    public void fS(String string) {
        this.ayB = string;
    }

    public int qS() {
        return this.aDf;
    }

    public void IS(int n) {
        this.aDf = n;
    }

    public int bTO() {
        return this.jed;
    }

    public void IT(int n) {
        this.jed = n;
    }
}

