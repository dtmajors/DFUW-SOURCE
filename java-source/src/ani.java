/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cwx
 *  cxd
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class ani {
    private static final String bFd = "antitank";
    private static final String bFe = "disabling";
    private static final String bFf = "alt special";

    public static void a(anm anm2, b b2) {
        if (b2 == null) {
            return;
        }
        if (anm2 == null) {
            return;
        }
        if (b2.bFy != null && anm2.cS(b2.bFy)) {
            anm2.a(b2.bFy, anm.b.bGu);
        }
        if (b2.bFs != null && anm2.cS(b2.bFs)) {
            anm2.a(b2.bFs, anm.b.bGu);
        }
    }

    public static boolean c(cwx cwx2) {
        if (cwx2 == null) {
            return false;
        }
        return cwx2.bef() != cwx.a.fGr;
    }

    public static boolean d(cwx cwx2) {
        if (cwx2 == null) {
            return false;
        }
        if (cwx2.bef() == cwx.a.fGr) {
            return false;
        }
        return cwx2.bef() != cwx.a.fGs;
    }

    public static boolean a(asd asd2, ldv ldv2, cwx cwx2, dxr dxr2, ldv ldv3) {
        if (cwx2 == null) {
            return false;
        }
        switch (cwx2.bef()) {
            case fGr: {
                return ani.b(asd2, ldv2, cwx2, dxr2, ldv3);
            }
            case fGu: 
            case fGs: {
                dcn dcn2 = (dcn)cwx2.bel();
                if (dcn2.gdh) break;
                ani.a(asd2, ldv2, cwx2, dxr2, ldv3, false);
                break;
            }
        }
        return false;
    }

    public static boolean b(asd asd2, ldv ldv2, cwx cwx2, dxr dxr2, ldv ldv3) {
        if (cwx2 == null) {
            return false;
        }
        if (!asd2.hR(cwx2.zg())) {
            return false;
        }
        if (asd2.hU(cwx2.zg())) {
            return false;
        }
        gjt gjt2 = (gjt)dxr2.h(4617, ldv3, ldv2);
        gjt2.SkillType = cwx2.zg();
        dxr2.F(gjt2);
        return true;
    }

    public static boolean a(asd asd2, ldv ldv2, cwx cwx2, dxr dxr2, ldv ldv3, boolean bl) {
        if (cwx2 == null) {
            return false;
        }
        if (!asd2.hS(cwx2.zg())) {
            return false;
        }
        gjv gjv2 = (gjv)dxr2.h(4618, ldv3, ldv2);
        gjv2.SkillType = cwx2.zg();
        gjv2.jju = bl;
        dxr2.F(gjv2);
        return true;
    }

    public static boolean c(b b2) {
        if (b2 == null) {
            return false;
        }
        if (!b2.bFp.isEnabled()) {
            return false;
        }
        if (b2.bFt != null) {
            for (int i = 0; i < b2.bFt.length; ++i) {
                if (b2.bFt[i].isEnabled()) continue;
                return false;
            }
        }
        return true;
    }

    public static void b(anm anm2, b b2) {
        if (b2 == null) {
            return;
        }
        if (anm2 == null) {
            return;
        }
        if (b2.bFy != null && anm2.cT(b2.bFy)) {
            anm2.a(b2.bFy, anm.b.bGw);
        }
        if (b2.bFs != null && anm2.cT(b2.bFs)) {
            anm2.a(b2.bFs, anm.b.bGw);
        }
    }

    public static boolean a(anm anm2, alu[] aluArray) {
        if (anm2 == null) {
            return false;
        }
        if (!anm2.HT()) {
            return false;
        }
        if (aluArray == null) {
            return false;
        }
        List<bsl> list = ani.f(anm2);
        if (list == null) {
            return false;
        }
        for (bsl bsl2 : list) {
            if (bsl2.awz().toLowerCase().contains("stamina") || bsl2.awz().toLowerCase().contains("health") || bsl2.awz().toLowerCase().contains("mana")) continue;
            for (alu alu2 : aluArray) {
                if (!cug.bf((int)bsl2.az(), (int)alu2.CD())) continue;
                return anm2.a(bsl2.getGUID(), anm.b.bGv);
            }
        }
        return false;
    }

    public static boolean a(anm anm2) {
        if (anm2 == null) {
            return false;
        }
        if (!anm2.HT()) {
            return false;
        }
        List<bsl> list = ani.f(anm2);
        if (list == null) {
            return false;
        }
        for (bsl bsl2 : list) {
            if (!bsl2.awz().toLowerCase().contains("health")) continue;
            return anm2.a(bsl2.getGUID(), anm.b.bGv);
        }
        return false;
    }

    public static boolean b(anm anm2) {
        if (anm2 == null) {
            return false;
        }
        if (!anm2.HT()) {
            return false;
        }
        List<bsl> list = ani.f(anm2);
        if (list == null) {
            return false;
        }
        for (bsl bsl2 : list) {
            if (!bsl2.awz().toLowerCase().contains("mana")) continue;
            return anm2.a(bsl2.getGUID(), anm.b.bGv);
        }
        return false;
    }

    public static boolean c(anm anm2) {
        if (anm2 == null) {
            return false;
        }
        if (!anm2.HT()) {
            return false;
        }
        List<bsl> list = ani.f(anm2);
        if (list == null) {
            return false;
        }
        for (bsl bsl2 : list) {
            if (!bsl2.awz().toLowerCase().contains("stamina")) continue;
            return anm2.a(bsl2.getGUID(), anm.b.bGv);
        }
        return false;
    }

    public static boolean d(anm anm2) {
        if (anm2 == null) {
            return false;
        }
        Iterator<bsl> iterator = ani.e(anm2).iterator();
        if (iterator.hasNext()) {
            bsl bsl2 = iterator.next();
            anm2.a(bsl2.getGUID(), anm.b.bGv);
            return true;
        }
        return false;
    }

    public static cwx a(asd asd2, b b2, c c2, a a2) {
        cwx cwx2 = null;
        if (b2 == null) {
            return cwx2;
        }
        switch (b2.bFx) {
            case bFB: 
            case bFC: {
                if (a2 == a.bFl) {
                    cwx2 = b2.bFu;
                    break;
                }
                if (a2 != a.bFj ? a2 == a.bFk && (cwx2 = b2.bFw) != null : (cwx2 = b2.bFv) != null) break;
                if (b2.bFt != null && arw.Sw() < 0.3) {
                    cwx2 = b2.bFt[arw.hK(b2.bFt.length)];
                    break;
                }
                cwx2 = b2.bFp;
                break;
            }
            case bFA: {
                cwx2 = ani.a(asd2, b2, c2);
                break;
            }
        }
        return cwx2;
    }

    public static b a(anm anm2, anr anr2) {
        if (!anr2.Mb()) {
            return null;
        }
        List<bsl> list = ani.a(anm2, cug.fiD);
        if (list == null) {
            return null;
        }
        b b2 = ani.a(anr2);
        if (b2 == null) {
            return null;
        }
        b2.bFy = list.get(0).getGUID();
        b2.bFx = b.a.bFA;
        return b2;
    }

    public static b b(anm anm2, anr anr2) {
        if (!anr2.Mc()) {
            return null;
        }
        List<bsl> list = ani.a(anm2, cug.fiE);
        if (list == null) {
            return null;
        }
        b b2 = ani.a(list, anm2, anr2, cxd.fIl);
        if (b2 == null) {
            return null;
        }
        List<bsl> list2 = ani.g(anm2);
        if (list2 != null && bqm.d.isOneHandedWeapon(bqm.d.getWeaponType(anm2.cW(b2.bFy).az()))) {
            b2.bFs = list2.get(0).getGUID();
        }
        b2.bFx = b.a.bFB;
        return b2;
    }

    public static b c(anm anm2, anr anr2) {
        if (!anr2.Md()) {
            return null;
        }
        List<bsl> list = ani.a(anm2, cug.fiF);
        if (list == null) {
            return null;
        }
        b b2 = ani.a(list, anm2, anr2, cxd.fIl);
        if (b2 == null) {
            return null;
        }
        b2.bFx = b.a.bFC;
        return b2;
    }

    public static b d(anm anm2, anr anr2) {
        if (!anr2.Mb()) {
            return null;
        }
        List<bsl> list = ani.a(anm2, cug.fiB);
        if (list == null) {
            return null;
        }
        b b2 = ani.a(anr2);
        if (b2 == null) {
            return null;
        }
        b2.bFy = list.get(0).getGUID();
        b2.bFx = b.a.bFA;
        return b2;
    }

    public static b e(anm anm2, anr anr2) {
        if (!anr2.Mc()) {
            return null;
        }
        List<bsl> list = ani.a(anm2, cug.fiC);
        if (list == null) {
            return null;
        }
        b b2 = ani.a(list, anm2, anr2, cxd.fIk);
        if (b2 == null) {
            return null;
        }
        List<bsl> list2 = ani.g(anm2);
        if (list2 != null && bqm.d.isOneHandedWeapon(bqm.d.getWeaponType(anm2.cW(b2.bFy).az()))) {
            b2.bFs = list2.get(0).getGUID();
        }
        b2.bFx = b.a.bFB;
        return b2;
    }

    public static b f(anm anm2, anr anr2) {
        if (!anr2.Md()) {
            return null;
        }
        List<bsl> list = ani.a(anm2, cug.fiu);
        if (list == null) {
            return null;
        }
        b b2 = ani.a(list, anm2, anr2, cxd.fIq);
        if (b2 == null) {
            return null;
        }
        b2.bFx = b.a.bFC;
        return b2;
    }

    public static cwx a(asd asd2, b b2, c c2) {
        if (b2 == null) {
            return null;
        }
        if (c2 == null) {
            return null;
        }
        ArrayList<cwx> arrayList = lcn.emv();
        if (c2 == c.bFJ && b2.bFq != null) {
            for (cwx cwx2 : b2.bFq) {
                if (cwx2.bfA() != cxd.g.fRc && cwx2.bfA() != cxd.g.fRh || asd2.hU(cwx2.zg())) continue;
                arrayList.add(cwx2);
            }
        }
        if (c2 == c.bFG && b2.bFn != null) {
            for (cwx cwx2 : b2.bFn) {
                if (cwx2.bfA() != cxd.g.fRc && cwx2.bfA() != cxd.g.fRh || asd2.hU(cwx2.zg())) continue;
                arrayList.add(cwx2);
            }
        }
        if (c2 == c.bFI && b2.bFq != null) {
            for (cwx cwx2 : b2.bFq) {
                if (cwx2.bfA() != cxd.g.fRd && cwx2.bfA() != cxd.g.fRe || asd2.hU(cwx2.zg())) continue;
                arrayList.add(cwx2);
            }
        }
        if (c2 == c.bFF && b2.bFn != null) {
            for (cwx cwx2 : b2.bFn) {
                if (cwx2.bfA() != cxd.g.fRd && cwx2.bfA() != cxd.g.fRe || asd2.hU(cwx2.zg())) continue;
                arrayList.add(cwx2);
            }
        }
        if (c2 == c.bFL && b2.bFr != null) {
            for (cwx cwx2 : b2.bFr) {
                if (cwx2.bfA() != cxd.g.fRb && cwx2.bfA() != cxd.g.fRe && cwx2.bfA() != cxd.g.fRd || asd2.hU(cwx2.zg()) || cwx2.getName().toLowerCase().contains(bFd)) continue;
                arrayList.add(cwx2);
            }
        }
        if (c2 == c.bFK && b2.bFr != null) {
            for (cwx cwx2 : b2.bFr) {
                if (cwx2.bfA() != cxd.g.fRg && cwx2.bfA() != cxd.g.fRf || asd2.hU(cwx2.zg()) || cwx2.getName().toLowerCase().contains(bFd)) continue;
                arrayList.add(cwx2);
            }
        }
        if (c2 == c.bFM && b2.bFr != null) {
            for (cwx cwx2 : b2.bFr) {
                if (cwx2.bfA() != cxd.g.fRc || asd2.hU(cwx2.zg()) || cwx2.getName().toLowerCase().contains(bFd)) continue;
                arrayList.add(cwx2);
            }
        }
        if (c2 == c.bFN && b2.bFr != null) {
            for (cwx cwx2 : b2.bFr) {
                if (cwx2.bfA() != cxd.g.fRg && cwx2.bfA() != cxd.g.fRf && cwx2.bfA() != cxd.g.fRb && cwx2.bfA() != cxd.g.fRe && cwx2.bfA() != cxd.g.fRd || asd2.hU(cwx2.zg()) || !cwx2.getName().toLowerCase().contains(bFd)) continue;
                arrayList.add(cwx2);
            }
        }
        if (c2 == c.bFH && b2.bFo != null) {
            for (cwx cwx2 : b2.bFo) {
                if (cwx2.bfA() != cxd.g.fRg && cwx2.bfA() != cxd.g.fRf && cwx2.bfA() != cxd.g.fRb && cwx2.bfA() != cxd.g.fRe && cwx2.bfA() != cxd.g.fRd || asd2.hU(cwx2.zg())) continue;
                arrayList.add(cwx2);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (cwx)arrayList.get(arw.hK(arrayList.size()));
    }

    public static b g(anm anm2, anr anr2) {
        if (!anr2.Me()) {
            return null;
        }
        List<bsl> list = ani.a(anm2, cug.fiK);
        if (list == null) {
            return null;
        }
        b b2 = ani.a(list, anm2, anr2, cxd.fIq);
        if (b2 == null) {
            return null;
        }
        b2.bFx = b.a.bFD;
        return b2;
    }

    public static void c(anm anm2, b b2) {
        if (b2 == null) {
            return;
        }
        if (anm2 == null) {
            return;
        }
        if (b2.bFy != null && anm2.cU(b2.bFy)) {
            anm2.a(b2.bFy, anm.b.bGy);
        }
    }

    public static void d(anm anm2, b b2) {
        if (b2 == null) {
            return;
        }
        if (anm2 == null) {
            return;
        }
        if (b2.bFy == null) {
            return;
        }
        if (b2.bFy != null && anm2.cV(b2.bFy)) {
            anm2.a(b2.bFy, anm.b.bGz);
        }
    }

    private static List<bsl> e(anm anm2) {
        return ani.a(anm2, cug.fjZ);
    }

    private static cwx[] q(Map<Integer, SortedSet<cxc>> map) {
        if (map == null) {
            return null;
        }
        int n = 0;
        for (SortedSet<cxc> sortedSet : map.values()) {
            n += sortedSet.size();
        }
        if (n < 1) {
            return null;
        }
        cwx[] cwxArray = new cwx[n];
        int n2 = 0;
        for (SortedSet<cxc> sortedSet : map.values()) {
            for (cxc cxc2 : sortedSet) {
                cwxArray[n2] = (cwx)cxc2;
                ++n2;
            }
        }
        return cwxArray;
    }

    private static List<bsl> a(anm anm2, int n) {
        if (anm2 == null) {
            return null;
        }
        return anm2.hs(n);
    }

    private static List<bsl> f(anm anm2) {
        return ani.a(anm2, cug.fkk);
    }

    private static List<bsl> g(anm anm2) {
        return ani.a(anm2, cug.fkF);
    }

    private static b a(List<bsl> list, anm anm2, anr anr2, int n) {
        float f = -1.0f;
        b b2 = new b();
        for (bsl bsl2 : list) {
            float f2;
            int n2 = cxj.yz(bsl2.az());
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == cxd.fIm) {
                n3 = cxd.fHW;
                n4 = cxd.fHX;
                n5 = cxd.fIl;
            } else if (n2 == cxd.fIn) {
                n3 = cxd.fIo;
                n4 = cxd.fIp;
                n5 = cxd.fIl;
            } else {
                n3 = cxj.b(n2, cxd.l.fRN);
                n4 = cxj.b(n2, cxd.l.fRR);
                n5 = n;
            }
            TreeSet treeSet = (TreeSet)anr2.f(n5, n2, n3);
            TreeSet treeSet2 = (TreeSet)anr2.f(n5, n2, n4);
            if (treeSet == null || treeSet.isEmpty() || !(f < (f2 = ((cxc)treeSet.first()).Bt()))) continue;
            f = f2;
            b2.bFy = bsl2.getGUID();
            b2.bFp = (cwx)treeSet.first();
            b2.bFt = null;
            b2.bFu = null;
            b2.bFv = null;
            b2.bFw = null;
            b2.bFz = anm2.dK(bsl2.awz());
            if (treeSet2 == null || treeSet2.isEmpty()) continue;
            Iterator iterator = treeSet2.iterator();
            while (iterator.hasNext()) {
                cxc cxc2 = (cxc)iterator.next();
                if (cxc2.getName().toLowerCase().contains(bFd)) {
                    b2.bFu = (cwx)cxc2;
                    iterator.remove();
                    continue;
                }
                if (cxc2.getName().toLowerCase().contains(bFe)) {
                    b2.bFv = (cwx)cxc2;
                    iterator.remove();
                    continue;
                }
                if (!cxc2.getName().toLowerCase().contains(bFf)) continue;
                b2.bFw = (cwx)cxc2;
                iterator.remove();
            }
            if (treeSet2.isEmpty()) continue;
            b2.bFt = treeSet2.toArray(new cwx[treeSet2.size()]);
        }
        if (f < 0.0f) {
            return null;
        }
        return b2;
    }

    private static b a(anr anr2) {
        b b2 = new b();
        Map<Integer, SortedSet<cxc>> map = anr2.N(cxd.fJq, cxd.h.fRo.ordinal());
        Map<Integer, SortedSet<cxc>> map2 = anr2.N(cxd.fJq, cxd.h.fRm.ordinal());
        Map<Integer, SortedSet<cxc>> map3 = anr2.N(cxd.fJq, cxd.h.fRl.ordinal());
        Map<Integer, SortedSet<cxc>> map4 = anr2.N(cxd.fJq, cxd.h.fRn.ordinal());
        b2.bFr = ani.q(map);
        b2.bFo = ani.q(map2);
        b2.bFn = ani.q(map3);
        b2.bFq = ani.q(map4);
        if (map == null && map2 == null && map3 == null && map4 == null) {
            return null;
        }
        return b2;
    }
}

