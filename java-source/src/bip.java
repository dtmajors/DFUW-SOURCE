/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.TreeMap;

public class bip
extends bgk {
    @Override
    public void initialize() {
        Object object;
        super.initialize();
        if (bjc.dnK == null) {
            object = new bjc();
            ((amf)object).setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a((amf)object);
        }
        if (this.akV.equalsIgnoreCase("trafficmonitor_start")) {
            bjc.dnK.hA(this.getGUID());
            object = lcn.emG();
            object.put("guid", this.getGUID().enz());
            this.t((Map<String, String>)object);
        } else if (this.akV.equalsIgnoreCase("trafficmonitor_stop")) {
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
            if (!(amf2 instanceof bip)) {
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
        if (this.akV.equalsIgnoreCase("trafficmonitor_start")) {
            bjc.dnK.bn(this.getGUID());
        }
        super.cleanUp();
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 277: {
                this.b((kdp)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void b(kdp kdp2) {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("guid", this.getGUID().enz());
        treeMap.put("Node", "" + kdp2.Ud.ib());
        treeMap.put("ClientSendBPS", "" + kdp2.phj);
        treeMap.put("ClientReceiveBPS", "" + kdp2.phk);
        treeMap.put("ClientRawSendBPS", "" + kdp2.phl);
        treeMap.put("ClientRawReceiveBPS", "" + kdp2.phm);
        treeMap.put("ClientSendQueueSize", "" + kdp2.phn);
        treeMap.put("ClientReceiveQueueSize", "" + kdp2.pho);
        treeMap.put("ServerSendBPS", "" + kdp2.php);
        treeMap.put("ServerReceiveBPS", "" + kdp2.phq);
        treeMap.put("ServerSendQueueSize", "" + kdp2.phr);
        treeMap.put("ServerReceiveQueueSize", "" + kdp2.phs);
        treeMap.put("NodeFPS", "" + kdp2.pht);
        treeMap.put("NodeMaxFPS", "" + kdp2.phu);
        treeMap.put("SampleTS", "" + kdp2.phi);
        treeMap.put("CPUUsage", "" + kdp2.phv);
        treeMap.put("MemUsage", "" + kdp2.phw);
        this.t(treeMap);
    }

    @Override
    protected void aoT() {
        bjc.dnK.bn(this.getGUID());
        this.fw("");
    }
}

