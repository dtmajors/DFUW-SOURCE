/*
 * Decompiled with CFR.
 */
public class lds<F, S, T, G> {
    public F reX = null;
    public S reY = null;
    public T reZ = null;
    public G rfa = null;

    public lds() {
    }

    public lds(F f, S s, T t, G g2) {
        this.reX = f;
        this.reY = s;
        this.reZ = t;
        this.rfa = g2;
    }

    public lds(lds<F, S, T, G> lds2) {
        this.reX = lds2.reX;
        this.reY = lds2.reY;
        this.reZ = lds2.reZ;
        this.rfa = lds2.rfa;
    }

    public int hashCode() {
        int n = 1;
        n = n * 31 + (this.reX == null ? 0 : this.reX.hashCode());
        n = n * 31 + (this.reY == null ? 0 : this.reY.hashCode());
        n = n * 31 + (this.reZ == null ? 0 : this.reZ.hashCode());
        n = n * 31 + (this.rfa == null ? 0 : this.rfa.hashCode());
        return n;
    }

    public boolean equals(Object object) {
        if (!(object instanceof lds)) {
            return false;
        }
        lds lds2 = (lds)object;
        if (this.reX != null ? !this.reX.equals(lds2.reX) : lds2.reX != null) {
            return false;
        }
        if (this.reY != null ? !this.reY.equals(lds2.reY) : lds2.reY != null) {
            return false;
        }
        if (this.reZ != null ? !this.reZ.equals(lds2.reZ) : lds2.reZ != null) {
            return false;
        }
        return !(this.rfa != null ? !this.rfa.equals(lds2.rfa) : lds2.rfa != null);
    }

    public String toString() {
        return "First: " + this.reX.toString() + " Second: " + this.reY.toString() + " Third: " + this.reZ.toString() + " Fourth: " + this.rfa.toString();
    }
}

