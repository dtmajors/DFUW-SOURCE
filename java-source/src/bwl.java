/*
 * Decompiled with CFR.
 */
public class bwl {
    public static final int dVk = 1;
    public static final int dVl = 2;
    public final int dVm;

    public bwl(int n) {
        this.dVm = n;
    }

    public String toString() {
        switch (this.dVm) {
            case 1: {
                return "Position";
            }
            case 2: {
                return "Rotation";
            }
        }
        return "" + this.dVm;
    }
}

