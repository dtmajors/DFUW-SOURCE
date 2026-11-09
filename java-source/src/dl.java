/*
 * Decompiled with CFR.
 */
public class dl
extends dqn
implements bto {
    private double mN = 1.4;
    private boolean mO = false;

    public dl() {
        this.ObjectType = 72;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    @Override
    public void a(uk[] ukArray, boolean bl) {
        if (ukArray == null) {
            lfn.b(5, "SFRotateY", "handleSubscriptionEvent() PropertyUpdates is null for object " + this.GUID);
            return;
        }
        for (int i = 0; i < ukArray.length; ++i) {
            this.a(ukArray[i]);
        }
    }

    protected void a(uk uk2) {
        switch (uk2.Uo) {
            default: 
        }
    }

    private void b(ldz ldz2, ldv ldv2) {
        double d2 = Math.PI * ldz2.qwh * this.mN;
        ljq ljq2 = new ljq(0.0f, 0.0f, 0.0f);
        ljq ljq3 = new ljq(0.0f, (float)d2, 0.0f);
        ftv ftv2 = (ftv)this.MessageDelegator.h(1025, this.GUID, ldv2);
        ftv2.c(ljq2);
        ftv2.a(new lgl(ljq3));
        ftv2.HT(64);
        this.MessageDelegator.F(ftv2);
    }

    private void a(ldv ldv2, boolean bl) {
        fts fts2 = (fts)this.MessageDelegator.h(1031, this.GUID, ldv2);
        fts2.iA(bl);
        this.MessageDelegator.F(fts2);
    }
}

