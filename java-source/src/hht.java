/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.LinkedList;

public class hht
extends hox {
    private final a ktD;
    private final lgg ktE;
    private final hpa kjT;
    private final hpa kjU;
    private final hmt kfo;
    private lip iKP;
    private boolean ktF;

    public hht(hdm hdm2, String string, lgg lgg2, lhf lhf2, a a2, lip lip2) {
        super((hnc)hdm2, string, lgg2, lhf2, -10.0, 10.0, 0.0);
        assert (a2.ktG.kLY.r(a2.ktJ.kLY));
        assert (a2.ktG.kLY.r(a2.ktI.kLY));
        this.ktD = a2;
        this.iKP = lip2;
        this.ktE = new lgg((this.getWidth() - this.ktD.ktG.kLY.rmN) / 2, (this.getHeight() - this.ktD.ktG.kLY.H) / 2);
        this.kjT = new hpa((hnc)hdm2, (String)null, this.ktE, null, this.ktD.ktG);
        this.j(this.kjT);
        this.kjT.H(this.ktD.ktH);
        this.kfo = new hmt((hnc)hdm2, null, this.ktE, this.ktD.ktG.kLY);
        this.j(this.kfo);
        this.kjU = new hpa((hnc)hdm2, (String)null, lgg.rlI, this.ktD.ktG.kLY, lhu.rnR);
        this.kfo.j(this.kjU);
        this.NG(this.ktD.ktG.kLY.rmN);
        this.ccd();
    }

    public void e(lip lip2) {
        this.iKP = lip2;
    }

    public void nG(boolean bl) {
        if (bl == this.ktF) {
            return;
        }
        this.ktF = bl;
        this.ccd();
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
        float f2 = (float)this.cum();
        float f3 = f2 >= 0.0f ? (float)this.cqb() : (float)this.cqa();
        lip lip2 = lcy.rbe.a(new ljm(f2), new ljm(f3), this.iKP);
        linkedList.add(new hnt(this.cbO().jGU, lip2.esy()));
        this.kLu.a(null, linkedList);
    }

    @Override
    protected void ccd() {
        int n = 0;
        int n2 = 0;
        lcq lcq2 = lcq.COLORSHIFT_NEUTRAL;
        lhu lhu2 = lhu.rnR;
        double d2 = this.cum();
        int n3 = this.cO(d2);
        if (d2 < 0.0) {
            lhu2 = this.ktD.ktJ;
            lcq2 = this.ktD.ktL;
            n = n3;
            n2 = this.ktD.ktG.kLY.rmN / 2 - n;
        } else if (d2 > 0.0) {
            lhu2 = this.ktD.ktI;
            lcq2 = this.ktD.ktK;
            n = this.ktD.ktG.kLY.rmN / 2;
            n2 = n3 - n;
        }
        if (this.ktF) {
            lcq2 = this.ktD.ktM;
        }
        assert (n >= 0);
        assert (n <= this.ktD.ktG.kLY.rmN / 2);
        assert (n2 >= 0);
        assert (n2 <= this.ktD.ktG.kLY.rmN / 2);
        assert (n + n2 <= this.ktD.ktG.kLY.rmN);
        this.kfo.h(this.ktE.cf + n, this.ktE.cg, n2, this.kfo.getHeight());
        this.kjU.cB(-n, 0);
        this.kjU.a(lhu2);
        this.kjU.H(lcq2);
    }

    public hdm cbO() {
        return (hdm)this.kLu;
    }

    public hec cbP() {
        return this.cbO().cbP();
    }

    protected final int cO(double d2) {
        int n;
        assert (d2 >= this.cqa());
        assert (d2 <= this.cqb());
        int n2 = this.cus() / 2;
        if (d2 < 0.0) {
            double d3 = 0.0 - this.cqa();
            double d4 = (double)n2 / d3;
            if (Double.isNaN(d4) || Double.isInfinite(d4)) {
                d4 = 0.0;
            }
            assert (d4 >= 0.0);
            n = n2 - (int)Math.round(-d2 * d4);
        } else if (d2 > 0.0) {
            double d5 = this.cqb() - 0.0;
            double d6 = (double)n2 / d5;
            if (Double.isNaN(d6) || Double.isInfinite(d6)) {
                d6 = 0.0;
            }
            assert (d6 >= 0.0);
            n = n2 + (int)Math.round(d2 * d6);
        } else {
            n = 0;
        }
        assert (n >= 0);
        assert (n <= this.cus());
        return n;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

