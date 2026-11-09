/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class biq
extends bgk {
    public static final int dmz = -1;
    public static final int dmA = 0;
    public static final int dmB = 1;
    public static final int dmq = 0;
    public static final int dmC = 1;
    public static final int dmD = 2;
    public static final int dmE = 4;
    public static final int dmF = 8;
    private boolean dmG = false;
    private boolean dmH = false;
    private String bhD = null;
    private ldv aDk = null;
    private int dmI = -1;
    private String dmJ = null;
    private ldv dmK = null;
    private String dmL = null;
    private ldv dmM = null;
    private int dmv = 0;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 18722: {
                this.a((eje)dxq2);
                break;
            }
            case 13915: {
                this.a((emb)dxq2);
                break;
            }
            case 18693: {
                this.a((ejw)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eje eje2) {
        this.dmH = true;
        if (eje2.isb != null) {
            for (int i = 0; i < eje2.isb.length; ++i) {
                if (eje2.isb[i].compareToIgnoreCase(this.bhD) != 0) continue;
                this.aDk = eje2.isc[i];
                if (!eje2.isd[i].isEmpty()) {
                    this.dmK = eje2.ise[i];
                    this.dmJ = eje2.isd[i];
                }
                int n = this.dmI = this.dmK == null ? 0 : 1;
                if (this.dmM == null || !this.dmM.equals(this.dmK)) break;
                this.dmv |= 8;
                break;
            }
        }
        if (this.aDk == null) {
            this.dmv |= 1;
        }
        if (this.dmG && this.dmH) {
            this.apq();
        }
    }

    private void a(emb emb2) {
        this.dmG = true;
        if (emb2.ade == null) {
            this.dmv |= 2;
        } else {
            this.dmM = emb2.ade;
            if (this.dmK != null && this.dmK.equals(this.dmM)) {
                this.dmv |= 8;
            }
        }
        if (this.dmG && this.dmH) {
            this.apq();
        }
    }

    private void a(ejw ejw2) {
        if (ejw2.bFf()) {
            Map<String, String> map = lcn.emw();
            map.put("Transferred City", this.bhD);
            map.put("New Owner Clan", this.dmL);
            map.put("Previous Owner Clan", this.dmI == 0 ? "*City Was Neutral*" : this.dmJ);
            this.t(map);
            this.aoU();
        } else {
            switch (this.dmI) {
                case 0: {
                    this.dmH = false;
                    ejd ejd2 = (ejd)this.MessageDelegator.h(18721, this.GUID, lcr.hac);
                    this.MessageDelegator.F(ejd2);
                    break;
                }
                case 1: {
                    this.fw("Cannot transfer ownership of city, '" + this.bhD + "', it may currently be in conquest! - Unable to complete ownership transfer request!");
                    break;
                }
                default: {
                    this.fw("An error occurred while attempting to transfer ownership of city, '" + this.bhD + "'! - Unable to complete ownership transfer request!");
                }
            }
        }
    }

    @Override
    public void initialize() {
        this.bhD = (String)this.dlm.get("city_id");
        this.dmL = (String)this.dlm.get("clan_name");
        if (this.bhD == null || this.dmL == null) {
            this.fw("Need 'city_id' and 'clan_name'");
            return;
        }
        ema ema2 = (ema)this.MessageDelegator.h(13914, this.getGUID(), lcr.hac);
        ema2.add = this.dmL;
        this.MessageDelegator.E(ema2);
        ejd ejd2 = (ejd)this.MessageDelegator.h(18721, this.GUID, lcr.hac);
        this.MessageDelegator.F(ejd2);
    }

    private void apq() {
        if (this.dmv != 0) {
            this.fw(this.getErrorString());
            return;
        }
        switch (this.dmI) {
            case 0: {
                ejv ejv2 = (ejv)this.MessageDelegator.h(18692, this.GUID, this.aDk);
                ejv2.ku(true);
                ejv2.ch(this.dmM);
                ejv2.cD(this.dmL);
                ejv2.ck(false);
                ejv2.kv(true);
                this.MessageDelegator.F(ejv2);
                break;
            }
            case 1: {
                ejv ejv3 = (ejv)this.MessageDelegator.h(18692, this.GUID, this.dmK);
                ejv3.ku(false);
                ejv3.ch(this.dmM);
                ejv3.cD(this.dmL);
                ejv3.ck(false);
                ejv3.kv(true);
                ejv3.ci(this.aDk);
                this.MessageDelegator.F(ejv3);
                break;
            }
            default: {
                this.fw("An error occurred while attempting to transfer ownership of city, '" + this.bhD + "'! - Unable to complete ownership transfer request!");
                return;
            }
        }
    }

    public String getErrorString() {
        String string = "";
        if ((this.dmv & 1) != 0) {
            string = string + "No city could be found with the supplied id! City ID: " + this.bhD;
        }
        if ((this.dmv & 2) != 0) {
            string = string + (string.isEmpty() ? "" : " & ") + "No clan could be found with the supplied name! Clan Name: " + this.dmL;
        }
        if ((this.dmv & 4) != 0) {
            string = string + (string.isEmpty() ? "" : " & ") + "An error occurred while querying the darkfall database!";
        }
        if ((this.dmv & 8) != 0) {
            string = string + (string.isEmpty() ? "" : " & ") + "City, '" + this.bhD + "', is already owned by the clan, '" + this.dmJ + "'!";
        }
        return string;
    }

    private String aD(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\'');
        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) == '\'') {
                stringBuilder.append("\\'");
                continue;
            }
            if (string.charAt(i) == '\\') {
                stringBuilder.append("\\\\");
                continue;
            }
            stringBuilder.append(string.charAt(i));
        }
        stringBuilder.append('\'');
        return stringBuilder.toString();
    }
}

