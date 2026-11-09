/*
 * Decompiled with CFR.
 */
public class dbx
extends dbw {
    private double gcC = 0.0;

    public dbx() {
        super(cxd.j.fRu);
    }

    @Override
    public void bjk() {
        assert (this.gcC == 0.0);
        double d2 = this.boj.c(cxd.p.fSf);
        this.gcC = this.boj.getMessageDelegator().arc().rgz + d2;
    }

    @Override
    public void beQ() {
        double d2 = this.boj.getMessageDelegator().arc().rgz;
        if (d2 >= this.gcC) {
            this.bjl();
        }
        this.gcC = 0.0;
    }

    private void bjl() {
        klj klj2 = (klj)this.boj.getMessageDelegator().h(1039);
        klj2.iBr = true;
        klj2.ec = this.boj.getGUID();
        klj2.Rs = this.boj.aJz().bgQ().aAG().getGUID();
        klj2.dVb = false;
        klj2.pIR = 100;
        klj2.pIS = 10.0f;
        this.boj.getMessageDelegator().a(klj2);
    }
}

