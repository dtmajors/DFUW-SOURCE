/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class dre
extends dqv
implements bto {
    public static final int gSp = 1;
    private boolean gSq = false;
    private dfi gSr;
    private String gSs = "planets/stardome2.xml";
    private float doR = 1.0f;

    public dre() {
        this.ObjectType = 90;
        this.gQo = bfb.dfT;
        bew.d(this.gQo);
        this.GUID = lcr.qDU;
    }

    @Override
    public void initialize() {
        this.iW(true);
        this.buA();
        super.initialize();
    }

    @Override
    public void doTick(ldz ldz2) {
        this.buA();
        if (this.gSr != null) {
            float f2 = Math.abs((float)Math.sin(ldz2.rgz));
            lcq lcq2 = new lcq(1.0f, 1.0f, 1.0f, this.doR);
            this.gSr.l(lcq2);
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.gSr != null) {
            this.MessageDelegator.hd(this.gSr.getGUID());
        }
    }

    public dfi bvn() {
        return this.gSr;
    }

    @Override
    public void buA() {
        if (this.gPb == 0) {
            return;
        }
        if ((this.gPb & 2) != 0) {
            if (this.gSq) {
                if (this.gSr != null) {
                    this.gPb = 0;
                    return;
                }
                this.gSr = new dfi();
                this.gSr.go(150.0f);
                this.gSr.c(new ljq(0.0f, 0.0f, 0.0f));
                this.gSr.a(new lgl(0.0f, 0.0f, 0.0f, 1.0f));
                this.gSr.bM(new ljq(1.0f, 1.0f, 1.0f));
                this.gSr.l(lcq.BRIGHT_WHITE);
                this.gSr.iL(this.gSs);
                this.gSr.hR(true);
                this.gSr.setGUID(this.MessageDelegator.bzv());
                this.MessageDelegator.a(this.gSr);
            } else {
                if (this.gSr == null) {
                    this.gPb = 0;
                    return;
                }
                this.MessageDelegator.hd(this.gSr.getGUID());
                this.MessageDelegator.oa(this.gSr.getGUID());
                this.gSr = null;
            }
        }
        this.gPb = 0;
    }

    @Override
    public Object gG(int n) {
        switch (n) {
            case 1: {
                return this.gSq;
            }
        }
        lfn.b(4, this.getClass().getName(), "getPropertyValue() : Unknown PropertyID = " + n);
        assert (false);
        return null;
    }

    @Override
    public void a(int n, Object object) {
        switch (n) {
            case 1: {
                this.iW((Boolean)object);
                break;
            }
            default: {
                lfn.b(4, this.getClass().getName(), "setPropertyValue() : Unknown PropertyID = " + n);
                assert (false);
                break;
            }
        }
    }

    public boolean bvo() {
        return this.gSq;
    }

    public void iW(boolean bl) {
        this.gPb |= 2;
        this.gSq = bl;
    }

    public float getAlpha() {
        return this.doR;
    }

    public void hz(float f2) {
        this.doR = f2;
    }
}

