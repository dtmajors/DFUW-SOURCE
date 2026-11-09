/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 */
public class jja
extends btk {
    private fjw nhQ;
    private jiv nhR = new jiv(this);

    public fjw dHZ() {
        return this.nhQ;
    }

    public void c(fjw fjw2) {
        this.nhQ = fjw2;
        hso.cxK().a(jnz.nFI);
        hzo hzo2 = (hzo)hso.cxK().cxP().cxO();
        hzo2.cHC().open();
        ((hzo)hso.cxK().cxO()).cHO().cQn();
        this.nhR.rQ(this.nhQ.iOl);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (this.nhQ == null) {
            return;
        }
        int n = dxq2.bEz();
        switch (n) {
            case 10245: 
            case 11784: 
            case 11786: 
            case 12291: {
                this.nhR.n(dxq2);
            }
        }
    }

    public void rR(ldv ldv2) {
        this.nhR.rR(ldv2);
    }

    @Deprecated
    public void sn(String string) {
        this.nhR.sn(string);
    }

    @Deprecated
    public void so(String string) {
        this.nhR.so(string);
    }

    @llk
    public void close() {
        if (this.nhQ == null) {
            return;
        }
        hzo hzo2 = (hzo)hso.cxK().cxP().cxO();
        hzo2.cHC().close();
        hzo2.cHD().close();
        hso.cxK().a(jnz.nFE);
        fkb fkb2 = (fkb)hso.cxK().cxO().getMessageDelegator().h(11779, this.GUID, this.nhQ.aO());
        hso.cxK().cxO().getMessageDelegator().F(fkb2);
        this.nhR.shutdown();
        this.nhQ = null;
        ((hzo)hso.cxK().cxO()).cHO().cQn();
    }

    public boolean dIa() {
        return this.nhQ != null;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.nhR.shutdown();
    }
}

