/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bje
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("CSVIDList");
        if (string == null) {
            this.fw("Error in input params");
            return;
        }
        String[] stringArray = string.split(",");
        ebt ebt2 = (ebt)this.MessageDelegator.h(17433, this.getGUID(), lcr.qCw);
        ebt2.ild = stringArray;
        this.getMessageDelegator().F(ebt2);
    }

    private void a(ebu ebu2) {
        if (ebu2.ild == null || ebu2.ile == null || ebu2.ilf == null) {
            this.fw("null in response");
            return;
        }
        if (ebu2.ild.length != ebu2.ile.length || ebu2.ild.length != ebu2.ilf.length) {
            this.fw("Difference in length in response");
            return;
        }
        if (ebu2.ild.length == 0) {
            this.fw("No registered bindstones in response");
            return;
        }
        for (int i = 0; i < ebu2.ild.length; ++i) {
            Map<String, String> map = lcn.emw();
            map.put("BindStoneID", ebu2.ild[i]);
            map.put("CurrentPlayerCount", Integer.toString(ebu2.ile[i]));
            map.put("MaxNumPlayers", Integer.toString(ebu2.ilf[i]));
            map.put("MoreData", "" + (i + 1 < ebu2.ild.length));
            this.t(map);
        }
        this.aoU();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17434: {
                this.a((ebu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

