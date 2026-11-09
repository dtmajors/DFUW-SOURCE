/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;

public final class anr
extends btk {
    public static final Comparator<cxc> bHl = new Comparator<cxc>(){

        public int a(cxc cxc2, cxc cxc3) {
            float f;
            float f2 = cxc2.Bt();
            if (f2 > (f = cxc3.Bt())) {
                return -1;
            }
            if (f2 < f) {
                return 1;
            }
            return cxc2.f(cxc3);
        }

        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((cxc)object, (cxc)object2);
        }
    };
    private static final int bHm = 255;
    private final ldv SA;
    private boolean bGn;
    private final Map<Integer, Map<Integer, Map<Integer, SortedSet<cxc>>>> bxK = lcn.emw();
    private final Map<Integer, cxc> bHn = lcn.emw();

    public anr(ldv ldv2) {
        this.SA = ldv2;
    }

    public boolean Mb() {
        return this.bxK.get(cxd.fJq) != null;
    }

    public boolean a(cxd.h h2) {
        return this.bxK.get(cxd.fJq) != null && this.bxK.get(cxd.fJq).get(h2.ordinal()) != null;
    }

    public boolean Mc() {
        return this.bxK.get(cxd.fIk) != null || this.bxK.get(cxd.fIl) != null && this.bxK.get(cxd.fIl).get(cxd.fIm) != null;
    }

    public boolean Md() {
        return this.bxK.get(cxd.fIq) != null || this.bxK.get(cxd.fIl) != null && this.bxK.get(cxd.fIl).get(cxd.fIn) != null;
    }

    public boolean Me() {
        return this.bxK.get(cxd.fIq) != null && this.bxK.get(cxd.fIq).get(cxd.fIr) != null;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.bxK.clear();
        this.bHn.clear();
    }

    public SortedSet<cxc> f(int n, int n2, int n3) {
        try {
            return this.bxK.get(n).get(n2).get(n3);
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    public Map<Integer, SortedSet<cxc>> N(int n, int n2) {
        try {
            return this.bxK.get(n).get(n2);
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    public cxc ht(int n) {
        cxc cxc2 = null;
        cxc2 = this.bHn.get(n);
        return cxc2 == null ? this.a(this.bHn.values().iterator(), n) : cxc2;
    }

    public boolean hu(int n) {
        return this.bHn.containsKey(n) ? true : this.b(this.bHn.keySet().iterator(), n);
    }

    @Override
    public void initialize() {
        super.initialize();
        fvp fvp2 = (fvp)this.MessageDelegator.h(12289, this.GUID, this.SA);
        fvp2.iTm = cbx.a.ekM.ordinal();
        fvp2.dTe = 255;
        this.MessageDelegator.F(fvp2);
        gjg gjg2 = (gjg)this.MessageDelegator.h(4613, this.GUID, this.SA);
        gjg2.jjf = 2;
        this.MessageDelegator.F(gjg2);
    }

    public boolean HT() {
        return this.bGn;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4614: {
                this.a((gjh)dxq2);
                break;
            }
            case 12291: {
                this.a((fvt)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void terminate() {
        fvv fvv2 = (fvv)this.MessageDelegator.h(12290, this.GUID, this.SA);
        fvv2.iTm = cbx.a.ekM.ordinal();
        this.MessageDelegator.F(fvv2);
        this.selfDestruct();
        this.MessageDelegator.oa(this.GUID);
    }

    private void a(int n, int n2, int n3, cxc cxc2) {
        SortedSet<cxc> sortedSet;
        Map<Integer, SortedSet<cxc>> map;
        Map<Integer, Map<Integer, SortedSet<cxc>>> map2 = this.bxK.get(n);
        if (map2 == null) {
            map2 = lcn.emw();
            this.bxK.put(n, map2);
        }
        if ((map = map2.get(n2)) == null) {
            map = lcn.emw();
            map2.put(n2, map);
        }
        if ((sortedSet = map.get(n3)) == null) {
            sortedSet = lcn.g(bHl);
            map.put(n3, sortedSet);
        }
        sortedSet.remove(cxc2);
        sortedSet.add(cxc2);
    }

    private cxc a(Iterator<cxc> iterator, int n) {
        while (iterator.hasNext()) {
            cxc cxc2 = iterator.next();
            if (!lea.enZ().isDescendant(cxc2.zg(), n)) continue;
            return cxc2;
        }
        return null;
    }

    private void a(fvt fvt2) {
        gjg gjg2 = (gjg)this.MessageDelegator.h(4613, this.GUID, this.SA);
        gjg2.jjf = 2;
        this.MessageDelegator.F(gjg2);
    }

    private void a(gjh gjh2) {
        cxc[] cxcArray = gjh2.jiJ;
        if (cxcArray != null) {
            block8: for (cxc cxc2 : cxcArray) {
                cxc cxc3 = this.bHn.get(cxc2.zg());
                if (cxc3 != null && (!cxc3.equals(cxc2) || ldq.ai(cxc3.Bt(), cxc2.Bt()))) continue;
                this.bHn.put(cxc2.zg(), cxc2);
                if (lea.enZ().isDescendant(cxc2.zg(), cxd.fIs)) {
                    if (lea.enZ().isDescendant(cxc2.zg(), cxd.fIl)) {
                        if (lea.enZ().isDescendant(cxc2.zg(), cxd.fIm)) {
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fHW)) {
                                this.a(cxd.fIl, cxd.fIm, cxd.fHW, cxc2);
                                continue;
                            }
                            if (!lea.enZ().isDescendant(cxc2.zg(), cxd.fHX)) continue;
                            this.a(cxd.fIl, cxd.fIm, cxd.fHX, cxc2);
                            continue;
                        }
                        if (!lea.enZ().isDescendant(cxc2.zg(), cxd.fIn)) continue;
                        if (lea.enZ().isDescendant(cxc2.zg(), cxd.fIo)) {
                            this.a(cxd.fIl, cxd.fIn, cxd.fIo, cxc2);
                            continue;
                        }
                        if (!lea.enZ().isDescendant(cxc2.zg(), cxd.fIp)) continue;
                        this.a(cxd.fIl, cxd.fIn, cxd.fIp, cxc2);
                        continue;
                    }
                    if (lea.enZ().isDescendant(cxc2.zg(), cxd.fIk)) {
                        if (lea.enZ().isDescendant(cxc2.zg(), cxd.fIZ)) {
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fJa)) {
                                this.a(cxd.fIk, cxd.fIZ, cxd.fJa, cxc2);
                                continue;
                            }
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fJb)) {
                                this.a(cxd.fIk, cxd.fIZ, cxd.fJb, cxc2);
                                continue;
                            }
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fJc)) {
                                this.a(cxd.fIk, cxd.fIZ, cxd.fJc, cxc2);
                                continue;
                            }
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fJd)) {
                                this.a(cxd.fIk, cxd.fIZ, cxd.fJd, cxc2);
                                continue;
                            }
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fJe)) {
                                this.a(cxd.fIk, cxd.fIZ, cxd.fJe, cxc2);
                                continue;
                            }
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fJf)) {
                                this.a(cxd.fIk, cxd.fIZ, cxd.fJf, cxc2);
                                continue;
                            }
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fJg)) {
                                this.a(cxd.fIk, cxd.fIZ, cxd.fJg, cxc2);
                                continue;
                            }
                            if (!lea.enZ().isDescendant(cxc2.zg(), cxd.fJh)) continue;
                            this.a(cxd.fIk, cxd.fIZ, cxd.fJh, cxc2);
                            continue;
                        }
                        if (lea.enZ().isDescendant(cxc2.zg(), cxd.fIc)) {
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fHP)) {
                                this.a(cxd.fIk, cxd.fHP, cxd.fHP, cxc2);
                                continue;
                            }
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fHQ)) {
                                this.a(cxd.fIk, cxd.fHQ, cxd.fHQ, cxc2);
                                continue;
                            }
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fHS)) {
                                this.a(cxd.fIk, cxd.fHS, cxd.fHS, cxc2);
                                continue;
                            }
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fHT)) {
                                this.a(cxd.fIk, cxd.fHT, cxd.fHT, cxc2);
                                continue;
                            }
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fHU)) {
                                this.a(cxd.fIk, cxd.fHU, cxd.fHU, cxc2);
                                continue;
                            }
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fHV)) {
                                this.a(cxd.fIk, cxd.fHV, cxd.fHV, cxc2);
                                continue;
                            }
                            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fHY)) {
                                this.a(cxd.fIk, cxd.fHY, cxd.fHY, cxc2);
                                continue;
                            }
                            if (!lea.enZ().isDescendant(cxc2.zg(), cxd.fIa)) continue;
                            this.a(cxd.fIk, cxd.fIa, cxd.fIa, cxc2);
                            continue;
                        }
                        if (!lea.enZ().isDescendant(cxc2.zg(), cxd.fIj)) continue;
                        this.a(cxd.fIk, cxd.fIj, cxd.fIj, cxc2);
                        continue;
                    }
                    if (!lea.enZ().isDescendant(cxc2.zg(), cxd.fIq)) continue;
                    if (lea.enZ().isDescendant(cxc2.zg(), cxd.fIe)) {
                        if (lea.enZ().isDescendant(cxc2.zg(), cxd.fIg)) {
                            this.a(cxd.fIq, cxd.fHN, cxd.fHN, cxc2);
                            continue;
                        }
                        if (!lea.enZ().isDescendant(cxc2.zg(), cxd.fIh)) continue;
                        this.a(cxd.fIq, cxd.fIh, cxd.fKg, cxc2);
                        continue;
                    }
                    if (lea.enZ().isDescendant(cxc2.zg(), cxd.fIf)) {
                        this.a(cxd.fIq, cxd.fIf, cxd.fIf, cxc2);
                        continue;
                    }
                    if (!lea.enZ().isDescendant(cxc2.zg(), cxd.fIr) || !lea.enZ().isDescendant(cxc2.zg(), cxd.fIb)) continue;
                    this.a(cxd.fIq, cxd.fIr, cxd.fIb, cxc2);
                    continue;
                }
                if (!lea.enZ().isDescendant(cxc2.zg(), cxd.fJq)) continue;
                switch (cxc2.bfD()) {
                    case fRk: {
                        continue block8;
                    }
                    case fRl: 
                    case fRm: 
                    case fRn: 
                    case fRo: {
                        switch (cxc2.bfA()) {
                            case fRa: {
                                continue block8;
                            }
                            case fRb: 
                            case fRc: 
                            case fRd: 
                            case fRe: 
                            case fRf: 
                            case fRg: 
                            case fRh: 
                            case fRi: {
                                this.a(cxd.fJq, cxc2.bfD().ordinal(), cxc2.bfA().ordinal(), cxc2);
                                continue block8;
                            }
                        }
                        continue block8;
                    }
                }
            }
        }
        this.bGn = true;
    }

    private boolean b(Iterator<Integer> iterator, int n) {
        while (iterator.hasNext()) {
            int n2 = iterator.next();
            if (!lea.enZ().isDescendant(n2, n)) continue;
            return true;
        }
        return false;
    }
}

