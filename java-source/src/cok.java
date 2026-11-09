/*
 * Decompiled with CFR.
 */
public class cok
extends coi
implements bto {
    private art ePs;
    private bsx bBe;

    public cok() {
        super(true);
    }

    public void b(bsx bsx2) {
        this.bBe = bsx2;
        this.aIw();
        this.ePs = new art(this.bBe);
        this.ePs.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.ePs);
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    public void receiveMessage(dxq dxq2) {
        super.receiveMessage(dxq2);
    }

    protected void aIw() {
        super.aIw();
    }
}

