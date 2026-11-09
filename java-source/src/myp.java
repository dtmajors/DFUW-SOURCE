/*
 * Decompiled with CFR.
 */
public class myp {
    public static final int EUs = 1;
    public static final int EUt = 2;
    public static final int EUu = 4;
    public final int EUv;
    public final int cY;
    public final int EUw;
    public final int EUx;

    public myp(int n2, int n3, int n4, int n5) {
        this.EUv = n2;
        this.cY = n3;
        this.EUw = n4;
        this.EUx = n5;
    }

    public myp(myp myp2) {
        this(myp2.EUv, myp2.cY, myp2.EUw, myp2.EUx);
    }

    public int eTd() {
        return this.EUv;
    }

    public int dMu() {
        return this.cY;
    }

    public int getModifiers() {
        return this.EUw;
    }

    public int eTe() {
        return this.EUx;
    }

    public boolean isAltDown() {
        return (this.EUw & 1) != 0;
    }

    public boolean isShiftDown() {
        return (this.EUw & 4) != 0;
    }

    public boolean eTf() {
        return (this.EUw & 2) != 0;
    }

    public boolean eTg() {
        return (this.EUv & 4) == 4;
    }

    public boolean eTh() {
        return (this.EUv & 1) == 1;
    }

    public boolean eTi() {
        return (this.EUv & 2) == 2;
    }

    public boolean c(myp myp2) {
        return this.EUv == myp2.EUv && this.cY == myp2.cY && this.EUw == myp2.EUw && this.EUx == myp2.EUx;
    }

    public String toString() {
        return "{" + super.toString() + " " + myp.afT(this.EUv) + ", Scancode=" + lhb.acM(this.cY) + ", " + myq.getName(this.EUw) + ", Modifiers=" + myq.getName(this.EUw) + ", DeviceObjectID=" + this.EUx + "}";
    }

    public boolean equals(Object object) {
        if (object instanceof myp) {
            return this.c((myp)object);
        }
        return false;
    }

    public static final String afT(int n2) {
        switch (n2) {
            case 1: {
                return "KEYSTATE_PRESSED";
            }
            case 2: {
                return "KEYSTATE_STILL_PRESSED";
            }
            case 4: {
                return "KEYSTATE_RELEASED";
            }
        }
        return "KEYSTATE unknown (" + n2 + ")";
    }
}

