/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.TreeMap;

public class bhm
extends bgk {
    @Override
    public void initialize() {
        String string = (String)this.dlm.get("type");
        if (string == null) {
            this.fw("Needs type param with value player,ai,spawn,mount,warhulk,ship,cannon,vendor");
            return;
        }
        string = string.toLowerCase();
        Map<Integer, bgh.b> map = null;
        if (string.equals("player")) {
            map = this.dli.hj().aoL();
        } else if (string.equals("ai")) {
            map = this.dli.hj().aoM();
        } else if (string.equals("spawn")) {
            map = this.dli.hj().aoN();
        } else if (string.equals("mount")) {
            map = this.dli.hj().aoQ();
        } else if (string.equals("warhulk")) {
            map = this.dli.hj().aoO();
        } else if (string.equals("ship")) {
            map = this.dli.hj().aoP();
        } else if (string.equals("cannon")) {
            map = this.dli.hj().aoR();
        } else if (string.equals("vendor")) {
            map = this.dli.hj().aoS();
        } else {
            this.fw("Needs type param with value player,ai,spawn,mount,warhulk,ship,cannon,vendor");
            return;
        }
        if (map == null) {
            this.fw("Needs type param with value player,ai,spawn,mount,warhulk,ship,cannon,vendor");
            return;
        }
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("NODETYPE", string);
        for (Map.Entry<Integer, bgh.b> entry : map.entrySet()) {
            treeMap.put("Node: " + entry.getKey() + " PersistentNodeCount: ", "" + entry.getValue().djv);
            treeMap.put("Node: " + entry.getKey() + " CurrentNodeCount: ", "" + entry.getValue().djw);
        }
        this.t(treeMap);
        this.aoU();
    }
}

