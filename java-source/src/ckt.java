/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class ckt
extends ckr {
    private int bnh = 0;

    public ckt(ckp ckp2) {
        super(ckp2);
    }

    @Override
    protected void aHZ() {
        int n = mfz.ex(this.MessageDelegator.arc().rgz);
        if (n == this.bnh) {
            return;
        }
        this.bnh = n;
        ljq ljq2 = this.ekn ? this.ekl : this.ekj;
        ljq ljq3 = this.ekn ? this.ekj : this.ekl;
        lgl lgl2 = this.ekn ? this.ekm : this.ekk;
        lgl lgl3 = this.ekn ? this.ekk : this.ekm;
        double d2 = ((cku)this.eHb).Hz();
        float f = (float)((this.MessageDelegator.arc().rgz - this.eko) / d2);
        f = lew.A(f, 0.0f, 1.0f);
        ljq ljq4 = ljq.e(ljq2, ljq3, f);
        lgl lgl4 = lgl.b(lgl2, lgl3, f);
        this.k(ljq4, lgl4);
        this.j(this.eks, this.ekt);
        if (this.eko + d2 < this.MessageDelegator.arc().rgz) {
            this.ekr = false;
            this.aIb();
        }
    }

    private void aIb() {
        eq eq2 = this.eHb.fi().af(1408);
        if (eq2 == null) {
            assert (false);
            return;
        }
        eq2.x(this.ekn);
    }

    public void rr(int n) {
        assert (this.eHb.isServerObject());
        this.ekn = !this.ekn;
        this.eko = this.MessageDelegator.arc().rgz;
        this.ekr = true;
        fuk fuk2 = (fuk)this.MessageDelegator.h(1045, this.eHb.getGUID(), this.eHb.getGUID());
        fuk2.oV = this.MessageDelegator.arc().rgz;
        fuk2.iWZ = this.ekn;
        fuk2.bBf = ((cku)this.eHb).Hz();
        fuk2.SpecialEffectType = n;
        gqu gqu2 = (gqu)this.MessageDelegator.h(11055, this.getGUID(), lcr.qAJ);
        gqu2.jpQ = (float)(this.MessageDelegator.arc().rgz + ((cku)this.eHb).Hz());
        gqu2.iXB = fuk2;
        this.MessageDelegator.F(gqu2);
    }

    public final double aRj() {
        return this.eko;
    }
}

