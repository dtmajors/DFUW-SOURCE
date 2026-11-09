/*
 * Decompiled with CFR.
 */
public abstract class cai {
    private final a eeJ;
    private int bhh = 0;
    private cah[] eeK = null;

    public cai(a a2) {
        this.eeJ = a2;
    }

    public final a aFY() {
        return this.eeJ;
    }

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

    public final cai aGb() {
        cai cai2 = null;
        try {
            Class<?> clazz = this.getClass();
            cai2 = (cai)clazz.newInstance();
            this.a(cai2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return cai2;
    }

    public final String getName() {
        return this.eeJ.name();
    }

    public final String aGc() {
        return cak.os(this.bhh);
    }

    public final boolean aGd() {
        return this.eeJ == a.eeN;
    }

    public String toString() {
        assert (this.eeK != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": Subset='");
        stringBuilder.append(this.aGc());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    protected void a(cai cai2) {
        assert (this.eeK != null);
        cai2.eA(this.bhh);
        cai2.a(this.aGf());
    }

    public final void a(cah cah2) {
        assert (this.eeK != null);
        assert (cah2 != null);
        if (this.oq(cah2.aFO()) >= 0) {
            return;
        }
        cah[] cahArray = new cah[this.eeK.length + 1];
        for (cah cahArray[var3_3] : this.eeK) {
        }
        cahArray[this.eeK.length] = cah2;
        this.eeK = cahArray;
    }

    public final int aGe() {
        assert (this.eeK != null);
        int n = 0;
        while (true) {
            boolean bl = true;
            int n2 = this.eeK.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.eeK[i2].aFO() != n) continue;
                bl = false;
            }
            if (bl) {
                return n;
            }
            ++n;
        }
    }

    public final cah op(int n) {
        assert (this.eeK != null);
        int n2 = this.oq(n);
        if (n2 < 0) {
            return null;
        }
        return this.eeK[n2];
    }

    public final cah[] aGf() {
        if (this.eeK == null) {
            return null;
        }
        cah[] cahArray = new cah[this.eeK.length];
        int n = cahArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            cahArray[i2] = this.eeK[i2].aFX();
        }
        return cahArray;
    }

    public final void b(cah cah2) {
        assert (this.eeK != null);
        assert (cah2 != null);
        cah[] cahArray = new cah[this.eeK.length - 1];
        int n = 0;
        boolean bl = false;
        int n2 = this.eeK.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.eeK[i2].equals(cah2)) {
                bl = true;
                continue;
            }
            cahArray[n] = this.eeK[i2];
            ++n;
        }
        if (!bl) {
            return;
        }
        this.eeK = cahArray;
    }

    private int oq(int n) {
        assert (this.eeK != null);
        int n2 = this.eeK.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.eeK[i2].aFO() != n) continue;
            return i2;
        }
        return -1;
    }
}

