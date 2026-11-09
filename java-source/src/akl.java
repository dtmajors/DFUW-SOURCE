/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxg
 */
public class akl
extends akk {
    private boolean bnQ = true;
    private int bnR = 0;

    public akl() {
        this.bog = ajb.b.bpd;
    }

    public boolean Cb() {
        return this.bnQ;
    }

    public void aW(boolean bl) {
        this.bnQ = bl;
    }

    public int Cc() {
        return this.bnR;
    }

    public void fD(int n) {
        this.bnR = n;
    }

    public String Cd() {
        return cxh.fH(this.bnR);
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        akl akl2 = (akl)aja2;
        akl2.aW(this.bnQ);
        akl2.fD(this.bnR);
    }

    @Override
    protected float Dt() {
        assert (this.boj != null);
        if (this.bnQ) {
            if (!cxg.bp((int)0, (int)this.bnR)) {
                return 0.0f;
            }
            return cxg.d((cxc)this.boj, (int)this.bnR);
        }
        if (!cxg.bp((int)this.boj.zg(), (int)this.bnR)) {
            return 0.0f;
        }
        return cxg.c((cxc)this.boj, (int)this.bnR);
    }
}

