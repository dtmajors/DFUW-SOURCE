/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;
import java.util.TreeMap;

public class bhf
extends bgk {
    private double aAh = Double.MAX_VALUE;
    private static final double dlW = 10.0;
    private List<evg> dlX = lcn.emv();
    private List<evg> dlY = lcn.emv();
    private List<evg> dlZ = lcn.emv();

    @Override
    public void initialize() {
        int n;
        double d2;
        double d3;
        super.initialize();
        String string = (String)this.dlm.get("optype");
        String string2 = (String)this.dlm.get("extensiontime");
        String string3 = (String)this.dlm.get("mintimeleft");
        String string4 = (String)this.dlm.get("reasonstring");
        if (string == null || string2 == null || string3 == null || string4 == null) {
            this.fw("Need 'optype', 'reason' , 'extensiontime' and 'mintimeleft' ");
            return;
        }
        try {
            d3 = Double.parseDouble(string2);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("'extensiontime' has invalid double value");
            return;
        }
        try {
            d2 = Double.parseDouble(string3);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("'mintimeleft' has invalid double value");
            return;
        }
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("'optype' needs to be a valid integer");
            return;
        }
        switch (n) {
            case 1: 
            case 2: {
                break;
            }
            default: {
                this.fw("Optype is NOT valid: " + n);
                return;
            }
        }
        if (d2 < 0.0) {
            this.fw("'mintimeleft' is less that 0");
            return;
        }
        if (d3 <= 0.0) {
            this.fw("'extensiontime' is less or equal to 0");
            return;
        }
        ldv ldv2 = new ldv(65534, lcr.qCy.enw(), lcr.qCy.enx());
        evf evf2 = (evf)this.MessageDelegator.h(19980, this.getGUID(), ldv2);
        evf2.iDL = n;
        evf2.iDN = d2;
        evf2.iDM = d3;
        evf2.cbX = string4;
        this.MessageDelegator.F(evf2);
        this.aAh = this.MessageDelegator.arc().rgz + 10.0;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.aAh < this.MessageDelegator.arc().rgz) {
            this.apf();
        }
    }

    private void apf() {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("NonConquestResults", "" + this.dlZ.size());
        treeMap.put("In Conquest But not changed", "" + this.dlX.size());
        treeMap.put("InConquest and modified", "" + this.dlY.size());
        int n = 0;
        for (evg evg2 : this.dlY) {
            treeMap.put("Index: " + n, "OriginalTime:" + evg2.iDQ + " NewTime:" + evg2.iDR + " Delta: " + (evg2.iDR - evg2.iDQ));
            ++n;
        }
        this.t(treeMap);
        this.aAh = Double.MAX_VALUE;
        this.aoU();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 19981: {
                this.a((evg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(evg evg2) {
        if (!evg2.iDO) {
            this.dlZ.add(evg2);
        } else if (evg2.iDP) {
            this.dlY.add(evg2);
        } else {
            this.dlX.add(evg2);
        }
    }
}

