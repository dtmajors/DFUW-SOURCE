/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Iterator;

public class jlp<T1, T2, T3, T4, T5> {
    private HashSet<jlj<T1, T2, T3, T4, T5>> ntZ = null;

    public void a(jlj<T1, T2, T3, T4, T5> jlj2) {
        if (this.ntZ == null) {
            this.ntZ = new HashSet();
        }
        this.ntZ.add(jlj2);
    }

    public void b(jlj<T1, T2, T3, T4, T5> jlj2) {
        if (this.ntZ == null) {
            return;
        }
        this.ntZ.remove(jlj2);
        if (this.ntZ.size() == 0) {
            this.ntZ = null;
        }
    }

    public void c(T1 T1, T2 T2, T3 T3, T4 T4, T5 T5) {
        if (this.ntZ == null) {
            return;
        }
        Iterator<jlj<T1, T2, T3, T4, T5>> iterator = this.ntZ.iterator();
        while (iterator.hasNext()) {
            jlj<T1, T2, T3, T4, T5> jlj2 = iterator.next();
            if (jlj2.b(T1, T2, T3, T4, T5)) continue;
            iterator.remove();
        }
        if (this.ntZ.size() == 0) {
            this.ntZ = null;
        }
    }
}

