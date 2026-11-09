/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cks
extends ckr {
    public cks(ckp ckp2) {
        super(ckp2);
    }

    public void fw(boolean bl) {
        this.ekn = bl;
        this.aIc();
        this.j(this.eks, this.ekt);
    }

    @Override
    protected void aHZ() {
        ljq ljq2 = this.ekn ? this.ekl : this.ekj;
        ljq ljq3 = this.ekn ? this.ekj : this.ekl;
        lgl lgl2 = this.ekn ? this.ekm : this.ekk;
        lgl lgl3 = this.ekn ? this.ekk : this.ekm;
        double d2 = ((ckq)this.eHb).Hz();
        float f = (float)((this.MessageDelegator.arc().rgz - this.eko) / d2);
        f = lew.A(f, 0.0f, 1.0f);
        ljq ljq4 = ljq.e(ljq2, ljq3, f);
        lgl lgl4 = lgl.b(lgl2, lgl3, f);
        this.k(ljq4, lgl4);
        this.j(this.eks, this.ekt);
    }

    public void a(boolean bl, double d2, int n) {
        this.ekn = bl;
        this.eko = d2;
        this.ekr = true;
        ljq ljq2 = this.eHb.aAG().av();
        ljq2.es(this.ekj);
        this.b(ljq2, n);
    }

    private void b(ljq ljq2, int n) {
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
        glh2.setSpecialEffectType(n);
        glh2.o(0.0);
        glh2.setTargetPosition(ljq2);
        glh2.mj(true);
        this.MessageDelegator.F(glh2);
    }
}

