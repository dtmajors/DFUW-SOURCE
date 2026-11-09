/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.TreeMap;

public class bhp
extends bgk {
    private double aAh = Double.MAX_VALUE;
    private static final double dlW = 10.0;
    private ArrayList<eia> dme = lcn.emv();

    @Override
    public void initialize() {
        int n;
        super.initialize();
        String string = (String)this.dlm.get("optype");
        String string2 = (String)this.dlm.get("cityid");
        String string3 = (String)this.dlm.get("word");
        if (string == null || string2 == null || string3 == null) {
            this.fw("Need atleast optype and cityid");
            return;
        }
        if (!string3.equals("iamsure")) {
            this.fw("Need atleast optype and cityid");
            return;
        }
        try {
            n = Integer.parseInt(string.trim());
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("OperationType '" + string + "' is not valid.");
            return;
        }
        switch (n) {
            case 1: 
            case 2: 
            case 3: {
                break;
            }
            default: {
                this.fw("OperationType not correct");
                return;
            }
        }
        ldv ldv2 = new ldv(65534, lcr.qCy.enw(), lcr.qCy.enx());
        ehz ehz2 = (ehz)this.MessageDelegator.h(18714, this.getGUID(), ldv2);
        ehz2.ilu = n;
        ehz2.bhD = string2;
        this.MessageDelegator.F(ehz2);
        this.aAh = this.MessageDelegator.arc().rgz + 10.0;
    }

    private void apf() {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("OperationResultsSize", "" + this.dme.size());
        int n = 0;
        for (eia eia2 : this.dme) {
            treeMap.put("Index: " + n, "Success: " + eia2.eo);
            ++n;
        }
        this.t(treeMap);
        this.aAh = Double.MAX_VALUE;
        this.aoU();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.aAh < this.MessageDelegator.arc().rgz) {
            this.apf();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 18715: {
                this.a((eia)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eia eia2) {
        this.dme.add(eia2);
    }
}

