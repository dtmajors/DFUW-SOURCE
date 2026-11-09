/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bgt
extends bgk {
    @Override
    public void initialize() {
        boolean bl;
        super.initialize();
        String string = (String)this.dlm.get("enable");
        if (string == null) {
            this.fw("Required parameter: enable=true or false");
            return;
        }
        if (string.toLowerCase().equals("true")) {
            bl = true;
        } else if (string.toLowerCase().equals("false")) {
            bl = false;
        } else {
            this.fw("Required parameter: enable=true or false");
            return;
        }
        fac fac2 = (fac)this.MessageDelegator.h(1807, this.GUID, lcr.qDI);
        fac2.gUI = bl;
        fac2.iGk = 1;
        this.MessageDelegator.F(fac2);
        this.aoU();
    }
}

