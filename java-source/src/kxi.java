/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class kxi {
    private final ldv GUID;
    private final String Name;
    private List<ldv> qgj = lcn.emv();
    private int qgk = 0;

    public kxi(ldv ldv2, String string) {
        this.GUID = ldv2;
        this.Name = string;
    }

    public void tN(ldv ldv2) {
        this.qgj.add(ldv2);
    }

    public void Z(Map<ldv, kxh> map) {
        for (ldv ldv2 : this.qgj) {
            kxh kxh2 = map.get(ldv2);
            assert (kxh2 != null);
            if (kxh2 == null) continue;
            for (kxg kxg2 : kxh2.YG()) {
                lgw lgw2 = (lgw)lea.enW().acv(kxg2.az());
                this.qgk = (int)((float)this.qgk + lgw2.erL());
            }
            System.out.println("Clan : " + this.Name + " has builded : " + kxh2.eic() + " walls in city : " + kxh2.getName());
        }
        System.out.println("Clan : " + this.Name + " will get : " + this.qgk + " of building modules in clan inventory with guid : " + this.GUID);
    }

    public int eid() {
        return this.qgk;
    }

    public ldv getGUID() {
        return this.GUID;
    }

    public String toString() {
        return "Clan : " + this.Name + " with GUID : " + this.GUID + " has to reimburse : " + this.qgk + " of building modules in clan inventory with guid";
    }
}

