/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bhv
extends bgk {
    private static final int dmq = 0;
    private static final int dmr = 1;
    private static final int dms = 2;
    private boolean dmt = false;
    private boolean dmu = false;
    private String YL = null;
    private ldv YN = null;
    private String add = null;
    private ldv ade = null;
    private int dmv = 0;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13873: {
                this.a((elz)dxq2);
                break;
            }
            case 26885: {
                this.a((fvd)dxq2);
                break;
            }
            case 13832: {
                this.a((emi)dxq2);
                break;
            }
            case 11034: {
                this.f((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(elz elz2) {
        this.dmu = true;
        String[] stringArray = elz2.getNames();
        if (stringArray != null) {
            for (int i = 0; i < stringArray.length; ++i) {
                if (stringArray[i].compareToIgnoreCase(this.add) != 0) continue;
                this.add = stringArray[i];
                this.ade = elz2.bIL()[i];
                break;
            }
        }
        if (this.ade == null) {
            this.dmv |= 2;
        }
        if (this.app()) {
            this.apq();
        }
    }

    private void a(fvd fvd2) {
        this.dmt = true;
        if (fvd2.iXC != null && fvd2.iXC.length > 0) {
            this.YL = fvd2.iXC[0].bc;
            this.YN = fvd2.iXC[0].Ri;
        } else {
            this.dmv |= 1;
        }
        if (this.app()) {
            this.apq();
        }
    }

    private void a(emi emi2) {
        if (emi2.bIO() == ayv.cBe) {
            Map<String, String> map = lcn.emw();
            map.put("Player Name", this.YL);
            map.put("Clan Name", this.add);
            map.put("Result", "Player Successfully Removed From Clan!");
            this.t(map);
            this.aoU();
        } else if (emi2.bIO() == ayv.cBi || emi2.bIO() == ayv.cBv) {
            this.fw("The indicated player is not a member of the supplied clan!");
        } else {
            this.fw("An unhandled response was received from the clan! ClanOperationsResult: " + (Object)((Object)emi2.bIO()) + "!");
        }
    }

    private void f(gre gre2) {
        switch (gre2.bWR()) {
            case 13872: {
                this.fw("An error occurred while trying to contact the gamelogic distributor!");
                break;
            }
            case 26884: {
                this.fw("An error occurred while trying to contact the object-info-manager!");
                break;
            }
            case 13831: {
                this.fw("An error occurred while trying to contact the clan! - The clan may no longer exist!");
                break;
            }
            default: {
                super.handleSystemMessageSendingErrorMessage(gre2);
                this.fw("An unknown error occurred!");
            }
        }
    }

    @Override
    public void initialize() {
        this.YL = (String)this.dlm.get("player_name");
        this.add = (String)this.dlm.get("clan_name");
        if (this.YL == null || this.add == null) {
            this.fw("Need 'player_name' and 'clan_name'");
            return;
        }
        ely ely2 = (ely)this.MessageDelegator.h(13872, this.GUID, lcr.hac);
        this.MessageDelegator.F(ely2);
        ma ma2 = new ma();
        ma2.afj = 3;
        ma2.awJ = this.YL;
        fvc fvc2 = (fvc)this.MessageDelegator.h(26884, this.GUID, lcr.qAN);
        fvc2.Yb = ma2;
        this.MessageDelegator.F(fvc2);
    }

    private boolean app() {
        return this.dmt && this.dmu;
    }

    private void apq() {
        if (this.dmv != 0) {
            this.fw(this.getErrorString());
            return;
        }
        emh emh2 = (emh)this.MessageDelegator.h(13831, this.GUID, this.ade);
        emh2.a(bbt.cRO);
        emh2.gw(this.YN);
        emh2.oS(this.YN);
        this.MessageDelegator.F(emh2);
    }

    private String getErrorString() {
        String string = "";
        if ((this.dmv & 1) != 0) {
            string = "No player could be found matching the supplied name, '" + this.YL + "'!";
        }
        if ((this.dmv & 2) != 0) {
            string = string + (string.isEmpty() ? "" : " & ") + "No clan could be found matching the supplied name, '" + this.add + "'!";
        }
        return string;
    }
}

