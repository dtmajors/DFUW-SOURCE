/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Iterator;

public class jlk {
    private HashSet<jle> ntZ = null;

    public void b(jle jle2) {
        if (this.ntZ == null) {
            this.ntZ = new HashSet();
        }
        this.ntZ.add(jle2);
    }

    public void c(jle jle2) {
        if (this.ntZ == null) {
            return;
        }
        this.ntZ.remove(jle2);
        if (this.ntZ.size() == 0) {
            this.ntZ = null;
        }
    }

    public void dLF() {
        if (this.ntZ == null) {
            return;
        }
        Iterator<jle> iterator = this.ntZ.iterator();
        while (iterator.hasNext()) {
            jle jle2 = iterator.next();
            if (jle2.dwQ()) continue;
            iterator.remove();
        }
        if (this.ntZ.size() == 0) {
            this.ntZ = null;
        }
    }
}

