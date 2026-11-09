/*
 * Decompiled with CFR.
 */
public class iau
extends iar {
    private int lCF;

    public iau(int n) {
        this.lCF = n;
        this.drd().o(this.cLr().aNA());
        this.aTg();
    }

    public int bEH() {
        return this.lCF;
    }

    public cfn cLr() {
        return cfj.euv.get(this.lCF);
    }

    @Override
    public final boolean aOM() {
        this.djE();
        return ioa.cyJ().cJp().pI(this.lCF);
    }
}

