/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcw
 */
public class hhd
extends hhc {
    private final hpa kpX;
    private final hpg kpY;
    private final hpg kpZ;
    private boolean Initialized;
    private lej kqa;

    public hhd(hdm hdm2, String string, lgg lgg2, lhf lhf2, float f2, lax<lhu> lax2) {
        super(hdm2, string, lgg2, lhf2, new hhg(hdm2, (String)null, f2, lax2));
        this.kpX = new hpa((hnc)hdm2, (String)null, lgg.rlI, null, hdm2.jXk.jPp);
        this.j(this.kpX);
        hpg.a a2 = hdm2.kIK;
        this.kpY = new hpg((hnc)hdm2, null, lgg.rlI, new lhf(hdm2.jXk.jPs.rmN, a2.jFE.kNb * 2), a2, "");
        this.j(this.kpY);
        a2 = hdm2.kIE;
        this.kpZ = new hpg((hnc)hdm2, null, lgg.rlI, new lhf(hdm2.jXk.jPs.rmN, a2.jFE.kNb * 2), a2, "");
        this.j(this.kpZ);
        this.kqa = lcw.dW((ljq)this.cbP().kck.av());
        this.layout();
        this.ckx();
        this.ckw();
        this.ckv();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.cky();
        this.layout();
    }

    @Override
    protected boolean LM(int n) {
        this.cbO().jYW.O(n, true);
        return true;
    }

    @Override
    protected void ckm() {
        assert (this.Initialized);
        super.ckm();
        this.ckx();
        ljq ljq2 = this.cbP().kck.av();
        lej lej2 = lcw.dW((ljq)ljq2);
        this.b(lej2);
    }

    @Override
    protected void ckn() {
        assert (this.Initialized);
        super.ckn();
        this.ckv();
    }

    @Override
    protected void cko() {
        assert (this.Initialized);
        super.cko();
        this.cku();
    }

    protected void ckt() {
        assert (this.Initialized);
        this.ckw();
    }

    private void cku() {
        this.cky();
    }

    private void layout() {
        this.kpX.cB(this.getWidth() / 2, this.getHeight() / 2);
        int n = (this.getWidth() - this.cbO().jXk.jPs.rmN) / 2;
        int n2 = 4;
        this.kpY.cB(n, n2);
        this.kpZ.cB(n, n2 += this.kpY.getHeight());
    }

    private void b(lej lej2) {
        if (lej2.equals(this.kqa)) {
            return;
        }
        this.kqa = lej2;
        if (this.Initialized) {
            this.ckt();
        }
    }

    private void ckv() {
        float f2 = this.cbP().kck.getRotation().getY();
        this.kpX.gu(f2 + (float)Math.PI);
    }

    private void ckw() {
        lhy lhy2 = lea.h(this.kqa);
        String string = lhy2.getDisplayName();
        if (string == null) {
            string = "Unknown";
        }
        this.kpY.mV(string);
    }

    private void ckx() {
        this.cky();
        ljq ljq2 = this.cbP().kck.av();
        this.kpZ.mV(new lis(ljq2).esy());
    }

    protected final void cky() {
        ljq ljq2 = this.cbP().kck.av();
        this.p(new ljp(ljq2.x, ljq2.rlV));
    }

    private void mU(boolean bl) {
    }
}

