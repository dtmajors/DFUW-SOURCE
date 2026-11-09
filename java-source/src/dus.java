/*
 * Decompiled with CFR.
 */
public class dus {
    public static final int hfd = 1;
    public static final int hfe = 2;
    public static final int hff = 4;
    private int aZF = 0;
    private ljr hfg = null;
    private ljr hfh = null;
    private float biu = 0.0f;

    public int aul() {
        return this.aZF;
    }

    public ljr bBn() {
        return this.hfg;
    }

    public void f(ljr ljr2) {
        assert (ljr2 != null);
        this.hfg = ljr2;
        this.aZF |= 1;
    }

    public ljr bBo() {
        return this.hfh;
    }

    public void g(ljr ljr2) {
        assert (ljr2 != null);
        this.hfh = ljr2;
        this.aZF |= 2;
    }

    public float getPower() {
        return this.biu;
    }

    public void setPower(float f2) {
        assert (f2 != 0.0f);
        this.biu = f2;
        this.aZF |= 4;
    }

    public dus bBp() {
        dus dus2 = new dus();
        if (this.hfg != null) {
            dus2.f(new ljr(this.hfg));
        }
        if (this.hfh != null) {
            dus2.g(new ljr(this.hfh));
        }
        if (this.biu != 0.0f) {
            dus2.setPower(this.biu);
        }
        return dus2;
    }

    public boolean equals(Object object) {
        if (object instanceof dus) {
            dus dus2 = (dus)object;
            boolean bl = this.hfg == null || dus2.bBn() == null ? this.hfg == dus2.bBn() : this.hfg.equals(dus2.bBn());
            boolean bl2 = this.hfh == null || dus2.bBo() == null ? this.hfh == dus2.bBo() : this.hfh.equals(dus2.bBo());
            if (bl2 && bl && this.biu == this.biu) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "SFMaterialValues: Ambient=" + this.hfg + " Diffuse=" + this.hfh + " Power=" + this.biu;
    }
}

