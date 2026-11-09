/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hdm
 */
import java.util.LinkedList;

public class bwy {
    public final bwz dXv;
    public final ldv dXC;
    public hdm dXw;
    public hlc dXD;
    private hhk dXE;
    private double dXF;
    public final String YL;
    public final String hE;
    public final int cCF;
    public final int cCG;
    public final int dXG;
    private final cts dXH;
    private LinkedList<bww> dXI = lcn.emA();
    private LinkedList<bwv> dXJ = lcn.emA();
    private LinkedList<bxb> dXK = lcn.emA();
    public int[] dXL = new int[3];
    private final lbn dXA = new lbn(this){
        final /* synthetic */ bwy dXM;
        {
            this.dXM = bwy2;
        }

        public void W() {
            this.dXM.aCQ();
        }
    };

    public bwy(bwz bwz2, frn frn2) {
        this.dXv = bwz2;
        this.dXC = frn2.aO();
        this.YL = frn2.YL.trim();
        this.cCG = frn2.cCG;
        this.cCF = frn2.cCF;
        this.hE = frn2.hE;
        this.dXG = frn2.dXG;
        this.dXH = cxj.yh(this.dXG);
        assert (this.dXH != null);
    }

    public void bg(double d2) {
        this.dXF = d2;
    }

    public void shutdown() {
    }

    public void aCJ() {
        if (hec.kbV == null) {
            assert (false);
            return;
        }
        this.dXw = hec.kbV.cbO();
        this.dXD = new hlc(this);
        this.dXD.cdk();
    }

    public void aCK() {
        if (this.dXw == null) {
            return;
        }
        if (this.dXD == null) {
            return;
        }
        if (this.dXD.cdi()) {
            this.dXD.closeWindow();
            this.dXD = null;
        }
        this.dXw = null;
    }

    public final void a(frv frv2) {
    }

    public final void a(frz frz2) {
        while (!this.dXI.isEmpty() && this.dXI.getFirst().dXe < frz2.dXe - 10.0) {
            this.dXI.removeFirst();
        }
        bww bww2 = new bww();
        bww2.dXe = frz2.dXe;
        bww2.dXf = frz2.iVl;
        bww bww3 = this.aCR();
        if (bww3 != null) {
            bww2.dXs = bww3.dXs;
        }
        if ((frz2.iVl & 2) != 0) {
            bww2.dXp = frz2.dXp;
            bww2.dXq = frz2.dXq;
            bww2.dXi = frz2.dXi;
            bww2.dXj = frz2.dXj;
            bww2.bno = frz2.bno;
            bww2.dXk = frz2.dXk;
            bww2.dRh = frz2.dRh;
            bww2.dXl = frz2.dXl;
            bww2.dXm = frz2.dXm;
            bww2.dXn = frz2.dXn;
            bww2.dXo = frz2.dXo;
            bww2.ccX = frz2.ccX;
            bww2.add = frz2.add;
            bww2.aGr = frz2.aGr;
            bww2.bWk = frz2.bWk;
            bww2.bWF = frz2.bWF;
            bww2.bWG = frz2.bWG;
            bww2.bWs = frz2.bWs;
            bww2.bWt = frz2.bWt;
            if (bww3 != null && (bww3.dXf & 2) != 0) {
                bww2.dXr = bww2.bWF - bww3.bWF;
            }
        }
        bww2.dXg = 0.0;
        bww2.dXh = 0.0;
        if ((frz2.iVl & 1) != 0) {
            double d2;
            if (bww3 != null && (bww3.dXf & 1) != 0 && bww3.Position != null && frz2.Position != null && (d2 = frz2.dXe - bww3.dXe) >= 0.01 && d2 < 10.0) {
                float f2 = bww3.Position.x - frz2.Position.x;
                float f3 = bww3.Position.y - frz2.Position.y;
                float f4 = bww3.Position.rlV - frz2.Position.rlV;
                double d3 = Math.sqrt(f2 * f2 + f3 * f3 + f4 * f4);
                bww2.dXg = d3 / d2;
                d3 = Math.sqrt(f2 * f2 + f4 * f4);
                bww2.dXh = d3 / d2;
            }
            bww2.Position = frz2.Position;
        } else {
            bww2.Position = null;
        }
        if ((frz2.iVl & 4) != 0) {
            if (frz2.iVm != null) {
                for (int i = 0; i < frz2.iVm.length; ++i) {
                    this.dXJ.add(frz2.iVm[i]);
                    if (!this.nE(frz2.iVm[i].aWe)) continue;
                    bww2.dXs = frz2.iVm[i];
                }
                while (this.dXJ.size() > 10) {
                    this.dXJ.removeFirst();
                }
            }
        } else {
            this.dXJ.clear();
        }
        if ((frz2.iVl & 8) != 0) {
            if (frz2.iVn != null) {
                for (int i = 0; i < frz2.iVn.length; ++i) {
                    this.dXK.add(frz2.iVn[i]);
                }
                while (this.dXK.size() > 10) {
                    this.dXK.removeFirst();
                }
            }
        } else {
            this.dXK.clear();
        }
        if ((frz2.iVl & 0x10) != 0) {
            bww2.dXt = frz2.dXt;
            bww2.dXu = frz2.dXu;
        }
        this.dXI.add(bww2);
        this.aCL();
        this.aCP();
    }

    private final void aCL() {
        this.aCO();
        this.aCN();
        this.aCM();
    }

    private final void aCM() {
        int n = 0;
        for (bww bww2 : this.dXI) {
            if (bww2.dXu < 0 || bww2.dXt < 0 || bww2.dXt != 0 || bww2.dXu != cug.fkr && bww2.dXu != 0) continue;
            ++n;
        }
        this.dXL[2] = n > 6 ? 2 : (n > 3 ? 1 : 0);
    }

    private final void aCN() {
        bww bww2 = this.aCR();
        if (bww2 == null) {
            return;
        }
        int n = 0;
        for (bww bww3 : this.dXI) {
            if (bww3.dXs == null || bww3.dXe < bww2.dXe - 6.5) continue;
            if (!this.nE(bww3.dXs.aWe)) {
                assert (false);
                continue;
            }
            if (!this.nD(bww3.dXs.aWe) || !(bww3.dXr >= 0.0)) continue;
            ++n;
        }
        this.dXL[1] = n > 4 ? 2 : (n > 2 ? 1 : 0);
    }

    private final void aCO() {
        int n;
        bww bww2 = this.aCR();
        if (bww2 == null) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        for (bww bww3 : this.dXI) {
            if (bww3.dXs == null) {
                return;
            }
            if (bww3.dXe < bww2.dXe - 6.5) continue;
            if (!this.nE(bww3.dXs.aWe)) {
                assert (false);
                return;
            }
            float f2 = this.a(bww3.dXs.aWe, bww3.dXn, bww3.dXo);
            if (bww3.dXg > (double)f2 * 1.5) {
                ++n3;
                continue;
            }
            if (!(bww3.dXg > (double)f2 * 1.05)) continue;
            ++n2;
        }
        if (bww2.dXs != null && (n = (bww2.dXs.aWe >> 16 & 0xFF) << 16) == 65536 && bww2.dXg < (double)0.1f) {
            n3 = 0;
            n2 = 0;
        }
        this.dXL[0] = n3 > 2 || n2 > 4 ? 2 : (n3 > 1 || n2 > 2 ? 1 : 0);
    }

    private final void aCP() {
        bww bww2 = this.aCR();
        if (bww2 == null) {
            assert (false);
            return;
        }
        if (this.dXE != null && this.dXE.isInitialized()) {
            this.dXE.f(bww2.dXp, bww2.dXq);
            if (bww2.Position == null) {
                this.dXE.c(ljq.roQ);
            } else {
                this.dXE.c(bww2.Position);
            }
            this.dXE.a(bww2.dXg, bww2.dXh, bww2.dXn);
            this.dXE.a(bww2.dXs);
            this.dXE.aZ(this.dXJ);
            this.dXE.ba(this.dXK);
            this.dXE.a(bww2.aGr, bww2.bWk, bww2.bWF, bww2.bWG, bww2.bWs, bww2.bWt);
            this.dXE.t(bww2.add, bww2.ccX);
            this.dXE.a(bww2.dXi, bww2.dXj, bww2.bno, bww2.dXk, bww2.dRh, bww2.dXl, bww2.dXm);
            this.dXE.cr(bww2.dXu, bww2.dXt);
            this.dXE.aE(this.dXL);
        }
    }

    public final void aCQ() {
        this.dXv.a(this);
    }

    public hen aCI() {
        lgg lgg2 = new lgg(100, 100);
        hen hen2 = new hen(this.dXw, this.YL, lgg2, new lhf(520, 585), this.dXw.jXJ, new hen.d(new ljk(this.YL + " monitor")), new hnu.d(this.dXA), new hen.e(true), new hen.c(this.dXD.coX()));
        lhf lhf2 = hen2.cqv().q(hen2.cfF().keL.kKX.kPT.ctr());
        this.dXE = new hhk((hnc)this.dXw, "Surface", lgg.rlI, lhf2, this.dXw.kKk, this);
        hen2.w(this.dXE);
        this.dXE.b(this.hE, this.YL, this.cCF, this.cCG);
        return hen2;
    }

    public bww aCR() {
        if (this.dXI.isEmpty()) {
            return null;
        }
        return this.dXI.getLast();
    }

    private final boolean nD(int n) {
        int n2 = (n >> 16 & 0xFF) << 16;
        switch (n2) {
            case 917504: {
                return true;
            }
            case 786432: {
                return n == 786730;
            }
            case 0x100000: {
                switch (n) {
                    case 0x100190: 
                    case 0x100191: 
                    case 1048978: 
                    case 1048979: {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    private final boolean nE(int n) {
        int n2 = (n >> 16 & 0xFF) << 16;
        switch (n2) {
            case 65536: 
            case 131072: 
            case 196608: 
            case 262144: 
            case 524288: 
            case 589824: 
            case 720896: 
            case 786432: 
            case 917504: 
            case 983040: 
            case 0x100000: 
            case 0x140000: 
            case 0x150000: {
                return true;
            }
        }
        return false;
    }

    private final float a(int n, boolean bl, float f2) {
        if (this.dXH == null) {
            return 0.0f;
        }
        int n2 = (n >> 16 & 0xFF) << 16;
        switch (n2) {
            case 65536: 
            case 131072: 
            case 0x140000: 
            case 0x150000: {
                return 0.0f;
            }
            case 524288: {
                return this.dXH.ContactVelocityCrouchWalk;
            }
            case 720896: {
                return this.dXH.ContactVelocityClimbing;
            }
            case 917504: {
                if (bl) {
                    return 2.5f;
                }
                return 7.5f;
            }
            case 262144: {
                if (n == 262410) {
                    return 3.0f;
                }
                return 2.5f;
            }
            case 786432: {
                if (!bl && n == 786730) {
                    return this.dXH.ContactVelocitySwimFast;
                }
                return this.dXH.ContactVelocitySwim;
            }
            case 0x100000: {
                switch (n) {
                    case 0x100190: 
                    case 0x100191: 
                    case 1048978: 
                    case 1048979: {
                        if (bl) {
                            return 1.5f;
                        }
                        return this.dXH.ContactVelocitySprint;
                    }
                    case 0x100010: 
                    case 0x100011: 
                    case 1048618: 
                    case 1048619: 
                    case 1048634: 
                    case 1048635: 
                    case 1048649: 
                    case 1048650: {
                        if (bl) {
                            return 1.5f;
                        }
                        return this.dXH.ContactVelocityRunStrafe * f2;
                    }
                }
                if (bl) {
                    return 1.5f;
                }
                return this.dXH.ContactVelocityRun * f2;
            }
            case 983040: {
                if (bl) {
                    return 1.5f;
                }
                return this.dXH.ContactVelocityWalk;
            }
            case 589824: {
                return this.dXH.ContactVelocitySprint;
            }
            case 196608: {
                return this.dXH.ContactVelocitySprint;
            }
        }
        return 0.0f;
    }

    public final void aCS() {
        this.dXv.gG(this.YL);
    }

    public final void aCT() {
        this.dXv.gH(this.YL);
    }

    public final void aCU() {
        this.dXv.gI(this.YL);
    }
}

