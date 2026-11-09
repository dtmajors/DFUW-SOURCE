/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 */
public class dsp
extends bvf {
    private String dBd = "";

    public dsp(bve.a a2) {
        super(a2);
        this.setObjectType(45);
    }

    public String atK() {
        return this.dBd;
    }

    public void fX(String string) {
        this.dBd = string;
    }

    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 1025) {
            ftv ftv2 = (ftv)dxq2;
            kky kky2 = (kky)this.MessageDelegator.h(1025);
            kky2.ts(this.GUID);
            kky2.pHF = ftv2.bRZ();
            kky2.hC(this.dJs);
            kky2.pHG = ftv2.av().x;
            kky2.pHH = ftv2.av().y;
            kky2.pHI = ftv2.av().rlV;
            kky2.rb = ftv2.aw().x;
            kky2.rc = ftv2.aw().y;
            kky2.rd = ftv2.aw().rlV;
            kky2.pHJ = ftv2.aw().rlW;
            this.MessageDelegator.a(kky2);
        } else {
            super.receiveMessage(dxq2);
        }
    }
}

