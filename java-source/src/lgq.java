/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import java.util.Random;

public class lgq {
    private List<mgo> oWA;
    private Map<String, List<String>> oWy = lcn.emw();
    private Random dem = new Random();

    public lgq() {
        jwe jwe2 = new jwe();
        jwe2.dTX();
        this.oWA = jwe2.dTY();
        this.oWy = jwe2.dTZ();
    }

    public String aC(String string, String string2) {
        for (mgo mgo2 : this.oWA) {
            if (!mgo2.Uk().equalsIgnoreCase(string) || !mgo2.getType().equalsIgnoreCase(string2)) continue;
            String string3 = "";
            for (int i = 0; i < 30 && (string3 = this.a(mgo2)).length() > cu.c.cv(); ++i) {
            }
            if (string3.length() > cu.c.cv()) {
                string3 = string3.substring(0, cu.c.cv());
            }
            return string3;
        }
        assert (false) : "Name is null for Race= " + string + ", and Type= " + string2;
        return null;
    }

    private String a(mgo mgo2) {
        String string = "";
        List list = mgo2.eyN();
        mgp mgp2 = (mgp)list.get(this.dem.nextInt(list.size()));
        List<mgq> list2 = mgp2.eyO();
        for (mgq mgq2 : list2) {
            List<String> list3 = this.oWy.get(mgq2.getType());
            assert (list3 != null) : "Phoneme list is null for [" + mgq2.getType() + "] !";
            string = string.concat(list3.get(this.dem.nextInt(list3.size())));
        }
        return string;
    }
}

