/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  gg
 *  lcr
 */
import java.util.TreeMap;

public class bid
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        amf amf2 = ((dta)this.MessageDelegator).bzt().d(lcr.hac);
        if (amf2 == null || !(amf2 instanceof gg)) {
            this.fw("Could not find SFGamelogicDistributor");
            return;
        }
        gg gg2 = (gg)amf2;
        if (this.akV.equalsIgnoreCase("shutdown")) {
            String string = (String)this.dlm.get("doit");
            if (string == null) {
                this.fw("Required parameter doit missing: must be 'true'");
                return;
            }
            if (!string.equalsIgnoreCase("true")) {
                this.fw("Required parameter doit incorrect: must be 'true'");
                return;
            }
            kcc kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), lcr.qze);
            kcc2.akV = "shutdown";
            kcc2.ID = "";
            kcc2.pdY = "";
            kcc2.iBr = true;
            this.MessageDelegator.b(kcc2);
        }
    }

    private void a(kcd kcd2) {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("Status", kcd2.pdZ);
        this.s(treeMap);
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 274: {
                this.a((kcd)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }
}

