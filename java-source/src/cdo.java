/*
 * Decompiled with CFR.
 */
public class cdo
extends ccy {
    protected ben enC = null;
    private final cdj enD;

    public cdo(cdu cdu2) {
        super(cdu2);
        this.enD = new cdj(cdu2);
    }

    public final cdj aKp() {
        return this.enD;
    }

    @Override
    public final void oW(int n) {
        switch (n) {
            case 1: {
                this.emw = this.enC;
                break;
            }
            default: {
                lfn.b(5, "SFControllerManagerGroundedMonsterClient", "changeController() Invalid controllertype provided: " + n);
                return;
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.enD.doTick(ldz2);
    }

    @Override
    public final void aGx() {
        if (((cdu)this.aeg).aJI()) {
            this.emw = this.enC;
        }
    }

    @Override
    public final void h(lgj lgj2) {
        fsj fsj2 = (fsj)this.MessageDelegator.h(20483, this.GUID, this.aeg.getServerGUID());
        fsj2.dTY = lgj2;
        this.MessageDelegator.E(fsj2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5123: {
                this.a((ewz)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 5385: {
                this.enD.a((kvm)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    protected final void aJs() {
        assert (this.emv == null);
        assert (this.enC == null);
        this.enC = new ben(this.aeg);
        this.enC.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enC);
        this.emw = this.enC;
        this.enC.amv();
    }

    @Override
    protected final void aJt() {
        if (this.enC.amP()) {
            this.enC.amK();
        }
        this.MessageDelegator.hd(this.enC.getGUID());
    }

    private void a(ewz ewz2) {
        this.enD.hk(ewz2.bid);
    }
}

