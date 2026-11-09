/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bgx
extends bgk {
    private String dlQ = null;
    private String dlR = null;

    @Override
    public void initialize() {
        this.dlQ = (String)this.dlm.get("setting_name");
        if (this.dlQ == null) {
            this.fw("Parameter <setting_name> is missing!!!");
            return;
        }
        this.dlR = (String)this.dlm.get("setting_value");
        if (this.dlR == null) {
            this.fw("Parameter <setting_value> is missing!!!");
            return;
        }
        bad.b b2 = bad.b.getSettingByName(this.dlQ);
        if (b2 == null) {
            this.fw("No setting can be found with the name '" + this.dlQ + "'!!!");
            return;
        }
        switch (b2.ahC()) {
            case cJj: {
                try {
                    double d2 = Double.parseDouble(this.dlR);
                    bad.c c2 = bad.b(b2, d2);
                    if (c2 != bad.c.cLs) {
                        this.fw("<setting_value> '" + this.dlR + "' is invalid for the setting '" + this.dlQ + "'... Validation result = " + (Object)((Object)c2) + "!!!");
                        return;
                    }
                    this.aQ(d2);
                    break;
                }
                catch (NumberFormatException numberFormatException) {
                    this.fw("Setting '" + this.dlQ + "' is of TIMER data-type, and requires a double value (in seconds)... <setting_value> '" + this.dlR + "' cannot be parsed to a double!!!");
                    return;
                }
            }
            case cJk: {
                try {
                    int n = Integer.parseInt(this.dlR);
                    bad.c c3 = bad.b(b2, n);
                    if (c3 != bad.c.cLs) {
                        this.fw("<setting_value> '" + this.dlR + "' is invalid for the setting '" + this.dlQ + "'... Validation result = " + (Object)((Object)c3) + "!!!");
                        return;
                    }
                    this.kL(n);
                    break;
                }
                catch (NumberFormatException numberFormatException) {
                    this.fw("Setting '" + this.dlQ + "' is of INTEGER data-type... <setting_value> '" + this.dlR + "' cannot be parsed to an integer!!!");
                    return;
                }
            }
            case cJl: {
                try {
                    float f2 = Float.parseFloat(this.dlR);
                    bad.c c4 = bad.b(b2, f2);
                    if (c4 != bad.c.cLs) {
                        this.fw("<setting_value> '" + this.dlR + "' is invalid for the setting '" + this.dlQ + "'... Validation result = " + (Object)((Object)c4) + "!!!");
                        return;
                    }
                    this.cO(f2);
                    break;
                }
                catch (NumberFormatException numberFormatException) {
                    this.fw("Setting '" + this.dlQ + "' is of FLOAT data-type... <setting_value> '" + this.dlR + "' cannot be parsed to a float!!!");
                    return;
                }
            }
            case cJm: {
                if (this.dlR.compareToIgnoreCase("false") != 0 && this.dlR.compareToIgnoreCase("true") != 0) {
                    this.fw("Setting '" + this.dlQ + "' is of BOOLEAN data-type... <setting_value> '" + this.dlR + "' is not a valid boolean value!!!");
                    return;
                }
                this.di(Boolean.parseBoolean(this.dlR));
                break;
            }
            case cJn: {
                bad.c c5 = bad.b(b2, this.dlR);
                if (c5 != bad.c.cLs) {
                    this.fw("<setting_value> '" + this.dlR + "' is invalid for the setting '" + this.dlQ + "'... Validation result = " + (Object)((Object)c5) + "!!!");
                    return;
                }
                this.fy(this.dlR);
                break;
            }
            case cJp: {
                bad.c c6;
                Enum enum_ = bab.getPhaseByName(this.dlR);
                if (enum_ == null) {
                    enum_ = bax.getWagerDivisionByName(this.dlR);
                }
                if (enum_ == null) {
                    enum_ = azs.getLossConditionByName(this.dlR);
                }
                if ((c6 = bad.b(b2, enum_)) != bad.c.cLs) {
                    this.fw("<setting_value> '" + this.dlR + "' is invalid for the setting '" + this.dlQ + "'... Validation result = " + (Object)((Object)c6) + "!!!");
                    return;
                }
                this.fy(this.dlR);
                break;
            }
            case cJo: {
                bad.c c7;
                String[] stringArray = this.dlR.split(",");
                int[] nArray = new int[stringArray.length];
                for (int i = 0; i < stringArray.length; ++i) {
                    try {
                        nArray[i] = Integer.parseInt(stringArray[i]);
                        continue;
                    }
                    catch (NumberFormatException numberFormatException) {
                        nArray = null;
                        break;
                    }
                }
                if ((c7 = bad.b(b2, nArray)) != bad.c.cLs) {
                    this.fw("<setting_value> '" + this.dlR + "' is invalid for the setting '" + this.dlQ + "'... Validation result = " + (Object)((Object)c7) + "!!!");
                    return;
                }
                this.fy(this.dlR);
                break;
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 20000: {
                this.a((euv)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void aQ(double d2) {
        euu euu2 = (euu)this.MessageDelegator.h(19999, this.GUID, lcr.hac);
        euu2.ku(this.dlQ);
        euu2.d(d2);
        this.MessageDelegator.F(euu2);
    }

    private void kL(int n) {
        euu euu2 = (euu)this.MessageDelegator.h(19999, this.GUID, lcr.hac);
        euu2.ku(this.dlQ);
        euu2.Fp(n);
        this.MessageDelegator.F(euu2);
    }

    private void cO(float f2) {
        euu euu2 = (euu)this.MessageDelegator.h(19999, this.GUID, lcr.hac);
        euu2.ku(this.dlQ);
        euu2.o(f2);
        this.MessageDelegator.F(euu2);
    }

    private void di(boolean bl) {
        euu euu2 = (euu)this.MessageDelegator.h(19999, this.GUID, lcr.hac);
        euu2.ku(this.dlQ);
        euu2.x(bl);
        this.MessageDelegator.F(euu2);
    }

    private void fy(String string) {
        euu euu2 = (euu)this.MessageDelegator.h(19999, this.GUID, lcr.hac);
        euu2.ku(this.dlQ);
        euu2.av(string);
        this.MessageDelegator.F(euu2);
    }

    private void a(euv euv2) {
        if (euv2.adn()) {
            Map<String, String> map = lcn.emw();
            map.put("Setting Name", this.dlQ);
            map.put("Setting Value", this.dlR);
            map.put("Result", "Conquest Configuration Setting Value Successfully Changed!");
            this.t(map);
            this.aoU();
        } else {
            this.fw("The request to set the value of the configuration setting '" + this.dlQ + "' to '" + this.dlR + "' failed!!!");
        }
    }
}

