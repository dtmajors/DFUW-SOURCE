/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class fj
extends btk
implements fz.a {
    private static Map<Integer, Boolean> QU = lcn.emw();
    private static Map<Integer, Boolean> QV = lcn.emw();
    private static Map<Integer, Boolean> QW = lcn.emw();
    private ldv QX = null;
    private Map<ldv, lfs<Integer, Integer>> QY = lcn.emw();
    private fs QZ = null;
    private ldv Ra = null;
    private dxq Rb = null;
    private final ik Rc;
    private int Rd;
    private Map<ldv, fz> Re = lcn.emw();
    private int Rf;
    private Map<ldv, a> Rg = lcn.emw();
    private Map<ldv, ldv> Rh = lcn.emw();
    private ldv Ri;
    private boolean Rj;
    private final boolean Rk;

    public fj(ik ik2) {
        this.Rc = ik2;
        this.Rd = 0;
        boolean bl = this.Rk = !this.Rc.afH && !lcw.enb();
        if (this.Rk) {
            this.QZ = new fs();
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        if (this.Rk) {
            kcq kcq2 = (kcq)this.MessageDelegator.i(266, this.getGUID(), lcr.qzc);
            kcq2.gNT = 0;
            kcq2.di = this.Rc.GUID.ib();
            kcq2.ev = ldv.rfd;
            kcq2.Ud = ldv.rfd;
            kcq2.pel = 5000;
            this.MessageDelegator.b(kcq2);
        }
    }

    @Override
    public void cleanUp() {
        if (this.QX != null) {
            kcq kcq2 = (kcq)this.MessageDelegator.i(266, ldv.rfd, new ldv(this.QX.ib(), 1800, 2));
            kcq2.gNT = 2;
            kcq2.di = this.Rc.GUID.ib();
            kcq2.ev = ldv.rfd;
            kcq2.Ud = this.QX;
            kcq2.pel = 5000;
            this.MessageDelegator.b(kcq2);
            this.QX = null;
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 267: {
                this.a((kcr)kcz2);
                return;
            }
            case 268: {
                this.a((kcp)kcz2);
                return;
            }
        }
        super.receiveMiddlewareMessage(kcz2);
    }

    private final void a(kcr kcr2) {
        if (!kcr2.eo) {
            return;
        }
        this.QX = kcr2.Ud;
    }

    private final void a(kcp kcp2) {
        assert (this.QZ != null);
        if (this.QZ.a(this.MessageDelegator.arc(), this.Rf, kcp2.pef, kcp2.peg, kcp2.pej, kcp2.peh, kcp2.pek, kcp2.pei)) {
            float f2 = this.QZ.hg();
            for (fz fz2 : this.Re.values()) {
                fz2.q(f2);
            }
        }
    }

    private ldv gO() {
        if (this.Rj) {
            return this.Ri;
        }
        if (this.Rc instanceof ii) {
            this.Ri = ((ii)this.Rc).gO();
            this.Rj = this.Ri != null;
        } else {
            this.Rj = true;
        }
        return this.Ri;
    }

    public final void a(ldv ldv2, dxq dxq2) {
        this.Ra = ldv2;
        this.Rb = dxq2;
        if (ldv2 != null && this.Rg.containsKey(ldv2)) {
            this.MessageDelegator.E(dxq2);
            this.Rb = null;
            this.Ra = null;
        }
    }

    public final void a(ldv ldv2, int n) {
        lfs<Integer, Integer> lfs2 = this.QY.remove(ldv2);
        if (lfs2 == null) {
            lfs2 = new lfs<Integer, Integer>(n, 0);
        }
        lfs2.reY = (Integer)lfs2.reY + 1;
        this.QY.put(ldv2, lfs2);
        this.a(null, ldv2, n);
    }

    public final void b(ldv ldv2, int n) {
        lfs<Integer, Integer> lfs2 = this.QY.remove(ldv2);
        if (lfs2 == null) {
            lfs2 = new lfs<Integer, Integer>(n, 0);
        }
        lfs2.reY = (Integer)lfs2.reY - 1;
        if ((Integer)lfs2.reY > 0) {
            this.QY.put(ldv2, lfs2);
        }
        this.b(null, ldv2, n);
    }

    public final ldv a(ldv ldv2, float f2, int n) {
        ga ga2 = new ga(ldv2, f2);
        ga2.a(this);
        ga2.setGUID(this.MessageDelegator.bzv());
        this.Re.put(ldv2, ga2);
        this.MessageDelegator.a(ga2);
        this.a(ldv2, n);
        return ga2.getGUID();
    }

    public final ldv a(ljq ljq2, float f2) {
        gb gb2 = new gb(ljq2, f2);
        gb2.a(this);
        gb2.setGUID(this.MessageDelegator.bzv());
        this.Re.put(gb2.getGUID(), gb2);
        this.MessageDelegator.a(gb2);
        return gb2.getGUID();
    }

    public final void P(ldv ldv2) {
        fz fz2 = this.Re.remove(ldv2);
        if (fz2 == null) {
            lfn.b(5, "SFAreaOfInterestNew", "removeAOI(): Could not find Engine AOI for " + ldv2);
            return;
        }
        fz2.hr();
        fz2.hs();
        fz2.b(this);
        this.MessageDelegator.hd(fz2.getGUID());
        this.MessageDelegator.oa(fz2.getGUID());
    }

    public final float gP() {
        if (this.Re.isEmpty()) {
            return 0.0f;
        }
        float f2 = 0.0f;
        for (fz fz2 : this.Re.values()) {
            f2 += fz2.getInnerRadius();
        }
        return f2 /= (float)this.Re.size();
    }

    public final void b(ldv ldv2, float f2) {
        fz fz2 = this.Re.get(ldv2);
        if (fz2 != null && fz2 instanceof gb) {
            gb gb2 = (gb)fz2;
            fz2.r(f2);
        }
    }

    public final void a(ldv ldv2, ljq ljq2) {
        fz fz2 = this.Re.get(ldv2);
        if (fz2 != null && fz2 instanceof gb) {
            gb gb2 = (gb)fz2;
            gb2.N(ljq2);
        }
    }

    public final boolean gQ() {
        return !this.Re.isEmpty();
    }

    public final void B(boolean bl) {
        Comparable<ldv> comparable;
        if (!this.Re.isEmpty()) {
            ArrayList<ldv> arrayList = lcn.abH(this.Re.size());
            arrayList.addAll(this.Re.keySet());
            Iterator object = arrayList.iterator();
            while (object.hasNext()) {
                comparable = (ldv)object.next();
                this.P((ldv)comparable);
            }
        }
        if (bl && !this.QY.isEmpty()) {
            for (ldv ldv2 : this.QY.keySet()) {
                comparable = this.QY.get(ldv2);
                for (int j = 0; j < (Integer)((lfs)comparable).reY; ++j) {
                    this.b(null, ldv2, (Integer)((lfs)comparable).reX);
                }
            }
            this.QY.clear();
        }
    }

    private void b(ldv ldv2, boolean bl) {
        ldv ldv3 = this.Q(ldv2);
        gog gog2 = (gog)this.MessageDelegator.h(21763, this.GUID, ldv3);
        gog2.adA = this.Rc.GUID;
        gog2.Rs = ldv2;
        gog2.adC = bl;
        this.MessageDelegator.F(gog2);
        if (!bl) {
            --this.Rd;
        }
    }

    private void c(ldv ldv2, boolean bl) {
        ldv ldv3 = this.Q(ldv2);
        gnz gnz2 = (gnz)this.MessageDelegator.h(21761, this.GUID, ldv3);
        gnz2.adA = this.Rc.GUID;
        gnz2.Tr = this.gO();
        gnz2.Rs = ldv2;
        gnz2.adC = bl;
        gnz2.adD = this.Rc.afH;
        gnz2.adE = this.Rc.nk();
        this.MessageDelegator.F(gnz2);
        if (!bl) {
            ++this.Rd;
        }
    }

    private ldv Q(ldv ldv2) {
        if (lcw.enb()) {
            return lcr.qAJ;
        }
        return lcr.ak((ldv)lcr.qAJ, (int)ldv2.ib());
    }

    private boolean bq(int n) {
        Boolean bl = QU.get(n);
        if (bl == null) {
            bl = lea.enW().isDescendant(n, cug.fgJ);
            QU.put(n, bl);
        }
        return bl;
    }

    private boolean br(int n) {
        Boolean bl = QV.get(n);
        if (bl == null) {
            bl = lea.enW().isDescendant(n, cug.fgH);
            QV.put(n, bl);
        }
        return bl;
    }

    private boolean bs(int n) {
        Boolean bl = QW.get(n);
        if (bl == null) {
            bl = lea.enW().isDescendant(n, cug.fgG);
            QW.put(n, bl);
        }
        return bl;
    }

    private void c(ldv ldv2, int n) {
        if (!this.bq(n)) {
            return;
        }
        if (this.Rc.afH) {
            return;
        }
        egc egc2 = (egc)this.MessageDelegator.h(2333, this.gO(), lcr.qAL);
        egc2.dvC = lcr.tQ((ldv)ldv2);
        egc2.ila = true;
        this.MessageDelegator.E(egc2);
    }

    private void d(ldv ldv2, int n) {
        if (!this.bq(n)) {
            return;
        }
        if (this.Rc.afH) {
            return;
        }
        egc egc2 = (egc)this.MessageDelegator.h(2333, this.gO(), lcr.qAL);
        egc2.dvC = lcr.tQ((ldv)ldv2);
        egc2.ila = false;
        this.MessageDelegator.E(egc2);
    }

    @Override
    public void a(fz fz2, ldv ldv2, int n) {
        Object object;
        boolean bl;
        if (lcw.enb() && !lcw.abY((int)ldv2.ib())) {
            return;
        }
        boolean bl2 = lcr.tR((ldv)ldv2) && cug.vM((int)n);
        boolean bl3 = bl = bl2 && this.Rc.me() != null && this.Rc.me().tV(ldv2);
        if (bl2 && !bl && !this.Rc.afH) {
            object = ldv2.bFk();
            ldv ldv3 = this.Rh.get(object);
            if (ldv3 != null) {
                a a2 = this.Rg.get(ldv3);
                int n2 = n;
                if (a2 == null) {
                    lfn.b(5, "SFAreaOfInterestNew", "notifyEngineAOIObjectAddition: Subscriber " + this.Rc + ": Didn't find AOIObjectInfo for existing mesh " + ldv3);
                } else {
                    n2 = a2.ResourceType;
                }
                this.b(fz2, ldv3, n2);
            }
            this.Rh.put((ldv)object, ldv2);
        }
        if ((object = this.Rg.get(ldv2)) == null) {
            object = new a(this, n);
            this.Rg.put(ldv2, (a)object);
            this.c(ldv2, false);
            this.c(ldv2, n);
            if (((a)object).Rn || ((a)object).Rm || ((a)object).Ro) {
                ++this.Rf;
            }
            if (this.Ra != null && this.Ra.equals(ldv2)) {
                this.MessageDelegator.E(this.Rb);
                this.Rb = null;
                this.Ra = null;
            }
        } else {
            ++((a)object).Rl;
        }
    }

    @Override
    public void b(fz fz2, ldv ldv2, int n) {
        boolean bl;
        if (lcw.enb() && !lcw.abY((int)ldv2.ib())) {
            return;
        }
        a a2 = this.Rg.get(ldv2);
        boolean bl2 = lcr.tR((ldv)ldv2) && cug.vM((int)n);
        boolean bl3 = bl = bl2 && this.Rc.me() != null && this.Rc.me().tV(ldv2);
        if (a2 == null) {
            if (!bl2 || bl) {
                lfn.b(5, "SFAreaOfInterestNew", "notifyEngineAOIObjectRemoval: Subscriber " + this.Rc + ": Got removal of non-existing object " + ldv2);
                assert (false);
            }
            return;
        }
        if (bl2 && !bl && !this.Rc.afH) {
            ldv ldv3 = ldv2.bFk();
            ldv ldv4 = this.Rh.get(ldv3);
            if (ldv4 == null) {
                lfn.b(5, "SFAreaOfInterestNew", "notifyEngineAOIObjectRemoval: Subscriber " + this.Rc + ": No PlayerMesh found for PlayerOS " + ldv3 + " when removing PlayerMesh " + ldv2);
            } else if (!ldv4.equals(ldv2)) {
                lfn.b(5, "SFAreaOfInterestNew", "notifyEngineAOIObjectRemoval: Subscriber " + this.Rc + ": Existing PlayerMesh " + ldv4 + " in PlayerOS " + ldv3 + " does not match removed PlayerMesh " + ldv2);
            } else {
                this.Rh.remove(ldv3);
            }
        }
        --a2.Rl;
        if (a2.Rl == 0) {
            this.b(ldv2, false);
            this.d(ldv2, n);
            this.Rg.remove(ldv2);
            if (a2.Rn || a2.Rm || a2.Ro) {
                --this.Rf;
            }
        }
    }

    @Override
    public void a(fz fz2, ldv ldv2) {
        if (lcw.enb() && !lcw.abY((int)ldv2.ib())) {
            return;
        }
        a a2 = this.Rg.get(ldv2);
        if (a2 == null) {
            a2 = new a(this, 0);
            this.Rg.put(ldv2, a2);
            this.c(ldv2, true);
        } else {
            ++a2.Rl;
        }
    }

    @Override
    public void b(fz fz2, ldv ldv2) {
        if (lcw.enb() && !lcw.abY((int)ldv2.ib())) {
            return;
        }
        a a2 = this.Rg.get(ldv2);
        if (a2 == null) {
            assert (false);
            return;
        }
        --a2.Rl;
        if (a2.Rl == 0) {
            this.b(ldv2, false);
            this.Rg.remove(ldv2);
        }
    }

    public int gR() {
        return this.Rd;
    }

    public int gS() {
        return this.Rf;
    }

    static /* synthetic */ boolean a(fj fj2, int n) {
        return fj2.bq(n);
    }

    static /* synthetic */ boolean b(fj fj2, int n) {
        return fj2.br(n);
    }

    static /* synthetic */ boolean c(fj fj2, int n) {
        return fj2.bs(n);
    }
}

