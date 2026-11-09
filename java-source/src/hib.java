/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.LinkedList;

public class hib
extends hmt {
    public final lmv kuH;
    public final lmv kuI;
    public final hpe kuJ;
    public final hpe kuK;
    public final lip kbN;
    public final lip bZO;
    private boolean Initialized;
    private final lbn kuL = new lbn(this){
        final /* synthetic */ hib kuM;
        {
            this.kuM = hib2;
        }

        public final void W() {
            hib.a(this.kuM);
        }
    };

    public hib(hdm hdm2, String string, lgg lgg2, lhf lhf2, int n, int n2, String string2, lip lip2, lip lip3) {
        super((hnc)hdm2, string, lgg2, lhf2);
        this.kuH = this.cbP().kck.kyN.AM(string2);
        this.kuI = this.cbP().kck.kyM.AM(string2);
        this.kbN = lip2;
        this.bZO = lip3;
        this.kuJ = new hpe(this.kLu, null, lgg.rlI, new lhf(n, lhf2.H), this.cbO().kIr, this.kbN.esy());
        this.j(this.kuJ);
        this.kuK = new hpe(this.kLu, null, new lgg(n + n2, 0), new lhf(lhf2.rmN - (n + n2), lhf2.H), this.cbO().kIq, ljg.roH.esy());
        this.j(this.kuK);
        this.refresh();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.cc(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.cc(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        assert (this.cqQ());
        LinkedList<hnt> linkedList = new LinkedList<hnt>();
        linkedList.add(new hnt(this.cbO().kKo, this.kbN.esy()));
        linkedList.add(new hnt(this.cbO().jGV, this.bZO.esy()));
        lhu lhu2 = null;
        this.kLu.a(lhu2, linkedList);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private void refresh() {
        lcq lcq2;
        String string;
        if (this.kuH instanceof lnp) {
            float f2 = ((lnp)this.kuH).getValue();
            float f3 = ((lnp)this.kuI).getValue();
            string = new ljm(f2).esy();
            lcq2 = (double)f2 < (double)f3 - 0.01 ? this.cbO().jXk.jRB : ((double)f2 > (double)f3 + 0.01 ? this.cbO().jXk.jRC : lcq.COLORSHIFT_NEUTRAL);
        } else {
            string = this.kuH.dPf();
            lcq2 = lcq.COLORSHIFT_NEUTRAL;
        }
        this.kuK.H(lcq2);
        this.kuK.mV(string);
    }

    private void cc(boolean bl) {
        this.kuH.cec().a(bl, this.kuL);
    }

    static /* synthetic */ void a(hib hib2) {
        hib2.refresh();
    }
}

