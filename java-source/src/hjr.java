/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class hjr {
    public static final boolean kAq = true;
    public static final float kAr = 2.0f;
    public static final boolean kAs = false;
    public static final lfo ct = hbe.jAM;
    public final hel kaV = new hel();
    private final ldl kAt = new ldl();
    private final lha<dxq, dxq> cdh;
    private final Map<ldv, hee> kAu = new HashMap<ldv, hee>();
    private final Collection<hee> kAv = Collections.unmodifiableCollection(this.kAu.values());
    public final hef kAw;
    public final heg kAx;
    private final ldv kAy;
    private final lbd kyy;
    public final lbh kAz;
    private final lbi<gnx> kAA = new lbi<gnx>(this){
        final /* synthetic */ hjr kAH;
        {
            this.kAH = hjr2;
        }

        public void a(gnx gnx2) {
            this.kAH.a(gnx2.aO(), gnx2.aXQ, gnx2.jnu, gnx2.dAu, gnx2.big, gnx2.dBu, gnx2.jnt);
        }

        public /* synthetic */ void m(Object object) {
            this.a((gnx)object);
        }
    };
    private final lbi<gnv> kAB = new lbi<gnv>(this){
        final /* synthetic */ hjr kAH;
        {
            this.kAH = hjr2;
        }

        public void b(gnv gnv2) {
            hjr.a(this.kAH, gnv2.aO(), gnv2.aXQ);
        }

        public /* synthetic */ void m(Object object) {
            this.b((gnv)object);
        }
    };
    private boolean jLT;
    private ldv kAC;
    private heg kAD;
    private hdu kAE;
    private heg kAF;
    private final ldl kAG = new ldl();

    public final void a(ldv ldv2, ldv ldv3, bqm.b b2, ldv ldv4, bqm.b b3, lip lip2, ldv ldv5) {
        Object object;
        assert (bqm.b.isValidRootInventoryType(b2));
        hee hee2 = this.af(ldv2, ldv3);
        if (hee2 != null) {
            if (!hee2.kdC.kdD.dbx.equals(ldv4)) {
                hee2.dispose();
                hee2 = null;
            } else {
                if (hee2.kdF != b3) {
                    return;
                }
                if (hee2.kdC.kdF != b2) {
                    return;
                }
            }
        }
        if (hee2 == null) {
            hdz hdz2;
            object = this.ag(ldv2, ldv4);
            if (object == null) {
                if (b2 == bqm.b.dEp) {
                    if (this.kAD != null) {
                        this.b(this.kAD);
                        this.kAD.dispose();
                        this.kAD = null;
                    }
                    hdz2 = this.kaV.a(ldv4, hel.a.kem);
                    hdz hdz3 = this.kaV.a(this.kyy.caL(), hel.a.kem);
                    this.kAD = object = new heg(null, this.cdh, this, hdz2, hdz3, b2, lip2, "Clan Vault Root");
                } else {
                    hdz2 = this.kaV.a(ldv4, hel.a.kem);
                    hdz hdz4 = this.kaV.a(this.kyy.caL(), hel.a.kem);
                    object = new heg(null, this.cdh, this, hdz2, hdz4, b2, lip2, "Unknown Root");
                }
            }
            hdz2 = this.kaV.a(ldv3, hel.a.kel);
            hee2 = new hee(lip2 == null ? "" : lip2.esy(), this.cdh, this, (heg)object, hdz2, hdz2, b3, lip2, false);
        }
        object = this.kaV.a(ldv5, hel.a.kem);
        hee2.c((hdz)object);
    }

    private void b(heg heg2) {
        ArrayList<hee> arrayList = new ArrayList<hee>();
        for (hee hee2 : this.kAu.values()) {
            if (hee2.kdC != heg2) continue;
            arrayList.add(hee2);
        }
        for (hee hee2 : arrayList) {
            if (!this.kAu.containsKey(hee2.kdD.dbx)) continue;
            hee2.dispose();
            assert (!this.kAu.containsKey(hee2.kdD.dbx));
        }
    }

    public hjr(lha<dxq, dxq> lha2, lbd lbd2, ldv ldv2, ldv ldv3, lbh lbh2) {
        this.cdh = lha2;
        this.kyy = lbd2;
        this.kAy = ldv2;
        this.kAz = lbh2;
        this.jLT = true;
        hdz hdz2 = this.kaV.a(ldv2, hel.a.kem);
        hdz hdz3 = this.kaV.a(lcr.qCG, hel.a.kem);
        this.kAw = new hef(null, this.cdh, this, hdz2, hdz3, bqm.b.dEn, null, "Character");
        this.kAw.c(this.kAw.kdD);
        hdz2 = this.kaV.a(ldv3, hel.a.kem);
        hdz3 = this.kaV.a(lcr.qCI, hel.a.kem);
        this.kAx = new heg(null, this.cdh, this, hdz2, hdz3, bqm.b.dEo, null, "Bank");
        this.kAx.c(this.kAx.kdD);
        this.mU(true);
    }

    public void dispose() {
        assert (this.jLT);
        this.kAx.dispose();
        this.kAw.dispose();
        ArrayList<hee> arrayList = new ArrayList<hee>(this.kAu.values());
        for (hee hee2 : arrayList) {
            if (hee2.isActive()) {
                hee2.cfe();
            }
            hee2.dispose();
        }
        assert (this.kAu.isEmpty());
        this.mU(false);
        assert (this.kAt.isEmpty());
        this.jLT = false;
    }

    public final lbl<lbn> cok() {
        return this.kAt;
    }

    public final Collection<hee> col() {
        assert (this.jLT);
        return this.kAv;
    }

    public final void a(boolean bl, hee hee2) {
        assert (this.jLT);
        if (bl) {
            if (hee2.kdF == bqm.b.dEp) {
                this.a(hee2.kdF, hee2 instanceof heg);
            }
            if (hee2.kdF == bqm.b.dEr) {
                this.a(hee2.kdF, hee2 instanceof heg);
            }
            if (hee2.kdF == bqm.b.dEq) {
                this.a(hee2.kdF, hee2 instanceof heg);
            }
            hee hee3 = this.kAu.put(hee2.kdE.dbx, hee2);
            assert (hee3 == null);
        } else {
            hee hee4 = this.kAu.remove(hee2.kdE.dbx);
            assert (hee4 == hee2);
        }
        this.kAt.enp();
    }

    public final hee af(ldv ldv2, ldv ldv3) {
        ldv ldv4 = this.ah(ldv2, ldv3);
        if (ldv4 == null) {
            return null;
        }
        hee hee2 = this.kAu.get(ldv4);
        if (hee2 == null) {
            return null;
        }
        assert (ldv3 == null || hee2.kdD.dbx.equals(ldv3));
        assert (hee2.kdE.dbx.equals(ldv4));
        return hee2;
    }

    public final heg ag(ldv ldv2, ldv ldv3) {
        hee hee2 = this.af(ldv2, ldv3);
        if (hee2 == null) {
            return null;
        }
        return hee2.kdC;
    }

    public final void ra(ldv ldv2) {
        this.kAC = ldv2;
    }

    private ldv ah(ldv ldv2, ldv ldv3) {
        if (ldv2.equals(this.kAy)) {
            assert (ldv3 == null);
            return lcr.qCG;
        }
        if (ldv2.equals(this.kAC)) {
            assert (ldv3 == null);
            return this.kAC;
        }
        if (ldv3 == null) {
            // empty if block
        }
        return ldv3;
    }

    private void a(bqm.b b2, boolean bl) {
        hee hee2 = null;
        for (hee hee3 : this.kAu.values()) {
            if (hee3.kdF != b2 || hee3 instanceof heg != bl) continue;
            hee2 = hee3;
            break;
        }
        if (hee2 != null) {
            hee2.dispose();
        }
    }

    private static int MY(int n) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int n2 = random.nextInt(n);
        ct.debug("" + n2);
        return n2;
    }

    private void ai(ldv ldv2, ldv ldv3) {
        hee hee2 = this.af(ldv2, ldv3);
        if (hee2 == null) {
            return;
        }
        if (!hee2.isActive()) {
            return;
        }
        hee2.cfg();
        if (hee2.kdE != null && hee2.kdE.dbx != null && hee2.kdE.dbx.enw() == lcr.acL.enw()) {
            this.kyy.qR(hee2.kdE.dbx);
        }
    }

    public final lbl<lbn> com() {
        return this.kAG;
    }

    public final hdu con() {
        assert (this.kAE != null);
        return this.kAE;
    }

    public final heg coo() {
        assert (this.kAE != null);
        return this.kAF;
    }

    public final void a(heg heg2, hdu hdu2) {
        assert (hdu2 != null);
        assert (heg2 != null);
        this.kAE = hdu2;
        this.kAF = heg2;
        this.kAG.enp();
        this.kAE = null;
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, gnx.class, this.kAA);
        this.cdh.rex.a(bl, gnv.class, this.kAB);
    }

    static /* synthetic */ void a(hjr hjr2, ldv ldv2, ldv ldv3) {
        hjr2.ai(ldv2, ldv3);
    }
}

