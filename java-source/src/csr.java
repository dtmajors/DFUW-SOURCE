/*
 * Decompiled with CFR.
 */
public class csr
extends cso {
    public static final a fcP = a.fcR;
    private a fcQ = fcP;

    @Override
    public void a(cqu cqu2) {
        if (cqu2.aZq().evQ() != this.baT()) {
            this.a(cqu2.aZq().evQ());
            this.baS();
        }
    }

    @Override
    public void b(cqu cqu2) {
        cqu2.aZq().c(this.baT());
    }

    private void baS() {
        kso kso2 = this.WW();
        kso2.qay = 1;
        kso2.qaz = this.fcQ.ordinal();
        this.MessageDelegator.a(kso2);
    }

    public a baT() {
        return this.fcQ;
    }

    public void a(a a2) {
        this.fcQ = a2;
    }
}

