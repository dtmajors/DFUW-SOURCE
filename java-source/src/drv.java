/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class drv
extends drt
implements ami {
    public static final int dVk = 1;
    public static final int gUT = 2;
    public static final int gUU = 3;
    public static final int gUV = 4;
    public static final int gUW = 5;
    public static final int gUX = 6;
    public static final int gUY = 7;
    public static final int gUZ = 8;
    public static final int gVa = 9;
    protected ljq Position = new ljq();
    private boolean gvl;
    private lcq gvo;
    private float Uf;
    private float gvn;
    private String gVb = "";
    private boolean gvm;
    private int gvg;
    private float Ue;

    public drv() {
        this.ObjectType = 74;
        this.gvl = false;
        this.gvo = lcq.BRIGHT_WHITE;
        this.Uf = 1.0f;
        this.gvn = 0.5f;
        this.gvm = true;
        this.gvg = 0;
        this.Ue = 15.0f;
    }

    @Override
    public ljq av() {
        return this.Position;
    }

    @Override
    public void c(ljq ljq2) {
        this.Position = ljq2;
        this.gPb |= 2;
    }

    public boolean isInnerOn() {
        return this.gvl;
    }

    public void setInnerOn(boolean bl) {
        this.gvl = bl;
        this.gPb |= 4;
    }

    public lcq getInnerColor() {
        return this.gvo;
    }

    public void setInnerColor(lcq lcq2) {
        this.gvo = lcq2;
        this.gPb |= 8;
    }

    public float getInnerRadius() {
        return this.Uf;
    }

    public void setInnerRadius(float f2) {
        this.Uf = f2;
        this.gPb |= 0x10;
    }

    public float getInnerIntensity() {
        return this.gvn;
    }

    public void setInnerIntensity(float f2) {
        this.gvn = f2;
        this.gPb |= 0x20;
    }

    public String bwx() {
        return this.gVb;
    }

    public void jc(String string) {
        this.gVb = string;
        this.gPb |= 0x40;
    }

    public boolean isOuterOn() {
        return this.gvm;
    }

    public void setOuterOn(boolean bl) {
        this.gvm = bl;
        this.gPb |= 0x80;
    }

    public int getOuterColorNumber() {
        return this.gvg;
    }

    public void setOuterColorNumber(int n) {
        this.gvg = n;
        this.gPb |= 0x100;
    }

    public float getOuterRadius() {
        return this.Ue;
    }

    public void setOuterRadius(float f2) {
        this.Ue = f2;
        this.gPb |= 0x200;
    }

    @Override
    public ljq FX() {
        return null;
    }

    @Override
    public void d(ljq ljq2) {
    }

    @Override
    public lgl aw() {
        return null;
    }

    @Override
    public void a(lgl lgl2) {
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.ji(true);
            this.Initialized = true;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1538: {
                this.a((fph)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fph fph2) {
        assert (this.Initialized);
        lfn.b(0, "SFSphericalLightObject", "handleLightSphericalLightModifyMessage() Received SphericalLightModifyMessage. Type=" + fph2.bQN());
        int n = fph2.bQN();
        if (n <= 0) {
            lfn.b(5, "SFSphericalLightObject", "handleLightSphericalLightModifyMessage() SphericalLightModifyMessageType is invalid.");
            return;
        }
        if ((n & fph.iTe) != 0) {
            this.setOuterRadius(fph2.getOuterRadius());
        }
        if ((n & fph.iSW) != 0) {
            this.setOuterOn(fph2.isOuterOn());
        }
        if ((n & fph.iTi) != 0) {
            this.setOuterColorNumber(fph2.getOuterColorNumber());
        }
        if ((n & fph.goz) != 0) {
            this.c(fph2.av());
        }
        if ((n & fph.iTg) != 0) {
            lcq lcq2 = fph2.getInnerColor();
            lcq2 = new lcq(lcq2.r, lcq2.g, lcq2.b, 1.0f);
            fph2.setInnerColor(lcq2);
            this.setInnerColor(lcq2);
            lfn.b(0, "SFSphericalLightObject", "handleLightSphericalLightModifyMessage() New InnerColor=" + this.gvo);
        }
        if ((n & fph.iTf) != 0) {
            this.setInnerIntensity(fph2.getInnerIntensity());
        }
        if ((n & fph.iTk) != 0) {
            this.setInnerOn(fph2.isInnerOn());
        }
        if ((n & fph.iTj) != 0) {
            this.setOuterOn(fph2.isOuterOn());
        }
        if ((n & fph.iTd) != 0) {
            this.setInnerRadius(fph2.getInnerRadius());
        }
        if ((n & fph.iTh) != 0) {
            this.jc(fph2.getTextureName());
            lfn.b(0, "SFSphericalLightObject", "handleLightSphericalLightModifyMessage() New Texture='" + this.gVb + "'");
        }
        this.ji(false);
    }

    public void updateObject() {
        this.ji(false);
    }

    private void ji(boolean bl) {
        if (this.dwG && !lcw.eng()) {
            return;
        }
        kkl kkl2 = (kkl)this.MessageDelegator.h(1539);
        kkl2.ts(this.GUID);
        kkl2.pN(this.GUID);
        if (bl) {
            kkl2.Yy(kkl.pGe);
            kkl2.c(this.Position);
            kkl2.setInnerOn(this.gvl);
            kkl2.setInnerColor(this.gvo);
            kkl2.setInnerRadius(this.Uf);
            kkl2.setInnerIntensity(this.gvn);
            kkl2.setTextureName(this.gVb);
            kkl2.setOuterOn(this.gvm);
            kkl2.hX(true);
            kkl2.setOuterColorNumber(this.gvg);
            kkl2.setOuterRadius(this.Ue);
        } else {
            kkl2.Yy(0);
        }
        if ((this.gPb & 2) > 0) {
            kkl2.Yy(kkl2.ebU() | kkl.goz);
            kkl2.c(this.Position);
        }
        if ((this.gPb & 4) > 0) {
            kkl2.Yy(kkl2.ebU() | kkl.iTk);
            kkl2.setInnerOn(this.gvl);
        }
        if ((this.gPb & 8) > 0) {
            kkl2.Yy(kkl2.ebU() | kkl.iTg);
            kkl2.setInnerColor(this.gvo);
        }
        if ((this.gPb & 0x10) > 0) {
            kkl2.Yy(kkl2.ebU() | kkl.iTd);
            kkl2.setInnerRadius(this.Uf);
        }
        if ((this.gPb & 0x20) > 0) {
            kkl2.Yy(kkl2.ebU() | kkl.iTf);
            kkl2.setInnerIntensity(this.gvn);
        }
        if ((this.gPb & 0x40) > 0) {
            kkl2.Yy(kkl2.ebU() | kkl.iTh);
            kkl2.setTextureName(this.gVb);
        }
        if ((this.gPb & 0x80) > 0) {
            kkl2.Yy(kkl2.ebU() | kkl.iTj);
            kkl2.setOuterOn(this.gvm);
        }
        if ((this.gPb & 0x100) > 0) {
            kkl2.Yy(kkl2.ebU() | kkl.iTi);
            kkl2.setOuterColorNumber(this.gvg);
        }
        if ((this.gPb & 0x200) > 0) {
            kkl2.Yy(kkl2.ebU() | kkl.iTe);
            kkl2.setOuterRadius(this.Ue);
        }
        if (kkl2.getInnerColor() == null) {
            kkl2.setInnerColor(this.gvo);
        }
        if (kkl2.av() == null) {
            kkl2.c(this.Position);
        }
        if (kkl2.getTextureName() == null) {
            kkl2.setTextureName("");
        }
        this.MessageDelegator.a(kkl2);
    }
}

