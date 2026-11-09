/*
 * Decompiled with CFR.
 */
public class bie
extends bgk {
    @Override
    public void initialize() {
        int n;
        super.initialize();
        String string = (String)this.dlm.get("accountname");
        String string2 = (String)this.dlm.get("skillname");
        String string3 = (String)this.dlm.get("level");
        if (string == null || string2 == null || string3 == null) {
            this.fw("Required params: accountname, skillname, level");
            return;
        }
        ldv ldv2 = this.dli.hj().fu(string);
        if (ldv2 == null) {
            this.fw("'accountname' " + string + " is not valid");
            return;
        }
        int n2 = lea.enZ().getType(string2);
        if (n2 <= 0) {
            this.fw("SkillName: " + string2 + " is not valid.");
            return;
        }
        try {
            n = Integer.parseInt(string3.trim());
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Level '" + string3 + "' is not valid.");
            return;
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, ldv2);
        giy2.aZF = 8;
        giy2.SkillType = n2;
        giy2.SkillLevel = n;
        this.MessageDelegator.F(giy2);
        this.c(ldv2, lzq.tXJ.bD(n2, Float.valueOf(n)));
        this.aoU();
    }
}

