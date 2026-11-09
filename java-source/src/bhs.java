/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  gg
 *  lcr
 */
import java.util.TreeMap;

public class bhs
extends bgk {
    public static final String dmh = "posdelta_enable";
    public static final String dmi = "posdelta_disable";
    public static final String dmj = "posdelta_threshold";
    public static bgh Tq;
    private int dmk = 0;
    private int dlv = 0;
    private int dml = 0;
    private int dmm = 0;

    @Override
    public void initialize() {
        super.initialize();
        amf amf2 = ((dta)this.MessageDelegator).bzt().d(lcr.hac);
        if (amf2 == null || !(amf2 instanceof gg)) {
            this.fw("Could not find SFGamelogicDistributor");
            return;
        }
        gg gg2 = (gg)amf2;
        gr[] grArray = gg2.hS();
        if (grArray == null) {
            this.fw("Could not get node info array");
            return;
        }
        for (gr gr2 : grArray) {
            if (gr2 == null || gr2.eO == null || !gr2.eO.equals("GameLogic")) continue;
            ++this.dmk;
        }
        gqc gqc2 = (gqc)this.MessageDelegator.h(11106, this.getGUID(), new ldv(65534, lcr.qCy.enw(), lcr.qCy.enx()));
        if (this.akV.equalsIgnoreCase(dmh)) {
            gqc2.jpb = 0;
            gqc2.jpd = true;
        } else if (this.akV.equalsIgnoreCase(dmi)) {
            gqc2.jpb = 0;
            gqc2.jpd = false;
        } else if (this.akV.equalsIgnoreCase(dmj)) {
            String string = (String)this.dlm.get("distance");
            if (string == null) {
                this.fw("Required parameter distance is missing");
                return;
            }
            int n = 0;
            try {
                n = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("Distance '" + string + "' is not an integer");
                return;
            }
            if (n < 10) {
                this.fw("Distance " + n + " too low");
                return;
            }
            gqc2.jpb = 1;
            gqc2.jpe = n;
        } else {
            this.fw("Unknown command '" + this.akV + "'");
            return;
        }
        this.MessageDelegator.E(gqc2);
        this.dlv = this.dmk;
    }

    private void a(gqc gqc2) {
        if (!gqc2.jpc) {
            lfn.b(5, "SFExternalCommandHandlerPosDelta", "handleSystemConfigureGlobalSettingMessage(): Message.IsResponse is false, Message=" + gqc2);
            return;
        }
        if (gqc2.eo) {
            ++this.dml;
        } else {
            ++this.dmm;
        }
        if (this.dml + this.dmm == this.dlv) {
            TreeMap<String, String> treeMap = lcn.emG();
            treeMap.put("SuccessCount", "" + this.dml);
            treeMap.put("FailureCount", "" + this.dmm);
            this.t(treeMap);
            this.aoU();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11106: {
                this.a((gqc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

