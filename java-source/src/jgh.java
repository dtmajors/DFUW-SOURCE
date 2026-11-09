/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jgh
extends ipy
implements hvv {
    private int lBn;
    private static int mZB = -1;
    private ipb mZP;
    private ipa[] mZQ = new ipa[2];
    private static iqz mdv = new iqu(32, 32);

    public jgh(int n) {
        this.lBn = n;
        this.a(mdv);
        this.W(ipx.d(new ipb("skill_slot_quickslot_bg")));
        this.W(ipx.d(new ipb("skill_slot_quickslot_shadow")));
        this.W(ipx.d(this.dEo()));
        for (int i = 0; i < 2; ++i) {
            this.mZQ[i] = new ipa();
            this.W(ipx.d(ipx.a(28, 28, this.mZQ[i])));
        }
        jen.dzL().mUY.c((jlf<jfd>)new jlr<jgh, jfd>(this, this){
            final /* synthetic */ jgh mZR;
            {
                this.mZR = jgh2;
                super(jgh3);
            }

            public void b(jgh jgh2, jfd jfd2) {
                if (jfd2.dAr() == jgh.a(this.mZR)) {
                    jgh.a(this.mZR, jfd2);
                }
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jgh)object, (jfd)object2);
            }
        });
        jfd jfd2 = jen.dzL().dzM().dzE().Ur(this.lBn);
        this.l(jfd2);
    }

    @Override
    public void a(ioa ioa2) {
        super.a(ioa2);
        hso.cxK().cxP().cyZ().a((hvv)this);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
            hso.cxK().cxP().cyZ().b((hvv)this);
        }
    }

    public void Uz(int n) {
        if (this.mZQ[n] != null) {
            this.mZQ[n].djl();
        }
    }

    public void aTg() {
        if (jek.TY(this.lBn)) {
            this.mZP.qP("skill_slot_quickslot_outline_02");
            this.cqG();
        } else {
            this.mZP.qP("skill_slot_quickslot_outline_01");
            this.cqF();
        }
    }

    @Override
    public boolean dx(int n, int n2) {
        return !jek.TY(this.lBn);
    }

    @Override
    public ifg dy(int n, int n2) {
        mZB = this.lBn;
        hwo hwo2 = jek.TW(this.lBn);
        return hwo2 != null ? new ifh(hwo2.cBl(), -32, -32) : null;
    }

    @Override
    public boolean c(int n, int n2, hzk hzk2, ifg ifg2) {
        if (jek.c(ifg2, this.lBn)) {
            this.cqF();
            this.mZP.qP("skill_slot_quickslot_outline_01");
            return true;
        }
        return false;
    }

    @Override
    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        return jek.c(ifg2, this.lBn);
    }

    @Override
    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        if (jek.c(ifg2, this.lBn)) {
            if (jek.TY(this.lBn)) {
                this.mZP.qP("skill_slot_quickslot_outline_02");
                this.cqG();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        if (jek.c(ifg2, this.lBn)) {
            mZB = -1;
            hwo hwo2 = (hwo)((ifh)ifg2).cQm();
            jen.dzL().dzM().dzE().Ur(this.lBn).v(hwo2);
            return true;
        }
        return false;
    }

    @Override
    public void d(ifg ifg2) {
        if (mZB == this.lBn && jek.c(ifg2, this.lBn)) {
            mZB = -1;
            hwo hwo2 = (hwo)((ifh)ifg2).cQm();
            jen.dzL().dzM().dzE().Ur(this.lBn).b(hwo2, false);
        }
    }

    @Override
    public hyn dd(int n, int n2) {
        return jek.TX(this.lBn);
    }

    @Override
    public void p(bsh bsh2) {
    }

    @Override
    public void q(bsh bsh2) {
    }

    @Override
    public void r(bsh bsh2) {
        for (ipa ipa2 : this.mZQ) {
            hwo hwo2 = (hwo)ipa2.cQm();
            if (!bsi.a(bsh2, hwo2 != null ? hwo2.cBu() : null)) continue;
            ipa2.djl();
        }
    }

    private ipf dEo() {
        this.mZP = new ipb("skill_slot_quickslot_outline_02");
        return this.mZP;
    }

    private void l(jfd jfd2) {
        for (int i = 0; i < 2; ++i) {
            hwo hwo2 = jfd2.Ql(i);
            this.mZQ[i].f(hwo2 != null ? hwo2.cBl() : null);
        }
        this.aTg();
    }

    static /* synthetic */ int a(jgh jgh2) {
        return jgh2.lBn;
    }

    static /* synthetic */ void a(jgh jgh2, jfd jfd2) {
        jgh2.l(jfd2);
    }
}

