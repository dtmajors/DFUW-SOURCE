/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public abstract class hzf
extends hzk {
    private hyn lvN;

    public hzf(String string, String string2, hyn hyn2) {
        super(string, string2);
        this.OQ(jnz.nGj | jnz.nGi);
        this.a(hya.lmp, true);
        this.lvN = hyn2;
    }

    public void initialize() {
        super.initialize();
        this.cHc();
        this.a("updateWindow", new Object[0]);
    }

    public void de(int n, int n2) {
        this.R(n, n2);
        this.setVisible(true);
        hzf.cxP().g((hyn)this);
        new lie(this, 0.1, false){
            final /* synthetic */ hzf lvO;
            {
                this.lvO = hzf2;
                super(d2, bl);
            }

            public void dh(double d2) {
                this.lvO.pd(false);
            }
        }.e(this.MessageDelegator);
    }

    public void close() {
        this.setVisible(false);
        hzf.cxP().h((hyn)this);
    }

    public hyn f(int n, int n2, String string) {
        return null;
    }

    public hyn cGi() {
        return this.lvN;
    }

    protected void cBa() {
        super.cBa();
        this.cGg();
        this.cFc();
    }

    protected void g(int n, int n2, String string) {
        if (this.l(n, n2, string)) {
            return;
        }
        this.cGh();
    }

    protected void j(int n, int n2, String string) {
        this.g(n, n2, string);
    }

    protected void cEp() {
        this.cGh();
    }

    protected abstract void cHc();

    protected abstract void cGh();

    protected abstract void cGg();
}

