/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  iet
 *  lcr
 */
import java.util.Map;
import java.util.Set;

public class hxd
extends btk
implements bto {
    private final hxb ljk;
    private final ldv jnt;
    private final ldv aXQ;
    private final ldv ljl;
    private final bqm.b ljm;
    private final bqm.b ljn;
    private final Map<ldv, bsh> ljo = lcn.emw();
    private final Map<ldv, Integer> ljp = lcn.emw();
    private inr ljq = null;
    private final Set<hxe> ljr = lcn.emx();
    float ljs = 0.0f;

    public hxd(hxb hxb2, ldv ldv2, ldv ldv3, ldv ldv4, bqm.b b2, bqm.b b3) {
        this.ljk = hxb2;
        this.jnt = ldv2;
        this.aXQ = ldv3;
        this.ljl = ldv4;
        this.ljm = b2;
        this.ljn = b3;
    }

    public String cgK() {
        return this.ljm.toString();
    }

    @Override
    public void initialize() {
        super.initialize();
        dxq dxq2 = (fvp)this.MessageDelegator.h(12289, this.getGUID(), this.jnt);
        dxq2.iTm = 1;
        dxq2.dTe = 1;
        this.MessageDelegator.E(dxq2);
        dxq2 = (flr)this.MessageDelegator.h(7944, this.getGUID(), this.jnt);
        this.MessageDelegator.F(dxq2);
    }

    @Override
    public void cleanUp() {
        for (bsh bsh2 : this.cCO().values()) {
            this.ljk.b(this, bsh2);
            for (hxe hxe2 : this.ljr) {
                hxe2.C(bsh2);
            }
        }
        if (this.ljn == bqm.b.dEn) {
            for (bsh bsh2 : this.cCO().values()) {
                if (hso.cxK() == null || hso.cxK().cxP() == null || hso.cxK().cxP().cyZ() == null) continue;
                hso.cxK().cxP().cyZ().b(bsh2, this);
            }
        }
        super.cleanUp();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7945: {
                this.a((fls)dxq2);
                break;
            }
            case 12291: {
                this.c((fvt)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public final bsh ro(ldv ldv2) {
        return this.ljo.get(ldv2);
    }

    void Ch() {
        this.show();
    }

    void Ci() {
        this.hide();
    }

    public boolean isOpen() {
        return this.ljq != null;
    }

    public void hide() {
        if (this.ljq != null) {
            this.ljq.setVisible(false);
            this.MessageDelegator.hd(this.ljq.getGUID());
            this.ljq = null;
        }
    }

    public void show() {
        if (this.ljq == null) {
            this.ljq = new inr(this);
            this.ljq.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a((amf)((Object)this.ljq));
            for (ldv ldv2 : this.ljo.keySet()) {
                this.ljq.rD(ldv2);
            }
        }
    }

    public void rp(ldv ldv2) {
        if (this.cCN() == bqm.b.dEn) {
            hso.cxK().cxP().cyZ().rh(ldv2);
        }
        flt flt2 = (flt)this.MessageDelegator.h(7959, this.getGUID(), this.ljl);
        flt2.aCK = ldv2;
        this.MessageDelegator.F(flt2);
    }

    private Set<ldv> a(Set<ldv> set, ldv ldv2) {
        if (set == null) {
            set = lcn.emx();
        }
        set.add(ldv2);
        return set;
    }

    private void c(fvt fvt2) {
        if (fvt2.dTe == 1 && this.jnt != null) {
            flr flr2 = (flr)this.MessageDelegator.h(7944, this.getGUID(), this.jnt);
            this.MessageDelegator.E(flr2);
        }
    }

    private boolean b(bsh bsh2, bsh bsh3) {
        int n;
        if (bsh2.AT() != bsh3.AT()) {
            return false;
        }
        if (bsh2.awD() != bsh3.awD()) {
            return false;
        }
        if (!bsh2.AW().equals(bsh3.AW())) {
            return false;
        }
        if (bsh2.vf() != bsh3.vf()) {
            return false;
        }
        int n2 = bsh2.arJ() == null ? 0 : bsh2.arJ().length;
        int n3 = n = bsh3.arJ() == null ? 0 : bsh3.arJ().length;
        if (n2 != n) {
            return false;
        }
        for (int i = 0; i < n2; ++i) {
            if (bsh2.arJ()[i].equals(bsh3.arJ()[i])) continue;
            return false;
        }
        return true;
    }

    private void a(fls fls2) {
        bsf bsf2;
        Set<ldv> set = null;
        Set<ldv> set2 = null;
        Set<ldv> set3 = null;
        if (fls2.iPx == null) {
            fls2.iPx = lcn.emw();
        }
        for (ldv ldv2 : fls2.iPx.keySet()) {
            bsh bsh2;
            bsf2 = fls2.iPx.get(ldv2);
            if (!(bsf2 instanceof bsh) || !ldv.au((bsh2 = (bsh)bsf2).AW(), this.aXQ)) continue;
            bsh bsh3 = this.ljo.get(ldv2);
            if (bsh3 == null) {
                set = this.a(set, ldv2);
                continue;
            }
            if (this.b(bsh3, bsh2)) continue;
            set3 = this.a(set3, ldv2);
        }
        for (ldv ldv2 : this.ljo.keySet()) {
            bsf2 = fls2.iPx.get(ldv2);
            if (bsf2 == null) {
                set2 = this.a(set2, ldv2);
                continue;
            }
            if (!(bsf2 instanceof bsh)) {
                set2 = this.a(set2, ldv2);
                continue;
            }
            if (ldv.au(((bsh)bsf2).AW(), this.ljo.get(ldv2).AW())) continue;
            set2 = this.a(set2, ldv2);
        }
        if (set2 != null) {
            for (ldv ldv2 : set2) {
                this.rq(ldv2);
            }
        }
        if (set3 != null) {
            for (ldv ldv2 : set3) {
                this.a(ldv2, (bsh)fls2.iPx.get(ldv2));
            }
        }
        if (set != null) {
            for (ldv ldv2 : set) {
                this.b(ldv2, (bsh)fls2.iPx.get(ldv2));
            }
        }
        if (this.ljs != fls2.iPy) {
            this.ljs = fls2.iPy;
            this.ljk.ki(this.ljs);
        }
    }

    public void rq(ldv ldv2) {
        bsh bsh2 = this.ljo.remove(ldv2);
        if (bsh2 == null) {
            lfn.b(5, "SFInventoryView", "removeItem: Could not find item " + ldv2);
            assert (false);
            return;
        }
        if (this.ljq != null) {
            this.ljq.jd(ldv2);
        }
        for (hxe hxe2 : this.ljr) {
            hxe2.C(bsh2);
        }
        if (this.ljn == bqm.b.dEn) {
            hso.cxK().cxP().cyZ().b(bsh2, this);
        }
        this.ljk.b(this, bsh2);
    }

    private void a(ldv ldv2, bsh bsh2) {
        bsh bsh3 = this.ljo.remove(ldv2);
        if (bsh3 == null) {
            lfn.b(5, "SFInventoryView", "updateItem: Could not find item " + ldv2);
            assert (false);
            return;
        }
        this.ljo.put(ldv2, bsh2);
        if (this.ljq != null) {
            this.ljq.rE(ldv2);
        }
        for (hxe hxe2 : this.ljr) {
            hxe2.D(bsh2);
        }
        if (this.ljn == bqm.b.dEn) {
            hso.cxK().cxP().cyZ().c(bsh2, this);
        }
        this.ljk.a(this, bsh3, bsh2);
    }

    public void b(ldv ldv2, bsh bsh2) {
        if (this.ljo.containsKey(ldv2)) {
            lfn.b(5, "SFInventoryView", "addItem: Item " + ldv2 + " already exists");
            assert (false);
            return;
        }
        this.ljo.put(ldv2, bsh2);
        if (lea.enW().isDescendant(bsh2.az(), cug.fjP) && hso.cxK().cxP().cza().ri(bsh2.getGUID()) == null) {
            this.rp(ldv2);
        }
        if (this.ljq != null) {
            this.ljq.rD(ldv2);
        }
        for (hxe hxe2 : this.ljr) {
            hxe2.B(bsh2);
        }
        if (this.ljn == bqm.b.dEn) {
            hso.cxK().cxP().cyZ().a(bsh2, this);
        }
        this.ljk.a(this, bsh2);
    }

    public void af(ldv ldv2, int n) {
        bsh bsh2 = this.ljo.get(ldv2);
        if (bsh2 == null) {
            lfn.b(5, "SFInventoryView", "notifySlotChanged: Could not find item " + ldv2);
            assert (false);
            return;
        }
        this.ljp.put(ldv2, n);
        this.Active = true;
    }

    @Override
    public void doTick(ldz ldz2) {
        this.Active = false;
        if (!this.ljp.isEmpty()) {
            flh flh2 = (flh)this.MessageDelegator.h(8007, this.getGUID(), this.ljl);
            flh2.iPs = this.ljp.keySet().toArray(new ldv[this.ljp.size()]);
            flh2.iPt = new int[flh2.iPs.length];
            for (int i = 0; i < flh2.iPs.length; ++i) {
                flh2.iPt[i] = this.ljp.get(flh2.iPs[i]);
            }
            this.MessageDelegator.F(flh2);
            this.ljp.clear();
        }
    }

    public void a(ldv ldv2, hxd hxd2, boolean bl) {
        bsh bsh2;
        if (this.cCN() == bqm.b.dEn && hxd2.cCN() == bqm.b.dEn) {
            hso.cxK().cxP().cyZ().rh(ldv2);
        }
        if ((bsh2 = this.ljo.get(ldv2)) == null) {
            lfn.b(5, "SFInventoryView", "moveItemToView: Could not find item " + ldv2);
            return;
        }
        int n = hxd2.cCP();
        if (n == -1) {
            n = 0;
        }
        iet.a((bsh)bsh2, (int)(n + 1024), (hxd)this);
        if (!hxd2.alX().mf(bsh2.az()) && cug.ws((int)bsh2.az())) {
            return;
        }
        flz flz2 = (flz)this.MessageDelegator.h(7960, this.getGUID(), this.ljl);
        flz2.gLy = this.aXQ;
        flz2.iPE = ldv2;
        flz2.iPF = hxd2.ljl;
        flz2.gLz = hxd2.aXQ;
        flz2.iPH = hxd2.aXQ;
        flz2.iPG = hxd2.cCN().ordinal();
        flz2.gLw = bl;
        this.MessageDelegator.F(flz2);
    }

    public void a(ldv ldv2, hxd hxd2, ldv ldv3, int n) {
        fme fme2 = (fme)this.MessageDelegator.h(7969, hso.cxK().cxP().getGUID(), this.ljl);
        fme2.ilu = 1;
        fme2.gLy = this.aXQ;
        fme2.iPE = ldv2;
        fme2.iPF = hxd2.ljl;
        fme2.gLz = hxd2.aXQ;
        fme2.iPQ = ldv3;
        fme2.sk(n);
        this.MessageDelegator.F(fme2);
    }

    public void a(ldv ldv2, hxd hxd2, ldv ldv3) {
        this.a(ldv2, hxd2, ldv3, -1);
    }

    public void a(hxe hxe2) {
        if (this.ljr.contains(hxe2)) {
            return;
        }
        this.ljr.add(hxe2);
        for (bsh bsh2 : this.ljo.values()) {
            hxe2.B(bsh2);
        }
    }

    public void b(hxe hxe2) {
        this.ljr.remove(hxe2);
    }

    public bqm.b alX() {
        return this.ljm;
    }

    public bqm.b cCN() {
        return this.ljn;
    }

    public Map<ldv, bsh> cCO() {
        return this.ljo;
    }

    public int cCP() {
        int n = -1;
        for (bsh bsh2 : this.ljo.values()) {
            int n2 = iet.F((bsh)bsh2);
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    public ldv cCQ() {
        return this.ljl;
    }

    public ldv AW() {
        return this.aXQ;
    }

    public float cCR() {
        return this.ljs;
    }

    public boolean rr(ldv ldv2) {
        return this.ljo.get(ldv2) != null;
    }

    public void cCS() {
        if (this.jnt == null) {
            return;
        }
        gnw gnw2 = (gnw)this.MessageDelegator.h(9987, lcr.acL, this.jnt);
        this.MessageDelegator.F(gnw2);
    }

    public void cCT() {
        for (hxd hxd2 : this.ljk.cCK().values()) {
            if (hxd2.cCN() != this.cCN()) continue;
            hxd2.cCS();
        }
    }
}

