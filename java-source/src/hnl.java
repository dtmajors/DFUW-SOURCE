/*
 * Decompiled with CFR.
 */
public class hnl
extends hnk {
    private boolean[] kOW = new boolean[0];
    private int kOX = -1;

    public hnl(hrt hrt2) {
        super(hrt2);
    }

    @Override
    protected void cbg() {
        super.cbg();
    }

    @Override
    protected void csx() {
        int n = Math.min(this.csB(), this.kOW.length);
        boolean[] blArray = new boolean[n];
        System.arraycopy(this.kOW, 0, blArray, 0, n);
        this.kOW = blArray;
        if (this.kOX >= this.kOW.length) {
            this.kOX = this.kOW.length - 1;
        }
    }

    @Override
    protected boolean Nt(int n) {
        return this.kOW[n];
    }

    @Override
    protected boolean Q(int n, boolean bl) {
        if (bl) {
            if (n < this.kOX) {
                --this.kOX;
                while (n < this.kOX) {
                    this.kOW[n] = true;
                    --this.kOX;
                }
            } else if (n > this.kOX) {
                ++this.kOX;
                while (n > this.kOX) {
                    this.kOW[n] = true;
                    ++this.kOX;
                }
            }
        } else {
            this.kOX = n;
            this.kOW[n] = !this.kOW[n];
        }
        return true;
    }

    @Override
    protected boolean oc(boolean bl) {
        return this.s(false, bl);
    }

    @Override
    protected boolean od(boolean bl) {
        return this.s(true, bl);
    }

    @Override
    protected int csz() {
        return this.Nv(-1);
    }

    @Override
    protected int Nu(int n) {
        assert (n >= 0 && n < this.kOW.length);
        return this.Nv(n);
    }

    @Override
    protected int csA() {
        return this.kOX;
    }

    private boolean s(boolean bl, boolean bl2) {
        boolean bl3 = false;
        for (int i = 0; i < this.kOW.length; ++i) {
            if (this.kOW[i] == bl) continue;
            if (!bl2) {
                this.kOW[i] = bl;
            }
            bl3 = true;
        }
        return bl3;
    }

    private int Nv(int n) {
        for (int i = n + 1; i < this.kOW.length; ++i) {
            if (!this.kOW[i]) continue;
            return i;
        }
        return -1;
    }
}

