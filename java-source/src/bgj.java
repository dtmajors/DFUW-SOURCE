/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class bgj
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("accountname");
        String string2 = (String)this.dlm.get("attributename");
        String string3 = (String)this.dlm.get("value");
        if (string == null || string2 == null || string3 == null) {
            this.fw("Required params: accountname, attributename, value");
            return;
        }
        ldv ldv2 = this.dli.hj().fu(string);
        if (ldv2 == null) {
            this.fw("'accountname' " + string + " is not valid");
            return;
        }
        int n = ep.as((String)string2);
        if (n <= 0) {
            this.fw("AttributeName '" + string2 + "' is not valid.");
            return;
        }
        int n2 = ep.aL((int)n);
        ej ej2 = null;
        switch (n2) {
            case 0: {
                boolean bl;
                try {
                    bl = Boolean.parseBoolean(string3.trim());
                }
                catch (NumberFormatException numberFormatException) {
                    this.fw("Value '" + string3 + "' is not valid.");
                    return;
                }
                eq eq2 = new eq();
                eq2.setType(n);
                eq2.x(bl);
                ej2 = eq2;
                break;
            }
            case 2: {
                float f2 = 0.0f;
                try {
                    f2 = Float.parseFloat(string3);
                }
                catch (NumberFormatException numberFormatException) {
                    this.fw("Value '" + string3 + "' is not valid.");
                    return;
                }
                eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
                eam2.ikF = 2;
                eam2.bnM = n;
                eam2.ikG = f2;
                this.MessageDelegator.F(eam2);
                return;
            }
            case 3: {
                int n3 = 0;
                try {
                    n3 = Integer.parseInt(string3);
                }
                catch (NumberFormatException numberFormatException) {
                    this.fw("Value '" + string3 + "' is not valid.");
                    return;
                }
                ew ew2 = new ew();
                ew2.setType(n);
                ew2.bi(n3);
                ej2 = ew2;
                break;
            }
            case 7: {
                String string4 = string3;
                ff ff2 = new ff();
                ff2.setType(n);
                ff2.av(string4);
                ej2 = ff2;
                break;
            }
            default: {
                this.fw("Invalid datatype provided");
                return;
            }
        }
        eap eap2 = (eap)this.MessageDelegator.h(10757, this.GUID, ldv2);
        eap2.bhp = ej2;
        this.MessageDelegator.F(eap2);
        this.c(ldv2, lzs.tYp.bD(n, string3));
        this.aoU();
    }
}

