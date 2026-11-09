/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.LinkedList;
import java.util.List;

public class hgr
extends hmt
implements hmb {
    private final hmr jEN = new hmr(null);
    public final hpa koV;
    private final boolean koW;
    private final lhu dzN;
    protected final hpe jBm;
    private boolean Initialized;

    protected hgr(hdm hdm2, String string, lgg lgg2, lhf lhf2, lhu lhu2, lgs lgs2, boolean bl) {
        this(hdm2, string, lgg2, lhf2 == null ? lgs2.cqv() : lhf2, lhu2, lgs2, bl, true);
    }

    private hgr(hdm hdm2, String string, lgg lgg2, lhf lhf2, lhu lhu2, lgs lgs2, boolean bl, boolean bl2) {
        super((hnc)hdm2, string, lgg2, lhf2);
        assert (bl2);
        assert (lhf2 != null);
        this.koW = bl;
        this.dzN = lhu2;
        this.koV = new hpa((hnc)hdm2, (String)null, lgg.rlI, lhf.rnv, lhu2);
        hgr.a(this.koV, lgs2, lhf2);
        this.j(this.koV);
        this.jBm = new hpe((hnc)hdm2, null, lgg.rlI, lhf.rnv, this.cjP(), "");
        this.j(this.jBm);
    }

    public final void H(lcq lcq2) {
        this.koV.H(lcq2);
    }

    public static final void a(hpa hpa2, lgs lgs2, lhf lhf2) {
        lhu lhu2 = hpa2.atw();
        assert (lgs2.cf >= 0 && lgs2.cf <= lhu2.kLY.rmN);
        assert (lgs2.cg >= 0 && lgs2.cg <= lhu2.kLY.H);
        float f2 = (float)lhf2.rmN / (float)lgs2.rmN;
        float f3 = (float)lhf2.H / (float)lgs2.H;
        float f4 = Math.min(f2, f3);
        f4 = Math.min(f4, 1.0f);
        int n = (int)((float)lgs2.cf * f4);
        int n2 = (int)((float)lgs2.cg * f4);
        int n3 = (int)((float)lgs2.rmN * f4);
        int n4 = (int)((float)lgs2.H * f4);
        int n5 = (lhf2.rmN - n3) / 2;
        int n6 = (lhf2.H - n4) / 2;
        hpa2.h(-(n -= n5), -(n2 -= n6), n3 += lgs2.cf, n4 += lgs2.cg);
        hpa2.N(f4, f4);
    }

    @Override
    public final void cbJ() {
        assert (this.koW);
        assert (this.Initialized);
        this.cjK();
        this.cjQ();
    }

    @Override
    public final void cbK() {
        assert (this.koW);
        assert (this.Initialized);
        this.cjQ();
    }

    @Override
    public final boolean a(hmt hmt2, boolean bl) {
        assert (this.koW);
        assert (this.Initialized);
        return this.b(hmt2, bl);
    }

    @Override
    public final void cbL() {
        assert (this.koW);
        assert (this.Initialized);
        this.cjL();
    }

    public final boolean isEnabled() {
        return this.cjM();
    }

    public final void aW(List<hnt> list) {
        this.aV(list);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.cjQ();
        this.layout();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        super.cbM();
        if (!this.kLu.csd()) {
            this.cqF();
            if (this.koW && this.isEnabled()) {
                this.cbO().jZG.a(this, this.kLu.crN());
            }
        }
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        this.cqF();
        LinkedList<hnt> linkedList = new LinkedList<hnt>();
        this.aV(linkedList);
        this.kLu.a(this.dzN, linkedList);
    }

    @Override
    protected void chL() {
        assert (this.Initialized);
        this.cjQ();
    }

    @Override
    protected void chK() {
        assert (this.Initialized);
        this.cjQ();
    }

    @Override
    protected boolean co(int n, int n2) {
        assert (this.Initialized);
        if (!super.co(n, n2)) {
            return false;
        }
        return n >= this.koV.cqx() && n < this.koV.cqx() + this.koV.getWidth() && n2 >= this.koV.cqy() && n2 < this.koV.cqy() + this.koV.getHeight();
    }

    protected void cjK() {
    }

    protected boolean b(hmt hmt2, boolean bl) {
        assert (this.koW);
        assert (this.Initialized);
        assert (lda.by(hmt2));
        assert (lda.yk(bl));
        return true;
    }

    protected void cjL() {
        this.cjQ();
    }

    protected boolean cjM() {
        return true;
    }

    protected void aV(List<hnt> list) {
    }

    protected lip cjN() {
        return null;
    }

    protected final void layout() {
        lip lip2 = this.cjN();
        String string = lip2 == null ? "" : lip2.esy();
        this.jBm.mV(string);
        int n = string.length() == 0 ? 0 : this.kLu.a(this.cjP().jFE, string, true, this.getWidth(), true);
        this.Nh(this.dzN.kLY.H + n);
        this.jBm.cB(0, this.dzN.kLY.H);
        this.jBm.cC(this.getWidth(), n);
    }

    protected final lgs cjO() {
        return this.jBm.cqD();
    }

    private hpe.c cjP() {
        return this.cbO().kJR;
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    protected final void cjQ() {
        assert (this.Initialized);
        lcq lcq2 = lcq.COLORSHIFT_NEUTRAL;
        if (this.isEnabled()) {
            if (this.cbO().jZG.cpS() && this.cbO().jZG.cpL() == this) {
                if (!this.cbO().jZG.cpM()) {
                    lcq2 = lcq2.V(this.cbO().jXk.jNW);
                }
            } else if (this.cqQ()) {
                lcq2 = lcq2.V(this.cbO().kIn.kEE);
            }
        } else {
            lcq2 = lcq2.V(this.cbO().kIn.kED);
        }
        this.jEN.J(lcq2);
    }

    private void mU(boolean bl) {
        this.jEN.a(bl, this.koV);
    }
}

