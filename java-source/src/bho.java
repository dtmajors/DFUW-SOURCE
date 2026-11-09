/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  gg
 *  lcr
 */
import java.util.TreeMap;

public class bho
extends bgk {
    private double dlT = 0.0;
    private int dlL = 0;
    private int dmd = 0;

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
        for (int i = 0; i < grArray.length; ++i) {
            if (!grArray[i].ic().equals("Frontend")) continue;
            ++this.dlL;
        }
        this.Active = true;
        if (this.akV.equalsIgnoreCase("loginreq_set")) {
            String string = (String)this.dlm.get("level");
            if (string == null) {
                this.fw("Required parameter level missing: must be player, gm, gm15 or admin");
                return;
            }
            if (string.equalsIgnoreCase("player")) {
                string = "player";
            } else if (string.equalsIgnoreCase("gm")) {
                string = "gm";
            } else if (string.equalsIgnoreCase("gm15")) {
                string = "gm15";
            } else if (string.equalsIgnoreCase("admin")) {
                string = "admin";
            } else {
                this.fw("Required parameter level incorrect: must be player, gm, gm15 or admin");
                return;
            }
            kcc kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), lcr.qzd);
            kcc2.akV = "setloginreq";
            kcc2.ID = "";
            kcc2.pdY = string;
            kcc2.iBr = true;
            this.MessageDelegator.b(kcc2);
        } else if (this.akV.equalsIgnoreCase("loginreq_query")) {
            kcc kcc3 = (kcc)this.MessageDelegator.i(273, this.getGUID(), lcr.qzd);
            kcc3.akV = "queryloginreq";
            kcc3.ID = "";
            kcc3.pdY = "";
            kcc3.iBr = true;
            this.MessageDelegator.b(kcc3);
        }
    }

    private void a(kcd kcd2) {
        ++this.dmd;
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("NodeID", "" + kcd2.aO().ib());
        treeMap.put("Status", kcd2.pdZ);
        if (this.dmd == this.dlL) {
            this.s(treeMap);
            this.Active = false;
        } else {
            this.t(treeMap);
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 274: {
                this.a((kcd)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dlT < 1.0) {
            this.dlT = ldz2.rgz + 15.0;
        } else if (ldz2.rgz > this.dlT) {
            this.fw("Responses from " + this.dmd + " of " + this.dlL + " frontends");
            this.Active = false;
        }
    }
}

