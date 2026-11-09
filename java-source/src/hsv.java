/*
 * Decompiled with CFR.
 */
public class hsv {
    private mhk ldj;
    private final hsw ldk;
    final hsq ldl;
    final String Name;

    hsv(hsw hsw2, hsq hsq2) {
        this.Name = hsq2.Name;
        this.ldk = hsw2;
        this.ldl = hsq2;
        this.ldj = this.ldl.lcO;
    }

    hsv(hsw hsw2, hsq hsq2, mhk mhk2) {
        this.Name = hsq2.Name;
        this.ldk = hsw2;
        this.ldl = hsq2;
        this.ldj = mhk2;
        if (this.ldj.eyY() != this.ldl.lcO.eyY()) {
            assert (false);
            this.ldj = this.ldl.lcO;
        }
    }

    public void setValue(Object object) {
        if (object == null) {
            assert (false);
            this.cyk();
            return;
        }
        if (!this.a(object, this.ldl.lcN)) {
            assert (false);
            this.cyk();
            return;
        }
        if (this.a(object, this.ldj)) {
            return;
        }
        this.ldj = mhk.aF(object);
        this.changed();
    }

    public void cyk() {
        this.setValue(this.ldl.lcO);
    }

    public mhk Gt() {
        return this.ldj;
    }

    private void changed() {
        this.ldk.a(this);
    }

    private boolean a(Object object, mhs mhs2) {
        mhk mhk2 = mhk.aF(object);
        return mhk2.eyY() == mhs2;
    }

    private boolean a(Object object, mhk mhk2) {
        mhk mhk3 = mhk.aF(object);
        if (mhk3 == null) {
            assert (false);
            return false;
        }
        if (mhk3.eyY() != mhk2.eyY()) {
            assert (false);
            return false;
        }
        return mhk3.eyZ().equals(mhk2.eyZ());
    }
}

