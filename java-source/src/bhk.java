/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bhk
extends bgk {
    public static final String akV = "leaderboards_do_startup_handling";

    @Override
    public void initialize() {
        String string = (String)this.dlm.get("doit");
        if (string == null) {
            this.fw("Parameter <doit> is missing!!!");
            return;
        }
        if (!Boolean.parseBoolean(string)) {
            Map<String, String> map = lcn.emw();
            map.put("Do It", string);
            map.put("Result", "Request Not Sent!");
            this.t(map);
            this.aoU();
        } else {
            gms gms2 = (gms)this.MessageDelegator.h(3619, this.GUID, lcr.qEl);
            gms2.Jv(1);
            this.MessageDelegator.F(gms2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3620: {
                this.a((gmt)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gmt gmt2) {
        if (gmt2.getErrorCode() == 0) {
            Map<String, String> map = lcn.emw();
            map.put("Result", "Start-Up Processing Completed Successfully!");
            this.t(map);
            this.aoU();
        } else {
            this.fw("Stats Server Response Indicated Error Occurred!!!... ErrorCode = " + gmt2.getErrorCode() + ", ErrorText = " + gmt2.bWd());
        }
    }
}

