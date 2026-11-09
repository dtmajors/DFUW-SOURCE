/*
 * Decompiled with CFR.
 */
public class bgg {
    public static final int diI = 0;
    public static final int diJ = 1;
    public static final int diK = 2;
    public static final int diL = 3;
    public static final int diM = 4;
    public static final int diN = 5;
    public static final int diO = 6;
    public static final int diP = 7;
    private ldv diQ;
    private String YL;
    private String hE;
    private String diR;
    private ljq diS = new ljq();
    private boolean diT = false;
    private int Type = 0;
    private int Race;
    private int diU;
    private int di;

    public ldv aoC() {
        return this.diQ;
    }

    public void hh(ldv ldv2) {
        this.diQ = ldv2;
    }

    public String getInfo() {
        return this.diR;
    }

    public void setInfo(String string) {
        if (string == null) {
            return;
        }
        this.diR = string;
    }

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public String iU() {
        return this.YL;
    }

    public void fm(String string) {
        if (string == null) {
            return;
        }
        this.YL = string;
    }

    public String aR() {
        return this.hE;
    }

    public void G(String string) {
        if (string == null) {
            return;
        }
        this.hE = string;
    }

    public ljq oB() {
        return this.diS;
    }

    public void aP(ljq ljq2) {
        this.diS = ljq2;
    }

    public boolean aoD() {
        return this.diT;
    }

    public void dh(boolean bl) {
        this.diT = bl;
    }

    public final int cB() {
        return this.Race;
    }

    public final void P(int n) {
        this.Race = n;
    }

    public final int aoE() {
        return this.diU;
    }

    public final void kJ(int n) {
        this.diU = n;
    }

    public int ib() {
        return this.di;
    }

    public void bN(int n) {
        this.di = n;
    }
}

