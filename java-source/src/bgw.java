/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bgw
extends bgk {
    private String bhD = null;
    private double dlP = 0.0;

    @Override
    public void initialize() {
        this.bhD = (String)this.dlm.get("city_id");
        if (this.bhD == null) {
            this.fw("Parameter <city_id> is missing!!!");
            return;
        }
        String string = (String)this.dlm.get("timer_alteration");
        if (string == null) {
            this.fw("Parameter <timer_alteration> is missing!!!");
            return;
        }
        boolean bl = true;
        if (string.startsWith("-")) {
            bl = false;
            string = string.replace("-", " ").trim();
        } else if (string.startsWith("+")) {
            bl = true;
            string = string.replace("+", " ").trim();
        }
        if (string.contains(":")) {
            int n;
            int n2;
            String[] stringArray = string.split(":");
            int n3 = n2 = stringArray.length == 3 ? 0 : -1;
            int n4 = stringArray.length == 3 ? 1 : (n = stringArray.length == 2 ? 0 : -1);
            int n5 = stringArray.length == 3 ? 2 : (stringArray.length == 2 ? 1 : 0);
            try {
                int n6 = n2 >= 0 ? Integer.parseInt(stringArray[n2].trim()) : 0;
                int n7 = n >= 0 ? Integer.parseInt(stringArray[n].trim()) : 0;
                int n8 = Integer.parseInt(stringArray[n5].trim());
                this.dlP = (double)n6 * 86400.0 + (double)n7 * 3600.0 + (double)n8 * 60.0;
                this.dlP *= (double)(bl ? 1 : -1);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("timer_alteration parameter '" + string + "' cannot be parsed to a vaild time!!!... Parameter should be in the form '[+|-][dd:][hh:]mm' or '[+|-]x[d|h|m]' (defaults: '+' and Minutes)... [E.g. -1:30 or +20m or 1:2:30 or -1d or 45]");
                return;
            }
        }
        double d2 = 60.0;
        if (string.endsWith("d")) {
            d2 = 86400.0;
            string = string.replace("d", " ").trim();
        } else if (string.endsWith("h")) {
            d2 = 3600.0;
            string = string.replace("h", " ").trim();
        } else if (string.endsWith("m")) {
            d2 = 60.0;
            string = string.replace("m", " ").trim();
        }
        try {
            int n = Integer.parseInt(string);
            this.dlP = (double)n * d2;
            this.dlP *= (double)(bl ? 1 : -1);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("timer_alteration parameter '" + string + "' cannot be parsed to a vaild time!!!... Parameter should be in the form '[+|-][dd:][hh:]mm' or '[+|-]x[d|h|m]' (defaults: '+' and Minutes)... [E.g. -1:30 or +20m or 1:2:30 or -1d or 45]");
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
            case 19995: {
                this.a((esy)dxq2);
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

    private void w(ldv ldv2, ldv ldv3) {
        esx esx2 = (esx)this.MessageDelegator.h(19994, this.GUID, ldv2);
        esx2.ci(ldv3);
        esx2.cj(this.dlP);
        this.MessageDelegator.F(esx2);
    }

    private void a(eje eje2) {
        for (int i = 0; i < eje2.isb.length; ++i) {
            if (eje2.isb[i].compareToIgnoreCase(this.bhD) != 0) continue;
            this.bhD = eje2.isb[i];
            if (eje2.ise[i].equals(lcr.qAC)) {
                this.fw("City '" + this.bhD + "' is neutral!");
                return;
            }
            this.w(eje2.ise[i], eje2.isc[i]);
            return;
        }
        this.fw("No city can be located matching the id '" + this.bhD + "'!!!");
    }

    private void a(esy esy2) {
        String string = "Adjust timer command for " + this.bhD + " ";
        if (esy2.vA()) {
            Map<String, String> map = lcn.emw();
            map.put("City ID", this.bhD);
            map.put("Timer Alteration", bad.aE(this.dlP));
            map.put("Result", string + "completed!");
            this.t(map);
            this.aoU();
        } else {
            switch (esy2.getResult()) {
                case 0: {
                    this.fw(string + "failed for an unspecified reason!!!");
                    return;
                }
                case 1: {
                    this.fw(string + "failed because the city is not currently being challenged!!!");
                    return;
                }
                case 4: {
                    this.fw(string + "failed because there is not enough time left on the current phase timer (10s minimum!) to be certain that all attackers would received the instruction before their phase changed!!!");
                    return;
                }
            }
        }
    }
}

