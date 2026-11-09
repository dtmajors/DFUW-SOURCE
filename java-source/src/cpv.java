/*
 * Decompiled with CFR.
 */
public class cpv
extends cpu
implements bzz {
    private cau eUo = null;

    public cpv() {
        super(false);
    }

    public void initialize() {
        this.eUo = new cau();
        this.eUo.setGUID(this.MessageDelegator.bzv());
        this.eUo.a(this);
        this.MessageDelegator.a((amf)((Object)this.eUo));
        super.initialize();
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.eUo != null) {
            this.MessageDelegator.hd(this.eUo.getGUID());
            this.eUo = null;
        }
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4878: {
                if (this.aYl() == null) {
                    return;
                }
                this.aYl().receiveMessage(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public final void i(boolean bl, boolean bl2) {
    }

    protected void a(uk uk2) {
        switch (uk2.Uo) {
            case 3: {
                this.fx(((uh)uk2).PC);
                break;
            }
            default: {
                super.a(uk2);
            }
        }
    }

    protected final void aIw() {
        super.aIw();
        assert (this.eUo != null);
        this.eUo.aGx();
    }

    protected final void aIx() {
        assert (this.eUo != null);
        super.aIx();
        this.eUo.aGy();
    }
}

