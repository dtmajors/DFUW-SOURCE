/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Iterator;

public class jll<T1> {
    private HashSet<jlf<T1>> ntZ = null;

    public void c(jlf<T1> jlf2) {
        if (this.ntZ == null) {
            this.ntZ = new HashSet();
        }
        this.ntZ.add(jlf2);
    }

    public void d(jlf<T1> jlf2) {
        if (this.ntZ == null) {
            return;
        }
        this.ntZ.remove(jlf2);
        if (this.ntZ.size() == 0) {
            this.ntZ = null;
        }
    }

    public void V(T1 T1) {
        if (this.ntZ == null) {
            return;
        }
        Iterator<jlf<T1>> iterator = this.ntZ.iterator();
        while (iterator.hasNext()) {
            jlf<T1> jlf2 = iterator.next();
            if (jlf2.T(T1)) continue;
            iterator.remove();
        }
        if (this.ntZ.size() == 0) {
            this.ntZ = null;
        }
    }
}

