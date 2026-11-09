/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.HashSet;

public class jjz {
    HashSet<jjx> nrR = new HashSet();
    private HashMap<ldv, jjw> nrS = new HashMap();
    private static jjz nrT = new jjz();

    public static jjz dKS() {
        return nrT;
    }

    public void a(jjx jjx2) {
        this.nrR.add(jjx2);
    }

    public void b(jjx jjx2) {
        this.nrR.remove(jjx2);
    }

    public HashMap<ldv, jjw> dKT() {
        return this.nrS;
    }

    public void c(jjw jjw2) {
        if (jjw2.nrD != null) {
            return;
        }
        this.nrS.put(jjw2.getGUID(), jjw2);
        jjw2.nrD = this;
        for (jjx jjx2 : this.nrR) {
            jjx2.a(jjw2);
        }
    }

    public void d(jjw jjw2) {
        if (jjw2.nrD != this) {
            return;
        }
        this.nrS.remove(jjw2.getGUID());
        jjw2.nrD = null;
        for (jjx jjx2 : this.nrR) {
            jjx2.b(jjw2);
        }
    }

    public jka sn(ldv ldv2) {
        for (jjw jjw2 : this.nrS.values()) {
            jka jka2 = jjw2.dKO().get(ldv2);
            if (jka2 == null) continue;
            return jka2;
        }
        return null;
    }

    public jka X(jjh jjh2) {
        for (jjw jjw2 : this.nrS.values()) {
            jka jka2 = jjw2.X(jjh2);
            if (jka2 == null) continue;
            return jka2;
        }
        return null;
    }

    private jjz() {
    }
}

