/*
 * Decompiled with CFR.
 */
public class cyc
extends cxo {
    private ljq fXW = null;

    public ljq bgF() {
        return this.fXW;
    }

    public void bH(ljq ljq2) {
        this.fXW = ljq2;
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        cyc cyc2 = (cyc)((Object)cxc2);
        cyc2.bH(this.fXW.esF());
    }

    protected void beA() {
        this.emI.bgQ().aJD().amY();
        this.emI.bgQ().aJN().amY();
    }
}

