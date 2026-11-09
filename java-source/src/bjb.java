/*
 * Decompiled with CFR.
 */
import java.util.TreeMap;

public class bjb
extends bgk {
    public static final String[] dnH = new String[]{"createplayercountsensor", "removeplayercountsensor"};
    public static final biv.a dnI = biv.a.dnq;
    public static bix dnn = null;
    private ldv Ud = null;

    @Override
    public void initialize() {
        super.initialize();
        if (dnn == null) {
            this.fw("This command is no longer valid");
            return;
        }
        if (this.akV.equals(dnH[0])) {
            this.apy();
        } else {
            this.apx();
        }
    }

    void apw() {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("ID", "" + this.Ud.eny());
        treeMap.put("Event", "Removed");
        this.t(treeMap);
        this.aoU();
    }

    void kN(int n) {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("ID", "" + this.Ud.eny());
        treeMap.put("Event", "Updated");
        treeMap.put("Count", "" + n);
        this.t(treeMap);
    }

    @Override
    protected void aoT() {
        if (this.Ud != null) {
            dnn.w(this.Ud, false);
        }
        this.aoU();
    }

    private void apx() {
        String string = (String)this.dlm.get("ID");
        if (string == null) {
            this.fw("Required parameter ID missing or invalid");
            return;
        }
        long l = 0L;
        try {
            l = Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Required parameter ID missing or invalid");
            return;
        }
        ldv ldv2 = new ldv(l);
        if (dnn.w(ldv2, true)) {
            this.aoU();
        } else {
            this.fw("Could not find sensor with id " + string);
        }
    }

    private void apy() {
        String string = (String)this.dlm.get("Interval");
        if (string == null) {
            this.fw("Required parameter Interval missing or invalid");
            return;
        }
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        if (n < 1) {
            this.fw("Required parameter Interval missing or invalid");
            return;
        }
        this.Ud = dnn.a(n, this);
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("ID", "" + this.Ud.eny());
        treeMap.put("Event", "Created");
        this.t(treeMap);
    }
}

