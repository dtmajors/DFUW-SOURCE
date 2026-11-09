/*
 * Decompiled with CFR.
 */
public class drm
extends dqv {
    private static final int dVk = 1;
    private static final int dVl = 2;
    private static final int gTS = 3;
    protected ljq Position = new ljq(0.0f, 0.0f, 0.0f);
    protected ljq my = new ljq(0.0f, 0.0f, 0.0f);
    protected int gTT = 0;

    public drm() {
        this.ObjectType = 35;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
        this.gPb |= 2;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
        this.gPb |= 4;
    }

    public int bvW() {
        return this.gTT;
    }

    public void BC(int n) {
        this.gTT = n;
        this.gPb |= 8;
    }

    @Override
    public void initialize() {
        assert (false) : "not supported";
        if (!this.Initialized) {
            if (this.MessageDelegator != null) {
                super.initialize();
                this.Initialized = true;
                this.BD(1);
            } else {
                lfn.b(4, "SFWorldGlobalRenderObject", "initialize() Could not initialize since MessageDelegator was null!");
            }
        }
    }

    @Override
    public void cleanUp() {
        if (this.MessageDelegator != null) {
            this.BD(2);
        }
    }

    protected void bvC() {
        gtd gtd2 = (gtd)this.MessageDelegator.h(8962, this.GUID, this.GUID);
        gtd2.c(this.Position);
        gtd2.setRotation(this.my);
        gtd2.BC(this.gTT);
        this.MessageDelegator.I(gtd2);
    }

    protected void BD(int n) {
        assert (this.GUID != null) : "GUID is null.";
        kkd kkd2 = (kkd)this.MessageDelegator.h(1796);
        kkd2.tD(this.GUID);
        kkd2.ts(this.GUID);
        kkd2.Gh(n);
        if (n == 1) {
            kkd2.wD(true);
            kkd2.lQ(false);
        }
        if ((this.gPb & 2) != 0) {
            kkd2.Gh(kkd2.bNW() | 8);
            kkd2.c(this.Position);
        }
        if ((this.gPb & 4) != 0) {
            kkd2.Gh(kkd2.bNW() | 4);
            kkd2.setRotation(this.my);
        }
        if ((this.gPb & 8) != 0) {
            kkd2.Gh(kkd2.bNW() | 0x10);
            kkd2.BC(this.gTT);
        }
        if (n == 1) {
            kkd2.iL(this.ObjectDescriptionFilename);
            lfn.b(0, "SFWorldGlobalRenderObject", "sendGlobalRenderObjectRequest() XML name=" + this.ObjectDescriptionFilename);
            lfn.b(0, "SFWorldGlobalRenderObject", "sendGlobalRenderObjectRequest() GUID=" + this.GUID + ", RequestGUID=" + kkd2.getGUID());
        }
        lfn.b(0, "SFWorldGlobalRenderObject", "sendGlobalRenderObjectRequest() Sending GlobalRenderObjectRequest modifying object " + this.GUID);
        this.MessageDelegator.a(kkd2);
        this.gPb = 0;
    }

    @Override
    public Object gG(int n) {
        return null;
    }

    @Override
    public void a(int n, Object object) {
    }
}

