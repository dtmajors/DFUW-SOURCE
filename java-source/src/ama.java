/*
 * Decompiled with CFR.
 */
public class ama
extends btk {
    private static ama bsY = null;
    private final alz bsZ;

    public ama(alz alz2) {
        this.bsZ = alz2;
        if (bsY == null) {
            bsY = this;
        }
    }

    public final void Eu() {
        assert (bsY != null);
        assert (ama.bsY.Initialized);
        this.GUID = ama.bsY.MessageDelegator.bzv();
        ama.bsY.MessageDelegator.a(this);
    }

    public final void Ev() {
        assert (bsY != null);
        assert (ama.bsY.Initialized);
        assert (this.Initialized);
        ama.bsY.MessageDelegator.hd(this.GUID);
        ama.bsY.MessageDelegator.oa(this.GUID);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (this.bsZ != null && this.bsZ.m(dxq2)) {
            return;
        }
        super.receiveMessage(dxq2);
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        if (this.bsZ != null && this.bsZ.a(kcz2)) {
            return;
        }
        super.receiveMiddlewareMessage(kcz2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (this.bsZ != null && this.bsZ.b(ktv2)) {
            return;
        }
        super.receiveResponse(ktv2);
    }

    @Override
    public void receiveRenderResponse(kgz kgz2) {
        if (this.bsZ != null && this.bsZ.a(kgz2)) {
            return;
        }
        super.receiveRenderResponse(kgz2);
    }

    @Override
    public void receiveAIResponse(ba ba2) {
        if (this.bsZ != null && this.bsZ.a(ba2)) {
            return;
        }
        super.receiveAIResponse(ba2);
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        if (this.bsZ != null && this.bsZ.a(ktf2)) {
            return;
        }
        super.receiveResourceResponse(ktf2);
    }
}

