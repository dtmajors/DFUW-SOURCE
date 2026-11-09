/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bgv
extends bgk {
    private String add = null;
    private ldv ade = null;
    private String bhD = null;

    @Override
    public void initialize() {
        this.add = (String)this.dlm.get("clan_name");
        if (this.add == null) {
            this.fw("Parameter <clan_name> is missing!!!");
            return;
        }
        this.bhD = (String)this.dlm.get("city_id");
        this.apd();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13873: {
                this.a((elz)dxq2);
                break;
            }
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

    private void apd() {
        ely ely2 = (ely)this.MessageDelegator.h(13872, this.GUID, lcr.hac);
        this.MessageDelegator.F(ely2);
    }

    private void apa() {
        ejd ejd2 = (ejd)this.MessageDelegator.h(18721, this.GUID, lcr.hac);
        this.MessageDelegator.F(ejd2);
    }

    private void hx(ldv ldv2) {
        etc etc2 = (etc)this.MessageDelegator.h(19992, this.GUID, this.ade);
        etc2.ci(ldv2);
        this.MessageDelegator.F(etc2);
    }

    private void a(elz elz2) {
        String[] stringArray = elz2.getNames();
        if (stringArray != null) {
            for (int i = 0; i < stringArray.length; ++i) {
                if (stringArray[i].compareToIgnoreCase(this.add) != 0) continue;
                this.add = stringArray[i];
                this.ade = elz2.bIL()[i];
                if (this.bhD != null) {
                    this.apa();
                    return;
                }
                this.hx(null);
                return;
            }
        }
        this.fw("No clan can be found matching the name '" + this.add + "'!!!");
    }

    private void a(eje eje2) {
        for (int i = 0; i < eje2.isb.length; ++i) {
            if (eje2.isb[i].compareToIgnoreCase(this.bhD) != 0) continue;
            this.bhD = eje2.isb[i];
            this.hx(eje2.isc[i]);
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
                case 2: {
                    string = "Clan '" + this.add + "' is not currently involved in an active challenge for '" + this.bhD + "!!!";
                    break;
                }
                case 1: {
                    string = "Clan '" + this.add + "' is not currently involved in any active challenges!!!";
                    break;
                }
                default: {
                    string = "Abort request for '" + this.add + "'" + (this.bhD == null ? " " : "'s challenge for '" + this.bhD + "' ") + "failed for an unspecified reason!?!?!";
                }
            }
            this.fw(string);
        }
    }
}

