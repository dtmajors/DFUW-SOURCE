/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxg
 */
public class akd
extends akc {
    private boolean bnQ = true;
    private int bnR = 0;

    public akd() {
        this.bog = ajb.b.bpa;
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
    protected int Dd() {
        if (this.bnQ) {
            if (!cxg.bp((int)0, (int)this.bnR)) {
                return 0;
            }
            return (int)cxg.d((cxc)this.boj, (int)this.bnR);
        }
        if (!cxg.bp((int)this.boj.zg(), (int)this.bnR)) {
            return 0;
        }
        return (int)cxg.c((cxc)this.boj, (int)this.bnR);
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        akd akd2 = (akd)aja2;
        akd2.aW(this.bnQ);
        akd2.fD(this.bnR);
    }
}

