/*
 * Decompiled with CFR.
 */
import java.util.TreeMap;

public class bhl
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        TreeMap<String, String> treeMap = lcn.emG();
        int n = 1;
        for (String string : this.dli.apr()) {
            if (this.dli.fD(string).ordinal() > this.dlk.ordinal()) continue;
            treeMap.put("Command" + n, string);
            ++n;
        }
        this.t(treeMap);
        this.aoU();
    }
}

