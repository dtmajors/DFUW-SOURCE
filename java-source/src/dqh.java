/*
 * Decompiled with CFR.
 */
public class dqh {
    private static final int gNX = 0;
    public static final int gNY = 1;
    public static final int gNZ = 2;
    public static final int gOa = 4;
    public static final int gOb = 3;
    public static final int gOc = 5;
    private int gOd = 0;
    private float gOe;
    private float gOf;
    private boolean gOg = false;

    public int btc() {
        assert (this.gOd != 0);
        return this.gOd;
    }

    public void Bl(int n) {
        assert (this.gOd == 0) : n;
        assert ((n & 1) != 0 || (n & 2) != 0 || (n & 4) != 0) : n;
        this.gOd = n;
    }

    public float btd() {
        assert (this.gOd != 0);
        return this.gOe;
    }

    public void hj(float f2) {
        this.gOe = f2;
    }

    public float bte() {
        assert (this.gOd != 0);
        return this.gOf;
    }

    public void hk(float f2) {
        this.gOf = f2;
    }

    protected void d(int n, ej ej2) {
        boolean bl;
        assert (this.gOd != 0);
        assert (ej2.getDataType() == 2) : ej2.getDataType();
        if (n != 2) {
            return;
        }
        float f2 = ((et)ej2).fN() - this.gOe;
        int n2 = 0;
        if (Math.abs(f2) < this.gOf) {
            n2 |= 1;
        }
        if (f2 < 0.0f + this.gOf) {
            n2 |= 2;
        }
        if (f2 > 0.0f - this.gOf) {
            n2 |= 4;
        }
        boolean bl2 = bl = (n2 & this.gOd) != 0;
        if (bl != this.gOg) {
            this.gOg = bl;
        }
    }
}

