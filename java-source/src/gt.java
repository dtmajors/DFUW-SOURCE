/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class gt
extends btk {
    private Map<String, Object> XR = lcn.emw();
    private Map<Integer, lz> XS = lcn.emw();
    private List<Integer> XT = null;
    private Map<String, lz> XU = lcn.emw();
    private Map<String, Set<gu>> XV = lcn.emw();
    private Map<String, Set<gu>> XW = lcn.emw();
    private Map<Integer, Set<gu>> XX = lcn.emw();
    private Map<ldv, gu> XY = lcn.emw();
    private Map<ldv, Set<gu>> XZ = lcn.emw();

    public final lz a(ma ma2) {
        if (ma2.qm()) {
            lfn.b(5, "SFObjectInfoManager", "lookupPlayer(): Key can return multiple results:" + ma2);
            assert (false);
            return null;
        }
        switch (ma2.afj) {
            case 2: {
                return this.aK(ma2.awJ);
            }
            case 4: {
                return this.bP(ma2.awK);
            }
            case 3: {
                return this.aL(ma2.awJ);
            }
        }
        lfn.b(5, "SFObjectInfoManager", "lookupPlayer(): Invalid KeyType in " + ma2);
        assert (false);
        return null;
    }

    public final lz[] b(ma ma2) {
        if (!ma2.qm()) {
            lz lz2 = this.a(ma2);
            if (lz2 == null) {
                return null;
            }
            return new lz[]{lz2};
        }
        switch (ma2.afj) {
            case 1: {
                return this.aJ(ma2.awJ);
            }
        }
        lfn.b(5, "SFObjectInfoManager", "lookupPlayers(): Invalid KeyType in " + ma2);
        assert (false);
        return null;
    }

    private final lz[] aJ(String string) {
        if (string == null) {
            lfn.b(5, "SFObjectInfoManager", "lookupPlayersAccount(): AccountName is null");
            return null;
        }
        lz[] lzArray = null;
        Object object = this.XR.get(string.toLowerCase());
        if (object == null) {
            lzArray = new lz[]{};
        } else if (object instanceof lz) {
            lzArray = new lz[]{(lz)object};
        } else {
            Set set = (Set)object;
            lzArray = set.toArray(new lz[set.size()]);
        }
        return lzArray;
    }

    private final lz aK(String string) {
        if (string == null) {
            lfn.b(5, "SFObjectInfoManager", "lookupPlayerAccountOnline(): AccountName is null");
            return null;
        }
        Object object = this.XR.get(string.toLowerCase());
        if (object instanceof lz) {
            lz lz2 = (lz)object;
            if (lz2.awE != null) {
                return lz2;
            }
            return null;
        }
        Set set = (Set)object;
        for (lz lz3 : set) {
            if (lz3.awE == null) continue;
            return lz3;
        }
        return null;
    }

    private final lz bP(int n) {
        return this.XS.get(n);
    }

    private final lz aL(String string) {
        if (string == null) {
            lfn.b(5, "SFObjectInfoManager", "registerPlayer(): CharacterName is null");
            assert (false);
            return null;
        }
        return this.XU.get(string.toLowerCase());
    }

    private void a(lz lz2) {
        lz lz3 = this.XS.remove(lz2.Ri.enw());
        if (lz3 != null) {
            lfn.b(5, "SFObjectInfoManager", "registerPlayer(): Removed " + lz3 + " from CharID map in order to register " + lz2);
            assert (false);
        }
        if ((lz3 = this.XU.get(lz2.bc.toLowerCase())) != null) {
            lfn.b(5, "SFObjectInfoManager", "registerPlayer(): Removing " + lz3 + " from CharName map in order to register " + lz2);
            this.aw(lz3.Ri);
            lz3 = null;
        }
        this.XS.put(lz2.Ri.enw(), lz2);
        if (this.XT != null) {
            this.XT.add(lz2.Ri.enw());
        }
        this.XU.put(lz2.bc.toLowerCase(), lz2);
        this.b(lz2);
        this.d(lz2);
    }

    private void b(lz lz2) {
        Object object = this.XR.get(lz2.hE.toLowerCase());
        if (object == null) {
            this.XR.put(lz2.hE.toLowerCase(), lz2);
        } else if (object instanceof lz) {
            lz lz3 = (lz)object;
            if (lz3.h(lz2)) {
                lfn.b(5, "SFObjectInfoManager", "addPlayerToAccountMap(): Removed " + lz3 + " from Account map in order to register " + lz2);
                lz3 = null;
                assert (false);
            }
            if (lz3 == null) {
                this.XR.put(lz2.hE.toLowerCase(), lz2);
            } else {
                HashSet<lz> hashSet = new HashSet<lz>();
                hashSet.add(lz2);
                hashSet.add(lz3);
                this.XR.put(lz2.hE.toLowerCase(), hashSet);
            }
        } else {
            HashSet hashSet = (HashSet)object;
            Iterator iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                lz lz4 = (lz)iterator.next();
                if (!lz4.h(lz2)) continue;
                lfn.b(5, "SFObjectInfoManager", "addPlayerToAccountMap(): Removed " + lz4 + " from Account map in order to register " + lz2);
                iterator.remove();
                assert (false);
            }
            hashSet.add(lz2);
        }
    }

    private void aw(ldv ldv2) {
        lz lz2 = this.XS.remove(ldv2.enw());
        if (lz2 == null) {
            lfn.b(5, "SFObjectInfoManager", "unregisterPlayer(): Couldn't find " + ldv2 + " in CharID map");
            return;
        }
        lz lz3 = this.XU.remove(lz2.bc.toLowerCase());
        if (lz3 == null) {
            lfn.b(5, "SFObjectInfoManager", "unregisterPlayer(): Player in CharID Map [" + lz2 + "] not found in CharName map");
            assert (false);
        } else if (!lz3.h(lz2)) {
            lfn.b(5, "SFObjectInfoManager", "unregisterPlayer(): Player in CharID Map [" + lz2 + "] doesn't match player in CharName map [" + lz3 + "]");
            return;
        }
        this.c(lz2);
        this.f(lz2);
    }

    private boolean c(lz lz2) {
        Object object = this.XR.get(lz2.hE.toLowerCase());
        if (object == null) {
            lfn.b(5, "SFObjectInfoManager", "removePlayerFromAccountMap(): Player in CharID Map [" + lz2 + "] not found in Account map");
            assert (false);
            return false;
        }
        if (object instanceof lz) {
            lz lz3 = (lz)object;
            if (!lz3.h(lz2)) {
                lfn.b(5, "SFObjectInfoManager", "removePlayerFromAccountMap(): Player in CharID Map [" + lz2 + "] doesn't match player in Account Map [" + lz3 + "]");
                assert (false);
                return false;
            }
            this.XR.remove(lz3.hE);
        } else {
            HashSet hashSet = (HashSet)object;
            Iterator iterator = hashSet.iterator();
            lz lz4 = null;
            while (iterator.hasNext()) {
                lz4 = (lz)iterator.next();
                if (lz4.h(lz2)) {
                    iterator.remove();
                    break;
                }
                lz4 = null;
            }
            if (lz4 == null) {
                lfn.b(5, "SFObjectInfoManager", "removePlayerFromAccountMap(): Player in CharID Map [" + lz2 + "] not found in Account Map's Set");
                assert (false);
                return false;
            }
            if (hashSet.isEmpty()) {
                lfn.b(5, "SFObjectInfoManager", "removePlayerFromAccountMap(): Account Map's Set is empty after removal of [" + lz2 + "] - shouldn't happen");
                this.XR.remove(lz2.hE.toLowerCase());
            } else if (hashSet.size() == 1) {
                lz lz5 = (lz)hashSet.iterator().next();
                this.XR.put(lz5.hE.toLowerCase(), lz5);
            }
        }
        return true;
    }

    private void a(ldv ldv2, ldv ldv3, int n) {
        lz lz2 = this.XS.get(ldv2.enw());
        if (lz2 == null) {
            lfn.b(5, "SFObjectInfoManager", "registerPlayerOnline(): Player " + ldv2 + " not registered");
            assert (false);
            return;
        }
        if (lz2.di == n) {
            if (lz2.awE == null && ldv3 == null) {
                return;
            }
            if (lz2.awE != null && ldv3 != null && lz2.awE.equals(ldv3)) {
                return;
            }
        }
        lz2.awE = ldv3;
        lz2.di = n;
        this.e(lz2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 26881: {
                this.a((fvj)dxq2);
                break;
            }
            case 26882: {
                this.a((fvo)dxq2);
                break;
            }
            case 26883: {
                this.a((fvi)dxq2);
                break;
            }
            case 26884: {
                this.a((fvc)dxq2);
                break;
            }
            case 26886: {
                this.a((fvb)dxq2);
                break;
            }
            case 26887: {
                this.a((fvm)dxq2);
                break;
            }
            case 26890: {
                this.a((fvk)dxq2);
                break;
            }
            case 26891: {
                this.a((fvg)dxq2);
                break;
            }
            case 26893: {
                this.a((fva)dxq2);
                break;
            }
            case 11034: {
                gre gre2 = (gre)dxq2;
                if (gre2.jqc == 26889) {
                    this.a(gre2);
                    break;
                }
                super.receiveMessage(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private final void a(fvg fvg2) {
        if (this.XT == null) {
            this.XT = lcn.abH(this.XS.size());
            this.XT.addAll(this.XS.keySet());
        }
        fvh fvh2 = (fvh)this.MessageDelegator.h(26892, this.getGUID(), fvg2.aO());
        this.MessageDelegator.b(fvg2, fvh2);
        fvh2.iXD = fvg2.iXD;
        int n = fvg2.iXE;
        if (n > this.XT.size()) {
            n = this.XT.size() - fvg2.iXD;
        }
        int[] nArray = null;
        int n2 = fvg2.iXD + n;
        if (n2 > this.XT.size()) {
            n2 = this.XT.size();
        }
        if (n > 0) {
            nArray = new int[n];
            int n3 = 0;
            for (int i = fvg2.iXD; i < n2; ++i) {
                nArray[n3] = this.XT.get(i);
                ++n3;
            }
        }
        fvh2.iXG = this.XT.size();
        fvh2.iXF = nArray;
        this.MessageDelegator.F(fvh2);
    }

    private final void a(fva fva2) {
        lz lz2 = this.XS.get(fva2.SN);
        if (lz2 == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerChangeAccountMessage: Couldn't find player with character ID " + fva2.SN);
            return;
        }
        this.c(lz2);
        lz2.hB = fva2.iXz;
        lz2.hE = fva2.iXA;
        this.b(lz2);
    }

    private final void a(fvj fvj2) {
        if (fvj2.hB == 0) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerUnregisterPlayerMessage(): AccountID is 0");
            return;
        }
        if (fvj2.hE == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerRegisterPlayerMessage(): AccountName is null");
            return;
        }
        if (fvj2.bc == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerUnregisterPlayerMessage(): CharacterName is null");
            assert (false);
            return;
        }
        if (fvj2.Ri == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerRegisterPlayerMessage(): PSOGUID is null");
            return;
        }
        lz lz2 = new lz();
        lz2.di = 0;
        lz2.awE = null;
        lz2.hB = fvj2.hB;
        lz2.hE = fvj2.hE;
        lz2.bc = fvj2.bc;
        lz2.Ri = fvj2.Ri;
        this.a(lz2);
    }

    private final void a(fvo fvo2) {
        if (fvo2.Ri == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerUnregisterPlayerMessage(): PSOGUID is null");
            return;
        }
        this.aw(fvo2.Ri);
    }

    private final void a(fvi fvi2) {
        if (fvi2.Ri == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerLookupPlayerRequestMessage(): PSOGUID is null");
            assert (false);
            return;
        }
        if (fvi2.awE != null && fvi2.di == 0) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerPlayerOnlineMessage(): POGUID is set but NodeID is 0");
            assert (false);
            return;
        }
        if (fvi2.awE == null && fvi2.di != 0) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerPlayerOnlineMessage(): POGUID is null but NodeID is set");
            assert (false);
            return;
        }
        this.a(fvi2.Ri, fvi2.awE, fvi2.di);
    }

    private final void a(fvc fvc2) {
        fvd fvd2 = (fvd)this.MessageDelegator.h(26885, this.getGUID(), fvc2.aO());
        fvd2.aqs = fvc2.aqs;
        fvd2.Yb = fvc2.Yb;
        if (fvc2.Yb == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerLookupPlayerRequestMessage(): Key is null");
            assert (false);
        } else {
            fvd2.iXC = this.b(fvc2.Yb);
        }
        this.MessageDelegator.E(fvd2);
    }

    private final void a(fvb fvb2) {
        if (fvb2.Yb == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerForwardMessage(): Key is null");
            assert (false);
            return;
        }
        if (fvb2.iXB == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerForwardMessage(): MessageToForward is null");
            assert (false);
            return;
        }
        lz[] lzArray = this.b(fvb2.Yb);
        if (lzArray == null || lzArray.length == 0) {
            return;
        }
        for (lz lz2 : lzArray) {
            dxq dxq2 = (dxq)fvb2.iXB.clone();
            dxq2.on(lz2.Ri);
            this.MessageDelegator.E(dxq2);
        }
    }

    private final void a(fvm fvm2) {
        switch (fvm2.iXL) {
            case 1: {
                this.b(fvm2);
                break;
            }
            case 2: {
                this.c(fvm2);
                break;
            }
            case 3: {
                this.d(fvm2);
                break;
            }
            default: {
                this.a(fvm2.aO(), 1, fvm2.aqs, null);
                lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerSensorRequestMessage() : Invalid Sensor-Type, " + fvm2.iXL + "!");
                assert (false);
                break;
            }
        }
    }

    private final void b(fvm fvm2) {
        if (this.MessageDelegator == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerCreateSensorRequestMessage() : MessageDelegator is null!");
            assert (false);
            return;
        }
        if (fvm2.iXM == null) {
            this.a(fvm2.aO(), 2, fvm2.aqs, null);
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerCreateSensorRequestMessage() : Sensor key is null!");
            assert (false);
            return;
        }
        Set<gu> set = null;
        gu gu2 = null;
        switch (fvm2.iXM.afj) {
            case 1: 
            case 2: {
                if (fvm2.iXM.awJ == null || fvm2.iXM.awJ.length() == 0) {
                    this.a(fvm2.aO(), 3, fvm2.aqs, null);
                    lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerCreateSensorRequestMessage() : Sensor key is invalid - String key-type indicated, but invalid string-data supplied!");
                    assert (false);
                    return;
                }
                if (!this.XR.containsKey(fvm2.iXM.awJ.toLowerCase())) {
                    this.a(fvm2.aO(), 3, fvm2.aqs, null);
                    return;
                }
                set = this.XV.get(fvm2.iXM.awJ.toLowerCase());
                break;
            }
            case 3: {
                if (fvm2.iXM.awJ == null || fvm2.iXM.awJ.length() == 0) {
                    this.a(fvm2.aO(), 3, fvm2.aqs, null);
                    lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerCreateSensorRequestMessage() : Sensor key is invalid - String key-type indicated, but invalid string-data supplied!");
                    assert (false);
                    return;
                }
                if (!this.XU.containsKey(fvm2.iXM.awJ.toLowerCase())) {
                    this.a(fvm2.aO(), 3, fvm2.aqs, null);
                    return;
                }
                set = this.XW.get(fvm2.iXM.awJ.toLowerCase());
                break;
            }
            case 4: {
                if (fvm2.iXM.awK < 0) {
                    this.a(fvm2.aO(), 3, fvm2.aqs, null);
                    lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerCreateSensorRequestMessage() : Sensor key is invalid - Integer key-type indicated, but negative integer-data supplied");
                    assert (false);
                    return;
                }
                if (!this.XS.containsKey(fvm2.iXM.awK)) {
                    this.a(fvm2.aO(), 3, fvm2.aqs, null);
                    return;
                }
                set = this.XX.get(fvm2.iXM.awK);
            }
        }
        if (set != null) {
            for (gu gu3 : set) {
                if (gu3.Ya.tX(fvm2.aO()) != 0) continue;
                gu2 = gu3;
                break;
            }
            if (gu2 != null) {
                this.a(fvm2.aO(), 4, fvm2.aqs, null);
                return;
            }
        }
        gu2 = new gu(this.MessageDelegator.bzv(), fvm2.aO(), fvm2.iXM);
        this.XY.put(gu2.GUID, gu2);
        if (set != null) {
            set.add(gu2);
        } else {
            set = lcn.emx();
            set.add(gu2);
            switch (fvm2.iXM.afj) {
                case 1: 
                case 2: {
                    this.XV.put(fvm2.iXM.awJ.toLowerCase(), set);
                    break;
                }
                case 3: {
                    this.XW.put(fvm2.iXM.awJ.toLowerCase(), set);
                    break;
                }
                case 4: {
                    this.XX.put(fvm2.iXM.awK, set);
                }
            }
        }
        set = this.XZ.get(fvm2.aO());
        if (set != null) {
            set.add(gu2);
        } else {
            set = lcn.emx();
            set.add(gu2);
            this.XZ.put(fvm2.aO(), set);
        }
        this.a(fvm2.aO(), 0, fvm2.aqs, gu2.GUID);
    }

    private final void c(fvm fvm2) {
        if (this.MessageDelegator == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerRemoveSensorRequestMessage() : MessageDelegator is null!");
            assert (false);
            return;
        }
        gu gu2 = null;
        Set<gu> set = null;
        if (fvm2.Ud != null) {
            gu2 = this.XY.remove(fvm2.Ud);
            if (gu2 == null) {
                this.a(fvm2.aO(), 5, fvm2.aqs, null);
                lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerRemoveSensorRequestMessage() : No sensor found matching supplied GUID! GUID: " + fvm2.Ud.toString());
                return;
            }
        } else {
            if (fvm2.iXM == null) {
                this.a(fvm2.aO(), 2, fvm2.aqs, null);
                lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerRemoveSensorRequestMessage() : No sensor key or GUID supplied!");
                return;
            }
            switch (fvm2.iXM.afj) {
                case 1: 
                case 2: {
                    set = this.XV.get(fvm2.iXM.awJ.toLowerCase());
                    break;
                }
                case 3: {
                    set = this.XW.get(fvm2.iXM.awJ.toLowerCase());
                    break;
                }
                case 4: {
                    set = this.XX.get(fvm2.iXM.awK);
                }
            }
            if (set != null) {
                for (gu gu3 : set) {
                    if (gu3.Ya.tX(fvm2.aO()) != 0) continue;
                    gu2 = gu3;
                    break;
                }
            }
            if (gu2 == null) {
                this.a(fvm2.aO(), 5, fvm2.aqs, null);
                lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerRemoveSensorRequestMessage() : No sensor found that matches the supplied key and the message sender's GUID! Key: " + fvm2.iXM.toString() + ", Sender GUID: " + fvm2.aO().toString());
                return;
            }
            this.XY.remove(gu2.GUID);
        }
        switch (gu2.Yb.afj) {
            case 1: 
            case 2: {
                set = this.XV.get(gu2.Yb.awJ.toLowerCase());
                if (set == null) break;
                set.remove(gu2);
                if (!set.isEmpty()) break;
                this.XV.remove(gu2.Yb.awJ.toLowerCase());
                break;
            }
            case 3: {
                set = this.XW.get(gu2.Yb.awJ.toLowerCase());
                if (set == null) break;
                set.remove(gu2);
                if (!set.isEmpty()) break;
                this.XW.remove(gu2.Yb.awJ.toLowerCase());
                break;
            }
            case 4: {
                set = this.XX.get(gu2.Yb.awK);
                if (set == null) break;
                set.remove(gu2);
                if (!set.isEmpty()) break;
                this.XX.remove(gu2.Yb.awK);
            }
        }
        set = this.XZ.get(gu2.Ya);
        set.remove(gu2);
        if (set.isEmpty()) {
            this.XZ.remove(gu2.Ya);
        }
        this.MessageDelegator.oa(gu2.GUID);
        this.a(fvm2.aO(), 0, fvm2.aqs, null);
    }

    private final void d(fvm fvm2) {
        assert (false);
    }

    private final void a(fvk fvk2) {
        if (fvk2.Ri == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerRenamePlayerMessage(): PSOGUID is null");
            assert (false);
            return;
        }
        if (fvk2.iXH == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerRenamePlayerMessage(): NewPlayerName is null");
            assert (false);
            return;
        }
        lz lz2 = this.XS.get(fvk2.Ri.enw());
        if (lz2 == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerRenamePlayerMessage(): No player found for " + fvk2.Ri);
            assert (false);
            return;
        }
        lz lz3 = this.XU.remove(lz2.bc.toLowerCase());
        if (lz3 == null) {
            lfn.b(5, "SFObjectInfoManager", "handleObjectInfoManagerRenamePlayerMessage(): Player [" + lz2 + "] not found in CharName map");
            assert (false);
        }
        lz2.bc = fvk2.iXH;
        this.XU.put(lz2.bc.toLowerCase(), lz2);
    }

    private final void a(ldv ldv2, int n, int n2, ldv ldv3) {
        if (this.MessageDelegator == null) {
            lfn.b(5, "SFObjectInfoManager", "sendObjectInfoManagerSensorResponseMessage() : MessageDelegator is null!");
            assert (false);
            return;
        }
        fvn fvn2 = (fvn)this.MessageDelegator.h(26888, this.GUID, ldv2);
        fvn2.iXS = n;
        fvn2.aqs = n2;
        fvn2.Ud = ldv3;
        this.MessageDelegator.F(fvn2);
    }

    private void d(lz lz2) {
    }

    private void e(lz lz2) {
        lz[] lzArray = new lz[]{lz2};
        Set<gu> set = null;
        set = this.XV.get(lz2.hE.toLowerCase());
        if (set != null) {
            this.a(set, lzArray);
        }
        set = null;
        set = this.XW.get(lz2.bc.toLowerCase());
        if (set != null) {
            this.a(set, lzArray);
        }
        set = null;
        set = this.XX.get(lz2.Ri.enw());
        if (set != null) {
            this.a(set, lzArray);
        }
    }

    private void f(lz lz2) {
        lz[] lzArray = new lz[]{lz2};
        Set<gu> set = null;
        set = this.XV.get(lz2.hE.toLowerCase());
        if (set != null) {
            this.a(set, lzArray);
        }
        set = null;
        set = this.XW.get(lz2.bc.toLowerCase());
        if (set != null) {
            this.a(set, lzArray);
        }
        set = null;
        set = this.XX.get(lz2.Ri.enw());
        if (set != null) {
            this.a(set, lzArray);
        }
    }

    private void a(Set<gu> set, lz[] lzArray) {
        for (gu gu2 : set) {
            this.a(gu2.Ya, gu2.GUID, gu2.Yb, lzArray);
        }
    }

    private void a(ldv ldv2, ldv ldv3, ma ma2, lz[] lzArray) {
        if (this.MessageDelegator == null) {
            lfn.b(5, "SFObjectInfoManager", "sendObjectInfoManagerSensorEventMessage() : MessageDelegator is null!");
            assert (false);
            return;
        }
        fvl fvl2 = (fvl)this.MessageDelegator.h(26889, this.GUID, ldv2);
        fvl2.Ud = ldv3;
        fvl2.Yb = ma2;
        fvl2.iXC = lzArray;
        fvl2.hsP = true;
        this.MessageDelegator.F(fvl2);
    }

    private void a(gre gre2) {
        Set<gu> set = this.XZ.remove(gre2.jqf);
        if (set != null && !set.isEmpty()) {
            for (gu gu2 : set) {
                this.XY.remove(gu2.GUID);
                switch (gu2.Yb.afj) {
                    case 1: 
                    case 2: {
                        Set<gu> set2 = this.XV.get(gu2.Yb.awJ.toLowerCase());
                        if (set2 == null) break;
                        set2.remove(gu2);
                        if (!set2.isEmpty()) break;
                        this.XV.remove(gu2.Yb.awJ.toLowerCase());
                        break;
                    }
                    case 3: {
                        Set<gu> set2 = this.XW.get(gu2.Yb.awJ.toLowerCase());
                        if (set2 == null) break;
                        set2.remove(gu2);
                        if (!set2.isEmpty()) break;
                        this.XW.remove(gu2.Yb.awJ.toLowerCase());
                        break;
                    }
                    case 4: {
                        Set<gu> set2 = this.XX.get(gu2.Yb.awK);
                        if (set2 == null) break;
                        set2.remove(gu2);
                        if (!set2.isEmpty()) break;
                        this.XX.remove(gu2.Yb.awK);
                    }
                }
                this.MessageDelegator.oa(gu2.GUID);
            }
            set.clear();
        }
    }
}

