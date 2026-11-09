/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class cnu {
    private final List<cns> eOQ;
    private final Map<String, cnv> eOR = lcn.emw();

    public cnu(List<cns> list) {
        this.eOQ = list;
        this.aUL();
        this.aUM();
    }

    private void aUL() {
        if (!this.eOQ.isEmpty()) {
            Map<String, cnv> map = lcn.emw();
            for (cns cns2 : this.eOQ) {
                String string = cns2.TileID;
                if (string == null) {
                    assert (false);
                    continue;
                }
                String string2 = lea.eoS().get(string.toLowerCase());
                if (string2 == null) {
                    assert (false);
                    continue;
                }
                ArrayList<cns.a> arrayList = cns2.Edges;
                if (arrayList == null || arrayList.isEmpty()) {
                    assert (false);
                    continue;
                }
                cnv cnv2 = (cnv)map.get(string2);
                if (cnv2 == null) {
                    cnv2 = new cnv(string2);
                    map.put(string2, cnv2);
                }
                int n = 0;
                cnm[] cnmArray = new cnm[arrayList.size()];
                for (cns.a a2 : arrayList) {
                    String string3 = a2.TileID;
                    if (string3 == null) {
                        assert (false);
                        continue;
                    }
                    String string4 = lea.eoS().get(string3.toLowerCase());
                    if (string4 == null) {
                        assert (false);
                        continue;
                    }
                    cnv cnv3 = (cnv)map.get(string4);
                    if (cnv3 == null) {
                        cnv3 = new cnv(string4);
                        map.put(string4, cnv3);
                    }
                    cnmArray[n] = new cnm(cnv3, a2.Cost);
                    ++n;
                }
                cnv2.eOS = cnmArray;
                this.eOR.put(string2, cnv2);
            }
            if (this.eOR.isEmpty()) {
                assert (false);
                return;
            }
        }
    }

    private void aUM() {
        Map<String, Map<String, List<cnv>>> map = lea.epn();
        cno cno2 = new cno();
        for (Map.Entry<String, cnv> entry : this.eOR.entrySet()) {
            String string = entry.getKey();
            cnv cnv2 = entry.getValue();
            cno2.a(cnv2);
            for (cnv cnv3 : this.eOR.values()) {
                Map<Object, Object> map2;
                String string2 = cnv3.name;
                if (string2.equals(string)) continue;
                List<cnv> list = cno2.b(cnv3);
                if (map.containsKey(string)) {
                    map2 = map.get(string);
                    map2.put(string2, list);
                    continue;
                }
                map2 = lcn.emw();
                map2.put(string2, list);
                map.put(string, map2);
            }
            this.aUL();
        }
    }
}

