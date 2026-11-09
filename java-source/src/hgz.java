/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cwx
 *  cxd
 *  hdm
 */
import java.util.List;

public class hgz
extends hgq {
    private final lbn jEL = new lbn(this){
        final /* synthetic */ hgz kpJ;
        {
            this.kpJ = hgz2;
        }

        public final void W() {
            if (!hgz.a(this.kpJ)) {
                return;
            }
            hgz.b(this.kpJ);
        }
    };
    private boolean Initialized;
    private double kbP;
    private double kbQ;
    private double kpI;
    private hpa kpE;

    public hgz(hdm hdm2, String string, lgg lgg2, hdx hdx2, hea hea2, boolean bl, boolean bl2) {
        super(hdm2, string, lgg2, null, hea2, hdx2, false, bl, bl2);
        this.refresh();
    }

    public hea ckh() {
        return (hea)this.kmX;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.kpE != null) {
            this.kpE.remove();
            this.kpE = null;
            this.kLu.kAz.eme().a(false, this.jEL);
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected boolean b(hmt hmt2, boolean bl) {
        if (!super.b(hmt2, bl)) {
            return false;
        }
        if (hmt2 instanceof hfw) {
            hfw hfw2 = (hfw)hmt2;
            return hfw2.a(this, bl);
        }
        if (hmt2 instanceof hfk) {
            hfk hfk2 = (hfk)hmt2;
            return hfk2.a(this, bl);
        }
        return false;
    }

    @Override
    protected void cjJ() {
        this.refresh();
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        return this.kLu.kNl;
    }

    @Override
    protected void aV(List<hnt> list) {
        this.cbO().a(this.kmX, this.kaW, list);
        if (lea.enZ().isDescendant(this.kaW.Type, cxd.fJq)) {
            this.aX(list);
        }
    }

    private void aX(List<hnt> list) {
        hea hea2 = this.cbP().kck.b((hdx)this.kaW);
        if (hea2 == null) {
            return;
        }
        cxc cxc2 = hea2.ceH();
        if (cxc2 == null) {
            return;
        }
        if (!(cxc2 instanceof cwx)) {
            return;
        }
        aja[] ajaArray = ((cwx)cxc2).bek();
        if (ajaArray == null) {
            return;
        }
        for (aja aja2 : ajaArray) {
            if (!(aja2 instanceof akc)) continue;
            akc akc2 = (akc)aja2;
        }
    }

    private void cjZ() {
        double d2 = this.kLu.kAz.emb();
        boolean bl = d2 <= this.kbQ;
        if (bl != (this.kpE != null)) {
            if (bl) {
                this.kpE = new hpa(this.kLu, (String)null, lgg.rlI, this.cqv(), this.cbO().jXk.jMb);
                this.j(this.kpE);
                this.kpE.H(this.cbO().jXk.jMc);
                this.kpI = d2;
            } else {
                this.kpE.remove();
                this.kpE = null;
            }
            this.kLu.kAz.eme().a(bl, this.jEL);
            this.koV.H(bl ? this.cbO().jXk.jMd : lcq.BRIGHT_WHITE);
        }
        if (this.kpE != null) {
            double d3 = this.getHeight();
            double d4 = this.kbP <= d2 ? (d2 - this.kbP) / (this.kbQ - this.kbP) : 1.0 - (d2 - this.kpI) / (this.kbP - this.kpI);
            this.kpE.cB(0, (int)(d4 * d3));
        }
    }

    private void refresh() {
        hea hea2 = this.ckh();
        if (hea2 != null) {
            this.kbP = hea2.cez();
            this.kbQ = hea2.ceA();
            this.cjZ();
        }
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ boolean a(hgz hgz2) {
        return hgz2.Initialized;
    }

    static /* synthetic */ void b(hgz hgz2) {
        hgz2.cjZ();
    }
}

