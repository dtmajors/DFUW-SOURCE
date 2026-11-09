/*
 * Decompiled with CFR.
 */
import java.util.TreeMap;

public class biy
extends bgk {
    public static final String[] dnH = new String[]{"createareaofinterest", "removeareaofinterest"};
    public static final biv.a dnI = biv.a.dnq;
    public static bix dnn = null;
    private ldv dnJ = null;

    @Override
    public void initialize() {
        super.initialize();
        if (dnn == null) {
            this.fw("This command is no longer valid");
            return;
        }
        if (this.akV.equals(dnH[0])) {
            this.apu();
        } else {
            this.apv();
        }
    }

    @Override
    protected void aoT() {
        if (this.dnJ != null) {
            dnn.x(this.dnJ, false);
        }
        this.aoU();
    }

    void kM(int n) {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("ID", "" + this.dnJ.eny());
        treeMap.put("Event", "Updated");
        treeMap.put("Count", "" + n);
        this.t(treeMap);
    }

    void apt() {
        assert (this.dnJ != null);
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("ID", "" + this.dnJ.eny());
        treeMap.put("Event", "Removed");
        this.t(treeMap);
        this.aoU();
    }

    private void apu() {
        String string = (String)this.dlm.get("X");
        String string2 = (String)this.dlm.get("Y");
        String string3 = (String)this.dlm.get("Z");
        String string4 = (String)this.dlm.get("R");
        if (string == null || string2 == null || string3 == null || string4 == null) {
            this.fw("One or more required parameter missing. Required: X, Y, Z, R");
            return;
        }
        try {
            float f = Float.parseFloat(string);
            float f2 = Float.parseFloat(string2);
            float f3 = Float.parseFloat(string3);
            float f4 = Float.parseFloat(string4);
            this.dnJ = dnn.a(this, f, f2, f3, f4);
            TreeMap<String, String> treeMap = lcn.emG();
            treeMap.put("ID", "" + this.dnJ.eny());
            treeMap.put("Event", "Created");
            this.t(treeMap);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("One or more required parameter invalid. Required: X, Y, Z, R");
        }
    }

    private void apv() {
        String string = (String)this.dlm.get("AOIID");
        if (string == null) {
            this.fw("Required parameter 'AOIID' not found");
            return;
        }
        try {
            long l = Long.parseLong(string);
            dnn.x(new ldv(l), true);
            this.aoU();
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Parameter 'AOIID' is invalid");
            return;
        }
    }
}

