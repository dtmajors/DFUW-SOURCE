/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class cti
extends btk {
    private Map<Integer, cth> ffT;
    private Map<String, List<Integer>> ffU;
    private Random DZ = new Random();

    @Override
    public void initialize() {
        super.initialize();
        this.bbB();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6160: {
                this.a((gfi)dxq2);
                break;
            }
            case 6162: {
                this.a((gfh)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public ny bbA() {
        ny ny2 = new ny();
        ny2.aDA = lcn.emA();
        long l2 = System.currentTimeMillis();
        for (cth cth2 : this.ffT.values()) {
            if (cth2.ffS == 0L) continue;
            nz nz2 = new nz();
            nz2.aFg = cth2.aFg;
            nz2.aFi = cth2.aFi;
            nz2.ResourceName = cth2.ResourceName;
            nz2.aFh = cth2.ffS - l2;
            ny2.aDA.add(nz2);
        }
        return ny2;
    }

    public void a(ny ny2) {
        if (ny2.aDA == null) {
            return;
        }
        long l2 = System.currentTimeMillis();
        for (nz nz2 : ny2.aDA) {
            cth cth2 = this.ffT.get(nz2.aFg);
            if (cth2 == null) {
                lfn.b(5, "SFGlobalLootManager", "restoreFromPersistenceDataGlobalLoot: Ignoring persistence for unknown group " + nz2.aFg);
                continue;
            }
            if (!cth2.ResourceName.equals(nz2.ResourceName)) {
                lfn.b(5, "SFGlobalLootManager", "restoreFromPersistenceDataGlobalLoot: Persistence for group " + nz2.aFg + " refers to resource " + nz2.ResourceName + ", expected " + cth2.ResourceName + ". Ignoring persistence");
                continue;
            }
            if (cth2.ffS != 0L) {
                lfn.b(5, "SFGlobalLootManager", "restoreFromPersistenceDataGlobalLoot: Group " + nz2.aFg + " not in expected state - overwriting existing values with data from persistence");
            }
            cth2.ffS = l2 + nz2.aFh + 300000L;
        }
    }

    private void bbB() {
        jzu jzu2 = new jzu();
        this.ffT = jzu2.dUO();
        if (this.ffT == null) {
            lfn.b(5, "SFGlobalLootManager", "loadGlobalLoot: No global loot");
            assert (false);
            return;
        }
        this.ffU = lcn.emw();
        for (cth cth2 : this.ffT.values()) {
            for (String string : cth2.ffR) {
                List<Integer> list = this.ffU.get(string);
                if (list == null) {
                    list = lcn.emA();
                    this.ffU.put(string, list);
                }
                list.add(cth2.aFg);
            }
        }
    }

    private void a(gfi gfi2) {
        gfj gfj2 = (gfj)this.MessageDelegator.h(6161, this.getGUID(), gfi2.aO());
        this.MessageDelegator.b(gfi2, gfj2);
        if (this.ffT == null || this.ffU == null) {
            lfn.b(5, "SFGlobalLootManager", "handleResourceCreateGlobalLootRequestMessage: Not correctly initialized.");
            gfj2.jgj = new cto[0];
            this.MessageDelegator.E(gfj2);
            assert (false);
            return;
        }
        List<Integer> list = this.ffU.get(gfi2.jgh);
        if (list == null) {
            gfj2.jgj = new cto[0];
            this.MessageDelegator.E(gfj2);
            return;
        }
        LinkedList<cto> linkedList = lcn.emA();
        for (int n : list) {
            cto cto2 = this.uk(n);
            if (cto2 == null) continue;
            linkedList.add(cto2);
        }
        gfj2.jgj = linkedList.toArray(new cto[linkedList.size()]);
        this.MessageDelegator.E(gfj2);
    }

    private cto uk(int n) {
        long l2;
        cth cth2 = this.ffT.get(n);
        if (cth2 == null) {
            lfn.b(5, "SFGlobalLootManager", "getLootFromGroup: No info for group " + n + " - shouldn't happen");
            assert (false);
            return null;
        }
        long l3 = (long)(8.64E7 / cth2.ffO);
        if (l3 <= 0L) {
            lfn.b(5, "SFGlobalLootManager", "getLootFromGroup: Drop Interval is <=0 for group " + n);
            return null;
        }
        if (cth2.ffS == 0L) {
            l2 = this.DZ.nextLong() % (l3 * 25L / 100L);
            cth2.ffS = System.currentTimeMillis() + l2;
        }
        if (System.currentTimeMillis() < cth2.ffS) {
            return null;
        }
        l2 = System.currentTimeMillis() + l3;
        long l4 = l3 * 50L / 100L;
        cth2.ffS = l2 += this.DZ.nextLong() % l4 - l4 / 2L;
        ++cth2.aFi;
        return cth2.bbz();
    }

    private void a(gfh gfh2) {
        lfn.b(5, "SFGlobalLootManager", "handleResourceChangeGlobalLootTimeIntervalMessage: Not supported");
    }
}

