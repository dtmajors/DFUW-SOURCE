/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.TreeMap;

public class bij
extends bgk {
    private boolean dmx = false;

    @Override
    public void initialize() {
        if (this.akV.equalsIgnoreCase("streamchat_start")) {
            eho eho2 = (eho)this.MessageDelegator.h(2335, this.getGUID(), lcr.qAL);
            eho2.iqa = true;
            this.MessageDelegator.F(eho2);
            TreeMap<String, String> treeMap = lcn.emG();
            treeMap.put("Result", "Started chat streaming");
            treeMap.put("guid", this.getGUID().enz());
            this.t(treeMap);
        } else if (this.akV.equalsIgnoreCase("streamchat_stop")) {
            if (this.dlm.get("guid") == null) {
                TreeMap<String, String> treeMap = lcn.emG();
                treeMap.put("error", "Expected parameter 'guid'");
                this.t(treeMap);
                this.aoU();
                return;
            }
            ldv ldv2 = ldv.zq("[" + ((String)this.dlm.get("guid")).replaceAll("[.]", ",") + "]");
            if (ldv2 == null) {
                TreeMap<String, String> treeMap = lcn.emG();
                treeMap.put("error", "Parameter 'guid' could not be parsed");
                this.t(treeMap);
                this.aoU();
                return;
            }
            amf amf2 = this.MessageDelegator.d(ldv2);
            if (amf2 == null || !(amf2 instanceof bij)) {
                TreeMap<String, String> treeMap = lcn.emG();
                treeMap.put("error", "Object '" + ldv2 + "' is not a chat stream handler");
                this.t(treeMap);
                this.aoU();
                return;
            }
            this.MessageDelegator.hd(ldv2);
            TreeMap<String, String> treeMap = lcn.emG();
            treeMap.put("result", "Removed chat stream handler [" + ldv2.enz() + "]");
            this.t(treeMap);
            this.aoU();
        }
    }

    @Override
    public void cleanUp() {
        if (this.dmx) {
            eho eho2 = (eho)this.MessageDelegator.h(2335, this.getGUID(), lcr.qAL);
            eho2.iqa = false;
            this.MessageDelegator.F(eho2);
        }
    }

    private void a(ehn ehn2) {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("guid", "" + this.getGUID().enz());
        treeMap.put("SenderNick", ehn2.ipL);
        treeMap.put("SenderPSO", "" + ehn2.ipX.enz());
        treeMap.put("Message", ehn2.ipN);
        switch (aud.a.getValue(ehn2.ipY)) {
            case caz: {
                treeMap.put("Target", "Admins");
                break;
            }
            case car: {
                treeMap.put("Target", "Area");
                break;
            }
            case cat: {
                treeMap.put("Target", "Clan");
                break;
            }
            case cau: {
                treeMap.put("Target", "Clan Officers");
                break;
            }
            case cap: {
                treeMap.put("Target", "Global");
                break;
            }
            case caw: {
                treeMap.put("Target", "GMs");
                break;
            }
            case cax: {
                treeMap.put("Target", "GM Help");
                break;
            }
            case caF: {
                treeMap.put("Target", "GM Report");
                break;
            }
            case cay: {
                treeMap.put("Target", "Master GMs");
                break;
            }
            case caq: {
                treeMap.put("Target", "Node");
                treeMap.put("NodeID", ehn2.ipZ);
                break;
            }
            case cav: {
                treeMap.put("Target", "Party");
                break;
            }
            case cas: {
                treeMap.put("Target", "User");
                treeMap.put("RecipientNick", ehn2.ipZ);
                break;
            }
            case caA: {
                treeMap.put("Target", "Race");
                break;
            }
            case caB: {
                treeMap.put("Target", "Race");
                break;
            }
            case caG: {
                treeMap.put("Target", "Trade");
                break;
            }
            case caC: {
                treeMap.put("Target", "Clan Alliance");
                break;
            }
            case caE: {
                treeMap.put("Target", "CLAN_NAME");
                treeMap.put("RecipientClan", ehn2.ipZ);
            }
        }
        this.t(treeMap);
    }

    private void a(kcs kcs2) {
        this.aoU();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2336: {
                this.a((ehn)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 270: {
                this.a((kcs)kcz2);
            }
        }
    }
}

