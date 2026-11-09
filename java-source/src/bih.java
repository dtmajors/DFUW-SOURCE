/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.TreeMap;

public class bih
extends bgk {
    public static bgh Tq = null;
    private double dlT = 0.0;

    @Override
    protected void aoU() {
        super.aoU();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dlT < 1.0) {
            this.dlT = ldz2.rgz + 5.0;
        } else if (ldz2.rgz > this.dlT) {
            this.aoU();
        }
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

    @Override
    public void initialize() {
        super.initialize();
        assert (Tq != null);
        String string = (String)this.dlm.get("guid");
        if (string == null) {
            this.fw("Required parameter guid is missing");
            return;
        }
        ldv ldv2 = ldv.zq("[" + string.replaceAll("[.]", ",") + "]");
        if (ldv2 == null) {
            this.fw("Could not parse guid " + string);
            return;
        }
        bgg bgg2 = Tq.aoF().get(ldv2);
        if (bgg2 == null || bgg2.getType() != 2) {
            this.fw("Could not find spawnpoint with guid " + string);
            return;
        }
        gsc gsc2 = (gsc)this.MessageDelegator.h(11080, this.getGUID(), ldv2);
        gsc2.jqv = true;
        gsc2.jqw = true;
        this.MessageDelegator.F(gsc2);
    }

    private void a(gsd gsd2) {
        int n;
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("SpawnGUID", gsd2.aO().enz());
        treeMap.put("PlayersOnNode", "" + gsd2.erz);
        treeMap.put("PlayersOnSpawn", "" + gsd2.jqA);
        treeMap.put("MaxNumberOfSpawns", "" + gsd2.jqx);
        if (gsd2.jqz != null && gsd2.jqy != null && gsd2.jqz.length == gsd2.jqy.length) {
            for (n = 0; n < gsd2.jqz.length; ++n) {
                treeMap.put(gsd2.jqy[n], "" + gsd2.jqz[n]);
            }
        }
        if (gsd2.iuC != null) {
            for (n = 0; n < gsd2.iuC.length; ++n) {
                treeMap.put(n + "_PlayerGUID", gsd2.iuC[n].enz());
            }
        }
        this.t(treeMap);
        this.aoU();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11081: {
                this.a((gsd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }
}

