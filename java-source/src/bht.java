/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.text.DecimalFormat;
import java.util.Map;

public class bht
extends bgk {
    public static final String dmn = "print_objects";
    DecimalFormat dmo;

    @Override
    public void initialize() {
        super.initialize();
        if (!this.akV.equalsIgnoreCase(dmn)) {
            this.fw("Command [" + this.akV + "] not valid. Should be: " + dmn);
            return;
        }
        String string = (String)this.dlm.get("node");
        if (string == null) {
            this.fw("Required parameters: node");
            return;
        }
        int n = 0;
        try {
            n = Integer.parseInt(string.trim());
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Node'" + string + "' is not valid.");
            return;
        }
        if (n < 300 && n > 399) {
            this.fw("Node'" + string + "' is not a valid GameLogicServerNode.");
            return;
        }
        ldv ldv2 = lcr.ak((ldv)lcr.Wu, (int)n);
        gqo gqo2 = (gqo)this.MessageDelegator.h(11083, this.GUID, ldv2);
        this.MessageDelegator.E(gqo2);
        this.dmo = new DecimalFormat("####");
        this.dmo.setMinimumIntegerDigits(4);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11034: {
                this.fw("Could not reach the LoginManager");
                break;
            }
            case 11084: {
                gqp gqp2 = (gqp)dxq2;
                Map<String, String> map = lcn.emw();
                map.put("NodeID", "" + dxq2.aO().ib());
                map.put(gqp2.GUID, gqp2.ejK + " :: " + gqp2.ejL);
                this.t(map);
                if (!gqp2.jpt) break;
                this.aoU();
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        if (kcz2.getMessageType() == 270) {
            int n = ((kcs)kcz2).hsQ.ib();
            this.fw("Node [" + n + "] is not a valid GameLogicServerNode.");
            return;
        }
        super.receiveMiddlewareMessage(kcz2);
    }
}

