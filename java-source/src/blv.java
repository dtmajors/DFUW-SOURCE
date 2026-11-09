/*
 * Decompiled with CFR.
 */
public class blv
extends bke {
    private fdo duA = null;

    public blv() {
        this.dsy = bkd.a.dsh;
    }

    @Override
    public void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFUnsheatheInventoryItemFO", "doFunction() Message is null.");
            this.Vc();
            return;
        }
        this.duA = fdo2;
        fnu fnu2 = (fnu)this.MessageDelegator.h(7948, this.GUID, fdo2.aZG);
        this.MessageDelegator.F(fnu2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7946: {
                this.a((fmo)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fmo fmo2) {
        if (fmo2.ilu == 6) {
            if (fmo2.eo) {
                // empty if block
            }
            if (this.duA.bOs()) {
                this.a(this.duA, fmo2.eo);
            }
        } else {
            lfn.b(5, "SFUnsheatheInventoryItemFO", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
        }
        this.Vc();
    }
}

