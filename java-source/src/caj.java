/*
 * Decompiled with CFR.
 */
public abstract class caj {
    private int bhh = 0;
    private cah[] eeK = null;

    public final int aFZ() {
        return this.bhh;
    }

    public final void eA(int n) {
        this.bhh = n;
    }

    public final cah[] aGa() {
        return this.eeK;
    }

    public final void a(cah[] cahArray) {
        this.eeK = cahArray;
    }

    public boolean equals(Object object) {
        assert (this.eeK != null);
        if (object instanceof caj) {
            caj caj2 = (caj)object;
            if (this.bhh != caj2.aFZ()) {
                return false;
            }
            if (this.eeK.length != caj2.aGa().length) {
                return false;
            }
            ldv ldv2 = this.eeK[0].aFW().GUID;
            ldv ldv3 = caj2.aGa()[0].aFW().GUID;
            assert (ldv2 != null);
            assert (ldv3 != null);
            return ldv2.equals(ldv3);
        }
        assert (false);
        return false;
    }

    public void reset() {
        this.bhh = 0;
        this.eeK = null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": SubsetID=");
        stringBuilder.append(this.bhh);
        stringBuilder.append(" MaterialShaderCount=");
        if (this.eeK == null) {
            stringBuilder.append("0");
        } else {
            stringBuilder.append(this.eeK.length);
        }
        return stringBuilder.toString();
    }

    public final boolean c(cah cah2) {
        if (this.eeK == null) {
            return false;
        }
        if (cah2 == null) {
            return false;
        }
        int n = this.eeK.length;
        for (int i2 = 0; i2 < n; ++i2) {
            if (this.eeK[i2].aFO() != cah2.aFO()) continue;
            cah cah3 = this.eeK[i2];
            this.eeK[i2] = cah2;
            return true;
        }
        return false;
    }

    public final bzy aFW() {
        assert (this.eeK != null);
        assert (this.eeK.length > 0);
        bzy bzy2 = this.eeK[0].aFW();
        assert (bzy2 != null);
        return bzy2;
    }

    public final cah op(int n) {
        assert (this.eeK != null);
        if (n < 0) {
            return null;
        }
        int n2 = this.eeK.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.eeK[i2].aFO() != n) continue;
            return this.eeK[i2];
        }
        return null;
    }

    public final String or(int n) {
        assert (this.eeK != null);
        assert (n >= 0);
        if (this.eeK[0].aFU().aGZ()) {
            return this.eeK[0].aFU().aHa();
        }
        int n2 = this.eeK.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.eeK[i2].aFO() != n) continue;
            return this.eeK[i2].aFU().aHa();
        }
        return null;
    }
}

