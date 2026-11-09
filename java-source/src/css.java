/*
 * Decompiled with CFR.
 */
public class css
extends cso {
    public static final boolean fcW = true;
    private boolean EnableShadows = true;
    public static final boolean fcX = true;
    private boolean fcY = true;
    public static final boolean fcZ = true;
    private boolean fda = true;
    public static final a fdb = a.fdi;
    private a fdc = fdb;
    public static final b fdd = b.fdn;
    private b fde = fdd;
    public static final boolean fdf = true;

    @Override
    public void a(cqu cqu2) {
        if (cqu2.aZm().getValue() != this.baZ()) {
            this.gW(cqu2.aZm().getValue());
            this.baU();
        }
        if (cqu2.aZn().getValue() != this.bba()) {
            this.gX(cqu2.aZn().getValue());
            this.baU();
        }
        if (cqu2.aZo().evQ() != this.bbb()) {
            this.a(cqu2.aZo().evQ());
            this.baV();
        }
        if (cqu2.aZl().getValue() != this.baY()) {
            this.gV(cqu2.aZl().getValue());
            this.baX();
        }
        if (cqu2.aZp().evQ() != this.bbc()) {
            this.a(cqu2.aZp().evQ());
            this.baW();
        }
    }

    @Override
    public void b(cqu cqu2) {
        cqu2.aZm().yP(this.baZ());
        cqu2.aZn().yP(this.bba());
        cqu2.aZo().c(this.bbb());
        cqu2.aZl().yP(this.baY());
        cqu2.aZp().c(this.bbc());
    }

    private void baU() {
        kgn kgn2 = this.WU();
        kgn2.WS(384);
        kgn2.vD(this.bba());
        kgn2.gW(this.baZ());
        this.MessageDelegator.b(kgn2);
    }

    private void baV() {
        kgn kgn2 = this.WU();
        kgn2.WS(512);
        kgn2.WV(this.bbb().ordinal());
        this.MessageDelegator.b(kgn2);
    }

    private void baW() {
        kgn kgn2 = this.WU();
        kgn2.WS(1024);
        kgn2.WW(this.bbc().ordinal());
        this.MessageDelegator.b(kgn2);
    }

    private void baX() {
        kgn kgn2 = this.WU();
        kgn2.WS(1);
        kgn2.vC(this.baY());
        this.MessageDelegator.b(kgn2);
    }

    public boolean baY() {
        return this.EnableShadows;
    }

    public void gV(boolean bl) {
        this.EnableShadows = bl;
    }

    public boolean baZ() {
        return this.fcY;
    }

    public void gW(boolean bl) {
        this.fcY = bl;
    }

    public boolean bba() {
        return this.fda;
    }

    public void gX(boolean bl) {
        this.fda = bl;
    }

    public a bbb() {
        return this.fdc;
    }

    public void a(a a2) {
        this.fdc = a2;
    }

    public b bbc() {
        return this.fde;
    }

    public void a(b b2) {
        this.fde = b2;
    }
}

