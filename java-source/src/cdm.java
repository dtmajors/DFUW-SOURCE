/*
 * Decompiled with CFR.
 */
public class cdm
extends ccy {
    private bee enB = null;

    public cdm(cdw cdw2) {
        super(cdw2);
    }

    public boolean l(int n, float f2) {
        if (this.enB != null) {
            return this.enB.l(n, f2);
        }
        return false;
    }

    public boolean j(int n, ljq ljq2) {
        if (this.enB != null) {
            return this.enB.j(n, ljq2);
        }
        return false;
    }

    @Override
    public final void oW(int n) {
        lfn.b(5, "SFControllerManagerFlyingMonsterClient", "changeController() Controllermanager only contains one controller.");
        assert (false);
    }

    @Override
    public final void aGx() {
        if (((cdr)this.aeg).aJI()) {
            this.emw = this.enB;
        }
    }

    @Override
    public final void h(lgj lgj2) {
        fsj fsj2 = (fsj)this.MessageDelegator.h(20483, this.GUID, this.aeg.getServerGUID());
        fsj2.dTY = lgj2;
        this.MessageDelegator.E(fsj2);
    }

    @Override
    protected final void aJs() {
        assert (this.emv == null);
        assert (this.enB == null);
        this.enB = new bee(this.aeg);
        this.enB.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enB);
        this.emw = this.enB;
        this.enB.amv();
    }

    @Override
    protected final void aJt() {
        if (this.enB.amP()) {
            this.enB.amK();
        }
        this.MessageDelegator.hd(this.enB.getGUID());
    }
}

