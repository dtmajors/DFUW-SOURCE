/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public enum idd {
    lJn(0, "SMALL", 11.0, 9.0),
    lJo(1, "MEDIUM", 12.5, 10.5),
    lJp(2, "LARGE", 14.0, 12.0);

    public final int cck;
    public final String Name;
    public final double lJq;
    public final double lJr;
    public static final List<idd> lml;
    public static final Map<Integer, idd> lmm;

    public static idd getValueFromId(int n) {
        return lmm.get(n);
    }

    private idd(int n2, String string2, double d2, double d3) {
        this.cck = n2;
        this.Name = string2;
        this.lJq = d2;
        this.lJr = d3;
    }

    static {
        lml = Collections.unmodifiableList(Arrays.asList(idd.class.getEnumConstants()));
        lmm = lcn.emw();
        for (idd idd2 : lml) {
            lmm.put(idd2.cck, idd2);
        }
    }
}

