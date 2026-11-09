/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  lcr
 */
import java.util.Iterator;
import java.util.Set;

public class dpw
extends dqa
implements bto,
cbw {
    private static final int eJi = 1;
    private static final int eJj = 2;
    private static final int eJk = 3;
    private static final int gNq = 3;
    private boolean gNr = false;
    private double gNs = 0.0;
    private double gNt = 0.0;
    private dpv gNu = null;
    private int gNv = 0;
    private double gNw = 0.0;
    private boolean eJL = false;
    private int eJq = 0;
    private int eJp = 0;
    private ldv eJD = null;
    private ldv eJw = null;
    private int eJu = 0;
    private ldv eJv = null;
    private ldv eJy = null;
    private int eJG = -1;
    private String eJz = null;
    private ldv eJA = null;
    private String eJB = null;
    private bbs eJC = bbs.NoRank;
    private ldv eJE = null;
    private int eJx = 0;
    private int eJF = -1;
    private double eJr = 0.0;
    private double eJs = 0.0;
    private double eJt = 0.0;
    private int[] eJH = null;
    private int[] eJI = null;
    private ldv eJJ = null;

    boolean bsv() {
        return this.gNr;
    }

    float aSs() {
        return this.emh.bsd() == dpy.gND ? 0.0f : (this.gNr ? 1.0f : (float)((this.MessageDelegator.arc().rgz - this.gNs) / (this.gNt - this.gNs)));
    }

    int bsw() {
        return this.gNu == null ? 0 : this.gNu.bst();
    }

    int bsx() {
        return this.eJq;
    }

    double bsy() {
        return this.gNs;
    }

    double bsz() {
        return this.gNt;
    }

    ldv bsA() {
        return this.eJD;
    }

    ldv bsB() {
        return this.eJw;
    }

    float bsC() {
        return this.gNu == null ? 0.0f : this.gNu.Bf(jvv.dTT());
    }

    dpw(dpx dpx2) {
        super(dpx2);
    }

    @Override
    void a(pf pf2) {
    }

    @Override
    void b(pf pf2) {
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.emh.bsd() == dpy.gND) {
            return;
        }
        if (this.gNr) {
            if (this.eJv == null) {
                this.W(ldz2);
            } else {
                this.X(ldz2);
            }
        } else {
            this.ak(ldz2);
        }
    }

    private void ak(ldz ldz2) {
        if (this.gNr || this.emh.bsd() == dpy.gND || this.gNt == 0.0) {
            return;
        }
        if (this.MessageDelegator.arc().rgz >= this.gNt) {
            this.gNr = true;
            this.eJq = 0;
            this.eJD = null;
            this.eJw = null;
            this.eJu = 0;
            this.eJr = jvv.dST();
            this.emh.bsS();
        }
    }

    private void W(ldz ldz2) {
        if (!this.gNr || this.eJv != null) {
            return;
        }
        if (this.eJp != 0) {
            return;
        }
        if (this.eJq <= 0) {
            return;
        }
        this.eJr -= ldz2.qwh;
        if (this.eJr > 0.0) {
            return;
        }
        --this.eJq;
        this.eJr += jvv.dST();
        if (this.eJq == 0) {
            this.eJD = null;
            this.eJw = null;
            this.eJu = 0;
        }
        this.emh.aSm();
    }

    private void X(ldz ldz2) {
        if (!this.gNr || this.eJv == null) {
            return;
        }
        if (this.ddp == null) {
            this.O(this.eJv, this.GUID);
            this.eJv = null;
            this.eJy = null;
            this.eJz = null;
            this.eJA = null;
            this.eJB = null;
            this.eJC = bbs.NoRank;
            this.eJE = null;
            this.eJx = 0;
            this.eJF = -1;
            this.eJG = -1;
            return;
        }
        if (this.eJp != 0) {
            return;
        }
        if (this.eJq == this.gNu.bst()) {
            return;
        }
        this.eJs -= ldz2.qwh;
        if (this.eJs > 0.0) {
            return;
        }
        boolean bl = this.emh.bqi() != null && this.emh.bqi().equals(this.eJA);
        int n = jvv.dSU() + (bl && lgp.erA().cS(jvv.dTL()) ? jvv.dSU() : 0);
        this.N(this.eJv, this.ddp.getGUID());
        if (this.eJq == 0) {
            this.eJp = n;
            this.eJD = this.eJy;
            this.eJw = this.eJE;
            this.eJu = this.eJx;
            int n2 = this.eJp;
            if (this.eJF == cug.fuq) {
                n2 *= 3;
            }
            this.a(2, this.eJy, cug.fux, n2, bqy.dId);
            this.eJs += this.eJt;
            ++this.eJG;
        } else {
            boolean bl2;
            boolean bl3 = this.eJD != null && this.eJD.equals(this.eJy);
            boolean bl4 = bl2 = this.eJw != null && this.eJw.equals(this.eJE);
            if (bl3 || bl2) {
                this.eJp = n;
                if (this.eJq + this.eJp > this.gNu.bst()) {
                    this.eJp = this.gNu.bst() - this.eJq;
                }
                this.eJD = this.eJy;
                this.eJw = this.eJE;
                this.eJu = this.eJx;
                int n3 = this.eJp;
                if (this.eJF == cug.fuq) {
                    n3 *= 3;
                }
                this.a(2, this.eJy, cug.fux, n3, bqy.dId);
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
                this.eJs += this.eJt * jvv.dSW();
            }
        }
    }

    @Override
    void aJf() {
        if (this.emh.bqi() == null) {
            return;
        }
        if (this.aSs() == 0.0f) {
            this.c(mau.uff.bD(this.emh.getID(), this.gNt - this.MessageDelegator.arc().rgz), this.emh.bqi());
        } else {
            this.c(mau.ufg.bD(this.emh.getID(), this.gNt - this.MessageDelegator.arc().rgz), this.emh.bqi());
        }
    }

    @Override
    protected void bsf() {
        this.ddp.a(this);
        this.eJv = null;
        this.eJy = null;
        this.eJz = null;
        this.eJA = null;
        this.eJB = null;
        this.eJC = bbs.NoRank;
        this.eJE = null;
        this.eJx = 0;
        this.eJF = -1;
        this.eJG = -1;
        this.eJt = 0.0;
        this.eJs = 0.0;
        this.eJr = jvv.dST();
    }

    @Override
    protected void bsg() {
        this.ddp.a(null);
        this.eJv = null;
        this.eJy = null;
        this.eJG = -1;
        this.eJz = null;
        this.eJA = null;
        this.eJB = null;
        this.eJC = bbs.NoRank;
        this.eJE = null;
        this.eJx = 0;
        this.eJF = -1;
        this.eJt = 0.0;
        this.eJs = 0.0;
        this.eJr = jvv.dST();
    }

    private void aSj() {
        if (this.eJq == this.gNu.bst()) {
            this.O(this.eJv, this.ddp.getGUID());
            Set<lfs<Integer, Integer>> set = jvv.a(this.emh.getID(), dpu.gNk, this.gNu.bsu(), false, this.emh.bsk());
            this.eJH = jvv.r(set);
            this.eJI = jvv.s(set);
            this.eJJ = this.eJy;
            jts.a(bqy.dGZ, this.eJH, this.eJI, this.emh.av(), this.MessageDelegator, this.ddp.getGUID());
            if (this.eJE != null && jvv.dTM()) {
                this.a(this.eJE, this.eJH, this.eJI, this.emh.av(), jvv.dSZ(), bqy.dGZ);
            } else {
                this.a(3, this.eJy, this.eJH, this.eJI, bqy.dGZ);
            }
            Set<lfs<Integer, Integer>> set2 = jvv.a(this.emh.getID(), dpu.gNk, true, this.emh.bsk());
            if (!set2.isEmpty()) {
                int n = 0;
                Iterator<lfs<Integer, Integer>> iterator = set2.iterator();
                while (iterator.hasNext()) {
                    lfs<Integer, Integer> lfs2 = iterator.next();
                    if ((Integer)lfs2.reX != cug.fkb) continue;
                    iterator.remove();
                    n = (Integer)lfs2.reY;
                }
                this.a(1, n, jvv.r(set2), jvv.s(set2));
                jts.a(bqy.dGZ, jvv.r(set2), jvv.s(set2), this.emh.av(), this.MessageDelegator, this.ddp.getGUID());
            }
            if (this.eJA == null || !this.eJA.equals(this.emh.bqi())) {
                if (this.eJA == null) {
                    if (this.eJz != null) {
                        this.c(mau.ufc.bD(this.eJz, this.emh.getID()), this.emh.bqi());
                    }
                } else if (this.eJz != null && this.eJB != null) {
                    this.c(mau.ufd.bD(this.eJz, this.eJB, this.emh.getID()), this.emh.bqi());
                }
            } else if (this.eJC != null && this.eJz != null) {
                this.c(mau.ufb.bD(new Object[]{this.eJC, this.eJz, this.emh.getID()}), this.emh.bqi());
            }
            if (this.eJw == null) {
                this.c(mde.utp.bD(this.emh.getID()), this.eJD);
            } else {
                this.c(mde.uto.bD(this.emh.getID()), this.eJw);
            }
            this.g(mau.ufe.bD(this.emh.getID()));
            this.eJv = null;
            this.eJy = null;
            this.eJz = null;
            this.eJA = null;
            this.eJB = null;
            this.eJC = bbs.NoRank;
            this.eJE = null;
            this.eJx = 0;
            this.eJF = -1;
            this.eJG = -1;
            this.gNr = false;
            this.eJL = false;
            this.c(mau.uff.bD(this.emh.getID(), this.gNt - this.MessageDelegator.arc().rgz), this.emh.bqi());
            this.gNu = jvv.Wj(this.gNv);
            this.gNs = this.MessageDelegator.arc().rgz - this.gNw;
            this.gNt = this.gNs + this.gNu.bss();
            this.emh.aSn();
        }
    }

    private void a(ftk ftk2, boolean bl, loz loz2, float f2, loz loz3) {
        ftl ftl2 = (ftl)this.MessageDelegator.h(1051, ftk2.amk(), ftk2.aO());
        this.MessageDelegator.b(ftk2, ftl2);
        ftl2.jO(bl);
        ftl2.t(loz2);
        ftl2.jj(f2);
        ftl2.u(loz3);
        this.MessageDelegator.F(ftl2);
    }

    private void N(ldv ldv2, ldv ldv3) {
        ftn ftn2 = (ftn)this.MessageDelegator.h(1053, ldv3, ldv2);
        this.MessageDelegator.F(ftn2);
    }

    private void O(ldv ldv2, ldv ldv3) {
        fdp fdp2 = (fdp)this.MessageDelegator.h(9218, ldv3, ldv2);
        this.MessageDelegator.F(fdp2);
    }

    private void a(int n, ldv ldv2, int[] nArray, int[] nArray2, bqy bqy2) {
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.GUID, ldv2);
        fmz2.hsP = true;
        fmz2.aqs = n;
        fmz2.iQH = false;
        fmz2.iJG = true;
        fmz2.bqd = nArray;
        fmz2.iIY = nArray2;
        fmz2.b(bqy2);
        this.MessageDelegator.F(fmz2);
    }

    private void a(int n, ldv ldv2, int n2, int n3, bqy bqy2) {
        fne fne2 = (fne)this.MessageDelegator.h(7981, this.GUID, ldv2);
        fne2.hsP = true;
        fne2.aqs = n;
        fne2.iQN = false;
        fne2.ResourceType = n2;
        fne2.asi = n3;
        fne2.b(bqy2);
        fne2.lg(this.eJG == 0);
        this.MessageDelegator.F(fne2);
    }

    private void a(ldv ldv2, int[] nArray, int[] nArray2, ljq ljq2, float f2, bqy bqy2) {
        fwq fwq2 = (fwq)this.MessageDelegator.h(17955, this.GUID, ldv2);
        fwq2.hsP = true;
        fwq2.lA(false);
        fwq2.lB(true);
        fwq2.g(nArray);
        fwq2.al(nArray2);
        fwq2.cM(ljq2);
        fwq2.jl(f2);
        fwq2.b(bqy2);
        this.MessageDelegator.F(fwq2);
    }

    private void a(int n, int n2, int[] nArray, int[] nArray2) {
        exw exw2 = (exw)this.MessageDelegator.h(24069, this.emh.getGUID(), this.emh.bqi());
        exw2.ija = n;
        exw2.iFp = n2;
        exw2.iFr = nArray;
        exw2.iFs = nArray2;
        exw2.cQg = this.emh.getGUID();
        exw2.iFq = this.emh.bsj();
        exw2.cQj = this.emh.bsk();
        this.MessageDelegator.F(exw2);
    }

    private void c(loz loz2, ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void g(loz loz2) {
        fgo fgo2 = (fgo)this.MessageDelegator.h(29447, this.GUID, lcr.qAL);
        fgo2.r(loz2);
        this.MessageDelegator.F(fgo2);
    }

    private void a(gbk gbk2, boolean bl, double d2) {
        gbl gbl2 = (gbl)this.MessageDelegator.h(24333, this.emh.getGUID(), gbk2.aO());
        this.MessageDelegator.b(gbk2, gbl2);
        gbl2.jO(bl);
        gbl2.cj(d2);
        gbl2.kQ(this.emh.getID());
        this.MessageDelegator.F(gbl2);
    }

    private void bsD() {
        gvl gvl2 = (gvl)this.MessageDelegator.h(32263, this.GUID, lcr.qEx);
        gvl2.cl(this.emh.getGUID());
        gvl2.ao(this.emh.aeY());
        gvl2.ar(this.emh.bse());
        gvl2.aH(this.bsz());
        gvl2.aI(this.bsy());
        this.MessageDelegator.F(gvl2);
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
            case 1055: {
                this.a((ftm)dxq2);
                break;
            }
            case 1054: {
                this.a((fto)dxq2);
                break;
            }
            case 17956: {
                this.a((fwr)dxq2);
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
            case 24332: {
                this.a((gbk)dxq2);
                break;
            }
            case 24077: {
                this.a((exv)dxq2);
                break;
            }
            case 5889: {
                this.a((fau)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ftk ftk2) {
        if (ftk2.Eb() != cxd.fHn) {
            this.a(ftk2, false, mde.utb.bD(this.emh.getID()), -1.0f, null);
            return;
        }
        if (!lea.enW().isDescendant(ftk2.bRH(), cug.ful)) {
            this.a(ftk2, false, mde.utb.bD(this.emh.getID()), -1.0f, null);
            return;
        }
        if (!this.gNr) {
            this.a(ftk2, false, mde.utc.bD(this.emh.getID()), -1.0f, null);
            return;
        }
        if (this.eJv != null) {
            this.a(ftk2, false, mde.utd.bD(this.emh.getID()), -1.0f, null);
            return;
        }
        if (ftk2.bRI() <= 0.0) {
            this.a(ftk2, false, mde.utb.bD(this.emh.getID()), -1.0f, null);
            return;
        }
        this.eJv = ftk2.bRC();
        this.eJy = ftk2.bRD();
        this.eJz = ftk2.hl();
        this.eJA = ftk2.bRE();
        this.eJB = ftk2.iV();
        this.eJC = ftk2.bOf();
        this.eJE = ftk2.bRF();
        this.eJx = ftk2.bRG();
        this.eJF = ftk2.bRH();
        this.eJG = 0;
        this.eJs = this.eJt = jvv.dSR() * ftk2.bRI();
        this.a(ftk2, true, mde.utf.bD(this.emh.getID(), (int)jvv.bRK()), jvv.bRK(), mde.uFy.bD(this.emh.getID(), (int)jvv.bRK()));
        this.eJr = jvv.dST();
        if (!(this.eJD == null || this.eJy.equals(this.eJD) || this.eJq <= 0 || this.eJw != null && this.eJw.equals(this.eJE))) {
            if (this.eJz != null) {
                this.c(mde.uth.bD(this.eJz, this.emh.getID(), cug.fux), this.eJw == null ? this.eJD : this.eJw);
            }
            this.c(mde.utg.bD(this.emh.getID(), cug.fux), this.eJy);
        } else if (this.eJE == null) {
            this.c(mde.utj.bD(this.emh.getID(), jvv.uz(this.emh.getID()), cug.fux), this.eJy);
        } else {
            this.c(mde.utk.bD(this.emh.getID(), jvv.uz(this.emh.getID()), cug.fux), this.eJE);
        }
    }

    private void a(ftj ftj2) {
        if (this.eJv == null || !this.eJv.equals(ftj2.bRC())) {
            return;
        }
        if (this.eJy.equals(this.eJD) && this.eJq > 0) {
            if (this.eJw == null) {
                this.c(mde.utm.bD(this.emh.getID(), cug.fux), this.eJD);
            } else {
                this.c(mde.utn.bD(this.emh.getID(), cug.fux), this.eJw);
            }
        }
        if (this.eJq > 0 && this.eJw != null && this.eJz != null) {
            this.c(mde.uti.bD(this.eJz, this.emh.getID()), this.eJE);
        }
        this.eJv = null;
        this.eJy = null;
        this.eJz = null;
        this.eJA = null;
        this.eJB = null;
        this.eJC = bbs.NoRank;
        this.eJE = null;
        this.eJx = 0;
        this.eJF = -1;
        this.eJG = -1;
        this.eJt = 0.0;
        this.eJs = 0.0;
        this.eJr = jvv.dST();
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
            this.emh.aSm();
        }
    }

    private void a(fwr fwr2) {
        if (fwr2.vA()) {
            this.eJH = null;
            this.eJI = null;
            this.eJJ = null;
        } else {
            lfn.b(3, this.getClass().getSimpleName(), "handlePartyDistributeResourcesResponseMessage() : Failed to give rewards to party, attempting to give to last connected player!!!");
            this.eJH = fwr2.bSz();
            this.eJH = fwr2.bSA();
            this.a(3, this.eJJ, this.eJH, this.eJI, bqy.dGZ);
        }
    }

    private void b(fna fna2) {
        switch (fna2.aVk()) {
            case 1: {
                if (fna2.iQK) {
                    this.eJq -= this.eJp;
                    this.eJp = 0;
                    this.emh.aSm();
                    break;
                }
                if (this.eJy == null) break;
                this.O(this.eJv, this.ddp == null ? this.GUID : this.ddp.getGUID());
                this.eJv = null;
                this.eJy = null;
                this.eJz = null;
                this.eJA = null;
                this.eJB = null;
                this.eJC = bbs.NoRank;
                this.eJE = null;
                this.eJx = 0;
                this.eJF = -1;
                this.eJG = -1;
                this.eJp = 0;
                break;
            }
            case 3: {
                this.eJH = null;
                this.eJI = null;
                this.eJJ = null;
                if (!fna2.iQK && this.emh.bqi() != null) {
                    lfn.b(3, this.getClass().getSimpleName(), "handleInventoryResourceCreateResponseMessage() : Failed to give rewards to last connected player, sending them to the owner clan!!!");
                    this.a(1, 0, fna2.bqd, fna2.iIY);
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
                        if (this.eJA == null || !this.eJA.equals(this.emh.bqi())) {
                            if (this.eJA == null) {
                                if (this.eJz != null) {
                                    this.c(mau.ueZ.bD(this.eJz, this.emh.getID()), this.emh.bqi());
                                }
                            } else if (this.eJz != null && this.eJB != null) {
                                this.c(mau.ufa.bD(this.eJz, this.eJB, this.emh.getID()), this.emh.bqi());
                            }
                        } else if (this.eJC != null && this.eJz != null) {
                            this.c(mau.ueY.bD(new Object[]{this.eJC, this.eJz, this.emh.getID()}), this.emh.bqi());
                        }
                    }
                    this.eJq += this.eJp;
                    this.emh.aSm();
                    this.eJp = 0;
                    this.aSj();
                    break;
                }
                if (this.eJv == null) break;
                this.c(mde.utl.bD(this.emh.getID(), cug.fux), this.eJy);
                if (this.eJy.equals(this.eJD) && this.eJq > 0) {
                    if (this.eJw == null) {
                        this.c(mde.utm.bD(this.emh.getID(), cug.fux), this.eJD);
                    } else {
                        this.c(mde.utn.bD(this.emh.getID(), cug.fux), this.eJw);
                    }
                }
                this.O(this.eJv, this.ddp == null ? this.GUID : this.ddp.getGUID());
                this.eJv = null;
                this.eJy = null;
                this.eJz = null;
                this.eJA = null;
                this.eJB = null;
                this.eJC = bbs.NoRank;
                this.eJE = null;
                this.eJx = 0;
                this.eJF = -1;
                this.eJG = -1;
                this.eJp = 0;
            }
        }
    }

    private void a(gbk gbk2) {
    }

    private void a(exv exv2) {
        if (this.gNr) {
            this.gNv = exv2.bNi();
            this.gNw = exv2.bNh() + (this.MessageDelegator.arc().rgz - exv2.bNj());
        } else {
            boolean bl;
            boolean bl2 = bl = this.gNu == null;
            if (this.gNu == null || this.gNu.getID() != exv2.bNi()) {
                this.gNu = jvv.Wj(exv2.bNi());
            }
            this.gNs = this.MessageDelegator.arc().rgz - (exv2.bNh() + (this.MessageDelegator.arc().rgz - exv2.bNj()));
            this.gNt = this.gNs + this.gNu.bss();
            boolean bl3 = this.gNr = this.MessageDelegator.arc().rgz >= this.gNt;
            if (this.gNr) {
                this.eJq = 0;
                this.eJD = null;
                this.eJw = null;
                this.eJu = 0;
                this.eJr = jvv.dST();
                this.emh.bsS();
            } else if (bl) {
                this.emh.aJe();
            }
            this.emh.bsR();
        }
    }

    private void a(fau fau2) {
    }
}

