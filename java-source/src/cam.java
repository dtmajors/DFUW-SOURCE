/*
 * Decompiled with CFR.
 */
public class cam {
    private int ResourceType = -1;
    private cai[] ehz = null;
    private can ehA = null;

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public cai[] aGi() {
        return this.ehz;
    }

    public void a(cai[] caiArray) {
        this.ehz = caiArray;
    }

    public void b(cai cai2) {
        assert (this.ehz != null);
        cai[] caiArray = new cai[this.ehz.length + 1];
        for (cai caiArray[var3_3] : this.ehz) {
        }
        caiArray[this.ehz.length] = cai2;
        this.ehz = caiArray;
    }

    public cam aGj() {
        cam cam2;
        block3: {
            assert (this.ehz != null);
            cam2 = null;
            try {
                Class<?> clazz = this.getClass();
                cam2 = (cam)clazz.newInstance();
                this.a(cam2);
            }
            catch (Exception exception) {
                lfn.b(5, "SFPaperdollItem", "createCopy() Unable to create copy of paperdollitem.");
                lfn.b(5, "SFPaperdollItem", "createCopy() Exception: " + exception);
                if ($assertionsDisabled) break block3;
                throw new AssertionError();
            }
        }
        return cam2;
    }

    public String aGk() {
        String string = this.pa();
        return string.substring(2, string.length());
    }

    public final cak.c auO() {
        lgw lgw2 = (lgw)lea.enW().acv(this.ResourceType);
        if (lgw2 == null) {
            return null;
        }
        return lgw2.auO();
    }

    public cai a(cai.a a2, int n) {
        int n2 = this.ehz.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.ehz[i2].aFY() != a2 || this.ehz[i2].aFZ() != n) continue;
            return this.ehz[i2];
        }
        return null;
    }

    public final can aGl() {
        if (this.ehA == null) {
            this.ehA = this.aGm();
        }
        return this.ehA;
    }

    public final String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public void c(cai cai2) {
        assert (this.ehz != null);
        int n = -1;
        int n2 = this.ehz.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.ehz[i2].equals(cai2)) continue;
            n = i2;
        }
        if (n < 0) {
            return;
        }
        cai[] caiArray = new cai[this.ehz.length - 1];
        n2 = 0;
        int n3 = this.ehz.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            if (i3 == n) continue;
            caiArray[n2] = this.ehz[i3];
            ++n2;
        }
        this.ehz = caiArray;
    }

    public void d(bzs bzs2) {
        assert (this.ehz != null);
        if (bzs2 == null) {
            return;
        }
        if (this.ehz != null) {
            int n = this.ehz.length;
            for (int i2 = 0; i2 < n; ++i2) {
                if (this.ehz[i2] instanceof bzu) {
                    ((bzu)this.ehz[i2]).d(bzs2);
                    continue;
                }
                if (!(this.ehz[i2] instanceof cax)) continue;
                ((cax)this.ehz[i2]).d(bzs2);
            }
        }
    }

    public bzs aFD() {
        if (this.ehz != null && this.ehz.length > 0) {
            cai cai2 = this.ehz[0];
            if (cai2 instanceof bzu) {
                return ((bzu)cai2).aFD();
            }
            if (cai2 instanceof cax) {
                return ((cax)cai2).aFD();
            }
        }
        return null;
    }

    public String toString() {
        return "SFPaperdollItem: Resource='" + lea.enW().getName(this.ResourceType) + "'";
    }

    protected void a(cam cam2) {
        cam2.l(this.ResourceType);
        if (this.ehz != null) {
            cai[] caiArray = new cai[this.ehz.length];
            int n = this.ehz.length;
            for (int i2 = 0; i2 < n; ++i2) {
                caiArray[i2] = this.ehz[i2].aGb();
            }
            cam2.a(caiArray);
        }
    }

    protected can aGm() {
        return new can(this.ResourceType);
    }
}

