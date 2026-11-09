/*
 * Decompiled with CFR.
 */
public class blu
extends bke {
    private fdo duA = null;

    public blu() {
        this.dsy = bkd.a.dsb;
    }

    @Override
    public void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFSheatheInventoryItemFO", "doFunction() Message is null.");
            this.Vc();
            return;
        }
        this.duA = fdo2;
        fni fni2 = (fni)this.MessageDelegator.h(7947, this.GUID, fdo2.aZG);
        this.MessageDelegator.F(fni2);
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
        if (fmo2.ilu == 5) {
            if (fmo2.eo) {
                // empty if block
            }
            if (this.duA.bOs()) {
                this.a(this.duA, fmo2.eo);
            }
        } else {
            lfn.b(5, "SFSheatheInventoryItemFO", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
        }
        this.Vc();
    }
}

