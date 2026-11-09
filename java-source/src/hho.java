/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hdm
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class hho
extends hmt
implements hhn.a,
hhq.a,
hma {
    public dph dAJ;
    public final boolean knl;
    public final hdm dXw;
    public static final lhu krZ = new lhu(449, 61, "gui/vendor/vendor_bar_item.dds");
    public static final lhu ksC = new lhu(102, 33, "gui/vendor/vendor_value_field.dds");
    public static final lhv ksD = new lhv(25, 25, "gui/vendor/vendor_button_default_normal.dds", "gui/vendor/vendor_button_default_pressed.dds");
    private final a ksE;
    private hpa ksF;
    private hqt ksG;
    private hhn ksH;
    private hhq ksI;
    private hhq ksJ;
    private hqz ksK;
    private hpe ksL;
    private hpe ksM;
    private lbn ksN = new lbn(this){
        final /* synthetic */ hho ksP;
        {
            this.ksP = hho2;
        }

        public void W() {
            hho.a(this.ksP);
        }
    };
    private lbn ksO = new lbn(this){
        final /* synthetic */ hho ksP;
        {
            this.ksP = hho2;
        }

        public void W() {
            hho.b(this.ksP);
        }
    };

    public hho(hdm hdm2, String string, lgg lgg2, lhf lhf2, a a2, boolean bl) {
        super((hnc)hdm2, string, lgg2, lhf2);
        this.dXw = hdm2;
        this.ksE = a2;
        this.knl = bl;
        this.ksF = new hpa((hnc)this.dXw, "Background", lgg.rlI, hho.krZ.kLY, krZ);
        this.j(this.ksF);
        if (!this.knl) {
            this.ksG = new hqt((hnc)this.dXw, "Checkbox", lgg.rlI, this.dXw.kJI.kpT.kLY, this.dXw.kJI, "");
            this.ksG.cvC().a(true, this.ksN);
            this.j(this.ksG);
        }
    }

    public void Hq(int n) {
        if (this.ksI != null) {
            this.ksI.ME(n);
        }
    }

    public void do(int n) {
        if (this.ksJ != null) {
            this.ksJ.ME(n * 10);
        }
    }

    public void h(dph dph2) {
        if (this.ksH != null) {
            this.ksH.remove();
            this.ksH = null;
        }
        if (this.ksI != null) {
            this.ksI.remove();
            this.ksI = null;
        }
        if (this.ksJ != null) {
            this.ksJ.remove();
            this.ksJ = null;
        }
        if (this.ksM != null) {
            this.ksM.remove();
            this.ksM = null;
        }
        if (this.ksK != null) {
            this.ksK.cvC().a(false, this.ksO);
            this.ksK.remove();
            this.ksK = null;
        }
        this.dAJ = dph2;
        if (this.dAJ == null) {
            return;
        }
        this.ksH = new hhn(this.dXw, "Item", lgg.rlI, lhf.rnv, this.dAJ, this, this.knl);
        this.j(this.ksH);
        this.ksI = this.dAJ.auW() ? new hhq(this.dXw, "Price Editor", lgg.rlI, lhf.rnv, this, 0, 5000000, 1, 1, "") : new hhq(this.dXw, "Price Editor", lgg.rlI, lhf.rnv, this, 0, 100000000, 0, 10, "");
        this.ksI.d(this.ksI.clG());
        this.j(this.ksI);
        this.ksI.setReadOnly(!this.knl);
        this.ksI.ME(this.dAJ.brZ());
        if (this.knl) {
            this.ksK = new hqz((hnc)this.dXw, "Default Price", lgg.rlI, hho.ksD.kLY, hpx.a.kXm, this.dXw.kJH, ksD);
            this.j(this.ksK);
            this.ksK.cvC().a(true, this.ksO);
        }
        if (this.dAJ.auW() && !this.knl) {
            this.ksJ = new hhq(this.dXw, "Quantity Editor", lgg.rlI, lhf.rnv, this, 0, this.dAJ.vf() * 10, 0, 10, "Qt");
            this.ksJ.d(this.ksJ.clG());
            this.j(this.ksJ);
            this.ksJ.setReadOnly(this.knl);
            this.ksJ.ME(this.dAJ.vf() * 10);
        }
        this.ksM = new hpe((hnc)this.dXw, "Item Name", lgg.rlI, lhf.rnv, this.dXw.kKo.kPG, cug.uG((int)this.dAJ.az()));
        this.j(this.ksM);
        this.clE();
    }

    public dph clz() {
        return this.dAJ;
    }

    public int bQQ() {
        if (this.ksI == null) {
            return 0;
        }
        return this.ksI.clT();
    }

    public void nD(boolean bl) {
        if (this.ksG != null) {
            this.ksG.on(bl);
        }
    }

    public boolean clA() {
        if (this.ksG == null) {
            return false;
        }
        return this.ksG.cvE();
    }

    public int clB() {
        if (this.ksJ != null) {
            return this.ksJ.clT() / 10;
        }
        if (this.dAJ == null) {
            return 0;
        }
        return 1;
    }

    private void clC() {
        if (this.dAJ == null) {
            return;
        }
        this.ksE.d(this.dAJ, this.bQQ());
    }

    private void clD() {
        this.ksG.on(!this.ksG.cvE());
        if (this.dAJ != null) {
            this.ksE.b(this.dAJ, this.ksG.cvE());
        }
    }

    @Override
    public void FG() {
        if (this.ksG != null) {
            this.ksG.cvC().a(false, this.ksN);
        }
        super.FG();
    }

    @Override
    public void cce() {
        super.cce();
        this.clE();
    }

    @Override
    public void cbM() {
        super.cbM();
        this.ksE.c(this);
    }

    void clE() {
        this.ksF.h(0, 0, hho.krZ.kLY.rmN, hho.krZ.kLY.H);
        if (this.ksG != null) {
            this.ksG.cB(4, 4);
        }
        if (this.ksH != null) {
            this.ksH.h(27, 6, 48, 48);
        }
        int n = this.getWidth() - 9;
        if (this.ksK != null) {
            this.ksK.cB(n - this.ksK.getWidth(), 18);
            n -= this.ksK.getWidth() + 2;
        }
        if (this.ksI != null) {
            this.ksI.cB(n - this.ksI.getWidth(), 18);
            n -= this.ksI.getWidth() + 2;
        }
        if (this.ksJ != null) {
            this.ksJ.cB(n - this.ksJ.getWidth(), 18);
            n -= this.ksJ.getWidth() + 2;
        }
        int n2 = 85;
        if (this.ksM != null) {
            this.ksM.h(n2, 22, n - n2, 20);
        }
    }

    void setPressed(boolean bl) {
    }

    public void clF() {
        if (this.dAJ != null) {
            this.ksE.f(this.dAJ);
        }
    }

    public final boolean a(hgy hgy2, boolean bl) {
        if (this.ksH != null) {
            return false;
        }
        if (bl) {
            return true;
        }
        ldv ldv2 = hgy2.cjV().dbx;
        this.ksE.a(ldv2, this);
        return false;
    }

    @Override
    public boolean b(hms hms2) {
        if (hms2 instanceof hgy && this.ksH == null) {
            hgy hgy2 = (hgy)hms2;
            int n = hgy2.cjV().ceF().az();
            if (n == cug.fkb) {
                return false;
            }
            if (cug.vL((int)n)) {
                return false;
            }
            return !hgy2.ceB().auU();
        }
        return false;
    }

    @Override
    public void cge() {
    }

    @Override
    public void cgf() {
    }

    @Override
    public void a(hhq hhq2) {
        if (this.dAJ == null) {
            return;
        }
        if (hhq2 == this.ksI && !hhq2.isReadOnly()) {
            this.ksE.c(this.dAJ, hhq2.clT());
        } else {
            this.ksE.a(this.dAJ, hhq2.clT() / 10);
        }
    }

    @Override
    public void f(dph dph2) {
        this.ksE.f(dph2);
    }

    static /* synthetic */ void a(hho hho2) {
        hho2.clD();
    }

    static /* synthetic */ void b(hho hho2) {
        hho2.clC();
    }
}

