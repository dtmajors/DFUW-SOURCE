/*
 * Decompiled with CFR.
 */
public class ksq
extends ksk {
    public static final int jzn = 1;
    public static final int jzo = 2;
    public static final int jzp = 4;
    public static final int jzq = 8;
    public static final int jzr = 16;
    private ldv ev;
    private int jzs;
    private String jzt;
    private String jzu;
    private String jzv;
    private String jzw;
    private String jzx;
    private String[] jzy;
    private lgy[] jzz = null;
    private boolean jzA;
    private String jzB;
    private boolean jzC = true;
    private boolean jzD;
    private boolean jzE;
    private boolean jzF = false;
    float daN;

    ksq() {
        this.pZN = 7;
        this.jzz = new lgy[1];
        this.jzz[0] = new lgy();
        this.jzz[0].Ae("Dummy Anim Map entry");
        this.jzz[0].T(new String[]{"Dummy Anim Map entry"});
    }

    public void setScale(float f) {
        this.daN = f;
    }

    public float getScale() {
        return this.daN;
    }

    public ldv dXg() {
        return this.ev;
    }

    public void tr(ldv ldv2) {
        this.ev = ldv2;
    }

    public int cah() {
        return this.jzs;
    }

    public void Lv(int n) {
        this.jzs = n;
    }

    public String cai() {
        return this.jzt;
    }

    public void lN(String string) {
        this.jzt = string;
    }

    public String caj() {
        return this.jzu;
    }

    public void lO(String string) {
        this.jzu = string;
    }

    public String cak() {
        return this.jzx;
    }

    public void lP(String string) {
        this.jzx = string;
    }

    public String[] cal() {
        return this.jzy;
    }

    public void H(String[] stringArray) {
        this.jzy = stringArray;
    }

    public String cam() {
        return this.jzv;
    }

    public void lQ(String string) {
        this.jzv = string;
    }

    public String can() {
        return this.jzw;
    }

    public void lR(String string) {
        this.jzw = string;
    }

    public lgy[] cao() {
        return this.jzz;
    }

    public void a(lgy[] lgyArray) {
        this.jzz = lgyArray;
    }

    public boolean cap() {
        return this.jzC;
    }

    public void mL(boolean bl) {
        this.jzC = bl;
    }

    public final boolean caq() {
        return this.jzA;
    }

    public final void mM(boolean bl) {
        this.jzA = bl;
    }

    public final String car() {
        return this.jzB;
    }

    public final void lS(String string) {
        this.jzB = string;
    }

    public boolean cat() {
        return this.jzD;
    }

    public void mO(boolean bl) {
        this.jzD = bl;
    }

    public boolean cau() {
        return this.jzE;
    }

    public void mP(boolean bl) {
        this.jzE = bl;
    }

    public boolean cav() {
        return this.jzF;
    }

    public void mQ(boolean bl) {
        this.jzF = bl;
    }
}

