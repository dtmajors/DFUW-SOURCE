/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class big
extends bgk {
    @Override
    public void initialize() {
        if (!this.dlm.containsKey("modifiers_list")) {
            this.fw("Parameter <modifiers_list> is missing!!!");
            return;
        }
        gkc gkc2 = (gkc)this.MessageDelegator.h(4635, this.GUID, lcr.hac);
        gkc2.mi(false);
        gkc2.k(true);
        if (!gkc2.p((String)this.dlm.get("modifiers_list"), true)) {
            this.fw("Parameter <modifiers_list> contains invalid entries!!!... use colons to separate name-value pairs... use semi-colons to separate list entries!!!");
            return;
        }
        this.MessageDelegator.F(gkc2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4636: {
                this.a((gkd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gkd gkd2) {
        Map<String, String> map = lcn.emw();
        for (int i = 0; i < gkd2.bVw().length; ++i) {
            if (gkd2.bVF()[i] > 0) {
                map.put(gkd2.bVw()[i].toString(), "Failed to be set, on " + Integer.toString(gkd2.bVF()[i]) + " server" + (gkd2.bVF()[i] == 1 ? "" : "s") + "!!!");
                continue;
            }
            map.put(gkd2.bVw()[i].toString(), "Successfully changed, from " + Float.toString(gkd2.bVC()[i]) + " to " + Float.toString(gkd2.bVD()[i]) + ", on " + Integer.toString(gkd2.bVE()[i]) + " server" + (gkd2.bVE()[i] == 1 ? "" : "s"));
        }
        if (gkd2.getErrorString() != null) {
            map.put("Error String", gkd2.getErrorString());
        }
        this.t(map);
        this.aoU();
    }
}

