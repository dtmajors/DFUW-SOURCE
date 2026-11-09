/*
 * Decompiled with CFR.
 */
public class lfs<F, S>
implements Comparable<lfs<F, S>> {
    public F reX = null;
    public S reY = null;

    public lfs() {
    }

    public lfs(F f, S s) {
        this.reX = f;
        this.reY = s;
    }

    public lfs(lfs<F, S> lfs2) {
        this.reX = lfs2.reX;
        this.reY = lfs2.reY;
    }

    public int d(lfs<F, S> lfs2) {
        if (this.equals(lfs2)) {
            return 0;
        }
        return this.hashCode() - lfs2.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        lfs lfs2 = (lfs)object;
        if (this.reX == null ? lfs2.reX != null : !this.reX.equals(lfs2.reX)) {
            return false;
        }
        return !(this.reY == null ? lfs2.reY != null : !this.reY.equals(lfs2.reY));
    }

    public F getFirst() {
        return this.reX;
    }

    public S eqz() {
        return this.reY;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.reX == null ? 0 : this.reX.hashCode());
        n2 = 31 * n2 + (this.reY == null ? 0 : this.reY.hashCode());
        return n2;
    }

    public void Z(F f) {
        this.reX = f;
    }

    public void aa(S s) {
        this.reY = s;
    }

    public String toString() {
        return "First: " + this.reX.toString() + " Second: " + this.reY.toString();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.d((lfs)object);
    }
}

