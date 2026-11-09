/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  iet
 */
public class iex
extends iet
implements hyy.c {
    protected ldv fFl = null;
    protected boolean fFd = false;
    protected boolean fFf = false;

    public iex() {
        super(bqm.b.dEJ, null);
    }

    public void cBa() {
        super.cBa();
        this.cQM();
    }

    public void initialize() {
        super.initialize();
        fvp fvp2 = (fvp)this.MessageDelegator.h(12289, this.GUID, this.fFl);
        fvp2.dTe = hvg.ldJ.ordinal();
        fvp2.iTm = 1;
        this.MessageDelegator.F(fvp2);
    }

    public void cleanUp() {
        super.cleanUp();
    }

    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 12291) {
            fvt fvt2 = (fvt)dxq2;
            if (fvt2.dTe == hvg.ldJ.ordinal()) {
                this.a(fvt2);
            } else {
                super.receiveMessage(dxq2);
            }
        } else if (dxq2.bEz() == 18439) {
            this.b((gxl)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    protected void b(gxl gxl2) {
        this.fFd = gxl2.fFd;
        this.fFf = gxl2.fFf;
        this.cQM();
    }

    protected void a(fvt fvt2) {
        gxk gxk2 = (gxk)this.MessageDelegator.h(18438, this.getGUID(), this.fFl);
        this.MessageDelegator.F(gxk2);
    }

    public void ry(ldv ldv2) {
        this.fFl = ldv2;
    }

    @llk
    public void acceptTradeClicked(boolean bl) {
        gxm gxm2 = (gxm)this.MessageDelegator.h(18440, this.getGUID(), this.fFl);
        gxm2.eOq = bl;
        this.MessageDelegator.F(gxm2);
    }

    protected void cQM() {
        this.a("setOwnAcceptedState", new Object[]{this.fFd});
        this.a("setOtherAcceptedState", new Object[]{this.fFf});
    }

    public ldv bdF() {
        return this.fFl;
    }

    @Override
    public void b(hyy.b b2, int n) {
        if (b2.equals((Object)hyy.b.luO)) {
            gbc gbc2 = (gbc)this.MessageDelegator.h(4879, this.GUID, this.fFl);
            this.MessageDelegator.F(gbc2);
        }
    }

    protected boolean d(int n, int n2, String string) {
        return n2 >= 116;
    }
}

