/*
 * Decompiled with CFR.
 */
import java.util.TreeMap;

public class bik
extends bgk {
    public static bgh Tq = null;

    @Override
    public void initialize() {
        super.initialize();
        assert (Tq != null);
        if (this.akV.equalsIgnoreCase("streamplayers_param")) {
            String string = (String)this.dlm.get("ai");
            String string2 = (String)this.dlm.get("player");
            String string3 = (String)this.dlm.get("frequency");
            if (string == null && string2 == null && string3 == null) {
                this.fw("Required parameter missing (should be human or ai or frequency)");
                return;
            }
            if (string != null) {
                if (string.equalsIgnoreCase("true")) {
                    bik.Tq.djq = true;
                } else if (string.equalsIgnoreCase("false")) {
                    bik.Tq.djq = false;
                } else {
                    this.fw("Invalid value for parameter ai: " + string + " (should be true or false)");
                    return;
                }
            }
            if (string2 != null) {
                if (string2.equalsIgnoreCase("true")) {
                    bik.Tq.djr = true;
                } else if (string2.equalsIgnoreCase("false")) {
                    bik.Tq.djr = false;
                } else {
                    this.fw("Invalid value for parameter player: " + string + " (should be true or false)");
                    return;
                }
            }
            if (string3 != null) {
                bik.Tq.djs = Double.parseDouble(string3);
            }
            this.aoU();
        } else if (this.akV.equalsIgnoreCase("streamplayers_start")) {
            Tq.hi(this.getGUID());
            TreeMap<String, String> treeMap = lcn.emG();
            treeMap.put("guid", this.getGUID().enz());
            this.t(treeMap);
        } else if (this.akV.equalsIgnoreCase("streamplayers_stop")) {
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
            amf amf2 = this.MessageDelegator.d(ldv2);
            if (amf2 == null) {
                this.fw("Could not find object with guid " + ldv2);
                return;
            }
            if (!(amf2 instanceof bik)) {
                this.fw("Could not find stream players with guid " + ldv2);
                return;
            }
            Tq.hj(ldv2);
            this.MessageDelegator.hd(ldv2);
            TreeMap<String, String> treeMap = lcn.emG();
            treeMap.put("guid", ldv2.enz());
            this.t(treeMap);
            this.aoU();
        }
    }

    public void e(bgg bgg2) {
        if (!this.akV.equalsIgnoreCase("streamplayers_start")) {
            return;
        }
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("guid", this.getGUID().enz());
        treeMap.put("PlayerGUID", bgg2.aoC().enz());
        treeMap.put("PlayerPosition", bgg2.oB().toString());
        this.t(treeMap);
    }

    public void f(bgg bgg2) {
        if (bgg2 == null) {
            return;
        }
        if (!this.akV.equalsIgnoreCase("streamplayers_start")) {
            return;
        }
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("guid", this.getGUID().enz());
        treeMap.put("RemoveGUID", bgg2.aoC().enz());
        this.t(treeMap);
    }

    @Override
    protected void aoT() {
        if (this.akV.equalsIgnoreCase("streamplayers_start")) {
            Tq.hj(this.getGUID());
        }
        this.fw("");
    }

    @Override
    public void cleanUp() {
        if (this.akV.equalsIgnoreCase("streamplayers_start")) {
            Tq.hj(this.getGUID());
        }
        super.cleanUp();
    }
}

