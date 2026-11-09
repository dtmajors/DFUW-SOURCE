/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.MultiHashMap;

public class cid {
    public static boolean eAW = false;
    public static chy eAX = chy.eAl;
    public static int eAY = 3;
    public static int eAZ = 1;
    public static chy eBa = chy.eAl;
    public static int eBb = 3;
    public static int eBc = 1;
    private final Map<Integer, cia> eBd = lcn.emw();
    private final MultiHashMap eBe = (MultiHashMap)lcn.emB();
    private final Map<String, List<cib>> eBf = lcn.emw();
    private final Map<Integer, String> eBg = lcn.emw();

    public void a(cic cic2, int n, cib cib2, boolean bl, float[] fArray, long l, int n2, boolean bl2, boolean bl3) {
        Integer n3 = cib2.ordinal();
        if (this.eBd.containsKey(n3)) {
            assert (false);
            return;
        }
        cia cia2 = new cia(cic2, n, cib2, bl, fArray, l, n2, bl2, bl3);
        this.eBd.put(n3, cia2);
        this.eBe.put((Object)n, cia2);
    }

    public cia a(cib cib2) {
        return this.eBd.get(cib2.ordinal());
    }

    public cia qe(int n) {
        return this.eBd.get(n);
    }

    public cia hq(String string) {
        cib cib2 = cib.getValueByName(string);
        return cib2 != null ? this.a(cib2) : null;
    }

    public String qf(int n) {
        cib cib2 = cib.getValueByOrdinal(n);
        return cib2 != null ? cib2.name() : null;
    }

    public loz qg(int n) {
        return lvm.sXy.bD(n);
    }

    public loz qh(int n) {
        return lvm.sXz.bD(n);
    }

    public Collection<cia> qi(int n) {
        return this.eBe.getCollection(n);
    }

    public final Map<Integer, cia> aOP() {
        return this.eBd;
    }

    public final MultiHashMap aOQ() {
        return this.eBe;
    }

    public final Map<String, List<cib>> aOR() {
        return this.eBf;
    }

    public List<cib> hr(String string) {
        return this.eBf.get(string);
    }

    public final Map<Integer, String> aOS() {
        return this.eBg;
    }

    public String qj(int n) {
        return this.eBg.get(n);
    }
}

