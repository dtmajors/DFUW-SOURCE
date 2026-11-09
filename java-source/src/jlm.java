/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Iterator;

public class jlm<T1, T2> {
    private HashSet<jlg<T1, T2>> ntZ = null;

    public void a(jlg<T1, T2> jlg2) {
        if (this.ntZ == null) {
            this.ntZ = new HashSet();
        }
        this.ntZ.add(jlg2);
    }

    public void b(jlg<T1, T2> jlg2) {
        if (this.ntZ == null) {
            return;
        }
        this.ntZ.remove(jlg2);
        if (this.ntZ.size() == 0) {
            this.ntZ = null;
        }
    }

    public void k(T1 T1, T2 T2) {
        if (this.ntZ == null) {
            return;
        }
        Iterator<jlg<T1, T2>> iterator = this.ntZ.iterator();
        while (iterator.hasNext()) {
            jlg<T1, T2> jlg2 = iterator.next();
            if (jlg2.j(T1, T2)) continue;
            iterator.remove();
        }
        if (this.ntZ.size() == 0) {
            this.ntZ = null;
        }
    }
}

