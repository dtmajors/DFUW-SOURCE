/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.TreeMap;

public class bil
extends bgk {
    @Override
    public void initialize() {
        Object object;
        super.initialize();
        if (biw.dns == null) {
            object = new biw();
            ((amf)object).setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a((amf)object);
        }
        if (this.akV.equalsIgnoreCase("submonitor_start")) {
            biw.dns.hA(this.getGUID());
            object = lcn.emG();
            object.put("guid", this.getGUID().enz());
            this.t((Map<String, String>)object);
        } else if (this.akV.equalsIgnoreCase("submonitor_stop")) {
            object = (String)this.dlm.get("guid");
            if (object == null) {
                this.fw("Required parameter guid is missing");
                return;
            }
            ldv ldv2 = ldv.zq("[" + ((String)object).replaceAll("[.]", ",") + "]");
            if (ldv2 == null) {
                this.fw("Could not parse guid " + (String)object);
                return;
            }
            amf amf2 = this.MessageDelegator.d(ldv2);
            if (amf2 == null) {
                this.fw("Could not find object with guid " + ldv2);
                return;
            }
            if (!(amf2 instanceof bil)) {
                this.fw("Could not find traffic monitor with guid " + ldv2);
                return;
            }
            this.MessageDelegator.hd(ldv2);
            TreeMap<String, String> treeMap = lcn.emG();
            treeMap.put("guid", ldv2.enz());
            this.t(treeMap);
            this.aoU();
        }
    }

    @Override
    public void cleanUp() {
        if (this.akV.equalsIgnoreCase("submonitor_start")) {
            biw.dns.bn(this.getGUID());
        }
        super.cleanUp();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 21773: {
                this.a((goj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(goj goj2) {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("guid", this.getGUID().enz());
        treeMap.put("Node", "" + goj2.Ud.ib());
        treeMap.put("ClientAOIAverage", "" + goj2.jnX);
        treeMap.put("ClientAOIMax", "" + goj2.jnY);
        treeMap.put("ClientAOIMin", "" + goj2.jnW);
        treeMap.put("ClientObjectCountAverage", "" + goj2.ahs);
        treeMap.put("ClientObjectCountMax", "" + goj2.aht);
        treeMap.put("ClientObjectCountMin", "" + goj2.ahr);
        treeMap.put("LocalSubscriberCount", "" + goj2.ahu);
        treeMap.put("NodeAOILimit", "" + goj2.jnV);
        treeMap.put("RemoteSubscriberCount", "" + goj2.ahv);
        treeMap.put("SubscriberCount", "" + goj2.afD);
        treeMap.put("AOIGraphLimit", "" + goj2.jnS);
        treeMap.put("ObjectCountGraphLimit", "" + goj2.jnT);
        treeMap.put("SampleTS", "" + goj2.jnU);
        this.t(treeMap);
    }

    @Override
    protected void aoT() {
        biw.dns.bn(this.getGUID());
        this.fw("");
    }
}

