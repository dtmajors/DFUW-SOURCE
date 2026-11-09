/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.LinkedList;

public class hhw
extends hox {
    private final a kub;
    private final hpa kjT;
    private final hpa kjU;
    private lip iKP;

    public hhw(hdm hdm2, String string, lgg lgg2, lhf lhf2, a a2, float f2, float f3, float f4, lip lip2) {
        super((hnc)hdm2, string, lgg2, lhf2, f2, f3, f4);
        this.kub = a2;
        this.iKP = lip2;
        this.kjT = new hpa((hnc)hdm2, (String)null, this.kub.kuf, null, this.kub.ktG);
        this.kjT.H(this.kub.ktH);
        this.j(this.kjT);
        this.kjU = new hpa((hnc)hdm2, (String)null, this.kub.kue, null, this.kub.kuc);
        this.kjU.H(this.kub.kud);
        this.j(this.kjU);
        this.NG(this.kub.kuc.kLY.rmN);
        this.ccd();
    }

    public void e(lip lip2) {
        this.iKP = lip2;
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
        lip lip2 = lcy.rbd.a(new ljm((float)this.cum()), new ljm((float)this.cqb()), this.iKP);
        linkedList.add(new hnt(this.cbO().jGU, lip2.esy()));
        this.kLu.a(null, linkedList);
    }

    @Override
    protected void ccd() {
        this.kjU.cC(this.cuv(), this.kjU.getHeight());
    }

    public hdm cbO() {
        return (hdm)this.kLu;
    }

    public hec cbP() {
        return this.cbO().cbP();
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

