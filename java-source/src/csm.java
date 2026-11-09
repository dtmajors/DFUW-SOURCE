/*
 * Decompiled with CFR.
 */
public class csm
extends cso {
    public static final boolean fbM = false;
    private boolean fbN = false;
    public static final boolean fbO = true;
    public static final boolean fbP = true;
    public static final boolean fbQ = true;
    private boolean fbR = true;
    private boolean fbS = true;
    private boolean fbT = true;
    private int fbU = 1000;
    public static final int fbV = 0;
    public static final int fbW = 2000;
    public static final int fbX = 1000;
    private int fbY = 1000;
    public static final int fbZ = 0;
    public static final int fca = 2000;
    public static final int fcb = 1000;

    @Override
    public void a(cqu cqu2) {
        if (cqu2.aYQ().getValue() != this.baq()) {
            this.tW(cqu2.aYQ().getValue());
            this.bas();
        }
        if (cqu2.aYR().getValue() != this.bar()) {
            this.tX(cqu2.aYR().getValue());
            this.bat();
        }
        if (cqu2.aZf().getValue() != this.fbN) {
            this.fbN = cqu2.aZf().getValue();
            this.bau();
        }
        if (cqu2.aZg().getValue() != this.fbR) {
            this.fbR = cqu2.aZg().getValue();
            this.bav();
        }
        if (cqu2.aZi().getValue() != this.fbT) {
            this.fbT = cqu2.aZi().getValue();
            this.baw();
        }
        if (cqu2.aZh().getValue() != this.fbS) {
            this.fbS = cqu2.aZh().getValue();
            this.bax();
        }
    }

    @Override
    public void b(cqu cqu2) {
        cqu2.aYQ().adI(this.baq());
        cqu2.aYR().adI(this.bar());
        cqu2.aZf().yP(this.fbN);
        cqu2.aZg().yP(this.fbR);
        cqu2.aZh().yP(this.fbS);
        cqu2.aZi().yP(this.fbT);
    }

    public int baq() {
        return this.fbU;
    }

    public int tW(int n) {
        if (n < 0) {
            n = 0;
        } else if (n > 2000) {
            n = 2000;
        }
        this.fbU = n;
        return this.fbU;
    }

    public int bar() {
        return this.fbY;
    }

    public int tX(int n) {
        if (n < 0) {
            n = 0;
        }
        if (n > 2000) {
            n = 2000;
        }
        this.fbY = n;
        return this.fbY;
    }

    private void bas() {
        kgp kgp2 = this.WT();
        kgp2.Xa(131072);
        kgp2.Xb(this.baq());
        this.MessageDelegator.b(kgp2);
    }

    private void bat() {
        kgp kgp2 = this.WT();
        kgp2.Xa(262144);
        kgp2.Xc(this.bar());
        this.MessageDelegator.b(kgp2);
    }

    private void bau() {
        kgp kgp2 = this.WT();
        kgp2.Xa(0x4000000);
        kgp2.wh(this.fbN);
        this.MessageDelegator.b(kgp2);
    }

    private void bav() {
        kgp kgp2 = this.WT();
        kgp2.Xa(0x8000000);
        kgp2.wy(this.fbR);
        this.MessageDelegator.b(kgp2);
    }

    private void baw() {
        kgp kgp2 = this.WT();
        kgp2.WY(1);
        kgp2.wg(this.fbT);
        this.MessageDelegator.b(kgp2);
    }

    private void bax() {
        kgp kgp2 = this.WT();
        kgp2.Xa(32);
        kgp2.gQ(this.fbS);
        this.MessageDelegator.b(kgp2);
    }

    public void gP(boolean bl) {
        this.fbR = bl;
    }

    public boolean bay() {
        return this.fbR;
    }

    public boolean baz() {
        return this.fbS;
    }

    public boolean baA() {
        return this.fbT;
    }

    public void gQ(boolean bl) {
        this.fbS = bl;
    }
}

