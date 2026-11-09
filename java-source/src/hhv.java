/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.LinkedList;

public class hhv
extends hox {
    private final hou ktO;
    private final hpa ktP;
    private final hpa ktQ;
    private final hpa ktR;
    private final hmt kfo;
    private final hpa ktS;
    private final lbn ktT = new lbn(this){
        final /* synthetic */ hhv ktU;
        {
            this.ktU = hhv2;
        }

        public final void W() {
            hhv.a(this.ktU, hhv.a(this.ktU).getWidth());
        }
    };
    private lip iKP;

    public hhv(hdm hdm2, String string, lgg lgg2, lhf lhf2, a a2, float f2, float f3, float f4, lip lip2) {
        super((hnc)hdm2, string, lgg2, lhf2, f2, f3, f4);
        this.iKP = lip2;
        this.ktO = new hou((hnc)hdm2, null, new lgg(0, (this.getHeight() - a2.ktW.kLY.H) / 2), new lhf(this.getWidth(), a2.ktW.kLY.H), new lhf(3, 1), new lgg(1, 0));
        this.j(this.ktO);
        this.ktO.a(ldb.reo, 0, a2.ktV.kLY.rmN);
        this.ktO.a(ldb.reo, 1, this.getWidth() - (a2.ktV.kLY.rmN + a2.ktX.kLY.rmN));
        this.ktO.a(ldb.reo, 2, a2.ktX.kLY.rmN);
        this.ktO.a(ldb.rep, 0, this.getHeight());
        this.ktP = new hpa((hnc)hdm2, (String)null, lgg.rlI, null, a2.ktV);
        this.ktP.H(a2.ktY);
        this.ktO.d(0, 0, this.ktP);
        this.ktQ = new hpa((hnc)hdm2, (String)null, lgg.rlI, new lhf(0, this.getHeight()), a2.ktW);
        this.ktQ.H(a2.ktY);
        this.ktO.d(0, 1, this.ktQ);
        this.ktR = new hpa((hnc)hdm2, (String)null, lgg.rlI, null, a2.ktX);
        this.ktR.H(a2.ktY);
        this.ktO.d(0, 2, this.ktR);
        this.kfo = new hmt((hnc)hdm2, null, lgg.rlI, new lhf(0, this.getHeight()));
        this.j(this.kfo);
        this.ktS = new hpa((hnc)hdm2, (String)null, lgg.rlI, null, a2.ktZ);
        this.ktS.H(a2.kua);
        this.kfo.j(this.ktS);
        this.ccd();
    }

    public void e(lip lip2) {
        this.iKP = lip2;
    }

    @Override
    protected void FF() {
        super.FF();
        this.mU(true);
        this.NG(this.ktQ.getWidth());
        this.ccd();
    }

    @Override
    protected void FG() {
        this.mU(false);
        super.FG();
    }

    @Override
    protected void ccc() {
        LinkedList<hnt> linkedList = new LinkedList<hnt>();
        lip lip2 = lcy.rbd.a(new ljm((float)this.cum()), new ljm((float)this.cqb()), this.iKP);
        linkedList.add(new hnt(this.cbO().jGU, lip2.esy()));
        this.kLu.a(null, linkedList);
    }

    @Override
    protected void ccd() {
        this.kfo.j(new lgs(this.ktP.getWidth(), 0, this.cuv(), this.getHeight()));
        int n = this.ktS.getHeight();
        this.ktS.j(new lgs(0, (this.getHeight() - n) / 2, this.ktQ.cqv().rmN, n));
    }

    public hdm cbO() {
        return (hdm)this.kLu;
    }

    public hec cbP() {
        return this.cbO().cbP();
    }

    private void mU(boolean bl) {
        this.ktQ.cqn().a(bl, this.ktT);
    }

    static /* synthetic */ hpa a(hhv hhv2) {
        return hhv2.ktQ;
    }

    static /* synthetic */ boolean a(hhv hhv2, int n) {
        return hhv2.NG(n);
    }
}

