/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bgp
extends bgk {
    private String bhD = null;

    @Override
    public void initialize() {
        this.bhD = (String)this.dlm.get("city_id");
        if (this.bhD == null) {
            this.fw("Parameter <city_id> is missing!!!");
            return;
        }
        this.apa();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 18722: {
                this.a((eje)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void apa() {
        ejd ejd2 = (ejd)this.MessageDelegator.h(18721, this.GUID, lcr.hac);
        this.MessageDelegator.F(ejd2);
    }

    private void hw(ldv ldv2) {
        ehy ehy2 = (ehy)this.MessageDelegator.h(18738, this.GUID, ldv2);
        this.MessageDelegator.F(ehy2);
    }

    private void a(eje eje2) {
        for (int i = 0; i < eje2.isb.length; ++i) {
            if (eje2.isb[i].compareToIgnoreCase(this.bhD) != 0) continue;
            this.bhD = eje2.isb[i];
            this.hw(eje2.isc[i]);
            Map<String, String> map = lcn.emw();
            map.put("City ID", this.bhD);
            map.put("Result", "Admin Build Request Sent to City for Processing!");
            this.t(map);
            this.aoU();
            return;
        }
        this.fw("No city can be located matching the id '" + this.bhD + "'!!!");
    }
}

