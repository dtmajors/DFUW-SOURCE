/*
 * Decompiled with CFR.
 */
public class dbn
extends dbj {
    private ddu gcm = null;

    public ddu biU() {
        return this.gcm;
    }

    @Override
    public boolean d(ddu ddu2) {
        assert (this.gcm == null);
        assert (ddu2 != null);
        this.gcm = ddu2;
        return true;
    }

    @Override
    public boolean biS() {
        assert (this.gcm != null);
        return this.gcm.gev;
    }

    @Override
    public ddu mt(ldv ldv2) {
        assert (this.gcm != null);
        assert (ldv2 != null);
        if (!this.gcm.Ui.equals(ldv2)) {
            return null;
        }
        return this.gcm;
    }

    @Override
    public void mu(ldv ldv2) {
        assert (this.gcm != null);
        assert (ldv2 != null);
        if (!this.gcm.Ui.equals(ldv2)) {
            return;
        }
        this.gcm.gev = true;
    }

    @Override
    public void mv(ldv ldv2) {
        assert (this.gcm != null);
        assert (ldv2 != null);
        if (!this.gcm.Ui.equals(ldv2)) {
            return;
        }
        this.gcm = null;
    }
}

