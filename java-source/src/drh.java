/*
 * Decompiled with CFR.
 */
public class drh
extends dqv {
    private dfi gSA;
    private dfi gSB;
    private String gSC = "planets/planetary_ring_01.xml";
    private String gSD = "planets/planetary_ring_02.xml";

    public drh() {
        this.ObjectType = 91;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.gSA = new dfi();
        this.gSA.setGUID(this.MessageDelegator.bzv());
        this.gSA.iL(this.gSC);
        this.gSA.go(200.0f);
        this.gSA.c(new ljq(0.0f, 0.0f, 0.0f));
        this.gSA.a(new lgl(0.0f, 0.0f, 0.0f, 1.0f));
        this.gSA.bM(new ljq(1.0f, 1.0f, 1.0f));
        this.gSA.l(lcq.BRIGHT_WHITE);
        this.gSA.hR(true);
        this.MessageDelegator.a(this.gSA);
        this.gSB = new dfi();
        this.gSB.setGUID(this.MessageDelegator.bzv());
        this.gSB.iL(this.gSD);
        this.gSB.go(250.0f);
        this.gSB.c(new ljq(0.0f, 0.0f, 0.0f));
        this.gSB.a(new lgl(0.0f, 0.0f, 0.0f, 1.0f));
        this.gSB.bM(new ljq(1.0f, 1.0f, 1.0f));
        this.gSB.l(lcq.BRIGHT_WHITE);
        this.gSB.hR(true);
        this.MessageDelegator.a(this.gSB);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.MessageDelegator.hd(this.gSA.getGUID());
        this.MessageDelegator.hd(this.gSB.getGUID());
    }

    @Override
    public Object gG(int n) {
        return null;
    }

    @Override
    public void a(int n, Object object) {
    }
}

