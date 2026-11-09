/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.Collection;

public class jfk
extends ihs {
    private static final int mXq = 36;
    private static final int mXr = 124;
    private boolean lBD;
    private ipc mXs;
    private ipc mXt;
    private iyp mXu;
    private jgd mXv;
    private jgc mXw;
    private jfn mXx;
    private jfm mXy;
    private jgj mXz;
    private jgi mXA;
    private ioc[] mXB;
    private ioc[] mXC;

    public jfk() {
        super("RolesWindow", "RolesWindow.swf");
        int n;
        this.OQ(jnz.nGe | jnz.nGi | jnz.nGr);
        this.qY(true);
        this.a(ire.mul);
        this.a("EAR" + jep.mVz.ordinal(), hsu.ldh, (Integer)jej.mUp.ordinal());
        this.a("EAR" + jep.mVA.ordinal(), hsu.ldh, (Integer)jej.mUq.ordinal());
        this.a("EAR" + jep.mVB.ordinal(), hsu.ldh, (Integer)jej.mUr.ordinal());
        this.a("EAR" + jep.mVC.ordinal(), hsu.ldh, (Integer)jej.mUs.ordinal());
        this.a("EAW" + jep.mVz.ordinal(), hsu.ldh, (Integer)jej.mUt.ordinal());
        this.a("EAW" + jep.mVA.ordinal(), hsu.ldh, (Integer)jej.mUu.ordinal());
        this.a("EAW" + jep.mVB.ordinal(), hsu.ldh, (Integer)jej.mUv.ordinal());
        this.a("EAW" + jep.mVC.ordinal(), hsu.ldh, (Integer)jej.mUw.ordinal());
        for (n = 0; n < lea.epx().aQI(); ++n) {
            this.a("ST" + n, hsu.ldh, (Integer)-1);
            this.a("AC" + n, hsu.ldh, false);
            this.a("AD" + n, hsu.ldh, false);
            this.a("AR" + n, hsu.ldh, false);
            for (int i = 0; i < 2; ++i) {
                this.a("RT" + n + i, hsu.ldh, (Integer)-1);
                this.a("PI" + n + i, hsu.ldh, "");
            }
        }
        this.a("ACN", hsu.ldh, "Blueprint1");
        this.a("PC", hsu.ldh, "Blueprint1");
        for (n = 0; n < 10; ++n) {
            this.a("RC" + n, hsu.ldh, "");
        }
        jen.dzL().mVf.a((jlg<jew, Integer>)new jls<jfk, jew, Integer>(this, this){
            final /* synthetic */ jfk mXD;
            {
                this.mXD = jfk2;
                super(jfk3);
            }

            public void b(jfk jfk2, jew jew2, Integer n) {
                jfk.a(jfk2, jew2, n);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((jfk)object, (jew)object2, (Integer)object3);
            }
        });
        jen.dzL().mVe.a((jlg<jew, Integer>)new jls<jfk, jew, Integer>(this, this){
            final /* synthetic */ jfk mXD;
            {
                this.mXD = jfk2;
                super(jfk3);
            }

            public void b(jfk jfk2, jew jew2, Integer n) {
                jfk.a(jfk2, n);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((jfk)object, (jew)object2, (Integer)object3);
            }
        });
        jen.dzL().mVj.a((jlg<jew, Integer>)new jls<jfk, jew, Integer>(this, this){
            final /* synthetic */ jfk mXD;
            {
                this.mXD = jfk2;
                super(jfk3);
            }

            public void b(jfk jfk2, jew jew2, Integer n) {
                jfk.a(this.mXD);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((jfk)object, (jew)object2, (Integer)object3);
            }
        });
        this.ql(false);
    }

    @Override
    public boolean isOpen() {
        return this.lBD;
    }

    public void setOpen(boolean bl) {
        if (bl == this.lBD) {
            return;
        }
        this.lBD = bl;
        this.setVisible(this.lBD);
        if (bl) {
            this.cqF();
            this.cFc();
        }
    }

    @Override
    public void a(jmr jmr2) {
        if (this.mXu == null) {
            return;
        }
        int n = this.mXu.doI();
        if (n < 0) {
            return;
        }
        jfl jfl2 = (jfl)this.mXu.SP(n);
        if (jmr2.iMe == jfl2.dBo()) {
            this.dBb();
        }
    }

    public void c(jmq jmq2) {
        if (this.mXu == null) {
            return;
        }
        for (int i = 0; i < this.mXu.doH(); ++i) {
            jfl jfl2 = (jfl)this.mXu.SP(i);
            if (jfl2.dBo() != jmq2) continue;
            this.mXu.SH(i);
            return;
        }
    }

    public boolean d(jmq jmq2) {
        boolean bl;
        if (this.mXu == null) {
            return true;
        }
        jfl jfl2 = (jfl)this.mXu.SP(this.mXu.doI());
        boolean bl2 = bl = jfl2.dBo() == jmq2;
        if (!bl) {
            this.c(jmq2);
        }
        return bl;
    }

    public void cyi() {
        super.cyi();
        this.dBe();
        this.dBc();
        this.dBd();
        this.dBf();
        jfk.cxP().cyJ().cIN().dzx();
        jel.dzv();
        hso.cxK().cxP().cyJ().cHN().cKp();
    }

    public jgi dAU() {
        return this.mXA;
    }

    public void dAV() {
        this.dBg();
        this.dBh();
        this.dBj();
        if (this.mXw == null) {
            return;
        }
        this.mXw.aTg();
        this.mXA.aTg();
    }

    public void Us(int n) {
        jfd jfd2 = jen.dzL().dzM().dzE().Ur(n);
        jfc jfc2 = jfd2.dAu();
        this.w("ST" + n, jfc2 != null ? ((bsn)jfc2.cCs().awE()).getType() : -1);
    }

    public void Ut(int n) {
        jfd jfd2 = jen.dzL().dzM().dzE().Ur(n);
        this.q("AR" + n, jfd2.dAw());
    }

    public void Uu(int n) {
        jfd jfd2 = jen.dzL().dzM().dzE().Ur(n);
        this.q("AD" + n, jfd2.dAx());
    }

    public void Uv(int n) {
        jfd jfd2 = jen.dzL().dzM().dzE().Ur(n);
        this.q("AC" + n, jfd2.dAy());
    }

    public void Uw(int n) {
        jfd jfd2 = jen.dzL().dzM().dzE().Ur(n);
        for (int i = 0; i < 2; ++i) {
            jfa jfa2 = jfd2.dAv();
            hwo hwo2 = jfa2.Ql(i);
            int n2 = jfa.q(hwo2);
            long l2 = jfa.r(hwo2);
            this.w("RT" + n + i, n2);
            this.B("PI" + n + i, l2 >= 0L ? l2 + "" : "");
        }
    }

    public jge.a dAW() {
        return this.mXw == null ? null : this.mXw.dAW();
    }

    public void a(jge.a a2, double d2) {
        if (this.mXw == null) {
            return;
        }
        if (hso.cxK().cxP().cyZ().cAh() || hso.cxK().cxP().cyZ().czZ()) {
            a2 = jge.a.mZv;
        }
        this.mXw.a(a2, d2);
        this.mXv.tn(a2 == jge.a.mZw);
        switch (a2) {
            case mZx: {
                this.setEnabled(false);
                break;
            }
            default: {
                this.setEnabled(true);
            }
        }
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.Rz(36);
        this.RA(124);
        this.cKJ();
        this.cXE().a(iqo.dmS());
        this.cXE().W(ipx.a(14, 1, new ipf[0]));
        ipx ipx2 = new ipx(this, irl.dnr()){
            final /* synthetic */ jfk mXD;
            {
                this.mXD = jfk2;
                super(iqz2);
            }

            public boolean c(int n, int n2, hzk hzk2, ifg ifg2) {
                ifh ifh2;
                if (ifg2 instanceof ifh && ((ifh2 = (ifh)ifg2).cQm() instanceof hwv || ifh2.cQm() instanceof hwo)) {
                    jfk.c(this.mXD).ai(jfk.b(this.mXD));
                }
                return super.c(n, n2, hzk2, ifg2);
            }
        };
        this.cXE().W(ipx2);
        ipx2.W(this.cGT());
        ipx2.W(this.dAX());
        jfk.cxP().cyJ().cIN().dzx();
        Collection collection = hso.cxK().cxP().d(this.getClass());
        if (collection != null && !collection.isEmpty()) {
            for (dxq dxq2 : collection) {
                jfk.cxP().cyJ().cIN().receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected boolean cYe() {
        jfl jfl2 = (jfl)this.mXu.SP(this.mXu.doI());
        return jfl2 != null && jfl2.getResizable();
    }

    @Override
    protected void cGR() {
        jfk.cyJ().cHw().a(hyc.lmO, false);
    }

    @Override
    protected void cYf() {
        super.cYf();
        int n = this.mXu.doI();
        if (this.mXB[n] != null) {
            this.dhJ().setSize(this.mXB[n].cf, this.mXB[n].cg);
        }
    }

    @Override
    protected void cKg() {
        super.cKg();
        int n = this.mXu.doI();
        if (this.mXC[n] != null) {
            this.mXC[n].set((int)this.cFw(), (int)this.cFx());
        }
    }

    @Override
    protected void cuf() {
        super.cuf();
        int n = this.mXu.doI();
        if (this.mXB[n] != null) {
            this.mXB[n].set(this.dhJ().getWidth(), this.dhJ().getHeight());
        }
    }

    @Override
    protected void ku(float f) {
        super.ku(f);
        if (this.mXt != null) {
            this.mXt.hz(f);
        }
    }

    @Override
    protected void cds() {
        super.cds();
        if (this.mXs != null) {
            this.mXs.setVisible(this.cXO() == ihx.lXF);
        }
    }

    private void cKJ() {
        this.a((ipf)new ipb("TitleIcon"), 9, 6, 30, lxx.sXP.bD(new Object[0]), null);
        this.cXM().qp(true);
    }

    private ipf cGT() {
        this.mXs = new ipb("role_window_main_bg_gold_line");
        this.mXt = new ipb("role_window_overview_bg");
        return ipx.j(this.mXs, ipx.a(0, 0, 0, 124, this.mXt));
    }

    private ipf dAX() {
        this.mXu = new iyp(this){
            final /* synthetic */ jfk mXD;
            {
                this.mXD = jfk2;
            }

            public void PU(int n) {
                jfk.a(this.mXD, n);
            }
        };
        this.mXv = new jgd();
        this.mXu.c((ipf)this.mXv, this.dAY());
        this.mXx = new jfn();
        this.mXu.c((ipf)this.mXx, this.dAZ());
        this.mXz = new jgj();
        this.mXu.c((ipf)this.mXz, this.dBa());
        this.mXB = new ioc[this.mXu.doH()];
        this.mXC = new ioc[this.mXu.doH()];
        this.mXu.SH(0);
        jen.dzL().mVl.b(new jlq<jfk>(this, this){
            final /* synthetic */ jfk mXD;
            {
                this.mXD = jfk2;
                super(jfk3);
            }

            public void g(jfk jfk2) {
                boolean bl = jen.dzL().dzG();
                hyn.cyJ().cHw().d(hyc.lmO, bl);
            }

            public /* synthetic */ void R(Object object) {
                this.g((jfk)object);
            }
        });
        jen.dzL().mUZ.b(new jlq<jfk>(this, this){
            final /* synthetic */ jfk mXD;
            {
                this.mXD = jfk2;
                super(jfk3);
            }

            public void g(jfk jfk2) {
                jfk.d(jfk2).sG(jen.dzL().dzM().dzC().dzG() || jen.dzL().dzM().dzD().dzG());
            }

            public /* synthetic */ void R(Object object) {
                this.g((jfk)object);
            }
        });
        jen.dzL().mVa.b(new jlq<jfk>(this, this){
            final /* synthetic */ jfk mXD;
            {
                this.mXD = jfk2;
                super(jfk3);
            }

            public void g(jfk jfk2) {
                jfk.d(jfk2).sG(jen.dzL().dzM().dzC().dzG() || jen.dzL().dzM().dzD().dzG());
            }

            public /* synthetic */ void R(Object object) {
                this.g((jfk)object);
            }
        });
        jen.dzL().mVb.b(new jlq<jfk>(this, this){
            final /* synthetic */ jfk mXD;
            {
                this.mXD = jfk2;
                super(jfk3);
            }

            public void g(jfk jfk2) {
                jfk.e(jfk2).sG(jen.dzL().dzM().dzE().dzG());
            }

            public /* synthetic */ void R(Object object) {
                this.g((jfk)object);
            }
        });
        return this.mXu;
    }

    private ipf dAY() {
        this.mXw = new jgc(this){
            final /* synthetic */ jfk mXD;
            {
                this.mXD = jfk2;
            }

            public void dBk() {
                jfk.c(this.mXD).ai(jfk.f(this.mXD));
            }

            public void dBl() {
                jfk.c(this.mXD).ai(jfk.f(this.mXD));
            }

            public void dBm() {
                jfk.c(this.mXD).ai(jfk.f(this.mXD));
            }

            public void dBn() {
                jfk.c(this.mXD).ai(jfk.b(this.mXD));
            }
        };
        return this.mXw;
    }

    private ipf dAZ() {
        this.mXy = new jfm(this, 1, 2){
            final /* synthetic */ jfk mXD;
            {
                this.mXD = jfk2;
                super(n, n2);
            }

            public void dtJ() {
                jfk.c(this.mXD).dps();
            }
        };
        this.dBc();
        return this.mXy;
    }

    private ipf dBa() {
        this.mXA = new jgi(this, 2, 2){
            final /* synthetic */ jfk mXD;
            {
                this.mXD = jfk2;
                super(n, n2);
            }

            public void dtJ() {
                jfk.c(this.mXD).dps();
            }
        };
        return this.mXA;
    }

    private void PS(int n) {
        this.pack();
        this.cXN().setVisible(this.cYe());
        this.dBb();
        jfl jfl2 = (jfl)this.mXu.SP(n);
        this.mXt.qP(jfl2.dBp());
        if (this.mXC[n] != null) {
            this.U(this.mXC[n].cf, this.mXC[n].cg);
        }
        this.pack();
    }

    private void dBb() {
        if (this.mXu == null) {
            return;
        }
        int n = this.mXu.doI();
        if (n < 0) {
            return;
        }
        jfl jfl2 = (jfl)this.mXu.SP(n);
        this.cXM().C(jfl2.aNA());
        if (jfl2.dBo() != null) {
            this.cXM().e(jfl2.dBo());
        } else {
            this.cXM().c((itd)null);
        }
    }

    private void dBc() {
        for (jep jep2 : jep.values()) {
            jet jet2 = jet.values()[this.nh("EAR" + jep2.ordinal())];
            jev jev2 = jev.values()[this.nh("EAW" + jep2.ordinal())];
            jen.dzL().dzM().dzD().a(jep2, jet2);
            jen.dzL().dzM().dzD().a(jep2, jev2);
        }
        jen.dzL().dzM().dzD().cDZ();
    }

    private void dBd() {
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            int n = this.nh("ST" + i);
            jfd jfd2 = jen.dzL().dzM().dzE().Ur(i);
            jfd2.b(jfd.Um(n));
            boolean bl = this.nk("AR" + i);
            boolean bl2 = this.nk("AD" + i);
            boolean bl3 = this.nk("AC" + i);
            jfd2.td(bl);
            jfd2.te(bl2);
            jfd2.tf(bl3);
            for (int j = 0; j < 2; ++j) {
                String string = this.nj("PI" + i + j);
                long l2 = string != null && !string.isEmpty() ? Long.valueOf(string) : -1L;
                int n2 = this.nh("RT" + i + j);
                jfd2.a(j, l2, n2);
            }
            jfd2.cDZ();
        }
    }

    private void dBe() {
        for (int i = 0; i < 10; ++i) {
            String string = this.nj("RC" + i);
            if (string == null || string.length() <= 0) continue;
            jew jew2 = new jew(string);
            jen.dzL().dzN().d(jew2);
        }
    }

    public void dBf() {
        String string = this.nj("ACN");
        jew jew2 = jen.dzL().dzN().sd(string);
        if (jew2 == null) {
            for (int i = 0; i < 10 && (jew2 = jen.dzL().dzN().Uj(i)) == null; ++i) {
            }
        }
        if (jew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "no configuration could be set to active");
            return;
        }
        jen.dzL().dzN().h(jew2);
        String string2 = this.nj("PC");
        if (string2 != null && string2.length() > 0) {
            jen.dzL().dzN().se(string2);
            jfk.cyJ().cIo().rV(string2);
        }
    }

    private void dBg() {
        for (jep jep2 : jep.values()) {
            this.w("EAR" + jep2.ordinal(), jen.dzL().dzM().dzD().j(jep2).ordinal());
            this.w("EAW" + jep2.ordinal(), jen.dzL().dzM().dzD().l(jep2).ordinal());
        }
    }

    private void dBh() {
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            this.Ux(i);
        }
    }

    private void Ux(int n) {
        this.Us(n);
        this.Uv(n);
        this.Ut(n);
        this.Uu(n);
        this.Uw(n);
    }

    private void dBi() {
        jew jew2 = jen.dzL().dzN().dAk();
        if (jew2 == null) {
            return;
        }
        this.B("ACN", jew2.getName());
    }

    private void dBj() {
        if (jen.dzL().dzN().dAl() != null) {
            this.B("PC", jen.dzL().dzN().dAl().getName());
        }
    }

    private void a(jew jew2, Integer n) {
        String string = jew2.fk();
        this.B("RC" + n, string);
        if (jew2 == jen.dzL().dzN().dAl()) {
            this.dBj();
            jfk.cyJ().cIo().rV(jew2.getName());
        }
        if (jew2 == jen.dzL().dzN().dAk()) {
            this.dBi();
        }
    }

    private void p(Integer n) {
        this.B("RC" + n, "");
    }

    private void setEnabled(boolean bl) {
        this.mXu.so(bl);
    }

    static /* synthetic */ void a(jfk jfk2, jew jew2, Integer n) {
        jfk2.a(jew2, n);
    }

    static /* synthetic */ void a(jfk jfk2, Integer n) {
        jfk2.p(n);
    }

    static /* synthetic */ void a(jfk jfk2) {
        jfk2.dBi();
    }

    static /* synthetic */ jgi b(jfk jfk2) {
        return jfk2.mXA;
    }

    static /* synthetic */ iyp c(jfk jfk2) {
        return jfk2.mXu;
    }

    static /* synthetic */ void a(jfk jfk2, int n) {
        jfk2.PS(n);
    }

    static /* synthetic */ jfn d(jfk jfk2) {
        return jfk2.mXx;
    }

    static /* synthetic */ jgj e(jfk jfk2) {
        return jfk2.mXz;
    }

    static /* synthetic */ jfm f(jfk jfk2) {
        return jfk2.mXy;
    }
}

