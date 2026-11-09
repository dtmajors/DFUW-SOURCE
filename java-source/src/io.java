/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  is
 *  lcr
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class io {
    public static final boolean bC = true;
    public final is Xb;
    public final gw aeX;
    public final ij agp;

    io(is is2) {
        this.Xb = is2;
        this.aeX = is2.aeX;
        this.agp = is2.agp;
    }

    private static final boolean b(aht aht2) {
        if (!(aht2 instanceof ahh)) {
            return false;
        }
        if (aht2 instanceof aib) {
            return false;
        }
        if (aht2 instanceof ahc) {
            ahc ahc2 = (ahc)aht2;
            if (lea.enW().isDescendant(ahc2.az(), cug.flz)) {
                return false;
            }
        }
        return true;
    }

    public final void c(aht aht2) {
        Object object;
        assert (aht2 != null);
        boolean bl = aht2 instanceof agy;
        if (bl && ((agy)(object = (agy)aht2)).Be() == 0) {
            return;
        }
        object = this.aeX.ax(aht2.getGUID().bFk());
        if (object == null) {
            return;
        }
        IdentityHashMap<ik, il> identityHashMap = this.aeX.az(aht2.getGUID().bFk());
        if (identityHashMap == null || identityHashMap.isEmpty()) {
            return;
        }
        boolean bl2 = !bl && aht2 instanceof agx;
        boolean bl3 = !bl && !bl2 && aht2 instanceof ahf;
        boolean bl4 = !bl && !bl2 && !bl3 && aht2 instanceof ahl;
        for (Map.Entry<ik, il> entry : identityHashMap.entrySet()) {
            agy agy2;
            ik ik2 = entry.getKey();
            il il2 = entry.getValue();
            if (il2.isIgnore()) continue;
            if (((ia)object).aeY) {
                if (bl2) {
                    continue;
                }
            } else if (!bl ? !bl3 && !bl4 : (agy2 = (agy)aht2).Be() != ik2.GUID.ib()) continue;
            if (!this.a(ik2, aht2, false, il2)) continue;
            this.Xb.a(ik2, aht2, il2, false);
        }
    }

    public final void d(aht aht2) {
        assert (aht2 != null);
        if (ahu.c.containsRelatedObjects(aht2.Bx())) {
            if (aht2 instanceof agx) {
                this.Xb.bz(aht2.getGUID());
            } else if (aht2 instanceof ahs) {
                ahs ahs2 = (ahs)aht2;
                this.Xb.g(ahs2.Bv().akX, aht2.getGUID());
            }
        }
        if (aht2.BG().isEmpty()) {
            return;
        }
        boolean bl = aht2 instanceof agx;
        if (bl) {
            return;
        }
        this.Xb.b(aht2, false);
    }

    public final void a(ahs ahs2) {
        assert (ahs2 != null);
        ldv ldv2 = ahs2.Bv().akX;
        agx agx2 = (agx)this.Xb.np().bd(ldv2);
        if (agx2 == null) {
            lfn.b(5, "SFSubscriptionLogic", "handleSpecialEffectStateObjectCreated(): Could not find MeshStateObject " + ldv2 + " for " + ahs2);
            assert (false);
            return;
        }
        if (!this.Xb.f(ldv2, ahs2.getGUID())) {
            lfn.b(5, "SFSubscriptionLogic", "handleSpecialEffectStateObjectCreated(): Could not associate " + ahs2 + " with " + ldv2 + " - already added");
        }
        for (ik ik2 : agx2.BG().keySet()) {
            this.a(ik2, ahs2);
        }
    }

    public final void a(ik ik2, gj gj2) {
        Map<ldv, Map<ldv, aht>> map = this.Xb.np().nL().nd();
        for (Map<ldv, aht> map2 : map.values()) {
            block5: for (aht aht2 : map2.values()) {
                Object object;
                id id2 = aht2.By();
                assert (id2 != null);
                if (id2.afj != gj2.Type) continue;
                switch (id2.afj) {
                    case 1: {
                        assert (aht2 instanceof agc);
                        assert (id2 instanceof if);
                        object = (if)id2;
                        gj gj3 = ((if)object).afn;
                        assert (gj3 != null);
                        if (gj2.equals(gj3)) break;
                        continue block5;
                    }
                    case 3: {
                        assert (aht2 instanceof ahf);
                        assert (id2 instanceof if);
                        object = (if)id2;
                        gj gj3 = ((if)object).afn;
                        assert (gj3 != null);
                        if (gj2.equals(gj3)) break;
                        continue block5;
                    }
                    default: {
                        return;
                    }
                }
                object = this.aeX.a(ik2, aht2.getGUID().bFk(), gw.a.Ym);
                ((il)object).bx(null);
                if (this.a(ik2, aht2, false, (il)object)) {
                    this.Xb.a(ik2, aht2, (il)object, true);
                }
                ((il)object).by(null);
            }
        }
    }

    public final void b(ik ik2, gj gj2) {
        Iterator<it> iterator = ik2.nl().values().iterator();
        ArrayList<it> arrayList = null;
        while (iterator.hasNext()) {
            it it2 = iterator.next();
            id id2 = it2.ahf.By();
            if (id2.afj != gj2.Type || id2.afj != 3) continue;
            assert (it2.ahf instanceof ahf);
            assert (id2 instanceof if);
            if if_ = (if)id2;
            gj gj3 = if_.afn;
            assert (gj3 != null);
            if (!gj2.equals(gj3)) continue;
            if (arrayList == null) {
                arrayList = lcn.emv();
            }
            arrayList.add(it2);
        }
        if (arrayList != null) {
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                this.Xb.c((it)arrayList.get(i), true);
            }
        }
    }

    private final void a(ik ik2, ahs ahs2) {
        if (ik2.afH) {
            return;
        }
        ldv ldv2 = ahs2.Bv().gfs;
        if (ldv2 != null && ldv2.equals(ik2.GUID)) {
            return;
        }
        il il2 = this.aeX.a(ik2, ahs2.getGUID().bFk());
        if (il2 != null && il2.isIgnore()) {
            return;
        }
        this.Xb.a(ik2, (aht)ahs2, il2, false);
    }

    private final void a(ik ik2, aht aht2) {
        Collection collection = this.Xb.bA(aht2.getGUID());
        if (collection == null || collection.isEmpty()) {
            return;
        }
        for (ldv ldv2 : collection) {
            ahs ahs2 = (ahs)this.Xb.np().bd(ldv2);
            if (ahs2 == null) continue;
            this.a(ik2, ahs2);
        }
    }

    public final void a(ii ii2) {
        ArrayList<it> arrayList = lcn.emv();
        for (it it2 : ii2.nl().values()) {
            if (ahu.c.skipRemoveWhenRemovingAOI(it2.ahf.Bx())) continue;
            arrayList.add(it2);
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            it it3 = (it)arrayList.get(i);
            if (!ii2.bs(it3.ahf.getGUID())) continue;
            this.Xb.c(it3, true);
        }
    }

    public final void a(ik ik2, aht aht2, boolean bl, gm gm2) {
        Object object;
        boolean bl2;
        if (ik2 == null) {
            lfn.b(5, "SFSubscriptionLogic", "handleAOIAddition: Subscriber is null. StateObject " + aht2);
            return;
        }
        if (aht2 == null) {
            lfn.b(5, "SFSubscriptionLogic", "handleAOIAddition: StateObject is null. Subscriber " + ik2);
            return;
        }
        if (aht2.getGUID() == null) {
            lfn.b(5, "SFSubscriptionLogic", "handleAOIAddition: StateObject.GUID is null. Subscriber " + ik2 + " StateObject " + aht2);
            return;
        }
        if (!ik2.afH && ik2.gO() == null) {
            lfn.b(5, "SFSubscriptionLogic", "handleAOIAddition: Subscriber.PSOGUID is null. Subscriber " + ik2 + " StateObject " + aht2);
            return;
        }
        boolean bl3 = bl2 = ik2 instanceof ii && (aht2.getGUID().tV(ik2.gO()) || aht2.getGUID().enw() == ik2.gO().enw() - 20000000) && aht2 instanceof aic;
        if (bl2) {
            object = null;
            for (it it2 : ik2.nl().values()) {
                if (!it2.ahf.getGUID().tV(aht2.getGUID()) || !(it2.ahf instanceof aic)) continue;
                object = it2;
                break;
            }
            if (object != null) {
                this.Xb.c((it)object, false);
            }
        }
        object = aht2.getGUID().bFk();
        if (aht2 instanceof ahc) {
            assert (false) : "can this happen?";
            lfn.b(5, "SFSubscriptionLogic", "handleAOIAddition(): Ignoring " + aht2 + " for subscriber " + ik2);
            return;
        }
        if (!bl && !(aht2 instanceof agx)) {
            lfn.b(5, "SFSubscriptionLogic", "handleAOIAddition(): Subscriber " + ik2 + " stateobject " + aht2 + " is not a meshobject");
            return;
        }
        il il2 = this.aeX.a(ik2, (ldv)object, gw.a.Ym);
        if (il2.afT == gw.a.Yl) {
            return;
        }
        il2.bx(null);
        if (il2.afU.aeY) {
            this.Xb.a(ik2, aht2, il2, false);
        } else {
            this.Xb.a(ik2, aht2, il2, false);
        }
        this.Xb.a(aht2, false);
        il2.by(null);
    }

    public final void a(ik ik2, it it2) {
        aht aht2 = it2.ahf;
        il il2 = this.aeX.a(ik2, aht2.getGUID().bFk());
        if (il2 == null) {
            lfn.b(5, "SFSubscriptionLogic", "handleAOIRemoval(): Subscriber " + ik2 + " has no OSI for stateobject " + aht2);
            return;
        }
        if (il2.afU.aeY) {
            this.Xb.c(it2, false);
            this.Xb.b(ik2, aht2.getGUID().bFk());
        } else {
            this.Xb.c(it2, false);
        }
    }

    public final void b(ik ik2, aht aht2) {
        il il2 = this.aeX.a(ik2, aht2.getGUID().bFk(), gw.a.Ym);
        boolean bl = this.a(ik2, aht2, true, il2);
        if (!bl) {
            return;
        }
        assert (!(aht2 instanceof agx));
        this.Xb.a(ik2, aht2, il2, true);
    }

    public final void b(ik ik2, it it2) {
        aht aht2 = it2.ahf;
        il il2 = this.aeX.a(ik2, aht2.getGUID().bFk());
        if (il2 == null) {
            lfn.b(5, "SFSubscriptionLogic", "handleExplicitRemoval(): Subscriber " + ik2 + " has no OSI for stateobject " + aht2);
            return;
        }
        assert (!(aht2 instanceof agx));
        this.Xb.c(it2, true);
    }

    public final boolean a(ik ik2, aht aht2, boolean bl, il il2) {
        if (ik2.bs(aht2.getGUID())) {
            return false;
        }
        if (il2 == null) {
            il2 = this.aeX.a(ik2, aht2.getGUID().bFk());
        }
        id id2 = aht2.By();
        assert (id2 != null);
        switch (id2.afj) {
            case 1: {
                assert (aht2 instanceof agc);
                assert (id2 instanceof if);
                if if_ = (if)id2;
                gj gj2 = if_.afn;
                assert (gj2 != null);
                return ik2.b(gj2);
            }
            case 2: {
                return bl;
            }
            case 3: {
                assert (aht2 instanceof ahf);
                assert (id2 instanceof if);
                if if_ = (if)id2;
                gj gj3 = if_.afn;
                assert (gj3 != null);
                return ik2.b(gj3);
            }
            case 4: {
                ik ik3 = this.agp.bp(aht2.getGUID().bFk());
                if (ik3 == null) {
                    lfn.b(5, "SFSubscriptionLogic", "shouldSubscriptionBeCreated(): OwnerSubscriber was not found for " + aht2);
                    return false;
                }
                gj gj4 = ik3.bV(4);
                if (gj4 == null) {
                    lfn.b(5, "SFSubscriptionLogic", "shouldSubscriptionBeCreated(): Key 'Private' was not found in subscriber " + ik3);
                    return false;
                }
                return ik2.b(gj4);
            }
            case 5: {
                return !(il2 == null ? !bl : il2.isIgnore());
            }
            case 6: {
                assert (aht2 instanceof ahl);
                ahl ahl2 = (ahl)aht2;
                if (!ik2.bs(ahl2.Bq())) {
                    return false;
                }
                return ahl2.AC() || ik2.bs(ahl2.Br());
            }
        }
        lfn.b(5, "SFSubscriptionLogic", "shouldSubscriptionBeCreated(): Invalid keytype provided: Subscriber " + ik2 + " Definition " + id2 + " SO " + aht2);
        return false;
    }

    public void a(ik ik2, it it2, il il2, boolean bl) {
        Object object;
        Map<ldv, agu> map;
        aht aht2 = it2.ahf;
        boolean bl2 = aht2 instanceof agx;
        if (il2 == null) {
            lfn.b(5, "SFSubscriptionLogic", "handleSubscriptionCreated(): Subscriber " + ik2 + " Subscription " + it2 + " OSI is null");
            assert (false);
            return;
        }
        if (bl) {
            this.f(ik2, aht2, bl);
        } else if (il2.afU.aeY) {
            if (bl2) {
                this.Xb.a(ik2, aht2.getGUID().bFk(), il2, bl);
                this.d(ik2, aht2, bl);
                this.c(ik2, aht2, bl);
            } else {
                this.c(ik2, aht2, bl);
            }
        } else if (bl2) {
            this.e(ik2, aht2, bl);
            this.d(ik2, aht2, bl);
        } else {
            this.e(ik2, aht2, bl);
            this.g(ik2, aht2, bl);
        }
        if (ahu.c.containsRelatedObjects(aht2.Bx())) {
            this.a(ik2, aht2);
        }
        if (aht2.Bx() == ahu.c.bms && gk.bI(aht2.By().afj) && !it2.nv() && !(map = ((ago)(object = (agr)aht2)).AN()).isEmpty()) {
            this.Xb.a(ik2, map);
        }
        if (aht2.getObjectType() == 68) {
            this.Xb.e(ik2, aht2);
        }
        while ((object = ik2.bq(aht2.getGUID())) != null) {
            this.Xb.b((gom)object);
        }
    }

    public void b(ik ik2, it it2, il il2, boolean bl) {
        aht aht2 = it2.ahf;
        boolean bl2 = aht2 instanceof agx;
        if (bl2) {
            this.c(ik2, aht2);
        }
        if (bl) {
            this.b(ik2, aht2, bl);
        } else if (il2.afU.aeY) {
            boolean bl3 = bl2;
            if (bl3) {
                this.Xb.b(ik2, aht2.getGUID().bFk());
            }
        } else if (bl2) {
            this.a(ik2, aht2, true);
        } else {
            this.b(ik2, aht2, bl);
            this.a(ik2, aht2, bl);
        }
    }

    private void c(ik ik2, aht aht2) {
        aht aht3;
        ahl ahl2;
        ldv ldv2;
        int n;
        int n2;
        List<ldv> list = this.Xb.np().bh(aht2.getGUID());
        if (list != null) {
            n2 = list.size();
            for (n = 0; n < n2; ++n) {
                ldv2 = list.get(n);
                ahl2 = this.Xb.np().bi(ldv2);
                if (ahl2 == null || !(ahl2 instanceof age) || (aht3 = this.Xb.np().bd(ahl2.Bq())) == null || !ik2.bs(ahl2.getGUID())) continue;
                this.Xb.h(ik2, (aht)ahl2, false);
            }
        }
        if ((list = this.Xb.np().bk(aht2.getGUID())) != null) {
            n2 = list.size();
            for (n = 0; n < n2; ++n) {
                ldv2 = list.get(n);
                ahl2 = this.Xb.np().bi(ldv2);
                if (ahl2 == null || !(ahl2 instanceof age) || ahl2.Bq().ib() == ahl2.Br().ib() && (aht3 = this.Xb.np().bd(ahl2.Br())) == null || !ik2.bs(ahl2.getGUID())) continue;
                this.Xb.h(ik2, (aht)ahl2, false);
            }
        }
    }

    private void a(ik ik2, aht aht2, boolean bl) {
        List<ldv> list = this.Xb.np().bh(aht2.getGUID());
        if (list != null) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                aht aht3;
                ldv ldv2 = list.get(i);
                ahl ahl2 = this.Xb.np().bi(ldv2);
                if (ahl2 == null || (aht3 = this.Xb.np().bd(ahl2.Bq())) == null || !ik2.bs(ahl2.getGUID()) || !ik2.bs(aht3.getGUID())) continue;
                this.Xb.h(ik2, aht3, bl);
                this.Xb.h(ik2, (aht)ahl2, bl);
            }
        }
    }

    private void b(ik ik2, aht aht2, boolean bl) {
        List<ldv> list = this.Xb.np().bk(aht2.getGUID());
        if (list != null) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                aht aht3;
                ldv ldv2 = list.get(i);
                ahl ahl2 = this.Xb.np().bi(ldv2);
                if (ahl2 == null || (aht3 = this.Xb.np().bd(ahl2.Br())) == null || !ik2.bs(ahl2.getGUID()) || !ik2.bs(aht3.getGUID())) continue;
                this.Xb.h(ik2, (aht)ahl2, bl);
                if (aht3 instanceof agx || io.b(aht3)) continue;
                this.Xb.h(ik2, aht3, bl);
            }
        }
    }

    private void c(ik ik2, aht aht2, boolean bl) {
        aht aht3;
        ahl ahl2;
        ldv ldv2;
        int n;
        int n2;
        assert (ik2 != null);
        assert (aht2 != null);
        List<ldv> list = this.Xb.np().bk(aht2.getGUID());
        if (list != null) {
            n2 = list.size();
            for (n = 0; n < n2; ++n) {
                ldv2 = list.get(n);
                ahl2 = this.Xb.np().bi(ldv2);
                if (ahl2 == null || ik2.bs(ahl2.getGUID()) || (aht3 = this.Xb.np().bd(ahl2.Br())) == null || !ik2.bs(aht3.getGUID())) continue;
                this.Xb.a(ik2, (aht)ahl2, null, bl);
            }
        }
        if ((list = this.Xb.np().bh(aht2.getGUID())) != null) {
            n2 = list.size();
            for (n = 0; n < n2; ++n) {
                ldv2 = list.get(n);
                ahl2 = this.Xb.np().bi(ldv2);
                if (ahl2 == null || ik2.bs(ahl2.getGUID()) || (aht3 = this.Xb.np().bd(ahl2.Bq())) == null || !ik2.bs(aht3.getGUID())) continue;
                this.Xb.a(ik2, (aht)ahl2, null, bl);
            }
        }
    }

    public void d(ik ik2, aht aht2, boolean bl) {
        aht aht3;
        ahl ahl2;
        ldv ldv2;
        int n;
        int n2;
        assert (ik2 != null);
        assert (aht2 != null);
        List<ldv> list = this.Xb.np().bk(aht2.getGUID());
        if (list != null) {
            n2 = list.size();
            for (n = 0; n < n2; ++n) {
                ldv2 = list.get(n);
                ahl2 = this.Xb.np().bi(ldv2);
                if (ahl2 == null || !(ahl2 instanceof age) || ik2.bs(ahl2.getGUID()) || !ahl2.AC() && ((aht3 = this.Xb.np().bd(ahl2.Br())) == null || !ik2.bs(aht3.getGUID()))) continue;
                this.Xb.a(ik2, (aht)ahl2, null, bl);
            }
        }
        if ((list = this.Xb.np().bh(aht2.getGUID())) != null) {
            n2 = list.size();
            for (n = 0; n < n2; ++n) {
                ldv2 = list.get(n);
                ahl2 = this.Xb.np().bi(ldv2);
                if (ahl2 == null || !(ahl2 instanceof age) || ik2.bs(ahl2.getGUID()) || (aht3 = this.Xb.np().bd(ahl2.Bq())) == null || !ik2.bs(aht3.getGUID())) continue;
                this.Xb.a(ik2, (aht)ahl2, null, bl);
            }
        }
    }

    void e(ik ik2, aht aht2, boolean bl) {
        assert (ik2 != null);
        assert (aht2 != null);
        List<ldv> list = this.Xb.np().bh(aht2.getGUID());
        if (list != null) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                aht aht3;
                ldv ldv2 = list.get(i);
                ahl ahl2 = this.Xb.np().bi(ldv2);
                if (ahl2 == null || ik2.bs(ahl2.getGUID()) || (aht3 = this.Xb.np().bd(ahl2.Bq())) == null || ik2.bs(aht3.getGUID())) continue;
                il il2 = this.aeX.a(ik2, aht2.getGUID().bFk(), gw.a.Ym);
                il2.bx(null);
                if (this.a(ik2, aht3, bl, il2)) {
                    this.Xb.a(ik2, (aht)ahl2, il2, bl);
                    this.Xb.a(ik2, aht3, il2, bl);
                }
                il2.by(null);
            }
        }
    }

    void f(ik ik2, aht aht2, boolean bl) {
        assert (ik2 != null);
        assert (aht2 != null);
        List<ldv> list = this.Xb.np().bk(aht2.getGUID());
        if (list != null) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                aht aht3;
                ldv ldv2 = list.get(i);
                ahl ahl2 = this.Xb.np().bi(ldv2);
                if (ahl2 == null || ik2.bs(ahl2.getGUID()) || (aht3 = this.Xb.np().bd(ahl2.Br())) == null || io.b(aht3) || ik2.bs(aht3.getGUID())) continue;
                il il2 = this.aeX.a(ik2, aht2.getGUID().bFk(), gw.a.Ym);
                il2.bx(null);
                if (this.a(ik2, aht3, bl, (il)null)) {
                    this.Xb.a(ik2, (aht)ahl2, il2, bl);
                    this.Xb.a(ik2, aht3, il2, bl);
                }
                il2.by(null);
            }
        }
    }

    void g(ik ik2, aht aht2, boolean bl) {
        assert (ik2 != null);
        assert (aht2 != null);
        List<ldv> list = this.Xb.np().bk(aht2.getGUID());
        if (list != null) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                aht aht3;
                ldv ldv2 = list.get(i);
                ahl ahl2 = this.Xb.np().bi(ldv2);
                if (ahl2 == null || ik2.bs(ahl2.getGUID()) || (aht3 = this.Xb.np().bd(ahl2.Br())) == null || ik2.bs(aht3.getGUID())) continue;
                il il2 = this.aeX.a(ik2, aht2.getGUID().bFk(), gw.a.Ym);
                il2.bx(null);
                if (this.a(ik2, aht3, bl, (il)null)) {
                    this.Xb.a(ik2, (aht)ahl2, il2, bl);
                    this.Xb.a(ik2, aht3, il2, bl);
                }
                il2.by(null);
            }
        }
    }

    public final boolean d(ik ik2, aht aht2) {
        brk brk2 = (brk)((Object)this.Xb.getMessageDelegator().bzx().bzt().d(aht2.getGUID()));
        if (brk2 == null) {
            lfn.b(5, "SFSubscriptionLogic", "canSubscriberSeeInventoryContent(): Subscriber " + ik2 + " SO " + aht2 + ": Can't find inventory");
            return false;
        }
        cnf cnf2 = (cnf)brk2.auk();
        ldv ldv2 = cnf2.rX(ik2.GUID.ib());
        if (ldv2 == null) {
            lfn.b(5, "SFSubscriptionLogic", "canSubscriberSeeInventoryContent(): Subscriber " + ik2 + " SO " + aht2 + ": SessionHandlerGUID is null");
            return false;
        }
        ldv ldv3 = lcr.tQ((ldv)ldv2);
        bbr bbr2 = cnf2.acx().dR(ldv3);
        if (bbr2 == null) {
            lfn.b(5, "SFSubscriptionLogic", "canSubscriberSeeInventoryContent(): Subscriber " + ik2 + " SO " + aht2 + ": Could not find clan member " + ldv3);
            return false;
        }
        switch (brk2.alX()) {
            case dEp: {
                return bbr2.b(bca.cTY);
            }
            case dER: {
                return bbr2.b(bca.cUd);
            }
            case dES: {
                return bbr2.b(bca.cUh);
            }
        }
        return false;
    }
}

