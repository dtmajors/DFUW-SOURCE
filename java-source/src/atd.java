/*
 * Decompiled with CFR.
 */
public class atd
extends btk {
    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 23297: {
                this.a((dze)dxq2);
                break;
            }
            case 23304: {
                this.a((dzl)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(dze dze2) {
        atc atc2 = new atc();
        atc2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(atc2);
        atc2.receiveMessage(dze2);
    }

    private void a(dzl dzl2) {
        ate ate2 = new ate();
        ate2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(ate2);
        ate2.receiveMessage(dzl2);
    }
}

