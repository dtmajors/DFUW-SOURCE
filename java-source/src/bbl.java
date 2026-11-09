/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class bbl
extends btk {
    private static final boolean cQJ = true;
    private static final boolean cQK = true;
    private static final boolean cQL = true;
    private static final boolean cQM = true;
    private static final boolean cQN = true;
    private static final int cQO = 100;
    private ayd cCy = null;
    private azn cwP = null;
    private TreeSet<ldv> cQP = lcn.emH();
    private Map<ldv, cla> cQQ = lcn.emw();
    private Map<Integer, bbr> cQR = lcn.emw();
    private Map<Integer, bbr> cQS = lcn.emw();
    private int Qs = 0;
    private Map<ldv, bcm> cQT = lcn.emw();

    public ldv[] aaf() {
        return this.cQP == null ? new ldv[]{} : this.cQP.toArray(new ldv[this.cQP.size()]);
    }

    public bcm[] aag() {
        return this.cQT.values().toArray(new bcm[this.cQT.size()]);
    }

    public bbl(ayd ayd2, azn azn2) {
        this.cCy = ayd2;
        this.cwP = azn2;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    public void c(nm nm2) {
        int n;
        if (!this.cQP.isEmpty()) {
            nm2.aDy.aDS = new int[this.cQP.size()];
            n = 0;
            for (ldv object : this.cQP) {
                nm2.aDy.aDS[n] = object.enw();
                ++n;
            }
        }
        if (!this.cQQ.isEmpty()) {
            nm2.aDy.aDT = new os[this.cQQ.size()];
            n = 0;
            for (Map.Entry entry : this.cQQ.entrySet()) {
                nm2.aDy.aDT[n] = new os((ldv)entry.getKey(), ((cla)((Object)entry.getValue())).ordinal());
                ++n;
            }
        }
    }

    public void a(nm nm2) {
        Object object;
        if (!this.cQP.isEmpty()) {
            lfn.b(5, "SFClanKOSManager", "restorePersistenceDataClan: Already have entries in PlayerKOSList for " + this.cCy);
            this.cQP.clear();
            assert (false);
        }
        if (nm2.aDy.aDS != null) {
            for (int n : nm2.aDy.aDS) {
                this.cQP.add(lcr.abW((int)n));
            }
        }
        if (!this.cQP.isEmpty()) {
            object = this.cQP.iterator();
            while (object.hasNext()) {
                ldv ldv2 = (ldv)object.next();
                ma ma2 = new ma();
                ma2.awK = ldv2.enw();
                ma2.afj = 4;
                fvc fvc2 = (fvc)this.MessageDelegator.h(26884, this.getGUID(), lcr.qAN);
                fvc2.hsP = true;
                fvc2.Yb = ma2;
                this.MessageDelegator.F(fvc2);
            }
        }
        object = this.cQP.iterator();
        while (object.hasNext()) {
            ldv ldv3 = (ldv)object.next();
            this.y(ldv3, -1);
        }
        if (nm2.aDy.aDT != null) {
            for (os os2 : nm2.aDy.aDT) {
                cla cla2 = cla.getValueByOrdinal(os2.aGm);
                this.cQQ.put(os2.GUID, cla2);
            }
        }
    }

    public boolean ZR() {
        return this.cQQ.isEmpty() && this.cQT.isEmpty() && this.cQR.isEmpty() && this.cQP.isEmpty() && this.cQS.isEmpty();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13840: {
                this.a((elw)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            case 13842: {
                this.a((elu)dxq2);
                break;
            }
            case 26885: {
                this.a((fvd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(elw elw2) {
        if (!bbn.isValidOrdinal(elw2.ilu) || elw2.iuA == null) {
            this.a(elw2, bbm.cQW);
            return;
        }
        if (!this.cCy.dQ(elw2.isO)) {
            this.a(elw2, bbm.cRc);
            return;
        }
        bbn bbn2 = bbn.getValueByOrdinal(elw2.ilu);
        bbr bbr2 = this.cCy.dR(elw2.isO);
        if (!bbr2.b(bca.cUm)) {
            this.a(elw2, bbm.cRb);
            return;
        }
        switch (bbn2) {
            case cRn: {
                if (this.cQP.size() >= 100) {
                    this.a(elw2, bbm.cRa);
                    break;
                }
                if (this.cQP.contains(elw2.iuA)) {
                    this.a(elw2, bbm.cQY);
                    break;
                }
                if (this.cCy.dQ(elw2.iuA)) {
                    this.a(elw2, bbm.cQX);
                    break;
                }
                this.a(bbr2, elw2.iuA);
                this.a(elw2, bbm.cRe);
                break;
            }
            case cRo: {
                if (!this.cQP.contains(elw2.iuA)) {
                    this.a(elw2, bbm.cQZ);
                    break;
                }
                this.b(bbr2, elw2.iuA);
                this.a(elw2, bbm.cRf);
                break;
            }
            default: {
                this.a(elw2, bbm.cQW);
            }
        }
    }

    private void a(elw elw2, bbm bbm2) {
        elx elx2 = (elx)this.MessageDelegator.h(13841, this.getGUID(), elw2.aO());
        this.MessageDelegator.b(elw2, elx2);
        elx2.iuB = bbm2.ordinal();
        this.MessageDelegator.F(elx2);
    }

    private void gs(ldv ldv2) {
        this.cQP.add(ldv2);
        this.cCy.dJ(ldv2);
    }

    private void gt(ldv ldv2) {
        this.cQP.remove(ldv2);
        bcm bcm2 = this.cQT.remove(ldv2);
        if (bcm2 != null) {
            this.cwP.a(1541, bcm2);
        }
        this.cCy.dK(ldv2);
    }

    private void a(bbr bbr2, ldv ldv2) {
        this.y(ldv2, this.Qs);
        this.cQR.put(this.Qs, bbr2);
        ++this.Qs;
        this.gs(ldv2);
    }

    private void b(bbr bbr2, ldv ldv2) {
        this.y(ldv2, this.Qs);
        this.cQS.put(this.Qs, bbr2);
        ++this.Qs;
        this.gt(ldv2);
    }

    public void a(bbr bbr2) {
        if (!this.cQP.contains(bbr2.abB())) {
            return;
        }
        this.gt(bbr2.abB());
        this.cCy.i(mbn.ukA.bD(bbr2.akp()));
    }

    private void y(ldv ldv2, int n) {
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
        eef2.sk(n);
        eef2.jM(false);
        this.MessageDelegator.F(eef2);
    }

    private void a(eeg eeg2) {
        if (eeg2.aVk() == -1) {
            if (this.cQP.contains(eeg2.aO())) {
                this.cQT.put(eeg2.aO(), new bcm(eeg2.aO(), eeg2.iP() + " " + eeg2.iR(), eeg2.js(), eeg2.jt()));
            }
            return;
        }
        bbr bbr2 = this.cQR.remove(eeg2.aVk());
        if (bbr2 != null) {
            bcm bcm2 = new bcm(eeg2.aO(), eeg2.iP() + " " + eeg2.iR(), eeg2.js(), eeg2.jt());
            if (this.cQP.contains(eeg2.aO())) {
                this.cQT.put(eeg2.aO(), bcm2);
            }
            if (eeg2.iV() == null) {
                this.cCy.i(mbn.ukv.bD(new Object[]{bbr2.abP(), bbr2.akp(), cg.c(eeg2.iP(), eeg2.iR())}));
            } else {
                this.cCy.i(mbn.uku.bD(new Object[]{bbr2.abP(), bbr2.akp(), eeg2.kE(), cg.c(eeg2.iP(), eeg2.iR()), eeg2.iV()}));
            }
            this.cCy.b(mbn.ukw.bD(new Object[]{bbr2.abP(), bbr2.akp(), this.cCy.iV()}), eeg2.aO());
            this.cwP.a(1540, bcm2);
            return;
        }
        bbr2 = this.cQS.remove(eeg2.aVk());
        if (bbr2 != null) {
            bcm bcm3 = this.cQT.remove(eeg2.aO());
            if (eeg2.iV() == null) {
                this.cCy.i(mbn.uky.bD(new Object[]{bbr2.abP(), bbr2.akp(), cg.c(eeg2.iP(), eeg2.iR())}));
            } else {
                this.cCy.i(mbn.ukx.bD(new Object[]{bbr2.abP(), bbr2.akp(), eeg2.kE(), cg.c(eeg2.iP(), eeg2.iR()), eeg2.iV()}));
            }
            this.cCy.b(mbn.ukz.bD(new Object[]{this.cCy.iV(), bbr2.abP(), bbr2.akp()}), eeg2.aO());
            if (bcm3 != null) {
                this.cwP.a(1541, bcm3);
            }
        }
    }

    private void a(elu elu2) {
        ldv ldv2 = elu2.ach();
        assert (ldv2 != null);
        elv elv2 = (elv)this.MessageDelegator.h(13843, this.cCy.getGUID(), elu2.aO());
        this.MessageDelegator.b(elu2, elv2);
        if (!this.cCy.dQ(ldv2)) {
            elv2.ew = bbm.cRc.ordinal();
            this.MessageDelegator.F(elv2);
            return;
        }
        bbr bbr2 = this.cCy.dR(ldv2);
        if (!bbr2.b(bca.cUl)) {
            elv2.ew = bbm.cRb.ordinal();
            this.MessageDelegator.F(elv2);
            return;
        }
        if (this.cQP.isEmpty()) {
            elv2.ew = bbm.cRi.ordinal();
            this.MessageDelegator.F(elv2);
            return;
        }
        int n = elu2.inb;
        if (n > this.cQP.size() || n < 0) {
            n = 0;
        }
        int n2 = 0;
        n2 = elu2.inc + n <= this.cQP.size() ? elu2.inc : elu2.inc - (elu2.inc - (this.cQP.size() - n));
        ldv[] ldvArray = new ldv[n2];
        ldv[] ldvArray2 = new ldv[this.cQP.size()];
        int n3 = 0;
        Iterator<ldv> iterator = this.cQP.iterator();
        while (iterator.hasNext()) {
            ldv ldv3;
            ldvArray2[n3] = ldv3 = iterator.next();
            ++n3;
        }
        System.arraycopy(ldvArray2, n, ldvArray, 0, ldvArray.length);
        elv2.iuy = ldvArray;
        elv2.ew = bbm.cRi.ordinal();
        elv2.iuz = this.cQP.size();
        this.MessageDelegator.F(elv2);
    }

    private void a(fvd fvd2) {
        lz[] lzArray = fvd2.iXC;
        ma ma2 = fvd2.Yb;
        if (ma2 == null) {
            lfn.b(5, "SFClanKOSManager", "handleObjectInfoManagerLookupPlayerResponseMessage  KEY IS NULL!");
            assert (false);
            return;
        }
        int n = ma2.awK;
        ldv ldv2 = lcr.abW((int)n);
        if (lzArray == null || lzArray.length == 0 || lzArray[0] == null) {
            boolean bl = this.cQP.remove(ldv2);
            if (bl) {
                lfn.b(5, "SFClanKOSManager", "handleObjectInfoManagerLookupPlayerResponseMessage  PSOGUID " + ldv2 + " removed from clan kos list cause has been expired.");
            }
            return;
        }
    }

    public TreeSet<ldv> akg() {
        return this.cQP;
    }

    public boolean ep(ldv ldv2) {
        return ldv2 == null ? false : this.cQP.contains(ldv2);
    }

    public boolean eq(ldv ldv2) {
        return ldv2 == null ? false : this.cQP.remove(ldv2);
    }

    public cla gu(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFClanKOSManager", "getGuardTowerKOSPolicy CityGUID is NULL.");
            assert (false);
            return null;
        }
        return this.cQQ.get(ldv2);
    }

    public void c(ldv ldv2, cla cla2) {
        if (ldv2 == null) {
            lfn.b(5, "SFClanKOSManager", "setGuardTowerKOSPolicy CityGUID is NULL.");
            assert (false);
            return;
        }
        if (!this.cCy.ea(ldv2)) {
            lfn.b(5, "SFClanKOSManager", "setGuardTowerKOSPolicy Clan : " + this.cCy.iV() + " does not own city : " + ldv2);
            assert (false);
            return;
        }
        this.cQQ.put(ldv2, cla2);
        this.cCy.a(ldv2, cla2);
    }

    public void fl(ldv ldv2) {
        if (ldv2 != null) {
            this.cQQ.remove(ldv2);
        }
    }

    public void fK(ldv ldv2) {
        if (ldv2 != null && !this.cQQ.containsKey(ldv2)) {
            this.cQQ.put(ldv2, cla.eHl);
        }
    }

    public void acz() {
    }

    public lfs<bco, ldv> a(bbr bbr2, ldv[] ldvArray) {
        lfs<bco, ldv> lfs2 = new lfs<bco, ldv>();
        if (ldvArray == null || ldvArray.length == 0) {
            lfs2.reX = bco.cWY;
            return lfs2;
        }
        if (bbr2 == null) {
            lfs2.reX = bco.cWI;
            return lfs2;
        }
        if (!bbr2.b(bca.cUm)) {
            lfs2.reX = bco.cWJ;
            return lfs2;
        }
        for (ldv ldv2 : ldvArray) {
            if (this.cQP.contains(ldv2)) continue;
            lfs2.reX = bco.cWR;
            lfs2.reY = ldv2;
            return lfs2;
        }
        lfs2.reX = bco.cWY;
        return lfs2;
    }

    public lfs<bco, ldv> a(bbr bbr2, ldv[] ldvArray, int n, ldv[] ldvArray2) {
        lfs<bco, ldv> lfs2 = new lfs<bco, ldv>();
        if (ldvArray == null || ldvArray.length == 0) {
            lfs2.reX = bco.cWY;
            return lfs2;
        }
        if (bbr2 == null) {
            lfs2.reX = bco.cWI;
            return lfs2;
        }
        if (!bbr2.b(bca.cUm)) {
            lfs2.reX = bco.cWJ;
            return lfs2;
        }
        if (this.cQP.size() - n + ldvArray.length > 100) {
            lfs2.reX = bco.cWM;
            return lfs2;
        }
        for (ldv ldv2 : ldvArray) {
            if (this.cQP.contains(ldv2)) {
                lfs2.reX = bco.cWO;
                lfs2.reY = ldv2;
                return lfs2;
            }
            boolean bl = false;
            if (ldvArray2 != null) {
                for (int i = 0; i < ldvArray2.length; ++i) {
                    if (!ldvArray2[i].equals(ldv2)) continue;
                    bl = true;
                    break;
                }
            }
            if (this.cCy.dZ(ldv2) && !bl) {
                lfs2.reX = bco.cWV;
                lfs2.reY = ldv2;
                return lfs2;
            }
            if (!this.cCy.dQ(ldv2)) continue;
            lfs2.reX = bco.cWX;
            lfs2.reY = ldv2;
            return lfs2;
        }
        lfs2.reX = bco.cWY;
        return lfs2;
    }

    public void a(bbr bbr2, ldv[] ldvArray, ldv[] ldvArray2, ldv[] ldvArray3) {
        lfs<bco, ldv> lfs2 = this.a(bbr2, ldvArray2);
        lfs<bco, ldv> lfs3 = this.a(bbr2, ldvArray, ldvArray2 == null ? 0 : ldvArray2.length, ldvArray3);
        if (lfs2.reX != bco.cWY || lfs3.reX != bco.cWY) {
            lfn.b(5, this.getClass().getSimpleName(), "performKillOnSightListUpdate() : Cannot Perform Update... Caller Should Call 'canX' Methods, Synchronously, First!!!... AddResult = " + lfs3.reX + ", RemoveResult = " + lfs2.reX);
            assert (false);
            return;
        }
        if (ldvArray2 != null) {
            for (ldv ldv2 : ldvArray2) {
                this.b(bbr2, ldv2);
            }
        }
        if (ldvArray != null) {
            for (ldv ldv2 : ldvArray) {
                this.a(bbr2, ldv2);
            }
        }
    }

    public bcm gv(ldv ldv2) {
        return this.cQT.get(ldv2);
    }

    public int akh() {
        return this.cQP.size();
    }

    public int aki() {
        return 100;
    }
}

