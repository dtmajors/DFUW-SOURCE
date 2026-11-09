/*
 * Decompiled with CFR.
 */
public class hqp
extends hqm {
    public final lnt kZb;
    private final lbn jJc = new lbn(this){
        final /* synthetic */ hqp kZq;
        {
            this.kZq = hqp2;
        }

        public final void W() {
            this.kZq.refresh();
        }
    };

    public hqp(hnc hnc2, String string, lgg lgg2, lhf lhf2, hqm.a a2, lnt lnt2) {
        super(hnc2, string, lgg2, lhf2, a2, lnt2.ewf().rFP, lnt2.ewf().rFQ, lnt2.getValue(), 0, lnt2.ewf().ktf);
        this.kZb = lnt2;
    }

    @Override
    protected void FF() {
        super.FF();
        this.kZb.cec().a(true, this.jJc);
        this.refresh();
    }

    @Override
    protected void FG() {
        this.kZb.cec().a(false, this.jJc);
        super.FG();
    }

    @Override
    protected void ciT() {
        super.ciT();
        this.kZb.adI((int)this.cqg().cpZ());
    }

    protected void refresh() {
        this.cqg().cP(this.kZb.getValue());
    }
}

