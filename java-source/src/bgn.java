/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bgn
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("characterid");
        if (string == null) {
            this.fw("Missing required parameter 'characterid'");
            return;
        }
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Parameter 'characterid' is not an integer");
            return;
        }
        if (!lcr.abR((int)n)) {
            this.fw("Parameter 'characterid' is not a valid character ID");
            return;
        }
        string = (String)this.dlm.get("points");
        if (string == null) {
            this.fw("Missing required parameter 'points'");
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Parameter 'points' is not an integer");
            return;
        }
        ldv ldv2 = lcr.abW((int)n);
        eeo eeo2 = (eeo)this.MessageDelegator.h(12834, this.GUID, ldv2);
        eeo2.a(tv.aVu);
        eeo2.jM(true);
        eeo2.jZ("External Command Handler");
        eeo2.iH(n2);
        eeo2.sk(0);
        this.MessageDelegator.F(eeo2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12835: {
                this.a((eep)dxq2);
                break;
            }
            case 11034: {
                this.c((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eep eep2) {
        if (eep2.bGo().vA()) {
            this.aoV();
        } else {
            this.fw("Player points transaction failed: " + (Object)((Object)eep2.bGo()));
        }
    }

    private void c(gre gre2) {
        this.fw("Error altering player points, check the character id");
    }
}

