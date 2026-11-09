/*
 * Decompiled with CFR.
 */
import java.text.NumberFormat;
import java.util.Set;

public class jhb
extends ipz
implements htl,
iua {
    private static final int lpw = 0x2F2F2F;
    private static final int ncC = 12357465;
    private static final int ncD = 0xABABAB;
    private static final int ncE = 12357465;
    private static final int ncF = 12357465;
    private static final int ncG = 0x4F4F4F;
    private static final int ncH = 0xABABAB;
    private static final int ncI = 0x4F4F4F;
    private static final int ncJ = 986895;
    private static final int ncK = 14;
    private static final int ncL = 15;
    private static final int ncM = 17;
    private static final int ncN = 15;
    private static final int ncO = 13;
    private static final String ncP = "IconClan";
    private static final String ncQ = "IconClanAlly";
    private static final String ncR = "IconClanEnemy";
    private static final String ncS = "IconClanNeutral";
    private static final String ncT = "IconClanFriendly";
    private static final String ncU = "IconClanWary";
    private static final int ncV = 1;
    private static final int ncW = 20;
    private static final int ncX = 15;
    private static final int ncY = 1;
    private static final String ncZ = "IconTerritories";
    private static final String nda = "IconCities";
    private static final String ndb = "IconHamlets";
    private static final String ndc = "IconVillages";
    private static final String ndd = "IconFortresses";
    private static final String nde = "IconArea";
    private static final String ndf = "ExpandedRowBackground";
    private static final String ndg = "HorizontalLineNormal";
    private static final int ndh = 5;
    private static final int ndi = 1;
    private static final int ndj = 1;
    private static final int ndk = 3;
    private ipk ndl = null;
    private ipx ndm = null;
    private c ndn = null;
    private iwv ndo = null;
    private ist ndp = null;
    private ist ndq = null;
    private ivd ndr = null;
    private ipx nds = null;
    private iqa ndt = null;
    private ist ndu = null;
    private ist ndv = null;
    private isi ndw = null;
    private ist ndx = null;
    private isi ndy = null;
    private ist ndz = null;
    private isi ndA = null;
    private ist ndB = null;
    private isi ndC = null;
    private ipb ndD = null;
    private ipb ndE = null;
    private jha ndF = null;
    private dmn les = null;
    private jlw ncv = null;
    private boolean jV = false;
    private int adk = 0;
    private bcp ndG = null;

    public bcp dFr() {
        return this.ndG;
    }

    public void x(bcp bcp2) {
        if (this.ndG == bcp2) {
            return;
        }
        this.ndG = bcp2;
        this.dFq();
    }

    @Override
    public boolean getSelected() {
        return this.jV;
    }

    @Override
    public void setSelected(boolean bl) {
        if (this.jV == bl) {
            return;
        }
        this.jV = bl;
        iul.b(this, bl);
        if (this.ndp != null) {
            this.ndp.Rk(this.jV ? 12357465 : 0xABABAB);
        }
        if (this.ndo != null) {
            this.ndo.a(this.jV ? ncP : ncS, this.jV ? lyw.tLJ.bD(new Object[0]) : lqb.rWM.bD(new Object[0]));
        }
    }

    public boolean isExpanded() {
        return this.nds.djL();
    }

    public void setExpanded(boolean bl) {
        if (bl == this.isExpanded()) {
            return;
        }
        this.nds.setVisible(bl);
        this.pack();
        this.dlx();
        if (this.ndn.dir() != bl) {
            this.ndn.hX(bl);
        }
        this.ndF.tt(bl);
    }

    public int getIndex() {
        return this.adk;
    }

    public void setIndex(int n) {
        if (this.adk == n) {
            return;
        }
        int n2 = this.adk;
        this.adk = n;
        this.ndD.setVisible(this.adk == 0);
    }

    public jhb(int n, dmn dmn2, jlw jlw2, jha jha2) {
        this.adk = n;
        this.les = dmn2;
        this.ndF = jha2;
        this.ncv = jlw2;
        this.a(irl.dnr());
        this.ndl = new ipk(986895);
        this.ndl.setVisible(false);
        this.ndD = new ipb(ndg);
        this.ndE = new ipb(ndg);
        ipx ipx2 = ipx.j(new ipf[0]);
        this.W(ipx.c(new ipf[]{ipx.h(this.ndl, ipx.j(this.ndD, ipx.l(ipx.a(10, 1, new ipf[0]), ipx.c(new ipf[]{ipx2}), ipx.a(10, 1, new ipf[0])), this.ndE))}));
        ipx2.W(ipx.a(1, 6, new ipf[0]));
        ipx2.W(ipx.c(new ipf[]{this.dFs()}));
        ipx2.W(this.dFt());
        ipx2.W(ipx.a(1, 6, new ipf[0]));
        this.ndD.setVisible(this.adk == 0);
    }

    private ipx dFs() {
        this.ndm = ipx.l(new ipf[0]);
        this.ndn = new c(this, null);
        this.ndm.W(ipx.d(this.ndn));
        ipk ipk2 = new ipk();
        ipk2.setColor(0x2F2F2F);
        ipk2.a((iqz)null);
        ipk2.setSize(1, 20);
        this.ndm.W(ipx.a(2, 1, new ipf[0]));
        this.ndm.W(ipx.d(ipk2));
        this.ndm.W(ipx.a(6, 1, new ipf[0]));
        this.ndo = new iwv(ncS, lqb.rWM.bD(new Object[0]));
        this.ndm.W(ipx.d(this.ndo));
        ipk ipk3 = new ipk();
        ipk3.setColor(0x2F2F2F);
        ipk3.a((iqz)null);
        ipk3.setSize(1, 20);
        this.ndm.W(ipx.a(6, 1, new ipf[0]));
        this.ndm.W(ipx.d(ipk3));
        this.ndm.W(ipx.a(8, 1, new ipf[0]));
        this.ndp = new ist();
        this.ndp.setText("TESTING");
        this.ndp.Rk(0xABABAB);
        this.ndp.zY(14);
        this.ndm.W(ipx.c(new ipf[]{ipx.l(ipx.d(this.ndp), ipx.c(new ipf[0]))}));
        ipk ipk4 = new ipk();
        ipk4.setColor(0x2F2F2F);
        ipk4.a((iqz)null);
        ipk4.setSize(1, 20);
        this.ndm.W(ipx.a(8, 1, new ipf[0]));
        this.ndm.W(ipx.d(ipk4));
        this.ndq = new ist();
        this.ndq.setText("0");
        this.ndq.Rk(12357465);
        this.ndq.zY(17);
        iwv iwv2 = new iwv(ncZ, lyw.tLD.bD(new Object[0]));
        this.ndm.W(ipx.a(48, 20, ipx.l(ipx.c(new ipf[0]), ipx.d(this.ndq), ipx.a(3, 1, new ipf[0]), iwv2)));
        ipk ipk5 = new ipk();
        ipk5.setColor(0x2F2F2F);
        ipk5.a((iqz)null);
        ipk5.setSize(1, 20);
        this.ndm.W(ipx.a(6, 1, new ipf[0]));
        this.ndm.W(ipx.d(ipk5));
        this.ndm.W(ipx.a(9, 1, new ipf[0]));
        this.ndr = new b(this, 0x575757, lyh.tDX);
        this.ndm.W(this.ndr);
        ipk ipk6 = new ipk();
        ipk6.setColor(0x2F2F2F);
        ipk6.a((iqz)null);
        ipk6.setSize(1, 20);
        this.ndm.W(ipx.a(9, 1, new ipf[0]));
        this.ndm.W(ipx.d(ipk6));
        this.ndm.W(ipx.a(4, 1, new ipf[0]));
        a a2 = new a(this, null);
        this.ndm.W(ipx.d(a2));
        return this.ndm;
    }

    private ipx dFt() {
        this.nds = ipx.j(ipx.a(1, 6, new ipf[0]));
        this.nds.setVisible(false);
        ipx ipx2 = ipx.h(new ipf[0]);
        this.nds.W(ipx.c(new ipf[]{ipx.d(ipx2)}));
        this.ndt = new iqa(ndf, 4, 4, 4, 4);
        ipx2.W(ipx.a(459, 50, this.ndt));
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx3);
        this.ndu = new isi();
        this.ndu.setText(isg.b(isf.mwO, 15, 12357465, "0 km&#x00B2;"));
        iwv iwv2 = new iwv(nde, lyw.tLI.bD(new Object[0]));
        ipx3.W(ipx.a(100, 36, ipx.l(ipx.c(new ipf[0]), ipx.d(this.ndu), ipx.a(4, 1, new ipf[0]), iwv2)));
        ipk ipk2 = new ipk();
        ipk2.setColor(0x2F2F2F);
        ipk2.a((iqz)null);
        ipk2.setSize(1, 36);
        ipx3.W(ipx.a(19, 1, new ipf[0]));
        ipx3.W(ipx.d(ipk2));
        ipx ipx4 = ipx.a(80, 36, new ipf[0]);
        ipx ipx5 = ipx.a(80, 17, new ipf[0]);
        ipx ipx6 = ipx.a(80, 17, new ipf[0]);
        this.ndv = new ist();
        this.ndv.setText("0");
        this.ndv.Rk(0x4F4F4F);
        this.ndv.zY(15);
        iwv iwv3 = new iwv(nda, lyw.tLE.bD(new Object[0]));
        ipx5.W(ipx.d(ipx.l(ipx.d(this.ndv), ipx.a(4, 1, new ipf[0]), iwv3)));
        this.ndw = new isi();
        this.ndw.setText(isg.b(isf.mwO, 13, 0x4F4F4F, "0 km&#x00B2;"));
        ipx6.W(ipx.d(this.ndw));
        ipx4.W(ipx.j(ipx.a(1, 9, new ipf[0]), ipx5, ipx.a(1, 2, new ipf[0]), ipx6));
        ipx3.W(ipx4);
        ipx3.W(ipx.a(4, 1, new ipf[0]));
        ipk ipk3 = new ipk();
        ipk3.setColor(0x2F2F2F);
        ipk3.a((iqz)null);
        ipk3.setSize(1, 36);
        ipx3.W(ipx.d(ipk3));
        ipx ipx7 = ipx.a(80, 36, new ipf[0]);
        ipx ipx8 = ipx.a(80, 17, new ipf[0]);
        ipx ipx9 = ipx.a(80, 17, new ipf[0]);
        this.ndx = new ist();
        this.ndx.setText("0");
        this.ndx.Rk(0x4F4F4F);
        this.ndx.zY(15);
        iwv iwv4 = new iwv(ndb, lyw.tLF.bD(new Object[0]));
        ipx8.W(ipx.d(ipx.l(ipx.d(this.ndx), ipx.a(4, 1, new ipf[0]), iwv4)));
        this.ndy = new isi();
        this.ndy.setText(isg.b(isf.mwO, 13, 0x4F4F4F, "0 km&#x00B2;"));
        ipx9.W(ipx.d(this.ndy));
        ipx7.W(ipx.j(ipx.a(1, 9, new ipf[0]), ipx8, ipx.a(1, 2, new ipf[0]), ipx9));
        ipx3.W(ipx7);
        ipx3.W(ipx.a(4, 1, new ipf[0]));
        ipk ipk4 = new ipk();
        ipk4.setColor(0x2F2F2F);
        ipk4.a((iqz)null);
        ipk4.setSize(1, 36);
        ipx3.W(ipx.d(ipk4));
        ipx ipx10 = ipx.a(80, 36, new ipf[0]);
        ipx ipx11 = ipx.a(80, 17, new ipf[0]);
        ipx ipx12 = ipx.a(80, 17, new ipf[0]);
        this.ndz = new ist();
        this.ndz.setText("0");
        this.ndz.Rk(0x4F4F4F);
        this.ndz.zY(15);
        iwv iwv5 = new iwv(ndc, lyw.tLG.bD(new Object[0]));
        ipx11.W(ipx.d(ipx.l(ipx.d(this.ndz), ipx.a(4, 1, new ipf[0]), iwv5)));
        this.ndA = new isi();
        this.ndA.setText(isg.b(isf.mwO, 13, 0x4F4F4F, "0 km&#x00B2;"));
        ipx12.W(ipx.d(this.ndA));
        ipx10.W(ipx.j(ipx.a(1, 9, new ipf[0]), ipx11, ipx.a(1, 2, new ipf[0]), ipx12));
        ipx3.W(ipx10);
        ipx3.W(ipx.a(4, 1, new ipf[0]));
        ipk ipk5 = new ipk();
        ipk5.setColor(0x2F2F2F);
        ipk5.a((iqz)null);
        ipk5.setSize(1, 36);
        ipx3.W(ipx.d(ipk5));
        ipx ipx13 = ipx.a(80, 36, new ipf[0]);
        ipx ipx14 = ipx.a(80, 17, new ipf[0]);
        ipx ipx15 = ipx.a(80, 17, new ipf[0]);
        this.ndB = new ist();
        this.ndB.setText("0");
        this.ndB.Rk(0x4F4F4F);
        this.ndB.zY(15);
        iwv iwv6 = new iwv(ndd, lyw.tLH.bD(new Object[0]));
        ipx14.W(ipx.d(ipx.l(ipx.d(this.ndB), ipx.a(4, 1, new ipf[0]), iwv6)));
        this.ndC = new isi();
        this.ndC.setText(isg.b(isf.mwO, 13, 0x4F4F4F, "0 km&#x00B2;"));
        ipx15.W(ipx.d(this.ndC));
        ipx13.W(ipx.j(ipx.a(1, 9, new ipf[0]), ipx14, ipx.a(1, 2, new ipf[0]), ipx15));
        ipx3.W(ipx13);
        ipx3.W(ipx.a(4, 1, new ipf[0]));
        return this.nds;
    }

    private ipx dFu() {
        ipk ipk2 = new ipk();
        ipk2.setColor(0x2F2F2F);
        ipk2.a((iqz)null);
        ipk2.setSize(1, 20);
        return ipx.l(this.dFv(), ipk2, this.dFv());
    }

    private ipx dFv() {
        return ipx.a(5, 1, new ipf[0]);
    }

    public void dFq() {
        if (this.ndG == null) {
            this.ndo.a(ncS, lqb.rWM.bD(new Object[0]));
            this.ndp.setText("[Clan Name]");
            this.ndv.setText("0");
            this.ndx.setText("0");
            this.ndz.setText("0");
            this.ndB.setText("0");
            this.ndq.setText("0");
            this.ndu.setText(isg.b(isf.mwO, 15, 12357465, "0 km&#x00B2"));
        } else {
            int n;
            Object object;
            Object object2;
            Object object3;
            if (this.jV) {
                object3 = this.les.a(this.ndG);
                object2 = object3.iterator();
                while (object2.hasNext()) {
                    object = (Integer)object2.next();
                    hso.cxK().cxT().dJf().fD((Integer)object, 4228890);
                }
                if (this.ndr != null) {
                    this.ndr.ae(4228890, false);
                    this.ndr.rF(false);
                }
            } else {
                int n2 = 0x575757;
                object2 = ncS;
                object = lqb.rWM.bD(new Object[0]);
                n = 0;
                bcp bcp2 = this.ndF.dFn();
                if (bcp2 == null) {
                    n2 = this.ncv.sx(this.ndG.iG());
                    object2 = ncS;
                    n = 1;
                } else {
                    switch (bcp2.gL(this.ndG.iG())) {
                        case cXi: {
                            n2 = 2058901;
                            object2 = ncQ;
                            object = lqb.rWO.bD(new Object[0]);
                            break;
                        }
                        case cXh: {
                            n2 = 2995588;
                            object2 = ncT;
                            object = lqb.rWN.bD(new Object[0]);
                            break;
                        }
                        case cXf: {
                            n2 = 12482082;
                            object2 = ncU;
                            object = lqb.rWL.bD(new Object[0]);
                            break;
                        }
                        case cXe: {
                            n2 = 10168103;
                            object2 = ncR;
                            object = lqb.rWK.bD(new Object[0]);
                        }
                    }
                    n = 0;
                }
                Set<Integer> set = this.les.a(this.ndG);
                for (Integer n3 : set) {
                    this.ncv.fD(n3, n2);
                }
                this.ndr.ae(n2, false);
                this.ndr.rF(n != 0);
                this.ndo.a((String)object2, (loz)object);
            }
            object3 = NumberFormat.getNumberInstance();
            ((NumberFormat)object3).setMaximumFractionDigits(1);
            ((NumberFormat)object3).setMinimumFractionDigits(0);
            int n4 = this.les.a(this.ndG, ayb.cvj);
            int n5 = this.les.a(this.ndG, ayb.cvk);
            n = this.les.h(this.ndG);
            int n6 = this.les.k(this.ndG);
            this.ndp.setText(this.ndG.iV());
            this.ndv.setText(Integer.toString(n4));
            this.ndv.Rk(n4 == 0 ? 0x4F4F4F : 12357465);
            this.ndw.setText(isg.b(isf.mwO, 13, n4 == 0 ? 0x4F4F4F : 0xABABAB, (n4 == 0 ? "0" : ((NumberFormat)object3).format(this.les.b(this.ndG, ayb.cvj))) + " km&#x00B2;"));
            this.ndx.setText(Integer.toString(n5));
            this.ndx.Rk(n5 == 0 ? 0x4F4F4F : 12357465);
            this.ndy.setText(isg.b(isf.mwO, 13, n5 == 0 ? 0x4F4F4F : 0xABABAB, (n5 == 0 ? "0" : ((NumberFormat)object3).format(this.les.b(this.ndG, ayb.cvk))) + " km&#x00B2;"));
            this.ndz.setText(Integer.toString(n));
            this.ndz.Rk(n == 0 ? 0x4F4F4F : 12357465);
            this.ndA.setText(isg.b(isf.mwO, 13, n == 0 ? 0x4F4F4F : 0xABABAB, (n == 0 ? "0" : ((NumberFormat)object3).format(this.les.i(this.ndG))) + " km&#x00B2;"));
            this.ndB.setText(Integer.toString(n6));
            this.ndB.Rk(n6 == 0 ? 0x4F4F4F : 12357465);
            this.ndC.setText(isg.b(isf.mwO, 13, n6 == 0 ? 0x4F4F4F : 0xABABAB, (n6 == 0 ? "0" : ((NumberFormat)object3).format(this.les.l(this.ndG))) + " km&#x00B2;"));
            this.ndq.setText(Integer.toString(this.les.b(this.ndG)));
            this.ndu.setText(isg.b(isf.mwO, 15, 12357465, ((NumberFormat)object3).format(this.les.c(this.ndG)) + " km&#x00B2;"));
        }
    }

    @Override
    public boolean dK(int n, int n2) {
        if (this.ndl != null) {
            this.ndl.setVisible(true);
        }
        return false;
    }

    @Override
    public boolean dL(int n, int n2) {
        if (this.ndl != null) {
            this.ndl.setVisible(false);
        }
        return false;
    }

    public void kN(float f2) {
        if (this.ndl != null) {
            this.ndl.hz(f2);
        }
        if (this.ndt != null) {
            this.ndt.hz(f2);
        }
    }

    @Override
    public boolean eB(int n, int n2) {
        this.setExpanded(!this.isExpanded());
        return true;
    }

    private void dFw() {
        hso.cxK().cxP().czb().a((htl)this, this.ndG);
    }

    @Override
    public void oj() {
    }

    @Override
    public void b(aym aym2) {
        idr idr2 = (idr)idx.a(iee.lMw);
        idr2.t(aym2);
        hso.cxK().cxP().cyJ().a(iee.lMw, false);
    }

    private void UE(int n) {
        this.ncv.ai(this.ndG.iG(), n);
        Set<Integer> set = this.les.a(this.ndG);
        for (Integer n2 : set) {
            this.ncv.fD(n2, n);
        }
    }

    static /* synthetic */ void a(jhb jhb2, int n) {
        jhb2.UE(n);
    }

    static /* synthetic */ void a(jhb jhb2) {
        jhb2.dFw();
    }

    static /* synthetic */ ipx b(jhb jhb2) {
        return jhb2.nds;
    }
}

