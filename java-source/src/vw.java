/*
 * Decompiled with CFR.
 */
public class vw {
    public short aYl = 0;
    public short aYm = 0;
    public int aYn = 0;

    public vw vH() {
        vw vw2 = new vw();
        vw2.aYl = this.aYl;
        vw2.aYm = this.aYm;
        vw2.aYn = this.aYn;
        return vw2;
    }

    public String toString() {
        return vw.a(this).toString();
    }

    public static vw a(tx tx2) {
        vw vw2 = new vw();
        vw2.aYl = vw.dv(tx2.aWe);
        vw2.aYm = lbc.mV(tx2.aWf);
        assert ((tx2.aWg & Integer.MIN_VALUE) == 0);
        vw2.aYn = tx2.aWg;
        if (tx2.aWh) {
            vw2.aYn |= Integer.MIN_VALUE;
        }
        return vw2;
    }

    public static tx a(vw vw2) {
        tx tx2 = new tx();
        tx2.aWe = vw.a(vw2.aYl);
        tx2.aWf = lbc.j(vw2.aYm);
        tx2.aWh = (vw2.aYn & Integer.MIN_VALUE) != 0;
        tx2.aWg = vw2.aYn & Integer.MAX_VALUE;
        return tx2;
    }

    private static short dv(int n) {
        int n2 = n >>> 16 & 0x1F;
        int n3 = n >>> 24 & 0x1F;
        int n4 = n & 0x3FF;
        assert (n2 == 0 || n3 == 0);
        int n5 = n4;
        if (n2 != 0) {
            n5 |= n2 << 10;
        } else {
            n5 |= n3 << 10;
            n5 |= 0x8000;
        }
        return (short)n5;
    }

    public static int a(short s) {
        int n = s & 0x3FF;
        int n2 = s >>> 10 & 0x1F;
        boolean bl = (s & 0x8000) == 0;
        int n3 = n;
        n3 = bl ? (n3 |= n2 << 16) : (n3 |= n2 << 24);
        return n3;
    }

    public boolean b(tx tx2) {
        tx tx3 = vw.a(this);
        if (tx3.aWe != tx2.aWe) {
            return false;
        }
        if (Math.abs(tx3.aWf - tx2.aWf) > 0.01f) {
            return false;
        }
        if (tx3.aWh != tx2.aWh) {
            return false;
        }
        return tx3.aWg == tx2.aWg;
    }
}

