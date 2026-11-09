/*
 * Decompiled with CFR.
 */
public class hql
extends hqh {
    public final lnt kZb;
    private final lbn jJc = new lbn(this){
        final /* synthetic */ hql kZc;
        {
            this.kZc = hql2;
        }

        public final void W() {
            this.kZc.refresh();
        }
    };

    public hql(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqh.b b2, lnt lnt2, boolean bl) {
        super(hnc2, string, lgg2, lhf2, b2, lnt2.ewf().rFP, lnt2.ewf().rFQ, bl, lnt2.getValue(), lnt2.ewf().ktf, null);
        this.kZb = lnt2;
    }

    @Override
    protected void FF() {
        super.FF();
        this.mU(true);
        this.refresh();
    }

    @Override
    protected void FG() {
        this.mU(false);
        super.FG();
    }

    @Override
    protected void ciT() {
        super.ciT();
        this.kZb.adI((int)this.cum());
    }

    protected void refresh() {
        this.cR(this.kZb.getValue());
    }

    private void mU(boolean bl) {
        this.kZb.cec().a(bl, this.jJc);
    }
}

