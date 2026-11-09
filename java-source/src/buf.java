/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  dta
 *  ep
 *  lcr
 *  lcw
 */
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

public class buf
extends btk
implements bto {
    private static final float dMZ = 0.1f;
    private ldv Ui = null;
    private ldv dtj = null;
    private int ResourceType = 0;
    private int dNa = 0;
    private float dNb = 0.0f;
    private ljq Position = null;
    private lep[] dNc = null;
    private ldv bWM = null;
    private final List<ej> dFm = lcn.abH(5);
    private boolean dNd = false;
    private boolean dNe = false;
    private boolean dNf = false;
    private boolean aau = false;
    private boolean dNg = false;
    private final int[] dNh;
    private final int[] dNi;
    private final int[] dNj;
    private final int[] dNk;
    private final int[] dNl;
    private final int[] dNm;
    private final int[] dNn;
    private final int[] dNo;
    private final int[] dNp;
    private final int[] dNq;
    private final int[] dNr;
    private final int[] dNs;
    private final int[] dNt;
    private final int[] duN;
    private final int[] dNu;
    private final int[] dNv;
    private final int[] dNw;
    private final int[] dNx;
    private final int[] dNy;
    private final int[] dNz;
    private final int[] dNA;
    private final int[] dNB;
    private final int[] dNC;
    private final int[] dND;
    private final int[] dNE;
    private final int[] dNF;
    private bup dNG = null;
    private boolean dNH = false;
    private float dNI = 0.0f;
    private DecimalFormat dNJ = null;
    private final les ResourceTree = lea.enW();

    public buf() {
        this.dNC = new int[2];
        this.dNC[0] = 12720;
        this.dNC[1] = 1392;
        this.dNh = new int[2];
        this.dNh[0] = 352;
        this.dNh[1] = ep.k((int)352, (int)2);
        this.dNi = new int[8];
        this.dNi[0] = 12048;
        this.dNi[1] = 1296;
        this.dNi[2] = 1312;
        this.dNi[3] = 352;
        this.dNi[4] = ep.k((int)352, (int)2);
        this.dNi[5] = 13536;
        this.dNi[6] = 13920;
        this.dNi[7] = 14080;
        this.dNj = new int[11];
        this.dNj[0] = 352;
        this.dNj[1] = ep.k((int)352, (int)2);
        this.dNj[2] = 12336;
        this.dNj[3] = 12304;
        this.dNj[4] = 12320;
        this.dNj[5] = 12352;
        this.dNj[6] = 12384;
        this.dNj[7] = 12368;
        this.dNj[8] = 12752;
        this.dNj[9] = 12768;
        this.dNj[10] = 12400;
        this.dNk = new int[5];
        this.dNk[0] = 12336;
        this.dNk[1] = 12320;
        this.dNk[2] = 12368;
        this.dNk[3] = 12752;
        this.dNk[4] = 12768;
        this.dNl = new int[6];
        this.dNl[0] = 352;
        this.dNl[1] = ep.k((int)352, (int)2);
        this.dNl[2] = 12304;
        this.dNl[3] = 12320;
        this.dNl[4] = 12416;
        this.dNl[5] = 12384;
        this.dNm = new int[4];
        this.dNm[0] = 12448;
        this.dNm[1] = 12464;
        this.dNm[2] = 352;
        this.dNm[3] = ep.k((int)352, (int)2);
        this.dNn = new int[4];
        this.dNn[0] = 12480;
        this.dNn[1] = 12384;
        this.dNn[2] = 12464;
        this.dNn[3] = 12496;
        this.dNo = new int[4];
        this.dNo[0] = 352;
        this.dNo[1] = ep.k((int)352, (int)2);
        this.dNo[2] = 12384;
        this.dNo[3] = 10432;
        this.dNp = new int[1];
        this.dNp[0] = 10432;
        this.dNq = new int[4];
        this.dNq[0] = 352;
        this.dNq[1] = ep.k((int)352, (int)2);
        this.dNq[2] = 12384;
        this.dNq[3] = 10432;
        this.dNr = new int[2];
        this.dNr[0] = 12512;
        this.dNr[1] = 12528;
        this.dNs = new int[5];
        this.dNs[0] = 352;
        this.dNs[1] = ep.k((int)352, (int)2);
        this.dNs[2] = 12544;
        this.dNs[3] = 10432;
        this.dNs[4] = 12384;
        this.dNt = new int[5];
        this.dNt[0] = 352;
        this.dNt[1] = ep.k((int)352, (int)2);
        this.dNt[2] = 12544;
        this.dNt[3] = 10432;
        this.dNt[4] = 12384;
        this.duN = new int[7];
        this.duN[0] = 352;
        this.duN[1] = ep.k((int)352, (int)2);
        this.duN[2] = 12544;
        this.duN[3] = 10432;
        this.duN[4] = 12384;
        this.duN[5] = 12656;
        this.duN[6] = 12672;
        this.dNu = new int[5];
        this.dNu[0] = 10432;
        this.dNu[1] = 12384;
        this.dNu[2] = 12560;
        this.dNu[3] = 352;
        this.dNu[4] = ep.k((int)352, (int)2);
        this.dNv = new int[6];
        this.dNv[0] = 352;
        this.dNv[1] = ep.k((int)352, (int)2);
        this.dNv[2] = 10432;
        this.dNv[3] = 12384;
        this.dNv[4] = 1248;
        this.dNv[5] = 12576;
        this.dNw = new int[3];
        this.dNw[0] = 12592;
        this.dNw[1] = 12608;
        this.dNw[2] = 12624;
        this.dNx = new int[4];
        this.dNx[0] = 352;
        this.dNx[1] = ep.k((int)352, (int)2);
        this.dNx[2] = 12544;
        this.dNx[3] = 10432;
        this.dNy = new int[6];
        this.dNy[0] = 352;
        this.dNy[1] = ep.k((int)352, (int)2);
        this.dNy[2] = 12304;
        this.dNy[3] = 12320;
        this.dNy[4] = 12416;
        this.dNy[5] = 12640;
        this.dNz = new int[7];
        this.dNz[0] = 352;
        this.dNz[1] = ep.k((int)352, (int)2);
        this.dNz[2] = 12304;
        this.dNz[3] = 12320;
        this.dNz[4] = 12416;
        this.dNz[5] = 12704;
        this.dNz[6] = 12384;
        this.dND = new int[5];
        this.dND[0] = 1328;
        this.dND[1] = 1408;
        this.dND[2] = 12384;
        this.dND[3] = 12752;
        this.dND[4] = 12768;
        this.dNA = new int[0];
        this.dNB = new int[3];
        this.dNB[0] = 9664;
        this.dNB[1] = 12752;
        this.dNB[2] = 12768;
        this.dNE = new int[4];
        this.dNE[0] = 352;
        this.dNE[1] = ep.k((int)352, (int)2);
        this.dNE[2] = 12432;
        this.dNE[3] = 13696;
        this.dNF = new int[3];
        this.dNF[0] = 1328;
        this.dNF[1] = 10432;
        this.dNF[2] = 12384;
        this.dNJ = new DecimalFormat("###0.0");
        this.dNJ.setMaximumFractionDigits(1);
        this.dNJ.setMaximumIntegerDigits(4);
    }

    public ldv KY() {
        return this.Ui;
    }

    public ldv Uj() {
        return this.dtj;
    }

    public int az() {
        return this.ResourceType;
    }

    public float axQ() {
        return this.dNb;
    }

    public ljq av() {
        return this.Position;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.aau && this.dNe && this.dNf) {
            ej[] ejArray = this.arJ();
            this.e(ejArray);
            this.aau = false;
            this.dNI = this.dNb;
        } else if (this.dNH) {
            this.axZ();
            this.dNH = false;
        }
    }

    public lep axR() {
        if (this.dNc == null) {
            return null;
        }
        for (lep lep2 : this.dNc) {
            if (lep2.aCE.equals(lcr.qAC)) {
                if (this.ResourceTree.isDescendant(lep2.ResourceType, cug.fqn)) continue;
                lep2 = lep2.eqi();
                lep2.aCE = lep2.GUID;
                lep2.dtj = lcr.qAC;
            } else {
                ldv ldv2 = this.jI(lep2.aCE);
                if (ldv2 == null) {
                    return null;
                }
                lep2.dtj = ldv2;
                if (bsi.mF(lep2.ResourceType)) {
                    lep2.ResourceType = this.M(lep2.aCE, lep2.ResourceType);
                }
            }
            return lep2;
        }
        return null;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dNG = (bup)this.MessageDelegator.d(lcr.qBW);
        if (this.dNG == null) {
            lfn.b(5, "SFObjectInfoAssembler", "initialize() TitleCollectionManager was not found.");
        }
    }

    public void axS() {
        if (this.Ui == null) {
            return;
        }
        this.axX();
        bum.aym().axX();
        this.axY();
    }

    public void a(lep lep2, lep[] lepArray) {
        assert (lep2 != null);
        assert (lepArray != null);
        assert (lepArray.length > 0);
        assert (lep2.GUID != null);
        assert (lep2.aCE != null);
        assert (lep2.Position != null);
        if (this.Ui != null) {
            if (this.dtj != null && this.bWM != null) {
                this.aya();
            }
            this.axX();
            bum.aym().axX();
        }
        if (lep2.aCE.equals(lcr.qAC)) {
            this.Ui = lep2.GUID;
            this.dtj = lcr.qAC;
            this.dNa = this.ResourceType = lep2.ResourceType;
            this.dNb = lep2.mB;
            this.Position = lep2.Position;
            this.dNc = lepArray;
            bum.aym().Ui = this.Ui;
            bum.aym().dtj = this.dtj;
            this.dNd = cug.vR((int)this.ResourceType);
            if (this.dNd) {
                this.dNg = this.axW();
                this.aau = true;
                this.dNe = true;
                this.dNf = true;
            } else {
                this.axY();
            }
        } else {
            this.Ui = lep2.GUID;
            this.dtj = null;
            this.dNa = this.ResourceType = lep2.ResourceType;
            this.dNb = lep2.mB;
            this.Position = lep2.Position;
            this.dNc = lepArray;
            bum.aym().Ui = this.Ui;
            this.dNd = cug.vR((int)this.ResourceType);
            if (!this.dNd) {
                this.axY();
                return;
            }
            this.dNg = this.axW();
            this.dtj = this.axU();
            if (this.dtj == null) {
                this.aau = true;
                this.dNe = true;
                this.dNf = true;
            } else {
                this.axT();
            }
        }
    }

    public void b(lep lep2, lep[] lepArray) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        assert (lep2 != null);
        assert (lepArray != null);
        assert (lepArray.length > 0);
        assert (this.dNb >= 0.0f);
        assert (lep2.Position != null);
        if (this.dtj == null) {
            this.dtj = this.axU();
            if (this.dtj != null) {
                this.axT();
                return;
            }
        }
        if (this.dNb == lep2.mB) {
            return;
        }
        boolean bl5 = lea.enW().isDescendant(lep2.ResourceType, cug.fgH);
        boolean bl6 = cug.vJ((int)lep2.ResourceType) || bl5;
        boolean bl7 = lea.enW().isDescendant(this.ResourceType, cug.fgH);
        boolean bl8 = bl4 = cug.vJ((int)this.ResourceType) || bl7;
        boolean bl9 = bl4 ? this.dNb < 50.0f : (bl3 = this.dNb < 25.0f);
        boolean bl10 = bl6 ? lep2.mB < 50.0f : (bl2 = lep2.mB < 25.0f);
        if (bl3 != bl2) {
            this.aau = true;
        }
        this.dNb = lep2.mB;
        this.Position = lep2.Position;
        this.dNc = lepArray;
        boolean bl11 = this.axW();
        if (this.dNd && this.dNg != bl11) {
            this.dNg = bl11;
            this.aau = true;
        } else if (Math.abs(this.dNb - this.dNI) > 0.1f) {
            this.dNH = true;
            this.aau = true;
        }
    }

    public void a(buo buo2) {
        assert (buo2 != null);
        if (cug.vM((int)this.ResourceType)) {
            this.l(9712, buo2.FirstName);
            this.l(9728, buo2.LastName);
            if (buo2.add != null) {
                this.l(9744, buo2.add);
                this.l(9776, buo2.bnj);
            }
            if (buo2.bnk != null) {
                this.l(9808, buo2.bnk);
            }
            this.aau = true;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8195: {
                this.b((gzp)dxq2);
                break;
            }
            case 8196: {
                this.b((gzq)dxq2);
                break;
            }
            case 8197: {
                this.a((gzu)dxq2);
                break;
            }
            case 5636: {
                this.b((fuu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MeshObjectGUID=");
        stringBuilder.append(this.Ui);
        stringBuilder.append(" PhysicalObjectGUID=");
        stringBuilder.append(this.dtj);
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(lea.enW().getName(this.ResourceType));
        stringBuilder.append("' DistanceToObject=");
        stringBuilder.append(this.dNb);
        return stringBuilder.toString();
    }

    private void axT() {
        bum.aym().dtj = this.dtj;
        int[] nArray = this.mW(this.ResourceType);
        if (nArray != null && nArray.length > 0) {
            this.u(nArray);
            this.dNe = false;
        } else {
            this.dNe = true;
        }
        this.aau = true;
        if (cug.vM((int)this.ResourceType)) {
            buo buo2 = this.dNG.jU(this.dtj);
            if (buo2 == null) {
                lfn.b(5, "SFObjectInfoAssembler", "checkPhysicalObject() No titlecollection found for object " + this.dtj);
                return;
            }
            this.l(9712, buo2.FirstName);
            this.l(9728, buo2.LastName);
            if (this.ResourceType == cug.fgB) {
                this.dNf = false;
                fut fut2 = (fut)this.MessageDelegator.h(5635, this.getGUID(), this.dtj);
                fut2.iXt = 1024;
                this.MessageDelegator.E(fut2);
            } else {
                this.q(9792, false);
                this.dNf = true;
            }
            if (buo2.add != null) {
                int n;
                this.l(9744, buo2.add);
                this.l(9776, buo2.bnj);
                if (this.dNG.ayz() != null && (n = this.dNG.ayz().gn(buo2.add)) != 0) {
                    this.ar(9760, n);
                }
            }
            if (buo2.bnk != null) {
                this.l(9808, buo2.bnk);
            }
        } else {
            this.dNf = true;
        }
    }

    private void q(int n, boolean bl2) {
        eq eq2 = new eq();
        eq2.setType(n);
        eq2.x(bl2);
        this.k(eq2);
    }

    private void ar(int n, int n2) {
        ew ew2 = new ew();
        ew2.setType(n);
        ew2.bi(n2);
        this.k(ew2);
    }

    private void l(int n, String string) {
        ff ff2 = new ff();
        ff2.setType(n);
        ff2.av(string);
        this.k(ff2);
    }

    private ldv axU() {
        assert (this.Ui != null);
        assert (this.dtj == null);
        amf amf2 = ((dta)this.MessageDelegator).bzt().d(this.Ui);
        if (amf2 == null) {
            return null;
        }
        if (!(amf2 instanceof bvd)) {
            return null;
        }
        bvd bvd2 = (bvd)amf2;
        if (bvd2.aze() == null) {
            return null;
        }
        return bvd2.aze().getGUID();
    }

    private ldv jI(ldv ldv2) {
        assert (ldv2 != null);
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
        if (amf2 == null) {
            bvd bvd2;
            dtm dtm2;
            if (lcw.enb() && ldv2.enw() > 7000 && (amf2 = (dtm2 = (dtm)this.MessageDelegator.bzx().bzt()).bAh().d(lcr.al((ldv)ldv2, (int)3))) != null && amf2 instanceof bvd && (bvd2 = (bvd)amf2).aze() != null) {
                return lcr.al((ldv)bvd2.aze().getGUID(), (int)this.GUID.ib());
            }
            return null;
        }
        if (!(amf2 instanceof bvd)) {
            return null;
        }
        bvd bvd3 = (bvd)amf2;
        if (bvd3.aze() == null) {
            return null;
        }
        return bvd3.aze().getGUID();
    }

    private int M(ldv ldv2, int n) {
        assert (ldv2 != null);
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
        if (amf2 == null) {
            return n;
        }
        if (!(amf2 instanceof bvd)) {
            return n;
        }
        bvd bvd2 = (bvd)amf2;
        if (!bsi.mF(bvd2.az())) {
            return n;
        }
        cbx cbx2 = bvd2.aze();
        if (cbx2 == null) {
            return n;
        }
        el el2 = cbx2.fi();
        if (el2 == null) {
            return n;
        }
        int n2 = el2.ap(13632);
        if (n2 == -1) {
            return n;
        }
        int n3 = cug.uJ((int)n2);
        if (n3 == -1) {
            return n;
        }
        return n3;
    }

    private ej f(int n, List<ej> list) {
        if (list.isEmpty()) {
            return null;
        }
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            if (list.get(i).getType() != n) continue;
            return list.get(i);
        }
        return null;
    }

    private ej[] arJ() {
        if (this.dFm.isEmpty()) {
            return new ej[0];
        }
        return this.dFm.toArray(new ej[this.dFm.size()]);
    }

    public boolean axV() {
        int n;
        if (this.dFm == null || this.dFm.isEmpty()) {
            return true;
        }
        ej ej2 = this.f(12656, this.dFm);
        ej ej3 = this.f(12672, this.dFm);
        if (ej2 == null || ej3 == null) {
            return true;
        }
        if (!(ej2 instanceof ew) || !(ej3 instanceof ew)) {
            return true;
        }
        int n2 = ((ew)ej2).fQ();
        return n2 < (n = ((ew)ej3).fQ());
    }

    private int[] mW(int n) {
        if (cug.wy((int)n)) {
            return null;
        }
        if (this.ResourceTree.isDescendant(n, cug.fgH)) {
            return this.dNs;
        }
        if (this.ResourceTree.isDescendant(n, cug.fnP)) {
            return this.dNt;
        }
        if (this.ResourceTree.isDescendant(n, cug.fgE)) {
            if (cug.vM((int)n)) {
                return this.dNi;
            }
            return this.dNh;
        }
        if (this.ResourceTree.isDescendant(n, cug.fgB)) {
            return this.dNi;
        }
        if (this.ResourceTree.isDescendant(n, cug.fia)) {
            return this.dNC;
        }
        if (this.ResourceTree.isDescendant(n, cug.fgx)) {
            return this.dNw;
        }
        if (this.ResourceTree.isDescendant(n, cug.fnw)) {
            return this.dNx;
        }
        if (this.ResourceTree.isDescendant(n, cug.fmZ)) {
            if (this.ResourceTree.isDescendant(n, cug.fpV)) {
                return this.dNl;
            }
            if (this.ResourceTree.isDescendant(n, cug.fnc)) {
                return this.dNy;
            }
            return null;
        }
        if (this.ResourceTree.isDescendant(n, cug.fpm)) {
            return this.dNE;
        }
        if (this.ResourceTree.isDescendant(n, cug.fnO) || this.ResourceTree.isDescendant(n, cug.fnQ)) {
            return this.duN;
        }
        if (this.ResourceTree.isDescendant(n, cug.fkN)) {
            return this.dNh;
        }
        if (this.ResourceTree.isDescendant(n, cug.frm)) {
            return null;
        }
        if (this.ResourceTree.isDescendant(n, cug.frl)) {
            return this.dNm;
        }
        if (n == cug.frj || n == cug.frk) {
            return this.dNn;
        }
        if (this.ResourceTree.isDescendant(n, cug.fqX)) {
            return null;
        }
        if (this.ResourceTree.isDescendant(n, cug.fqY)) {
            return null;
        }
        if (this.ResourceTree.isDescendant(n, cug.fqZ)) {
            return null;
        }
        if (this.ResourceTree.isDescendant(n, cug.fra)) {
            return this.dNr;
        }
        if (this.ResourceTree.isDescendant(n, cug.fqO)) {
            return this.dNj;
        }
        if (this.ResourceTree.isDescendant(n, cug.fpz)) {
            return this.dNk;
        }
        if (this.ResourceTree.isDescendant(n, cug.fjK)) {
            return null;
        }
        if (this.ResourceTree.isDescendant(n, cug.fjL)) {
            return null;
        }
        if (n == cug.frN || n == cug.frO || n == cug.frP) {
            return this.dNv;
        }
        if (this.ResourceTree.isDescendant(n, cug.frM)) {
            return this.dNh;
        }
        if (this.ResourceTree.isDescendant(n, cug.fst)) {
            return this.dNz;
        }
        if (this.ResourceTree.isDescendant(n, cug.fss)) {
            return this.dNz;
        }
        if (this.ResourceTree.isDescendant(n, cug.fsv)) {
            return this.dNz;
        }
        if (this.ResourceTree.isDescendant(n, cug.fsu)) {
            return null;
        }
        if (this.ResourceTree.isDescendant(n, cug.fsx)) {
            return null;
        }
        if (this.ResourceTree.isDescendant(n, cug.fki)) {
            return null;
        }
        if (cug.vk((int)n) || this.ResourceType == cug.fkx || this.ResourceType == cug.fwE || this.ResourceType == cug.fky) {
            return this.dNo;
        }
        if (cug.vn((int)n)) {
            return this.dNp;
        }
        if (cug.vt((int)n)) {
            return this.dNh;
        }
        if (cug.vu((int)n)) {
            return null;
        }
        if (cug.vv((int)n)) {
            return null;
        }
        if (this.ResourceTree.isDescendant(n, cug.fgR)) {
            return this.dNh;
        }
        if (this.ResourceTree.isDescendant(n, cug.fnV)) {
            return null;
        }
        if (this.ResourceTree.isDescendant(n, cug.fsn)) {
            return this.dNA;
        }
        if (n == cug.flx) {
            return this.dNq;
        }
        if (this.ResourceTree.isDescendant(n, cug.fsb) || this.ResourceTree.isDescendant(n, cug.fsd) || this.ResourceTree.isDescendant(n, cug.fsc)) {
            return this.dNu;
        }
        if (this.ResourceTree.isDescendant(n, cug.fsf)) {
            return this.dNu;
        }
        if (n == cug.fsq) {
            return this.dND;
        }
        if (n == cug.fso) {
            return this.dNB;
        }
        if (n == cug.fwE) {
            return this.dNF;
        }
        return null;
    }

    private void c(int n, ej ej2) {
        assert (n > 0);
        assert (ej2 != null);
        switch (n) {
            case 1: 
            case 2: {
                this.k(ej2);
                this.aau = true;
                this.dNe = true;
                break;
            }
            default: {
                lfn.b(5, "SFObjectInfoAssembler", "handleAttribute() Invalid EventType provided: " + n);
                return;
            }
        }
    }

    private void b(gzp gzp2) {
        if (gzp2.aXP <= 0) {
            lfn.b(5, "SFObjectInfoAssembler", "handleAttributeChangedMessage() EventType is invalid.");
            return;
        }
        if (gzp2.bhp == null) {
            lfn.b(5, "SFObjectInfoAssembler", "handleAttributeChangedMessage() Attribute is null.");
            return;
        }
        if (this.bWM == null) {
            return;
        }
        if (!this.bWM.equals(gzp2.aO())) {
            return;
        }
        this.c(gzp2.aXP, gzp2.bhp);
    }

    private void b(gzq gzq2) {
        if (gzq2.DR == null) {
            lfn.b(5, "SFObjectInfoAssembler", "handleAttributeValueMessage() Attributes array is null.");
            return;
        }
        if (this.bWM == null) {
            return;
        }
        if (!this.bWM.equals(gzq2.aO())) {
            return;
        }
        ej[] ejArray = gzq2.DR;
        if (ejArray == null || ejArray.length == 0) {
            this.aau = true;
            this.dNe = true;
            return;
        }
        int n = ejArray.length;
        for (int i = 0; i < n; ++i) {
            this.c(1, ejArray[i]);
        }
    }

    private void b(fuu fuu2) {
        this.dNa = fuu2.dNa;
        this.dNf = true;
        this.q(9792, false);
    }

    private void a(gzu gzu2) {
        if (gzu2.jvJ != 1) {
            lfn.b(5, "SFObjectInfoAssembler", "handleWiretapStatusMessage() Invalid StatusType provided: " + gzu2.jvJ);
        }
    }

    private boolean axW() {
        return ((jpx)this.MessageDelegator.d(lcr.qBQ)).d(this.dNb, this.ResourceType);
    }

    private ej mX(int n) {
        Iterator<ej> iterator = this.dFm.iterator();
        while (iterator.hasNext()) {
            ej ej2 = iterator.next();
            if (ej2.getType() != n) continue;
            iterator.remove();
            return ej2;
        }
        return null;
    }

    private void k(ej ej2) {
        ej ej3 = this.mX(ej2.getType());
        if (ej3 != null) {
            this.dFm.add(ej2);
        } else {
            this.dFm.add(ej2);
        }
    }

    private void axX() {
        this.Ui = null;
        this.dtj = null;
        this.ResourceType = 0;
        this.dNa = 0;
        this.dNb = 0.0f;
        this.Position = null;
        this.dNc = null;
        this.bWM = null;
        this.dFm.clear();
        this.dNd = false;
        this.aau = false;
        this.dNg = false;
        this.dNe = false;
        this.dNf = false;
        this.dNH = false;
        this.dNI = 0.0f;
    }

    private void axY() {
        ffk ffk2 = (ffk)this.MessageDelegator.h(2561, this.GUID, lcr.acL);
        ffk2.iKY = false;
        this.MessageDelegator.F(ffk2);
        this.axZ();
        lcw.akU = null;
    }

    private void axZ() {
        fey fey2 = (fey)this.MessageDelegator.h(2564, this.GUID, lcr.acL);
        if (this.Ui == null) {
            fey2.iKJ = "";
        } else {
            ff ff2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MeshObjectGUID: ");
            stringBuilder.append(this.Ui);
            if (this.dtj != null) {
                stringBuilder.append("  PhysicalObjectGUID: ");
                stringBuilder.append(this.dtj);
            }
            stringBuilder.append(" DistanceToObject=");
            stringBuilder.append(this.dNJ.format(this.dNb));
            lip lip2 = cug.uH((int)this.ResourceType);
            if (lip2 != null) {
                stringBuilder.append("   Resource='");
                stringBuilder.append(lip2.esy());
                stringBuilder.append("'");
            }
            if (this.ResourceTree.isDescendant(this.ResourceType, cug.fia) && (ff2 = (ff)this.f(1392, this.dFm)) != null) {
                stringBuilder.append("   File: ");
                stringBuilder.append(ff2.getStringValue());
            }
            fey2.iKJ = stringBuilder.toString();
        }
        this.MessageDelegator.F(fey2);
        this.dNI = this.dNb;
    }

    private void e(ej[] ejArray) {
        assert (this.aau && this.dNe && this.dNf);
        if (!lcw.qOQ) {
            return;
        }
        ffk ffk2 = (ffk)this.MessageDelegator.h(2561, this.GUID, lcr.acL);
        ffk2.iKY = true;
        ffk2.ResourceType = this.ResourceType;
        ffk2.dNb = this.dNb;
        ffk2.DR = ejArray;
        ffk2.iKZ = this.dNg;
        ffk2.dtj = this.dtj;
        this.MessageDelegator.F(ffk2);
        this.axZ();
    }

    private void u(int[] nArray) {
        assert (this.dtj != null);
        assert (this.bWM == null);
        assert (nArray != null);
        this.bWM = this.MessageDelegator.bzv();
        dqi dqi2 = new dqi();
        dqi2.setGUID(this.bWM);
        dqi2.nC(this.GUID);
        dqi2.M(nArray);
        dqi2.iv(false);
        dqi2.iw(false);
        dqi2.iy(false);
        gzo gzo2 = (gzo)this.MessageDelegator.h(8193, this.GUID, this.dtj);
        gzo2.jvG = dqi2;
        this.MessageDelegator.F(gzo2);
    }

    private final void aya() {
        assert (this.dtj != null);
        assert (this.bWM != null);
        gzr gzr2 = (gzr)this.MessageDelegator.h(8194, this.GUID, this.dtj);
        gzr2.bWM = this.bWM;
        this.MessageDelegator.F(gzr2);
        this.MessageDelegator.oa(this.bWM);
        this.bWM = null;
    }
}

