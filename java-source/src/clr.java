/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  axx
 *  cug
 *  cxd
 *  lcr
 */
import java.util.Map;

public class clr
extends btk
implements cbw {
    private boolean eJg = true;
    private int eJh = 0;
    private static final int eJi = 1;
    private static final int eJj = 2;
    private static final int eJk = 3;
    private static final int eJl = 10000;
    private final axx eJm;
    private final clq eJn;
    private cls eJo = null;
    private int eJp = 0;
    private int eJq = 0;
    private double eJr = 0.0;
    private double eJs = 0.0;
    private double eJt = 0.0;
    private int eJu = 0;
    private ldv eJv = null;
    private ldv eJw = null;
    private int eJx = 0;
    private ldv eJy = null;
    private String eJz = null;
    private ldv eJA = null;
    private String eJB = null;
    private bbs eJC = bbs.NoRank;
    private ldv eJD = null;
    private ldv eJE = null;
    private int eJF = -1;
    private int eJG = -1;
    private int[] eJH = null;
    private int[] eJI = null;
    private ldv eJJ = null;
    private float eJK = 0.0f;
    private boolean eJL = false;
    private Map<Integer, nl> dXz = lcn.emw();
    private int eJM = 0;

    public clr(axx axx2, clq clq2, nl[] nlArray) {
        this.eJm = axx2;
        this.eJn = clq2;
        if (nlArray != null && nlArray.length > 0) {
            for (nl nl2 : nlArray) {
                int n = lea.enW().getType(nl2.aCI);
                if (n == -1) {
                    assert (false);
                    continue;
                }
                this.dXz.put(n, nl2);
                if (n == cug.fkb) continue;
                this.eJM += nl2.asi;
            }
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.Yc = this.getGUID();
        gfm2.ResourceType = this.eJn.az();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
    }

    private void aSi() {
        if (this.eJo == null) {
            return;
        }
        if (this.eJo.fi() == null) {
            return;
        }
        this.eJo.fi().b(12336, this.eJm.Xt());
        this.eJo.fi().b(12304, this.eJm.Xw());
        this.eJo.fi().b(12320, this.eJm.Xy() == null ? "" : this.eJm.Xy());
        this.eJo.fi().c(12368, this.aSs());
        this.eJo.fi().i(12752, this.eJq);
        this.eJo.fi().i(12768, jts.dSQ());
        this.eJo.fi().b(12784, this.eJD);
        this.eJo.fi().b(12800, this.eJw);
        this.aSo();
    }

    private void b(gfn gfn2) {
        if (gfn2.dtF == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleResourceCreateResponseMessage() : Levy collector resource failed to create!!!");
            assert (false);
            return;
        }
        this.eJo = (cls)gfn2.dtF;
        this.eJo.a(this);
        bvd bvd2 = this.eJo.aIl();
        this.eJo.d(bvd2);
        bvd2.c(this.eJn.av());
        bvd2.a(this.eJn.aw());
        this.eJo.aAG().c(bvd2.av());
        this.eJo.aAG().a(bvd2.aw());
        this.MessageDelegator.a((amf)((Object)this.eJo));
        this.aSi();
        this.d(true, this.eJo.az());
    }

    private void a(ftk ftk2) {
        if (ftk2.Eb() != cxd.fHn) {
            this.a(ftk2, false, mcf.utb.bD(this.eJo.az(), this.eJm.Xt()), -1.0f, null);
            return;
        }
        if (!lea.enW().isDescendant(ftk2.bRH(), cug.ful)) {
            this.a(ftk2, false, mcf.utb.bD(this.eJo.az(), this.eJm.Xt()), -1.0f, null);
            return;
        }
        if (!this.isFull()) {
            this.a(ftk2, false, mcf.utc.bD(this.eJm.Xt()), -1.0f, null);
            return;
        }
        dmp dmp2 = (dmp)this.MessageDelegator.bzx().bzt().d(lcr.qEy);
        if (dmp2 != null && dmp2.nc(this.eJm.getGUID())) {
            this.a(ftk2, false, mcf.uty.bD(this.eJm.Xt(), this.eJo.az()), -1.0f, null);
            return;
        }
        if (this.eJv != null) {
            this.a(ftk2, false, mcf.utd.bD(this.eJo.az(), this.eJm.Xt()), -1.0f, null);
            return;
        }
        if (ftk2.bRI() <= 0.0) {
            this.a(ftk2, false, mcf.utb.bD(this.eJm.Xt()), -1.0f, null);
            return;
        }
        this.eJv = ftk2.bRC();
        this.eJy = ftk2.bRD();
        this.eJz = ftk2.hl();
        this.eJA = ftk2.bRE();
        this.eJB = ftk2.iV();
        this.eJC = ftk2.bOf();
        this.eJE = ftk2.bRF();
        this.eJF = ftk2.bRH();
        this.eJx = ftk2.bRG();
        this.eJG = 0;
        this.eJs = this.eJt = jts.dSR() * ftk2.bRI();
        this.a(ftk2, true, mcf.utf.bD(this.eJo.az(), this.eJm.Xt(), (int)jts.dSX()), jts.dSX(), mcf.ute.bD(this.eJo.az(), this.eJm.Xt(), (int)jts.dSX()));
        this.eJr = jts.dST();
        if (!(this.eJD == null || this.eJy.equals(this.eJD) || this.eJq <= 0 || this.eJw != null && this.eJw.equals(this.eJE))) {
            this.c(mcf.uth.bD(this.eJo.az(), this.eJz, this.eJm.Xt(), cug.fux), this.eJw == null ? this.eJD : this.eJw);
            this.c(mcf.utg.bD(this.eJo.az(), this.eJm.Xt(), cug.fux), this.eJy);
        } else if (this.eJE == null) {
            this.c(mcf.utj.bD(this.eJm.Xt(), jts.dSQ(), cug.fux, this.eJo.az()), this.eJy);
        } else {
            this.c(mcf.utk.bD(this.eJm.Xt(), jts.dSQ(), cug.fux, this.eJo.az()), this.eJE);
        }
    }

    private void a(ftj ftj2) {
        if (this.eJv == null || !this.eJv.equals(ftj2.bRC())) {
            return;
        }
        if (this.eJy.equals(this.eJD) && this.eJq > 0) {
            if (this.eJw == null) {
                this.c(mcf.utm.bD(this.eJm.Xt(), cug.fux, this.eJo.az()), this.eJD);
            } else {
                this.c(mcf.utn.bD(this.eJo.az(), this.eJm.Xt(), cug.fux), this.eJw);
            }
        }
        if (this.eJq > 0 && this.eJw != null) {
            this.c(mcf.uti.bD(this.eJo.az(), this.eJz, this.eJm.Xt()), this.eJE);
        }
        this.eJv = null;
        this.eJy = null;
        this.eJz = null;
        this.eJA = null;
        this.eJB = null;
        this.eJC = bbs.NoRank;
        this.eJE = null;
        this.eJF = -1;
        this.eJx = 0;
        this.eJG = -1;
        this.eJt = 0.0;
        this.eJs = 0.0;
        this.eJr = jts.dST();
    }

    public void doTick(ldz ldz2) {
        if (this.isFull()) {
            if (this.eJv == null) {
                this.W(ldz2);
            } else {
                this.X(ldz2);
            }
            return;
        }
    }

    private void W(ldz ldz2) {
        if (!this.isFull() || this.eJv != null) {
            return;
        }
        if (this.eJp != 0) {
            if (this.eJg) {
                lfn.b(5, this.getClass().getSimpleName(), "doTickForRequisitionPointsDecay() PointsDeltaPendingInventoryResponse : " + this.eJp + " CITY : " + this.eJm.Xt());
                ++this.eJh;
                if (this.eJh > 100) {
                    this.eJg = false;
                }
            }
            return;
        }
        if (this.eJq <= 0) {
            if (this.eJg) {
                lfn.b(5, this.getClass().getSimpleName(), "doTickForRequisitionPointsDecay() CurrentPointsCounter : " + this.eJq + " CITY : " + this.eJm.Xt());
                ++this.eJh;
                if (this.eJh > 100) {
                    this.eJg = false;
                }
            }
            return;
        }
        this.eJr -= ldz2.qwh;
        if (this.eJr > 0.0) {
            return;
        }
        --this.eJq;
        this.eJr += jts.dST();
        if (this.eJq == 0) {
            this.eJD = null;
            this.eJw = null;
            this.eJu = 0;
        }
        this.aSm();
    }

    private void X(ldz ldz2) {
        if (!this.isFull() || this.eJv == null) {
            return;
        }
        if (this.eJp != 0) {
            if (this.eJg) {
                lfn.b(5, this.getClass().getSimpleName(), "doTickForRequisitionPulse() PointsDeltaPendingInventoryResponse : " + this.eJp + " CITY : " + this.eJm.Xt());
                ++this.eJh;
                if (this.eJh > 100) {
                    this.eJg = false;
                }
            }
            return;
        }
        if (this.eJq == jts.dSQ()) {
            if (this.eJg) {
                lfn.b(5, this.getClass().getSimpleName(), "doTickForRequisitionPulse() CurrentPointsCounter : " + this.eJq + " CITY : " + this.eJm.Xt());
                ++this.eJh;
                if (this.eJh > 100) {
                    this.eJg = false;
                }
            }
            return;
        }
        this.eJs -= ldz2.qwh;
        if (this.eJs > 0.0) {
            return;
        }
        boolean bl = this.eJm.Xw() != null && this.eJm.Xw().equals(this.eJA);
        int n = jts.dSU() + (bl && lgp.erA().cS(jts.dSV()) ? jts.dSU() : 0);
        this.N(this.eJv, this.eJo.getGUID());
        if (this.eJq == 0) {
            this.eJp = n;
            this.eJD = this.eJy;
            this.eJw = this.eJE;
            this.eJu = this.eJx;
            this.a(2, this.eJy, cug.fux, this.eJp, bqy.dId);
            this.eJs += this.eJt;
            ++this.eJG;
        } else {
            boolean bl2;
            boolean bl3 = this.eJD != null && this.eJD.equals(this.eJy);
            boolean bl4 = bl2 = this.eJw != null && this.eJw.equals(this.eJE);
            if (bl3 || bl2) {
                this.eJp = n;
                if (this.eJq + this.eJp > jts.dSQ()) {
                    this.eJp = jts.dSQ() - this.eJq;
                }
                this.eJD = this.eJy;
                this.eJw = this.eJE;
                this.eJu = this.eJx;
                this.a(2, this.eJy, cug.fux, this.eJp, bqy.dId);
                this.eJs += this.eJt;
            } else {
                this.eJp = n;
                if (this.eJp > this.eJq) {
                    this.eJp = this.eJq;
                }
                if (this.eJq == 0) {
                    this.eJD = null;
                    this.eJw = null;
                    this.eJu = 0;
                }
                this.a(1, this.eJy, new int[]{cug.fux}, new int[]{this.eJp}, bqy.dGY);
                this.eJs += this.eJt * jts.dSW();
            }
        }
    }

    private void b(fna fna2) {
        switch (fna2.aVk()) {
            case 1: {
                if (fna2.iQK) {
                    this.eJq -= this.eJp;
                    this.eJp = 0;
                    this.aSm();
                    break;
                }
                if (this.eJy == null) break;
                this.O(this.eJv, this.eJo.getGUID());
                this.eJv = null;
                this.eJy = null;
                this.eJz = null;
                this.eJA = null;
                this.eJB = null;
                this.eJC = bbs.NoRank;
                this.eJE = null;
                this.eJF = -1;
                this.eJx = 0;
                this.eJG = -1;
                this.eJp = 0;
                break;
            }
            case 3: {
                this.eJH = null;
                this.eJI = null;
                this.eJJ = null;
                if (!fna2.iQK && this.eJm.Xw() != null) {
                    lfn.b(3, this.getClass().getSimpleName(), "handleInventoryResourceCreateResponseMessage() : Failed to give rewards to last connected player, sending them to the owner clan!!!");
                    break;
                }
                if (fna2.iQK) break;
                lfn.b(3, this.getClass().getSimpleName(), "handleInventoryResourceCreateResponseMessage() : Failed to give rewards to last connected player, and no owner clan exists!!!... Rewards Lost!!!");
            }
        }
    }

    private void a(fnf fnf2) {
        switch (fnf2.aVk()) {
            case 2: {
                if (fnf2.iQM) {
                    if (this.eJq == 0) {
                        if (this.eJA == null || !this.eJA.equals(this.eJm.Xw())) {
                            if (this.eJA == null) {
                                this.c(mcf.uts.bD(this.eJz, this.eJm.Xt(), this.eJo.az()), this.eJm.Xw());
                            } else {
                                this.c(mcf.utt.bD(this.eJz, this.eJB, this.eJm.Xt(), this.eJo.az()), this.eJm.Xw());
                            }
                        } else {
                            this.c(mcf.utr.bD(new Object[]{this.eJC, this.eJz, this.eJm.Xt()}), this.eJm.Xw());
                        }
                    }
                    this.eJq += this.eJp;
                    this.aSm();
                    this.eJp = 0;
                    this.aSj();
                    break;
                }
                if (this.eJv == null) break;
                this.c(mcf.utl.bD(this.eJo.az(), this.eJm.Xt(), cug.fux), this.eJy);
                if (this.eJy.equals(this.eJD) && this.eJq > 0) {
                    if (this.eJw == null) {
                        this.c(mcf.utm.bD(this.eJm.Xt(), cug.fux, this.eJo.az()), this.eJD);
                    } else {
                        this.c(mcf.utn.bD(this.eJm.Xt(), cug.fux, this.eJo.az()), this.eJw);
                    }
                }
                this.O(this.eJv, this.eJo.getGUID());
                this.eJv = null;
                this.eJy = null;
                this.eJz = null;
                this.eJA = null;
                this.eJB = null;
                this.eJC = bbs.NoRank;
                this.eJE = null;
                this.eJF = -1;
                this.eJx = 0;
                this.eJG = -1;
                this.eJp = 0;
            }
        }
    }

    private void a(gvc gvc2) {
        if (this.eJm.Xw() == null) {
            return;
        }
        int[] nArray = gvc2.CX();
        int[] nArray2 = gvc2.bSu();
        if (nArray == null || nArray2 == null || nArray2.length != nArray.length) {
            assert (false);
            return;
        }
        this.b(nArray, nArray2);
    }

    private void a(ftm ftm2) {
        if (this.eJv == null || !this.eJv.equals(ftm2.aO()) || this.eJy == null) {
            return;
        }
        this.eJA = ftm2.iG();
        this.eJB = ftm2.iV();
        this.eJC = ftm2.bRM();
    }

    private void a(fto fto2) {
        if (this.eJv == null || !this.eJv.equals(fto2.aO()) || this.eJy == null) {
            return;
        }
        this.eJE = fto2.jM();
        this.eJx = fto2.bRN();
        if (ldv.au(this.eJy, this.eJD)) {
            this.eJw = this.eJE;
            this.eJu = this.eJx;
            this.aSm();
        }
    }

    private void aSj() {
        if (this.eJq == jts.dSQ()) {
            this.O(this.eJv, this.eJo.getGUID());
            assert (this.isFull());
            this.eJH = new int[this.dXz.size()];
            this.eJI = new int[this.dXz.size()];
            int n = 0;
            for (nl nl2 : this.dXz.values()) {
                this.eJH[n] = cug.hV((String)nl2.aCI);
                this.eJI[n] = nl2.asi;
                ++n;
            }
            this.eJJ = this.eJy;
            if (this.eJE != null && jts.dSY()) {
                this.a(this.eJE, this.eJH, this.eJI, this.eJo.aAG().azb(), jts.dSZ(), bqy.dHb);
            } else {
                this.a(3, this.eJy, this.eJH, this.eJI, bqy.dHb);
            }
            if (this.eJA == null || !this.eJA.equals(this.eJm.Xw())) {
                if (this.eJA == null) {
                    this.c(mcf.utv.bD(this.eJz, this.eJm.Xt()), this.eJm.Xw());
                } else {
                    this.c(mcf.utw.bD(this.eJz, this.eJB, this.eJm.Xt()), this.eJm.Xw());
                }
            } else {
                this.c(mcf.utu.bD(new Object[]{this.eJC, this.eJz, this.eJm.Xt()}), this.eJm.Xw());
            }
            if (this.eJw == null) {
                this.c(mcf.utp.bD(this.eJm.Xt()), this.eJD);
            } else {
                this.c(mcf.uto.bD(this.eJm.Xt()), this.eJw);
            }
            this.g(mcf.utx.bD(this.eJm.Xt()));
            this.eJv = null;
            this.eJy = null;
            this.eJz = null;
            this.eJA = null;
            this.eJB = null;
            this.eJC = bbs.NoRank;
            this.eJE = null;
            this.eJF = -1;
            this.eJM = 0;
            this.eJx = 0;
            this.eJG = -1;
            this.dXz.clear();
            this.eJq = 0;
            this.eJD = null;
            this.eJw = null;
            this.eJr = jts.dST();
            this.eJK = -1.0f;
            this.eJL = false;
            this.aSl();
            this.aSm();
        }
    }

    private void aSk() {
        ff ff2 = this.eJo.fi().aq(12320);
        if (ff2 != null) {
            String string = this.eJm.Xy();
            ff2.setValue(string != null ? string : "");
        }
    }

    private void aSl() {
        et et2 = this.eJo.fi().ah(12368);
        et2.setValue(Float.valueOf(this.aSs()));
        this.aSo();
    }

    private void aSm() {
        this.eJo.fi().i(12752, this.eJq);
        this.eJo.fi().i(12768, jts.dSQ());
        this.eJo.fi().b(12784, this.eJD);
        this.eJo.fi().b(12800, this.eJw);
    }

    private void aSn() {
        this.eJo.fi().i(12752, this.eJq);
        this.eJo.fi().i(12768, jts.dSQ());
        this.eJo.fi().c(12368, this.aSs());
        this.eJo.fi().b(12784, this.eJD);
        this.eJo.fi().b(12800, this.eJw);
    }

    private void a(ftk ftk2, boolean bl, loz loz2, float f, loz loz3) {
        ftl ftl2 = (ftl)this.MessageDelegator.h(1051, ftk2.amk(), ftk2.aO());
        this.MessageDelegator.b(ftk2, ftl2);
        ftl2.jO(bl);
        ftl2.t(loz2);
        ftl2.jj(f);
        ftl2.u(loz3);
        this.MessageDelegator.F(ftl2);
    }

    private void c(loz loz2, ldv ldv2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.getGUID(), ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void g(loz loz2) {
        fgo fgo2 = (fgo)this.MessageDelegator.h(29447, this.getGUID(), lcr.qAL);
        fgo2.r(loz2);
        this.MessageDelegator.F(fgo2);
    }

    private void N(ldv ldv2, ldv ldv3) {
        ftn ftn2 = (ftn)this.MessageDelegator.h(1053, ldv3, ldv2);
        this.MessageDelegator.F(ftn2);
    }

    private void O(ldv ldv2, ldv ldv3) {
        fdp fdp2 = (fdp)this.MessageDelegator.h(9218, ldv3, ldv2);
        this.MessageDelegator.F(fdp2);
    }

    private void a(int n, ldv ldv2, int n2, int n3, bqy bqy2) {
        fne fne2 = (fne)this.MessageDelegator.h(7981, this.getGUID(), ldv2);
        fne2.hsP = true;
        fne2.aqs = n;
        fne2.iQN = false;
        fne2.ResourceType = n2;
        fne2.asi = n3;
        fne2.b(bqy2);
        fne2.lg(this.eJG == 0);
        this.MessageDelegator.F(fne2);
    }

    private void a(int n, ldv ldv2, int[] nArray, int[] nArray2, bqy bqy2) {
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), ldv2);
        fmz2.hsP = true;
        fmz2.aqs = n;
        fmz2.iQH = false;
        fmz2.iJG = true;
        fmz2.bqd = nArray;
        fmz2.iIY = nArray2;
        fmz2.b(bqy2);
        this.MessageDelegator.F(fmz2);
    }

    private void a(ldv ldv2, int[] nArray, int[] nArray2, ljq ljq2, float f, bqy bqy2) {
        fwq fwq2 = (fwq)this.MessageDelegator.h(17955, this.getGUID(), ldv2);
        fwq2.hsP = true;
        fwq2.lA(false);
        fwq2.lB(true);
        fwq2.g(nArray);
        fwq2.al(nArray2);
        fwq2.cM(ljq2);
        fwq2.jl(f);
        fwq2.b(bqy2);
        this.MessageDelegator.F(fwq2);
    }

    private void aSo() {
        gvb gvb2 = (gvb)this.MessageDelegator.h(32281, this.getGUID(), lcr.qEx);
        gvb2.setCapacity(jts.tT(this.eJm.Xt()));
        gvb2.c(this.eJo.aAG().azb());
        gvb2.setSize(this.eJM);
        this.MessageDelegator.F(gvb2);
    }

    private void d(boolean bl, int n) {
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.GUID, lcr.qCv);
        gga2.jgt = bl;
        gga2.ResourceType = n;
        this.MessageDelegator.F(gga2);
    }

    private void b(int[] nArray, int[] nArray2) {
        if (this.isFull()) {
            return;
        }
        for (int i = 0; i < nArray.length; ++i) {
            nl nl2;
            int n = nArray[i];
            int n2 = nArray2[i];
            lgw lgw2 = (lgw)lea.enW().acv(n);
            if (lgw2 == null) {
                assert (false) : "Invalid resource type : " + n;
                continue;
            }
            if (lgw2.auW()) {
                nl2 = this.dXz.get(n);
                if (nl2 == null) {
                    nl2 = new nl();
                    this.dXz.put(n, nl2);
                    nl2.aCI = lgw2.getName();
                }
                nl2.asi += n2;
                if (n == cug.fkb && nl2.asi > 10000) {
                    nl2.asi = 10000;
                }
            } else {
                nl2 = new nl();
                nl2.asi = n2;
                nl2.aCI = lgw2.getName();
                this.dXz.put(n, nl2);
            }
            if (n == cug.fkb) continue;
            this.eJM += n2;
        }
        this.aSl();
        if (!this.eJL && this.isFull()) {
            this.g(mcf.utq.bD(this.eJo.az(), this.eJm.Xt()));
            this.eJL = true;
        }
    }

    public void aSp() {
        this.aSk();
        if (this.eJm.Xw() == null) {
            return;
        }
        this.c(mcf.utz.bD(this.eJm.Xt(), this.eJo.az()), this.eJm.Xw());
    }

    public void aSq() {
        this.aSk();
    }

    public nl[] aSr() {
        if (this.dXz.isEmpty()) {
            return null;
        }
        return this.dXz.values().toArray(new nl[this.dXz.size()]);
    }

    private boolean isFull() {
        return this.getSize() >= jts.tT(this.eJm.Xt());
    }

    private float aSs() {
        return (float)this.getSize() / (float)jts.tT(this.eJm.Xt());
    }

    private int getSize() {
        return this.eJM;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1050: {
                this.a((ftk)dxq2);
                break;
            }
            case 1052: {
                this.a((ftj)dxq2);
                break;
            }
            case 7956: {
                this.b((fna)dxq2);
                break;
            }
            case 7982: {
                this.a((fnf)dxq2);
                break;
            }
            case 32280: {
                this.a((gvc)dxq2);
                break;
            }
            case 6146: {
                this.b((gfn)dxq2);
                break;
            }
            case 1055: {
                this.a((ftm)dxq2);
                break;
            }
            case 1054: {
                this.a((fto)dxq2);
            }
        }
    }
}

