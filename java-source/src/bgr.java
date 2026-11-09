/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.TreeMap;

public class bgr
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("characterid");
        if (string == null) {
            this.fw("Missing required parameter 'characterid'");
            return;
        }
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Parameter 'characterid' is not an integer");
        }
        ldv ldv2 = lcr.abW((int)n);
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("Online", "" + this.dli.hj().aoF().containsKey(ldv2));
        this.s(treeMap);
    }
}

