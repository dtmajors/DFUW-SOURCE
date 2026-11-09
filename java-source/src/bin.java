/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  gg
 *  lcr
 */
import java.util.TreeSet;

public class bin
extends bgk {
    @Override
    public void initialize() {
        boolean bl2;
        super.initialize();
        String string = (String)this.dlm.get("enable");
        if (string == null) {
            this.fw("Required parameter 'enable' not present");
            return;
        }
        if (string.equalsIgnoreCase("true")) {
            bl2 = true;
        } else if (string.equalsIgnoreCase("false")) {
            bl2 = false;
        } else {
            this.fw("Parameter 'enable' must be 'true' or 'false'");
            return;
        }
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
        TreeSet treeSet = lcn.emH();
        for (gr gr2 : grArray) {
            if (gr2 == null || gr2.eO == null || !gr2.eO.equals("GameLogic")) continue;
            ery ery2 = (ery)this.MessageDelegator.h(16652, this.getGUID(), lcr.ak((ldv)lcr.qAJ, (int)gr2.di));
            ery2.Rs = ldv.rfd;
            ery2.ilu = bl2 ? 8 : 9;
            ery2.adA = ldv.rfd;
            this.MessageDelegator.E(ery2);
        }
        this.aoV();
    }
}

