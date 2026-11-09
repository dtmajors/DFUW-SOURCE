/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bhw
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("id");
        if (string == null) {
            this.fw("Missing required parameter 'id'");
            return;
        }
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Parameter 'id' is not an integer");
            return;
        }
        if (!lcr.abR((int)n)) {
            this.fw("Parameter 'id' is not a valid character ID");
            return;
        }
        ldv ldv2 = lcr.abW((int)n);
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.getGUID(), ldv2);
        ern2.ilu = 8;
        this.MessageDelegator.E(ern2);
        this.aoV();
    }
}

