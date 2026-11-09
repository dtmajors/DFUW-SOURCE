/*
 * Decompiled with CFR.
 */
public class wn
extends wf {
    public static final int aYU = 0;
    public static final int aYV = 1;
    public static final int aYW = 2;
    public static final int aYX = 3;
    public byte aYY = 0;
    public wj[] aYZ = null;
    public ldv aXZ = null;
    public ldv afF = null;
    public int aYa = 0;
    public int aYc = -1;
    public int Qw = 0;
    public int ResourceType = 0;

    public wn() {
        super((byte)12);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        vl vl2 = (vl)uk2;
        vl2.aXX = (this.aYY & 1) != 0;
        vl2.aYb = (this.aYY & 2) != 0;
        vl2.aYd = (this.aYY & 4) != 0;
        boolean bl = vl2.aYe = (this.aYY & 8) != 0;
        if (this.aYZ == null) {
            vl2.aXY = null;
        } else {
            vl2.aXY = new alu[this.aYZ.length];
            for (int i = 0; i < this.aYZ.length; ++i) {
                if (this.aYZ[i] == null) {
                    vl2.aXY[i] = null;
                    continue;
                }
                vl2.aXY[i] = new alu();
                this.aYZ[i].d(vl2.aXY[i]);
            }
        }
        vl2.aXZ = this.aXZ;
        vl2.afF = this.afF;
        vl2.aYa = this.aYa;
        vl2.aYc = this.aYc;
        vl2.Qw = this.Qw;
        vl2.ResourceType = this.ResourceType;
    }

    @Override
    protected void c(uk uk2) {
        super.c(uk2);
        vl vl2 = (vl)uk2;
        this.aYY = 0;
        if (vl2.aXX) {
            this.aYY = (byte)(this.aYY | 1);
        }
        if (vl2.aYb) {
            this.aYY = (byte)(this.aYY | 2);
        }
        if (vl2.aYd) {
            this.aYY = (byte)(this.aYY | 4);
        }
        if (vl2.aYe) {
            this.aYY = (byte)(this.aYY | 8);
        }
        if (vl2.aXY == null) {
            this.aYZ = null;
        } else {
            this.aYZ = new wj[vl2.aXY.length];
            for (int i = 0; i < vl2.aXY.length; ++i) {
                if (vl2.aXY[i] == null) {
                    this.aYZ[i] = null;
                    continue;
                }
                this.aYZ[i] = new wj();
                this.aYZ[i].c(vl2.aXY[i]);
            }
        }
        this.aXZ = vl2.aXZ;
        this.afF = vl2.afF;
        this.aYa = vl2.aYa;
        this.aYc = vl2.aYc;
        this.Qw = vl2.Qw;
        this.ResourceType = vl2.ResourceType;
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        vl vl2 = (vl)uk2;
        if (vl2.aXX != ((this.aYY & 1) != 0)) {
            return false;
        }
        if (vl2.aYb != ((this.aYY & 2) != 0)) {
            return false;
        }
        if (vl2.aYd != ((this.aYY & 4) != 0)) {
            return false;
        }
        if (vl2.aYe != ((this.aYY & 8) != 0)) {
            return false;
        }
        if (vl2.aXY == null != (this.aYZ == null)) {
            return false;
        }
        if (this.aYZ != null) {
            if (this.aYZ.length != vl2.aXY.length) {
                return false;
            }
            for (int i = 0; i < this.aYZ.length; ++i) {
                if (this.aYZ[i] == null != (vl2.aXY[i] != null)) {
                    return false;
                }
                if (this.aYZ[i].e(vl2.aXY[i])) continue;
                return false;
            }
        }
        if (!this.k(this.aXZ, vl2.aXZ)) {
            return false;
        }
        if (!this.k(this.afF, vl2.afF)) {
            return false;
        }
        if (this.aYa != vl2.aYa) {
            return false;
        }
        if (this.aYc != vl2.aYc) {
            return false;
        }
        if (this.Qw != vl2.Qw) {
            return false;
        }
        return this.ResourceType == vl2.ResourceType;
    }

    private boolean k(ldv ldv2, ldv ldv3) {
        if (ldv2 == null != (ldv3 == null)) {
            return false;
        }
        if (ldv2 == null) {
            return true;
        }
        return ldv2.equals(ldv3);
    }
}

