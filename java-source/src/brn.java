/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  brg
 *  cdb
 *  cew
 *  cex
 *  cug
 *  ep
 *  lcr
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class brn {
    public static final boolean dIL = false;
    private final bqk dFo;
    private final Map<ldv, brs> bii = lcn.emw();
    private brs[] dIM = null;
    private final Map<Integer, bpx> dIN = lcn.emw();
    public static final int dIO = 1000;

    public brn(bqk bqk2, boolean bl2, boolean bl3) {
        this.dFo = bqk2;
        this.h(bl2, bl3);
    }

    public final Map<ldv, brs> AN() {
        return this.bii;
    }

    public final float a(bqs bqs2, int n, float f2, boolean bl2) {
        assert (bqs2 != null);
        assert (n > 0);
        assert (n <= bqs2.vf());
        assert (f2 > 0.0f);
        if (!cug.us((int)bqs2.az())) {
            if (bl2) {
                ((brg)this.dFo).s(bqs2);
            }
            return 0.0f;
        }
        lgw lgw2 = (lgw)lea.enW().acv(bqs2.az());
        if (lgw2.erL() <= 0.0f) {
            lfn.b(5, "SFItemBaseManager", "computeItemPrice() Resource '" + bqs2.pa() + "' has invalid basecostvalue.");
            if (bl2) {
                ((brg)this.dFo).s(bqs2);
            }
            return 0.0f;
        }
        float f3 = 0.0f;
        if (cug.uz((int)bqs2.az())) {
            f3 = lgw2.erL() * f2 * bqs2.avd();
            f3 = (int)(f3 * (float)n);
            if (!bqs2.auW() && f3 < 1.0f) {
                f3 = 1.0f;
            }
            if (f3 < 1.0f) {
                if (bl2) {
                    ((brg)this.dFo).s(bqs2);
                }
                return 0.0f;
            }
        } else {
            f3 = lgw2.erL() * f2;
            f3 = (int)(f3 * (float)n);
            if (!bqs2.auW() && f3 < 1.0f) {
                f3 = 1.0f;
            }
            if (f3 < 1.0f) {
                if (bl2) {
                    ((brg)this.dFo).s(bqs2);
                }
                return 0.0f;
            }
        }
        if (f3 < 0.0f) {
            lfn.b(5, "SFItemBaseManager", "computeItemPrice() ItemPrice=" + f3 + " for " + bqs2);
            if (bl2) {
                ((brg)this.dFo).s(bqs2);
            }
            return 0.0f;
        }
        if (bqs2.auU() && bqs2.avT().Ba()) {
            List<brs> list = bqs2.avT().awp();
            int n2 = list.size();
            for (int i = 0; i < n2; ++i) {
                brs brs2 = list.get(i);
                bqs bqs3 = (bqs)brs2.awo();
                f3 += this.a(bqs3, bqs3.vf(), f2, bl2);
            }
        }
        return f3;
    }

    public final void a(brn brn2) {
        assert (brn2 != null);
        assert (this.awe() != null);
        brs brs2 = brn2.awe();
        this.a(this.awe(), brs2, brn2);
    }

    public final bsd jl(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFItemBaseManager", "createTreePath() ItemGUID is null.");
            return null;
        }
        brs brs2 = this.iZ(ldv2);
        if (brs2 == null) {
            lfn.b(5, "SFItemBaseManager", "createTreePath() Item " + ldv2 + " was not found.");
            return null;
        }
        return brs2.awr();
    }

    public final Map<ldv, bsf> jm(ldv ldv2) {
        Object object;
        if (ldv2 == null) {
            lfn.b(5, "SFItemBaseManager", "getContainerItems() ItemGUID is null.");
            return null;
        }
        brs brs2 = this.iZ(ldv2);
        if (brs2 == null) {
            lfn.b(5, "SFItemBaseManager", "getContainerItems() Item " + ldv2 + " was not found.");
            return null;
        }
        assert (brs2.awo() != null);
        if (brs2.awo() instanceof bpy) {
            object = (bpy)brs2.awo();
            if (!(object instanceof bqd || object instanceof bqe || object instanceof brz || object instanceof bsb)) {
                lfn.b(5, "SFItemBaseManager", "getContainerItems() ContainerItem has invalid type: " + brs2.awo().getClass().getName());
                return null;
            }
        } else if (brs2.awo() instanceof bqs) {
            object = (bqs)brs2.awo();
            if (!((bqs)object).auU()) {
                lfn.b(5, "SFItemBaseManager", "getContainerItems() Item " + ldv2 + " is not a container but: '" + ((bqs)object).pa() + "'");
                return null;
            }
        } else {
            lfn.b(5, "SFItemBaseManager", "getContainerItems() Item has invalid type: " + brs2.awo().getClass().getName());
            return null;
        }
        object = lcn.emw();
        if (brs2.Ba()) {
            for (brs brs3 : brs2.AY()) {
                if (brs3.awo() instanceof bqs) {
                    bqs bqs2 = (bqs)brs3.awo();
                    object.put(brs3.awo().getGUID(), bqs2.auR());
                    continue;
                }
                if (brs3.awo() instanceof brt) {
                    object.put(brs3.awo().getGUID(), (bsf)((Object)brs3.awo()));
                    continue;
                }
                if (brs3.awo() instanceof bpy) continue;
                if (brs3.awo() instanceof bsc) {
                    object.put(brs3.awo().getGUID(), (bsf)((Object)brs3.awo()));
                    continue;
                }
                lfn.b(5, "SFItemBaseManager", "getContainerItems() Item " + brs3.awo().getGUID() + " has invalid type: " + brs3.awo().getClass().getName());
            }
        }
        return object;
    }

    public final Map<ldv, bsl> j(ldv ldv2, float f2) {
        if (ldv2 == null) {
            lfn.b(5, "SFItemBaseManager", "getDynamicContainerItems() DynamicContainerGUID is null.");
            return null;
        }
        brs brs2 = this.avZ();
        if (brs2 == null) {
            lfn.b(5, "SFItemBaseManager", "getDynamicContainerItems() Could not find dynamic container " + ldv2);
            return null;
        }
        assert (brs2.awo() != null);
        assert (brs2.awo() instanceof bqd);
        if (!brs2.awo().getGUID().equals(ldv2)) {
            lfn.b(5, "SFItemBaseManager", "getDynamicContainerItems() DynamicContainer.GUID=" + brs2.awo().getGUID());
            lfn.b(5, "SFItemBaseManager", "getDynamicContainerItems() DynamicContainerGUID=" + ldv2);
            return null;
        }
        Map<ldv, bsl> map = lcn.emw();
        ldv ldv3 = this.awe().awo().getGUID();
        if (brs2.Ba()) {
            List<brs> list = brs2.AY();
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                brs brs3 = list.get(i);
                if (brs3.awo() instanceof bqs) {
                    bqs bqs2 = (bqs)brs3.awo();
                    bsl bsl2 = bqs2.auR();
                    float f3 = this.a(bqs2, bqs2.vf(), f2, false);
                    bsl2.c(1552, f3);
                    map.put(brs3.awo().getGUID(), bsl2);
                    continue;
                }
                lfn.b(5, "SFItemBaseManager", "getDynamicContainerItems() Item " + brs3.awo().getGUID() + " has invalid type: " + brs3.awo().getClass().getName());
            }
        }
        return map;
    }

    public final Map<ldv, bsf> avV() {
        float f2 = 0.0f;
        if (this.dFo instanceof bql) {
            f2 = ((bql)this.dFo).auw();
        }
        Map<ldv, bsf> map = lcn.emw();
        for (brs brs2 : this.bii.values()) {
            if (brs2.awo() instanceof bpy) continue;
            if (brs2.awo() instanceof bqs) {
                bqs bqs2 = (bqs)brs2.awo();
                bsl bsl2 = bqs2.auR();
                map.put(brs2.awo().getGUID(), bsl2);
                if (!(f2 > 0.0f) || !brs2.awu()) continue;
                float f3 = this.a(bqs2, bqs2.vf(), f2, false);
                bsl2.c(1552, f3);
                continue;
            }
            if (brs2.awo() instanceof brt) {
                map.put(brs2.awo().getGUID(), (bsf)((Object)brs2.awo()));
                continue;
            }
            if (brs2.awo() instanceof bsc) {
                map.put(brs2.awo().getGUID(), (bsf)((Object)brs2.awo()));
                continue;
            }
            lfn.b(5, "SFItemBaseManager", "getInventoryItems() " + brs2.awo().getGUID() + " has invalid type: " + brs2.awo().getClass().getName());
        }
        return map;
    }

    public final void reset() {
        this.bii.clear();
        this.avW();
    }

    private void a(brs brs2, brs brs3, brn brn2) {
        assert (brs2 != null);
        assert (brs3 != null);
        assert (brn2 != null);
        if (!brs2.Ba()) {
            return;
        }
        List<brs> list = brs2.AY();
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            brs brs4 = list.get(i);
            if (brs4.awo() instanceof bpy) continue;
            brs brs5 = brs4.awq();
            brn2.b(brs5, brs3);
            if (!brs4.Ba()) continue;
            this.a(brs4, brs5, brn2);
        }
    }

    private void h(boolean bl2, boolean bl3) {
        assert (this.dIM == null);
        bsb bsb2 = new bsb();
        bsb2.setGUID(null);
        brs brs2 = new brs();
        brs2.c(bsb2);
        bsb2.c(brs2);
        this.dIM = bl2 ? new brs[a.values().length] : new brs[1];
        this.dIM[a.dIP.ordinal()] = brs2;
        if (bl3) {
            bqe bqe2 = new bqe();
            bqe2.setGUID(null);
            int n = a.dIR.ordinal();
            this.dIM[n] = new brs();
            this.dIM[n].c(bqe2);
            bqe2.c(this.dIM[n]);
            brs2.i(this.dIM[n]);
            brz brz2 = new brz();
            brz2.setGUID(null);
            n = a.dIS.ordinal();
            this.dIM[n] = new brs();
            this.dIM[n].c(brz2);
            brz2.c(this.dIM[n]);
            brs2.i(this.dIM[n]);
            bqd bqd2 = new bqd();
            bqd2.setGUID(null);
            n = a.dIQ.ordinal();
            this.dIM[n] = new brs();
            this.dIM[n].c(bqd2);
            bqd2.c(this.dIM[n]);
            brs2.i(this.dIM[n]);
            if (lcr.qww >= 300 && lcr.qww <= 399) {
                bqe2.dBq = mx.si();
                brz2.dBq = mx.si();
            }
        }
    }

    private void avW() {
        int n;
        assert (this.dIM != null);
        assert (this.dIM[0] != null);
        assert (this.dIM[0].awo().getGUID() != null);
        ldv[] ldvArray = new ldv[this.dIM.length];
        long[] lArray = new long[this.dIM.length];
        int n2 = ldvArray.length;
        for (n = 0; n < n2; ++n) {
            if (this.dIM[n] == null) continue;
            ldvArray[n] = this.dIM[n].awo().getGUID();
            lArray[n] = ((bpy)this.dIM[n].awo()).dBq;
        }
        n = this.dIM.length > 1 ? 1 : 0;
        this.dIM = null;
        this.h(n != 0, n != 0);
        int n3 = ldvArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            if (this.dIM[n2] == null) continue;
            this.dIM[n2].awo().setGUID(ldvArray[n2]);
            ((bpy)this.dIM[n2].awo()).dBq = lArray[n2];
        }
    }

    public final boolean b(brs brs2, brs brs3) {
        if (brs2 == null) {
            lfn.b(5, "SFItemBaseManager", "addItemNode() ItemNode is null.");
            return false;
        }
        if (brs3 == null) {
            lfn.b(5, "SFItemBaseManager", "addItemNode() ContainerNode is null.");
            return false;
        }
        assert (brs2.awo() != null);
        assert (brs2.awo().getGUID() != null);
        ldv ldv2 = brs2.awo().getGUID();
        if (this.cF(ldv2)) {
            lfn.b(5, "SFItemBaseManager", "addItemNode() ItemNode " + ldv2 + " has already been added.");
            return false;
        }
        boolean bl2 = brs3.i(brs2);
        if (bl2) {
            this.bii.put(ldv2, brs2);
        }
        return bl2;
    }

    public final boolean J(ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        bqs bqs2 = (bqs)this.iF(ldv3);
        if (bqs2 == null) {
            lfn.b(5, "SFItemBaseManager", "canItemChangeSlot() Could not find item " + ldv3);
            return false;
        }
        return this.jo(ldv2) ? cug.vW((int)bqs2.az()) : this.jp(ldv2) && bqs2.auO() == cak.c.efR;
    }

    public final boolean cF(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFItemBaseManager", "containsItemNode() ItemGUID is null.");
            return false;
        }
        int n = this.dIM.length;
        for (int i = 0; i < n; ++i) {
            if (this.dIM[i] == null || this.dIM[i].awo().getGUID() == null || !this.dIM[i].awo().getGUID().equals(ldv2)) continue;
            return true;
        }
        return this.bii.containsKey(ldv2);
    }

    public final brm iF(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFItemBaseManager", "getItemBase() ItemGUID is null.");
            return null;
        }
        brs brs2 = this.iZ(ldv2);
        if (brs2 == null) {
            return null;
        }
        return brs2.awo();
    }

    public final brp[] avX() {
        if (this.bii.isEmpty()) {
            return new brp[0];
        }
        ArrayList<brp> arrayList = lcn.abH(5);
        for (brs brs2 : this.bii.values()) {
            if (!(brs2.awo() instanceof bqs)) continue;
            bqs bqs2 = (bqs)brs2.awo();
            arrayList.add(bqs2.auS());
        }
        brp[] brpArray = new brp[arrayList.size()];
        arrayList.toArray(brpArray);
        return brpArray;
    }

    public final brp[] h(ldv[] ldvArray) {
        brp[] brpArray = new brp[ldvArray.length];
        if (this.bii.isEmpty()) {
            return brpArray;
        }
        int n = ldvArray.length;
        for (int i = 0; i < n; ++i) {
            brs brs2 = this.bii.get(ldvArray[i]);
            if (brs2 == null) {
                lfn.b(5, "SFItemBaseManager", "getItemInfos() Could not find item " + ldvArray[i]);
                continue;
            }
            if (brs2.awo() instanceof bqs) {
                bqs bqs2 = (bqs)brs2.awo();
                brpArray[i] = bqs2.auS();
                continue;
            }
            lfn.b(5, "SFItemBaseManager", "getItemInfos() Item " + ldvArray[i] + " is not an inventoryitem: " + brs2);
        }
        return brpArray;
    }

    public final brs iZ(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFItemBaseManager", "getItemNode() ItemGUID is null.");
            return null;
        }
        int n = this.dIM.length;
        for (int i = 0; i < n; ++i) {
            if (this.dIM[i] == null || this.dIM[i].awo().getGUID() == null || !this.dIM[i].awo().getGUID().equals(ldv2)) continue;
            return this.dIM[i];
        }
        return this.bii.get(ldv2);
    }

    public final boolean isEmpty() {
        return this.bii.isEmpty();
    }

    public final boolean jn(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFItemBaseManager", "removeItemNode() ItemGUID is null.");
            return false;
        }
        brs brs2 = this.iZ(ldv2);
        if (brs2 == null) {
            lfn.b(5, "SFItemBaseManager", "removeItemNode() ItemNode " + ldv2 + " was not found.");
            return false;
        }
        assert (brs2.awn() != null);
        return this.c(brs2, brs2.awn());
    }

    public final boolean c(brs brs2, brs brs3) {
        if (brs2 == null) {
            lfn.b(5, "SFItemBaseManager", "removeItemNode() ItemNode is null.");
            return false;
        }
        if (brs3 == null) {
            lfn.b(5, "SFItemBaseManager", "removeItemNode() ContainerNode is null.");
            return false;
        }
        assert (brs2.awo() != null);
        assert (brs2.awo().getGUID() != null);
        ldv ldv2 = brs2.awo().getGUID();
        if (!this.cF(ldv2)) {
            lfn.b(5, "SFItemBaseManager", "removeItemNode() ItemNode " + ldv2 + " was not found.");
            return false;
        }
        boolean bl2 = brs3.l(brs2);
        if (bl2) {
            this.bii.remove(ldv2);
        }
        return bl2;
    }

    private brs K(ldv ldv2, ldv ldv3) {
        brs brs2 = this.iZ(ldv2);
        if (brs2 == null) {
            lfn.b(5, "SFItemBaseManager", "getItemNodeFromContainer() Could not find itemnode for container " + ldv2);
            return null;
        }
        return brs2.jr(ldv3);
    }

    public final bqd avY() {
        if (this.dIM.length == 1 || this.dIM[a.dIQ.ordinal()] == null) {
            return null;
        }
        return (bqd)this.dIM[a.dIQ.ordinal()].awo();
    }

    public final brs avZ() {
        if (this.dIM.length == 1) {
            return null;
        }
        return this.dIM[a.dIQ.ordinal()];
    }

    public final bqe awa() {
        if (this.dIM.length == 1) {
            return null;
        }
        return (bqe)this.dIM[a.dIR.ordinal()].awo();
    }

    public final brs awb() {
        if (this.dIM.length == 1) {
            return null;
        }
        return this.dIM[a.dIR.ordinal()];
    }

    public final brz awc() {
        if (this.dIM.length == 1) {
            return null;
        }
        return (brz)this.dIM[a.dIS.ordinal()].awo();
    }

    public final brs awd() {
        if (this.dIM.length == 1) {
            return null;
        }
        return this.dIM[a.dIS.ordinal()];
    }

    public final brs awe() {
        return this.dIM[a.dIP.ordinal()];
    }

    public final boolean jo(ldv ldv2) {
        assert (ldv2 != null);
        bqe bqe2 = this.awa();
        return bqe2 != null && bqe2.getGUID().equals(ldv2);
    }

    public final boolean jp(ldv ldv2) {
        assert (ldv2 != null);
        brz brz2 = this.awc();
        return brz2 != null && brz2.getGUID().equals(ldv2);
    }

    public final void awf() {
        this.a(this.avZ(), a.dIQ);
        assert (this.avZ() == null);
    }

    public final void d(brs brs2) {
        this.b(brs2, a.dIQ);
        assert (this.avY() != null);
    }

    public final void e(brs brs2) {
        this.b(brs2, a.dIR);
        assert (this.awa() != null);
    }

    public final void f(brs brs2) {
        this.b(brs2, a.dIS);
        assert (this.awc() != null);
    }

    private void a(brs brs2, a a2) {
        assert (brs2 != null);
        assert (brs2.awo() != null);
        assert (brs2.awo().getGUID() != null);
        assert (brs2.awo() instanceof bpy);
        assert (this.dIM != null);
        assert (a2 != null);
        assert (a2.ordinal() < this.dIM.length);
        assert (this.dIM[a2.ordinal()] != null);
        this.dIM[a.dIP.ordinal()].l(brs2);
        this.dIM[a2.ordinal()] = null;
    }

    private void b(brs brs2, a a2) {
        assert (brs2 != null);
        assert (brs2.awo() != null);
        assert (brs2.awo().getGUID() != null);
        assert (brs2.awo() instanceof bpy);
        assert (this.dIM != null);
        assert (a2 != null);
        assert (a2.ordinal() < this.dIM.length);
        this.dIM[a.dIP.ordinal()].i(brs2);
        this.dIM[a2.ordinal()] = brs2;
    }

    public final void awg() {
        Object object;
        this.awh();
        List<brs> list = this.awd().AY();
        if (list == null) {
            ((cdb)this.dFo.auk()).aJW();
            return;
        }
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            object = (bqs)iterator.next().awo();
            if (((bqs)object).getAttributes() == null || !((bqs)object).Uu()) continue;
            ej[] ejArray = ((bqs)object).avc();
            int n = ejArray.length;
            for (int i = 0; i < n; ++i) {
                if (ejArray[i].getDataType() != 2 || !ep.aY((int)ejArray[i].getType())) continue;
                Integer n2 = new Integer(ejArray[i].getType());
                bpx bpx2 = this.dIN.get(n2);
                if (bpx2 == null) {
                    bpx2 = new bpx(ejArray[i].getType());
                    this.dIN.put(n2, bpx2);
                }
                float f2 = ((et)ejArray[i]).fN();
                bpx2.da(f2);
            }
        }
        iterator = this.dIN.values().iterator();
        while (iterator.hasNext()) {
            float f3;
            object = (bpx)iterator.next();
            if (!ep.aY((int)((bpx)object).bnM) || (f3 = ((bpx)object).getValue()) != 0.0f) continue;
            iterator.remove();
        }
        if (this.dFo.auk() != null) {
            ((cdb)this.dFo.auk()).aJW();
        }
    }

    public final float lV(int n) {
        if (n <= 0) {
            lfn.b(5, "SFItemBaseManager", "getAttributeSum() AttributeType is invalid.");
            return 0.0f;
        }
        bpx bpx2 = this.dIN.get(n);
        if (bpx2 == null) {
            return 0.0f;
        }
        return bpx2.getValue();
    }

    private void awh() {
        if (this.dIN.isEmpty()) {
            return;
        }
        for (bpx bpx2 : this.dIN.values()) {
            if (!ep.aY((int)bpx2.bnM)) continue;
            bpx2.reset();
        }
    }

    public final void awi() {
        assert (!this.dFo.isServerObject());
        float f2 = this.g(this.awe());
        bpy bpy2 = (bpy)this.awe().awo();
        if (bpy2.aXy == f2) {
            return;
        }
        bpy2.aXy = f2;
        if (this.dFo.auk() instanceof cew) {
            ((cew)this.dFo.auk()).dM(f2);
        }
    }

    public void gt() {
        this.h(mce.usR.bD(new Object[0]));
        lfn.b(2, "SFItemBaseManager", "dumpContent() : Inventory Contents:");
        this.a(this.dFo, new StringBuilder(), this.awe(), 0);
        this.h(mce.usT.bD(this.bii.size()));
        lfn.b(2, "SFItemBaseManager", "dumpContent() : Inventory Contains " + this.bii.size() + " Item Nodes");
    }

    public final float awj() {
        bpy bpy2 = (bpy)this.awe().awo();
        return bpy2.aXy;
    }

    public final void WC() {
        assert (!this.dFo.isServerObject());
        this.h(mce.usU.bD(this.dFo.getGUID().toString()));
        lfn.b(2, "SFItemBaseManager", "validateClientItems() Validation of inventory " + this.dFo.getGUID() + ":");
        this.a(this.dFo, new StringBuilder(), this.awe());
    }

    private float g(brs brs2) {
        assert (this.dFo != null);
        assert (!this.dFo.isServerObject());
        assert (brs2 != null);
        if (!brs2.Ba()) {
            return 0.0f;
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (brs brs3 : brs2.AY()) {
            brm brm2;
            if (brs3.awo() instanceof bpy) {
                brm2 = (bpy)brs3.awo();
                f3 = this.g(brs3);
                if (((bpy)brm2).aXy != f3) {
                    ((bpy)brm2).aXy = f3;
                    ((bql)this.dFo).b(1, brm2);
                }
            } else if (brs3.awo() instanceof bqs) {
                brm2 = (bqs)brs3.awo();
                if (((bqs)brm2).auU()) {
                    f3 = this.g(brs3);
                    if (((bqs)brm2).getWeight() != f3) {
                        ((bqs)brm2).setWeight(f3);
                        ((bql)this.dFo).b(1, brm2);
                    }
                } else {
                    f3 = ((bqs)brm2).getWeight();
                }
            } else {
                lfn.b(5, "SFItemBaseManager", "computeContainerWeight() Invalid itembase found: " + brs3.awo());
                f3 = 0.0f;
                continue;
            }
            f2 += f3;
        }
        return f2;
    }

    private void a(bqk bqk2, StringBuilder stringBuilder, brs brs2, int n) {
        brm brm2;
        boolean bl2 = true;
        for (int i = 0; i < n; ++i) {
            stringBuilder.append("    ");
        }
        brm brm3 = brs2.awo();
        if (brm3 instanceof bpy) {
            brm2 = (bpy)brm3;
            stringBuilder.append(brm2.getClass().getSimpleName());
            stringBuilder.append(": GUID=");
            stringBuilder.append(brm2.getGUID());
            if (bl2) {
                stringBuilder.append(" Weight=");
                stringBuilder.append(((bpy)brm2).aXy);
            }
        } else if (brm3 instanceof bqs) {
            brm2 = (bqs)brm3;
            stringBuilder.append(brm2.getClass().getSimpleName());
            stringBuilder.append(": GUID=");
            stringBuilder.append(brm2.getGUID());
            stringBuilder.append(" ResourceType='");
            stringBuilder.append(((bqs)brm2).pa());
            stringBuilder.append("' Quantity=");
            stringBuilder.append(((bqs)brm2).vf());
            if (((bqs)brm2).Uu()) {
                stringBuilder.append(" LayerSlot=");
                stringBuilder.append(((bqs)brm2).AR());
            }
            if (((bqs)brm2).auV()) {
                stringBuilder.append(" EnchantmentSlot=");
                stringBuilder.append(((bqs)brm2).AS());
            }
            if (bl2) {
                stringBuilder.append(" Weight=");
                stringBuilder.append(((bqs)brm2).getWeight());
            }
        } else {
            lfn.b(5, "SFItemBaseManager", "dumpItemContent() Unhandled itembase found: " + brm3.getClass());
        }
        this.h(mce.usS.bD(stringBuilder.toString()));
        lfn.b(2, "SFItemBaseManager", "dumptItemContent() : Item: " + stringBuilder.toString());
        stringBuilder.delete(0, stringBuilder.length());
        if (!brs2.Ba()) {
            return;
        }
        int n2 = n + 1;
        for (brs brs3 : brs2.AY()) {
            this.a(bqk2, stringBuilder, brs3, n2);
        }
    }

    private void h(loz loz2) {
        ldv ldv2 = lcr.acL;
        if (this.dFo instanceof brg) {
            ldv2 = lcr.ak((ldv)lcr.acL, (int)((cex)this.dFo.auk()).mA().hk().ib());
        }
        fgs fgs2 = (fgs)this.dFo.getMessageDelegator().h(29446, this.dFo.getGUID(), ldv2);
        fgs2.r(loz2);
        this.dFo.getMessageDelegator().F(fgs2);
    }

    private void a(bqk bqk2, StringBuilder stringBuilder, brs brs2) {
        brm brm2 = brs2.awo();
        if (!(brm2 instanceof bpy)) {
            if (brm2 instanceof bqs) {
                bqs bqs2 = (bqs)brm2;
                if (bqk2.getMessageDelegator().bzx().bzt().d(bqs2.getGUID()) == null) {
                    stringBuilder.append(bqs2.getClass().getSimpleName());
                    stringBuilder.append(": GUID=");
                    stringBuilder.append(bqs2.getGUID());
                    stringBuilder.append(" ResourceType='");
                    stringBuilder.append(bqs2.pa());
                    stringBuilder.append("' Quantity=");
                    stringBuilder.append(bqs2.vf());
                    stringBuilder.append(" Not found");
                    lfn.b(2, "SFItemBaseManager", "Item: " + stringBuilder.toString());
                    this.h(mce.usV.bD(stringBuilder.toString()));
                    stringBuilder.delete(0, stringBuilder.length());
                }
            } else {
                lfn.b(5, "SFItemBaseManager", "validateClientItems() Unhandled itembase found: " + brm2.getClass());
            }
        }
        if (!brs2.Ba()) {
            return;
        }
        for (brs brs3 : brs2.AY()) {
            this.a(bqk2, stringBuilder, brs3);
        }
    }

    public static int i(Set<bqs> set) {
        if (set == null || set.isEmpty()) {
            return 0;
        }
        int n = 0;
        for (bqs bqs2 : set) {
            n += brn.v(bqs2);
        }
        return n;
    }

    public static int v(bqs bqs2) {
        return bqs2 == null ? 0 : (int)(cug.vc((int)bqs2.az()) / 10.0f);
    }
}

