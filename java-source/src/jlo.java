/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Iterator;

public class jlo<T1, T2, T3, T4> {
    private HashSet<jli<T1, T2, T3, T4>> ntZ = null;

    public void a(jli<T1, T2, T3, T4> jli2) {
        if (this.ntZ == null) {
            this.ntZ = new HashSet();
        }
        this.ntZ.add(jli2);
    }

    public void b(jli<T1, T2, T3, T4> jli2) {
        if (this.ntZ == null) {
            return;
        }
        this.ntZ.remove(jli2);
        if (this.ntZ.size() == 0) {
            this.ntZ = null;
        }
    }

    public void c(T1 T1, T2 T2, T3 T3, T4 T4) {
        if (this.ntZ == null) {
            return;
        }
        Iterator<jli<T1, T2, T3, T4>> iterator = this.ntZ.iterator();
        while (iterator.hasNext()) {
            jli<T1, T2, T3, T4> jli2 = iterator.next();
            if (jli2.b(T1, T2, T3, T4)) continue;
            iterator.remove();
        }
        if (this.ntZ.size() == 0) {
            this.ntZ = null;
        }
    }
}

