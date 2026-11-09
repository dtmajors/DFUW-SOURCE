/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ljb
extends lip {
    private final lip[] roG;

    protected ljb() {
        this.roG = null;
    }

    public ljb(lip ... lipArray) {
        this.roG = new lip[lipArray.length];
        for (int i = 0; i < this.roG.length; ++i) {
            this.roG[i] = lipArray[i];
        }
    }

    public ljb(List<lip> list) {
        this.roG = new lip[list.size()];
        for (int i = 0; i < this.roG.length; ++i) {
            this.roG[i] = list.get(i);
        }
    }

    @Override
    public String esy() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.roG.length; ++i) {
            stringBuilder.append(this.roG[i].esy());
        }
        return stringBuilder.toString();
    }

    public boolean a(ljb ljb2) {
        if (this.roG.length != ljb2.roG.length) {
            return false;
        }
        for (int i = 0; i < this.roG.length; ++i) {
            if (this.roG[i].i(ljb2.roG[i])) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object object) {
        assert (false);
        if (object instanceof ljb) {
            return this.a((ljb)object);
        }
        return super.equals(object);
    }

    public final int b(ljb ljb2) {
        int n = Math.min(this.roG.length, ljb2.roG.length);
        for (int i = 0; i < n; ++i) {
            int n2 = this.roG[i].h(ljb2.roG[i]);
            if (n2 == 0) continue;
            return n2;
        }
        return this.roG.length - ljb2.roG.length;
    }

    @Override
    protected int j(lip lip2) {
        if (lip2 instanceof ljb) {
            return this.b((ljb)lip2);
        }
        return this.esy().compareTo(lip2.esy());
    }
}

