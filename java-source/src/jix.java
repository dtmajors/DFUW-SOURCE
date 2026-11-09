/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.ArrayList;
import java.util.HashSet;

public class jix {
    private static final int[] nhw = new int[]{cug.fiL, cug.fjk, cug.fjw, cug.fjN, cug.fjP, cug.fkf, cug.fmO, cug.fkk, cug.fjZ, cug.fpT, cug.fke, cug.fnn, cug.fpP, cug.fqt, cug.fpU};
    private i nhx = new i(this, null);
    private HashSet<c> nhy = new HashSet();

    public jix() {
        this.nhy.add(this.nhx);
    }

    public void d(bsf bsf2) {
        if (bsf2 instanceof brt) {
            this.b((brt)bsf2);
        } else if (bsf2 instanceof bsc) {
            this.b((bsc)bsf2);
        } else {
            throw new RuntimeException("invalid vendor inventory item");
        }
    }

    public void e(bsf bsf2) {
        c c2 = this.nhx.f(bsf2);
        if (c2 != null) {
            c2.dHN().a(c2);
        }
    }

    public void pb(int n) {
        c c2 = this.nhx.nhz.UR(n);
        if (c2 != null) {
            c2.nhC.a(c2);
        }
    }

    public a dHI() {
        return this.nhx;
    }

    public void dHJ() {
        this.nhx.dHJ();
    }

    public void sort() {
        this.nhx.sort();
    }

    public c UM(int n) {
        ArrayList<c> arrayList = this.UP(n);
        c c2 = jix.f(arrayList);
        return c2;
    }

    void println() {
        this.nhx.println(0);
    }

    private static boolean u(lgw lgw2) {
        for (int n : nhw) {
            if (lgw2.getType() != n) continue;
            return true;
        }
        return false;
    }

    private static ArrayList<lgw> UN(int n) {
        les les2 = lea.enW();
        ArrayList<lgw> arrayList = new ArrayList<lgw>();
        while (true) {
            lgw lgw2 = (lgw)les2.acv(n);
            assert (lgw2 != null);
            arrayList.add(lgw2);
            if (jix.u(lgw2)) break;
            lgw lgw3 = (lgw)les2.i(lgw2);
            if (lgw3 == null) {
                return null;
            }
            n = lgw3.getType();
            lgw2 = lgw3;
        }
        return arrayList;
    }

    private void b(brt brt2) {
        ArrayList<lgw> arrayList = jix.UN(brt2.az());
        if (arrayList != null) {
            this.nhx.nhz.a((a)this.nhx, brt2, arrayList, arrayList.size() - 1);
        }
    }

    private static ArrayList<ldy> UO(int n) {
        les les2 = lea.eob();
        ArrayList<ldy> arrayList = new ArrayList<ldy>();
        while (true) {
            ldy ldy2;
            if ((ldy2 = (ldy)les2.acv(n)) == null) {
                return null;
            }
            arrayList.add(ldy2);
            ldy ldy3 = (ldy)les2.i(ldy2);
            ldy ldy4 = (ldy)les2.i(ldy3);
            if (ldy4 == null) break;
            n = ldy3.getType();
            ldy2 = ldy3;
        }
        return arrayList;
    }

    private void b(bsc bsc2) {
        if (hso.cxK().cxP().cyZ().ht(bsc2.zg()) != null) {
            return;
        }
        ArrayList<ldy> arrayList = jix.UO(bsc2.zg());
        if (arrayList != null) {
            this.nhx.nhz.a((a)this.nhx, bsc2, arrayList, arrayList.size() - 1);
        }
    }

    private ArrayList<c> UP(int n) {
        ArrayList<c> arrayList = new ArrayList<c>();
        les les2 = lea.enW();
        for (c c2 : this.nhy) {
            if (!(c2 instanceof b) || !les2.isDescendant(((b)((Object)c2)).dhm().getType(), n)) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    private static c e(ArrayList<c> arrayList) {
        ArrayList<c> arrayList2;
        ArrayList<ArrayList<c>> arrayList3 = new ArrayList<ArrayList<c>>();
        int n = Integer.MAX_VALUE;
        ArrayList<c> arrayList4 = null;
        for (c c2 : arrayList) {
            arrayList2 = c2.dHO();
            if (arrayList2.size() < n) {
                n = arrayList2.size();
                arrayList4 = arrayList2;
            }
            arrayList3.add(arrayList2);
        }
        ArrayList arrayList5 = (ArrayList)arrayList3.get(0);
        for (int j = 1; j < n; ++j) {
            arrayList2 = (c)arrayList5.get(j);
            for (int k = 1; k < arrayList3.size(); ++k) {
                ArrayList arrayList6 = (ArrayList)arrayList3.get(k);
                if (arrayList6.get(j) == arrayList2) continue;
                return (c)arrayList5.get(j - 1);
            }
        }
        return arrayList4.get(arrayList4.size() - 1);
    }

    private static c f(ArrayList<c> arrayList) {
        ArrayList<c> arrayList2 = new ArrayList<c>();
        int n = Integer.MAX_VALUE;
        for (c c2 : arrayList) {
            int n2 = c2.getDepth();
            if (n2 < n) {
                arrayList2.clear();
                arrayList2.add(c2);
                n = n2;
                continue;
            }
            if (n2 != n) continue;
            arrayList2.add(c2);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        if (arrayList2.size() == 1) {
            return arrayList2.get(0);
        }
        return jix.e(arrayList2);
    }

    static /* synthetic */ HashSet a(jix jix2) {
        return jix2.nhy;
    }
}

