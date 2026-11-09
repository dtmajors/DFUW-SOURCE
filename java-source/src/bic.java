/*
 * Decompiled with CFR.
 */
import java.util.TreeMap;

public class bic
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("string");
        String string2 = (String)this.dlm.get("accountname");
        if (string == null || string2 == null) {
            this.fw("'string' and 'accountname' parameter required.");
            return;
        }
        ldv ldv2 = this.dli.hj().fu(string2);
        if (ldv2 == null) {
            this.fw("'accountname' " + string2 + " is not valid");
            return;
        }
        this.c(ldv2, lzj.tWx.bD(string));
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("Result", "OK");
        this.t(treeMap);
        this.aoU();
    }
}

