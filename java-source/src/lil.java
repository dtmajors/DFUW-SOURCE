/*
 * Decompiled with CFR.
 */
public class lil<F, S, T> {
    public F reX = null;
    public S reY = null;
    public T reZ = null;

    public lil() {
    }

    public lil(F f, S s, T t) {
        this.reX = f;
        this.reY = s;
        this.reZ = t;
    }

    public lil(lil<F, S, T> lil2) {
        this.reX = lil2.reX;
        this.reY = lil2.reY;
        this.reZ = lil2.reZ;
    }

    public int hashCode() {
        int n = 1;
        n = n * 31 + (this.reX == null ? 0 : this.reX.hashCode());
        n = n * 31 + (this.reY == null ? 0 : this.reY.hashCode());
        n = n * 31 + (this.reZ == null ? 0 : this.reZ.hashCode());
        return n;
    }

    public boolean equals(Object object) {
        if (!(object instanceof lil)) {
            return false;
        }
        lil lil2 = (lil)object;
        if (this.reX != null ? !this.reX.equals(lil2.reX) : lil2.reX != null) {
            return false;
        }
        if (this.reY != null ? !this.reY.equals(lil2.reY) : lil2.reY != null) {
            return false;
        }
        return !(this.reZ != null ? !this.reZ.equals(lil2.reZ) : lil2.reZ != null);
    }

    public String toString() {
        return "First: " + this.reX.toString() + " Second: " + this.reY.toString() + " Third: " + this.reZ.toString();
    }

    public F getFirst() {
        return this.reX;
    }

    public void Z(F f) {
        this.reX = f;
    }

    public S eqz() {
        return this.reY;
    }

    public void aa(S s) {
        this.reY = s;
    }

    public T esw() {
        return this.reZ;
    }

    public void am(T t) {
        this.reZ = t;
    }
}

