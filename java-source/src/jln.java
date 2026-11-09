/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Iterator;

public class jln<T1, T2, T3> {
    private HashSet<jlh<T1, T2, T3>> ntZ = null;

    public void a(jlh<T1, T2, T3> jlh2) {
        if (this.ntZ == null) {
            this.ntZ = new HashSet();
        }
        this.ntZ.add(jlh2);
    }

    public void b(jlh<T1, T2, T3> jlh2) {
        if (this.ntZ == null) {
            return;
        }
        this.ntZ.remove(jlh2);
        if (this.ntZ.size() == 0) {
            this.ntZ = null;
        }
    }

    public void c(T1 T1, T2 T2, T3 T3) {
        if (this.ntZ == null) {
            return;
        }
        Iterator<jlh<T1, T2, T3>> iterator = this.ntZ.iterator();
        while (iterator.hasNext()) {
            jlh<T1, T2, T3> jlh2 = iterator.next();
            if (jlh2.b(T1, T2, T3)) continue;
            iterator.remove();
        }
        if (this.ntZ.size() == 0) {
            this.ntZ = null;
        }
    }
}

