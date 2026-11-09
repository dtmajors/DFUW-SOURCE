/*
 * Decompiled with CFR.
 */
public class csu
extends cso {
    public static final int fdL = 50;
    private int fdM = 50;
    public static final int fdN = 50;
    public static final int fdO = 200;
    public static final int fdP = 30000;
    private int fdQ = 30000;
    public static final int fdR = 10000;
    public static final int fdS = 100000;

    @Override
    public void a(cqu cqu2) {
        if (cqu2.aZa().getValue() != this.bbh()) {
            this.ub(cqu2.aZa().getValue());
            this.bbj();
        }
        if (cqu2.aZb().getValue() != this.bbi()) {
            this.uc(cqu2.aZb().getValue());
            this.bbj();
        }
    }

    @Override
    public void b(cqu cqu2) {
        cqu2.aZa().adI(this.bbh());
        cqu2.aZb().adI(this.bbi());
    }

    public int bbh() {
        return this.fdM;
    }

    public int ub(int n) {
        if (n < 50) {
            n = 50;
        }
        if (n > 200) {
            n = 200;
        }
        this.fdM = n;
        return this.fdM;
    }

    public int bbi() {
        return this.fdQ;
    }

    public int uc(int n) {
        if (n < 10000) {
            n = 10000;
        }
        if (n > 100000) {
            n = 100000;
        }
        this.fdQ = n;
        return this.fdQ;
    }

    private void bbj() {
        kgq kgq2 = this.baK();
        kgq2.Xi(3);
        kgq2.lS(this.bbh());
        kgq2.Xh(this.bbi());
        this.MessageDelegator.b(kgq2);
    }
}

