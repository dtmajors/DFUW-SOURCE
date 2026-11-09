/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bjf
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        ebv ebv2 = (ebv)this.MessageDelegator.h(17431, this.getGUID(), lcr.qCw);
        this.getMessageDelegator().F(ebv2);
    }

    private void a(ebw ebw2) {
        if (ebw2.ilg == null || ebw2.ilh == null || ebw2.ili == null || ebw2.ilj == null || ebw2.ilk == null || ebw2.ill == null || ebw2.ilm == null) {
            this.fw("Response returned null");
            return;
        }
        if (ebw2.ilg.length != ebw2.ilh.length || ebw2.ilg.length != ebw2.ili.length || ebw2.ilg.length != ebw2.ilj.length || ebw2.ilg.length != ebw2.ilk.length || ebw2.ilg.length != ebw2.ill.length || ebw2.ilg.length != ebw2.ilm.length) {
            this.fw("Difference in size of returned arrays");
            return;
        }
        if (ebw2.ilg.length == 0) {
            this.fw("There are no registered spawnpoints");
            return;
        }
        for (int i = 0; i < ebw2.ilg.length; ++i) {
            Map<String, String> map = lcn.emw();
            map.put("BindStoneID", ebw2.ilg[i]);
            map.put("BindStoneDisplayName", ebw2.ilh[i]);
            map.put("Position", ebw2.ili[i].toString());
            map.put("Radius", Float.toString(ebw2.ilj[i]));
            map.put("PlayerSlots", Integer.toString(ebw2.ill[i]));
            map.put("Race", cg.n(ebw2.ilm[i]));
            map.put("IsTrainingArea", Boolean.toString(ebw2.ilm[i] == 0));
            boolean bl2 = i + 1 < ebw2.ilg.length;
            map.put("MoreData", "" + bl2);
            this.t(map);
        }
        Map map = lcn.emw();
        this.aoU();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17432: {
                this.a((ebw)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

