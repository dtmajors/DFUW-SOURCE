/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
public class jqa
extends btk {
    private double nRd = 0.0;
    private double nRe = 0.0;
    private double jpI = 0.0;
    private double jpJ = 0.0;
    private int ResourceType = -1;
    private cev bnF;

    @Override
    public boolean isRunning() {
        return this.jpI != 0.0 && this.jpJ != 0.0;
    }

    @Override
    public void reset() {
        this.bnF.aJO().ek(cug.vM((int)this.ResourceType));
        this.nRd = 0.0;
        this.jpI = 0.0;
        this.nRe = 0.0;
        this.jpJ = 0.0;
        this.ResourceType = -1;
    }

    public void c(double d2, double d3, int n, boolean bl) {
        if (bl) {
            this.a(mab.uam.bD(new Object[0]));
        } else {
            this.a(mab.uan.bD(new Object[0]));
        }
        this.nRd = this.MessageDelegator.arc().rgz;
        this.jpI = d2;
        this.nRe = this.jpI - this.nRd;
        this.jpJ = d3;
        this.ResourceType = n;
        buk buk2 = this.bnF.aJO();
        buk2.a(this.nRd, this.jpJ, this.jpI, cug.vM((int)this.ResourceType));
    }

    public void g(double d2, int n) {
        this.nRe = d2;
        this.ResourceType = n;
        this.jpI = this.nRd + this.nRe;
        buk buk2 = this.bnF.aJO();
        buk2.aZ(this.jpI);
    }

    public final double dQO() {
        return this.jpI;
    }

    public final double dQP() {
        return this.jpJ;
    }

    public void f(cev cev2) {
        this.bnF = cev2;
    }

    public boolean dQQ() {
        return this.isRunning() && this.MessageDelegator.arc().rgz >= this.jpJ;
    }

    public final void a(loz loz2) {
        fgs fgs2 = (fgs)this.getMessageDelegator().h(29446, this.getGUID(), lcr.acL);
        fgs2.r(loz2);
        this.getMessageDelegator().F(fgs2);
    }
}

