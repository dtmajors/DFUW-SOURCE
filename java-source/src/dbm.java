/*
 * Decompiled with CFR.
 */
public class dbm
extends dbj {
    private ddu[] gcl = null;

    public final ddu[] biT() {
        return this.gcl;
    }

    @Override
    public final boolean d(ddu ddu2) {
        assert (ddu2 != null);
        if (this.gcl == null) {
            this.gcl = new ddu[]{ddu2};
        } else {
            for (ddu ddu3 : this.gcl) {
                if (!ddu3.Ui.equals(ddu2.Ui)) continue;
                return false;
            }
            ddu[] dduArray = new ddu[this.gcl.length + 1];
            System.arraycopy(this.gcl, 0, dduArray, 0, this.gcl.length);
            dduArray[this.gcl.length] = ddu2;
            this.gcl = dduArray;
        }
        return true;
    }

    @Override
    public final boolean biS() {
        assert (this.gcl != null);
        int n2 = this.gcl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.gcl[i2].gev) continue;
            return false;
        }
        return true;
    }

    public final boolean mw(ldv ldv2) {
        assert (ldv2 != null);
        if (this.gcl != null) {
            int n2 = this.gcl.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!this.gcl[i2].Ui.equals(ldv2)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public final ddu mt(ldv ldv2) {
        assert (this.gcl != null);
        assert (ldv2 != null);
        int n2 = this.gcl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.gcl[i2].Ui.equals(ldv2)) continue;
            return this.gcl[i2];
        }
        return null;
    }

    @Override
    public final void mu(ldv ldv2) {
        assert (this.gcl != null);
        assert (ldv2 != null);
        int n2 = this.gcl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.gcl[i2].Ui.equals(ldv2)) continue;
            this.gcl[i2].gev = true;
            return;
        }
    }

    @Override
    public final void mv(ldv ldv2) {
        assert (this.gcl != null);
        assert (ldv2 != null);
        int n2 = this.gcl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.gcl[i2].Ui.equals(ldv2)) continue;
            this.zB(i2);
            return;
        }
    }

    private void zB(int n2) {
        assert (n2 >= 0);
        assert (n2 < this.gcl.length);
        if (this.gcl.length == 1) {
            this.gcl = null;
            return;
        }
        ddu[] dduArray = new ddu[this.gcl.length - 1];
        int n3 = 0;
        int n4 = this.gcl.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            if (i2 == n2) continue;
            dduArray[n3] = this.gcl[i2];
            ++n3;
        }
        this.gcl = dduArray;
    }
}

