/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Iterator;

public class bcc
implements Iterable<bca> {
    private String Name = null;
    private bcb cAy = null;

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string == null ? this.Name : string;
    }

    public int size() {
        return this.cAy.size();
    }

    public boolean v(bbr bbr2) {
        return bbr2 == null ? false : bbr2.b(this.cAy);
    }

    public boolean w(bbr bbr2) {
        if (bbr2 == null) {
            return false;
        }
        for (bca bca2 : this.cAy) {
            if (bbr2.c(bca2)) continue;
            return false;
        }
        return true;
    }

    public bcc(String string) {
        this.Name = string;
        this.cAy = new bcb();
    }

    @Deprecated
    public bcc() {
        this("");
    }

    void g(bca bca2) {
        if (bca2 != null && bca2.akO()) {
            this.cAy.e(bca2);
        }
    }

    void i(Collection<? extends bca> collection) {
        if (collection != null && !collection.isEmpty()) {
            this.cAy.addAll(collection);
        }
    }

    public boolean d(bca bca2) {
        return this.cAy.d(bca2);
    }

    void h(bca bca2) {
        if (bca2 != null) {
            this.cAy.f(bca2);
        }
    }

    void j(Collection<? extends bca> collection) {
        if (collection != null && !collection.isEmpty()) {
            this.cAy.removeAll(collection);
        }
    }

    void x(bbr bbr2) {
        if (bbr2 != null) {
            bbr2.abG().addAll(this.cAy);
        }
    }

    void y(bbr bbr2) {
        if (bbr2 != null) {
            bbr2.abG().removeAll(this.cAy);
        }
    }

    bcb abG() {
        return new bcb(this.cAy);
    }

    @Override
    public Iterator<bca> iterator() {
        return this.cAy.iterator();
    }
}

