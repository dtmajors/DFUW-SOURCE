/*
 * Decompiled with CFR.
 */
import java.util.List;

public class agu {
    private agu bil = null;
    private List<agu> bim = null;
    private agt bin = null;

    public agu AX() {
        return this.bil;
    }

    public void c(agu agu2) {
        this.bil = agu2;
    }

    public List<agu> AY() {
        return this.bim;
    }

    public agt AZ() {
        return this.bin;
    }

    public void a(agt agt2) {
        this.bin = agt2;
    }

    public void d(agu agu2) {
        assert (agu2 != null);
        assert (!this.e(agu2));
        if (this.bim == null) {
            this.bim = lcn.abH(5);
        }
        assert (agu2.AX() == null);
        assert (agu2.AZ() != null);
        agu2.c(this);
        this.bim.add(agu2);
    }

    public boolean e(agu agu2) {
        assert (agu2 != null);
        if (this.bim == null) {
            return false;
        }
        return this.bim.contains(agu2);
    }

    public boolean Ba() {
        return this.bim != null && !this.bim.isEmpty();
    }

    public boolean equals(Object object) {
        assert (this.bin != null);
        assert (this.bin.getGUID() != null);
        if (object instanceof agu) {
            agu agu2 = (agu)object;
            assert (agu2.AZ() != null);
            assert (agu2.AZ().getGUID() != null);
            return this.bin.equals(agu2.AZ());
        }
        return false;
    }

    public void f(agu agu2) {
        assert (agu2 != null);
        assert (this.e(agu2));
        assert (this.bim != null);
        assert (agu2.AX() != null);
        assert (agu2.AZ() != null);
        agu2.c(null);
        this.bim.remove(agu2);
        if (this.bim.isEmpty()) {
            this.bim = null;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFItemNode: ");
        if (this.bin != null) {
            stringBuilder.append(this.bin);
        } else {
            stringBuilder.append("ItemBase=null");
        }
        return stringBuilder.toString();
    }
}

