/*
 * Decompiled with CFR.
 */
public class cwu
extends dqn {
    protected int fFL = -1;
    protected int fFM = -1;
    protected ljp fFN = new ljp();
    protected ljp fFO = new ljp();
    protected lcq dMT = lcq.BRIGHT_WHITE;
    protected String fFP = "";
    protected ldv se;
    protected boolean Visible = true;
    protected float fFy = 0.0f;

    @Override
    public void initialize() {
        if (!this.Initialized) {
            if (this.MessageDelegator != null) {
                this.xd(1);
                this.Initialized = true;
            } else {
                lfn.b(4, this.getClass().getName(), "Could not .initialize(). MessageDelegator was null!");
            }
        }
    }

    @Override
    public void cleanUp() {
        if (this.MessageDelegator != null) {
            knr knr2 = (knr)this.MessageDelegator.h(260);
            knr2.ts(this.GUID);
            knr2.hC(this.GUID);
            knr2.Zy(1);
            lfn.b(0, this.getClass().getSimpleName(), "cleanUp() Removing me");
            this.MessageDelegator.a(knr2);
        } else {
            lfn.b(4, this.getClass().getName(), "Could not .cleanUp(). MessageDelegator was null!");
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 257) {
            this.a((gie)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    private void a(gie gie2) {
        int n2 = gie2.bVb();
        if ((gie2.bVb() & 8) != 0) {
            this.setColor(gie2.getColor());
        }
        if ((gie2.bVb() & 0x40) != 0) {
            this.ma(gie2.beb());
        }
        if ((gie2.bVb() & 4) != 0) {
            this.g(gie2.bdY());
        }
        if ((gie2.bVb() & 2) != 0) {
            this.io(gie2.getText());
        }
        if ((gie2.bVb() & 0x20) != 0) {
            this.setVisible(gie2.isVisible());
        }
        if ((gie2.bVb() & 0x80) != 0) {
            this.xf(gie2.bdX());
        }
        if ((gie2.bVb() & 0x100) != 0) {
            this.h(gie2.bdZ());
        }
        this.xd(n2);
    }

    private void xd(int n2) {
        if (this.MessageDelegator != null) {
            koe koe2 = (koe)this.MessageDelegator.h(257);
            koe2.JA(n2);
            koe2.setColor(this.dMT);
            koe2.ma(this.se);
            koe2.hC(this.GUID);
            koe2.setText(this.fFP);
            koe2.g(this.fFN);
            koe2.xf(this.fFM);
            koe2.ts(this.GUID);
            koe2.h(this.fFO);
            koe2.setVisible(this.Visible);
            koe2.gk(this.fFy);
            this.MessageDelegator.a(koe2);
        } else {
            lfn.b(4, this.getClass().getName(), "Could not .sendModify2DTextRequest(" + n2 + "). MessageDelegator was null!");
        }
    }

    public int bdW() {
        return this.fFL;
    }

    public void xe(int n2) {
        this.fFL = n2;
    }

    public int bdX() {
        return this.fFM;
    }

    public void xf(int n2) {
        this.fFM = n2;
    }

    public ljp bdY() {
        return this.fFN;
    }

    public void g(ljp ljp2) {
        this.fFN = ljp2;
    }

    public ljp bdZ() {
        return this.fFO;
    }

    public void h(ljp ljp2) {
        this.fFO = ljp2;
    }

    public lcq getColor() {
        return this.dMT;
    }

    public void setColor(lcq lcq2) {
        this.dMT = lcq2;
    }

    public String bea() {
        return this.fFP;
    }

    public void io(String string) {
        this.fFP = string;
    }

    public ldv beb() {
        return this.se;
    }

    public void ma(ldv ldv2) {
        this.se = ldv2;
    }

    public boolean isVisible() {
        return this.Visible;
    }

    public void setVisible(boolean bl) {
        this.Visible = bl;
    }

    public float bdV() {
        return this.fFy;
    }

    public void fb(float f2) {
        this.fFy = f2;
    }
}

