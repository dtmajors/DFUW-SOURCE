/*
 * Decompiled with CFR.
 */
public class czd
extends czj {
    private float fZL = 0.0f;
    private ddc fZM = null;
    private double fZN = 0.0;

    public void fM(float f2) {
        this.fZL = f2;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.fZN > 0.0 && this.fZN <= this.MessageDelegator.arc().rgz) {
            this.d(this.fZM);
            this.fZM = null;
            this.fZN = 0.0;
        }
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        czd czd2 = (czd)((Object)cxc2);
        czd2.fM(this.fZL);
    }

    @Override
    protected void bhy() {
        this.fZM = this.fGi;
        this.fZN = this.MessageDelegator.arc().rgz + (double)this.fZL;
    }

    @Override
    protected boolean bhz() {
        return true;
    }
}

