/*
 * Decompiled with CFR.
 */
public class ile
extends ijc {
    private boolean mhi;
    private boolean mhj;
    private boolean mhk;
    private boolean mhl;
    private ilf mgU;
    private ilf mhm;
    private ilf mgW;

    public ile() {
        super(true, true, lyu.tKH);
        ipx ipx2 = ipx.j(new ipf[0]);
        this.cXE().W(ipx2);
        this.mgU = new ilf("ti_normal_label_main", "icons_relation_user_friend", 18, isf.mwM, 14, 0xE0E0E0, "Target Name");
        ipx2.W(ipx.d(this.mgU));
        ipx2.W(ipx.a(1, 1, new ipf[0]));
        this.mhm = new ilf("ti_normal_label_secondary", "icons_relation_friendly", 18, isf.mwM, 12, 0xE0E0E0, "Target Clan");
        ipx2.W(ipx.d(this.mhm));
        ipx2.W(ipx.a(1, 1, new ipf[0]));
        this.mgW = new ilf("ti_normal_label_prowess", "icon_prowess", 16, isf.mwM, 12, 7131065, "999K");
        ipx2.W(ipx.d(this.mgW));
        ipx2.W(ipx.a(1, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipb("ti_label_end")));
    }

    public boolean dcF() {
        return this.mhi;
    }

    public void qJ(boolean bl) {
        this.mhi = bl;
        this.mgW.setVisible(bl);
        this.mci.dLF();
    }

    public boolean dcG() {
        return this.mhj;
    }

    public void qK(boolean bl) {
        this.mhj = bl;
        this.mgU.setIconVisible(bl);
        this.mci.dLF();
    }

    public boolean dcH() {
        return this.mhk;
    }

    public void qL(boolean bl) {
        this.mhk = bl;
        this.mhm.setIconVisible(bl);
        this.mgW.setIconVisible(bl);
        this.mci.dLF();
    }

    public boolean dcI() {
        return this.mhl;
    }

    public void qM(boolean bl) {
        this.mhl = bl;
        this.mci.dLF();
    }

    @Override
    public ije dae() {
        return new ilc(this);
    }

    @Override
    public ikd daf() {
        return ikd.mfu;
    }

    @Override
    public void cZZ() {
        switch (this.daD()) {
            case mcL: {
                this.mgU.m("ti_small_label_main", 0, 12);
                this.mhm.m("ti_small_label_secondary", 16, 11);
                this.mgW.m("ti_small_label_prowess", 14, 11);
                break;
            }
            case mcM: {
                this.mgU.m("ti_normal_label_main", 0, 14);
                this.mhm.m("ti_normal_label_secondary", 18, 12);
                this.mgW.m("ti_normal_label_prowess", 16, 12);
                break;
            }
            case mcN: {
                this.mgU.m("ti_large_label_main", 0, 16);
                this.mhm.m("ti_large_label_secondary", 20, 14);
                this.mgW.m("ti_large_label_prowess", 18, 14);
            }
        }
    }

    @Override
    public void daa() {
        if (this.mgU != null) {
            this.mgU.kI(this.daE());
        }
        if (this.mhm != null) {
            this.mhm.kI(this.daE());
        }
        if (this.mgW != null) {
            this.mgW.kI(this.daE());
        }
    }

    @Override
    public int daz() {
        return this.day() + this.daF();
    }

    @Override
    public int dar() {
        return this.daA() + this.daF();
    }

    @Override
    public void Re(int n) {
        this.Rd(n - this.daF());
    }

    @Override
    public void Rc(int n) {
        this.Rf(n - this.daF());
    }
}

