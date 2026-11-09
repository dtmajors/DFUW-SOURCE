/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bhx
extends bgk {
    @Override
    public void initialize() {
        int n;
        int n2;
        int n3;
        super.initialize();
        String string = (String)this.dlm.get("character");
        String string2 = (String)this.dlm.get("resourcetype");
        String string3 = (String)this.dlm.get("quantity");
        String string4 = (String)this.dlm.get("inventory");
        if (string == null || string2 == null || string3 == null) {
            this.fw("Required parameters: character, resourcetype, quantity - Optional: inventory");
            return;
        }
        if (string4 == null) {
            string4 = "" + bqm.b.dEn.ordinal();
        }
        try {
            n3 = Integer.parseInt(string.trim());
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("CharacterID '" + string3 + "' is not valid.");
            return;
        }
        ldv ldv2 = null;
        try {
            ldv2 = lcr.abW((int)n3);
        }
        catch (AssertionError assertionError) {
            this.fw("CharacterID '" + string3 + "' is not valid.");
            return;
        }
        if (ldv2 == null) {
            this.fw("'character' " + n3 + " is not valid");
            return;
        }
        int n4 = lea.enW().getType(string2);
        if (n4 <= 0) {
            this.fw("ResourceType '" + string2 + "' is not valid");
            return;
        }
        try {
            n2 = Integer.parseInt(string3.trim());
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Quantity '" + string3 + "' is not valid.");
            return;
        }
        if (n2 < 1 || n2 > 100000) {
            this.fw("Quantity must be between 1 and 100000");
            return;
        }
        try {
            n = Integer.parseInt(string4.trim());
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Inventory '" + string4 + "' is not valid.");
            return;
        }
        if (n != bqm.b.dEn.ordinal() && n != bqm.b.dEo.ordinal()) {
            this.fw("Inventory " + n + " is not valid.");
            return;
        }
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), ldv2);
        int[] nArray = new int[1];
        int[] nArray2 = new int[1];
        nArray[0] = n4;
        nArray2[0] = n2;
        fmz2.iIY = nArray2;
        fmz2.bqd = nArray;
        fmz2.hsP = true;
        fmz2.iQH = n == bqm.b.dEo.ordinal();
        fmz2.b(bqy.dFS);
        this.MessageDelegator.F(fmz2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11034: {
                this.fw("Could not reach the PSO of the player.");
                break;
            }
            case 7956: {
                fna fna2 = (fna)dxq2;
                if (!fna2.iQK) {
                    this.fw("Could not create the resource on the recipient.");
                    return;
                }
                this.aoV();
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

