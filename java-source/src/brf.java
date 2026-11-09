/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cug
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class brf
extends bql
implements bre {
    private Map<alc.a, bqg> dIr = new EnumMap<alc.a, bqg>(alc.a.class);
    private boolean dIs = true;
    private boolean dIt = false;

    public brf() {
        this.w(this.dIr);
    }

    public final void dY(boolean bl2) {
        this.dIs = bl2;
    }

    public final void dZ(boolean bl2) {
        this.dIt = bl2;
    }

    @Override
    public final bqs avx() {
        return this.c(cak.c.efZ);
    }

    @Override
    public final bqs avy() {
        return this.c(cak.c.efT);
    }

    @Override
    public final bqg c(alc.a a2) {
        if (a2 == null) {
            lfn.b(5, "SFInventoryPlayerClient", "getEnchantmentSlot() SlotType is null.");
            return null;
        }
        bqg bqg2 = this.dIr.get((Object)a2);
        if (bqg2 == null) {
            lfn.b(5, "SFInventoryPlayerClient", "getEnchantmentSlot() SlotType '" + (Object)((Object)a2) + "' was not found.");
            return null;
        }
        return bqg2;
    }

    public final bqs c(cak.c c2) {
        assert (this.Initialized);
        assert (c2 != null);
        List<brs> list = this.dBQ.awd().AY();
        if (list != null) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                brs brs2 = list.get(i);
                bqs bqs2 = (bqs)brs2.awo();
                if (bqs2.auO() != c2) continue;
                return bqs2;
            }
        }
        return null;
    }

    @Override
    protected final void a(bqs bqs2, vi vi2) {
        assert (bqs2 != null);
        assert (vi2 != null);
        if ((vi2.aXP & 0x200) > 0) {
            assert (vi2.aCJ >= 0);
            this.b(bqs2, vi2.aCJ);
        }
        if ((vi2.aXP & 0x2000) > 0) {
            assert (vi2.aXS >= 0);
            this.e(bqs2, vi2.aXS);
        }
        if ((vi2.aXP & 0x1000) > 0) {
            this.n(bqs2);
        }
    }

    @Override
    protected final void f(bqs bqs2) {
        assert (bqs2 != null);
        if (bqs2.auX()) {
            this.a(bqs2, false, true);
        }
        if (bqs2.Uu()) {
            this.a(bqs2, true);
        }
        if (bqs2.auV()) {
            this.o(bqs2);
        }
    }

    protected final void b(uk[] ukArray) {
        int n;
        assert (ukArray != null);
        ArrayList<vi> arrayList = null;
        ArrayList<vi> arrayList2 = null;
        ArrayList<vi> arrayList3 = null;
        vi vi2 = null;
        int n2 = ukArray.length;
        for (n = 0; n < n2; ++n) {
            if (ukArray[n] == null) {
                lfn.b(5, "SFInventoryPlayerClient", "checkPropertyUpdates() PropertyUpdate " + n + " is null.");
                assert (false);
                continue;
            }
            if (ukArray[n].Uo < 160) {
                super.a(ukArray[n]);
                continue;
            }
            if (ukArray[n] instanceof vi) {
                vi vi3 = (vi)ukArray[n];
                if ((vi3.aXP & 4) > 0) {
                    if (arrayList2 == null) {
                        arrayList2 = lcn.abH(5);
                    }
                    arrayList2.add(vi3);
                    continue;
                }
                if ((vi3.aXP & 0x800) > 0) {
                    ldv ldv2 = this.iI(vi3.GUID);
                    bqs bqs2 = this.iK(ldv2);
                    if (bqs2 != null && bqs2.auX()) {
                        assert (vi2 == null);
                        vi2 = vi3;
                        continue;
                    }
                } else if (this.Initialized && (vi3.aXP & 0x4000) > 0) {
                    if (arrayList3 == null) {
                        arrayList3 = lcn.abH(5);
                    }
                    arrayList3.add(vi3);
                    continue;
                }
                if (arrayList == null) {
                    arrayList = lcn.abH(5);
                }
                arrayList.add(vi3);
                continue;
            }
            this.a(ukArray[n]);
        }
        if (arrayList2 != null) {
            Collections.reverse(arrayList2);
            n2 = arrayList2.size();
            for (n = 0; n < n2; ++n) {
                this.a((uk)arrayList2.get(n));
            }
        }
        if (arrayList3 != null) {
            n2 = arrayList3.size();
            for (n = 0; n < n2; ++n) {
                this.a((uk)arrayList3.get(n));
            }
        }
        if (vi2 != null) {
            this.a(vi2);
        }
        if (arrayList != null) {
            n2 = arrayList.size();
            for (n = 0; n < n2; ++n) {
                this.a((uk)arrayList.get(n));
            }
        }
    }

    @Override
    protected final void aut() {
        assert (this.Initialized);
        super.aut();
        if (this.dBQ.awd().Ba()) {
            List<brs> list = this.dBQ.awd().AY();
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                brs brs2 = list.get(i);
                bqs bqs2 = (bqs)brs2.awo();
                if (!bqs2.auX()) continue;
                bqs2.aN(true);
                this.n(bqs2);
            }
        }
    }

    @Override
    protected final boolean aux() {
        return !this.dIs && this.dIt;
    }

    @Override
    protected final void b(bqs bqs2, vi vi2) {
        assert (bqs2 != null);
        assert (vi2 != null);
        super.b(bqs2, vi2);
        if ((vi2.aXP & 0x800) > 0) {
            boolean bl2 = (vi2.aXP & 0x200) > 0;
            this.a(bqs2, bl2, false);
        }
        if ((vi2.aXP & 0x400) > 0) {
            this.a(bqs2, false);
        }
        if ((vi2.aXP & 0x4000) > 0) {
            this.o(bqs2);
        }
        if ((vi2.aXP & 0x200) > 0) {
            this.b(bqs2, vi2.aCJ);
        }
        if ((vi2.aXP & 0x1000) > 0) {
            this.n(bqs2);
        }
        if ((vi2.aXP & 0x2000) > 0) {
            this.e(bqs2, vi2.aXS);
        }
        if ((vi2.aXP & 0x8000) > 0) {
            this.a(bqs2, vi2.aXS, vi2.aCJ);
        }
    }

    private void b(bqs bqs2, int n) {
        assert (bqs2 != null);
        assert (n >= 0);
        if (bqs2.Uu()) {
            lfn.b(5, "SFInventoryPlayerClient", "attachInventoryItem() Item " + bqs2.getGUID() + " is already attached.");
            return;
        }
        bqs2.fc(n);
        if (this.Initialized && this.aux()) {
            this.a(mce.usg.bD(bqs2.az()));
        }
        if (cug.uA((int)bqs2.az())) {
            this.dBQ.awg();
        }
    }

    private void c(bqs bqs2, int n) {
        assert (bqs2 != null);
        assert (n >= 0);
        if (!bqs2.auV()) {
            this.e(bqs2, n);
            return;
        }
        alc.a a2 = alc.a.getEnchantmentSlotType(bqs2.AS());
        if (a2 == null) {
            lfn.b(5, "SFInventoryPlayerClient", "changeEnchantmentSlot() Item " + bqs2.getGUID() + " has invalid slotnumber: " + bqs2.AS());
            return;
        }
        bqg bqg2 = this.dIr.get((Object)a2);
        if (bqg2 == null) {
            lfn.b(5, "SFInventoryPlayerClient", "changeEnchantmentSlot() EnchantmentSlot " + (Object)((Object)a2) + " was not found.");
            lfn.b(5, "SFInventoryPlayerClient", "changeEnchantmentSlot() " + bqs2);
            return;
        }
        alc.a a3 = alc.a.getEnchantmentSlotType(n);
        if (a3 == null) {
            lfn.b(5, "SFInventoryPlayerClient", "changeEnchantmentSlot() Invalid slotnumber provided: " + n);
            return;
        }
        bqg bqg3 = this.dIr.get((Object)a3);
        if (bqg3 == null) {
            lfn.b(5, "SFInventoryPlayerClient", "changeEnchantmentSlot() EnchantmentSlot " + (Object)((Object)a3) + " was not found.");
            lfn.b(5, "SFInventoryPlayerClient", "changeEnchantmentSlot() " + bqs2);
            return;
        }
        if (bqg3.dBI != null) {
            this.o(bqg3.dBI);
        }
        bqg2.dBI = null;
        bqg3.dBI = bqs2;
        bqs2.fd(n);
    }

    private void d(bqs bqs2, int n) {
        assert (bqs2 != null);
        assert (n >= 0);
        if (!bqs2.Uu()) {
            lfn.b(5, "SFInventoryPlayerClient", "changeLayerSlot() Item " + bqs2.getGUID() + " is not attached.");
            return;
        }
        bqs2.fc(n);
    }

    private void a(bqs bqs2, int n, int n2) {
        assert (bqs2 != null);
        assert (n >= 0 || n2 >= 0);
        if (n >= 0) {
            assert (n2 < 0);
            this.c(bqs2, n);
        }
        if (n2 >= 0) {
            assert (n < 0);
            this.d(bqs2, n2);
        }
        this.b(1, bqs2);
    }

    private void e(bqs bqs2, int n) {
        assert (bqs2 != null);
        assert (n >= 0);
        if (bqs2.auV()) {
            lfn.b(5, "SFInventoryPlayerClient", "depositInventoryItem() Item " + bqs2.getGUID() + " is already deposited.");
            return;
        }
        alc.a a2 = alc.a.getEnchantmentSlotType(n);
        if (a2 == null) {
            lfn.b(5, "SFInventoryPlayerClient", "depositInventoryItem() Invalid slotnumber provided: " + n);
            return;
        }
        bqg bqg2 = this.dIr.get((Object)a2);
        if (bqg2 == null) {
            lfn.b(5, "SFInventoryPlayerClient", "depositInventoryItem() EnchantmentSlot " + (Object)((Object)a2) + " was not found.");
            lfn.b(5, "SFInventoryPlayerClient", "depositInventoryItem() " + bqs2);
            return;
        }
        if (bqg2.dBI != null) {
            lfn.b(5, "SFInventoryPlayerClient", "depositInventoryItem() An item is already deposited in slot " + (Object)((Object)a2));
            lfn.b(5, "SFInventoryPlayerClient", "depositInventoryItem() " + bqg2.dBI);
            return;
        }
        bqg2.dBI = bqs2;
        bqs2.fd(n);
    }

    private void a(bqs bqs2, boolean bl2) {
        assert (bqs2 != null);
        if (!bqs2.Uu()) {
            lfn.b(5, "SFInventoryPlayerClient", "detachInventoryItem() Item " + bqs2.getGUID() + " is not attached.");
            return;
        }
        bqs2.auZ();
        if (this.Initialized && this.aux() && !bl2) {
            this.a(mce.usi.bD(bqs2.az()));
        }
        if (cug.uA((int)bqs2.az())) {
            this.dBQ.awg();
        }
    }

    private void a(bqs bqs2, boolean bl2, boolean bl3) {
        assert (bqs2 != null);
        if (!this.Initialized || this.dBP == null) {
            bqs2.aN(true);
            return;
        }
        if (bqs2.auX()) {
            boolean bl4 = ResourceTree.isDescendant(bqs2.az(), cug.fmO);
            cdb cdb2 = (cdb)this.dBP;
            if (bl4) {
                cdb2.B(bqs2);
            } else {
                cdb2.z(bqs2);
            }
        }
        bqs2.aN(true);
        this.b(1, bqs2);
        if (this.Initialized && this.aux() && !bl2 && !bl3) {
            this.a(mce.usn.bD(bqs2.az()));
        }
    }

    private void n(bqs bqs2) {
        assert (bqs2 != null);
        if (this.dBP == null) {
            bqs2.aN(false);
            return;
        }
        bqs2.aN(false);
        cdb cdb2 = (cdb)this.dBP;
        if (ResourceTree.isDescendant(bqs2.az(), cug.fmO)) {
            cdb2.C(bqs2);
        } else {
            cdb2.A(bqs2);
        }
        this.b(1, bqs2);
        if (this.Initialized && this.aux()) {
            this.a(mce.usu.bD(bqs2.az()));
        }
    }

    private void o(bqs bqs2) {
        assert (bqs2 != null);
        if (!bqs2.auV()) {
            lfn.b(5, "SFInventoryPlayerClient", "withdrawInventoryItem() Item " + bqs2.getGUID() + " is not deposited.");
            return;
        }
        alc.a a2 = alc.a.getEnchantmentSlotType(bqs2.AS());
        if (a2 == null) {
            lfn.b(5, "SFInventoryPlayerClient", "withdrawInventoryItem() Invalid slotnumber provided: " + bqs2.AS());
            return;
        }
        bqg bqg2 = this.dIr.get((Object)a2);
        if (bqg2 == null) {
            lfn.b(5, "SFInventoryPlayerClient", "withdrawInventoryItem() EnchantmentSlot " + (Object)((Object)a2) + " was not found.");
            lfn.b(5, "SFInventoryPlayerClient", "withdrawInventoryItem() " + bqs2);
            return;
        }
        if (bqg2.dBI == null) {
            lfn.b(5, "SFInventoryPlayerClient", "withdrawInventoryItem() No item is deposited in slot " + (Object)((Object)a2));
            return;
        }
        if (!bqg2.dBI.getGUID().equals(bqs2.getGUID())) {
            lfn.b(5, "SFInventoryPlayerClient", "withdrawInventoryItem() Slot.Item=" + bqg2.dBI.getGUID());
            lfn.b(5, "SFInventoryPlayerClient", "withdrawInventoryItem() InventoryItem=" + bqs2.getGUID());
            return;
        }
        bqg2.dBI = null;
        bqs2.auY();
    }
}

