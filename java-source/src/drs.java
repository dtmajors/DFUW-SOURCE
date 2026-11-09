/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class drs
extends drt {
    private lcq gUh = null;
    private lcq gUi = null;
    private lcq gUj = null;
    private lcq gUk = null;
    private lcq gUl = null;
    private float gse = 0.0f;
    private lcq gUm = null;
    private lcq gUn = null;
    private lcq gUo = null;
    private lcq gUp = null;

    public drs() {
        this.ObjectType = 69;
        bew.d(bfb.dfX);
        this.gUh = new lcq(0.5f, 0.5f, 0.5f);
        this.gUi = new lcq(1.0f, 0.0f, 0.0f);
        this.gUj = new lcq(0.0f, 1.0f, 0.0f);
        this.gUl = new lcq(0.0f, 0.0f, 0.0f, 0.0f);
        this.gUk = new lcq(0.0f, 0.0f, 0.0f, 1.0f);
        this.gse = 0.2f;
    }

    public lcq bwe() {
        return this.gUh;
    }

    public void t(lcq lcq2) {
        this.gUh = lcq2;
        if (this.gUh != null) {
            this.gPb |= 2;
        }
    }

    public lcq bwf() {
        return this.gUi;
    }

    public void u(lcq lcq2) {
        this.gUi = lcq2;
        if (this.gUi != null) {
            this.gPb |= 4;
        }
    }

    public lcq bwg() {
        return this.gUj;
    }

    public void v(lcq lcq2) {
        this.gUj = lcq2;
        if (this.gUj != null) {
            this.gPb |= 8;
        }
    }

    public lcq bwh() {
        return this.gUk;
    }

    public void w(lcq lcq2) {
        this.gUk = lcq2;
        if (this.gUk != null) {
            this.gPb |= 0x10;
        }
    }

    public lcq bwi() {
        return this.gUl;
    }

    public void x(lcq lcq2) {
        this.gUl = lcq2;
        if (this.gUl != null) {
            this.gPb |= 0x20;
        }
    }

    public float getLerpFrequency() {
        return this.gse;
    }

    public void setLerpFrequency(float f2) {
        this.gse = f2;
        this.gPb |= 0x40;
    }

    public lcq bwj() {
        return this.gUm;
    }

    public void y(lcq lcq2) {
        this.gUm = lcq2;
        if (this.gUm != null) {
            this.gPb |= 0x80;
        }
    }

    public lcq bwk() {
        return this.gUn;
    }

    public void z(lcq lcq2) {
        this.gUn = lcq2;
        if (this.gUn != null) {
            this.gPb |= 0x100;
        }
    }

    public lcq bwl() {
        return this.gUo;
    }

    public void A(lcq lcq2) {
        this.gUo = lcq2;
        if (this.gUo != null) {
            this.gPb |= 0x200;
        }
    }

    public lcq bwm() {
        return this.gUp;
    }

    public void B(lcq lcq2) {
        this.gUp = lcq2;
        if (this.gUp != null) {
            this.gPb |= 0x400;
        }
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.bwn();
            this.Initialized = true;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1539: {
                this.a((fpd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fpd fpd2) {
        int n = fpd2.bQK();
        if (n <= 0) {
            lfn.b(5, "SFLightManagerSetupObject", "handleLightManagerSetupMessage() LightManagerSetupRequestType is invalid.");
            return;
        }
        if ((n & fpd.iSA) > 0) {
            this.t(fpd2.bwe());
        }
        if ((n & fpd.iSB) > 0) {
            this.u(fpd2.bwf());
        }
        if ((n & fpd.iSC) > 0) {
            this.v(fpd2.bwg());
        }
        if ((n & fpd.iSD) > 0) {
            this.w(fpd2.bwh());
        }
        if ((n & fpd.iSE) > 0) {
            this.x(fpd2.bwi());
        }
        if ((n & fpd.iSF) > 0) {
            this.setLerpFrequency(fpd2.getLerpFrequency());
        }
        if ((n & fpd.iSG) > 0) {
            this.y(fpd2.bwj());
        }
        if ((n & fpd.iSH) > 0) {
            this.z(fpd2.bwk());
        }
        if ((n & fpd.iSI) > 0) {
            this.A(fpd2.bwl());
        }
        if ((n & fpd.iSJ) > 0) {
            this.B(fpd2.bwm());
        }
    }

    @Override
    public void a(uk[] ukArray, boolean bl) {
        for (int i = 0; i < ukArray.length; ++i) {
            this.a(ukArray[i]);
        }
        if (bl) {
            this.bwn();
        }
    }

    protected void a(uk uk2) {
        switch (uk2.Uo) {
            case 1: {
                this.t(((uc)uk2).aWl);
                break;
            }
            case 2: {
                this.u(((uc)uk2).aWl);
                break;
            }
            case 3: {
                this.v(((uc)uk2).aWl);
                break;
            }
            case 4: {
                this.w(((uc)uk2).aWl);
                break;
            }
            case 5: {
                this.x(((uc)uk2).aWl);
                break;
            }
            case 6: {
                this.setLerpFrequency(((ue)uk2).Pz);
                break;
            }
            case 7: {
                this.y(((uc)uk2).aWl);
                break;
            }
            case 8: {
                this.z(((uc)uk2).aWl);
                break;
            }
            case 9: {
                this.A(((uc)uk2).aWl);
                break;
            }
            case 10: {
                this.B(((uc)uk2).aWl);
                break;
            }
            default: {
                lfn.b(5, "SFLightManagerSetupObject", "handlePropertyUpdate() Invalid PropertyID provided: " + uk2.Uo);
                assert (false);
                break;
            }
        }
    }

    @Override
    public void cleanUp() {
    }

    private void bwn() {
        if (this.dwG & !lcw.qHe) {
            return;
        }
        kkg kkg2 = (kkg)this.MessageDelegator.h(1540);
        kkg2.ts(this.GUID);
        kkg2.pN(this.GUID);
        if ((this.gPb & 4) > 0) {
            kkg2.Hj(kkg2.bQK() | kkg.iSA);
            kkg2.t(this.gUh);
        }
        if ((this.gPb & 4) > 0) {
            kkg2.Hj(kkg2.bQK() | kkg.iSB);
            kkg2.u(this.gUi);
        }
        if ((this.gPb & 8) > 0) {
            kkg2.Hj(kkg2.bQK() | kkg.iSC);
            kkg2.v(this.gUj);
        }
        if ((this.gPb & 0x10) > 0) {
            kkg2.Hj(kkg2.bQK() | kkg.iSD);
            kkg2.w(this.gUk);
        }
        if ((this.gPb & 0x20) > 0) {
            kkg2.Hj(kkg2.bQK() | kkg.iSE);
            kkg2.x(this.gUl);
        }
        if ((this.gPb & 0x40) > 0) {
            kkg2.Hj(kkg2.bQK() | kkg.iSF);
            kkg2.setLerpFrequency(this.gse);
        }
        if ((this.gPb & 0x80) > 0) {
            kkg2.Hj(kkg2.bQK() | kkg.iSG);
            kkg2.y(this.gUm);
        }
        if ((this.gPb & 0x100) > 0) {
            kkg2.Hj(kkg2.bQK() | kkg.iSH);
            kkg2.z(this.gUn);
        }
        if ((this.gPb & 0x200) > 0) {
            kkg2.Hj(kkg2.bQK() | kkg.iSI);
            kkg2.A(this.gUo);
        }
        if ((this.gPb & 0x400) > 0) {
            kkg2.Hj(kkg2.bQK() | kkg.iSJ);
            kkg2.B(this.gUp);
        }
        this.MessageDelegator.a(kkg2);
    }
}

