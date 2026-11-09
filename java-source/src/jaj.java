/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class jaj
extends iho {
    private static final int mGR = 10;
    private static final int mGS = 25;
    private static final int mGT = 3;
    private static final int mGU = 30;
    private ipf mGV;
    private izw lVr;
    private ipx mGW;
    private ipb lCl;
    private ipx mGX;
    private iug myS;
    private ipb mGY;
    private ist mGZ;
    private List<jjh> mHa = lcn.emv();
    private boolean lBD = false;
    private hzz mHb;
    private static jaj mHc = null;

    public jaj() {
        super("MapSearchWindow", "MapSearchWindow.swf");
        this.OQ(jnz.nGi | jnz.nGm);
        this.U(372.0f, 56.0f);
        this.T(372.0f, 56.0f);
    }

    @Override
    public boolean isOpen() {
        return this.lBD;
    }

    public static void sP(boolean bl) {
        if (bl) {
            if (mHc == null) {
                mHc = new jaj();
                mHc.setGUID(hso.cxK().cxP().cyJ().getMessageDelegator().bzv());
                hso.cxK().cxP().cyJ().getMessageDelegator().a((amf)((Object)mHc));
            }
            mHc.sQ(true);
        } else if (mHc != null) {
            mHc.sQ(false);
        }
    }

    public static void duP() {
        if (mHc != null) {
            mHc.duY();
        }
    }

    public static void cSL() {
        jaj.sP(false);
        hso.cxK().cxP().cyJ().cHx().b(hyy.b.lti, false);
    }

    public static void cSM() {
        hso.cxK().cxP().cyJ().cHx().b(hyy.b.lti, true);
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.QT(9);
        this.Rz(7);
        this.RA(10);
        this.QW(9);
        this.f(new ipb("title_icon_small_search"));
        this.cXE().a(iqo.dmT());
        this.cXE().W(ipx.l(ipx.a(9, 1, new ipf[0]), ipx.h(this.duQ(), this.duR()), ipx.a(16, 1, new ipf[0])));
        this.cXE().W(ipx.a(1, 2, new ipf[0]));
        this.cXE().W(ipx.l(this.duU(), ipx.a(16, 1, new ipf[0])));
        this.pack();
    }

    @Override
    protected ios cGS() {
        return null;
    }

    @Override
    protected iox cGl() {
        return null;
    }

    @Override
    protected void cGo() {
        super.cGo();
        this.cFN();
    }

    @Override
    protected void ku(float f2) {
        super.ku(f2);
        if (this.lVr != null) {
            this.lVr.kh(f2);
        }
        if (this.mGV != null) {
            this.mGV.hz(f2);
        }
        if (this.lCl != null) {
            this.lCl.hz(f2);
        }
        if (this.mGY != null) {
            this.mGY.hz(f2);
        }
    }

    @Override
    protected void cGR() {
        jaj.sP(false);
    }

    @Override
    protected void cGq() {
        super.cGq();
        new lie(this, 0.2, false){
            final /* synthetic */ jaj mHd;
            {
                this.mHd = jaj2;
                super(d2, bl);
            }

            public void dh(double d2) {
                jaj.a(this.mHd).dqb().L();
            }
        }.e(this.MessageDelegator);
    }

    private void sQ(boolean bl) {
        if (bl == this.lBD) {
            return;
        }
        this.lBD = bl;
        this.setVisible(bl);
        hso.cxK().cxP().cyJ().cHx().a(hyy.b.lti, bl ? 1 : 0);
        if (!this.lBD) {
            this.duY();
        } else if (this.lVr != null) {
            this.lVr.dqb().L();
        }
    }

    private ipf duQ() {
        this.mGV = new ipk(0x161616, 347, 32);
        return this.mGV;
    }

    private ipf duR() {
        ipx ipx2 = ipx.c(2, 2, 2, 2, new ipf[0]);
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx3);
        ipx3.W(ipx.c(this.cWo()));
        ipx3.W(ipx.a(2, 1, new ipf[0]));
        ipx3.W(ipx.a(28, 28, ipx.d(this.duS())));
        ipx3.W(ipx.d(new ipk(0x313131, 1, 20)));
        ipx3.W(ipx.a(28, 28, ipx.d(this.dgd())));
        return ipx2;
    }

    private ipf cWo() {
        this.lVr = new izw(this){
            final /* synthetic */ jaj mHd;
            {
                this.mHd = jaj2;
            }

            public void od(String string) {
                super.od(string);
                jaj.b(this.mHd);
            }

            public void v(String string, boolean bl) {
                jaj.a(this.mHd, bl);
            }

            public void pI(String string) {
                super.pI(string);
                jaj.b(this.mHd);
            }

            public ipf dui() {
                return null;
            }
        };
        this.lVr.dug().a(isf.mwO, 15);
        this.lVr.dug().Rk(0x8B8B8B);
        this.lVr.dug().o(lxi.tqm.bD(new Object[0]));
        this.lVr.dqb().sp(false);
        this.lVr.dqb().a(isf.mwO, 15);
        this.lVr.dqb().Rk(0x161616);
        this.lVr.dqb().b(isr.eN(3, 30), 3, true);
        this.lVr.dqb().L();
        return this.lVr;
    }

    private ipf duS() {
        iwg iwg2 = new iwg(this){
            final /* synthetic */ jaj mHd;
            {
                this.mHd = jaj2;
            }

            public void cLq() {
                jaj.a(this.mHd).dqb().dpv();
            }
        };
        return iwg2;
    }

    private ipf dgd() {
        ivb ivb2 = new ivb(this){
            final /* synthetic */ jaj mHd;
            {
                this.mHd = jaj2;
            }

            public void cLq() {
                jaj.c(this.mHd);
            }
        };
        return ivb2;
    }

    private ipf duT() {
        iqa iqa2 = new iqa();
        return null;
    }

    private ipf duU() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.setVisible(false);
        this.mGW = ipx2;
        this.lCl = new ipb("bg_map_search_entry");
        this.mGX = ipx.h(this.lCl, ipx.e(Integer.MAX_VALUE, 250, this.cPR()));
        ipx2.W(this.mGX);
        ipx2.W(this.cXk());
        return ipx2;
    }

    private ipf cPR() {
        this.myS = new izn(this){
            final /* synthetic */ jaj mHd;
            {
                this.mHd = jaj2;
            }

            public int dtX() {
                return 0;
            }
        };
        return this.myS;
    }

    private ipf cXk() {
        ipx ipx2 = ipx.h(new ipf[0]);
        ipx2.W(this.duV());
        ipx2.W(this.duW());
        return ipx2;
    }

    private ipf duV() {
        this.mGY = new ipb("bg_map_search_entry_footer");
        return this.mGY;
    }

    private ipf duW() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 5, new ipf[0]));
        ipx2.W(ipx.d(this.duX()));
        return ipx2;
    }

    private ipf duX() {
        this.mGZ = new ist();
        this.mGZ.a(isf.mwO, 14);
        this.mGZ.Rk(0x4B4B4B);
        return this.mGZ;
    }

    private void cWS() {
        this.lVr.dqb().L();
        for (jjh object : this.mHa) {
            object.tZ(false);
            object.setVisible(object.dJt().isVisible());
        }
        this.mHa.clear();
        this.myS.removeAllItems();
        String string = this.rG(this.lVr.getText().toLowerCase());
        if (this.rF(string)) {
            hso.cxK().cxT().a(string, this.mHa, true);
            ArrayList<jai> arrayList = lcn.emv();
            for (jjh jjh2 : this.mHa) {
                jjh2.tZ(true);
                jjh2.setVisible(true);
                arrayList.add(new jai(jjh2));
            }
            Collections.sort(arrayList, new Comparator<jai>(this){
                final /* synthetic */ jaj mHd;
                {
                    this.mHd = jaj2;
                }

                public int a(jai jai2, jai jai3) {
                    int n = jai2.dbQ().getText().compareTo(jai3.dbQ().getText());
                    if (n != 0) {
                        return n;
                    }
                    return jai2.duK() - jai3.duK();
                }

                public /* synthetic */ int compare(Object object, Object object2) {
                    return this.a((jai)object, (jai)object2);
                }
            });
            for (jai jai2 : arrayList) {
                this.myS.c(jai2);
            }
            this.mGX.setVisible(this.mHa.size() > 0);
            this.mGW.setVisible(true);
            this.mGZ.setText(lxi.tqn.bD(this.mHa.size()).exA());
            this.Rz(this.mHa.size() > 10 ? 0 : 16);
            this.RA(70);
        } else {
            this.mGW.setVisible(false);
            this.Rz(7);
            this.RA(10);
        }
        this.pack();
        jaj.cyJ().updateLayout();
    }

    private void duY() {
        this.lVr.dqb().setText("");
        this.b((ipq)null);
        this.lVr.dqb().cEj();
        for (jjh jjh2 : this.mHa) {
            jjh2.setVisible(jjh2.dJt().isVisible());
            jjh2.tZ(false);
        }
        this.mHa.clear();
        this.myS.removeAllItems();
        this.mGW.setVisible(false);
        this.Rz(7);
        this.RA(10);
        this.pack();
        jaj.cyJ().updateLayout();
    }

    private void sR(boolean bl) {
        if (bl) {
            this.lVr.dqb().Rk(0);
            if (this.mHb != null) {
                this.mHb.getMessageDelegator().hd(this.mHb.getGUID());
                this.mHb = null;
            }
        } else {
            this.lVr.dqb().Rk(0xFF0000);
            if (this.mHb == null) {
                ioc ioc2 = this.lVr.eo(0, 0);
                this.mHb = new hzz(ioc2.cf, ioc2.cg, this.lVr.getWidth(), this.lVr.getHeight(), true, lxi.tql.bD(3).exA().toUpperCase());
                jaj.cxP().k((hyn)this.mHb);
            }
        }
    }

    private boolean rF(String string) {
        return string != null && string.length() >= 3;
    }

    private String rG(String string) {
        return string.trim();
    }

    static /* synthetic */ izw a(jaj jaj2) {
        return jaj2.lVr;
    }

    static /* synthetic */ void b(jaj jaj2) {
        jaj2.cWS();
    }

    static /* synthetic */ void a(jaj jaj2, boolean bl) {
        jaj2.sR(bl);
    }

    static /* synthetic */ void c(jaj jaj2) {
        jaj2.duY();
    }
}

