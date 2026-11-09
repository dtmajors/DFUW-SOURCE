/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 */
public class ciz
extends btk {
    private static final double eDo = 30.0;
    private final cex abN;

    public ciz(cex cex2) {
        this.abN = cex2;
    }

    public void aPO() {
        if (this.abN.mp()) {
            return;
        }
        if (this.abN.mA() == null || this.abN.aAG() == null || this.abN.aAG().azb() == null) {
            return;
        }
        efi efi2 = (efi)this.MessageDelegator.h(12854, this.getGUID(), lcr.hac);
        efi2.oH(this.abN.mA().getGUID());
        efi2.c(this.abN.aAG().azb());
        this.MessageDelegator.E(efi2);
    }

    private void a(efj efj2) {
        String[] stringArray = efj2.bFy();
        int[] nArray = efj2.bGr();
        ljq[] ljqArray = efj2.bFx();
        if (stringArray == null || nArray == null || ljqArray == null) {
            return;
        }
        if (stringArray.length != nArray.length || nArray.length != ljqArray.length) {
            assert (false);
            return;
        }
        if (this.abN.aMR() == null) {
            return;
        }
        for (int i = 0; i < stringArray.length; ++i) {
            this.abN.aMR().a(ljqArray[i], nArray[i], stringArray[i], 30.0);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12855: {
                this.a((efj)dxq2);
                break;
            }
            default: {
                assert (false) : "Unhandled message type : " + dxq2.bEz();
                break;
            }
        }
    }
}

