/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bgy
extends bgk {
    private String bhD = null;
    private double dlS = 0.0;

    @Override
    public void initialize() {
        this.bhD = (String)this.dlm.get("city_id");
        if (this.bhD == null) {
            this.fw("Parameter <city_id> is missing!!!");
            return;
        }
        String string = (String)this.dlm.get("grace_period");
        if (string == null) {
            this.fw("Parameter <grace_period> is missing!!!");
            return;
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
                this.dlS = (double)n6 * 86400.0 + (double)n7 * 3600.0 + (double)n8 * 60.0;
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("grace_period parameter '" + string + "' cannot be parsed to a vaild time!!!... Parameter should be in the form '[dd:][hh:]mm' or 'x[d|h|m]' (defaults: Minutes)... [E.g. 1:30 or 20m or 1:2:30 or 1d or 45]");
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
            this.dlS = (double)n * d2;
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("grace_period parameter '" + string + "' cannot be parsed to a vaild time!!!... Parameter should be in the form '[dd:][hh:]mm' or 'x[d|h|m]' (defaults: Minutes)... [E.g. 1:30 or 20m or 1:2:30 or 1d or 45]");
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
            case 19998: {
                this.a((eux)dxq2);
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

    private void x(ldv ldv2, ldv ldv3) {
        euw euw2 = (euw)this.MessageDelegator.h(19997, this.GUID, ldv2);
        euw2.ci(ldv3);
        euw2.cr(this.dlS);
        this.MessageDelegator.F(euw2);
    }

    private void a(eje eje2) {
        for (int i = 0; i < eje2.isb.length; ++i) {
            if (eje2.isb[i].compareToIgnoreCase(this.bhD) != 0) continue;
            this.bhD = eje2.isb[i];
            if (eje2.ise[i].equals(lcr.qAC)) {
                this.fw("City '" + this.bhD + "' is neutral!");
                return;
            }
            this.x(eje2.ise[i], eje2.isc[i]);
            return;
        }
        this.fw("No city can be located matching the id '" + this.bhD + "'!!!");
    }

    private void a(eux eux2) {
        String string = "Set grace period command for " + this.bhD + " ";
        if (eux2.vA()) {
            Map<String, String> map = lcn.emw();
            map.put("City ID", this.bhD);
            map.put("Grace Period", bad.aE(this.dlS));
            map.put("Result", string + "completed!");
            this.t(map);
            this.aoU();
        } else {
            switch (eux2.getResult()) {
                case 0: {
                    this.fw(string + "failed for an unspecified reason!!!");
                    return;
                }
                case 2: {
                    this.fw(string + "failed because the city is currently being challenged!!!");
                    return;
                }
            }
        }
    }
}

