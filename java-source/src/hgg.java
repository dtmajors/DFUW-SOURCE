/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.Map;

public class hgg
extends hpw
implements alz,
hhl.a,
hhp.a {
    private final ldv knk;
    private final boolean knl;
    private ama knm;
    private final hdm dXw;
    private hhl knn;
    private hhp kno;
    private hqy knp;
    private hqy knq;
    private hqy knr;
    private hpe kns;
    private brf knt;
    private dpg dAj;
    private lib knu;
    private Map<Integer, String> knv;
    private Map<dpi, Integer> knw;
    private Map<dpi, Integer> knx = lcn.emG();
    private Map<Integer, Integer> kny = lcn.emG();
    private lbn knz = new lbn(this){
        final /* synthetic */ hgg knF;
        {
            this.knF = hgg2;
        }

        public void W() {
            hgg.a(this.knF);
        }
    };
    private lbn knA = new lbn(this){
        final /* synthetic */ hgg knF;
        {
            this.knF = hgg2;
        }

        public void W() {
            hgg.b(this.knF);
        }
    };
    private lbn knB = new lbn(this){
        final /* synthetic */ hgg knF;
        {
            this.knF = hgg2;
        }

        public void W() {
            hgg.c(this.knF);
        }
    };
    private lbn knC = new lbn(this){
        final /* synthetic */ hgg knF;
        {
            this.knF = hgg2;
        }

        public void W() {
            hgg.d(this.knF);
        }
    };
    public static final int knD = 40;
    public static final int knE = 10;

    public hgg(hdm hdm2, String string, lgg lgg2, lhf lhf2, ldv ldv2, boolean bl) {
        super((hnc)hdm2, string, lgg2, lhf2, hdm2.kKk);
        this.dXw = hdm2;
        this.knk = ldv2;
        this.knl = bl;
        this.knm = new ama(this);
        lgs lgs2 = this.ciZ();
        this.knn = new hhl(this.dXw, lgs2.aI(), lgs2.cqv(), this.knl, this);
        this.j(this.knn);
        lgs2 = this.cja();
        this.kno = new hhp(this.dXw, lgs2.aI(), lgs2.cqv(), this.knl, this);
        this.j(this.kno);
        if (!this.knl) {
            this.knp = new hqy((hnc)this.dXw, "Button Buy", lgg.rlI, lhf.rnv, hpx.a.kXm, this.dXw.kJK, "Buy");
            this.j(this.knp);
            this.knq = new hqy((hnc)this.dXw, "Button Cancel", lgg.rlI, lhf.rnv, hpx.a.kXm, this.dXw.kJK, "Buy from bank");
            this.j(this.knq);
            this.knp.cvC().a(true, this.knz);
            this.knq.cvC().a(true, this.knA);
        } else {
            this.knr = new hqy((hnc)this.dXw, "Button Withdraw Gold", lgg.rlI, lhf.rnv, hpx.a.kXm, this.dXw.kJK, "Withdraw gold");
            this.j(this.knr);
            this.knr.cvC().a(true, this.knB);
        }
        this.kns = new hpe((hnc)hdm2, "Summary", lgg.rlI, lhf.rnv, this.dXw.kIC, "");
        this.j(this.kns);
        this.cje();
        if (this.knl) {
            this.knu = new lib(this.dXw.kNg, true);
            this.knu.esg().a(true, this.knC);
            this.knu.ee(0.5);
            this.knv = lcn.emw();
            this.knw = lcn.emw();
        }
    }

    private lgs ciZ() {
        lhf lhf2 = hhl.krZ.kLY;
        return new lgs(0, 0, lhf2.rmN + this.dXw.kJV.kYx.kLY.rmN, lhf2.H);
    }

    private lgs cja() {
        lhf lhf2 = hhp.krZ.kLY;
        lgs lgs2 = this.ciZ();
        return new lgs(0, lgs2.cjG(), lgs2.rmN, lhf2.H);
    }

    private lgs cjb() {
        lgs lgs2 = this.cja();
        return new lgs(0, lgs2.cjG(), lgs2.rmN, this.getHeight() - lgs2.cjG());
    }

    private lgs cjc() {
        lgs lgs2 = this.cjb();
        int n = 5;
        int n2 = 120;
        int n3 = lgs2.H - 2 * n;
        int n4 = this.getWidth() - n2 - 5;
        return new lgs(n4, lgs2.cg + n, n2, n3);
    }

    private lgs cjd() {
        lgs lgs2 = this.cjc();
        int n = lgs2.cg;
        int n2 = 100;
        int n3 = lgs2.H;
        int n4 = lgs2.cf - n2 - 5;
        return new lgs(n4, n, n2, n3);
    }

    private void cje() {
        this.knn.j(this.ciZ());
        this.kno.j(this.cja());
        if (this.knq != null) {
            this.knq.j(this.cjc());
        }
        if (this.knp != null) {
            this.knp.j(this.cjd());
        }
        if (this.knr != null) {
            this.knr.j(this.cjc());
        }
        if (this.knl) {
            lgs lgs2 = this.cjb();
            lgs lgs3 = this.cjc();
            lgs2.rmN = lgs3.cf - lgs2.cf;
            this.kns.h(lgs2.cf + 5, lgs2.cg + 2, lgs2.rmN - 10, lgs2.H - 4);
        } else {
            lgs lgs4 = this.cjb();
            lgs lgs5 = this.cjd();
            lgs4.rmN = lgs5.cf - lgs4.cf;
            this.kns.h(lgs4.cf + 5, lgs4.cg + 2, lgs4.rmN - 10, lgs4.H - 4);
        }
    }

    @Override
    protected boolean LM(int n) {
        lgs lgs2;
        if (super.LM(n)) {
            return true;
        }
        lgg lgg2 = this.kLu.cqu();
        lgs lgs3 = this.knn.i(new lgs(lgg.rlI, this.knn.cqv()));
        if (lgs3.A(lgg2)) {
            this.knn.LM(n);
            return true;
        }
        if (this.kno != null && (lgs2 = this.kno.i(new lgs(lgg.rlI, this.kno.cqv()))).A(lgg2)) {
            this.kno.LM(n);
            return true;
        }
        return false;
    }

    @Override
    public void cce() {
        super.cce();
        this.cje();
    }

    @Override
    public void FF() {
        super.FF();
        this.knm.Eu();
        fkc fkc2 = (fkl)this.knm.getMessageDelegator().h(11798, this.knm.getGUID(), this.knk);
        fkc2.imB = true;
        this.knm.getMessageDelegator().F(fkc2);
        fkc2 = (fkj)this.knm.getMessageDelegator().h(11796, this.knm.getGUID(), this.knk);
        ((fkj)fkc2).iOE = 5;
        if (this.knl) {
            ((fkj)fkc2).iOE |= 0xA;
        }
        this.knm.getMessageDelegator().F(fkc2);
    }

    @Override
    public void FG() {
        if (this.knl) {
            this.knu.stop();
            this.knu.esg().a(false, this.knC);
            this.knu = null;
            this.cjk();
        }
        if (this.knp != null) {
            this.knp.cvC().a(false, this.knz);
        }
        if (this.knq != null) {
            this.knq.cvC().a(false, this.knA);
        }
        fkl fkl2 = (fkl)this.knm.getMessageDelegator().h(11798, this.knm.getGUID(), this.knk);
        fkl2.imB = false;
        this.knm.getMessageDelegator().F(fkl2);
        this.knm.Ev();
        super.FG();
    }

    private brm qW(ldv ldv2) {
        brm brm2;
        if (ldv2 == null) {
            return null;
        }
        if (this.knt != null && (brm2 = this.knt.iF(ldv2)) != null) {
            return brm2;
        }
        return null;
    }

    private void cjf() {
        if (this.knl) {
            if (this.knr == null) {
                return;
            }
            this.knr.og(this.dAj.brW() == 0);
        } else {
            if (this.knp == null && this.knq == null) {
                return;
            }
            boolean bl = false;
            for (int i = 0; i < 20; ++i) {
                if (!this.kno.MC(i)) continue;
                bl = true;
            }
            this.knp.og(!bl);
            this.knq.og(!bl);
        }
    }

    private long aj(long l) {
        long l2 = l / 10L;
        if (l % 10L != 0L) {
            ++l2;
        }
        return l2;
    }

    private void cjg() {
        if (this.knl) {
            String string;
            long l = 0L;
            long l2 = 0L;
            for (int i = 0; i < 10; ++i) {
                for (int j = 0; j < 20; ++j) {
                    dph dph2 = this.dAj.b(new dpi(i, j));
                    if (dph2 == null) continue;
                    int n = Math.max(0, dph2.brZ());
                    if (dph2.auW()) {
                        l += (long)dph2.vf();
                        l2 += (long)(n * dph2.vf());
                        continue;
                    }
                    ++l;
                    l2 += (long)n;
                }
            }
            if (l == 0L) {
                string = "No items for sale.";
            } else {
                string = "Items for sale: " + l + "\n";
                string = "Total price: " + this.aj(l2);
            }
            if (this.dAj.brW() > 0) {
                string = string + "\nThere's " + this.dAj.brW() + " gold for you to withdraw";
            }
            this.kns.mV(string);
        } else {
            String string;
            int n = this.knn.getSelectedIndex();
            long l = 0L;
            long l3 = 0L;
            if (n >= 0) {
                for (int i = 0; i < 20; ++i) {
                    dph dph3;
                    if (!this.kno.MC(i) || (dph3 = this.dAj.b(new dpi(n, i))) == null) continue;
                    l += (long)this.kno.MD(i);
                    l3 += (long)(this.kno.MD(i) * dph3.brZ());
                }
            }
            if (l == 0L) {
                string = "No items selected";
            } else {
                long l4 = this.aj(l3);
                long l5 = dpk.X(l4);
                string = "Items selected: " + l + "\n";
                string = string + "Total price: " + l4 + "\n";
                string = string + "Buy from bank price: " + (l4 + l5);
            }
            this.kns.mV(string);
        }
    }

    private void nt(boolean bl) {
        int n = this.knn.getSelectedIndex();
        int n2 = 0;
        if (n >= 0) {
            for (int i = 0; i < 20; ++i) {
                if (!this.kno.MC(i) || this.kno.MD(i) <= 0) continue;
                ++n2;
            }
        }
        if (n2 == 0) {
            this.cjf();
            this.cjg();
            return;
        }
        fke fke2 = (fke)this.knm.getMessageDelegator().h(11799, this.knm.getGUID(), this.knk);
        fke2.iOw = bl;
        fke2.iOx = new dpi[n2];
        fke2.iOy = new int[n2];
        fke2.iIY = new int[n2];
        fke2.bqd = new int[n2];
        int n3 = 0;
        for (int i = 0; i < 20; ++i) {
            if (!this.kno.MC(i) || this.kno.MD(i) <= 0) continue;
            dpi dpi2 = new dpi(n, i);
            dph dph2 = this.dAj.b(dpi2);
            if (dph2 == null) {
                this.cjf();
                this.cjg();
                return;
            }
            fke2.iOx[n3] = dpi2;
            fke2.iOy[n3] = dph2.brZ();
            fke2.iIY[n3] = this.kno.MD(i);
            fke2.bqd[n3] = dph2.az();
            ++n3;
        }
        if (n3 != n2) {
            return;
        }
        this.knm.getMessageDelegator().E(fke2);
    }

    private void cjh() {
        this.nt(false);
    }

    private void cji() {
        this.nt(true);
    }

    private void cjj() {
        fkq fkq2 = (fkq)this.knm.getMessageDelegator().h(11801, this.knm.getGUID(), this.knk);
        this.knm.getMessageDelegator().F(fkq2);
    }

    private void x(int n, String string) {
        if (!this.knl) {
            assert (false);
            return;
        }
        this.knv.put(n, string);
    }

    private void c(dpi dpi2, int n) {
        if (!this.knl) {
            assert (false);
            return;
        }
        this.knw.put(dpi2, n);
    }

    private void cjk() {
        Integer n;
        fko fko2;
        if (!this.knl) {
            assert (false);
            return;
        }
        if (!this.knw.isEmpty()) {
            for (dpi comparable : this.knw.keySet()) {
                fko2 = (fko)this.knm.getMessageDelegator().h(11792, this.knm.getGUID(), this.knk);
                fko2.ija = 5;
                fko2.gMv = comparable;
                fko2.iOP = this.knw.get(comparable);
                this.knm.getMessageDelegator().F(fko2);
                n = this.knx.get(comparable);
                if (n == null) {
                    n = 0;
                }
                this.knx.put(comparable, n + 1);
            }
            this.knw.clear();
        }
        if (!this.knv.isEmpty()) {
            for (Integer n2 : this.knv.keySet()) {
                fko2 = (fko)this.knm.getMessageDelegator().h(11792, this.knm.getGUID(), this.knk);
                fko2.ija = 1;
                fko2.iOM = n2;
                fko2.iON = this.knv.get(n2);
                this.knm.getMessageDelegator().F(fko2);
                n = this.kny.get(fko2.iOM);
                if (n == null) {
                    n = 0;
                }
                this.kny.put(fko2.iOM, n + 1);
            }
            this.knv.clear();
        }
    }

    private void cjl() {
        this.cjk();
    }

    private void cjm() {
        this.kno.Mz(0);
        this.knn.Mz(10);
        for (int i = 0; i < 10; ++i) {
            this.knn.A(i, this.dAj.Ba(i));
            this.knn.M(i, this.knl || this.dAj.AZ(i));
        }
        this.cjn();
    }

    private void cjn() {
        int n = this.knn.getSelectedIndex();
        this.kno.My(0);
        if (n < 0) {
            this.kno.Mz(0);
        } else {
            this.kno.Mz(20);
            for (int i = 0; i < 20; ++i) {
                dph dph2 = this.dAj.b(new dpi(n, i));
                if (dph2 == null) {
                    this.kno.MB(i);
                } else {
                    this.kno.i(dph2);
                }
                this.kno.N(i, false);
            }
        }
        this.cjf();
        this.cje();
        this.cjg();
    }

    private void y(int n, String string) {
        this.dAj.v(n, string);
        if (!this.kny.containsKey(n)) {
            this.knn.A(n, string);
        }
    }

    private void s(String string, int n) {
        this.dAj.o(string, n);
    }

    private void a(dpi dpi2, int n, ej[] ejArray, int n2, int n3, long l) {
        this.f(dpi2);
        dph dph2 = new dph(n, ejArray, n2, dpi2, n3);
        dph2.N(l);
        this.dAj.d(dph2);
        this.kno.i(dph2);
        this.cjg();
    }

    private void f(dpi dpi2) {
        this.dAj.c(dpi2);
        if (this.knl) {
            this.knx.remove(dpi2);
            this.knw.remove(dpi2);
        }
        if (dpi2.cDO == this.knn.getSelectedIndex()) {
            this.kno.MB(dpi2.gMx);
        }
        this.cjg();
    }

    private void a(dpi dpi2, int n, int n2, long l) {
        this.dAj.a(dpi2, n, n2);
        if (dpi2.cDO == this.knn.getSelectedIndex()) {
            this.kno.ct(dpi2.gMx, n);
        }
        if (!this.knx.containsKey(dpi2)) {
            this.kno.cs(dpi2.gMx, n2);
        }
        this.cjg();
    }

    private void a(fkk fkk2) {
        this.dAj = new dpg();
        this.dAj.b(fkk2);
        amf amf2 = this.knm.getMessageDelegator().bzx().bzt().d(fkk2.dxt);
        if (amf2 != null && amf2 instanceof brf) {
            this.knt = (brf)((Object)amf2);
        }
        this.cjm();
    }

    private void a(fkn fkn2) {
        switch (fkn2.ija) {
            case 1: {
                this.y(fkn2.iOM, fkn2.iON);
                break;
            }
            case 2: {
                this.s(fkn2.ResourceName, fkn2.iOO);
                break;
            }
            case 3: {
                this.a(fkn2.gMv, fkn2.ResourceType, fkn2.DR, fkn2.asi, fkn2.iOP, fkn2.dBq);
                break;
            }
            case 4: {
                this.f(fkn2.gMv);
                break;
            }
            case 5: {
                this.a(fkn2.gMv, fkn2.asi, fkn2.iOP, fkn2.dBq);
            }
        }
    }

    private void a(fkr fkr2) {
        if (fkr2.bQd() == boa.dwW) {
            this.dAj.Bb(0);
            this.cjf();
            this.cjg();
        }
    }

    private void a(fkp fkp2) {
        if (fkp2.ija == 1) {
            Integer n = this.kny.get(fkp2.iOM);
            if (n == null) {
                lfn.b(5, "SFComponentInteractionOwnedVendor", "handleInteractionOwnedVendorUpdateResponseMessage(): Unexpected response for category " + fkp2.iOM);
                return;
            }
            if (n > 1) {
                this.kny.put(fkp2.iOM, n - 1);
                return;
            }
            this.kny.remove(fkp2.iOM);
            if (!this.dAj.Ba(fkp2.iOM).equals(fkp2.iON)) {
                lfn.b(5, "SFComponentInteractionOwnedVendor", "handleInteractionOwnedVendorUpdateResponseMessage(): OVI CatName=" + this.dAj.Ba(fkp2.iOM) + " Message.CatName=" + fkp2.iON);
            }
            this.knn.A(fkp2.iOM, this.dAj.Ba(fkp2.iOM));
        } else if (fkp2.ija != 2 && fkp2.ija != 3 && fkp2.ija != 4 && fkp2.ija == 5) {
            Integer n = this.knx.get(fkp2.gMv);
            if (n == null) {
                lfn.b(5, "SFComponentInteractionOwnedVendor", "handleInteractionOwnedVendorUpdateResponseMessage(): Unexpected response for location " + fkp2.gMv);
                return;
            }
            if (n > 1) {
                this.knx.put(fkp2.gMv, n - 1);
                return;
            }
            this.knx.remove(fkp2.gMv);
        }
    }

    @Override
    public boolean a(ba ba2) {
        return false;
    }

    @Override
    public boolean m(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11797: {
                this.a((fkk)dxq2);
                return true;
            }
            case 11794: {
                this.a((fkn)dxq2);
                return true;
            }
            case 11793: {
                this.a((fkp)dxq2);
                return true;
            }
            case 11802: {
                this.a((fkr)dxq2);
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

    @Override
    public void z(int n, String string) {
        if (string.equals(this.dAj.Ba(n))) {
            return;
        }
        this.x(n, string);
    }

    @Override
    public void Mu(int n) {
        this.cjn();
    }

    @Override
    public void a(dph dph2, int n) {
        this.cjg();
        this.cjf();
    }

    @Override
    public void a(dph dph2, boolean bl) {
        this.cjg();
        this.cjf();
    }

    @Override
    public void b(dph dph2, int n) {
        fko fko2 = (fko)this.knm.getMessageDelegator().h(11792, this.knm.getGUID(), this.knk);
        fko2.ija = 2;
        fko2.ResourceName = dph2.pa();
        fko2.iOO = n;
        this.knm.getMessageDelegator().F(fko2);
        this.s(dph2.pa(), n);
    }

    @Override
    public void f(dph dph2) {
        fko fko2 = (fko)this.knm.getMessageDelegator().h(11792, this.knm.getGUID(), this.knk);
        fko2.ija = 4;
        fko2.gMv = dph2.brY();
        this.knm.getMessageDelegator().F(fko2);
    }

    @Override
    public void H(int n, ldv ldv2) {
        fko fko2 = (fko)this.knm.getMessageDelegator().h(11792, this.knm.getGUID(), this.knk);
        fko2.ija = 3;
        fko2.gMv = new dpi(this.knn.getSelectedIndex(), n);
        fko2.aCK = ldv2;
        brm brm2 = this.qW(ldv2);
        if (brm2 != null && brm2 instanceof bqs) {
            String string = ((bqs)brm2).pa();
            fko2.iOP = this.dAj.iT(string);
        } else {
            fko2.iOP = 0;
        }
        this.knm.getMessageDelegator().F(fko2);
    }

    @Override
    public void c(dph dph2, int n) {
        this.c(dph2.brY(), n);
    }

    @Override
    public void g(dph dph2) {
    }

    static /* synthetic */ void a(hgg hgg2) {
        hgg2.cjh();
    }

    static /* synthetic */ void b(hgg hgg2) {
        hgg2.cji();
    }

    static /* synthetic */ void c(hgg hgg2) {
        hgg2.cjj();
    }

    static /* synthetic */ void d(hgg hgg2) {
        hgg2.cjl();
    }
}

