/*
 * Decompiled with CFR.
 */
import java.util.TreeMap;

public class bib
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("nationality");
        int n = string != null ? cg.b.getValueByName(string).ordinal() : 0;
        String string2 = (String)this.dlm.get("string");
        if (string2 == null) {
            this.fw("'string' parameter required.");
            return;
        }
        this.a(lzj.tWx.bD(string2), n);
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("Result", "OK");
        this.t(treeMap);
        this.aoU();
    }
}

