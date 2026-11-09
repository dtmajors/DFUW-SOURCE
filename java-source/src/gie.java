/*
 * Decompiled with CFR.
 */
public class gie
extends gic {
    public static final int jhU = 1;
    public static final int jhV = 2;
    public static final int goz = 4;
    public static final int iSY = 8;
    public static final int jhW = 16;
    public static final int iWz = 32;
    public static final int jhX = 64;
    public static final int jhY = 128;
    public static final int jhZ = 256;
    public static final int jia = 1;
    public static final int jib = 2;
    public static final int jic = 4;
    public static final int jid = 8;
    public static final int jie = 16;
    public static final int jif = 32;
    public static final int jig = 64;
    public static final int jih = 128;
    protected int fFL = -1;
    protected int fFM = -1;
    protected ljp fFN = null;
    protected ljp fFO = null;
    protected lcq dMT = null;
    protected String fFP = null;
    protected ldv se = null;

    gie() {
        super(257);
    }

    public void JA(int n) {
        this.fFL = n;
    }

    public int bVb() {
        return this.fFL;
    }

    public void JB(int n) {
        this.fFN.x = n;
    }

    public int bVc() {
        return (int)this.fFN.x;
    }

    public void JC(int n) {
        this.fFN.y = n;
    }

    public int bVd() {
        return (int)this.fFN.y;
    }

    public void setColor(lcq lcq2) {
        this.dMT = lcq2;
    }

    public lcq getColor() {
        return this.dMT;
    }

    public float bVe() {
        return this.dMT.a;
    }

    public float bVf() {
        return this.dMT.r;
    }

    public float bVg() {
        return this.dMT.g;
    }

    public float bVh() {
        return this.dMT.b;
    }

    public void setText(String string) {
        this.fFP = string;
    }

    public String getText() {
        return this.fFP;
    }

    public void ma(ldv ldv2) {
        this.se = ldv2;
    }

    public ldv beb() {
        return this.se;
    }

    public int bdX() {
        return this.fFM;
    }

    public void xf(int n) {
        this.fFM = n;
    }

    public ljp bdZ() {
        return this.fFO;
    }

    public void h(ljp ljp2) {
        this.fFO = ljp2;
    }

    public ljp bdY() {
        return this.fFN;
    }

    public void g(ljp ljp2) {
        this.fFN = ljp2;
    }
}

