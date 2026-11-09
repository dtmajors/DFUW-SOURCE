/*
 * Decompiled with CFR.
 */
public class bhy
extends bgk {
    @Override
    public void initialize() {
        int n;
        super.initialize();
        String string = (String)this.dlm.get("accountname");
        String string2 = (String)this.dlm.get("resourcetype");
        String string3 = (String)this.dlm.get("quantity");
        if (string == null || string2 == null || string3 == null) {
            this.fw("Required parameters: accountname, resourcetype, quantity");
            return;
        }
        ldv ldv2 = this.dli.hj().fu(string);
        if (ldv2 == null) {
            this.fw("'accountname' " + string + " is not valid");
            return;
        }
        int n2 = lea.enW().getType(string2);
        if (n2 <= 0) {
            this.fw("ResourceType '" + string2 + "' is not valid");
            return;
        }
        try {
            n = Integer.parseInt(string3.trim());
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Quantity '" + string3 + "' is not valid.");
            return;
        }
        if (n < 1 || n > 100000) {
            this.fw("Quantity must be between 1 and 100000");
            return;
        }
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), ldv2);
        int[] nArray = new int[1];
        int[] nArray2 = new int[1];
        nArray[0] = n2;
        nArray2[0] = n;
        fmz2.iIY = nArray2;
        fmz2.bqd = nArray;
        fmz2.hsP = true;
        fmz2.b(bqy.dFS);
        this.MessageDelegator.F(fmz2);
        this.c(ldv2, lzq.tXT.bD(new Object[0]));
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
                this.aoU();
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

