/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class btt
extends btk {
    private Map<ldv, bts> aD = lcn.emw();

    public void a(axm axm2) {
        assert (axm2 != null);
        bts bts2 = this.aD.get(axm2.getGUID());
        if (bts2 != null) {
            lfn.b(5, "SFCityManagement", "notifyCityCreated() CityInfo for city " + axm2.getGUID() + " already exists.");
            return;
        }
        bts2 = new bts();
        bts2.dLT = axm2;
        this.aD.put(bts2.dLT.getGUID(), bts2);
        lfn.b(0, "SFCityManagement", "notifyCityCreated() Created " + bts2);
    }

    public void jF(ldv ldv2) {
        assert (ldv2 != null);
        bts bts2 = this.aD.remove(ldv2);
        if (bts2 == null) {
            lfn.b(5, "SFCityManagement", "notifyCityRemoved() Could not find cityinfo for city " + ldv2);
            return;
        }
        lfn.b(0, "SFCityManagement", "notifyCityRemoved() Removed " + bts2);
    }
}

