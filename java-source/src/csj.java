/*
 * Decompiled with CFR.
 */
public class csj
extends cso {
    public static final boolean fbA = false;
    private boolean fbB = false;
    public static final boolean fbC = false;
    private boolean faV = false;
    public static final boolean fbD = false;
    private boolean faW = false;
    public static final int fbE = 2;
    private int faX = 2;
    public static final int fbF = 16;
    public static final int fbG = 2;

    @Override
    public void a(cqu cqu2) {
        if (cqu2.aZc().getValue() != this.bah()) {
            this.gL(cqu2.aZc().getValue());
            this.bak();
        }
        if (cqu2.aZd().getValue() != this.bai()) {
            this.gM(cqu2.aZd().getValue());
            this.bal();
        }
        if (cqu2.aZj().getValue() != this.bag()) {
            this.tV(cqu2.aZj().getValue());
        }
        if (cqu2.aZe().getValue() != this.baj()) {
            this.gN(cqu2.aZe().getValue());
        }
    }

    @Override
    public void b(cqu cqu2) {
        cqu2.aZc().yP(this.bah());
        cqu2.aZd().yP(this.bai());
        cqu2.aZj().adI(this.bag());
        cqu2.aZe().yP(this.baj());
    }

    public int bag() {
        return this.faX;
    }

    public int tV(int n) {
        if (n < 2) {
            n = 2;
        }
        if (n > 16) {
            n = 16;
        }
        this.faX = n;
        return this.faX;
    }

    public boolean bah() {
        return this.fbB;
    }

    public void gL(boolean bl) {
        this.fbB = bl;
    }

    public boolean bai() {
        return this.faV;
    }

    public void gM(boolean bl) {
        this.faV = bl;
    }

    public boolean baj() {
        return this.faW;
    }

    public void gN(boolean bl) {
        this.faW = bl;
    }

    private void bak() {
        kfy kfy2 = this.WY();
        kfy2.WE(8);
        kfy2.gL(this.bah());
        this.MessageDelegator.b(kfy2);
    }

    private void bal() {
        kfy kfy2 = this.WY();
        kfy2.WE(16);
        kfy2.vn(this.bai());
        this.MessageDelegator.b(kfy2);
    }
}

