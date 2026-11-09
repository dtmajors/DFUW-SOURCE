/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  is
 *  lcr
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class ik {
    public final ldv GUID;
    public final is Xb;
    public final boolean afH;
    public final boolean afI;
    private ldv Tr;
    private HashMap<ldv, it> afJ = (HashMap)lcn.emw();
    private ldv afK;
    private List<gj> afL = lcn.abH(1);
    private gm adE = new gm();
    private HashSet<ldv> afM = (HashSet)lcn.emx();
    private Map<ldv, ldv> afN = lcn.emw();
    private static Set<Integer> afO = lcn.emH();
    private static Set<Integer> afP = lcn.emH();
    private List<gom> afQ = null;
    private boolean[] afR = new boolean[10];
    HashMap<ldv, il> afS = (HashMap)lcn.emw();

    ik(is is2, ldv ldv2, boolean bl, boolean bl2) {
        this.Xb = is2;
        this.GUID = ldv2;
        this.afH = bl;
        this.afI = bl2;
    }

    void a(gom gom2) {
        if (this.afQ == null) {
            this.afQ = lcn.emv();
        }
        this.afQ.add(gom2);
    }

    gom bq(ldv ldv2) {
        if (this.afQ == null) {
            return null;
        }
        Iterator<gom> iterator = this.afQ.iterator();
        while (iterator.hasNext()) {
            gom gom2 = iterator.next();
            if (!gom2.Rs.equals(ldv2)) continue;
            iterator.remove();
            if (this.afQ.isEmpty()) {
                this.afQ = null;
            }
            return gom2;
        }
        return null;
    }

    void cleanUp() {
        this.Xb.a(this);
        Set set = (Set)this.afM.clone();
        for (ldv ldv2 : set) {
            this.bv(ldv2);
        }
        assert (this.afJ.isEmpty());
        assert (this.afS.isEmpty());
    }

    public it br(ldv ldv2) {
        return this.afJ.get(ldv2);
    }

    public final boolean bs(ldv ldv2) {
        return this.afJ.containsKey(ldv2);
    }

    public final void bQ(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            stringBuilder.append("  ");
        }
        String string = stringBuilder.toString();
        lfn.b(3, "SUBS", string + "BEGIN UpdateTimeSliceList");
        for (int i = 0; i < this.afR.length; ++i) {
            lfn.b(3, "SUBS", i + "  " + this.afR[i]);
        }
        lfn.b(3, "SUBS", string + "BEGIN Keys");
        for (gj object : this.afL) {
            lfn.b(3, "SUBS", string + "  " + object);
        }
        lfn.b(3, "SUBS", string + "BEGIN ObjectSpaces");
        for (ldv ldv2 : this.afM) {
            lfn.b(3, "SUBS", string + "  " + ldv2);
        }
        lfn.b(3, "SUBS", string + "BEGIN SubscriptionMap");
        for (ldv ldv3 : this.afJ.keySet()) {
            lfn.b(3, "SUBS", string + "  " + ldv3 + ": " + this.afJ.get(ldv3));
        }
        lfn.b(3, "SUBS", string + "BEGIN SubscriberInfoByOSGUID");
        for (ldv ldv4 : this.afS.keySet()) {
            lfn.b(3, "SUBS", string + "  " + ldv4 + ": " + this.afS.get(ldv4));
        }
    }

    final boolean a(aht aht2, il il2, boolean bl) {
        assert (aht2 != null);
        it it2 = this.br(aht2.getGUID());
        if (it2 != null) {
            if (aht2.getGUID().tV(lcr.qAe)) {
                // empty if block
            }
            return false;
        }
        ldv ldv2 = aht2.getGUID().bFk();
        if (il2 == null) {
            il2 = this.Xb.aeX.a(this, ldv2, gw.a.Ym);
        }
        il2.bx(aht2.getGUID());
        boolean bl2 = false;
        if (aht2.Bx() == ahu.c.bms && aht2.getGUID().tV(lcr.qzk) && !this.Xb.agE.d(this, aht2)) {
            bl2 = true;
        }
        this.a(aht2, afO, afP);
        long l = this.a(bl2, afO, afP, null);
        it2 = new it(aht2, this, bl2, afO, afP, l);
        aht2.b(this);
        this.afJ.put(aht2.getGUID(), it2);
        this.Xb.a(it2, il2, bl);
        return true;
    }

    public void a(it it2) {
        this.a(it2.ahf, afO, afP);
        it2.ahg = this.a(it2.nv(), afO, afP, it2.ahj);
    }

    private void a(aht aht2, Set<Integer> set, Set<Integer> set2) {
        set.clear();
        set2.clear();
        if (aht2 instanceof aia) {
            agw agw2;
            int n;
            int n2;
            List<agw> list;
            aia aia2 = (aia)aht2;
            if (!aia2.BI().isEmpty()) {
                list = aia2.BI();
                n2 = list.size();
                for (n = 0; n < n2; ++n) {
                    agw2 = list.get(n);
                    if (!agw2.adE.a(this.nk())) continue;
                    set.add(n);
                }
            }
            if (!aia2.BJ().isEmpty()) {
                list = aia2.BJ();
                n2 = list.size();
                for (n = 0; n < n2; ++n) {
                    agw2 = list.get(n);
                    if (!agw2.adE.a(this.nk())) continue;
                    set2.add(n);
                }
            }
        }
    }

    private long a(boolean bl, Set<Integer> set, Set<Integer> set2, int[] nArray) {
        int[] nArray2 = new int[set.size()];
        int[] nArray3 = new int[set2.size()];
        int n = 0;
        for (Integer n2 : set) {
            nArray2[n] = n2;
            ++n;
        }
        n = 0;
        for (Integer n2 : set2) {
            nArray3[n] = n2;
            ++n;
        }
        long l = ho.a(nArray2, nArray3, bl, nArray);
        return l;
    }

    final boolean a(it it2, boolean bl) {
        aht aht2 = it2.ahf;
        it it3 = this.br(aht2.getGUID());
        assert (it3 == it2);
        ldv ldv2 = aht2.getGUID().bFk();
        il il2 = this.Xb.aeX.a(this, ldv2);
        assert (il2 != null);
        aht2.c(this);
        this.afJ.remove(aht2.getGUID());
        ldv ldv3 = this.afN.get(aht2.getGUID());
        if (ldv3 != null) {
            goc goc2 = (goc)this.Xb.getMessageDelegator().h(21768, this.GUID, ldv3);
            goc2.Rs = aht2.getGUID();
            this.Xb.getMessageDelegator().F(goc2);
        }
        this.Xb.b(it2, il2, bl);
        if (il2 != null) {
            il2.by(aht2.getGUID());
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[GUID=");
        stringBuilder.append(this.GUID);
        if (this.afH) {
            stringBuilder.append(", AINode");
        }
        if (this.afI) {
            stringBuilder.append(", AnotherNode");
        }
        stringBuilder.append(", CreatureObjectGUID=");
        if (this.afK == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(this.afK);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public ldv me() {
        return this.afK;
    }

    public void bt(ldv ldv2) {
        this.afK = ldv2;
    }

    public void bu(ldv ldv2) {
        this.afM.add(ldv2);
        this.Xb.agp.a(ldv2, this);
    }

    public void bv(ldv ldv2) {
        this.afM.remove(ldv2);
        this.Xb.agp.b(ldv2, this);
    }

    public final boolean d(gj gj2) {
        if (gj2 == null) {
            lfn.b(5, "SFSubscriberNew", this + " addKey(): Key is null.");
            return false;
        }
        if (this.afL.contains(gj2)) {
            lfn.b(5, "SFSubscriberNew", this + " addKey(): Key " + gj2 + " already exists.");
            return false;
        }
        this.afL.add(gj2);
        return true;
    }

    public final boolean e(gj gj2) {
        if (gj2 == null) {
            lfn.b(5, "SFSubscriber", this + " removeKey(): Key is null.");
            return false;
        }
        if (!this.afL.remove(gj2)) {
            lfn.b(5, "SFSubscriber", this + " removeKey(): Key " + gj2 + " was not found.");
            return false;
        }
        return true;
    }

    public final boolean co(int n) {
        if (n <= 0) {
            lfn.b(5, "SFSubscriber", this + " containsKey(): KeyType is invalid.");
            return false;
        }
        int n2 = this.afL.size();
        for (int i = 0; i < n2; ++i) {
            gj gj2 = this.afL.get(i);
            if (gj2.Type != n) continue;
            return true;
        }
        return false;
    }

    public final boolean b(gj gj2) {
        if (gj2 == null) {
            lfn.b(5, "SFSubscriber", this + " containsKey(): Key is null.");
            return false;
        }
        int n = this.afL.size();
        for (int i = 0; i < n; ++i) {
            gj gj3 = this.afL.get(i);
            if (!gj3.equals(gj2)) continue;
            return true;
        }
        return false;
    }

    public final void nj() {
        gj[] gjArray = new gj[this.afL.size()];
        this.adE = new gm(this.afL.toArray(gjArray));
    }

    public gm nk() {
        return this.adE;
    }

    public final gj bV(int n) {
        if (n <= 0) {
            lfn.b(5, "SFSubscriber", this.GUID + " getKey() KeyType is invalid.");
            return null;
        }
        int n2 = this.afL.size();
        for (int i = 0; i < n2; ++i) {
            gj gj2 = this.afL.get(i);
            if (gj2.Type != n) continue;
            return gj2;
        }
        return null;
    }

    public ldv gO() {
        return this.Tr;
    }

    public void af(ldv ldv2) {
        this.Tr = ldv2;
    }

    protected void a(ldv ldv2, gw.a a2) {
        this.Xb.aeX.a(this, ldv2, a2).bx(null);
    }

    protected void bw(ldv ldv2) {
        il il2 = this.Xb.aeX.a(this, ldv2);
        if (il2 == null) {
            assert (false);
            return;
        }
        il2.by(null);
    }

    public HashMap<ldv, it> nl() {
        return this.afJ;
    }

    public final void d(ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        if (this.afN.containsKey(ldv2)) {
            lfn.b(5, "SFSubscriberNew", this + " addSubscriptionListener(): Listener for " + ldv2 + " already exists.");
            return;
        }
        this.afN.put(ldv2, ldv3);
    }

    public final void e(ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        ldv ldv4 = this.afN.remove(ldv2);
        if (ldv4 == null) {
            lfn.b(5, "SFSubscriberNew", this + " removeSubscriptionListener(): Listener for object " + ldv2 + " was not found.");
            return;
        }
        if (!ldv4.equals(ldv3)) {
            lfn.b(5, "SFSubscriberNew", this + " removeSubscriptionListener(): NotifyObjectGUID=" + ldv3 + ", OtherNotifyObjectGUID=" + ldv4);
            return;
        }
    }
}

