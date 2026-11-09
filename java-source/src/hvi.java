/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvj
 */
public class hvi
extends btk
implements bto {
    private ldv ldR;
    private ldv ldS;
    private ldv ldT;
    private boolean ldU = false;
    private final hvj alV;

    public hvi(hvj hvj2) {
        this.alV = hvj2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.ldU) {
            this.ldU = true;
            this.cyG();
            this.Active = false;
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.Active = true;
    }

    @Override
    public void cleanUp() {
        if (this.ldR != null) {
            // empty if block
        }
        if (this.ldS != null) {
            jrg jrg2 = (jrg)this.MessageDelegator.BW(2);
            jrg2.tj(this.ldT);
            jrg2.tk(this.getGUID());
            jrg2.sy(this.ldS);
            jrg2.VO(2);
            this.MessageDelegator.a(jrg2);
            this.ldS = null;
        }
        super.cleanUp();
    }

    @Override
    public void receiveInputResponse(jrq jrq2) {
        switch (jrq2.getType()) {
            case 3: {
                this.a((jrp)jrq2);
                break;
            }
            case 2: {
                this.a((jrs)jrq2);
                break;
            }
            case 4: {
                this.a((jrn)jrq2);
                break;
            }
            default: {
                super.receiveInputResponse(jrq2);
            }
        }
    }

    private void cyG() {
        jrc jrc2 = (jrc)this.MessageDelegator.BW(3);
        jrc2.tk(this.getGUID());
        this.MessageDelegator.a(jrc2);
    }

    private void a(jrp jrp2) {
        for (int i = 0; i < jrp2.dRG().length; ++i) {
            if (jrp2.dRG()[i].getType() != 255) continue;
            this.ldT = jrp2.dRG()[i].getGUID();
            jrd jrd2 = (jrg)this.MessageDelegator.BW(2);
            ((jrg)jrd2).tj(this.ldT);
            jrd2.tk(this.getGUID());
            ((jrg)jrd2).sy(ldv.rfd);
            ((jrg)jrd2).VO(0);
            ((jrg)jrd2).VN(134);
            this.MessageDelegator.a(jrd2);
            jrd2 = (jqy)this.MessageDelegator.BW(5);
            ((jrb)jrd2).tj(this.ldT);
            jrd2.tk(this.getGUID());
            ((jqy)jrd2).aH(new int[0]);
            this.MessageDelegator.a(jrd2);
            return;
        }
        lfn.b(5, "SFGUIInputManager", "handleListDevicesResponse: Couldn't find message device");
        assert (false);
        this.cyG();
    }

    private void a(jrs jrs2) {
        if (jrs2.dRv() == 0) {
            if (jrs2.getErrorCode() == 0) {
                this.ldS = jrs2.dRw();
                this.ldR = this.MessageDelegator.bzv();
                kgl kgl2 = (kgl)this.MessageDelegator.BV(18);
                kgl2.Ud = this.ldR;
                kgl2.ts(this.getGUID());
                int[] nArray = new int[12];
                for (int i = 0; i < nArray.length - 1; ++i) {
                    nArray[i] = 512 + i;
                }
                nArray[nArray.length - 1] = 673;
                kgl2.pnv = nArray;
                kgl2.pnu = 1;
                this.MessageDelegator.b(kgl2);
            } else {
                lfn.b(5, "SFGUIInputManager", "handleInputSensorResponse(): Failed to create input sensor: " + jrs2.getErrorCode() + " - " + jrs2.getErrorMessage());
                assert (false);
            }
        }
    }

    @Override
    public void receiveRenderResponse(kgz kgz2) {
        switch (kgz2.ex) {
            case 8: {
                this.a((khb)kgz2);
                break;
            }
            default: {
                super.receiveRenderResponse(kgz2);
            }
        }
    }

    private void a(khb khb2) {
        this.alV.a(khb2);
    }

    private void a(jrn jrn2) {
        if (jrn2.dRC() < 512 || jrn2.dRC() <= 522) {
            // empty if block
        }
    }
}

