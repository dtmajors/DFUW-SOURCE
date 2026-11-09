/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.TreeMap;

public class bhn
extends bgk {
    public static bgh Tq = null;
    public static final int dmc = 64;

    @Override
    protected void aoU() {
        super.aoU();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }

    @Override
    protected void fw(String string) {
        super.fw(string);
    }

    @Override
    protected void aoT() {
        super.aoT();
    }

    @Override
    protected void t(Map<String, String> map) {
        super.t(map);
    }

    protected void a(Map<String, String> map, bgg bgg2, int n) {
        map.put(n + "_PlayerName", bgg2.iU());
        map.put(n + "_AccountName", bgg2.aR());
        map.put(n + "_PlayerGUID", bgg2.aoC().enz());
        map.put(n + "_PlayerPosition", bgg2.oB().toString());
        map.put(n + "_PlayerInfo", bgg2.getInfo().toString());
        if (bgg2.getType() == 0) {
            map.put(n + "_TYPE", "PLAYER");
        } else if (bgg2.getType() == 1) {
            map.put(n + "_TYPE", "AI");
        } else if (bgg2.getType() == 2) {
            map.put(n + "_TYPE", "SPAWN");
        } else if (bgg2.getType() == 3) {
            map.put(n + "_TYPE", "CITY");
        } else if (bgg2.getType() == 4) {
            map.put(n + "_TYPE", "MOUNT");
        } else if (bgg2.getType() == 5) {
            map.put(n + "_TYPE", "SHIP");
        } else if (bgg2.getType() == 6) {
            map.put(n + "_TYPE", "VENDOR");
        } else if (bgg2.getType() == 7) {
            map.put(n + "_TYPE", "WARHULK");
        }
    }

    void apm() {
        TreeMap<String, String> treeMap = lcn.emG();
        int n = 0;
        for (bgg bgg2 : Tq.aoF().values()) {
            this.a(treeMap, bgg2, n);
            if (++n < 64) continue;
            n = 0;
            this.t(treeMap);
            treeMap.clear();
        }
        if (!treeMap.isEmpty()) {
            this.t(treeMap);
        }
    }

    void ht(ldv ldv2) {
        TreeMap<String, String> treeMap = lcn.emG();
        bgg bgg2 = Tq.aoF().get(ldv2);
        if (bgg2 == null) {
            return;
        }
        this.a(treeMap, bgg2, 0);
        this.t(treeMap);
    }

    @Override
    public void initialize() {
        super.initialize();
        assert (Tq != null);
        ldv ldv2 = null;
        String string = (String)this.dlm.get("PlayerGUID");
        if (string != null) {
            ldv2 = ldv.zq("[" + string.replaceAll("[.]", ",") + "]");
        }
        if (ldv2 == null) {
            this.apm();
        } else {
            this.ht(ldv2);
        }
        this.aoU();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }
}

