/*
 * Decompiled with CFR.
 */
public class csk
extends cso {
    public static final boolean fbH = false;
    private boolean fbI = false;

    @Override
    public void a(cqu cqu2) {
        if (cqu2.aZx().getValue() != this.ban()) {
            this.gO(cqu2.aZx().getValue());
            this.bam();
        }
    }

    @Override
    public void b(cqu cqu2) {
        cqu2.aZx().yP(this.ban());
    }

    private void bam() {
        kgp kgp2 = this.WT();
        kgp2.Xa(0x10000010);
        kgp2.wr(true);
        kgp2.wz(this.ban());
        this.MessageDelegator.b(kgp2);
    }

    public boolean ban() {
        return this.fbI;
    }

    public void gO(boolean bl) {
        this.fbI = bl;
    }
}

