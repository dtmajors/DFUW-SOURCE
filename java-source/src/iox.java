/*
 * Decompiled with CFR.
 */
public class iox
extends ioo
implements ior {
    private ipf mpG;
    private ipf mpH;
    private ipf mpI;
    private ipf mpJ;
    private ipf mpK;
    private ipf mpL;
    private ipf mpM;
    private ipf mpN;
    private ipf mpO;
    private ipf mpP;
    private ipf mpQ;
    private ipf mpR;
    private ioy mpS = ioy.mpW;
    private ioz mpT = ioz.mqa;

    public iox() {
        this.setActive(true);
    }

    public iox(boolean bl) {
        this();
        this.hX(bl);
    }

    public ioz diX() {
        return this.mpT;
    }

    public void a(ioz ioz2) {
        this.mpT = ioz2;
    }

    public ioy diY() {
        return this.mpS;
    }

    public void a(ioy ioy2) {
        if (ioy2 == this.mpS) {
            return;
        }
        this.mpS = ioy2;
        this.aTg();
    }

    @Override
    public boolean dir() {
        return this.mpS == ioy.mpX;
    }

    @Override
    public void hX(boolean bl) {
        this.a(bl ? ioy.mpX : ioy.mpW);
    }

    public ipf diZ() {
        return this.mpG;
    }

    public void F(ipf ipf2) {
        if (ipf2 == this.mpG) {
            return;
        }
        if (this.mpG != null) {
            this.X(this.mpG);
        }
        this.mpG = ipf2;
        if (this.mpG != null) {
            this.mpG.setVisible(false);
            this.W(this.mpG);
        }
        this.aTg();
    }

    public ipf dja() {
        return this.mpH;
    }

    public void G(ipf ipf2) {
        if (ipf2 == this.mpH) {
            return;
        }
        if (this.mpH != null) {
            this.X(this.mpH);
        }
        this.mpH = ipf2;
        if (this.mpH != null) {
            this.mpH.setVisible(false);
            this.W(this.mpH);
        }
        this.aTg();
    }

    public ipf djb() {
        return this.mpI;
    }

    public void H(ipf ipf2) {
        if (ipf2 == this.mpI) {
            return;
        }
        if (this.mpI != null) {
            this.X(this.mpI);
        }
        this.mpI = ipf2;
        if (this.mpI != null) {
            this.mpI.setVisible(false);
            this.W(this.mpI);
        }
        this.aTg();
    }

    public ipf djc() {
        return this.mpJ;
    }

    public void I(ipf ipf2) {
        if (ipf2 == this.mpJ) {
            return;
        }
        if (this.mpJ != null) {
            this.X(this.mpJ);
        }
        this.mpJ = ipf2;
        if (this.mpJ != null) {
            this.mpJ.setVisible(false);
            this.W(this.mpJ);
        }
        this.aTg();
    }

    public ipf djd() {
        return this.mpK;
    }

    public void J(ipf ipf2) {
        if (ipf2 == this.mpK) {
            return;
        }
        if (this.mpK != null) {
            this.X(this.mpK);
        }
        this.mpK = ipf2;
        if (this.mpK != null) {
            this.mpK.setVisible(false);
            this.W(this.mpK);
        }
        this.aTg();
    }

    public ipf dje() {
        return this.mpL;
    }

    public void K(ipf ipf2) {
        if (ipf2 == this.mpL) {
            return;
        }
        if (this.mpL != null) {
            this.X(this.mpL);
        }
        this.mpL = ipf2;
        if (this.mpL != null) {
            this.mpL.setVisible(false);
            this.W(this.mpL);
        }
        this.aTg();
    }

    public ipf djf() {
        return this.mpM;
    }

    public void L(ipf ipf2) {
        if (ipf2 == this.mpM) {
            return;
        }
        if (this.mpM != null) {
            this.X(this.mpM);
        }
        this.mpM = ipf2;
        if (this.mpM != null) {
            this.mpM.setVisible(false);
            this.W(this.mpM);
        }
        this.aTg();
    }

    public ipf djg() {
        return this.mpN;
    }

    public void M(ipf ipf2) {
        if (ipf2 == this.mpN) {
            return;
        }
        if (this.mpN != null) {
            this.X(this.mpN);
        }
        this.mpN = ipf2;
        if (this.mpN != null) {
            this.mpN.setVisible(false);
            this.W(this.mpN);
        }
        this.aTg();
    }

    public ipf djh() {
        return this.mpO;
    }

    public void N(ipf ipf2) {
        if (ipf2 == this.mpO) {
            return;
        }
        if (this.mpO != null) {
            this.X(this.mpO);
        }
        this.mpO = ipf2;
        if (this.mpO != null) {
            this.mpO.setVisible(false);
            this.W(this.mpO);
        }
        this.aTg();
    }

    public ipf dji() {
        return this.mpP;
    }

    public void O(ipf ipf2) {
        if (ipf2 == this.mpP) {
            return;
        }
        if (this.mpP != null) {
            this.X(this.mpP);
        }
        this.mpP = ipf2;
        if (this.mpP != null) {
            this.mpP.setVisible(false);
            this.W(this.mpP);
        }
        this.aTg();
    }

    public ipf djj() {
        return this.mpQ;
    }

    public void P(ipf ipf2) {
        if (ipf2 == this.mpQ) {
            return;
        }
        if (this.mpQ != null) {
            this.X(this.mpQ);
        }
        this.mpQ = ipf2;
        if (this.mpQ != null) {
            this.mpQ.setVisible(false);
            this.W(this.mpQ);
        }
        this.aTg();
    }

    public ipf djk() {
        return this.mpR;
    }

    public void Q(ipf ipf2) {
        if (ipf2 == this.mpR) {
            return;
        }
        if (this.mpR != null) {
            this.X(this.mpR);
        }
        this.mpR = ipf2;
        if (this.mpR != null) {
            this.mpR.setVisible(false);
            this.W(this.mpR);
        }
        this.aTg();
    }

    @Override
    public void aTg() {
        ipf ipf2 = null;
        switch (this.mpS) {
            case mpX: {
                if (!this.djR()) {
                    ipf2 = this.mpK;
                    break;
                }
                if (this.dil()) {
                    ipf2 = this.mpN;
                    break;
                }
                if (this.dkb()) {
                    ipf2 = this.mpM;
                    break;
                }
                if (!this.djZ()) {
                    ipf2 = this.mpK;
                    break;
                }
                ipf2 = this.mpL;
                break;
            }
            case mpY: {
                if (!this.djR()) {
                    ipf2 = this.mpO;
                    break;
                }
                if (this.dil()) {
                    ipf2 = this.mpR;
                    break;
                }
                if (this.dkb()) {
                    ipf2 = this.mpQ;
                    break;
                }
                if (!this.djZ()) {
                    ipf2 = this.mpO;
                    break;
                }
                ipf2 = this.mpP;
                break;
            }
            default: {
                ipf2 = !this.djR() ? this.mpG : (this.dil() ? this.mpJ : (this.dkb() ? this.mpI : (!this.djZ() ? this.mpG : this.mpH)));
            }
        }
        this.r(ipf2);
    }

    @Override
    public void cLq() {
        switch (this.mpT) {
            case mqb: {
                this.hX(!this.dir());
                this.b(this.mpS);
                break;
            }
            default: {
                this.hX(!this.dir());
                this.pn(this.dir());
            }
        }
    }

    public void pn(boolean bl) {
    }

    public void b(ioy ioy2) {
    }
}

