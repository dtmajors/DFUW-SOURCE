/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.LinkedList;

public class hfq
extends hmt {
    private final hpa kjS;
    private final hpa kjT;
    private final hpa kjU;
    private final lhz kfa;
    private final lbn kfc = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hfq kjW;
        {
            this.kjW = hfq2;
        }

        public final void W() {
            double d2 = hfq.a(this.kjW).esb();
            this.kjW.cbO().jXk.getClass();
            double d3 = d2 * 5.0;
            d3 = Math.sin(d3);
            d3 = Math.abs(d3);
            float f2 = (float)d3;
            f2 *= 1.5f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (!($assertionsDisabled || f2 >= 0.0f && f2 <= 1.0f)) {
                throw new AssertionError();
            }
            hfq.b(this.kjW).H(new lcq(1.0f, 1.0f, 1.0f, f2));
        }

        static {
            $assertionsDisabled = !hfq.class.desiredAssertionStatus();
        }
    };
    private boolean kjV;
    private lip iKP;
    private lip bZO;

    public hfq(hdm hdm2, String string, lgg lgg2, lhf lhf2, boolean bl, lip lip2, lip lip3) {
        super((hnc)hdm2, string, lgg2, lhf2);
        this.kjV = bl;
        this.iKP = lip2;
        this.bZO = lip3;
        this.kfa = new lhz(hdm2.kAz);
        this.kjT = new hpa((hnc)hdm2, (String)null, lgg.rlI, lhf2, hdm2.jXk.jVK);
        this.j(this.kjT);
        this.kjU = new hpa((hnc)hdm2, (String)null, lgg.rlI, lhf2, hdm2.jXk.jVL);
        this.j(this.kjU);
        this.kjU.H(hdm2.jXk.jQh);
        this.kjS = new hpa((hnc)hdm2, (String)null, lgg.rlI, lhf2, hdm2.jXk.jVM);
        this.j(this.kjS);
        this.refresh();
    }

    public void e(lip lip2) {
        this.iKP = lip2;
    }

    public void g(lip lip2) {
        this.bZO = lip2;
    }

    public void mZ(boolean bl) {
        if (bl == this.kjV) {
            return;
        }
        this.kjV = bl;
        this.refresh();
    }

    @Override
    protected void FF() {
        super.FF();
        this.mU(true);
    }

    @Override
    protected void FG() {
        this.mU(false);
        super.FG();
    }

    @Override
    protected void ccc() {
        LinkedList<hnt> linkedList = new LinkedList<hnt>();
        if (this.iKP != null) {
            linkedList.add(new hnt(this.cbO().kKo, this.iKP.esy()));
        }
        linkedList.add(new hnt(this.cbO().jGV, this.bZO.esy()));
        this.kLu.a(null, linkedList);
    }

    private void refresh() {
        if (this.kjV != this.kfa.isStarted()) {
            this.kjS.nR(!this.kjV);
            this.kfa.setStarted(this.kjV);
        }
    }

    public hdm cbO() {
        return (hdm)this.kLu;
    }

    public hec cbP() {
        return this.cbO().cbP();
    }

    private void mU(boolean bl) {
        this.kfa.eqf().a(bl, this.kfc);
    }

    static /* synthetic */ lhz a(hfq hfq2) {
        return hfq2.kfa;
    }

    static /* synthetic */ hpa b(hfq hfq2) {
        return hfq2.kjS;
    }
}

