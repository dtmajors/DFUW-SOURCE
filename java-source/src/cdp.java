/*
 * Decompiled with CFR.
 */
public class cdp
extends ccz {
    private final cdj enD;
    private boolean enE = false;
    private int enF = -1;
    private int enG;
    private final int enH = 0;

    public cdp(cdv cdv2) {
        super(cdv2);
        this.enD = new cdj(cdv2);
    }

    public void aKq() {
        if (this.aeg == null) {
            return;
        }
        if (this.aeg.aAG() == null) {
            return;
        }
        this.enE = true;
        this.enG = 0;
        this.aKr();
    }

    private void aKr() {
        if (this.aeg == null) {
            return;
        }
        if (this.aeg.aAG() == null) {
            return;
        }
        lgj lgj2 = new lgj(mfz.ex(this.MessageDelegator.arc().rgz), new ljw(this.aeg.aAG().av()), this.aeg.aAG().aw(), true);
        ldv ldv2 = this.aeg.aAG().getGUID();
        this.enF = lgj2.aZa;
        this.a(ldv2, lgj2);
        ++this.enG;
    }

    public final cdj aKp() {
        return this.enD;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.enD.doTick(ldz2);
        if (!this.enE) {
            return;
        }
        if (this.enG >= 0) {
            return;
        }
        if (mfz.ex(this.MessageDelegator.arc().rgz) == this.enF) {
            return;
        }
        this.aKr();
    }

    @Override
    public final void initialize() {
        super.initialize();
        this.enD.initialize();
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
    protected void a(fsj fsj2) {
        if (fsj2.dTY == null) {
            lfn.b(5, "SFControllerManagerGroundedMonsterServer", "handleMovementObjectMessage() PositionalData is null.");
            return;
        }
        if (this.isScheduledForRemoval()) {
            return;
        }
        if (this.aeg.aAG() == null) {
            lfn.b(5, "SFControllerManagerGroundedMonsterServer", "handleMovementObjectMessage() MeshObject is null in monsterobject.");
            return;
        }
        if (this.enE) {
            return;
        }
        ldv ldv2 = this.aeg.aAG().getGUID();
        this.a(ldv2, fsj2.dTY);
        ljq ljq2 = fsj2.dTY.eqI();
        lgl lgl2 = fsj2.dTY.eqK();
        this.aeg.aAG().g(ljq2, lgl2);
    }

    private void a(ewz ewz2) {
        this.enD.hk(ewz2.bid);
    }
}

