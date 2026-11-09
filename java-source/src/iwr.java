/*
 * Decompiled with CFR.
 */
public class iwr
extends iuy {
    private ipf mAP;
    private ipf mAQ;
    private ipf mAR;
    private ipf mAS;
    private ipf mAT;
    private ipf mAU;
    private ipf mAV;
    private ipf mAW;
    private boolean mAX;

    public iwr(boolean bl, boolean bl2) {
        super(bl);
        this.mAX = bl2;
        this.ar(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_hollow_disabled.png"));
        this.as(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_hollow_normal.png"));
        this.at(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_hollow_hover.png"));
        this.au(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_hollow_pushing.png"));
        this.av(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_double_disabled.png"));
        this.aw(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_double_normal.png"));
        this.ax(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_double_hover.png"));
        this.ay(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_double_pushing.png"));
    }

    public iwr() {
        this(false, false);
    }

    public ipf dsx() {
        return this.mAP;
    }

    public void ar(ipf ipf2) {
        if (ipf2 == this.mAP) {
            return;
        }
        if (this.mAP != null) {
            this.X(this.mAP);
        }
        this.mAP = ipf2;
        if (this.mAP != null) {
            this.mAP.setVisible(false);
            this.W(this.mAP);
        }
        this.aTg();
    }

    public ipf dsy() {
        return this.mAQ;
    }

    public void as(ipf ipf2) {
        if (ipf2 == this.mAQ) {
            return;
        }
        if (this.mAQ != null) {
            this.X(this.mAQ);
        }
        this.mAQ = ipf2;
        if (this.mAQ != null) {
            this.mAQ.setVisible(false);
            this.W(this.mAQ);
        }
        this.aTg();
    }

    public ipf dsz() {
        return this.mAR;
    }

    public void at(ipf ipf2) {
        if (ipf2 == this.mAR) {
            return;
        }
        if (this.mAR != null) {
            this.X(this.mAR);
        }
        this.mAR = ipf2;
        if (this.mAR != null) {
            this.mAR.setVisible(false);
            this.W(this.mAR);
        }
        this.aTg();
    }

    public ipf dsA() {
        return this.mAS;
    }

    public void au(ipf ipf2) {
        if (ipf2 == this.mAS) {
            return;
        }
        if (this.mAS != null) {
            this.X(this.mAS);
        }
        this.mAS = ipf2;
        if (this.mAS != null) {
            this.mAS.setVisible(false);
            this.W(this.mAS);
        }
        this.aTg();
    }

    public ipf dsB() {
        return this.mAT;
    }

    public void av(ipf ipf2) {
        if (ipf2 == this.mAT) {
            return;
        }
        if (this.mAT != null) {
            this.X(this.mAT);
        }
        this.mAT = ipf2;
        if (this.mAT != null) {
            this.mAT.setVisible(false);
            this.W(this.mAT);
        }
        this.aTg();
    }

    public ipf dsC() {
        return this.mAU;
    }

    public void aw(ipf ipf2) {
        if (ipf2 == this.mAU) {
            return;
        }
        if (this.mAU != null) {
            this.X(this.mAU);
        }
        this.mAU = ipf2;
        if (this.mAU != null) {
            this.mAU.setVisible(false);
            this.W(this.mAU);
        }
        this.aTg();
    }

    public ipf dsD() {
        return this.mAV;
    }

    public void ax(ipf ipf2) {
        if (ipf2 == this.mAV) {
            return;
        }
        if (this.mAV != null) {
            this.X(this.mAV);
        }
        this.mAV = ipf2;
        if (this.mAV != null) {
            this.mAV.setVisible(false);
            this.W(this.mAV);
        }
        this.aTg();
    }

    public ipf dsE() {
        return this.mAW;
    }

    public void ay(ipf ipf2) {
        if (ipf2 == this.mAW) {
            return;
        }
        if (this.mAW != null) {
            this.X(this.mAW);
        }
        this.mAW = ipf2;
        if (this.mAW != null) {
            this.mAW.setVisible(false);
            this.W(this.mAW);
        }
        this.aTg();
    }

    public boolean dsF() {
        return this.mAX;
    }

    public void sF(boolean bl) {
        if (bl == this.mAX) {
            return;
        }
        this.mAX = bl;
        this.aTg();
    }

    @Override
    public void aTg() {
        if (this.mAX) {
            ipf ipf2 = null;
            switch (this.diY()) {
                case mpX: {
                    if (!this.djR()) {
                        ipf2 = this.mAT;
                        break;
                    }
                    if (this.dil()) {
                        ipf2 = this.mAW;
                        break;
                    }
                    if (this.dkb()) {
                        ipf2 = this.mAV;
                        break;
                    }
                    if (!this.djZ()) {
                        ipf2 = this.mAT;
                        break;
                    }
                    ipf2 = this.mAU;
                    break;
                }
                default: {
                    ipf2 = !this.djR() ? this.mAP : (this.dil() ? this.mAS : (this.dkb() ? this.mAR : (!this.djZ() ? this.mAP : this.mAQ)));
                }
            }
            this.r(ipf2);
        } else {
            super.aTg();
        }
    }
}

