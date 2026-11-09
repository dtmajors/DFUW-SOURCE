/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class jdk
extends ipx {
    private jch mSc;
    private izm mSZ;
    private jdp mTa;
    private ipx mTb;
    private iuh mTc;
    private ipx mTd;
    private Map<jcm, jdl> mTe = lcn.emw();
    private ipb mTf;

    public jdk(jch jch2) {
        this.mSc = jch2;
        this.a(iqo.dmT());
        this.W(new jdh(jch2));
        this.W(this.cGX());
        this.W(ipx.i(this.cPR()));
        this.W(this.cGX());
        this.W(ipx.a(1, 8, new ipf[0]));
        if (this.mSc.dxd() != jbz.mQl) {
            ipf[] ipfArray = new ipf[1];
            this.mTf = new ipb("/dfdata/texture/gui/j2f/quests/quest_log_footer.png");
            ipfArray[0] = this.mTf;
            this.W(ipx.d(ipfArray));
        } else {
            ipf[] ipfArray = new ipf[1];
            this.mTf = new ipb("/dfdata/texture/gui/j2f/quests/quest_log_footer_completed.png");
            ipfArray[0] = this.mTf;
            this.W(ipx.d(ipfArray));
        }
        this.W(ipx.a(1, 16, new ipf[0]));
        this.mSZ.e(this.mTc);
        lie lie2 = new lie(this, 0.1, false){
            final /* synthetic */ jdk mTg;
            {
                this.mTg = jdk2;
                super(d2, bl);
            }

            public void dh(double d2) {
                jdk.a(this.mTg).drN().dik().pack();
            }
        };
        lie2.e(hso.cxK().cxP().cyJ().getMessageDelegator());
        jcc.dwT().mQC.a((jlg<jcm, jcf>)new jls<jdk, jcm, jcf>(this, this){
            final /* synthetic */ jdk mTg;
            {
                this.mTg = jdk2;
                super(jdk3);
            }

            public void b(jdk jdk2, jcm jcm2, jcf jcf2) {
                if (jcm2.dxK() == jdk.b(this.mTg)) {
                    jdk.a(jdk2, jcm2, jcf2);
                }
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((jdk)object, (jcm)object2, (jcf)object3);
            }
        });
        jcc.dwT().mQy.a((jlg<jch, jcm>)new jls<jdk, jch, jcm>(this, this){
            final /* synthetic */ jdk mTg;
            {
                this.mTg = jdk2;
                super(jdk3);
            }

            public void a(jdk jdk2, jch jch2, jcm jcm2) {
                if (jch2 == jdk.b(this.mTg)) {
                    jdk.a(jdk2, jcm2);
                }
            }
        });
        jcc.dwT().mQz.a((jlg<jch, jcm>)new jls<jdk, jch, jcm>(this, this){
            final /* synthetic */ jdk mTg;
            {
                this.mTg = jdk2;
                super(jdk3);
            }

            public void a(jdk jdk2, jch jch2, jcm jcm2) {
                if (jch2 == jdk.b(this.mTg)) {
                    jdk.b(jdk2, jcm2);
                }
            }
        });
        jcc.dwT().mQB.c((jlf<jcn>)new jlr<jdk, jcn>(this, this){
            final /* synthetic */ jdk mTg;
            {
                this.mTg = jdk2;
                super(jdk3);
            }

            public void c(jdk jdk2, jcn jcn2) {
                if (jcn2.dxS() != null && jcn2.dxS().dxK() == jdk.b(this.mTg)) {
                    jdk.a(jdk2, jcn2);
                }
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((jdk)object, (jcn)object2);
            }
        });
        jcc.dwT().mQA.c((jlf<jcn>)new jlr<jdk, jcn>(this, this){
            final /* synthetic */ jdk mTg;
            {
                this.mTg = jdk2;
                super(jdk3);
            }

            public void c(jdk jdk2, jcn jcn2) {
                if (jcn2.dxS() != null && jcn2.dxS().dxK() == jdk.b(this.mTg)) {
                    jdk.b(jdk2, jcn2);
                }
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((jdk)object, (jcn)object2);
            }
        });
        jcc.dwT().mQG.a((jlg<jch, Integer>)new jls<jdk, jch, Integer>(this, this){
            final /* synthetic */ jdk mTg;
            {
                this.mTg = jdk2;
                super(jdk3);
            }

            public void b(jdk jdk2, jch jch2, Integer n) {
                jdk.a(jdk2, jch2, n);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((jdk)object, (jch)object2, (Integer)object3);
            }
        });
        jcc.dwT().mQs.c((jlf<jch>)new jlr<jdk, jch>(this, this){
            final /* synthetic */ jdk mTg;
            {
                this.mTg = jdk2;
                super(jdk3);
            }

            public void b(jdk jdk2, jch jch2) {
                jdk.a(jdk2, jch2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jdk)object, (jch)object2);
            }
        });
    }

    private ipf cGX() {
        return ipx.l(ipx.a(4, 1, new ipf[0]), new ipk(0x2F2F2F, 484, 1), ipx.a(8, 1, new ipf[0]));
    }

    private ipf cPR() {
        this.mSZ = new izm();
        this.mSZ.dtS();
        this.mSZ.Td(8);
        this.mSZ.c(new iuh(this.dyG()));
        this.mTc = new iuh((ipf)ipx.a(1, 1, new ipf[0]));
        this.mSZ.c(this.mTc);
        if (this.mSc.dxo()) {
            this.mSZ.c(new iuh(this.dyF()));
        }
        if (!this.mSc.isCompleted()) {
            Map<Integer, jcm> map = this.mSc.dxl();
            if (map != null) {
                this.mTd = ipx.j(new ipf[0]);
                this.mSZ.c(new iuh((ipf)this.mTd));
                for (jcm jcm2 : map.values()) {
                    this.c(jcm2);
                }
            }
        } else {
            this.dyH();
        }
        return this.mSZ;
    }

    private ipf dyF() {
        this.mTa = new jdp(this.mSc);
        return this.mTa;
    }

    private ipf dyG() {
        this.mTb = ipx.j(new ipf[0]);
        this.mTb.W(new jds(this.mSc.wF().vU()));
        List<jcf> list = this.mSc.wi();
        if (list != null) {
            for (jcf jcf2 : list) {
                this.mTb.W(new jds(this.mSc, jcf2));
            }
        }
        return this.mTb;
    }

    private void c(jcm jcm2) {
        jdl jdl2 = null;
        if (jcm2.dxI()) {
            jdl2 = new jdw(jcm2);
        } else if (jcm2.dxG()) {
            jdl2 = new jdr(jcm2);
        } else {
            List<jcn> list = jcm2.dxE();
            if ((list == null || list.isEmpty()) && jcm2.yp() == null) {
                return;
            }
            jdl2 = new jea(jcm2);
        }
        if (jdl2 != null && this.mTd != null) {
            this.mTd.W(jdl2);
        }
        this.mTe.put(jcm2, jdl2);
    }

    private void a(jcm jcm2, jcf jcf2) {
        if (jcf2 != null) {
            this.mTb.W(new jds(jcm2.dxK(), jcf2));
            this.mSZ.e(this.mTc);
            this.pack();
        }
    }

    private void d(jcm jcm2) {
        this.c(jcm2);
        this.pack();
    }

    private void e(jcm jcm2) {
        jdl jdl2 = this.mTe.remove(jcm2);
        if (jdl2 != null) {
            jdl2.removeFromParent();
            this.pack();
        }
    }

    private void a(jcn jcn2) {
        jdl jdl2 = this.mTe.get(jcn2.dxS());
        if (jdl2 != null) {
            jdl2.d(jcn2);
            this.pack();
        }
    }

    private void b(jcn jcn2) {
        jdl jdl2 = this.mTe.get(jcn2.dxS());
        if (jdl2 != null) {
            jdl2.c(jcn2);
            this.pack();
        }
    }

    private void a(jch jch2, Integer n) {
        if (this.mTa != null) {
            this.mTa.TS(n);
        }
    }

    private void f(jch jch2) {
        if (jch2 == this.mSc && this.mSc.dxd() == jbz.mQl) {
            this.dyH();
            this.mTf.qP("/dfdata/texture/gui/j2f/quests/quest_log_footer_completed.png");
        }
    }

    private void dyH() {
        List<jcl> list = jcc.dwW().ea(this.mSc.wF().getID());
        if (list != null && !list.isEmpty()) {
            this.mSZ.c(new iuh((ipf)new ipk(0x2F2F2F, 484, 1)));
            this.mSZ.c(new iuh((ipf)ipx.a(1, 8, new ipf[0])));
            this.mSZ.c(new iuh((ipf)new jdy(list, false)));
            this.mSZ.c(new iuh((ipf)ipx.a(1, 8, new ipf[0])));
        }
    }

    static /* synthetic */ izm a(jdk jdk2) {
        return jdk2.mSZ;
    }

    static /* synthetic */ jch b(jdk jdk2) {
        return jdk2.mSc;
    }

    static /* synthetic */ void a(jdk jdk2, jcm jcm2, jcf jcf2) {
        jdk2.a(jcm2, jcf2);
    }

    static /* synthetic */ void a(jdk jdk2, jcm jcm2) {
        jdk2.d(jcm2);
    }

    static /* synthetic */ void b(jdk jdk2, jcm jcm2) {
        jdk2.e(jcm2);
    }

    static /* synthetic */ void a(jdk jdk2, jcn jcn2) {
        jdk2.a(jcn2);
    }

    static /* synthetic */ void b(jdk jdk2, jcn jcn2) {
        jdk2.b(jcn2);
    }

    static /* synthetic */ void a(jdk jdk2, jch jch2, Integer n) {
        jdk2.a(jch2, n);
    }

    static /* synthetic */ void a(jdk jdk2, jch jch2) {
        jdk2.f(jch2);
    }
}

