/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bif
extends bgk {
    @Override
    public void initialize() {
        gka gka2 = (gka)this.MessageDelegator.h(4633, this.GUID, lcr.hac);
        gka2.mh(false);
        gka2.mi(false);
        gka2.mg(true);
        if (this.dlm.isEmpty()) {
            gka2.a(cxn.values());
        } else {
            if (!this.dlm.containsKey("modifiers_list")) {
                this.fw("Parameter <modifiers_list> is missing!!!");
                return;
            }
            if (!gka2.p((String)this.dlm.get("modifiers_list"), true)) {
                this.fw("Parameter <modifiers_list> contains invalid entries!!!... use semi-colons to separate list entries!!!");
                return;
            }
        }
        this.MessageDelegator.F(gka2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4634: {
                this.a((gkb)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gkb gkb2) {
        Map<String, String> map = lcn.emw();
        for (int i = 0; i < gkb2.bVw().length; ++i) {
            map.put(gkb2.bVw()[i].toString(), Float.toString(gkb2.bVA()[i]));
        }
        this.t(map);
        this.aoU();
    }
}

