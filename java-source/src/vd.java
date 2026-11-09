/*
 * Decompiled with CFR.
 */
public class vd
extends uk {
    public static final int aXz = 1;
    public static final int aXA = 2;
    public static final int aXB = 4;
    public static final int aXC = 8;
    public static final int aXD = 16;
    public static final int aXE = 32;
    public static final int aXF = 64;
    public static final int aXG = 128;
    public static final int aXH = 256;
    public static final int aXI = 512;
    public static final int aXJ = 1024;
    public static final int aXK = 2048;
    public static final int aXL = 4096;
    public static final int aXM = 8192;
    public static final int aXN = 16384;
    public static final int aXO = 32768;
    public int aXP = 0;

    public vd(int n) {
        super(n);
    }

    protected vd() {
    }

    @Override
    public int compareTo(Object object) {
        if (object instanceof vd) {
            vd vd2 = (vd)object;
            int n = this.vG();
            int n2 = vd2.vG();
            assert (n > 0);
            assert (n2 > 0);
            if (n == n2) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return 1;
            }
            if (n == 4) {
                return -1;
            }
            if (n == 8) {
                if (n2 == 1) {
                    return 1;
                }
                if (n2 == 4) {
                    return -1;
                }
            }
        }
        return super.compareTo(object);
    }

    public final int vG() {
        if ((this.aXP & 4) > 0) {
            return 4;
        }
        if ((this.aXP & 1) > 0) {
            return 1;
        }
        if ((this.aXP & 2) > 0) {
            return 2;
        }
        if ((this.aXP & 8) > 0) {
            return 8;
        }
        lfn.b(5, "SFEventPropertyUpdate", "getMainEventType() Invalid EventType provided: " + this.aXP);
        assert (false);
        return -1;
    }

    @Override
    public Object vC() {
        return new Integer(this.aXP);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" EventType=");
        stringBuilder.append(this.aXP);
        stringBuilder.append(" MainEventType=");
        stringBuilder.append(this.vG());
        return stringBuilder.toString();
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        vd vd2 = (vd)uk2;
        vd2.aXP = this.aXP;
    }
}

