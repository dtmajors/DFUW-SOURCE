/*
 * Decompiled with CFR.
 */
public class bvu
extends bvd {
    private boolean dQm = false;
    private boolean dTv = false;
    private bwh dTq = null;
    private kli dTr = null;

    public bvu(bve.a a2) {
        super(a2);
        switch (this.dQn) {
            case dQv: 
            case dQx: 
            case dQB: 
            case dQH: {
                break;
            }
            case dQw: {
                this.dTr = bwg.aBk();
                break;
            }
            case dQC: {
                this.dTr = bwg.aBj();
                break;
            }
            case dQJ: {
                this.dTr = bwg.aBi();
                break;
            }
            default: {
                return;
            }
        }
    }

    public void aAk() {
        this.dTr = bwg.aBh();
    }

    public final void eF(boolean bl) {
        this.dTv = bl;
    }

    @Override
    public final boolean ayZ() {
        return this.dQm;
    }

    public final bwh aAl() {
        return this.dTq;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.dQm && this.dTq != null) {
            this.aAn();
        }
    }

    @Override
    public final boolean isServerObject() {
        return true;
    }

    public final void i(lgl lgl2) {
        assert (this.dTr != null);
        ljq ljq2 = new ljq(0.0f, 0.0f, 1.0f);
        ljq ljq3 = lgl.a(lgl2, ljq2);
        ljq3.normalize();
        this.dTr.bg(ljq3);
    }

    @Override
    protected void azh() {
        switch (this.dQn) {
            case dQv: 
            case dQx: 
            case dQB: 
            case dQH: {
                this.azX();
                break;
            }
            case dQw: 
            case dQC: 
            case dQJ: {
                this.aAm();
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    protected void azj() {
        this.dQm = true;
        if (this.dTq != null) {
            this.MessageDelegator.hd(this.dTq.getGUID());
        }
        if (this.dTv) {
            this.azg();
        }
    }

    @Override
    protected final void azk() {
        if (this.dTq == null) {
            this.azj();
            this.azi();
        } else {
            this.dTq.setGUID(this.MessageDelegator.bzv());
            this.dTq.jY(this.axa());
            this.dTq.jZ(this.getGUID());
            this.dTq.bf(this.Position);
            this.dTq.d(this.Rotation);
            this.dTq.setObjectType(this.ResourceType);
            this.MessageDelegator.a(this.dTq);
            this.dTq.aBl();
        }
    }

    private void azX() {
        assert (this.GUID != null);
        assert (this.Position != null);
        assert (this.Rotation != null);
        krr krr2 = (krr)this.MessageDelegator.j(1);
        krr2.aaz(1);
        if (this.dJs == null) {
            krr2.aaA(8);
        } else {
            krr2.aaA(4);
            krr2.hC(this.dJs);
        }
        krr2.ts(this.GUID);
        krr2.xc(this.FileName);
        krr2.xC(true);
        krr2.xe("");
        krr2.xd("");
        krr2.c(this.Position);
        krr2.a(this.Rotation);
        krr2.setObjectType(this.ResourceType);
        this.MessageDelegator.a(krr2);
    }

    private void aAm() {
        assert (this.GUID != null);
        krs krs2 = (krs)this.MessageDelegator.j(10);
        krs2.aaB(1);
        if (this.dJs == null) {
            krs2.aaC(32);
            krs2.hC(this.getGUID());
        } else {
            krs2.aaC(16);
            krs2.hC(this.dJs);
        }
        this.dTr.c(this.Position);
        this.dTr.a(this.Rotation);
        krs2.ts(this.GUID);
        krs2.xc(this.FileName);
        krs2.xC(true);
        krs2.xe("");
        krs2.xd("");
        krs2.b(this.dTr);
        this.MessageDelegator.a(krs2);
    }

    private void aAn() {
        assert (!this.dQm);
        assert (this.dTq != null);
        if (!this.dTq.aBs() && this.dTq.aBm() && this.dTq.aBo()) {
            this.Position = this.dTq.aBp();
            this.Rotation = this.dTq.aBq();
            this.dTq.eT(true);
            this.azj();
        }
    }
}

