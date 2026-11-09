/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bgu
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
            case 19993: {
                this.a((etd)dxq2);
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

    private void v(ldv ldv2, ldv ldv3) {
        etc etc2 = (etc)this.MessageDelegator.h(19992, this.GUID, ldv2);
        etc2.ci(ldv3);
        this.MessageDelegator.F(etc2);
    }

    private void a(eje eje2) {
        for (int i = 0; i < eje2.isb.length; ++i) {
            if (eje2.isb[i].compareToIgnoreCase(this.bhD) != 0) continue;
            this.bhD = eje2.isb[i];
            if (eje2.ise[i].equals(lcr.qAC)) {
                this.fw("City '" + this.bhD + "' is neutral!");
                return;
            }
            this.v(eje2.ise[i], eje2.isc[i]);
            return;
        }
        this.fw("No city can be located matching the id '" + this.bhD + "'!!!");
    }

    private void a(etd etd2) {
        if (etd2.adn()) {
            Map<String, String> map = lcn.emw();
            map.put("City ID", this.bhD);
            map.put("Result", "Challenge Successfully Aborted!");
            this.t(map);
            this.aoU();
        } else {
            String string = "";
            switch (etd2.getResult()) {
                case 1: 
                case 2: {
                    string = "City '" + this.bhD + "' is not currently being challenged!!!";
                    break;
                }
                default: {
                    string = "Abort request for '" + this.bhD + "' failed for an unspecified reason!?!?!";
                }
            }
            this.fw(string);
        }
    }
}

