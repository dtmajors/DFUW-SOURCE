/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcr
 */
import java.util.Map;

public class hgt
extends hmt
implements alz,
lbr {
    private lbn koX = new lbn(this){
        final /* synthetic */ hgt kpf;
        {
            this.kpf = hgt2;
        }

        public void W() {
            hgt.a(this.kpf);
        }
    };
    private lbn koY = new lbn(this){
        final /* synthetic */ hgt kpf;
        {
            this.kpf = hgt2;
        }

        public void W() {
            hgt.b(this.kpf);
        }
    };
    public static final lhf koZ = new lhf(32, 32);
    public final hdm dXw;
    private final boolean kpa;
    private int fDE;
    private hpa jHl;
    private hgu[] kpb;
    private ama knm;
    private ldv dAu;
    private ldv kpc;
    private Map<Integer, Integer> kpd = lcn.emG();
    private Map<Integer, Integer> kpe = lcn.emG();

    public hgt(hdm hdm2, String string, lgg lgg2, lhf lhf2, boolean bl) {
        super((hnc)hdm2, string, lgg2, lhf2);
        this.kpa = bl;
        this.dXw = hdm2;
        this.fDE = hdm2.jZL.cde().getValue();
        this.jHl = new hpa((hnc)hdm2, (String)null, lgg.rlI, lhf2, hdm2.jXk.jPl);
        this.j(this.jHl);
        this.kpb = new hgu[this.fDE];
        for (int i = 0; i < this.fDE; ++i) {
            int n;
            int n2;
            if (this.kpa) {
                n2 = i * hgt.koZ.rmN;
                n = 0;
            } else {
                n2 = 0;
                n = i * hgt.koZ.H;
            }
            hgu hgu2 = new hgu(this.dXw, null, new lgg(n2, n), koZ, this);
            this.j(hgu2);
            this.kpb[i] = hgu2;
        }
        this.knm = new ama(this);
    }

    @Override
    public void FF() {
        super.FF();
        this.dXw.jZL.cde().cec().a(true, this.koX);
        this.knm.Eu();
        gpq gpq2 = (gpq)this.knm.getMessageDelegator().h(11011, this.knm.getGUID(), lcr.qzp);
        this.knm.getMessageDelegator().E(gpq2);
        this.dXw.kAz.b(this.koY);
    }

    @Override
    public void FG() {
        super.FG();
        this.dXw.jZL.cde().cec().a(false, this.koX);
        if (this.knm != null) {
            if (this.dAu != null) {
                fvv fvv2 = (fvv)this.knm.getMessageDelegator().h(12290, this.knm.getGUID(), this.dAu);
                fvv2.iTm = 1;
                this.knm.getMessageDelegator().E(fvv2);
                this.dAu = null;
            }
            this.knm.Ev();
            this.knm = null;
        }
    }

    private void cjR() {
        int n = this.dXw.jZL.cde().getValue();
        if (n == this.fDE) {
            return;
        }
        hgu[] hguArray = new hgu[n];
        if (n < this.fDE) {
            int n2;
            for (n2 = 0; n2 < n; ++n2) {
                hguArray[n2] = this.kpb[n2];
            }
            for (n2 = n; n2 < this.fDE; ++n2) {
                this.kpb[n2].remove();
            }
        } else {
            int n3;
            for (n3 = 0; n3 < this.fDE; ++n3) {
                hguArray[n3] = this.kpb[n3];
            }
            for (n3 = this.fDE; n3 < n; ++n3) {
                int n4 = this.kpa ? n3 * hgt.koZ.rmN : 0;
                int n5 = this.kpa ? 0 : n3 * hgt.koZ.H;
                hgu hgu2 = new hgu(this.dXw, null, new lgg(n4, n5), koZ, this);
                this.j(hgu2);
                hguArray[n3] = hgu2;
            }
        }
        this.kpb = hguArray;
        this.fDE = n;
        this.adjustSize();
    }

    private void adjustSize() {
        lhf lhf2 = heq.b(this.dXw, this.kpa);
        this.cqt().d(lhf2);
        this.cqt().cqt().a((hms)this.cqt(), 3000.0f);
        lhf lhf3 = this.kpa ? new lhf(hgt.koZ.rmN * this.fDE, hgt.koZ.H) : new lhf(hgt.koZ.rmN, hgt.koZ.H * this.fDE);
        this.jHl.d(lhf3);
    }

    private void a(gpr gpr2) {
        if (this.knm == null) {
            return;
        }
        if (gpr2.alW == null || gpr2.alW.gZb == null || gpr2.alW.gZe == null) {
            gpq gpq2 = (gpq)this.knm.getMessageDelegator().h(11011, this.knm.getGUID(), lcr.qzp);
            this.knm.getMessageDelegator().E(gpq2);
            return;
        }
        this.dAu = gpr2.alW.gZb;
        this.kpc = gpr2.alW.gZe;
        dxq dxq2 = (fvp)this.knm.getMessageDelegator().h(12289, this.knm.getGUID(), this.dAu);
        dxq2.iTm = 1;
        dxq2.dTe = 1;
        this.knm.getMessageDelegator().E(dxq2);
        dxq2 = (flr)this.knm.getMessageDelegator().h(7944, this.knm.getGUID(), this.dAu);
        this.knm.getMessageDelegator().E(dxq2);
    }

    private void c(fvt fvt2) {
        if (this.knm == null) {
            return;
        }
        if (fvt2.dTe == 1 && this.dAu != null) {
            flr flr2 = (flr)this.knm.getMessageDelegator().h(7944, this.knm.getGUID(), this.dAu);
            this.knm.getMessageDelegator().E(flr2);
        }
    }

    private void a(fls fls2) {
        if (this.dAu != null && fls2.aO().equals(this.dAu)) {
            this.kpe.clear();
            this.kpd.clear();
            for (bsf bsf2 : fls2.iPx.values()) {
                if (bsf2 == null || !(bsf2 instanceof bsh)) continue;
                bsh bsh2 = (bsh)bsf2;
                int n = bsh2.vf() != 0 ? bsh2.vf() : 1;
                boolean bl = this.kpc != null && bsh2.AW().equals(this.kpc);
                Map<Integer, Integer> map = bl ? this.kpe : this.kpd;
                Integer n2 = map.get(bsh2.az());
                n2 = n2 == null ? Integer.valueOf(n) : Integer.valueOf(n2 + n);
                map.put(bsh2.az(), n2);
            }
            for (int i = 0; i < this.kpb.length; ++i) {
                this.kpb[i].cjT();
            }
        }
    }

    int Mv(int n) {
        Integer n2 = this.kpd.get(n);
        if (n2 == null) {
            return 0;
        }
        return n2;
    }

    int Mw(int n) {
        Integer n2 = this.kpe.get(n);
        if (n2 == null) {
            return 0;
        }
        return n2;
    }

    @Override
    public boolean a(lfu lfu2) {
        int n;
        if (lfu2.eqA()) {
            for (n = 0; n < this.fDE; ++n) {
                this.kpb[n].l(lfu2.ad("Item" + n, -1));
            }
        }
        if (lfu2.eqB()) {
            for (n = 0; n < this.fDE; ++n) {
                lfu2.ad("Item" + n, this.kpb[n].az());
            }
        }
        return true;
    }

    @Override
    public boolean a(ba ba2) {
        return false;
    }

    @Override
    public boolean m(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11012: {
                this.a((gpr)dxq2);
                return true;
            }
            case 12291: {
                this.c((fvt)dxq2);
                return true;
            }
            case 7945: {
                this.a((fls)dxq2);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean a(kcz kcz2) {
        return false;
    }

    @Override
    public boolean a(kgz kgz2) {
        return false;
    }

    @Override
    public boolean a(ktf ktf2) {
        return false;
    }

    @Override
    public boolean b(ktv ktv2) {
        return false;
    }

    static /* synthetic */ void a(hgt hgt2) {
        hgt2.cjR();
    }

    static /* synthetic */ void b(hgt hgt2) {
        hgt2.adjustSize();
    }
}

