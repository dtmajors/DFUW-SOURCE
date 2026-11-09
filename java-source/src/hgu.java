/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.ArrayList;

public class hgu
extends hmt
implements hma,
hmb {
    private hpa kpg;
    private final hpe kph;
    private final hpe kpi;
    private final hdm dXw;
    private int ResourceType = -1;
    private final hgt kfJ;
    private int kpj = 0;
    private int kpk = 0;

    public hgu(hdm hdm2, String string, lgg lgg2, lhf lhf2, hgt hgt2) {
        super((hnc)hdm2, string, lgg2, lhf2);
        this.kfJ = hgt2;
        this.dXw = hdm2;
        this.kph = new hpe(this.kLu, null, lgg.rlI, this.cqv(), this.dXw.kIM, "");
        this.kpi = new hpe(this.kLu, null, lgg.rlI, this.cqv(), this.dXw.kIO, "");
        this.j(this.kph);
        this.j(this.kpi);
    }

    public void l(int n) {
        ler ler2;
        if (this.ResourceType == n) {
            return;
        }
        this.ResourceType = n;
        if (this.kpg != null) {
            this.kpg.remove();
            this.kpg = null;
        }
        if ((ler2 = lea.enW().acv(this.ResourceType)) == null || !(ler2 instanceof lgw)) {
            this.ResourceType = -1;
            this.cjT();
            return;
        }
        lgw lgw2 = (lgw)ler2;
        hdw hdw2 = hdw.LW(this.ResourceType);
        if (hdw2 == null) {
            this.ResourceType = -1;
            this.cjT();
            return;
        }
        lhu lhu2 = hdw2.atw();
        this.kpg = new hpa(this.kLu, (String)null, lgg.rlI, this.cqv(), hdw2.atw());
        ljp ljp2 = new ljp((float)this.cqv().rmN / (float)lhu2.kLY.rmN, (float)this.cqv().H / (float)lhu2.kLY.H);
        this.kpg.n(ljp2);
        this.j(this.kpg);
        this.kpg.cqG();
        this.cjT();
    }

    public int az() {
        return this.ResourceType;
    }

    private boolean cjS() {
        lgw lgw2 = (lgw)lea.enW().acv(this.ResourceType);
        if (lgw2 == null) {
            return true;
        }
        return this.kfJ.Mv(this.az()) + this.kfJ.Mw(this.az()) == 0;
    }

    void cjT() {
        int n;
        int n2;
        lgw lgw2 = (lgw)lea.enW().acv(this.ResourceType);
        if (lgw2 == null) {
            this.kpi.mV("");
            this.kph.mV("");
            return;
        }
        if (lgw2.auW()) {
            n2 = 20;
            n = 10;
        } else {
            n2 = 5;
            n = 1;
        }
        this.kpj = this.kfJ.Mv(this.az());
        if (this.kpj < n2) {
            this.kpi.a(this.dXw.kIP);
        } else {
            this.kpi.a(this.dXw.kIO);
        }
        this.kpi.mV("" + this.kpj);
        if (!lgw2.awU()) {
            this.kph.mV("");
            return;
        }
        this.kpk = this.kfJ.Mw(this.az());
        if (this.kpk < n) {
            this.kph.a(this.dXw.kIN);
        } else {
            this.kph.a(this.dXw.kIM);
        }
        this.kph.mV("" + this.kpk);
        this.cjU();
        this.kph.cqF();
        this.kpi.cqF();
    }

    public final boolean a(hgy hgy2, boolean bl) {
        if (bl) {
            return true;
        }
        this.l(hgy2.ceB().Type);
        return false;
    }

    public final boolean a(hgu hgu2, boolean bl) {
        if (bl) {
            return true;
        }
        int n = this.ResourceType;
        int n2 = hgu2.az();
        this.l(n2);
        hgu2.l(n);
        return false;
    }

    private void cjU() {
        lcq lcq2 = lcq.COLORSHIFT_NEUTRAL;
        if (this.dXw.jZG.cpS() && this.dXw.jZG.cpL() == this) {
            if (!this.dXw.jZG.cpM()) {
                lcq2 = lcq2.V(this.dXw.jXk.jNW);
            }
        } else if (this.cqQ()) {
            lcq2 = lcq2.V(this.dXw.kIn.kEE);
        } else if (this.cjS()) {
            lcq2 = lcq2.V(this.dXw.kIn.kED);
        }
        if (this.kpg != null) {
            this.kpg.H(lcq2);
        }
    }

    @Override
    protected void chL() {
        super.chL();
        this.cjU();
    }

    @Override
    protected void chK() {
        super.chK();
        this.cjU();
    }

    @Override
    protected void ccc() {
        hdw hdw2;
        super.ccc();
        if (this.ResourceType != -1 && (hdw2 = hdw.LW(this.ResourceType)) != null) {
            ArrayList<hnt> arrayList = lcn.emv();
            this.dXw.a(null, (hdv)hdw2, arrayList);
            hnt hnt2 = hdw2.awU() ? new hnt(this.dXw.kKn, "Quantity: " + this.kpk + " / " + this.kpj) : new hnt(this.dXw.kKn, "Quantity: " + this.kpj);
            arrayList.add(hnt2);
            this.dXw.a(hdw2.atw(), arrayList);
        }
    }

    @Override
    protected void cbM() {
        super.cbM();
        if (this.ResourceType != -1 && !this.kLu.csd()) {
            this.dXw.jZG.a(this, this.dXw.crN());
        }
    }

    @Override
    public boolean b(hms hms2) {
        return hms2 instanceof hgy || hms2 instanceof hgu;
    }

    @Override
    public void cge() {
    }

    @Override
    public void cgf() {
    }

    @Override
    public void cbJ() {
        this.cjU();
    }

    @Override
    public void cbL() {
        this.cjU();
    }

    @Override
    public boolean a(hmt hmt2, boolean bl) {
        if (hmt2 instanceof hgu) {
            return ((hgu)hmt2).a(this, bl);
        }
        if (hmt2 instanceof hob) {
            if (bl) {
                return true;
            }
            this.l(-1);
            return false;
        }
        return false;
    }

    @Override
    public void cbK() {
        this.cjU();
    }
}

