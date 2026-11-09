/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  ep
 */
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class buk
extends btk {
    private final Map<cxd.k, List<buj>> dNY = new EnumMap<cxd.k, List<buj>>(cxd.k.class);
    private final List<buj> dNZ = lcn.emv();
    private cew dLR = null;
    private ldv dFg = null;

    public buk(cew cew2) {
        this.dLR = cew2;
    }

    public ldv ayh() {
        return this.dFg;
    }

    public void jM(ldv ldv2) {
        this.dFg = ldv2;
    }

    public boolean a(cxd.k k2, ldv ldv2) {
        if (k2 == null) {
            lfn.b(5, "SFProgressbarManager", "containsProgressbar() ProgressType is null.");
            return false;
        }
        if (ldv2 == null) {
            lfn.b(5, "SFProgressbarManager", "containsProgressbar() ObjectGUID is null.");
            return false;
        }
        return this.d(k2, ldv2) != null;
    }

    public void ayi() {
        if (this.dNZ.isEmpty()) {
            return;
        }
        int n = this.dNZ.size();
        for (int i = 0; i < n; ++i) {
            buj buj2 = this.dNZ.get(i);
            this.a(buj2.dBm, buj2.Rs, buj2.aXq, buj2.dBo, buj2.dBp, buj2.dNX);
        }
        this.dNZ.clear();
    }

    public void a(cxd.k k2, ldv ldv2, double d2, double d3) {
        buj buj2 = new buj();
        buj2.dBm = k2;
        buj2.Rs = ldv2;
        buj2.dBn = false;
        buj2.dNX = false;
        buj2.aXq = d2;
        buj2.dBo = d3;
        buj2.dBp = d3;
        this.dNZ.add(buj2);
    }

    public void b(cxd.k k2, ldv ldv2, double d2, double d3) {
        this.a(k2, ldv2, d2, d3, d3, false);
    }

    public void a(cxd.k k2, ldv ldv2, double d2, double d3, boolean bl2) {
        this.a(k2, ldv2, d2, d3, d3, bl2);
    }

    public void a(cxd.k k2, ldv ldv2, double d2, double d3, double d4, boolean bl2) {
        if (k2 == null) {
            lfn.b(5, "SFProgressbarManager", "createProgressbar() ProgressType is null.");
            return;
        }
        if (ldv2 == null) {
            lfn.b(5, "SFProgressbarManager", "createProgressbar() ObjectGUID is null.");
            return;
        }
        if (d2 < 0.0) {
            lfn.b(5, "SFProgressbarManager", "createProgressbar() TimeStart is invalid.");
            return;
        }
        if (d3 <= 0.0) {
            lfn.b(5, "SFProgressbarManager", "createProgressbar() TimeRequired is invalid.");
            return;
        }
        if (d4 <= 0.0) {
            lfn.b(5, "SFProgressbarManager", "createProgressbar() TimeEnd is invalid.");
            return;
        }
        if (d3 < d2) {
            lfn.b(5, "SFProgressbarManager", "createProgressbar() TimeRequired < TimeStart.");
            return;
        }
        if (d4 < d3) {
            lfn.b(5, "SFProgressbarManager", "createProgressbar() TimeEnd < TimeRequired.");
            return;
        }
        buj buj2 = new buj();
        buj2.dBm = k2;
        buj2.Rs = ldv2;
        buj2.aXq = d2;
        buj2.dBo = d3;
        buj2.dBp = d4;
        buj2.dBn = false;
        buj2.dNX = bl2;
        List<buj> list = this.dNY.get((Object)k2);
        if (list == null) {
            list = lcn.abH(2);
            this.dNY.put(k2, list);
        } else if (this.a(k2, ldv2, list) >= 0) {
            lfn.b(5, "SFProgressbarManager", "createProgressbar() Progressbar already exists.");
            lfn.b(5, "SFProgressbarManager", "createProgressbar() ProgressType='" + (Object)((Object)k2) + "' ObjectGUID=" + ldv2);
            return;
        }
        list.add(buj2);
        this.a(buj2);
        if (k2 == cxd.k.fRD) {
            this.b(k2, ldv2);
        }
    }

    public boolean a(cxd.k k2) {
        if (this.dNY == null) {
            return false;
        }
        if (this.dNY.isEmpty()) {
            return false;
        }
        List<buj> list = this.dNY.get((Object)k2);
        if (list == null) {
            return false;
        }
        return !list.isEmpty();
    }

    public void a(ldv ldv2, cxd.k k2, double d2) {
        assert (this.dNY != null);
        assert (!this.dNY.isEmpty());
        List<buj> list = this.dNY.get((Object)k2);
        assert (list != null);
        assert (!list.isEmpty());
        buj buj2 = this.d(k2, ldv2);
        assert (buj2 != null);
        this.a(k2, d2, ldv2);
    }

    public void a(ldv ldv2, cxd.k k2, double d2, double d3) {
        assert (this.dNY != null);
        assert (!this.dNY.isEmpty());
        List<buj> list = this.dNY.get((Object)k2);
        assert (list != null);
        assert (!list.isEmpty());
        buj buj2 = this.d(k2, ldv2);
        assert (buj2 != null);
        double d4 = buj2.dBp - buj2.aXq;
        double d5 = (buj2.dBp - buj2.aXq) * d2;
        buj2.dBp = d3 + d5;
        double d6 = d3 - (d4 - d5);
        this.a(k2, d6, ldv2);
    }

    public void aZ(double d2) {
        List<buj> list = this.dNY.get((Object)cxd.k.fRG);
        if (list == null || list.isEmpty()) {
            list = this.dNY.get((Object)cxd.k.fRH);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        buj buj2 = list.get(0);
        assert (buj2 != null);
        double d3 = this.MessageDelegator.arc().rgz;
        double d4 = buj2.dBp - buj2.aXq;
        double d5 = d2 - buj2.aXq;
        buj2.dBp = d3 + d5;
        this.a(buj2.dBm, d5, null);
    }

    public void a(double d2, double d3, double d4, boolean bl2) {
        this.a(bl2 ? cxd.k.fRG : cxd.k.fRH, this.GUID, d2, d3, d4, false);
    }

    public buj[] ayj() {
        ArrayList<buj> arrayList = lcn.abH(2);
        for (List<buj> list : this.dNY.values()) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                arrayList.add(list.get(i).ayg());
            }
        }
        buj[] bujArray = new buj[arrayList.size()];
        arrayList.toArray(bujArray);
        return bujArray;
    }

    public void ayk() {
        if (this.a(cxd.k.fRD, this.dLR.getGUID())) {
            this.e(cxd.k.fRD, this.dLR.getGUID());
        }
    }

    public void mY(int n) {
        cxd.k k2 = cxd.k.getProgressTypeFromMessage(n);
        if (k2 == null) {
            lfn.b(5, "SFProgressbarManager", "notifyProgressbarCanceled() Invalid ProgressTypeOrdinal provided: " + n);
            return;
        }
        List<buj> list = this.dNY.get((Object)k2);
        if (list == null) {
            lfn.b(5, "SFProgressbarManager", "notifyProgressbarCanceled() Could not find a progressbarinfo with progresstype " + (Object)((Object)k2));
            return;
        }
        if (list.isEmpty()) {
            lfn.b(5, "SFProgressbarManager", "notifyProgressbarCanceled() InfoList is empty.");
            lfn.b(5, "SFProgressbarManager", "notifyProgressbarCanceled() Could not find a progressbarinfo with progresstype " + (Object)((Object)k2));
            this.dNY.remove((Object)k2);
            return;
        }
        if (list.size() > 1) {
            lfn.b(5, "SFProgressbarManager", "notifyProgressbarCanceled() InfoList contains more than one progressbarinfo.");
            lfn.b(5, "SFProgressbarManager", "notifyProgressbarCanceled() Unable to find the progressbarinfo to remove.");
            int n2 = list.size();
            for (int i = 0; i < n2; ++i) {
            }
            return;
        }
        buj buj2 = list.get(0);
        this.dLR.aJz().mi(buj2.Rs);
    }

    public void b(cxd.k k2, ldv ldv2) {
        if (k2 == null) {
            lfn.b(5, "SFProgressbarManager", "notifyProgressbarChanged() ProgressType is null.");
            return;
        }
        if (ldv2 == null) {
            lfn.b(5, "SFProgressbarManager", "notifyProgressbarChanged() ObjectGUID is null.");
            return;
        }
        switch (k2) {
            case fRD: {
                byx byx2 = this.dLR.aJD();
                boolean bl2 = byx2 != null ? byx2.aEP().aEE() : false;
                et et2 = this.dLR.fi().ah(1504);
                if (et2 == null) {
                    lfn.b(5, "SFProgressbarManager", "notifyProgressbarChanged() Could not find attribute 'Breath'");
                    return;
                }
                et et3 = this.dLR.fi().ah(ep.k((int)1504, (int)2));
                if (et3 == null) {
                    lfn.b(5, "SFProgressbarManager", "notifyProgressbarChanged() Could not find attribute 'Breath Max'");
                    return;
                }
                if (et2.fN() >= et3.fN()) {
                    if (!this.a(k2, ldv2)) break;
                    this.c(k2, ldv2);
                    break;
                }
                if (this.a(k2, ldv2)) {
                    this.a(k2, et2.fN(), null);
                    break;
                }
                et et4 = this.dLR.fi().ah(ep.k((int)1504, (int)1));
                if (et4 == null) {
                    lfn.b(5, "SFProgressbarManager", "notifyProgressbarChanged() Could not find attribute 'Breath Min'");
                    return;
                }
                if (!bl2) break;
                this.b(k2, ldv2, et4.fN(), et3.fN());
                break;
            }
            default: {
                lfn.b(5, "SFProgressbarManager", "notifyProgressbarChanged() Invalid progresstype provided: " + (Object)((Object)k2));
                return;
            }
        }
    }

    public void c(cxd.k k2, ldv ldv2) {
        assert (k2 != cxd.k.fRJ);
        this.a(k2, ldv2, 0.0);
    }

    public void a(cxd.k k2, ldv ldv2, double d2) {
        if (k2 == null) {
            lfn.b(5, "SFProgressbarManager", "removeProgressbar() ProgressType is null.");
            return;
        }
        if (ldv2 == null) {
            lfn.b(5, "SFProgressbarManager", "removeProgressbar() ObjectGUID is null.");
            return;
        }
        if (k2 == cxd.k.fRJ && d2 <= 0.0) {
            lfn.b(5, "SFProgressbarManager", "removeProgressbar() TimeEnd is invalid.");
            return;
        }
        List<buj> list = this.dNY.get((Object)k2);
        if (list == null) {
            if (this.b(k2, ldv2, d2)) {
                return;
            }
            lfn.b(5, "SFProgressbarManager", "removeProgressbar(1) Could not find progressbarlist.");
            lfn.b(5, "SFProgressbarManager", "removeProgressbar(1) ProgressType='" + (Object)((Object)k2) + "' ObjectGUID=" + ldv2);
            return;
        }
        int n = -1;
        if (d2 > 0.0) {
            n = this.a(k2, ldv2, d2, list);
            if (n < 0) {
                if (this.b(k2, ldv2, d2)) {
                    return;
                }
                return;
            }
        } else {
            n = this.a(k2, ldv2, list);
            if (n < 0) {
                if (this.b(k2, ldv2, d2)) {
                    return;
                }
                lfn.b(5, "SFProgressbarManager", "removeProgressbar() Could not find progressbar in list.");
                lfn.b(5, "SFProgressbarManager", "removeProgressbar() ProgressType='" + (Object)((Object)k2) + "' ObjectGUID=" + ldv2);
                return;
            }
        }
        buj buj2 = list.remove(n);
        if (!buj2.dBn) {
            // empty if block
        }
        this.e(k2, ldv2);
    }

    public void ek(boolean bl2) {
        this.c(bl2 ? cxd.k.fRG : cxd.k.fRH, this.GUID);
    }

    public void ayl() {
        if (this.dFg == null) {
            lfn.b(5, "SFProgressbarManager", "startAllProgressbars() ProgressListenerGUID is not set for " + this.dLR);
            return;
        }
        if (this.dNY.isEmpty()) {
            return;
        }
        for (List<buj> list : this.dNY.values()) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                buj buj2 = list.get(i);
                if (buj2.dBn) continue;
                this.a(buj2);
            }
        }
    }

    private void gt() {
        if (this.dNY.isEmpty()) {
            return;
        }
        for (List<buj> list : this.dNY.values()) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                buj buj2 = list.get(i);
            }
        }
    }

    private int a(cxd.k k2, ldv ldv2, List<buj> list) {
        assert (k2 != null);
        assert (ldv2 != null);
        assert (list != null);
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            buj buj2 = list.get(i);
            assert (buj2.dBm == k2);
            if (!buj2.Rs.equals(ldv2)) continue;
            return i;
        }
        return -1;
    }

    private int a(cxd.k k2, ldv ldv2, double d2, List<buj> list) {
        assert (k2 != null);
        assert (ldv2 != null);
        assert (list != null);
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            buj buj2 = list.get(i);
            assert (buj2.dBm == k2);
            if (!buj2.Rs.equals(ldv2) || buj2.dBp != d2) continue;
            return i;
        }
        return -1;
    }

    private buj d(cxd.k k2, ldv ldv2) {
        assert (k2 != null);
        assert (ldv2 != null);
        List<buj> list = this.dNY.get((Object)k2);
        if (list == null) {
            return null;
        }
        int n = this.a(k2, ldv2, list);
        if (n < 0) {
            return null;
        }
        return list.get(n);
    }

    private boolean b(cxd.k k2, ldv ldv2, double d2) {
        if (k2 == null) {
            lfn.b(5, "SFProgressbarManager", "removeDelayedProgressbar() ProgressType is null.");
            return false;
        }
        if (ldv2 == null) {
            lfn.b(5, "SFProgressbarManager", "removeDelayedProgressbar() ObjectGUID is null.");
            return false;
        }
        if (k2 == cxd.k.fRJ && d2 <= 0.0) {
            lfn.b(5, "SFProgressbarManager", "removeDelayedProgressbar() TimeEnd is invalid.");
            return false;
        }
        Iterator<buj> iterator = this.dNZ.iterator();
        while (iterator.hasNext()) {
            buj buj2 = iterator.next();
            if (buj2.dBm != k2 || !buj2.Rs.equals(ldv2) || buj2.dBp != d2) continue;
            iterator.remove();
            return true;
        }
        return false;
    }

    private void a(buj buj2) {
        assert (buj2 != null);
        assert (!buj2.dBn);
        assert (!this.dLR.isServerObject());
        if (this.dFg == null) {
            return;
        }
        eeu eeu2 = (eeu)this.MessageDelegator.h(12808, this.GUID, this.dFg);
        eeu2.inN = cxd.k.getProgressTypeToMessage(buj2.dBm);
        eeu2.aCK = buj2.Rs;
        eeu2.ioa = buj2.dNX;
        eeu2.aXq = buj2.aXq;
        eeu2.dBo = buj2.dBo;
        eeu2.dBp = buj2.dBp;
        this.MessageDelegator.E(eeu2);
        buj2.dBn = true;
    }

    private void e(cxd.k k2, ldv ldv2) {
        assert (!this.dLR.isServerObject());
        if (this.dFg == null) {
            return;
        }
        eeu eeu2 = (eeu)this.MessageDelegator.h(12808, this.GUID, this.dFg);
        eeu2.inN = cxd.k.getProgressTypeToMessage(k2);
        eeu2.aCK = ldv2;
        eeu2.dBp = 0.0;
        this.MessageDelegator.E(eeu2);
    }

    private void a(cxd.k k2, double d2, ldv ldv2) {
        assert (!this.dLR.isServerObject());
        if (this.dFg == null) {
            return;
        }
        eev eev2 = (eev)this.MessageDelegator.h(12813, this.GUID, this.dFg);
        eev2.inN = cxd.k.getProgressTypeToMessage(k2);
        eev2.iob = d2;
        eev2.enc = ldv2;
        this.MessageDelegator.E(eev2);
    }
}

