/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bhg
extends bgk {
    private String dma = null;
    private int dmb;

    @Override
    public void initialize() {
        this.dma = (String)this.dlm.get("fortress");
        if (this.dma == null) {
            this.fw("Parameter <fortress> is missing!!!");
            return;
        }
        String string = (String)this.dlm.get("cooldown");
        if (string == null) {
            this.fw("Parameter <cooldown> is missing!!!");
            return;
        }
        try {
            this.dmb = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("cooldown_seconds parameter '" + string + "' cannot be parsed to a vaild integer!!!");
            return;
        }
        this.apg();
    }

    private void apg() {
        fcl fcl2 = (fcl)this.MessageDelegator.h(24849, this.GUID, lcr.hac);
        this.MessageDelegator.F(fcl2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24850: {
                this.a((fcm)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fcm fcm2) {
        if (fcm2.iuC == null || fcm2.hlz == null) {
            this.fw("No fortresses could be located (is that even possible?????)");
            return;
        }
        for (int i = 0; i < fcm2.hlz.length; ++i) {
            if (fcm2.hlz[i].compareToIgnoreCase(this.dma) != 0) continue;
            fbu fbu2 = (fbu)this.MessageDelegator.h(24852, this.GUID, fcm2.iuC[i]);
            fbu2.Gp(this.dmb);
            fbu2.kS(true);
            this.MessageDelegator.F(fbu2);
            this.aoU();
            return;
        }
        this.fw("No fortress can be located matching the name '" + this.dma + "'!!!");
    }
}

