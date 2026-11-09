/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  gg
 *  lcr
 */
import java.util.List;
import java.util.TreeMap;

public class bit
extends bgk {
    private double aAh = Double.MAX_VALUE;
    private static final double dlW = 10.0;
    private List<evg> dlX = lcn.emv();
    private List<evg> dlY = lcn.emv();
    private List<evg> dlZ = lcn.emv();

    @Override
    public void initialize() {
        int n;
        super.initialize();
        this.Active = true;
        String string = (String)this.dlm.get("time");
        String string2 = (String)this.dlm.get("reason");
        if (string2 == null || string == null) {
            this.fw("Expected 'time' and 'reason' parameters");
            return;
        }
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("'time' is invalid - must be the unixtime of the expected shutdown");
            return;
        }
        int n2 = (int)(System.currentTimeMillis() / 1000L);
        if (n <= n2) {
            this.fw("'time' is in the past");
            return;
        }
        if (n > n2 + 172800) {
            this.fw("More than 48 hours to 'time'");
            return;
        }
        this.k(n - n2, string2);
    }

    private void k(int n, String string) {
        ldv ldv2 = new ldv(65534, lcr.qCy.enw(), lcr.qCy.enx());
        evf evf2 = (evf)this.MessageDelegator.h(19980, this.getGUID(), ldv2);
        evf2.iDL = 3;
        evf2.iDN = n;
        evf2.iDM = 0.0;
        evf2.cbX = string;
        this.MessageDelegator.F(evf2);
        gg gg2 = (gg)this.MessageDelegator.bzx().bzt().d(lcr.hac);
        if (gg2 != null && gg2.hz() != null) {
            gg2.hz().wZ(n);
        }
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

