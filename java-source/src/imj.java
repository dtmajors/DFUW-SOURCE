/*
 * Decompiled with CFR.
 */
public enum imj {
    mju(lxd.tnC, 28, 22, 6, 7, 1),
    mjv(lxd.tnD, 48, 42, 10, 10, 2),
    mjw(lxd.tnE, 70, 64, 12, 11, 3);

    private lox mjx;
    private int mjy;
    private int _size;
    private int mjz;
    private int mjA;
    private int mjB;

    private imj(lox lox2, int n2, int n3, int n4, int n5, int n6) {
        this.mjx = lox2;
        this.mjy = n2;
        this._size = n3;
        this.mjz = n4;
        this.mjA = n5;
        this.mjB = n6;
    }

    public lox cQp() {
        return this.mjx;
    }

    public int getFrameSize() {
        return this.mjy;
    }

    public int getSize() {
        return this._size;
    }

    public int dee() {
        return this.mjA;
    }

    public int def() {
        return this.mjz;
    }

    public int deg() {
        return this.mjB;
    }
}

