/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class avw
extends btk
implements bto {
    public final String eV;
    private double cra = 0.0;
    private double crb = 0.0;

    public avw(String string) {
        if (string.startsWith("Delay:")) {
            try {
                this.crb = Double.parseDouble(string.substring(6, string.indexOf(" ")));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            this.eV = string.substring(string.indexOf(" ") + 1);
        } else {
            this.eV = string;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.rgz - this.cra >= this.crb) {
            egz egz2 = (egz)this.MessageDelegator.h(2315, this.getGUID(), lcw.qOS ? lcr.qDy : lcr.qCM);
            egz2.ipK = aud.a.cas.ordinal();
            egz2.ipN = this.eV;
            egz2.ipM = "dflauncher df";
            egz2.ipL = "Chat Spammer";
            this.MessageDelegator.E(egz2);
            this.cra = ldz2.rgz;
        }
    }
}

