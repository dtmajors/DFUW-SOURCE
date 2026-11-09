/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class jcp
extends ihs {
    private ipx mRE;
    private Map<jch, izm> mRF = lcn.emw();
    private izm mRG;
    private Set<aaz> mRH = lcn.emx();
    private Map<aaz, a> mmL = lcn.emw();
    private ArrayList<aaz> mRI;
    private int mRJ;

    public jcp() {
        super("QuestsWindowDebugger", "QuestsWindow.swf");
        this.OQ(jnz.nGe | jnz.nGi);
        this.U(272.0f, 272.0f);
        this.T(512.0f, 512.0f);
        this.qY(true);
        jcc.dwT().mQy.a((jlg<jch, jcm>)new jls<jcp, jch, jcm>(this, this){
            final /* synthetic */ jcp mRK;
            {
                this.mRK = jcp2;
                super(jcp3);
            }

            public void b(jcp jcp2, jch jch2, jcm jcm2) {
                jcp.a(jcp2, jch2, jcm2);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((jcp)object, (jch)object2, (jcm)object3);
            }
        });
    }

    @Override
    public void cCu() {
        super.cCu();
        this.a(new ipb("/dfdata/texture/gui/j2f/quests/title_icon_quests.png"), 0, 0, 34, lvn.sXN.bD("Quest Debugger"));
        this.cXE().a(irl.dnr());
        this.cXE().W(new ipk(0x161616));
        this.cXE().W(ipx.c(8, 8, 8, 8, this.cGU()));
    }

    @Override
    public void cGR() {
        this.setVisible(false);
    }

    private ipf cGU() {
        irk irk2 = new irk(ire.muk, 8);
        irk2.a((ipf)ipx.h(new ipk(0), this.dxU()), new irh(128));
        this.mRE = ipx.h(new ipk(0));
        irk2.b((ipf)this.mRE, new irh(128));
        this.dxW();
        return irk2;
    }

    private ipf dxU() {
        izm izm2 = new izm(this){
            final /* synthetic */ jcp mRK;
            {
                this.mRK = jcp2;
            }

            public boolean drj() {
                return true;
            }
        };
        this.b(izm2);
        return izm2;
    }

    private void b(izm izm2) {
        this.a(izm2, jcc.dwT().a(xa.bal));
        this.a(izm2, jcc.dwT().a(xa.bak));
        this.a(izm2, jcc.dwT().a(xa.baj));
        this.a(izm2, jcc.dwT().a(xa.bai));
        this.a(izm2, jcc.dwT().a(xa.bam));
    }

    private void a(izm izm2, jcd jcd2) {
        if (jcd2 == null) {
            return;
        }
        ize ize2 = new ize();
        ize2.sy(true);
        ize2.drd().o(jcd2.aND());
        izm2.c(ize2);
        this.a(ize2, jcd2.dxc());
        this.b(ize2, jcd2.wr());
    }

    private void a(ize ize2, List<jci> list) {
        if (list == null) {
            return;
        }
        for (int i = list.size() - 1; i >= 0; --i) {
            jci jci2 = list.get(i);
            ize ize3 = new ize();
            ize3.sy(true);
            ize3.drd().o(jci2.aND());
            ize2.b(ize3);
            this.b(ize3, jci2.wr());
        }
    }

    private void b(ize ize2, List<jch> list) {
        if (list == null) {
            return;
        }
        for (int i = list.size() - 1; i >= 0; --i) {
            jch jch2 = list.get(i);
            ize ize3 = new ize(this, jch2){
                final /* synthetic */ jch mPT;
                final /* synthetic */ jcp mRK;
                {
                    this.mRK = jcp2;
                    this.mPT = jch2;
                }

                public boolean du(int n, int n2) {
                    super.du(n, n2);
                    if (jcp.a(this.mRK) != null) {
                        jcp.a(this.mRK).setVisible(false);
                    }
                    jcp.a(this.mRK, (izm)jcp.b(this.mRK).get(this.mPT));
                    if (jcp.a(this.mRK) != null) {
                        jcp.a(this.mRK).setVisible(true);
                    }
                    return false;
                }
            };
            ize3.drd().o(jch2.aND());
            ize2.b(ize3);
            this.mRF.put(jch2, this.dxV());
        }
    }

    private izm dxV() {
        return new izm(this){
            final /* synthetic */ jcp mRK;
            {
                this.mRK = jcp2;
            }

            public boolean drj() {
                return true;
            }
        };
    }

    private void dxW() {
        for (Map.Entry<jch, izm> entry : this.mRF.entrySet()) {
            jch jch2 = entry.getKey();
            izm izm2 = entry.getValue();
            izm2.setVisible(false);
            this.a(izm2, jch2.wF().wa());
            this.mRE.W(izm2);
        }
    }

    private void a(izm izm2, Collection<abd> collection) {
        if (collection == null) {
            return;
        }
        for (abd abd2 : collection) {
            if (this.mRH.contains(abd2)) continue;
            this.mRH.add(abd2);
            ize ize2 = this.e(abd2);
            izm2.c(ize2);
            this.a(ize2, this.f(abd2));
        }
    }

    private void a(ize ize2, Collection<aaz> collection) {
        if (collection == null) {
            return;
        }
        for (aaz aaz2 : collection) {
            ize ize3 = this.e(aaz2);
            ize2.b(ize3);
            this.a(ize3, this.f(aaz2));
        }
    }

    private ize e(aaz aaz2) {
        a a2 = new a(this){
            final /* synthetic */ jcp mRK;
            {
                this.mRK = jcp2;
                super(null);
            }

            public boolean eB(int n, int n2) {
                jcp.a(this.mRK, this.mRL);
                return true;
            }

            public void d(ArrayList<hyj> arrayList) {
                super.d(arrayList);
            }
        };
        this.mmL.put(aaz2, a2);
        a2.mRL = aaz2;
        a2.sy(true);
        a2.drd().setText("Node " + aaz2.getID() + ": " + (aaz2.yp() != null ? aaz2.yp().exA() : "null instruction"));
        return a2;
    }

    private Collection<aaz> f(aaz aaz2) {
        ArrayList<aaz> arrayList = new ArrayList<aaz>();
        Set<Integer> set = aaz2.yA();
        if (set != null) {
            for (int n : set) {
                aaz aaz3 = aaz2.wF().dG(n).xO();
                if (this.mRH.contains(aaz3)) continue;
                this.mRH.add(aaz3);
                arrayList.add(aaz3);
            }
        }
        return arrayList;
    }

    private void g(aaz aaz2) {
        this.mRI = new ArrayList();
        while (true) {
            this.mRI.add(0, aaz2);
            a a2 = this.mmL.get(aaz2);
            a2 = (a)a2.dqR();
            if (a2 == null) break;
            aaz2 = a2.mRL;
        }
        this.mRJ = 0;
        xe.baL.ef(aaz2.wF().getID());
    }

    private void a(jch jch2, jcm jcm2) {
        if (this.mRI == null || this.mRJ >= this.mRI.size()) {
            return;
        }
        aaz aaz2 = this.mRI.get(this.mRJ);
        int n = aaz2.getID();
        if (jcm2.dxG()) {
            List<acp> list = ((aay)aaz2).getTasks();
            if (list != null) {
                Set<Integer> set = aaz2.yA();
                block0: for (Integer n2 : set) {
                    aaw aaw2 = aaz2.wF().dG(n2);
                    for (acp acp2 : list) {
                        aaz aaz3;
                        if (acp2.xk() != aaw2.getValue() || (aaz3 = aaw2.xO()) != aaz2) continue;
                        ++this.mRJ;
                        if (this.mRJ == this.mRI.size() - 1) {
                            this.mRI = null;
                        }
                        jcm2.dxJ().eo(acp2.getID());
                        continue block0;
                    }
                }
            } else assert (false);
        } else {
            ++this.mRJ;
            if (this.mRJ == this.mRI.size() - 1) {
                this.mRI = null;
            }
            xe.baL.eg(jcm2.qS());
        }
    }

    static /* synthetic */ void a(jcp jcp2, jch jch2, jcm jcm2) {
        jcp2.a(jch2, jcm2);
    }

    static /* synthetic */ izm a(jcp jcp2) {
        return jcp2.mRG;
    }

    static /* synthetic */ izm a(jcp jcp2, izm izm2) {
        jcp2.mRG = izm2;
        return jcp2.mRG;
    }

    static /* synthetic */ Map b(jcp jcp2) {
        return jcp2.mRF;
    }

    static /* synthetic */ void a(jcp jcp2, aaz aaz2) {
        jcp2.g(aaz2);
    }
}

