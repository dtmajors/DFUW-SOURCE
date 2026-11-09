/*
 * Decompiled with CFR.
 */
public class cqw
extends btk
implements bto {
    private cqy eWh = null;
    private static cqw eWb = null;
    private cqv eWi = null;

    public cqw() {
        assert (eWb == null);
        eWb = this;
    }

    @Override
    public void initialize() {
        super.initialize();
        assert (this.MessageDelegator != null);
        this.eWh = new cqy(this, this.MessageDelegator);
        this.eWi = new cqv(this, this.MessageDelegator);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    public void gH(boolean bl) {
        this.eWh.setEnabled(bl);
    }

    public void gI(boolean bl) {
        this.eWi.setEnabled(bl);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        super.receiveMessage(dxq2);
    }

    @Override
    public void receiveRenderResponse(kgz kgz2) {
        switch (kgz2.X()) {
            case 3: 
            case 4: {
                this.eWh.receiveRenderResponse(kgz2);
                break;
            }
            default: {
                super.receiveRenderResponse(kgz2);
            }
        }
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        switch (ktf2.egN()) {
            default: 
        }
        super.receiveResourceResponse(ktf2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 534: {
                this.eWi.a((kwf)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public static cqw aZE() {
        return eWb;
    }
}

