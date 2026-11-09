/*
 * Decompiled with CFR.
 */
import java.util.TreeMap;

public class bgm
extends bgk {
    public static final String dln = "alloc_stats";
    public static final String dlo = "alloc_dump";

    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("nodeid");
        int n = 0;
        if (string != null) {
            try {
                n = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        if (n == 0) {
            this.fw("Required parameter nodeid missing or invalid");
            return;
        }
        ldv ldv2 = new ldv(n, 1800, 2);
        kcc kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), ldv2);
        kcc2.akV = this.akV;
        kcc2.ID = "";
        kcc2.pdY = "";
        kcc2.iBr = false;
        this.MessageDelegator.b(kcc2);
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("NodeID", "" + n);
        treeMap.put("Command", this.akV);
        treeMap.put("Message", "Sent alloc request");
        this.t(treeMap);
        this.aoU();
    }
}

