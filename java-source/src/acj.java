/*
 * Decompiled with CFR.
 */
public class acj
extends btk {
    private ack bdQ = null;

    public acj(ack ack2) {
        this.bdQ = ack2;
    }

    public dxq i(int n, ldv ldv2) {
        return this.MessageDelegator.h(n, this.GUID, ldv2);
    }

    public void a(dxq dxq2) {
        this.MessageDelegator.F(dxq2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (!this.bdQ.m(dxq2)) {
            super.receiveMessage(dxq2);
        }
    }
}

