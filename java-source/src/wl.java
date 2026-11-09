/*
 * Decompiled with CFR.
 */
public class wl {
    private static final int MASK = 15;
    private static final int aYL = 0;
    private static final int aYM = 4;
    private static final int aYN = 8;
    private static final int aYO = 12;
    private static final int aYP = 16;
    private static final int aYQ = 20;
    private static final int aYR = 24;
    private int aYS = 0;

    private void y(int n, int n2) {
        int n3 = ~(15 << n2);
        this.aYS &= n3;
        this.aYS |= n << n2;
    }

    private int dw(int n) {
        return this.aYS >> n & 0xF;
    }

    public void dx(int n) {
        this.y(n, 0);
    }

    public int vK() {
        return this.dw(0);
    }

    public void dy(int n) {
        this.y(n, 4);
    }

    public int vL() {
        return this.dw(4);
    }

    public void dz(int n) {
        this.y(n, 8);
    }

    public int vM() {
        return this.dw(8);
    }

    public void dA(int n) {
        this.y(n, 12);
    }

    public int vN() {
        return this.dw(12);
    }

    public void dB(int n) {
        this.y(n, 16);
    }

    public int vO() {
        return this.dw(16);
    }

    public void dC(int n) {
        this.y(n, 20);
    }

    public int vP() {
        return this.dw(20);
    }

    public void dD(int n) {
        this.y(n, 24);
    }

    public int vQ() {
        return this.dw(24);
    }

    public void a(byv byv2) {
        this.dx(byv2.vK());
        this.dy(byv2.vL());
        this.dz(byv2.vM());
        this.dA(byv2.vN());
        this.dB(byv2.vO());
        this.dC(byv2.vP());
        this.dD(byv2.vQ());
    }

    public void b(byv byv2) {
        byv2.dx(this.vK());
        byv2.dy(this.vL());
        byv2.dz(this.vM());
        byv2.dA(this.vN());
        byv2.dB(this.vO());
        byv2.dC(this.vP());
        byv2.dD(this.vQ());
    }

    public boolean c(byv byv2) {
        if (byv2.vK() != this.vK()) {
            return false;
        }
        if (byv2.vL() != this.vL()) {
            return false;
        }
        if (byv2.vM() != this.vM()) {
            return false;
        }
        if (byv2.vN() != this.vN()) {
            return false;
        }
        if (byv2.vO() != this.vO()) {
            return false;
        }
        if (byv2.vP() != this.vP()) {
            return false;
        }
        return byv2.vQ() == this.vQ();
    }
}

