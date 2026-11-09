/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 *  lcr
 */
public class cwa
extends cvz {
    cwa(int n) {
        super(n, false);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4881: {
                this.a((gaq)dxq2);
                break;
            }
            case 4879: {
                this.a((gbc)dxq2);
                break;
            }
            case 4878: {
                this.b((gbb)dxq2);
                break;
            }
            case 29953: 
            case 29954: 
            case 29955: 
            case 29957: 
            case 29958: 
            case 29959: 
            case 29960: {
                this.C(dxq2);
                break;
            }
            case 29956: {
                this.a((fqi)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void C(dxq dxq2) {
        dxq2.on(this.bdv());
        this.MessageDelegator.E(dxq2);
    }

    private void b(gbb gbb2) {
        this.fEK = cwg.a.fEQ;
        this.bdw();
        hzo hzo2 = hso.cxK().cxP().cyJ();
        if (hzo2 != null) {
            hzo2.cIu();
        }
    }

    private void a(gbc gbc2) {
        this.fEK = cwg.a.fEP;
        gbc2.f(this.GUID);
        gbc2.on(this.bdv());
        this.MessageDelegator.F(gbc2);
    }

    private void a(gaq gaq2) {
        this.fEK = cwg.a.fEO;
        gaq2.f(this.getGUID());
        gaq2.on(lcr.acL);
        this.MessageDelegator.F(gaq2);
    }

    private void a(fqi fqi2) {
        if (fqi2.getResult() != cvz.a.fBK.ordinal()) {
            lfn.b(5, "SFMarketSessionHandlerClient", "handleMarketResponseMessage() : market operation failed " + fqi2.getResult());
        }
        fqi2.f(this.getGUID());
        fqi2.on(lcr.acL);
        this.MessageDelegator.F(fqi2);
        if (fqi2.bRf() == 29955 && fqi2.getResult() == 0) {
            for (int i = 0; i < fqi2.bRg().length; ++i) {
                cvy cvy2 = fqi2.bRg()[i];
                int n = cvy2.bbL;
                ler ler2 = lea.enW().acv(cvy2.ResourceType);
                String string = ler2.awO().toString();
                lfn.b(5, "SFMarketSessionHandlerClient", "handleMarketResponseMessage() : Item:" + n + " ResType:" + string + " Quantity:" + cvy2.asi + " Price:" + cvy2.fBn + " AttrCount:" + cvy2.DR.length + " CourierCost:" + cvy2.fBp + " Distance:" + cvy2.mB + " SellerName:" + cvy2.fBq);
            }
        }
    }
}

