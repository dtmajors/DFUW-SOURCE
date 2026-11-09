/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public abstract class cky
extends cbx
implements bto {
    protected asb bBu = null;
    protected amm elb = null;

    public cky(boolean bl) {
        super(bl);
    }

    protected void aIw() {
        super.aIw();
        asb asb2 = lea.eoR().get(new Integer(this.az()));
        if (asb2 == null) {
            assert (false);
            return;
        }
        this.a(asb2);
        amm amm2 = lea.eoN().get(this.az());
        if (amm2 == null) {
            assert (false);
            return;
        }
        this.a(amm2);
    }

    public asb aRt() {
        return this.bBu;
    }

    public void a(asb asb2) {
        this.bBu = asb2;
    }

    public amm aIB() {
        return this.elb;
    }

    public void a(amm amm2) {
        this.elb = amm2;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }
}

