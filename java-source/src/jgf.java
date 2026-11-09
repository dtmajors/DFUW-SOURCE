/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jgf
extends ipy {
    private int lBn;
    private static int mZB = -1;
    private ipb mZC;
    private ipb mZD;

    public jgf(int n) {
        this.lBn = n;
        this.a(irl.dnr());
        this.W(new ipb("skill_slot_bg"));
        this.W(this.dEd());
        this.W(new ipb("skill_slot_inner_shadow"));
        this.W(this.dEe());
        jen.dzL().mUU.a((jlh<jfd, jfc, jfc>)new jlt<jgf, jfd, jfc, jfc>(this, this){
            final /* synthetic */ jgf mZE;
            {
                this.mZE = jgf2;
                super(jgf3);
            }

            public void a(jgf jgf2, jfd jfd2, jfc jfc2, jfc jfc3) {
                if (jfd2.dAr() == jgf.a(this.mZE)) {
                    jgf.a(this.mZE, jfd2);
                }
            }
        });
        jfd jfd2 = jen.dzL().dzM().dzE().Ur(this.lBn);
        this.k(jfd2);
    }

    @Override
    public boolean dx(int n, int n2) {
        jfc jfc2 = jen.dzL().dzM().dzE().Ur(this.lBn).dAu();
        if (jfc2 == null) {
            return false;
        }
        jew jew2 = jen.dzL().dzN().dAk();
        return jew2 == null || !jew2.dAf() || !jek.TV(this.lBn);
    }

    @Override
    public ifg dy(int n, int n2) {
        jfc jfc2 = jen.dzL().dzM().dzE().Ur(this.lBn).dAu();
        if (jfc2 == null) {
            return null;
        }
        jew jew2 = jen.dzL().dzN().dAk();
        if (jew2 != null && jew2.dAf() && jek.TV(this.lBn)) {
            return null;
        }
        mZB = this.lBn;
        bsj bsj2 = jen.dzL().dzM().dzE().Ur(this.lBn).dAu().cCs();
        return new ifh(new hwv(bsj2), -n, -n2);
    }

    @Override
    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        if (hso.cxK().cxP().cyZ().aQl()) {
            return false;
        }
        jew jew2 = jen.dzL().dzN().dAk();
        if (jew2 != null && jew2.dAf() && jek.TV(this.lBn)) {
            return false;
        }
        return jek.b(ifg2, this.lBn);
    }

    @Override
    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        if (hso.cxK().cxP().cyZ().aQl()) {
            return false;
        }
        jew jew2 = jen.dzL().dzN().dAk();
        if (jew2 != null && jew2.dAf() && jek.TV(this.lBn)) {
            return false;
        }
        if (jek.b(ifg2, this.lBn)) {
            mZB = -1;
            hwv hwv2 = (hwv)((ifh)ifg2).cQm();
            jen.dzL().dzM().dzE().Ur(this.lBn).b(jfd.d(hwv2.cCs()));
            return true;
        }
        return false;
    }

    @Override
    public void d(ifg ifg2) {
        if (mZB == this.lBn && jek.b(ifg2, this.lBn)) {
            mZB = -1;
            jen.dzL().dzM().dzE().Ur(this.lBn).b(null);
        }
    }

    @Override
    public hyn dd(int n, int n2) {
        return jek.TU(this.lBn);
    }

    private ipf dEd() {
        this.mZC = new ipb();
        return this.mZC;
    }

    private ipf dEe() {
        this.mZD = new ipb("skill_slot_outline_02");
        return this.mZD;
    }

    private void k(jfd jfd2) {
        jfc jfc2 = jfd2.dAu();
        this.mZC.qP(jek.a(jfc2));
        this.mZD.qP(jfc2 != null ? "skill_slot_outline_01" : "skill_slot_outline_02");
    }

    static /* synthetic */ int a(jgf jgf2) {
        return jgf2.lBn;
    }

    static /* synthetic */ void a(jgf jgf2, jfd jfd2) {
        jgf2.k(jfd2);
    }
}

