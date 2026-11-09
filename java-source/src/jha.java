/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class jha
extends ihs
implements huv,
huw,
huz,
hvb,
hve {
    private static final int nbS = 300;
    private static final int nbT = 50;
    private static final int nbU = 600;
    private static final int nbV = 356;
    private static final String nbW = "WindowHeaderIcon";
    private static final int nbX = 360;
    private static final int nbY = 28;
    private static final String lLC = "BackgroundBitmap";
    private static final String nbZ = "ListGradientTop";
    private static final String nca = "ListGradientBottom";
    private static final String mIR = "HorizontalLineBig";
    private static final int ncb = 0;
    private static final int ncc = 0;
    private static final int ncd = 50;
    private static final int nce = 0;
    private static final int ncf = 80;
    private static final int ncg = 25;
    private static final int nch = 12;
    private static final int nci = 0;
    private static final int ncj = 0;
    private static final int nck = 1;
    private static final int ncl = 75;
    private static final int ncm = 0;
    private static final int ncn = 75;
    private static final int nco = 0;
    private static final int ncp = 75;
    private static final int ncq = 50;
    private static final int ncr = 10;
    private static final int ncs = 10;
    private static final int nct = 14;
    private static final int ncu = 1;
    private dmn les = null;
    private jlw ncv = null;
    private iqa mfL = null;
    private jhc ncw = null;
    private jhd ncx = null;
    private iug ncy = null;
    private Map<bcp, jhb> ncz = lcn.emw();

    public bcp dFn() {
        jhb jhb2 = this.dFo();
        return jhb2 == null ? null : jhb2.dFr();
    }

    private jhb dFo() {
        for (jhb jhb2 : this.ncz.values()) {
            if (!jhb2.getSelected()) continue;
            return jhb2;
        }
        return null;
    }

    public void tt(boolean bl) {
        if (this.ncw != null) {
            this.ncw.sK(bl);
        }
    }

    public void dFp() {
        for (jhb jhb2 : this.ncz.values()) {
            jhb2.setExpanded(false);
        }
    }

    public jha() {
        super("SFTerritoriesWindow", "territorieswindow.swf");
        this.OQ(jnz.nGi);
        this.U(600.0f, 356.0f);
        this.g(300.0f, 50.0f, 600.0f, 356.0f);
        this.a(ire.mul);
        this.les = hso.cxK().cxP().czd();
        this.ncv = hso.cxK().cxT().dJf();
    }

    @Override
    protected void cEc() {
        if (!hso.cxK().cxP().cyJ().cHB().dKc()) {
            this.setVisible(false);
            return;
        }
        super.cEc();
        if (this.isVisible()) {
            this.les.a(this);
            this.dFq();
        } else {
            this.les.b(this);
        }
    }

    @Override
    protected void cGR() {
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.p(0, 0, 50, 80);
        this.cXE().a(iqv.dnf());
        this.mfL = new iqa(lLC, 0, 1, 0, 75);
        this.cXE().W(ipx.a(0, 0, 75, 55, this.mfL));
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(50, 1, new ipf[0]));
        this.cXE().W(ipx.c(new ipf[]{ipx2}));
        ipx ipx3 = ipx.j(new ipf[0]);
        ipx2.W(ipx.c(new ipf[]{ipx3}));
        this.ncw = new jhc(this);
        ipx3.W(this.ncw);
        this.ncx = new jhd(this.les);
        ipx3.W(this.ncx);
        this.ncy = new a(this, null);
        ((izh)this.ncy).W(nbZ, nca);
        ((izh)this.ncy).a(iun.mAj);
        ipx3.W(ipx.c(new ipf[]{ipx.l(ipx.a(10, 1, new ipf[0]), ipx.c(new ipf[]{this.ncy}), ipx.a(14, 1, new ipf[0]))}));
        ipx3.W(ipx.a(1, 20, new ipf[0]));
        if (this.ncw.dsX()) {
            this.cXM().a(this.ncw.dsY(), 0);
        }
        this.a(new ipb(nbW), 12, 0, 25, lyh.trO.bD(new Object[0]));
        this.dFq();
    }

    @Override
    protected ihy e(joa joa2) {
        return new jhe(this, joa2, this.cXQ());
    }

    @Override
    protected iox cGl() {
        return null;
    }

    @Override
    protected ios cGk() {
        return null;
    }

    public void dFq() {
        Map.Entry<bcp, jhb> entry;
        if (this.ncy == null || this.ncw == null || this.les == null) {
            return;
        }
        this.ncy.removeAllItems();
        float f2 = 0.0f;
        bcp bcp2 = null;
        Set<bcp> set = this.les.bqm();
        Iterator<Map.Entry<bcp, jhb>> iterator = this.ncz.entrySet().iterator();
        while (iterator.hasNext()) {
            entry = iterator.next();
            if (set.contains(entry.getKey())) continue;
            ((jhb)entry.getValue()).setSelected(false);
            ((jhb)entry.getValue()).setExpanded(false);
            iterator.remove();
        }
        entry = lcn.emx();
        for (bcp bcp3 : set) {
            float f3 = this.les.c(bcp3);
            if (f3 > f2) {
                bcp2 = bcp3;
                f2 = f3;
            }
            if (this.ncw.cVT() == null || bcp3.iV().toLowerCase().contains(this.ncw.cVT().toLowerCase())) {
                entry.add(bcp3);
                continue;
            }
            jhb jhb2 = this.ncz.get(bcp3);
            if (jhb2 == null) continue;
            jhb2.setSelected(false);
            jhb2.setExpanded(false);
        }
        if (entry.size() > 0) {
            bcp[] bcpArray = entry.toArray(new bcp[entry.size()]);
            boolean bl = false;
            int n = bcpArray.length - 1;
            while (!bl) {
                bl = true;
                for (int j = 0; j < n; ++j) {
                    if (!(this.ncw.dFy() ? this.a(bcpArray[j], bcpArray[j + 1]) > 0 : this.a(bcpArray[j], bcpArray[j + 1]) < 0)) continue;
                    bcp object = bcpArray[j];
                    bcpArray[j] = bcpArray[j + 1];
                    bcpArray[j + 1] = object;
                    bl = false;
                }
                --n;
            }
            int n2 = 0;
            for (bcp bcp3 : bcpArray) {
                jhb jhb2 = this.ncz.get(bcp3);
                if (jhb2 == null) {
                    jhb2 = new jhb(n2, this.les, this.ncv, this);
                    jhb2.x(bcp3);
                    jhb2.kN(this.mfL.getAlpha());
                    this.ncz.put(bcp3, jhb2);
                }
                jhb2.setIndex(n2++);
                jhb2.dFq();
                this.ncy.c(jhb2);
            }
        }
        this.ncx.x(bcp2);
    }

    private int a(bcp bcp2, bcp bcp3) {
        switch (this.ncw.dFx()) {
            case ndJ: {
                return bcp2.iV().compareToIgnoreCase(bcp3.iV());
            }
            case ndK: {
                bcr bcr2;
                bcp bcp4 = this.dFn();
                if (bcp4 == null) {
                    return bcp2.iV().compareToIgnoreCase(bcp3.iV());
                }
                if (bcp4 == bcp2) {
                    return 1;
                }
                if (bcp4 == bcp3) {
                    return -1;
                }
                bcr bcr3 = bcp4.gL(bcp2.iG());
                if (bcr3 == (bcr2 = bcp4.gL(bcp3.iG()))) {
                    return bcp2.iV().compareToIgnoreCase(bcp3.iV());
                }
                if (bcr3 == bcr.cXi) {
                    return 1;
                }
                if (bcr2 == bcr.cXi) {
                    return -1;
                }
                if (bcr3 == bcr.cXh) {
                    return 1;
                }
                if (bcr2 == bcr.cXh) {
                    return -1;
                }
                if (bcr3 == bcr.cXf) {
                    return 1;
                }
                if (bcr2 == bcr.cXf) {
                    return -1;
                }
                if (bcr3 == bcr.cXe) {
                    return 1;
                }
                if (bcr2 == bcr.cXe) {
                    return -1;
                }
                return bcp2.iV().compareToIgnoreCase(bcp3.iV());
            }
            case ndM: {
                int n = (int)(this.les.c(bcp2) - this.les.c(bcp3));
                return n == 0 ? bcp2.iV().compareToIgnoreCase(bcp3.iV()) : n;
            }
            case ndL: {
                int n = this.les.b(bcp2) - this.les.b(bcp3);
                return n == 0 ? bcp2.iV().compareToIgnoreCase(bcp3.iV()) : n;
            }
            case ndN: {
                int n = this.les.e(bcp2) - this.les.e(bcp3);
                return n == 0 ? bcp2.iV().compareToIgnoreCase(bcp3.iV()) : n;
            }
            case ndO: {
                int n = this.les.a(bcp2, ayb.cvj) - this.les.a(bcp3, ayb.cvj);
                return n == 0 ? bcp2.iV().compareToIgnoreCase(bcp3.iV()) : n;
            }
            case ndP: {
                int n = this.les.a(bcp2, ayb.cvk) - this.les.a(bcp3, ayb.cvk);
                return n == 0 ? bcp2.iV().compareToIgnoreCase(bcp3.iV()) : n;
            }
            case ndQ: {
                int n = this.les.h(bcp2) - this.les.h(bcp3);
                return n == 0 ? bcp2.iV().compareToIgnoreCase(bcp3.iV()) : n;
            }
            case ndR: {
                int n = this.les.k(bcp2) - this.les.k(bcp3);
                return n == 0 ? bcp2.iV().compareToIgnoreCase(bcp3.iV()) : n;
            }
        }
        return 0;
    }

    @Override
    public void cyF() {
        this.dFq();
    }

    @Override
    public void g(bbh bbh2) {
        this.dFq();
    }

    @Override
    public void i(azg azg2) {
        this.dFq();
    }

    @Override
    public void f(bbi bbi2) {
        this.dFq();
    }

    @Override
    public void c(bcp bcp2, ldv ldv2, bcr bcr2) {
        this.dFq();
    }

    @Override
    public void u(bcp bcp2) {
        this.dFq();
    }

    @Override
    public void v(bcp bcp2) {
        this.dFq();
    }

    @Override
    public void w(bcp bcp2) {
        this.dFq();
    }

    @Override
    protected void ku(float f2) {
        super.ku(f2);
        if (this.mfL != null) {
            this.mfL.hz(f2);
        }
        if (this.ncz != null && !this.ncz.isEmpty()) {
            for (jhb jhb2 : this.ncz.values()) {
                jhb2.kN(f2);
            }
        }
        if (this.ncw != null) {
            this.ncw.kN(f2);
        }
    }
}

