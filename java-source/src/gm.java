/*
 * Decompiled with CFR.
 */
public class gm {
    private gj[] WX = null;

    public gm() {
        this.WX = new gj[0];
    }

    public gm(gj[] gjArray) {
        assert (gjArray != null);
        this.WX = gjArray;
    }

    public final gj[] hZ() {
        return this.WX;
    }

    public final void a(gj gj2) {
        if (gj2 == null) {
            return;
        }
        if (this.b(gj2)) {
            return;
        }
        gj[] gjArray = new gj[this.WX.length + 1];
        System.arraycopy(this.WX, 0, gjArray, 0, this.WX.length);
        gjArray[gjArray.length - 1] = gj2;
        this.WX = gjArray;
    }

    public final boolean b(gj gj2) {
        assert (this.WX != null);
        int n = this.WX.length;
        for (int i = 0; i < n; ++i) {
            if (!this.WX[i].equals(gj2)) continue;
            return true;
        }
        return false;
    }

    public final boolean a(gm gm2) {
        assert (this.WX != null);
        assert (gm2 != null);
        assert (gm2.hZ() != null);
        if (this.WX.length == 0) {
            return true;
        }
        int n = gm2.hZ().length;
        for (int i = 0; i < n; ++i) {
            if (!this.b(gm2.hZ()[i])) continue;
            return true;
        }
        return false;
    }

    public final String toString() {
        assert (this.WX != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        int n = this.WX.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.WX[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

