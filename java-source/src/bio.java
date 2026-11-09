/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bio
extends bgk {
    @Override
    public void initialize() {
        boolean bl2;
        super.initialize();
        String string = (String)this.dlm.get("enable");
        if (string == null) {
            this.fw("Required parameter: enable=true or false");
            return;
        }
        if (string.toLowerCase().equals("true")) {
            bl2 = true;
        } else if (string.toLowerCase().equals("false")) {
            bl2 = false;
        } else {
            this.fw("Required parameter: enable=true or false");
            return;
        }
        ldv ldv2 = new ldv(65534, lcr.qCx.enw(), lcr.qCx.enx());
        gqr gqr2 = (gqr)this.MessageDelegator.h(11089, this.getGUID(), ldv2);
        gqr2.ilu = 1;
        gqr2.jpD = bl2;
        this.MessageDelegator.F(gqr2);
        this.aoU();
    }
}

