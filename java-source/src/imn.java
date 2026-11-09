/*
 * Decompiled with CFR.
 */
public class imn {
    public static final int mjV = 3;
    public imp[] mjW = new imp[3];
    public imo[] mjX = new imo[3];

    public imn() {
        for (int i = 0; i < 3; ++i) {
            this.mjW[i] = imp.mkc;
            this.mjX[i] = imo.mjY;
        }
    }

    public imn dek() {
        imn imn2 = new imn();
        for (int i = 0; i < 3; ++i) {
            imn2.mjW[i] = this.mjW[i];
            imn2.mjX[i] = this.mjX[i];
        }
        return imn2;
    }

    public /* synthetic */ Object clone() {
        return this.dek();
    }
}

