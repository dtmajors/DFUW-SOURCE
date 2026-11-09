/*
 * Decompiled with CFR.
 */
public class gl
extends btk {
    private long WW = 10L;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 18945: {
                this.a((foq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private gj bL(int n) {
        if (!gk.bJ(n)) {
            lfn.b(5, "SFKeyManager", "createKey() KeyType is invalid.");
            return null;
        }
        gj gj2 = new gj(n, this.WW++);
        return gj2;
    }

    private void a(foq foq2) {
        gj gj2 = this.bL(foq2.afj);
        for for_ = (for)this.MessageDelegator.h(18946, this.GUID, foq2.aO());
        this.MessageDelegator.b(foq2, for_);
        for_.afn = gj2;
        this.MessageDelegator.F(for_);
    }
}

