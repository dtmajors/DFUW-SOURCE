/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class jqm
extends jqk {
    private final Map<Integer, jqu> nSC = new HashMap<Integer, jqu>();
    public final Map<Integer, jqu> nSD = Collections.unmodifiableMap(this.nSC);

    public jqm(jqx jqx2, ldv ldv2, lbi<jpk> lbi2, String string, String string2, String string3, short s, short s2, int n, joe[] joeArray) {
        super(jqx2, ldv2, lbi2, string, string2, string3, s, s2, n, joeArray);
        assert (string != null);
        Collection<jqu> collection = lin.a(this.nSh, jqu.class);
        for (jqu jqu2 : collection) {
            this.nSC.put(new Integer(jqu2.cY), jqu2);
        }
    }
}

