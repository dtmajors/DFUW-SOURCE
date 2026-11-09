/*
 * Decompiled with CFR.
 */
public class ljw {
    public static final int rpI = 65536;
    public static final int rpJ = 32768;
    public static final int rpK = Integer.MAX_VALUE;
    public static final int rpL = Integer.MIN_VALUE;
    public static final int rpM = 0x3FFFFFFF;
    public static final int rpN = -1073741823;
    public int x = 0;
    public int y = 0;
    public int rpO = 0;

    public ljw() {
    }

    public ljw(ljq ljq2) {
        this.eu(ljq2);
    }

    public ljw(ljw ljw2) {
        this.x = ljw2.x;
        this.y = ljw2.y;
        this.rpO = ljw2.rpO;
    }

    public ljw(int n, int n2, int n3) {
        this.RH(n);
        this.RI(n2);
        this.acs(n3);
    }

    public boolean esV() {
        if (this.x < -1073741823 || this.x > 0x3FFFFFFF) {
            return false;
        }
        if (this.y < -1073741823 || this.y > 0x3FFFFFFF) {
            return false;
        }
        return this.rpO >= -1073741823 && this.rpO <= 0x3FFFFFFF;
    }

    public void RH(int n) {
        this.x = n;
    }

    public int getX() {
        return this.x;
    }

    public void RI(int n) {
        this.y = n;
    }

    public int getY() {
        return this.y;
    }

    public void acs(int n) {
        this.rpO = n;
    }

    public int eqe() {
        return this.rpO;
    }

    public void esz() {
        this.rpO = 0;
        this.y = 0;
        this.x = 0;
    }

    public void b(ljw ljw2) {
        this.x = ljw2.getX();
        this.y = ljw2.getY();
        this.rpO = ljw2.eqe();
    }

    public void eu(ljq ljq2) {
        this.x = (int)(65536.0f * ljq2.x);
        this.y = (int)(65536.0f * ljq2.y);
        this.rpO = (int)(65536.0f * ljq2.rlV);
    }

    public ljq esW() {
        ljq ljq2 = new ljq();
        ljq2.x = (float)this.x / 65536.0f;
        ljq2.y = (float)this.y / 65536.0f;
        ljq2.rlV = (float)this.rpO / 65536.0f;
        return ljq2;
    }

    public void c(ljw ljw2) {
        this.x += ljw2.x;
        this.y += ljw2.y;
        this.rpO += ljw2.rpO;
    }

    public void d(ljw ljw2) {
        this.x -= ljw2.x;
        this.y -= ljw2.y;
        this.rpO -= ljw2.rpO;
    }

    public float eqN() {
        double d2 = this.x;
        double d3 = this.y;
        double d4 = this.rpO;
        double d5 = d2 * d2 + d3 * d3 + d4 * d4;
        return (float)(Math.sqrt(d5) / 65536.0);
    }

    public static final float a(ljw ljw2, ljw ljw3) {
        double d2 = ljw3.x - ljw2.x;
        double d3 = ljw3.y - ljw2.y;
        double d4 = ljw3.rpO - ljw2.rpO;
        double d5 = d2 * d2 + d3 * d3 + d4 * d4;
        return (float)(Math.sqrt(d5) / 65536.0);
    }

    public float esX() {
        double d2 = this.x;
        double d3 = this.y;
        double d4 = this.rpO;
        double d5 = d2 * d2 + d3 * d3 + d4 * d4;
        return (float)(d5 / 65536.0);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        ljw ljw2 = (ljw)object;
        if (this.x != ljw2.x) {
            return false;
        }
        if (this.y != ljw2.y) {
            return false;
        }
        return this.rpO == ljw2.rpO;
    }

    public ljw esY() {
        ljw ljw2 = new ljw();
        ljw2.x = this.x;
        ljw2.y = this.y;
        ljw2.rpO = this.rpO;
        return ljw2;
    }

    public void e(ljw ljw2) {
        this.x = ljw2.x;
        this.y = ljw2.y;
        this.rpO = ljw2.rpO;
    }

    public String toString() {
        return "[" + this.x + "," + this.y + "," + this.rpO + "]";
    }

    public boolean isZero() {
        return this.x == 0 && this.y == 0 && this.rpO == 0;
    }

    public void esK() {
        this.rpO = 0;
        this.y = 0;
        this.x = 0;
    }
}

