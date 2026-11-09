/*
 * Decompiled with CFR.
 */
public class krr
extends ksl {
    public static final int pYq = 1;
    public static final int pYr = 2;
    public static final int pYs = 1;
    public static final int pYt = 2;
    public static final int pYu = 4;
    public static final int pYv = 8;
    public static final int pYw = 16;
    public static final int pYx = 32;
    public static final int pYy = 64;
    public static final int pYz = 128;
    protected int pYA = 0;
    protected int pYB = 0;
    protected boolean pYC;
    protected ldv Rs = null;
    protected String pYD = null;
    protected String pYE = null;
    protected String pYF = null;
    protected ljq Position = null;
    protected lgl Rotation = null;
    protected int ObjectType = 0;
    protected ldv aCE = null;
    protected boolean Visible = true;
    protected boolean pYG = false;

    krr() {
        this.pZN = 1;
    }

    public int egk() {
        return this.pYA;
    }

    public void aaz(int n) {
        this.pYA = n;
    }

    public int egl() {
        return this.pYB;
    }

    public void aaA(int n) {
        this.pYB = n;
    }

    public boolean egm() {
        return this.pYC;
    }

    public void xC(boolean bl) {
        this.pYC = bl;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public String egn() {
        return this.pYD;
    }

    public void xc(String string) {
        this.pYD = string;
    }

    public String ego() {
        return this.pYE;
    }

    public void xd(String string) {
        this.pYE = string;
    }

    public String egp() {
        return this.pYF;
    }

    public void xe(String string) {
        this.pYF = string;
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

    public int getObjectType() {
        return this.ObjectType;
    }

    public void setObjectType(int n) {
        this.ObjectType = n;
    }

    public ldv sV() {
        return this.aCE;
    }

    @Override
    public void ts(ldv ldv2) {
        super.ts(ldv2);
        this.aCE = this.ec;
    }

    public void jv(ldv ldv2) {
        this.aCE = ldv2;
    }

    public boolean isVisible() {
        return this.Visible;
    }

    public void setVisible(boolean bl) {
        this.Visible = bl;
    }

    public boolean egq() {
        return this.pYG;
    }

    public void xD(boolean bl) {
        this.pYG = bl;
    }
}

