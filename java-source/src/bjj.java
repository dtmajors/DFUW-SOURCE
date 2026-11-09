/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import org.apache.commons.collections.MultiMap;

public class bjj
extends bgk {
    private final int doB = 1;
    private final int doC = 2;
    private final int doD = 1000;
    private int doE;
    private int doF;
    private int doG;
    private int doH;
    private int[] doI = null;
    private int doJ = 0;

    @Override
    public void initialize() {
        super.initialize();
        if (this.dlm.isEmpty()) {
            this.fw("Usage:'StatsType' 'MaxPlayers' optional 'PlayerStart'. StatsType:1=ObjectCount 2=Classes and ObjectCount");
            return;
        }
        String string = (String)this.dlm.get("StatsType");
        if (string == null) {
            this.fw("Missing 'StatsType'");
            return;
        }
        String string2 = (String)this.dlm.get("MaxPlayers");
        if (string2 == null) {
            this.fw("Missing 'MaxPlayers'");
            return;
        }
        String string3 = (String)this.dlm.get("PlayerStart");
        try {
            this.doE = Integer.parseInt(string);
            this.doF = Integer.parseInt(string2);
            if (string3 != null) {
                this.doG = Integer.parseInt(string3);
            }
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Coult not convert StatsType,MaxNumPlayers or PlayerStart to integer: " + numberFormatException);
            return;
        }
        if (this.doF <= 0) {
            this.fw("MaxPlayers <= 0");
            return;
        }
        if (this.doG < 0) {
            this.fw("PlayerStart < 0");
            return;
        }
        this.doH = this.doG;
        this.apC();
    }

    private void apC() {
        this.doJ = 0;
        this.doI = null;
        fvg fvg2 = (fvg)this.MessageDelegator.h(26891, this.getGUID(), lcr.qAN);
        fvg2.iXD = this.doH;
        fvg2.iXE = this.doH + 1000 > this.doF ? this.doF - this.doH : 1000;
        this.MessageDelegator.F(fvg2);
        this.doH += fvg2.iXE;
    }

    private void a(fvh fvh2) {
        if (fvh2.iXF == null || fvh2.iXF.length == 0) {
            this.aoV();
            return;
        }
        this.doI = fvh2.iXF;
        this.doJ = 0;
        this.apD();
    }

    private void apD() {
        assert (this.doI != null);
        if (this.doJ >= this.doI.length) {
            if (this.doH + this.doI.length - this.doG >= this.doF) {
                this.aoV();
                return;
            }
            this.apC();
            return;
        }
        ldv ldv2 = lcr.abW((int)this.doI[this.doJ]);
        gsf gsf2 = (gsf)this.MessageDelegator.h(11114, this.getGUID(), ldv2);
        if (this.doE == 1) {
            gsf2.ed = 1;
        } else if (this.doE == 2) {
            gsf2.ed = 2;
        } else {
            this.fw("Internal Unknown requesttype");
            return;
        }
        this.MessageDelegator.F(gsf2);
        ++this.doJ;
    }

    private void a(gsg gsg2) {
        MultiMap multiMap = lcn.emB();
        multiMap.put("CurrentPlayer", Integer.toString(this.doH + this.doJ));
        this.t(multiMap);
        if (this.doE == 1) {
            multiMap = lcn.emB();
            multiMap.put("NumObjectsInPSO-OS", Integer.toString(gsg2.jqF));
            this.t(multiMap);
        } else if (this.doE == 2) {
            if (gsg2.jqH == null || gsg2.jqG == null) {
                multiMap = lcn.emB();
                multiMap.put("ClassType", "null");
                multiMap.put("ClassTypeCount", "null");
                this.t(multiMap);
            } else if (gsg2.jqH.length == 0 || gsg2.jqG.length == 0) {
                multiMap = lcn.emB();
                multiMap.put("ClassTypeLength", "0");
                multiMap.put("ClassTypeCountLength", "0");
                this.t(multiMap);
            } else if (gsg2.jqH.length != gsg2.jqG.length) {
                multiMap = lcn.emB();
                multiMap.put("ClassTypeLength", Integer.toString(gsg2.jqG.length));
                multiMap.put("ClassTypeCountLength", Integer.toString(gsg2.jqH.length));
                this.t(multiMap);
            } else {
                for (int i = 0; i < gsg2.jqH.length; ++i) {
                    multiMap = lcn.emB();
                    multiMap.put("ClassType", gsg2.jqG[i]);
                    multiMap.put("ClassTypeCount", Integer.toString(gsg2.jqH[i]));
                    this.t(multiMap);
                }
            }
        } else {
            this.fw("Internal error in handleSystemStateQueryResponseMessage");
            return;
        }
        this.apD();
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        if (lcr.qAN.equals(gre2.jqf)) {
            this.fw("Could not send to objectinfomanager");
            return;
        }
        this.apD();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11034: {
                this.handleSystemMessageSendingErrorMessage((gre)dxq2);
                break;
            }
            case 26892: {
                this.a((fvh)dxq2);
                break;
            }
            case 11115: {
                this.a((gsg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

